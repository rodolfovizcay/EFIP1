# Errores y recuperaciones — Estado al cierre del Día 6

**Fecha:** 11/08/2026

---

## Recuperaciones consolidadas durante el Día 6

### E-010 — Síncrona / asíncrona

**Estado:** consolidado.

Evidencia sin apuntes:

```text
Asíncrona = carácter + start/stop
Síncrona  = bloque + cabecera/terminación
```

La respuesta fue correcta en la recuperación inicial y volvió a aparecer correctamente en la evaluación escrita.

---

### E-017 — TDA sin interfaz/implementación

**Estado:** consolidado en el alcance trabajado.

Respuesta inicial:

> Un conjunto de datos u objetos con un conjunto de operaciones permitidas; ofrece una interfaz y oculta la implementación.

Luego se aplicó la misma interfaz `push/pop/peek` a implementaciones con vector y lista enlazada.

---

### E-024 — TCP/IP tratado como protocolo único

**Estado:** consolidado.

Se respondió y defendió:

```text
TCP/IP = arquitectura o pila de protocolos utilizada en la práctica.
```

---

### E-028 — Función de dispositivo atribuida a capa

**Estado:** consolidado en el núcleo trabajado.

```text
Switch tradicional → capa 2 → trama/MAC
Router              → capa 3 → paquete/IP
```

También se explicó que cada dispositivo intermedio procesa solo hasta la capa que necesita.

---

### E-029 — Unidad de switch/router omitida

**Estado:** consolidado en recuperación y aplicación.

El estudiante identificó correctamente que:

- el switch analiza una trama;
- el router accede al paquete/datagrama;
- el servidor destino desencapsula completamente.

---

### E-031 — Fases frente a flujos / ciclo frente a incremento

**Estado:** consolidado en la diferencia principal.

```text
Fases = Inicio, Elaboración, Construcción, Transición
Flujos = Requisitos, Análisis, Diseño, Implementación, Prueba
Iteración → incremento
Ciclo completo → nueva versión
```

La recuperación inicial y la evaluación escrita fueron correctas.

---

## Errores corregidos que todavía requieren retención

### E-011 — Selección de estructura según el problema

**Estado:** corregido; pendiente de consolidar sobre más de un tipo de problema.

Evidencia del Día 6:

- pila elegida porque la operación dominante era deshacer la última acción;
- lista enlazada elegida cuando no se conoce de antemano el tamaño del historial;
- vector asociado a capacidad definida y posible desbordamiento.

La regla vigente permanece:

> La estructura se elige por las operaciones dominantes, restricciones y volumen esperado, no por facilidad de recorrido.

---

### E-025 — PDU incompleta o confundida con PUD

**Estado:** corregido, todavía no consolidado.

Evidencia positiva:

```text
PDU = SDU + PCI
PDU = datos de capa superior + información de control
```

Reaparición en evaluación escrita:

> “Unidad de datos de procesos”.

Corrección vigente:

```text
PDU = Protocol Data Unit
    = Unidad de Datos de Protocolo
```

La comprensión funcional está presente, pero la expansión de la sigla todavía debe recuperarse sin ayuda.

---

### E-030 — Constructor Java escrito como método

**Estado:** corregido, todavía no consolidado.

En la recuperación inicial se recordó el nombre igual a la clase, pero se agregó incorrectamente que debía ser público o protegido y se omitió inicialmente la regla del tipo de retorno.

En la evaluación escrita se respondió:

> “Se nombra como la clase y no devuelve nada”.

Regla exacta:

```text
Constructor Java = mismo nombre de la clase
                 + no declara ningún tipo de retorno
                 + ni siquiera `void`
```

---

## Nuevos errores del Día 6

### E-032 — Completo frente a verificable

- **Materia:** Análisis y Diseño.
- **Tema:** calidad de requerimientos.
- **Tipo:** conceptual/terminológico.
- **Respuesta observada:** `completo` fue definido incluyendo “que sea medible”.
- **Corrección:**

