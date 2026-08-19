# Respuestas modelo — Evaluación Día 12

**Uso:** corregir después de entregar la evaluación.
**No constituye evidencia del estudiante.**

---

# Parte A — Implementación y despliegue — 3 puntos

## 1. Conceptos — 0,75

- **Componente:** pieza física y reemplazable de software que materializa elementos lógicos y ofrece o usa interfaces.
- **Subsistema de implementación:** agrupación manejable y coherente de interfaces, componentes y posiblemente otros subsistemas; puede manifestarse como paquete.
- **Nodo:** recurso físico de cómputo que existe en ejecución y aloja artefactos.
- **Modelo de implementación:** describe cómo los elementos de diseño se materializan y organizan como componentes.
- **Modelo de despliegue:** describe la distribución física de artefactos y funcionalidad entre nodos conectados.

Puntaje completo si las definiciones responden claramente “pieza”, “agrupación”, “lugar físico”, “organización de software” y “distribución física”.

## 2. Clasificación y traza — 0,75

| Elemento | Clasificación principal |
|---|---|
| `TrabajoPendiente` | clase de diseño/dominio |
| `IRepositorioTrabajo` | interfaz/contrato |
| `RepositorioArchivo.java` | fuente/clase de implementación |
| `persistencia-local.jar` | componente/artefacto |
| `aplicacion-movil.apk` | artefacto ejecutable |
| teléfono | nodo |
| servidor de aplicaciones | nodo |

Cadena posible:

```text
TrabajoPendiente (diseño)
→ TrabajoPendiente.java (fuente)
→ dominio/persistencia en componentes
→ aplicacion-movil.apk (artefacto)
→ teléfono del operario (nodo)
```

## 3. Infraestructura — 1,00

Respuesta modelo, no única:

```text
Elección: infraestructura contratada.
Criterios: disponibilidad fuera de horario, ausencia de guardia interna,
rapidez de aprovisionamiento, respaldo/recuperación pactados,
escalabilidad y acceso móvil.
Consecuencia negativa segura: costo recurrente y menor control de algunas capas.
Riesgo posible: dependencia del proveedor o una configuración insegura.
Mitigación: contrato/SLA, copias externas probadas, monitoreo,
automatización y plan de salida.
```

Elegir servidor propio también obtiene puntaje completo si el contexto, los RNF, las capacidades y las mitigaciones lo justifican.

## 4. Cambio controlado — 0,50

Se aprovechan bajo acoplamiento, DIP y OCP: la aplicación depende de `IRepositorioTrabajo`, no de una implementación concreta. Cambia principalmente el modelo o vista de implementación y el artefacto local. El nodo no cambia necesariamente si ambos repositorios se ejecutan en el teléfono.

---

# Parte B — Java, archivos y excepciones — 3 puntos

## 5. Código — 1,25

```java
Path archivo = Path.of("build", "dia12", "trabajos.txt");

try (BufferedReader lector = Files.newBufferedReader(
        archivo, StandardCharsets.UTF_8)) {
    String linea;
    while ((linea = lector.readLine()) != null) {
        // convertir, validar y agregar
    }
} catch (IOException e) {
    throw new PersistenciaException("No se pudo leer", e);
}
```

`try-with-resources` cierra `lector` automáticamente al salir. UTF-8 hace explícita y repetible la interpretación de caracteres, por ejemplo la `ó` de “módem”.

## 6. Excepción propia — 0,75

```java
class FormatoArchivoException extends Exception {
    FormatoArchivoException(String mensaje) {
        super(mensaje);
    }

    FormatoArchivoException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
```

`throw` lanza una instancia en un punto concreto. `throws` declara en la firma que el método puede propagarla. Al extender `Exception` y no `RuntimeException`, es checked: quien llama debe capturar o declarar.

## 7. Flujo de error — 0,50

