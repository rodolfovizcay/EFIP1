# Cuadro de transmisión — Día 8

**Fecha:** 13/08/2026  
**Materia:** Comunicaciones  
**Producto del plan:** cuadro de transmisión

---

# 1. Medida de la información

## Idea central

La información se mide técnicamente según incertidumbre/probabilidad, no según el significado del mensaje.

```text
Evento muy probable
→ poca información.

Evento poco probable
→ mucha información.
```

## Fórmula

```text
I(E) = log2(1 / P(E))
```

Unidad:

```text
bits
```

## Valores de referencia

| Probabilidad | Cálculo | Información |
|---:|---:|---:|
| `1` | `log2(1)` | `0 bits` |
| `1/2` | `log2(2)` | `1 bit` |
| `1/4` | `log2(4)` | `2 bits` |
| `1/8` | `log2(8)` | `3 bits` |
| `1/16` | `log2(16)` | `4 bits` |

## Entropía

```text
H(S)
→ valor medio de información por símbolo.
→ unidad: bits/símbolo.
```

## Tasa de información

Si la fuente produce `m` símbolos por segundo:

```text
R = m · H(S)
```

Unidad:

```text
bits/segundo
```

Ejemplo:

```text
m = 200 símbolos/s
H = 3 bits/símbolo
R = 600 bits/s
```

---

# 2. Señal analógica vs. digital

| Criterio | Analógica | Digital |
|---|---|---|
| Variación | Continua | Discreta/pulsante |
| Forma típica | Onda sinusoidal | Pulsos aproximados a rectángulos |
| Voltaje | Varía continuamente | Mantiene niveles durante intervalos |
| Asociación del material | Naturaleza | Tecnología |
| Parámetros | Amplitud, período, frecuencia | Niveles, ancho de pulso, período, frecuencia |

## Idea central

```text
Analógica
→ continua.

Digital
→ discreta.
```

---

# 3. Parámetros de una señal

| Parámetro | Símbolo | Significado | Unidad |
|---|---|---|---|
| Amplitud | `A` | Magnitud/nivel | depende de la señal |
| Período | `T` | Tiempo de un ciclo | segundos |
| Frecuencia | `f` | Ciclos por segundo | hertz |

Relación:

```text
f = 1/T
T = 1/f
```

## Ejemplos

```text
T = 0,5 s
f = 2 Hz
```

```text
f = 50 Hz
T = 0,02 s
```

```text
f = 2 kHz = 2000 Hz
T = 0,0005 s
```

---

# 4. Muestreo

## Definición

Tomar valores de una señal continua en instantes determinados para representarla y luego recuperarla mediante el tratamiento correspondiente.

## Regla del material

```text
fs ≥ 2 · fmax
```

| Símbolo | Significado |
|---|---|
| `fs` | frecuencia de muestreo |
| `fmax` | frecuencia máxima de la señal |

## Ejemplos

| `fmax` | `fs` mínima |
|---:|---:|
| `1 kHz` | `2 k muestras/s` |
| `4 kHz` | `8 k muestras/s` |
| `10 kHz` | `20 k muestras/s` |
| `20 kHz` | `40 k muestras/s` |

## Interpretación

- al menos dos muestras por ciclo de la componente máxima;
- más muestras mejoran la representación;
- el material relaciona mayor frecuencia de muestreo con mayor ancho de banda ocupado.

## Error frecuente

```text
fmax = 10 kHz
fs mínima = 10 k muestras/s ❌
fs mínima = 20 k muestras/s ✅
```

---

# 5. Transmisión serie vs. paralela

| Criterio | Serie | Paralela |
|---|---|---|
| Envío | Bit a bit | Varios bits simultáneos |
| Líneas | Menos líneas | 8, 16, 32 o 64 líneas según material |
| Distancia del ejemplo | Mayor a 20 pies | No superior a 20 pies |
| Ejemplo del material | RS-232/periféricos | Interfaz paralela local |
| Representación | `1→0→1→1` | varios bits en líneas separadas |

## Serie

Características citadas:

1. transmisión bit a bit;
2. una línea de señal y otra de retorno;
3. distancia superior a 20 pies en el ejemplo.

## Paralela

Características citadas:

1. varias líneas conjuntas;
2. transmisión simultánea;
3. distancia corta en el ejemplo.

## Criterio

No afirmar que una forma es siempre mejor. La elección depende de distancia, cantidad de líneas, tecnología y necesidad.

---

# 6. Transmisión asíncrona vs. síncrona

| Criterio | Asíncrona | Síncrona |
|---|---|---|
| Unidad principal del material | Carácter | Bloque |
| Delimitación | `start` + carácter + `stop` | cabecera + bloque + terminación |
| Sincronismo | A nivel de carácter | Regularidad dentro del bloque |
| Intervalo | Variable entre caracteres | Bits regulares dentro del bloque |
| Rendimiento citado | menor por control por carácter | mayor en bloques grandes |

