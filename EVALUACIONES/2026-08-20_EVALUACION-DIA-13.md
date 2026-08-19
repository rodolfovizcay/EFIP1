# Evaluación — Día 13

**Fecha:** 20/08/2026
**Tiempo sugerido:** 60 minutos + 5 minutos de defensa oral
**Puntaje total:** 10 puntos
**Regla:** resolver sin consultar la respuesta modelo.

---

# Parte A — Pruebas — 3 puntos

## 1. Conceptos — 0,75

Diferenciá:

- verificación y validación;
- prueba estática y prueba dinámica;
- caso, procedimiento y componente de prueba.

## 2. Caso de prueba — 1,00

Para la regla `prioridad entre 1 y 5`, diseñá un caso válido de frontera y uno inválido. Indicá ID, objetivo, precondición, entrada y resultado esperado. Después describí un procedimiento breve para ejecutar uno de ellos.

## 3. Niveles y enfoques — 0,75

Clasificá y justificá:

1. probar `validarPrioridad(6)`;
2. probar la colaboración entre servicio y repositorio;
3. probar registrar sin conexión, reiniciar y recuperar;
4. comprobar con el operario que el flujo resuelve su necesidad.

Luego diferenciá caja negra y caja blanca.

## 4. Defecto — 0,50

¿Qué debe contener un defecto reproducible y por qué una prueba fallida no identifica automáticamente la causa técnica?

---

# Parte B — Inserción y Shellsort — 3 puntos

## 5. Inserción — 1,25

Ordená por inserción y mostrá el arreglo después de cada `i`:

```text
30, 10, 20, 50, 40
```

Explicá el invariante del tramo izquierdo y las complejidades de mejor y peor caso.

## 6. Shellsort — 1,25

Aplicá Shellsort con `gap = 3` y luego `gap = 1`:

```text
50, 40, 30, 20, 10, 0
```

Mostrá el arreglo después de cada pasada completa y explicá por qué se termina con `gap = 1`.

## 7. Comparación — 0,50

Compará estabilidad, memoria y dependencia de los incrementos. ¿Es correcto afirmar que Shellsort siempre es `O(n log n)`?

---

# Parte C — SQL y transacciones — 3 puntos

Usá:

```text
SECTOR(id_sector, nombre)
TRABAJO(id_trabajo, id_sector, descripcion, prioridad, estado)
```

## 8. JOIN — 0,75

Escribí una consulta que muestre id, descripción y nombre del sector de cada trabajo. Explicá qué ocurriría si se combinan ambas tablas sin condición de reunión.

## 9. Agregación — 1,00

Mostrá por sector la cantidad de trabajos `PENDIENTE`, únicamente para sectores con dos o más, ordenando primero por cantidad descendente y luego por nombre. Explicá `WHERE`, `GROUP BY` y `HAVING`.

## 10. Subconsulta — 0,50

Mostrá los trabajos cuya prioridad sea superior al promedio global, ordenados por prioridad descendente e id.

## 11. Transacción y ACID — 0,75

Escribí una transacción que cambie únicamente el trabajo `101` a `ASIGNADO`, lo verifique y luego deshaga el cambio. Definí atomicidad y durabilidad.

---

# Parte D — Decisión y seguridad conceptual — 1 punto

## 12. Motor — 0,50

Elegí y justificá un motor para el almacenamiento local del teléfono y otro para el servicio central. Usá al menos tres criterios y mencioná un riesgo.

## 13. Encoding, hashing y cifrado — 0,50

Diferenciá finalidad y reversibilidad. Clasificá `Base64`, `SHA-256` y `AES`.

---

# Defensa oral integradora

En cinco minutos explicá:

```text
requisito de prioridad
→ caso de prueba
→ ordenación local
→ JOIN/agregación central
→ transacción ACID
→ decisión SQLite/PostgreSQL
```

La defensa sirve para confirmar comprensión; el puntaje escrito ya suma 10.

---

# Criterio de aprobación sugerido

```text
Total mínimo: 6,0/10
Condición adicional: ninguna parte A, B o C completamente en cero
```

La nota se registra únicamente después de corregir respuestas reales.
