# Respuestas modelo — Evaluación Día 13

**Uso:** corregir después de entregar la evaluación.
**No constituye evidencia del estudiante.**

---

# Parte A — Pruebas — 3 puntos

## 1. Conceptos — 0,75

- Verificación comprueba conformidad con la especificación; validación comprueba que el producto satisface la necesidad del usuario.
- Una técnica estática revisa artefactos sin ejecutar; una prueba dinámica ejecuta software con datos y observa comportamiento.
- El caso define qué probar, condiciones, entradas y resultado; el procedimiento define cómo ejecutarlo; el componente automatiza total o parcialmente uno o más procedimientos.

## 2. Caso de prueba — 1,00

Ejemplo válido:

```text
ID: CP-PRI-01
Objetivo: aceptar frontera inferior
Precondición: validador disponible
Entrada: 1
Esperado: prioridad aceptada
```

Ejemplo inválido:

```text
ID: CP-PRI-02
Objetivo: rechazar valor superior al dominio
Precondición: validador disponible
Entrada: 6
Esperado: IllegalArgumentException y objeto no creado/modificado
```

Procedimiento posible: preparar el validador, invocarlo con `6`, capturar la excepción y comprobar tipo/mensaje y ausencia de cambio de estado.

## 3. Niveles y enfoques — 0,75

1. Unidad: un método aislado.
2. Integración: colaboración entre componentes.
3. Sistema: flujo completo en el producto integrado.
4. Aceptación: confirma la necesidad con el usuario/cliente.

Caja negra usa especificación y comportamiento externo; caja blanca usa conocimiento de estructura, ramas y caminos internos.

## 4. Defecto — 0,50

Debe incluir ID, entorno/versión, precondiciones, pasos, datos, esperado, observado, evidencia, severidad/prioridad y estado. El fallo muestra una diferencia observable, pero varias causas internas podrían producirla; diagnosticar la causa requiere análisis adicional.

---

# Parte B — Inserción y Shellsort — 3 puntos

## 5. Inserción — 1,25

```text
inicio  [30, 10, 20, 50, 40]
i=1     [10, 30, 20, 50, 40]
i=2     [10, 20, 30, 50, 40]
i=3     [10, 20, 30, 50, 40]
i=4     [10, 20, 30, 40, 50]
```

Antes de cada `i`, `[0..i-1]` está ordenado. Mejor caso `O(n)` si ya está ordenado; peor `O(n²)` si requiere una cantidad cuadrática de comparaciones/desplazamientos.

## 6. Shellsort — 1,25

```text
inicio  [50, 40, 30, 20, 10, 0]
gap=3   [20, 10, 0, 50, 40, 30]
gap=1   [0, 10, 20, 30, 40, 50]
```

Con `gap=3` se ordenan por inserción los grupos de índices `(0,3)`, `(1,4)` y `(2,5)`. `gap=1` asegura la ordenación global y equivale a una inserción sobre el arreglo parcialmente ordenado.

## 7. Comparación — 0,50

Ambos pueden trabajar in-place con `O(1)` adicional. Inserción habitual es estable si desplaza solo valores estrictamente mayores; Shellsort habitualmente no lo es. El desempeño de Shellsort depende fuertemente de los gaps. No es correcto afirmar que siempre sea `O(n log n)`; hay que indicar la secuencia y el análisis correspondiente. El esquema académico de mitades se estudia con peor caso cuadrático.

---

# Parte C — SQL y transacciones — 3 puntos

## 8. JOIN — 0,75

```sql
SELECT t.id_trabajo,
       t.descripcion,
       s.nombre AS sector
FROM trabajo AS t
JOIN sector AS s ON s.id_sector = t.id_sector
ORDER BY t.id_trabajo;
```

Sin condición se genera un producto cartesiano: cada fila de una tabla se combina con cada fila de la otra.

## 9. Agregación — 1,00

```sql
SELECT s.id_sector,
       s.nombre,
       COUNT(*) AS pendientes
FROM sector AS s
JOIN trabajo AS t ON t.id_sector = s.id_sector
WHERE t.estado = 'PENDIENTE'
GROUP BY s.id_sector, s.nombre
HAVING COUNT(*) >= 2
ORDER BY pendientes DESC, s.nombre;
```

`WHERE` filtra filas, `GROUP BY` forma grupos y `HAVING` filtra grupos calculados.

## 10. Subconsulta — 0,50

```sql
SELECT id_trabajo, descripcion, prioridad
FROM trabajo
WHERE prioridad > (
    SELECT AVG(prioridad)
    FROM trabajo
)
ORDER BY prioridad DESC, id_trabajo;
```

## 11. Transacción y ACID — 0,75

```sql
BEGIN;

UPDATE trabajo
SET estado = 'ASIGNADO'
WHERE id_trabajo = 101;

SELECT *
FROM trabajo
WHERE id_trabajo = 101;

ROLLBACK;
```

Atomicidad: la unidad lógica se completa toda o no queda aplicada. Durabilidad: después de un `COMMIT` exitoso, los cambios persisten frente a fallas posteriores contempladas por el motor.

---

# Parte D — Decisión y seguridad — 1 punto

## 12. Motor — 0,50

Respuesta modelo:

```text
SQLite en el teléfono: embebido, local, sin servidor separado y apto para offline.
PostgreSQL en el servicio central: servidor relacional, concurrencia y capacidades avanzadas.
Criterios: ubicación, concurrencia, disponibilidad, operación, respaldo y costo.
Riesgo: indisponibilidad o pérdida del servidor central.
Mitigación: respaldo probado, monitoreo, redundancia y cola local de sincronización.
```

Otra elección obtiene puntaje si el contexto y los criterios la sostienen.

## 13. Encoding, hashing y cifrado — 0,50

- Base64: encoding reversible, sin secreto; representa datos.
- SHA-256: hashing, huella no reversible normalmente; integridad/comparación.
- AES: cifrado reversible con la clave adecuada; confidencialidad.

---

# Rúbrica resumida

| Parte | Máximo | Evidencia clave |
|---|---:|---|
| A | 3,00 | artefactos, casos, niveles y defecto |
| B | 3,00 | trazas y explicación de propiedades |
| C | 3,00 | SQL correcto y razonado |
| D | 1,00 | decisión contextual y conceptos precisos |

Errores que requieren recuperación:

- validación = verificación sin diferencia;
- caso = procedimiento;
- declarar ejecutado un caso no corrido;
- inserción sin prefijo ordenado o perdiendo la clave;
- Shellsort sin pasada `gap=1`;
- `WHERE COUNT(*)` en lugar de `HAVING`;
- `JOIN` sin condición;
- `ROLLBACK` entendido como confirmación;
- Base64 entendido como cifrado;
- SHA-256 entendido como reversible.
