# Tarjetas de recuperación — Errores del Día 8

**Fecha:** 13/08/2026  
**Objetivo:** estudiar activamente los errores abiertos y los conceptos corregidos que todavía requieren retención  
**Fuentes:** evaluación escrita, defensa oral, fichas del Día 8 y registro canónico de errores

---

# Cómo usar estas tarjetas

## Ronda 1 — Reconocimiento

1. Tapar la respuesta.
2. Leer el frente.
3. Responder en voz alta en una frase.
4. Comparar con el reverso.

## Ronda 2 — Producción

- Escribir las fórmulas y unidades sin mirar.
- Dibujar los esquemas UML/DER.
- Resolver los ejemplos numéricos.

## Ronda 3 — Defensa

Responder cada tarjeta con:

```text
Definición
→ diferencia
→ ejemplo
→ error que evita
```

Marcas sugeridas:

```text
✅ correcta sin ayuda
⚠️ correcta con duda
❌ incorrecta
```

Repetición:

```text
Hoy → tarjetas ❌ y ⚠️
Mañana → todas las ⚠️ y ❌
En 3 días → mazo completo
En 7 días → mazo completo sin apuntes
```

---

# Mazo A — Modelo de análisis

## Tarjeta A01 — Vista externa vs. interna

**Frente**

¿Cuál es la diferencia entre modelo de casos de uso y modelo de análisis?

**Reverso**

```text
Modelo de casos de uso
→ vista externa;
→ actor, objetivo y resultado de valor.

Modelo de análisis
→ vista interna conceptual;
→ objetos, responsabilidades y colaboraciones.
```

---

## Tarjeta A02 — Propósito del análisis

**Frente**

¿Cuál es el propósito del análisis?

**Reverso**

> Refinar y estructurar los requisitos para comprender internamente el sistema mediante objetos conceptuales, responsabilidades y colaboraciones, sirviendo como base para el diseño.

---

## Tarjeta A03 — Tres estereotipos

**Frente**

¿Qué responsabilidades tienen `<<interfaz>>`, `<<control>>` y `<<entidad>>`?

**Reverso**

```text
<<interfaz>>
→ recibe solicitudes y presenta información.

<<control>>
→ coordina el flujo del caso de uso.

<<entidad>>
→ representa información y comportamiento del dominio.
```

---

## Tarjeta A04 — Entidad no es tabla

**Frente**

¿Por qué una clase `<<entidad>>` no equivale automáticamente a una tabla?

**Reverso**

```text
Clase de entidad
→ concepto del modelo de análisis.

Tabla
→ estructura del modelo relacional.
```

Una clase de entidad puede corresponder a una, varias o ninguna tabla según el diseño posterior.

---

## Tarjeta A05 — Realización de caso

**Frente**

¿Qué es una realización de caso de uso–análisis?

**Reverso**

> Es la colaboración conceptual de objetos de interfaz, control y entidad que explica cómo se realiza internamente un caso de uso.

---

## Tarjeta A06 — Registrar ejecución, no crear OT

**Frente**

En el caso `Registrar ejecución de OT`, ¿qué objeto ya debe existir y qué objeto se crea o registra?

**Reverso**

```text
Ya existe:
→ OrdenTrabajo.

Se crea/registra:
→ EjecucionOT.
```

Error que evita: cambiar accidentalmente el objetivo del caso a `Crear OT`.

---

## Tarjeta A07 — Alternativo sin conexión

**Frente**

¿Cómo se representa el alternativo por falta de conexión?

**Reverso**

```text
1. La interfaz detecta falta de conexión.
2. La ejecución queda pendiente de envío.
3. Se informa al Operario.
4. Al recuperarse la conexión, la solicitud se procesa según la política definida.
```

---

## Tarjeta A08 — Mensaje vs. método

**Frente**

¿Por qué un mensaje del análisis no es todavía un método Java definitivo?

**Reverso**

