# Errores y recuperaciones — Estado al cierre del Día 3

## Recuperaciones confirmadas

### E-005 — Complejidad y selección de estructura

**Estado:** parcialmente recuperado.

Se elige la estructura considerando:

- acceso;
- inserción;
- eliminación;
- tamaño;
- recorrido.

Aún falta profundizar complejidades en jornadas posteriores.

---

### E-006 — Formalización de inserción enlazada

**Estado:** recuperado.

```text
nuevo.siguiente = cabeza
cabeza = nuevo
```

---

### E-007 — Terminología del modelo relacional

**Estado:** recuperado en conceptos básicos.

```text
Relación = tabla
Tupla = fila
Atributo = columna
Grado = cantidad de atributos
Cardinalidad = cantidad de tuplas
```

---

### E-013 — Construcción y Transición

**Estado:** recuperado.

```text
Construcción = desarrollo del producto completo.
Transición = beta, retroalimentación, correcciones, capacitación y puesta en marcha.
```

---

### E-014 — Estado y comportamiento

**Estado:** recuperado.

```text
Estado = valores actuales de los atributos.
Comportamiento = métodos u operaciones.
```

---

## Errores abiertos o nuevos

### E-017 — TDA sin interfaz/implementación

- **Tipo:** terminológico.
- **Error:** se definió como colección de datos y comportamiento, pero no se explicó la independencia de implementación.
- **Corrección:** un TDA define datos y operaciones mediante una interfaz, independientemente de su implementación.
- **Estado:** abierto.

---

### E-018 — Dinámica / tipo de elemento

- **Tipo:** conceptual.
- **Error:** se indicó que en una estructura dinámica puede variar el tipo.
- **Corrección:** puede variar la cantidad de elementos; el tipo depende de la definición de la estructura.
- **Estado:** corregido, pendiente de consolidación.

---

### E-019 — Dominio booleano para estado de OT

- **Tipo:** aplicación.
- **Error:** se propuso `{true, false}` para un estado multivaluado.
- **Corrección:** usar un conjunto de estados permitidos como `PENDIENTE`, `DESPACHADA`, `EN_EJECUCION`, etc.
- **Estado:** corregido.

---

### E-020 — Clave candidata incompleta

- **Tipo:** terminológico.
- **Error:** se definió como atributo que puede identificar, sin indicar minimalidad.
- **Corrección:** clave candidata = superclave mínima.
- **Estado:** abierto.

---

### E-021 — Cardinalidad sin valor concreto

- **Tipo:** atención a la consigna.
- **Error:** se escribió la definición, pero no `250`.
- **Corrección:** responder definición y valor solicitado.
- **Estado:** corregido.

---

### E-022 — Clave foránea como “clave de relación”

- **Tipo:** terminológico.
- **Error:** formulación demasiado general.
- **Corrección:** atributo o conjunto de atributos que referencia una clave de otra relación.
- **Estado:** parcialmente corregido.

---

### E-023 — Sobrecarga expresada como “agregar más parámetros”

- **Tipo:** terminológico.
- **Corrección:** misma operación con distinta cantidad o tipos de parámetros.
- **Estado:** abierto.
