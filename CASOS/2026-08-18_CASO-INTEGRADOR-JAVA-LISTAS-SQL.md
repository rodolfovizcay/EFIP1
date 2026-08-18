# Caso integrador — Java + Listas avanzadas + SQL

**Fecha:** 18/08/2026  
**Caso:** Agenda de trabajos pendientes de SIGO

---

# Escenario

El dispositivo del encargado mantiene temporalmente trabajos pendientes. Cada trabajo posee identificador, descripción, prioridad, estado y sector.

Requisitos:

- no admitir identificadores repetidos;
- rechazar descripciones vacías;
- buscar un trabajo y avisar si no existe;
- recorrer y eliminar trabajos de forma segura;
- mantener una vista ordenada por prioridad;
- guardar los trabajos confirmados en una base relacional;
- permitir consultas y cambios de estado controlados.

---

# Parte A — Java

1. Elegí arreglo o `ArrayList` y justificá.
2. Definí la igualdad de `TrabajoPendiente`.
3. Explicá por qué `equals` y `hashCode` deben usar el mismo identificador.
4. Indicá una validación que lance una excepción unchecked.
5. Diseñá una excepción checked para búsqueda fallida.
6. Ubicá `try`, `catch`, `finally`, `throw` y `throws`.

---

# Parte B — Estructuras

Para cada necesidad elegí una variante:

| Necesidad | Simple | Doble | Circular | Ordenada |
|---|:---:|:---:|:---:|:---:|
| recorrer pendientes hacia atrás | | | | |
| rotar guardias continuamente | | | | |
| conservar prioridad al insertar | | | | |
| guardar con mínimo de enlaces | | | | |

Después:

1. dibujá una inserción en lista doble;
2. indicá la condición de fin circular;
3. insertá prioridades `3, 1, 2, 2` en orden;
4. explicá qué aporta un iterador.

---

# Parte C — SQL

Modelo mínimo:

```text
SECTOR(id_sector PK, nombre UNIQUE)
TRABAJO(id_trabajo PK, id_sector FK, descripcion, prioridad, estado)
```

Escribí:

1. `CREATE TABLE` para `TRABAJO`;
2. un `INSERT` válido;
3. un `SELECT` de pendientes;
4. un `UPDATE` de un único trabajo;
5. un `DELETE` de un único trabajo;
6. una explicación del riesgo de omitir `WHERE`.

---

# Parte D — Integración

Explicá el flujo:

```text
captura Java
→ validación
→ colección local
→ búsqueda/modificación
→ sincronización
→ INSERT/UPDATE en servidor
```

Indicá:

- dónde puede aparecer una excepción;
- qué estructura conviene para cada vista;
- qué restricciones debe garantizar la base;
- qué prueba evita duplicados.

---

# Evidencia requerida

- decisiones justificadas, no solo nombres;
- al menos una simulación de enlaces;
- código Java legible;
- SQL con columnas y condiciones explícitas;
- diferencia clara entre validación de aplicación y restricción de base.
