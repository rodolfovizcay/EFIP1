# Errores y recuperaciones — Día 7
## Casos de uso + Herencia + DER

**Fecha:** 12/08/2026  
**Resultado global:** 8,3/10 — APROBADO

---

# 1. Recuperaciones consolidadas

## E-012 — Alcance del modelo de datos

**Estado anterior:** corregido.  
**Estado Día 7:** **consolidado**.

Evidencia:

- identificó `SECTOR`, `ORDEN_TRABAJO`, `OPERARIO` y `ASIGNACION_OT`;
- modeló relaciones 1:N y N:M;
- colocó FK y tabla asociativa;
- dejó de limitar la solución a una única tabla.

Regla vigente:

```text
Primero identificar entidades, relaciones y cardinalidades.
Después transformar el modelo conceptual en tablas.
```

---

## E-025 — PDU

**Estado anterior:** corregido.  
**Estado Día 7:** **consolidado**.

Evidencia sin apuntes:

```text
PDU = Protocol Data Unit
PDU = SDU + PCI
```

En la evaluación final volvió a expandir correctamente la sigla en inglés y mantuvo paquete/trama/bits sin confusión.

---

## E-030 — Constructor Java

**Estado anterior:** corregido.  
**Estado Día 7:** **consolidado**.

Evidencia:

- respondió “mismo nombre que la clase y sin devolución ni `void`”;
- corrigió `public void Operario(...)`;
- escribió constructores de superclase y subclases;
- ubicó `super(...)` como primera sentencia;
- no repitió el error histórico.

Regla:

```text
Constructor Java
= mismo nombre que la clase
+ sin tipo de retorno, ni siquiera void
```

---

## E-034 — Paquete frente a trama

**Estado anterior:** abierto.  
**Estado Día 7:** **consolidado**.

Evidencia:

```text
Red/Internet → paquete
Enlace/Acceso → trama
```

La respuesta fue correcta en la recuperación inicial y en la evaluación final.

---

## E-035 — Bits frente a bytes en Física

**Estado anterior:** abierto.  
**Estado Día 7:** **consolidado**.

Evidencia:

```text
Física transmite bits o señales.
```

No reapareció el error de “bytes” del Día 6.

---

# 2. Error previo que permanece abierto

## E-032 — Completo frente a verificable

**Estado:** **abierto**.

En la recuperación inicial se respondió correctamente:

```text
Completo
→ contiene toda la información necesaria.

Verificable
→ existe una forma objetiva de comprobarlo.
```

Pero en la evaluación final se escribió que completo significa que contiene información suficiente para ser “medible”, volviendo a mezclarlo con verificable.

Regla:

```text
Completo ≠ medible
Completo = información suficiente
Verificable = comprobable objetivamente
```

---

# 3. Nuevos errores del Día 7

## E-036 — Notación de generalización UML

- **Materia:** Análisis y Diseño.
- **Tema:** generalización de actores/casos.
- **Respuesta:** consideró incorrecto `Encargado --|> UsuarioSistema` porque incluía `|` y propuso una flecha común.
- **Corrección:** la generalización utiliza una línea continua con triángulo vacío apuntando al padre; `--|>` es una notación textual habitual para representarla.
- **Regla:**

```text
HIJO ─────▷ PADRE
```

- **Estado:** **abierto**.

Aunque la dirección hijo → padre está comprendida, falta automatizar la simbología.

---

## E-037 — Instancia confundida con cantidad

- **Materia:** Base de Datos.
- **Tema:** entidad e instancia.
- **Respuesta:** `Instancia = cantidad de objetos`.
- **Corrección:** una instancia es una ocurrencia concreta de una entidad.
- **Ejemplo:**

```text
Entidad: OPERARIO
Instancia: Operario 145 — Juan Pérez
```

- **Estado:** **abierto**.

---

## E-038 — Simbología de entidad débil y participación total

- **Materia:** Base de Datos.
- **Tema:** simbología DER.
- **Respuesta:** dejó sin completar `Rectángulo doble` y asoció `Línea doble` con entidad fuerte.
- **Corrección:**

```text
Rectángulo doble → entidad débil
Línea doble      → participación total
```

- **Estado:** **abierto**.

Este error ya había aparecido durante la práctica y volvió a manifestarse en la evaluación.

---

## E-039 — Entidad asociativa confundida con entidad débil

- **Materia:** Base de Datos.
- **Tema:** pasaje N:M.
- **Respuesta:** clasificó `ASIGNACION_OT` directamente como entidad débil.
- **Corrección:** `ASIGNACION_OT` materializa la relación N:M y almacena las FK y atributos propios de la asignación. No es débil automáticamente; la clasificación fuerte/débil exige analizar identificación y dependencia de existencia.
- **Regla:**

```text
Tabla asociativa
→ implementación relacional de N:M.

Entidad débil
→ depende de otra para identificarse o existir en el modelo.
```

- **Estado:** **abierto**.

---

# 4. Ajustes sin nuevo código

## Resultado de valor vs. persistencia

Un resultado de valor debe expresarse desde el actor:

```text
Obtener una OT creada y disponible para gestión.
```

No limitarlo a:

```text
Persistir un registro.
```

## Postcondiciones

La consigna pedía dos postcondiciones de éxito y una de fallo. Se entregó una de éxito y una de fallo.

## `toString()` omitido

La jerarquía Java fue correcta, pero faltó implementar el `toString()` exigido. Se mantiene dentro de **E-016 — sintaxis/completitud Java escrita**, sin crear un código nuevo.

## Relación N:M conceptual vs. tabla asociativa

La relación N:M pertenece al DER; la tabla asociativa es su implementación en el modelo relacional. La respuesta de recuperación fue parcial y debe volver a exigirse.

## `UNIQUE`

En el pasaje a tablas faltó declarar un ejemplo de unicidad, como `ORDEN_TRABAJO.numero UNIQUE`, si el dominio exige número no repetido.

---

# 5. Estado de temas del Día 7

| Tema | Estado al cierre |
|---|---|
| Actor/caso/límite | Aplicado |
| Resultado de valor | Comprendido/Aplicado con ajuste |
| `include` | Aplicado |
| `extend` | Aplicado |
| Generalización conceptual | Aplicado |
| Notación de generalización | Abierto |
| Precondiciones/flujos/postcondiciones | Aplicado con precisión pendiente |
| Herencia | Aplicado |
| `extends`, `this`, `super`, `static` | Aplicado |
| Constructor Java | Consolidado |
| Sobrecarga/sobrescritura | Consolidado/Aplicado |
| DER básico | Aplicado |
| Cardinalidad 1:N y N:M | Aplicado |
| Pasaje a tablas | Aplicado con ajustes |
| Entidad fuerte/débil | Comprendido; precisión pendiente |
| Simbología DER | Abierto |
| Tabla asociativa | Aplicada; clasificación pendiente |

---

# 6. Recuperación recomendada para Día 8

1. Dibujar y explicar la generalización UML.
2. Definir instancia con un ejemplo concreto.
3. Relacionar:
   - rectángulo doble → entidad débil;
   - línea doble → participación total.
4. Diferenciar entidad asociativa y débil.
5. Diferenciar relación N:M conceptual y tabla asociativa.
6. Definir completo/verificable sin usar “medible” para completo.
7. Agregar `toString()` en una clase Java breve.

---

# 7. Evidencia

- `EVALUACIONES/2026-08-12_RESPUESTAS-DIA-07.md`
- `EVALUACIONES/2026-08-12_RESULTADOS-DIA-07.md`
- interacción guiada completa del Día 7.