> Porque expresa una responsabilidad conceptual. La signatura, los tipos, parámetros, clases tecnológicas y detalles de implementación se definen posteriormente en diseño.

---

# Mazo B — TDA, Pila y Cola

## Tarjeta B01 — Contrato vs. implementación

**Frente**

¿Qué permanece y qué cambia si una Cola se implementa con vector o lista enlazada?

**Reverso**

```text
Permanece:
→ interfaz del TDA y política FIFO;
→ encolar, desencolar, cabecera, esVacia, longitud.

Cambia:
→ representación interna;
→ índices/vector o nodos/referencias.
```

---

## Tarjeta B02 — Pila vs. Cola

**Frente**

Completá:

```text
Pila =
Cola =
```

**Reverso**

```text
Pila = LIFO = último en entrar, primero en salir.
Cola = FIFO = primero en entrar, primero en salir.
```

---

## Tarjeta B03 — Frente y final

**Frente**

¿Dónde se inserta y dónde se extrae en una Cola?

**Reverso**

```text
encolar
→ final.

desencolar
→ frente.
```

---

## Tarjeta B04 — Cabecera vs. desencolar

**Frente**

¿Cuál es la diferencia entre `cabecera()` y `desencolar()`?

**Reverso**

```text
cabecera()
→ devuelve/consulta el frente sin eliminarlo.

desencolar()
→ devuelve y elimina el frente.
```

---

## Tarjeta B05 — Vector

**Frente**

¿Cuáles son la ventaja y los riesgos de una Cola con vector?

**Reverso**

```text
Ventaja:
→ índices y memoria contigua;
→ útil con máximo conocido.

Riesgos:
→ capacidad definida/desbordamiento;
→ posiciones iniciales sin reutilizar si se gestionan mal los índices.
```

---

## Tarjeta B06 — Lista enlazada

**Frente**

¿Cuáles son la ventaja y los riesgos de una Cola enlazada?

**Reverso**

```text
Ventaja:
→ tamaño variable;
→ encolar/desencolar moviendo referencias.

Riesgos:
→ agotamiento de memoria;
→ pérdida o corrupción de referencias;
→ memoria extra por enlace.
```

---

## Tarjeta B07 — Orden no es trazabilidad

**Frente**

¿FIFO garantiza trazabilidad?

**Reverso**

```text
No.

FIFO
→ preserva orden de procesamiento.

Trazabilidad
→ exige identificador, fecha/hora, estado, intentos y resultado registrados.
```

---

## Tarjeta B08 — Urgencias

**Frente**

¿Qué estructura usarías si las solicitudes urgentes deben adelantarse?

**Reverso**

```text
Cola de prioridad.
```

Ya no se respeta una política FIFO estricta; el orden depende de la prioridad definida.

---

# Mazo C — Información y unidades

## Tarjeta C01 — Relación fundamental

**Frente**

Completá:

```text
Probabilidad alta →
Probabilidad baja →
```

**Reverso**

```text
Probabilidad alta
→ incertidumbre baja
→ información baja.

Probabilidad baja
→ incertidumbre alta
→ información alta.
```

---

## Tarjeta C02 — Fórmula de información

**Frente**

Escribí la fórmula de cantidad de información y su unidad.

**Reverso**

```text
I(E)=log₂(1/P(E))
Unidad=bits
```

---

## Tarjeta C03 — Ejemplo 1/8

**Frente**

Calculá `I(E)` para `P(E)=1/8`.

**Reverso**

```text
I(E)=log₂(1/(1/8))
    =log₂(8)
    =3 bits
```

---

## Tarjeta C04 — Evento seguro

**Frente**

¿Cuánta información aporta un evento seguro `P(E)=1`?

**Reverso**

```text
I(E)=log₂(1)=0 bits
```

---

## Tarjeta C05 — Entropía

**Frente**

¿Qué representa `H(S)` y cuál es su unidad?

**Reverso**

