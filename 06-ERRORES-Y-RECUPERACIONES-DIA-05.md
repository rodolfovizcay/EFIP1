# Errores y recuperaciones — Estado al cierre del Día 5

**Fecha:** 10/08/2026

## Recuperaciones confirmadas

### E-001 — Arquitectura / documentación

**Estado:** consolidado en el alcance trabajado.

Evidencia:

- arquitectura explicada como decisiones significativas del sistema;
- documentación explicada como representación de esas decisiones;
- aplicación sobre `Programar Orden de Trabajo`;
- defensa oral aprobada.

---

### E-003 / E-014 — Estado / visibilidad / comportamiento

**Estado:** consolidado.

```text
Estado = valores actuales de los atributos.
Comportamiento = métodos/operaciones.
Visibilidad = quién puede acceder.
```

---

### E-004 / E-023 — Sobrecarga / sobrescritura

**Estado:** recuperado.

```text
Sobrecarga = mismo nombre + distinta lista de parámetros.
Sobrescritura = método heredado + nueva implementación compatible.
```

Se respondieron correctamente ejemplos de ambos mecanismos.

---

### E-007 — Terminología del modelo relacional

**Estado:** consolidado en el núcleo básico.

```text
Relación = tabla
Tupla = fila
Atributo = columna
Grado = cantidad de atributos
Cardinalidad = cantidad de tuplas
Dominio = conjunto de valores permitidos
```

---

### E-010 — Síncrona / asíncrona

**Estado:** corregido, pendiente de consolidación espaciada.

Durante la recuperación inicial del Día 5 volvió a confundirse con retransmisión/tolerancia a fallos. Después se respondió correctamente:

```text
Asíncrona = carácter + start/stop
Síncrona = bloque + cabecera/terminación
```

No marcar como consolidado hasta recuperarlo en otra jornada sin ayuda.

---

### E-013 — Construcción / Transición

**Estado:** consolidado.

```text
Construcción = producto completo preparado para entrega.
Transición = beta, retroalimentación, correcciones, capacitación y asistencia.
```

---

### E-015 — Identidad / ID

**Estado:** recuperado y defendido.

La identidad distingue a un objeto de todos los demás aun cuando compartan estado y comportamiento. Un ID puede representar esa identidad de forma persistente, pero no es la definición de identidad.

---

### E-017 — TDA sin interfaz/implementación

**Estado:** corregido, pendiente de consolidación.

Primera respuesta del Día 5:

> conjunto de datos u objetos con comportamiento definido, abstrayéndose de la implementación.

Falta que aparezca espontáneamente:

```text
TDA = datos/objetos + operaciones + interfaz independiente de implementación
```

---

### E-020 — Clave candidata incompleta

**Estado:** recuperado y defendido.

```text
Clave candidata = superclave mínima.
```

También se comprendió que una relación puede tener varias candidatas y elegir una como primaria no elimina el carácter candidato de las otras.

---

### E-021 — Cardinalidad sin valor concreto

**Estado:** consolidado.

En los ejercicios del Día 5 se respondió definición + valor concreto.

---

### E-022 — Clave foránea

**Estado:** recuperado y defendido.

Se corrigió la idea inicial de que una FK no debería repetirse.

```text
SECTOR 1:N ORDEN_TRABAJO
ORDEN_TRABAJO.id_sector = FK
```

La repetición de `id_sector` en múltiples OT es válida y esperable del lado N.

---

### E-025 — PDU

**Estado:** corregido, pendiente de consolidación espaciada.

Durante el Día 5 hubo dos respuestas incorrectas sucesivas:

1. PDU confundida con PUD.
2. PDU expandida incorrectamente como “Protocolo de Datos Unificado”.

Respuesta final:

```text
PDU = Unidad de Datos de Protocolo
PDU = datos + información de control del protocolo
```

Debe volver a recuperarse en una jornada posterior.

---

### E-027 — Puerto

**Estado:** recuperado.

```text
Puerto = identificador de proceso/servicio de transporte dentro de un host.
```

---

## Nuevos errores del Día 5

### E-030 — Constructor Java escrito como método

- **Materia:** POO / Java.
- **Tipo:** sintaxis.
- **Respuesta:** `public void contrictor(...)`.
- **Corrección:** el constructor tiene exactamente el nombre de la clase y no declara tipo de retorno.
- **Regla:**

```java
public OrdenTrabajo(...) { ... }
```

- **Estado:** corregido; pendiente de comprobar retención.

---

### E-031 — Fases, flujos, ciclo e incremento

- **Materia:** Análisis y Diseño.
- **Tipo:** terminológico/conceptual.
- **Situaciones detectadas:**
  - ubicar Requisitos/Análisis/Diseño/Implementación/Prueba como si fueran fases;
  - afirmar que al finalizar Transición se obtiene un incremento.
- **Corrección:**

```text
Fases = Inicio → Elaboración → Construcción → Transición
Flujos = Requisitos, Análisis, Diseño, Implementación, Prueba
Iteración → incremento
Ciclo completo → nueva versión
```

- **Estado:** corregido; pendiente de recuperación espaciada.

---

## Ajustes sin nuevo código

### Dominio — valores observados vs. permitidos

En el primer ejercicio se respondió `PENDIENTE, DESPACHADA` como dominio porque eran los valores presentes en las filas. Se corrigió:

```text
Dominio = conjunto total de valores permitidos para un atributo.
```

### Superclave — uno o más atributos

En la defensa oral se formuló inicialmente como combinación de atributos. Se corrigió que una superclave puede estar formada por **uno o más** atributos.

### RNF vs. arquitectura

Un RNF, por ejemplo `menos de 20 segundos`, condiciona la arquitectura, pero no es por sí mismo una decisión arquitectónica. La decisión puede ser, por ejemplo, ejecutar el procesamiento masivo cerca de los datos para satisfacer ese RNF.

---

## Recuperación recomendada para Día 6

1. Escribir un constructor Java correcto sin mirar.
2. Definir TDA incluyendo `interfaz`.
3. Responder `PDU = datos + información de control`.
4. Comparar síncrona/asíncrona sin mencionar retransmisión.
5. Diferenciar fases y flujos del PUD.
