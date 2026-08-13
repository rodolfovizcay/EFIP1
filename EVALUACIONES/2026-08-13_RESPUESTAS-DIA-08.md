# Respuestas del estudiante — Evaluación Día 8

**Fecha:** 13/08/2026  
**Inicio:**  
**Fin:**  
**Tiempo total:**  
**Apuntes utilizados:** no

> No reemplazar respuestas después de corregir. Registrar correcciones en resultados, cierre y errores/recuperaciones.

---

# Parte A — Modelo de análisis

## 1. Propósito y artefactos

### Propósito del análisis


### Modelo de casos de uso


### Modelo de análisis


### Artefactos

| Artefacto | Definición |
|---|---|
| Modelo de análisis | |
| Clase de análisis | |
| Realización de caso de uso–análisis | |
| Paquete de análisis | |
| Vista de arquitectura | |

---

## 2. Interfaz, entidad y control

### Definiciones

```text
Clase de interfaz =

Clase de entidad =

Clase de control =
```

### Responsabilidades

| Estereotipo | Responsabilidad 1 | Responsabilidad 2 |
|---|---|---|
| Interfaz | | |
| Entidad | | |
| Control | | |

### Clasificación

| Clase | Estereotipo | Justificación |
|---|---|---|
| FormularioCrearOT | | |
| ControlCrearOT | | |
| OrdenTrabajo | | |
| Sector | | |
| APIRecepcionEjecucion | | |

---

## 3. Realización y colaboración

### Actor


### Objetos

```text
<<interfaz>>
<<control>>
<<entidad>>
<<entidad>>
```

### Mensajes del flujo normal

```text
1.
2.
3.
4.
5.
```

### Alternativo sin conexión

```text
A1.
A2.
A3.
```

### Actor e interfaz


### Mensajes vs. métodos


### Colaboración vs. secuencia de diseño


---

# Parte B — Colas

## 4. Concepto y operaciones

```text
Cola =
FIFO =
Frente =
Final =
encolar =
desencolar =
cabecera =
esVacia =
longitud =
```

### `cabecera()` vs. `desencolar()`


---

## 5. Simulación

| Paso | Operación | Devuelve | Cola | Frente | Final |
|---:|---|---|---|---|---|
| 0 | inicio | — | `[]` | — | — |
| 1 | `encolar(A)` | | | | |
| 2 | `encolar(B)` | | | | |
| 3 | `encolar(C)` | | | | |
| 4 | `cabecera()` | | | | |
| 5 | `desencolar()` | | | | |
| 6 | `encolar(D)` | | | | |
| 7 | `desencolar()` | | | | |
| 8 | `encolar(E)` | | | | |

```text
Frente final =
Final final =
```

---

## 6. Implementaciones y elección

| Criterio | Vector | Lista enlazada |
|---|---|---|
| Frente/final | | |
| Capacidad | | |
| Memoria | | |
| Encolar | | |
| Desencolar | | |
| Riesgos | | |
| Criterio de elección | | |

### Qué cambia y qué permanece


### Cola para orden de llegada


### Pila produciría


### Solicitudes urgentes


---

# Parte C — Información, señales y transmisión

## 7. Información y cálculos

### Probabilidad, incertidumbre e información


```text
I(E) =
Unidad =
```

### Cálculo a

```text
P(E)=1/8
Desarrollo:
Resultado:
```

### Cálculo b

```text
m=400 símbolos/s
H=2,5 bits/símbolo
Desarrollo:
Resultado:
```

### Unidades

```text
bits =
bits/símbolo =
bits/segundo =
```

---

## 8. Señales y muestreo

```text
Señal analógica =
Señal digital =
Amplitud =
Período =
Frecuencia =
Muestreo =
```

```text
f =
T =
fs mínima =
```

### Cálculo a

```text
T=0,002 s
f=
```

### Cálculo b

```text
fmax=8 kHz
fs mínima=
```

### Aumento de muestreo


---

## 9. Formas de transmisión

```text
Serie =
Paralela =
Asíncrona =
Síncrona =
```

```text
Asíncrona = ______ + carácter + ______
Síncrona  = ______ + bloque + ______
```

### Clasificación

```text
1. Bit después de bit =
2. Ocho líneas simultáneas =
3. Start/stop =
4. Bloque delimitado =
```

### Serie y asíncrona simultáneamente


---

# Parte D — Integración y recuperación

## 10. Integración

```text
RF:
Caso de uso:
Clase de interfaz:
Clase de control:
Clases de entidad:
Colaboración:
Estructura de datos:
Regla FIFO:
Señal original:
Muestreo:
Forma de transmisión declarada:
Caso de prueba:
```

### Cola y modelo de análisis


### Cola como decisión de implementación


### Transformación de la medición


---

## 11. Recuperación espaciada

```text
Generalización UML =

Instancia =

Rectángulo doble =

Línea doble =

Entidad asociativa =

Entidad débil =

Requerimiento completo =

Requerimiento verificable =

toString() =

Relación N:M conceptual =

Tabla asociativa =
```

---

# Defensa oral

## Esquema antes de hablar

```text
Propósito del análisis:
Vista externa/interna:
Interfaz/control/entidad:
Colaboración:
Cola/FIFO:
Vector/lista:
Pila/cola:
Información:
Señales:
Muestreo:
Serie/paralela:
Síncrona/asíncrona:
Integración:
```

## Transcripción o puntos principales


---

# Autoevaluación previa a la corrección

| Criterio | 0 | 1 | 2 | 3 |
|---|:---:|:---:|:---:|:---:|
| Comprensión conceptual | [ ] | [ ] | [ ] | [ ] |
| Terminología académica | [ ] | [ ] | [ ] | [ ] |
| Aplicación práctica | [ ] | [ ] | [ ] | [ ] |
| Cálculos y unidades | [ ] | [ ] | [ ] | [ ] |
| Integración | [ ] | [ ] | [ ] | [ ] |

## Dudas detectadas

1.
2.
3.
4.
5.

## Errores que no deben borrarse

1.
2.
3.