```text
Completo = contiene toda la información necesaria para comprenderlo.
Verificable = puede comprobarse objetivamente mediante prueba o medición.
```

- **Por qué ocurrió:** se asociaron ambigüedad, completitud y medición como si fueran una sola propiedad.
- **Regla:** un requerimiento puede ser completo y no verificable, o verificable y todavía incompleto respecto de otras condiciones.
- **Estado:** abierto; la corrección fue presentada después de la evaluación, pero no hubo recuperación posterior.

---

### E-033 — Riesgo de pila enlazada confundido con desbordamiento fijo

- **Materia:** Algoritmos y Estructuras.
- **Tema:** vector frente a lista enlazada.
- **Tipo:** conceptual/aplicación.
- **Respuesta observada:** se mencionó `desbordamiento` también como riesgo de la pila enlazada.
- **Corrección:**

```text
Vector → capacidad definida; puede desbordarse al llegar al límite.
Lista enlazada → tamaño variable; limitada por memoria disponible y correcta gestión de referencias.
```

- **Estado:** abierto; requiere una comparación futura sin ayuda.

---

### E-034 — Paquete frente a trama durante encapsulamiento

- **Materia:** Comunicaciones.
- **Tema:** PDU por capa.
- **Tipo:** terminológico/conceptual.
- **Respuesta oral:** se afirmó que la capa de Red crea una trama.
- **Corrección:**

```text
Transporte     → segmento
Internet/Red   → paquete/datagrama
Acceso/Enlace  → trama
Física         → bits/señales
```

- **Estado:** abierto; la corrección fue explicada al finalizar la defensa.

---

### E-035 — Bytes frente a bits/señales en Física

- **Materia:** Comunicaciones.
- **Tema:** capa física.
- **Tipo:** terminológico.
- **Respuesta oral:** se dijo que Física transmite bytes.
- **Corrección:** la unidad principal utilizada en el modelo es `bits/señales`.
- **Estado:** abierto; requiere recuperación espaciada.

---

## Ajustes sin código nuevo

### `peek()` frente a `pop()`

La simulación fue correcta. Para mayor precisión oral:

```text
peek() → consulta/devuelve la cima sin eliminar.
pop()  → devuelve y elimina la cima.
```

### Validación de requerimientos

No necesita esperar a que exista el software implementado. Puede realizarse mediante revisión del documento, prototipos, casos de prueba derivados y análisis de consistencia.

### Confirmación y vaciado de la pila

El historial temporal debe vaciarse después de recibir confirmación exitosa del servidor, no antes, para evitar perder las acciones reversibles ante una falla de comunicación.

### RNF verificable

Una condición como `menos de 0,1 segundos` debe incluir contexto de carga, volumen y ambiente de prueba para ser completamente verificable.

---

## Resumen de cambios canónicos propuestos

| Código | Estado previo | Estado Día 6 |
|---|---|---|
| E-010 | corregido | **consolidado** |
| E-011 | abierto | **corregido** |
| E-017 | corregido | **consolidado** |
| E-024 | abierto | **consolidado** |
| E-025 | corregido | **corregido; reapareció la sigla** |
| E-028 | abierto | **consolidado** |
| E-029 | abierto | **consolidado** |
| E-030 | corregido | **corregido; retención pendiente** |
| E-031 | corregido | **consolidado** |
| E-032 | — | **abierto** |
| E-033 | — | **abierto** |
| E-034 | — | **abierto** |
| E-035 | — | **abierto** |

---

## Recuperación recomendada para Día 7

1. Diferenciar `completo` de `verificable` con dos ejemplos.
2. Escribir un constructor Java sin tipo de retorno.
3. Expandir PDU correctamente y explicar `SDU + PCI`.
4. Ordenar `datos → segmento → paquete → trama → bits`.
5. Comparar riesgos de vector y lista enlazada.
6. Definir `peek()` sin utilizar únicamente la palabra “mostrar”.
