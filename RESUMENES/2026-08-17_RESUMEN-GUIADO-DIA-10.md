# Resumen guiado — Día 10
## Arquitectura + Lista simple + Nivel físico

---

# 1. Idea central

El Día 10 trabaja tres niveles diferentes de una solución:

```text
Arquitectura
→ organiza decisiones, subsistemas, interfaces y dependencias.

Lista simple
→ organiza dinámicamente elementos dentro del software.

Nivel físico
→ transporta bits mediante señales a través de un medio real.
```

No deben mezclarse:

```text
subsistema ≠ entidad
lista ≠ cola
medio físico ≠ protocolo de aplicación
arquitectura ≠ tecnología aislada
```

---

# 2. Arquitectura en una respuesta oral

> La arquitectura es el conjunto de decisiones significativas sobre la organización del sistema, sus elementos estructurales, interfaces, colaboraciones, subsistemas y estilo. Está condicionada por los casos de uso, requisitos no funcionales, plataforma, base de datos, comunicaciones y sistemas heredados. Se documenta mediante vistas que muestran los elementos arquitectónicamente relevantes. Una buena arquitectura busca alta cohesión dentro de cada subsistema y bajo acoplamiento entre subsistemas.

## Fórmula conceptual

```text
Casos de uso
→ función requerida.

Arquitectura
→ forma que permite realizarla.
```

## Ejemplo SIGO

```text
Subsistema Ejecuciones
→ registrar y consultar ejecuciones.

Subsistema Sincronización
→ administrar solicitudes pendientes.

Subsistema Notificaciones
→ enviar Email/Push.

Subsistema Persistencia
→ proporcionar repositorios.
```

---

# 3. Entidad, clase y subsistema

```text
Entidad
→ concepto del dominio.
→ EjecucionOT, OrdenTrabajo, PuntoRelevamiento.

Clase de diseño
→ construcción próxima a implementación.
→ EjecucionService, ListaSimple.

Subsistema
→ agrupación cohesiva de clases, interfaces y responsabilidades.
→ Subsistema Relevamiento.
```

Error a evitar:

```text
"EjecucionOT es un subsistema"
```

---

# 4. Interfaz y dependencia

```text
Interfaz
→ especifica operaciones accesibles desde fuera.

Dependencia
→ un elemento usa a otro y puede verse afectado por sus cambios.
```

Ejemplo:

```text
AppRelevamiento
→ IRelevamiento

Subsistema Relevamiento
→ ISincronizacion
```

El cliente debe depender del contrato y no de detalles internos.

---

# 5. Lista simple en una respuesta oral

> Una lista simplemente enlazada es una estructura lineal dinámica formada por nodos. Cada nodo contiene un dato y una referencia al siguiente. La cabeza referencia al primer nodo y la lista termina en `null`. Permite insertar, buscar, modificar y eliminar. No impone LIFO ni FIFO. El acceso es secuencial y hay que preservar cuidadosamente las referencias.

Representación:

```text
cabeza → [A] → [B] → [C] → null
```

---

# 6. Operaciones esenciales

## Insertar al inicio

```text
nuevo.siguiente = cabeza
cabeza = nuevo
```

## Recorrer

```text
actual = cabeza
mientras actual != null
    procesar actual
    actual = actual.siguiente
```

## Buscar

```text
recorrer
comparar dato
retornar al encontrar
```

## Modificar

```text
buscar nodo
actualizar su dato
```

## Eliminar cabeza

```text
cabeza = cabeza.siguiente
```

## Eliminar intermedio

```text
anterior.siguiente = actual.siguiente
```

---

# 7. Errores de lista

```text
Perder cabeza
→ se pierde el acceso a la lista.

No avanzar actual
→ bucle infinito.

No tratar null
→ error de referencia nula.

Usar == con String
→ compara referencias.

No conservar anterior
→ no puede reconectarse la lista al eliminar.
```

Validación Java:

```java
if (dato == null || dato.isBlank()) {
    throw new IllegalArgumentException("Dato obligatorio");
}
```

---

# 8. Arreglo frente a lista

```text
Arreglo
→ acceso por índice;
→ posiciones contiguas;
→ capacidad definida o redimensionada.

Lista
→ acceso secuencial;
→ nodos no contiguos;
→ tamaño variable;
→ referencias adicionales.
```

