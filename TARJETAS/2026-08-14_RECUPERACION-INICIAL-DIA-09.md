# Tarjetas de recuperación inicial — Día 9
## Errores activos del cierre del Día 8

**Fecha:** 14/08/2026  
**Uso:** responder primero sin mirar el reverso

---

# Instrucciones

Para cada tarjeta:

1. leer únicamente el frente;
2. responder en voz alta;
3. comparar con el reverso;
4. marcar:

```text
0 = no recordado
1 = recordado con ayuda
2 = correcto con duda
3 = correcto y explicable
```

Repetir hoy solo las tarjetas con `0`, `1` o `2`.

---

# Bloque A — DER y recuperación corregida

## Tarjeta A1 — E-038

**Frente**

```text
¿Qué representa una línea doble en un DER?
```

**Reverso**

```text
Participación total.
```

Toda instancia de la entidad debe participar en la relación.

---

## Tarjeta A2

**Frente**

```text
Rectángulo doble vs. línea doble
```

**Reverso**

```text
Rectángulo doble → entidad débil.
Línea doble      → participación total.
```

---

## Tarjeta A3 — E-036

**Frente**

```text
¿Cómo se representa una generalización UML?
```

**Reverso**

```text
Línea continua con triángulo vacío hacia el padre.

HIJO ─────▷ PADRE
```

---

## Tarjeta A4 — E-037

**Frente**

```text
¿Qué es una instancia de una entidad?
```

**Reverso**

```text
Una ocurrencia concreta de la entidad.

Entidad: OPERARIO
Instancia: Operario 189 — Juan Pérez
```

No significa cantidad de filas.

---

## Tarjeta A5 — E-039

**Frente**

```text
Entidad asociativa vs. entidad débil
```

**Reverso**

```text
Asociativa
→ materializa una relación N:M y puede guardar atributos de esa relación.

Débil
→ depende de otra entidad para identificarse o existir en el modelo.
```

Una tabla con dos FK no es débil automáticamente.

---

# Bloque B — Realización de análisis

## Tarjeta B1 — E-040

**Frente**

```text
¿Cuál era el objetivo exacto del caso trabajado?
```

**Reverso**

```text
Registrar ejecución de OT.
```

No cambiarlo durante la colaboración por `Crear OT`.

---

## Tarjeta B2

**Frente**

```text
Alternativo por falta de conexión para Registrar ejecución de OT
```

**Reverso**

```text
1. App detecta falta de conexión.
2. Crea solicitud pendiente.
3. La encola por orden de llegada.
4. Informa al Operario.
5. La sincroniza cuando vuelve la conexión.
```

---

## Tarjeta B3

**Frente**

```text
¿Qué diferencia existe entre colaboración de análisis y secuencia de diseño?
```

**Reverso**

```text
Colaboración de análisis
→ objetos conceptuales, responsabilidades y mensajes.

Secuencia de diseño
→ participantes concretos, orden temporal, operaciones,
  interfaces, subsistemas y restricciones de implementación.
```

---

## Tarjeta B4

**Frente**

```text
¿Por qué los mensajes de análisis no son métodos Java definitivos?
```

**Reverso**

```text
Porque expresan responsabilidades conceptuales.
El diseño define operaciones/signaturas y la implementación aporta código.
```

---

# Bloque C — TDA, Pila, Cola y trazabilidad

## Tarjeta C1 — E-041

**Frente**

```text
¿Qué permanece y qué cambia entre una Cola con vector y una con lista?
```

**Reverso**

```text
Permanece
→ contrato, operaciones y política FIFO.

Cambia
→ representación interna: índices/vector o nodos/referencias.
```

---

## Tarjeta C2

**Frente**

```text
Operaciones del TDA Cola
```

**Reverso**

```text
encolar
Desencolar
cabecera
esVacia
longitud
```

---

## Tarjeta C3 — E-042

**Frente**

```text
Pila vs. Cola
```

**Reverso**

```text
Pila → LIFO → último en entrar, primero en salir.
Cola → FIFO → primero en entrar, primero en salir.
```

---

## Tarjeta C4

**Frente**

```text
¿FIFO garantiza trazabilidad?
```

**Reverso**

```text
No.
FIFO preserva el orden de procesamiento.

Trazabilidad requiere identificador, fecha/hora, estado,
intentos, actor y resultado.
```

---

## Tarjeta C5

**Frente**

```text
Riesgo de vector vs. lista enlazada
```

**Reverso**

```text
Vector
→ capacidad fija y posible desbordamiento.

Lista enlazada
→ limitada por memoria y manejo de referencias.
```

---

# Bloque D — Información y unidades

## Tarjeta D1 — E-043

**Frente**

```text
Relación probabilidad–incertidumbre–información
```

**Reverso**

```text
P ↑ → incertidumbre ↓ → información ↓
P ↓ → incertidumbre ↑ → información ↑
```

---

## Tarjeta D2

**Frente**

```text
Fórmula de información de un evento
```

**Reverso**

```text
I(E) = log₂(1 / P(E))
```

Unidad:

```text
bits
```

---

## Tarjeta D3

**Frente**

```text
P(E)=1/8 → I(E)=?
```

**Reverso**

```text
I(E)=log₂(8)=3 bits
```

---

## Tarjeta D4

**Frente**

```text
bits vs. bits/símbolo vs. bits/segundo
```

**Reverso**

```text
bits
→ cantidad de información.

bits/símbolo
→ información media por símbolo.

bits/segundo
→ tasa de información por tiempo.
```

---

## Tarjeta D5

**Frente**

