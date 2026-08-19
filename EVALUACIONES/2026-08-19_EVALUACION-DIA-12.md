# Evaluación — Día 12

**Fecha:** 19/08/2026
**Tiempo sugerido:** 55 minutos + 5 minutos de defensa oral
**Puntaje total:** 10 puntos
**Regla:** resolver sin consultar la respuesta modelo.

---

# Parte A — Implementación y despliegue — 3 puntos

## 1. Conceptos — 0,75

Diferenciá brevemente:

- componente;
- subsistema de implementación;
- nodo;
- modelo de implementación;
- modelo de despliegue.

## 2. Clasificación y traza — 0,75

Clasificá y relacioná:

```text
TrabajoPendiente
IRepositorioTrabajo
RepositorioArchivo.java
persistencia-local.jar
aplicacion-movil.apk
teléfono del operario
servidor de aplicaciones
```

Escribí una cadena desde la clase de diseño hasta el nodo.

## 3. Infraestructura — 1,00

Compará servidor propio e infraestructura contratada. Elegí una alternativa para un servicio móvil que requiere disponibilidad y justificá con al menos cuatro criterios. Indicá una consecuencia negativa segura y un riesgo posible.

## 4. Cambio controlado — 0,50

Si se reemplaza `RepositorioArchivo` por `RepositorioSQLite` sin modificar `AgendaTrabajos`, explicá qué propiedad/principios se aprovechan y qué vista cambia principalmente.

---

# Parte B — Java, archivos y excepciones — 3 puntos

## 5. Código — 1,25

Completá conceptualmente:

```java
Path archivo = ________________________________;

try (BufferedReader lector = ________________________________) {
    String linea;
    while ((linea = __________________) != null) {
        // convertir, validar y agregar
    }
} catch (IOException e) {
    throw new PersistenciaException("No se pudo leer", ______);
}
```

Explicá qué recurso se cierra y por qué se indica UTF-8.

## 6. Excepción propia — 0,75

Escribí la clase checked `FormatoArchivoException` con constructores para mensaje y para mensaje con causa. Diferenciá dónde usarías `throw` y `throws`.

## 7. Flujo de error — 0,50

La línea contiene:

```text
104|Revisar módem|ocho|PENDIENTE|1
```

Describí el flujo desde el fallo de conversión hasta el `catch` de la aplicación sin perder la causa.

## 8. Diseño — 0,50

¿Por qué la clase `TrabajoPendiente` no debería abrir archivos y por qué `RepositorioArchivo` no debería mostrar el menú?

---

# Parte C — Enlace de datos — 3 puntos

## 9. Protocolos y trama — 0,75

Diferenciá HDLC, PPP y Ethernet. Luego representá la estructura general de una trama e indicá la función del tráiler/FCS.

## 10. LLC y MAC — 0,50

Diferenciá las dos subcapas. Indicá qué dirección aparece en Ethernet y qué relación tiene con la capa física.

## 11. Switch — 1,00

Tabla inicial vacía:

```text
P1 — A / MAC AA
P2 — B / MAC BB
P3 — C / MAC CC
```

Procesá:

1. A envía a B;
2. B responde a A;
3. C envía a A.

Para cada paso indicá aprendizaje, consulta, acción y puerto(s) de salida. Escribí la tabla final.

## 12. STP — 0,75

Explicá:

- por qué enlaces redundantes pueden producir un bucle de capa 2;
- tres consecuencias;
- qué hace STP;
- una diferencia con un bucle de enrutamiento.

---

# Parte D — Integración oral — 1 punto

## 13. Defensa — 1,00

En tres minutos relacioná:

```text
clase UML
→ archivo Java
→ componente/artefacto
→ nodo
→ archivo local
→ trama Ethernet
→ tabla MAC/puerto
→ router/red IP
```

Debe quedar explícita la diferencia entre implementación y despliegue, y entre switch y router.

---

# Criterio de aprobación sugerido

```text
Total mínimo: 6,0/10
Condición adicional: ninguna parte A, B o C completamente en cero
```

La nota y los errores se registran solo después de corregir respuestas reales.