Elegir por las operaciones dominantes y no por costumbre.

---

# 9. Nivel físico en una respuesta oral

> La capa física transporta bits representados mediante señales eléctricas, luminosas o radioeléctricas. El medio puede ser guiado, como cobre o fibra, o no guiado, como radio o satélite. La elección depende de ancho de banda, distancia, retardo, costo, instalación y mantenimiento. La transmisión puede verse afectada por atenuación, ruido, interferencia, dispersión y latencia.

## Par trenzado

```text
Los pares se trenzan
→ las perturbaciones inducidas tienden a afectar ambos conductores de forma semejante
→ el receptor puede reducir su efecto al interpretar la diferencia.
```

```text
UTP
→ sin blindaje adicional.

FTP/STP
→ incorporan blindaje según la construcción.

Trenzado
→ ayuda frente a interferencia y diafonía.

Blindaje
→ agrega protección electromagnética, pero exige instalación correcta.
```

No confundir `STP` como cable con `STP` como Spanning Tree Protocol.

---

# 10. Perturbaciones

```text
Atenuación
→ pérdida de intensidad/amplitud con la distancia.

Ruido
→ adiciones no deseadas que corrompen la señal.

Interferencia electromagnética
→ perturbación provocada por fuentes externas.

Dispersión
→ ensanchamiento temporal; un bit puede interferir con el siguiente.

Latencia
→ demora de propagación y procesamiento.
```

---

# 11. Dispositivos

```text
Interfaz física
→ conecta el equipo con el medio.

Módem
→ adapta/modula y demodula señales.

Repetidor
→ recibe, regenera y retransmite señal.
```

No confundir repetidor con router:

```text
Repetidor
→ capa física, señal.

Router
→ capa de red, IP y paquete.
```

Mapa rápido:

```text
Hub/repetidor → capa 1.
Switch → capa 2, salvo función multicapa.
Router → capa 3.
Gateway → capa variable; el material lo presenta en transporte/aplicación.
Firewall → capa 3/4 o 7 según inspección.
VPN → capa 2, 3 o 7 según implementación.
```

---

# 12. Última milla

```text
Operador
→ red de acceso
→ usuario final
```

La última milla es costosa por:

```text
instalación
mantenimiento
distancia
geografía
infraestructura
cantidad de usuarios dispersos
```

Soluciones posibles:

```text
ADSL
cablemódem
fibra
radio/WiMAX
satélite
Wi-Fi en escenarios adecuados
```

No existe una opción universalmente mejor.

---

# 13. Supuestos correctos

```text
Una señal analógica puede transmitirse analógicamente.

Se digitaliza si la solución requiere procesamiento,
almacenamiento o transmisión digital.

Sin conexión
→ no existe transmisión efectiva en ese momento.

Síncrona/asíncrona
→ depende del protocolo supuesto, no de la conectividad.
```

---

# 14. Integración del caso

```text
Necesidad:
ampliar SIGO a zona rural.

Arquitectura:
separar relevamiento, análisis, sincronización y persistencia.

Lista:
administrar dinámicamente puntos del relevamiento.

Nivel físico:
elegir el medio de última milla según restricciones.

Documentación:
registrar decisión, alternativas, consecuencias y riesgos.
```

---

# 15. Repaso de 20 minutos

```text
5 min
→ arquitectura, cohesión y acoplamiento.

5 min
→ dibujar lista y ejecutar inserción/eliminación.

5 min
→ perturbaciones del canal.

5 min
→ explicar el caso rural completo.
```

---

# 16. Frases que deben salir automáticas

```text
Arquitectura = decisiones significativas.

Alta cohesión = responsabilidad interna relacionada.

Bajo acoplamiento = pocas dependencias controladas.

Lista simple = dato + siguiente.

Lista vacía = cabeza null.

Insertar inicio = nuevo.siguiente=cabeza; cabeza=nuevo.

Física = bits mediante señales.

Atenuación ≠ latencia.

Ruido ≠ interferencia electromagnética.

Trenzado ≠ blindaje.

STP cable ≠ Spanning Tree Protocol.

Firewall/VPN → declarar función antes de asignar capa.

Conectividad ≠ sincronía.
```