```text
H(S)
→ información media por símbolo.
Unidad
→ bits/símbolo.
```

---

## Tarjeta C06 — Tasa de información

**Frente**

¿Cuál es la fórmula de tasa de información y su unidad?

**Reverso**

```text
R=m·H(S)
Unidad=bits/segundo
```

`m` se expresa en símbolos/segundo.

---

## Tarjeta C07 — Tres unidades

**Frente**

Diferenciá:

```text
bits
bits/símbolo
bits/segundo
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

## Tarjeta C08 — Información no decide envío

**Frente**

¿La fórmula `I(E)` decide si un dato debe enviarse?

**Reverso**

```text
No.
I(E) mide información según probabilidad.
Una política del sistema decide qué datos deben transmitirse.
```

---

# Mazo D — Señales y muestreo

## Tarjeta D01 — Analógica vs. digital

**Frente**

Diferenciá señal analógica y digital.

**Reverso**

```text
Analógica
→ variación continua.

Digital
→ niveles o valores discretos.
```

---

## Tarjeta D02 — Amplitud

**Frente**

¿Qué es la amplitud?

**Reverso**

> Es la magnitud o nivel de la señal respecto de una referencia. No es sinónimo automático de potencia.

---

## Tarjeta D03 — Período

**Frente**

¿Qué es el período y cuál es su unidad?

**Reverso**

```text
Período T
→ tiempo que tarda una señal periódica en completar un ciclo.
Unidad
→ segundos.
```

---

## Tarjeta D04 — Frecuencia

**Frente**

¿Qué es la frecuencia y cuál es su unidad?

**Reverso**

```text
Frecuencia f
→ cantidad de ciclos por segundo.
Unidad
→ hertz, Hz.
```

---

## Tarjeta D05 — Fórmulas inversas

**Frente**

Completá:

```text
f=
T=
```

**Reverso**

```text
f=1/T
T=1/f
```

---

## Tarjeta D06 — Ejemplo de frecuencia

**Frente**

Si `T=0,002 s`, ¿cuál es `f`?

**Reverso**

```text
f=1/0,002
f=500 Hz
```

---

## Tarjeta D07 — Definición de muestreo

**Frente**

¿Qué es el muestreo?

**Reverso**

> Tomar valores de una señal continua en instantes determinados para obtener una representación discreta que pueda ser tratada por el sistema.

---

## Tarjeta D08 — Regla de muestreo

**Frente**

¿Cuál es la regla mínima de muestreo utilizada por el material?

**Reverso**

```text
fs mínima=2·fmax
```

---

## Tarjeta D09 — Ejemplo de muestreo

**Frente**

Si `fmax=8 kHz`, calculá `fs mínima`.

**Reverso**

```text
fs mínima=2·8 kHz
fs mínima=16 k muestras/s
```

---

## Tarjeta D10 — Aumentar `fs`

**Frente**

¿Qué ocurre si aumenta la frecuencia de muestreo?

**Reverso**

```text
→ se toman más muestras;
→ mejora la representación temporal dentro del alcance del material;
→ aumenta el volumen de datos;
→ aumentan recursos y ancho de banda necesarios.
```

---

## Tarjeta D11 — Analógica puede viajar

**Frente**

¿Una señal analógica necesariamente debe digitalizarse para transmitirse?

**Reverso**

```text
No.
Puede transmitirse analógicamente.
Se digitaliza cuando la solución necesita procesarla, almacenarla o enviarla como datos digitales.
```

---

## Tarjeta D12 — Cadena de digitalización

**Frente**

Ordená la cadena conceptual de transformación.

**Reverso**

```text
señal analógica
→ muestreo
→ cuantificación/codificación según la solución
→ datos digitales
```

---

# Mazo E — Formas de transmisión

## Tarjeta E01 — Serie vs. paralela

**Frente**

Diferenciá transmisión serie y paralela.

**Reverso**

```text
Serie
→ bits sucesivos por una línea lógica.

