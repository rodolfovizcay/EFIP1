# Caso integrador — Día 8
## Modelo de análisis + Cola + Transmisión

**Fecha:** 13/08/2026  
**Modalidad:** resolución escrita + simulación + defensa oral

---

# 1. Situación didáctica

Un Operario utiliza una aplicación móvil para registrar la ejecución de una Orden de Trabajo. La aplicación solicita:

- número de OT;
- actividad realizada;
- detalle;
- fecha y hora;
- una medición opcional obtenida de un sensor analógico.

Cuando hay conexión, la solicitud se envía al servidor. Cuando llegan varias solicitudes, el servidor debe procesarlas por orden de llegada. Si la comunicación se interrumpe, las solicitudes no confirmadas quedan pendientes y se reenvían posteriormente.

La medición analógica posee una frecuencia máxima conocida y debe muestrearse antes de enviarse como datos digitales.

---

# 2. Reglas y supuestos iniciales

1. Una ejecución solo puede registrarse para una OT existente.
2. La OT no puede estar anulada.
3. Cada solicitud recibe un identificador local.
4. El servidor procesa solicitudes pendientes mediante FIFO.
5. La confirmación del servidor retira la solicitud de la cola pendiente.
6. El sensor es opcional.
7. La transmisión se modela de forma conceptual; no se impone un protocolo concreto.
8. Para el ejercicio se supone que las solicitudes con igual prioridad se atienden por orden de llegada y que no existe prioridad especial.

Si se cambia un supuesto, debe explicarse su impacto.

---

# Parte A — Recuperación del Día 7

## 1. Generalización UML

Completá y explicá:

```text
Operario ─────▷ UsuarioSistema
```

- ¿hacia dónde apunta el triángulo?
- ¿qué significa la relación?

## 2. Instancia

```text
Entidad: ORDEN_TRABAJO
Instancia concreta:
```

Dar un ejemplo.

## 3. Simbología

```text
Rectángulo doble →
Línea doble      →
```

## 4. Asociativa vs. débil

Explicar por qué una tabla asociativa no es automáticamente una entidad débil.

## 5. Completo vs. verificable

Corregir:

> El requerimiento está completo porque se puede medir.

## 6. `toString()`

Escribir una sobrescritura mínima para `OrdenTrabajo`.

## 7. N:M y tabla asociativa

Explicar:

```text
ORDEN_TRABAJO N:M OPERARIO
```

frente a:

```text
ASIGNACION_OT(id_ot, id_operario, ...)
```

---

# Parte B — Caso de uso y modelo de análisis

## 8. Caso de uso base

```text
Nombre: Registrar ejecución de Orden de Trabajo
Actor principal: Operario
```

Redactar:

```text
Objetivo:
Resultado de valor:
Disparador:
Precondiciones:
Postcondiciones:
```

## 9. Vista externa

Explicar qué muestra el modelo de casos de uso en este caso.

```text
Actor:
Caso:
Resultado:
```

## 10. Vista interna

Explicar qué debe aportar el modelo de análisis.

## 11. Clases de análisis

Propuesta inicial:

```text
<<interfaz>> AppRegistrarEjecucion
<<control>> ControlRegistrarEjecucion
<<control>> ControlSincronizarSolicitudes
<<entidad>> OrdenTrabajo
<<entidad>> EjecucionOT
<<entidad>> SolicitudSincronizacion
```

Completar:

| Clase | Estereotipo | Responsabilidades |
|---|---|---|
| AppRegistrarEjecucion | interfaz | |
| ControlRegistrarEjecucion | control | |
| ControlSincronizarSolicitudes | control | |
| OrdenTrabajo | entidad | |
| EjecucionOT | entidad | |
| SolicitudSincronizacion | entidad | |

## 12. Revisar clasificación

Justificar:

1. Por qué `AppRegistrarEjecucion` es interfaz.
2. Por qué `ControlRegistrarEjecucion` no debería conservar toda la información histórica.
3. Por qué `OrdenTrabajo` no debería conocer botones o pantallas.
4. Por qué `SolicitudSincronizacion` puede ser entidad si posee información de vida más larga que una interacción inmediata.

## 13. Colaboración — flujo con conexión

Completar mensajes conceptuales:

```text
1. Operario → AppRegistrarEjecucion:

2. AppRegistrarEjecucion → ControlRegistrarEjecucion:

3. ControlRegistrarEjecucion → OrdenTrabajo:

4. ControlRegistrarEjecucion → EjecucionOT:

5. ControlRegistrarEjecucion → SolicitudSincronizacion:

6. ControlRegistrarEjecucion → AppRegistrarEjecucion:
```

Los mensajes deben expresar responsabilidades, no signaturas Java definitivas.

## 14. Colaboración — flujo sin conexión

Agregar el alternativo:

```text
A1.
A2.
A3.
A4.
```

Debe incluir solicitud pendiente y posterior reintento.

## 15. Control de necesidad

Para cada clase propuesta, indicar qué objeto participa en la colaboración. Si no participa, revisar si se necesita.

---

# Parte C — Cola FIFO

## 16. Justificación

Explicar por qué una Cola FIFO es adecuada para solicitudes pendientes.

## 17. Simulación

Llegan solicitudes:

```text
S1 — OT 100
S2 — OT 200
S3 — OT 300
```

Ejecutar:

```text
encolar(S1)
encolar(S2)
encolar(S3)
cabecera()
desencolar()
encolar(S4)
desencolar()
```

Completar:

| Paso | Devuelve | Cola | Frente | Final |
|---:|---|---|---|---|
| 1 | | | | |
| 2 | | | | |
| 3 | | | | |
| 4 | | | | |
| 5 | | | | |
| 6 | | | | |
| 7 | | | | |

## 18. Pila vs. Cola

Explicar por qué una pila produciría un orden diferente.

## 19. Interfaz del TDA

Definir:

```text
encolar:
desencolar:
cabecera:
esVacia:
longitud:
```

## 20. Implementación con vector

Proponer campos:

```text
solicitudes[]
frente
final
cantidad
```

Responder:

- ¿qué limita la cantidad máxima?;
- ¿qué condición representa cola llena?;
- ¿qué riesgo aparece si no se reutilizan posiciones?;
- ¿qué ventaja tiene conocer el máximo?

## 21. Implementación enlazada

Proponer:

```text
cabecera
cola
longitud
NodoSolicitud
```

Explicar:

- encolar;
- desencolar;
- qué ocurre cuando queda vacía;
- riesgos de referencias.

## 22. Elección

Elegir vector o lista enlazada para solicitudes móviles cuyo volumen máximo es desconocido. Justificar sin afirmar que una implementación es siempre superior.

## 23. Cambio de regla

> Las solicitudes urgentes deben procesarse antes que las normales.

¿Sigue alcanzando una Cola FIFO convencional? Explicar.

No es necesario implementar una cola de prioridad; solo detectar el cambio de estructura/regla.

---

# Parte D — Medida de información y señales

## 24. Información

Un evento de error crítico ocurre con probabilidad `1/16`.

Calcular:

```text
I(E) = log2(1/P(E))
```

Indicar unidad.

## 25. Comparación de eventos

```text
Evento A: P=1/2
Evento B: P=1/32
```

¿Cuál aporta más información y por qué?

## 26. Tasa de información

Una fuente genera:

```text
m = 250 símbolos/s
H = 4 bits/símbolo
```

Calcular:

```text
R = m · H
```

## 27. Señal

El sensor produce una señal continua cuyo voltaje varía en el tiempo.

Clasificar:

```text
Analógica o digital:
Justificación:
```

## 28. Frecuencia y período

La señal tiene período:

```text
T = 0,0005 s
```

Calcular:

```text
f = 1/T
```

## 29. Muestreo

La frecuencia máxima es `5 kHz`.

Calcular la frecuencia mínima de muestreo:

```text
fs ≥ 2·fmax
```

## 30. Más muestras

Explicar qué mejora y qué costo menciona el material cuando aumenta la frecuencia de muestreo.

---

# Parte E — Tipos de transmisión

## 31. Serie vs. paralela

La aplicación envía los datos bit a bit por un enlace.

Clasificar y justificar.

## 32. Asíncrona

Construir la fórmula:

```text
________ + carácter + ________
```

## 33. Síncrona

Construir la fórmula:

```text
________ + bloque + ________
```

## 34. Dimensiones independientes

Explicar por qué una transmisión puede ser:

```text
serie y asíncrona
```

sin contradicción.

## 35. Elección declarada

Elegir una alternativa para el caso didáctico:

```text
serie/paralela:
síncrona/asíncrona:
```

Justificar usando los criterios del material y aclarar que se trata de un supuesto de solución.

---

# Parte F — Integración

## 36. Cadena completa

Completar:

```text
Necesidad/RF
   ↓
Caso de uso
   ↓
Modelo de análisis
   ↓
Clases de interfaz/control/entidad
   ↓
Colaboración
   ↓
Cola FIFO
   ↓
Señal/muestreo/transmisión
   ↓
Servidor confirma
```

Explicar cada transición.

## 37. Responsabilidades

¿Quién debería:

```text
mostrar formulario →
coordinar validación →
conocer estado de OT →
conservar ejecución →
mantener solicitud pendiente →
atender primero la solicitud más antigua →
```

## 38. Caso de prueba integrador

Redactar un caso de prueba con:

- tres solicitudes;
- orden de llegada;
- una pérdida de conexión;
- reintento;
- confirmación;
- medición de sensor con `fmax` conocida;
- resultado esperado.

---

# Defensa oral

Preparar una exposición de 8–10 minutos:

> Explique cómo el caso `Registrar ejecución de OT` pasa de la vista externa del caso de uso a una realización de análisis con clases de interfaz, control y entidad. Justifique la colaboración entre objetos, el uso de una cola FIFO para solicitudes pendientes y cómo una medición analógica se muestrea y se transmite digitalmente. Diferencie vector/lista, pila/cola, señal analógica/digital, serie/paralela y síncrona/asíncrona.

---

# Criterios de revisión

- [ ] Vista externa/interna diferenciadas.
- [ ] Interfaz/control/entidad correctamente clasificadas.
- [ ] Responsabilidades distribuidas.
- [ ] Colaboración con actor → interfaz.
- [ ] Mensajes conceptuales, no métodos definitivos.
- [ ] FIFO correctamente aplicado.
- [ ] Frente/final correctos.
- [ ] Vector/lista comparados.
- [ ] Pila/cola diferenciadas.
- [ ] Información calculada en bits.
- [ ] `f=1/T` aplicado con unidades.
- [ ] Muestreo mínimo al doble.
- [ ] Serie/paralela diferenciadas.
- [ ] Síncrona/asíncrona diferenciadas.
- [ ] Supuestos declarados.
- [ ] Recuperaciones del Día 7 respondidas.
