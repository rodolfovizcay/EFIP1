# Caso integrador — Calidad y consulta de trabajos SIGO

**Fecha:** 20/08/2026
**Estado:** actividad preparada

---

# Contexto

SIGO permite que un operario registre trabajos sin conexión. Cada trabajo tiene:

```text
id, descripcion, prioridad, estado, sector
```

Reglas:

- `id` debe ser positivo y único;
- `descripcion` es obligatoria y tiene hasta 120 caracteres;
- `prioridad` debe estar entre 1 y 5;
- el trabajo nuevo comienza `PENDIENTE`;
- el sector debe existir;
- los datos locales se sincronizan con el servidor al recuperar conexión;
- no puede confirmarse una sincronización parcial como completa.

Datos centrales:

```text
SECTOR(id_sector, nombre)
TRABAJO(id_trabajo, id_sector, descripcion, prioridad, estado)
```

---

# Parte A — Modelo de pruebas

## A1. Trazabilidad

Completar:

| Requisito | Diseño responsable | Componente | Nivel de prueba | Caso |
|---|---|---|---|---|
| prioridad 1..5 | | | | |
| guardar sin conexión | | | | |
| sincronizar sin duplicar | | | | |

## A2. Casos

Diseñar:

1. un caso válido de frontera con prioridad `1`;
2. un caso inválido con prioridad `6`;
3. un caso con descripción vacía;
4. un caso de sistema: registrar sin red, reiniciar y recuperar;
5. un caso de integración: servicio y repositorio local.

Para cada uno indicar:

```text
ID
objetivo
precondición
datos
resultado esperado
nivel/técnica
```

## A3. Defecto

Supongamos que el trabajo registrado sin red desaparece luego de reiniciar la app. Redactar un defecto reproducible y diferenciar:

```text
caso fallido
defecto registrado
causa técnica todavía desconocida
```

---

# Parte B — Ordenación

Trabajos recibidos en este orden:

| Etiqueta | ID | Prioridad |
|---|---:|---:|
| A | 104 | 3 |
| B | 101 | 1 |
| C | 103 | 2 |
| D | 105 | 3 |
| E | 102 | 2 |

## B1. Inserción

Ordenar por prioridad ascendente y mostrar el arreglo luego de cada inserción.

Responder:

- ¿qué tramo está ordenado antes de cada vuelta?;
- ¿qué ocurre con A y D, que tienen la misma prioridad?;
- ¿cuántos desplazamientos se hacen en la última vuelta?

## B2. Shellsort

Aplicar `gap = 2` y luego `gap = 1`. Mostrar el arreglo después de cada pasada completa.

Responder:

- ¿qué posiciones compara el primer gap?;
- ¿por qué la última pasada sigue siendo necesaria?;
- ¿puede prometerse estabilidad?

## B3. Elección

Elegir un algoritmo para:

1. ocho trabajos casi ordenados;
2. una entrada moderada desordenada;
3. el código productivo cuando existe una biblioteca estándar probada.

Justificar con datos, estabilidad, complejidad y mantenibilidad.

---

# Parte C — SQL

Escribir:

1. `JOIN` para mostrar trabajo, descripción y nombre de sector;
2. `LEFT JOIN` para contar trabajos por sector, incluidos sectores con cero;
3. cantidad de trabajos `PENDIENTE` por sector, mostrando solo sectores con dos o más;
4. trabajos con prioridad superior al promedio;
5. sectores que tengan al menos un trabajo pendiente mediante `EXISTS`;
6. una transacción que cambie el trabajo `101` a `ASIGNADO`, verifique el resultado y permita decidir entre `COMMIT` y `ROLLBACK`.

Explicar:

- por qué la condición `ON` es necesaria;
- diferencia `WHERE`/`HAVING`;
- por qué `COUNT(t.id_trabajo)` es útil con `LEFT JOIN`;
- qué propiedades ACID importan si se cambia el estado y se agrega historial.

---

# Parte D — Decisión e integración

Proponer una arquitectura de datos para:

```text
teléfono sin conexión
↕ sincronización
servicio central multiusuario
```

Comparar SQLite y PostgreSQL en sus roles, indicar la interfaz que desacopla la lógica y completar:

```text
necesidad
→ decisión
→ justificación
→ consecuencia negativa segura
→ riesgo
→ mitigación
→ RNF relacionado
```

Finalmente explicar si usarías Base64, SHA-256 o AES para:

1. transportar bytes en un campo textual;
2. comprobar una huella de integridad;
3. proteger información confidencial reversible.

---

# Criterio de completitud

El caso está completo cuando existe una cadena defendible:

```text
regla de negocio
→ caso de prueba
→ algoritmo sobre prioridades
→ consulta SQL
→ transacción
→ decisión de motor y protección de datos
```