Paralela
→ varios bits simultáneos por líneas diferentes.
```

---

## Tarjeta E02 — Asíncrona vs. síncrona

**Frente**

Completá:

```text
Asíncrona=
Síncrona=
```

**Reverso**

```text
Asíncrona=start + carácter + stop.
Síncrona=cabecera + bloque + terminación.
```

---

## Tarjeta E03 — Dimensiones independientes

**Frente**

¿Por qué una transmisión puede ser serie y asíncrona a la vez?

**Reverso**

```text
Serie/paralela
→ describe cómo se envían los bits por las líneas.

Síncrona/asíncrona
→ describe sincronización y delimitación.
```

Son dimensiones diferentes.

---

## Tarjeta E04 — Declarar supuesto

**Frente**

¿Qué se responde si el enunciado no especifica si la transmisión es síncrona o asíncrona?

**Reverso**

> Se declara un supuesto y se lo justifica. No se elige una opción como si estuviera determinada por el enunciado.

Ejemplo:

```text
Supongo asíncrona si cada lectura se envía individualmente.
Supongo síncrona si las lecturas se agrupan en bloques.
```

---

# Mazo F — Recuperaciones anteriores todavía activas

## Tarjeta F01 — Generalización UML

**Frente**

¿Cómo se representa una generalización UML?

**Reverso**

```text
línea continua
+ triángulo vacío
+ punta hacia el padre
```

```text
Encargado ─────▷ UsuarioSistema
```

---

## Tarjeta F02 — Instancia

**Frente**

¿Qué es una instancia de entidad?

**Reverso**

> Una ocurrencia concreta de una entidad.

```text
Entidad: OPERARIO
Instancia: Operario 189 — Juan Pérez
```

---

## Tarjeta F03 — Simbología DER

**Frente**

Completá:

```text
Rectángulo doble=
Línea doble=
Elipse doble=
```

**Reverso**

```text
Rectángulo doble=entidad débil.
Línea doble=participación total.
Elipse doble=atributo multivaluado.
```

---

## Tarjeta F04 — Asociativa vs. débil

**Frente**

Diferenciá entidad/tabla asociativa y entidad débil.

**Reverso**

```text
Asociativa
→ materializa N:M.

Débil
→ depende de otra para identificarse o existir.
```

Una PK formada por FK no basta por sí sola para decidir que es débil.

---

## Tarjeta F05 — Completo vs. verificable

**Frente**

Diferenciá requerimiento completo y verificable.

**Reverso**

```text
Completo
→ contiene toda la información necesaria.

Verificable
→ puede comprobarse objetivamente.
```

---

## Tarjeta F06 — `toString()`

**Frente**

¿Qué es `toString()`?

**Reverso**

> Método heredado de `Object` que devuelve una representación textual del objeto. Una subclase puede sobrescribirlo para personalizar esa representación.

---

## Tarjeta F07 — N:M conceptual vs. tabla

**Frente**

Diferenciá relación N:M conceptual y tabla asociativa.

**Reverso**

```text
N:M conceptual
→ regla del DER.

Tabla asociativa
→ implementación de esa relación en el modelo relacional.
```

---

# Mini examen de salida

Responder sin mirar:

1. `I(E)=`  
2. Unidad de `I(E)=`  
3. `R=` y unidad  
4. `f=`  
5. `T=`  
6. `fs mínima=`  
7. Pila=`_____`; Cola=`_____`  
8. Rectángulo doble=`_____`; Línea doble=`_____`  
9. Permanece en el TDA=`_____`; cambia=`_____`  
10. FIFO garantiza orden o trazabilidad=`_____`  
11. Alternativo sin conexión=`_____`  
12. Una señal analógica puede transmitirse analógicamente=`sí/no`  

Criterio:

```text
12/12 → consolidación candidata
10–11 → repetir tarjetas falladas
8–9   → repetir mazos C y D
<8    → rehacer todo el bloque de Transmisión
```