## Asíncrona

```text
start + datos del carácter + stop
```

- no hay sincronismo a nivel de mensaje;
- sí a nivel de carácter;
- intervalo entre caracteres variable;
- normalmente 1 bit `start` y 1 o 2 bits `stop` en el material.

## Síncrona

```text
cabecera + bloque de datos + terminación
```

- sincronismo/regularidad a nivel de bloque;
- rendimiento crece con tamaño del bloque según material.

## Fórmula de memoria

```text
Asíncrona = carácter + start/stop
Síncrona  = bloque + cabecera/terminación
```

---

# 7. Cuatro diferencias que no deben mezclarse

```text
Analógica vs. digital
→ forma de la señal.

Serie vs. paralela
→ cantidad de bits/líneas transmitidas simultáneamente.

Asíncrona vs. síncrona
→ forma de sincronización y delimitación.

Guiada vs. no guiada
→ tipo de medio físico.
```

Una transmisión puede combinar categorías:

```text
serie + asíncrona + digital + medio guiado
```

No son opciones excluyentes entre todos los pares.

---

# 8. Ejercicios

## 8.1 Información

Calcular:

```text
P(E)=1/32
I(E)=?
```

## 8.2 Tasa

```text
m = 500 símbolos/s
H = 2 bits/símbolo
R = ?
```

## 8.3 Frecuencia

```text
T = 0,004 s
f = ?
```

## 8.4 Período

```text
f = 250 Hz
T = ?
```

## 8.5 Muestreo

```text
fmax = 6 kHz
fs mínima = ?
```

## 8.6 Clasificación

Identificar:

```text
Se envía un bit después de otro por una línea
→

Se envían 8 bits simultáneamente
→

Cada carácter tiene start/stop
→

Se transmite un bloque delimitado
→
```

---

# 9. Aplicación didáctica OT

Caso:

> Un sensor asociado a una ejecución de OT produce una señal analógica con frecuencia máxima de 5 kHz. El sistema la muestrea y envía datos digitales desde el dispositivo al servidor.

Preguntas:

1. ¿La señal original es analógica o digital?
2. ¿Cuál es la frecuencia mínima de muestreo?
3. Después del muestreo, ¿qué tipo de datos se envía?
4. ¿La transmisión puede ser serie?
5. ¿Puede ser síncrona o asíncrona? Declarar supuesto.

Respuesta mínima esperada:

```text
Original → analógica
fs mínima → 10 k muestras/s
Datos enviados → digitales
Serie → posible
Síncrona/asíncrona → depende de solución y protocolo
```

---

# 10. Errores frecuentes

| Error | Corrección |
|---|---|
| Información = importancia semántica | Es medida técnica de incertidumbre |
| Evento seguro aporta mucha información | `P=1` produce `I=0` |
| `log2` produce bytes | Produce bits |
| Frecuencia y período crecen juntos | Son inversos |
| Muestreo mínimo = frecuencia original | Debe ser al menos el doble |
| Serie = síncrona | Son dimensiones diferentes |
| Paralela = asíncrona | Son dimensiones diferentes |
| Asíncrona = segmentos tolerantes a fallos | Carácter con start/stop |
| Síncrona = toda la información sin dividir | Bloque delimitado y sincronizado |
| Señal digital = bits sin medio físico | Los bits se representan mediante señales |

---

# 11. Respuesta oral compacta

> La medida técnica de información depende de la incertidumbre: cuanto menos probable es un evento, más información aporta, y con logaritmo en base dos se mide en bits. Las señales pueden ser analógicas, continuas, o digitales, discretas. En una señal periódica, frecuencia y período son inversos. El muestreo requiere, según el material, una frecuencia mínima igual al doble de la frecuencia máxima. La transmisión serie envía bits uno a uno y la paralela usa varias líneas simultáneas. La asíncrona delimita caracteres con start/stop y la síncrona trabaja con bloques delimitados por cabecera y terminación.

---

# 12. Control

- [ ] Puedo explicar información e incertidumbre.
- [ ] Puedo calcular `I(E)` en casos simples.
- [ ] Puedo diferenciar entropía y tasa.
- [ ] Puedo diferenciar señal analógica/digital.
- [ ] Puedo usar `f=1/T`.
- [ ] Puedo calcular la tasa mínima de muestreo.
- [ ] Puedo diferenciar serie/paralela.
- [ ] Puedo diferenciar síncrona/asíncrona.
- [ ] Puedo combinar categorías sin mezclarlas.
- [ ] Puedo aplicar los conceptos a un caso de OT/sensor.
