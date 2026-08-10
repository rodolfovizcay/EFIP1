# Errores y recuperaciones — Estado al cierre del Día 2

## Recuperados o parcialmente recuperados

### E-001 — Arquitectura / documentación

**Estado:** corregido, pendiente de consolidación oral.

Corrección aceptada:

> La arquitectura contiene las decisiones significativas sobre organización, componentes, interfaces, subsistemas, base de datos, comunicaciones y plataforma. La documentación representa esas decisiones.

---

### E-003 — Estado / visibilidad

**Estado:** corregido.

Corrección aceptada:

```text
Estado = valores actuales de los atributos.
Visibilidad = quién puede acceder a un atributo o método.
```

---

### E-004 — Sobrecarga / sobrescritura

**Estado:** parcialmente corregido.

Recordatorio:

```text
Sobrecarga:
mismo nombre + parámetros diferentes.

Sobrescritura:
método heredado + misma signatura + nueva implementación.
```

Falta realizar ejemplos sin ayuda.

---

## Nuevos errores del Día 2

### E-013 — Construcción y transición

- **Tipo:** conceptual / memoria.
- **Error:** se intercambiaron ambas fases.
- **Corrección:**

```text
Construcción = producto completo.
Transición = beta, correcciones, formación y entrega.
```

- **Estado:** abierto.

---

### E-014 — Estado y comportamiento en defensa oral

- **Tipo:** terminológico.
- **Error:** se mencionaron acciones como si fueran parte del estado.
- **Corrección:**

```text
Estado:
estado = PENDIENTE
prioridad = ALTA

Comportamiento:
despachar()
cambiarPrioridad()
```

- **Estado:** abierto.

---

### E-015 — Identidad / ID

- **Tipo:** conceptual.
- **Error:** identidad se explicó solamente como el ID.
- **Corrección:** el ID puede representar la identidad persistente, pero identidad es la propiedad que diferencia un objeto de todos los demás.
- **Estado:** abierto.

---

### E-016 — Sintaxis Java escrita

- **Tipo:** sintaxis.
- **Errores detectados:**
  - palabras clave con mayúsculas;
  - uso de `function`;
  - constructor con nombre incorrecto;
  - `prioridad` declarada `int` y usada como cadena;
  - comillas simples para `String`;
  - `This` en vez de `this`;
  - `.equal` en vez de `.equals`;
  - faltantes de `;` y llaves.
- **Estado:** abierto.
- **Tratamiento:** bloques cortos de 15–20 minutos, no jornadas completas.