```text
Integer.parseInt("ocho")
→ NumberFormatException
→ el conversor la captura
→ throw new FormatoArchivoException("Línea inválida", causa)
→ el método declara throws FormatoArchivoException
→ la aplicación la captura y comunica el error
```

La causa se conserva pasándola al constructor.

## 8. Diseño — 0,50

`TrabajoPendiente` representa y valida el dominio; abrir archivos agregaría otra razón de cambio. `RepositorioArchivo` persiste; mostrar un menú mezclaría persistencia con presentación. La separación aplica SRP, mejora cohesión y reduce acoplamiento.

---

# Parte C — Enlace de datos — 3 puntos

## 9. Protocolos y trama — 0,75

- HDLC: protocolo importante o modelo de control de enlace de capa 2.
- PPP: protocolo para enlace punto a punto, con LCP y autenticación opcional PAP/CHAP.
- Ethernet: familia usada en LAN, con tramas y direccionamiento MAC, asociada con IEEE 802.3.

```text
encabezado | datos de capa 3 encapsulados | tráiler/FCS
```

FCS permite detectar alteraciones mediante un cálculo como CRC; no corrige por sí mismo la trama dañada.

## 10. LLC y MAC — 0,50

LLC relaciona protocolos de capa 3 con la subcapa MAC. MAC arma y desarma tramas, direcciona, detecta errores y controla el acceso al medio; se comunica directamente con la capa física. Ethernet usa MAC de 48 bits. La capa física transmite bits como señales, no interpreta la semántica de la dirección.

## 11. Switch — 1,00

### Paso 1

```text
entra por P1, origen AA → aprende AA→P1
destino BB desconocido → inunda por P2 y P3
```

### Paso 2

```text
entra por P2, origen BB → aprende BB→P2
destino AA conocido → reenvía solo por P1
```

### Paso 3

```text
entra por P3, origen CC → aprende CC→P3
destino AA conocido → reenvía solo por P1
```

Tabla final:

| MAC | Puerto |
|---|---|
| AA | P1 |
| BB | P2 |
| CC | P3 |

El switch aprende por origen y consulta destino.

## 12. STP — 0,75

Con enlaces redundantes activos, una trama inundada puede recorrer un ciclo y volver a ser copiada porque Ethernet no tiene TTL. Consecuencias: tormenta de broadcast, duplicados, saturación e inestabilidad de tabla MAC. STP construye una topología lógica sin bucles y deja caminos redundantes sin reenvío normal, que pueden habilitarse tras una reconvergencia. Un bucle de routing afecta paquetes y tablas de rutas; IP posee TTL o Hop Limit, aunque el bucle sigue siendo dañino.

---

# Parte D — Integración oral — 1 punto

## 13. Defensa — 1,00

Respuesta modelo:

> La clase UML `TrabajoPendiente` se codifica en un archivo Java y se integra con el repositorio mediante una interfaz. Esos archivos se empaquetan en componentes y luego en el artefacto móvil, que se despliega en el teléfono. El repositorio guarda datos locales en UTF-8 y traduce fallas de entrada/salida a una excepción propia. Cuando la aplicación se comunica, el paquete IP se encapsula en una trama Ethernet. El switch aprende la MAC origen, consulta la MAC destino y elige un puerto; si debe salir de la red, el router decide con IP y su tabla de rutas. STP evita que los enlaces redundantes entre switches formen un ciclo lógico.

## Rúbrica

| Evidencia | Puntaje |
|---|---:|
| diseño → código/componente | 0,20 |
| artefacto → nodo | 0,20 |
| archivo y excepción | 0,20 |
| switch MAC → puerto | 0,20 |
| router IP → ruta + STP | 0,20 |

---

# Errores que requieren recuperación

- componente = nodo;
- implementación = lugar físico;
- checked sin obligación de capturar o declarar;
- `throw` y `throws` intercambiados;
- switch aprende por destino;
- destino desconocido descartado sin más;
- STP entendido como protocolo de routing;
- trama Ethernet con TTL;
- MAC, ARP y tabla de routing confundidas.