```text
Fórmula de tasa de información
```

**Reverso**

```text
R = m · H(S)
```

```text
m → símbolos/segundo
H → bits/símbolo
R → bits/segundo
```

---

# Bloque E — Señales y muestreo

## Tarjeta E1 — E-044

**Frente**

```text
A, T y f
```

**Reverso**

```text
A → amplitud o magnitud/nivel.
T → período: tiempo de un ciclo, en segundos.
f → frecuencia: ciclos por segundo, en Hz.
```

---

## Tarjeta E2

**Frente**

```text
Relación frecuencia–período
```

**Reverso**

```text
f = 1/T
T = 1/f
```

Son inversos.

---

## Tarjeta E3

**Frente**

```text
¿Qué es muestreo?
```

**Reverso**

```text
Tomar valores de una señal continua en instantes determinados
para obtener una representación que pueda tratarse digitalmente.
```

---

## Tarjeta E4

**Frente**

```text
Frecuencia mínima de muestreo según el material
```

**Reverso**

```text
fs mínima = 2 · fmax
```

---

## Tarjeta E5

**Frente**

```text
¿Qué ocurre si aumenta fs?
```

**Reverso**

```text
Aumentan las muestras y la cantidad de datos;
mejora la representación temporal y se requieren más recursos/ancho de banda.
```

---

# Bloque F — Digitalización, política y supuestos

## Tarjeta F1 — E-045

**Frente**

```text
¿Una señal analógica puede transmitirse como analógica?
```

**Reverso**

```text
Sí.
No toda señal debe digitalizarse para poder transmitirse.
```

---

## Tarjeta F2

**Frente**

```text
¿Por qué digitalizar una medición en el caso móvil/servidor?
```

**Reverso**

```text
Para representarla, procesarla, almacenarla e intercambiarla
como datos digitales dentro de la solución elegida.
```

---

## Tarjeta F3

**Frente**

```text
¿La fórmula I(E) decide si un mensaje se envía?
```

**Reverso**

```text
No.
I(E) mide información según probabilidad.
La política del sistema decide qué datos deben enviarse.
```

---

## Tarjeta F4

**Frente**

```text
¿Síncrona o asíncrona si el enunciado no indica protocolo?
```

**Reverso**

```text
No se puede determinar sin un supuesto.
Debe declararse la solución elegida y justificarla.
```

---

# Bloque G — Java y `toString()`

## Tarjeta G1 — E-016

**Frente**

```text
¿Qué hace toString() y de dónde se hereda?
```

**Reverso**

```text
toString() devuelve una representación textual del objeto
y se hereda de Object.
```

---

## Tarjeta G2

**Frente**

```java
@Override
public String toString() {
    return ...;
}
```

¿Qué concepto aparece?

**Reverso**

```text
Sobrescritura de un método heredado de Object.
```

---

# Mini examen de recuperación

Responder sin mirar:

1. ¿Qué representa línea doble en DER?
2. Escribí el alternativo sin conexión de `Registrar ejecución`.
3. ¿Qué permanece en el TDA Cola?
4. ¿Qué diferencia hay entre FIFO y trazabilidad?
5. Completá `P↑ → I___`.
6. Escribí `I(E)` y su unidad.
7. Diferenciá las tres unidades de información.
8. Definí A, T y f.
9. Escribí `f`, `T` y `fs mínima`.
10. ¿Puede transmitirse una señal analógica?
11. ¿Quién decide qué datos enviar?
12. ¿Qué hace `toString()`?
13. ¿Cómo se representa generalización UML?
14. ¿Qué es una instancia?
15. ¿Qué diferencia hay entre asociativa y débil?

---

# Criterio de salida

```text
13–15 correctas
→ comenzar contenido nuevo.

10–12
→ repetir tarjetas falladas.

7–9
→ releer resultados Día 8 y volver a intentar.

Menos de 7
→ recuperación guiada antes de Diseño.
```

---

# Calendario de repetición

| Momento | Actividad |
|---|---|
| Inicio Día 9 | Mini examen completo |
| Final Día 9 | Solo tarjetas falladas |
| 15/08 | Repetición sin apuntes |
| 17/08 | Mezclar con preguntas del Día 9 |
| 21/08 | Defensa oral de cinco minutos |
| Semana del examen | Mini examen completo |

---

# Registro personal

| Tarjeta | Inicio | Final Día 9 | 15/08 | 17/08 | Consolidada |
|---|---:|---:|---:|---:|:---:|
| A1 | | | | | [ ] |
| A2 | | | | | [ ] |
| A3 | | | | | [ ] |
| A4 | | | | | [ ] |
| A5 | | | | | [ ] |
| B1 | | | | | [ ] |
| B2 | | | | | [ ] |
| B3 | | | | | [ ] |
| B4 | | | | | [ ] |
| C1 | | | | | [ ] |
| C2 | | | | | [ ] |
| C3 | | | | | [ ] |
| C4 | | | | | [ ] |
| C5 | | | | | [ ] |
| D1 | | | | | [ ] |
| D2 | | | | | [ ] |
| D3 | | | | | [ ] |
| D4 | | | | | [ ] |
| D5 | | | | | [ ] |
| E1 | | | | | [ ] |
| E2 | | | | | [ ] |
| E3 | | | | | [ ] |
| E4 | | | | | [ ] |
| E5 | | | | | [ ] |
| F1 | | | | | [ ] |
| F2 | | | | | [ ] |
| F3 | | | | | [ ] |
| F4 | | | | | [ ] |
| G1 | | | | | [ ] |
| G2 | | | | | [ ] |
