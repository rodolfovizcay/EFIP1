# Día 13 — Pruebas, inserción/Shellsort y SQL avanzado

**Fecha:** 20/08/2026
**Duración núcleo:** 5,5 horas
**Estado:** **PREPARADO — NO INICIADO**

---

# 1. Propósito

La jornada une tres controles de calidad:

```text
¿el software cumple lo esperado?       → pruebas
¿los datos quedan en el orden buscado? → algoritmos de ordenación
¿la consulta obtiene el conjunto justo?→ SQL avanzado
```

El hilo integrador será SIGO: trabajos con prioridad, pruebas del dominio y consultas del servicio central.

---

# 2. Resultados verificables

Al finalizar se espera evidencia propia de que el estudiante puede:

- construir un caso y un procedimiento de prueba;
- distinguir unidad, integración, sistema y aceptación;
- diseñar entradas válidas, inválidas y de frontera;
- ordenar manualmente un vector por inserción y por Shellsort;
- justificar las operaciones y complejidades sin memorizar solo el código;
- escribir y explicar `JOIN`, subconsulta, agregación, `GROUP BY`, `HAVING` y `ORDER BY`;
- explicar `COMMIT`, `ROLLBACK` y ACID;
- elegir un motor según el contexto;
- integrar prueba, algoritmo y consulta en una defensa breve.

---

# 3. Cronograma ampliado

| Bloque | Duración | Núcleo | Producto |
|---|---:|---|---|
| Recuperación inicial | 20–25 min | brechas del Día 12 | 12 respuestas |
| Mañana M1 | 90 min | modelo de pruebas | modelo + casos |
| Pausa | 10–15 min | descanso | — |
| Mañana M2 | 90 min | inserción y Shellsort | trazas manuales |
| Cierre de mañana | 30 min | serie ordenada y comparación | defensa de algoritmo |
| Pausa larga | 45–60 min | descanso | — |
| Tarde T1 | 90 min | SQL avanzado, TCL y ACID | consultas explicadas |
| Tarde T2 | 60 min | motor + seguridad conceptual | decisión oral |
| Evaluación | 55–65 min | integración | evidencia final |

Si el tiempo se reduce, conservar M1, M2, `JOIN/GROUP BY/HAVING`, transacción y evaluación. Nada se marca como estudiado por haber sido preparado.

---

# 4. Recuperación inicial

Usar `TARJETAS/2026-08-20_RECUPERACION-INICIAL-DIA-13.md`.

Reglas:

1. responder sin apuntes;
2. corregir con la clave al terminar;
3. registrar solo errores observados;
4. recuperar E-063 y E-065 aunque el puntaje global permita avanzar.

---

# 5. Mañana M1 — Modelo de pruebas

## 5.1 Verificación y validación

```text
verificación → ¿construimos el producto de acuerdo con la especificación?
validación   → ¿construimos el producto que el usuario necesita?
```

Las inspecciones son estáticas: revisan requisitos, diseño o código sin ejecutar el sistema. Las pruebas son dinámicas: ejecutan una implementación y comparan comportamiento real con el esperado.

## 5.2 Artefactos

| Artefacto | Pregunta principal |
|---|---|
| modelo de pruebas | ¿cómo se probarán las construcciones ejecutables? |
| plan de prueba | ¿qué estrategia, recursos, tiempos y cobertura se usarán? |
| caso de prueba | ¿qué se prueba, con qué entradas, condiciones y resultado esperado? |
| procedimiento | ¿cómo se ejecuta uno o más casos, paso a paso? |
| componente de prueba | ¿qué software automatiza el procedimiento? |
| defecto | ¿qué anomalía debe registrarse, controlar y resolver? |
| evaluación | ¿qué indican resultados, cobertura y estado de defectos? |

Regla mental:

```text
caso = qué probar
procedimiento = cómo probar
componente = automatización
```

## 5.3 Niveles

| Nivel | Objeto principal | Ejemplo SIGO |
|---|---|---|
| unidad | método o clase aislada | validar prioridad 1..5 |
| integración | colaboración entre unidades | servicio usa repositorio |
| sistema | producto integrado | registrar, guardar y sincronizar |
| aceptación | necesidad del cliente en entorno acordado | operario registra sin conexión |

## 5.4 Caja negra y caja blanca

- Caja negra: observa entradas y salidas según la especificación, sin basarse en la estructura interna.
- Caja blanca: diseña recorridos usando conocimiento de decisiones, caminos y estructura interna.

Para `prioridad` válida de 1 a 5:

```text
válida:   1, 3, 5
inválida: 0, 6
fronteras: 0/1 y 5/6
```

## 5.5 Actividad M1

Construir tres casos para `registrarTrabajo`:

1. registro válido;
2. prioridad fuera del dominio;
3. descripción vacía.

Cada caso debe tener identificador, objetivo, precondición, datos, resultado esperado y estado. Luego escribir un procedimiento paso a paso para el primer caso y decidir qué parte podría automatizarse.

Ficha: `FICHAS/2026-08-20_FICHA-MODELO-PRUEBAS.md`.

---

# 6. Mañana M2 — Inserción y Shellsort

## 6.1 Inserción

Invariante principal:

```text
antes de procesar la posición i,
el tramo [0 .. i-1] ya está ordenado
```

Para cada elemento clave:

1. guardar la clave;
2. comparar hacia la izquierda;
3. desplazar a la derecha los valores mayores;
4. insertar la clave en el hueco.

Ejemplo:

```text
[30, 10, 20, 50, 40]
i=1 → [10, 30, 20, 50, 40]
i=2 → [10, 20, 30, 50, 40]
i=3 → [10, 20, 30, 50, 40]
i=4 → [10, 20, 30, 40, 50]
```

Propiedades para el algoritmo directo habitual:

- mejor caso `O(n)` si ya está ordenado;
- promedio y peor caso `O(n²)`;
- espacio adicional `O(1)`;
- estable si solo desplaza cuando el anterior es estrictamente mayor.

## 6.2 Shellsort

Shellsort aplica inserción entre elementos separados por una distancia `gap`.

```text
gap inicial = n/2
gap siguiente = gap/2
...
gap final = 1
```

Las pasadas grandes acercan rápidamente elementos lejanos a su zona. La pasada con `gap = 1` es una inserción sobre un arreglo ya parcialmente ordenado.

Precisión:

> El tiempo de Shellsort depende de la secuencia de incrementos. En el esquema académico de mitades se estudia peor caso cuadrático; no debe afirmarse una única complejidad para todas las secuencias.

## 6.3 Actividad M2

Ordenar manualmente:

```text
30, 10, 20, 50, 40, 20
```

- por inserción: mostrar el arreglo luego de cada `i`;
- por Shellsort: usar `gap = 3`, `1` y mostrar cada pasada;
- explicar cuál conserva el orden relativo de los dos valores `20` si se los etiqueta `20a` y `20b`.

Apoyo:

- `FICHAS/2026-08-20_FICHA-INSERCION-SHELLSORT.md`;
- `CODIGO/2026-08-20_ORDENACION-JAVA.md`;
- `CODIGO/DemoDia13.java`.

---

# 7. Cierre de mañana

Sin mirar el código, responder:

1. ¿qué tramo garantiza inserción que ya está ordenado?
2. ¿por qué desplaza y no intercambia necesariamente en cada comparación?
3. ¿qué representa `gap`?
4. ¿por qué Shellsort siempre necesita llegar a `gap = 1` en este esquema?
5. ¿qué costo depende fuertemente de la secuencia de incrementos?

Umbral: `4/5`. Con menos, repetir una traza pequeña antes de SQL.

---

# 8. Tarde T1 — SQL avanzado

Esquema de trabajo:

```text
SECTOR(id_sector, nombre)
TRABAJO(id_trabajo, id_sector, descripcion, prioridad, estado)
```

## 8.1 JOIN

```sql
SELECT t.id_trabajo, t.descripcion, s.nombre AS sector
FROM trabajo AS t
JOIN sector AS s ON s.id_sector = t.id_sector;
```

`JOIN ... ON` expresa la condición de reunión. Omitirla puede producir un producto cartesiano.

## 8.2 Funciones de grupo

```sql
SELECT t.id_sector, COUNT(*) AS cantidad
FROM trabajo AS t
WHERE t.estado = 'PENDIENTE'
GROUP BY t.id_sector
HAVING COUNT(*) >= 2
ORDER BY cantidad DESC, t.id_sector;
```

Orden lógico conceptual:

```text
FROM/JOIN → WHERE → GROUP BY → HAVING → SELECT → ORDER BY
```

- `WHERE` filtra filas antes de agrupar.
- `HAVING` filtra grupos después de agrupar.
- Toda columna no agregada del `SELECT` debe aparecer en `GROUP BY` en esta práctica.

## 8.3 Subconsulta

```sql
SELECT id_trabajo, descripcion, prioridad
FROM trabajo
WHERE prioridad > (SELECT AVG(prioridad) FROM trabajo)
ORDER BY prioridad DESC, id_trabajo;
```

La subconsulta escalar devuelve un valor: el promedio usado por la consulta externa.

## 8.4 TCL y ACID

```sql
BEGIN;
UPDATE trabajo
SET estado = 'ASIGNADO'
WHERE id_trabajo = 101;
-- verificar
ROLLBACK;
```

`COMMIT` confirma; `ROLLBACK` deshace la transacción no confirmada.

```text
Atomicidad   → todo o nada
Consistencia → conserva reglas e integridad
Aislamiento  → concurrencia sin interferencias indebidas
Durabilidad  → lo confirmado persiste
```

## 8.5 Actividad SQL

Resolver `BASE-DATOS/2026-08-20_PRACTICA-SQL-DIA-13.sql` explicando cada cláusula. No alcanza con copiar la salida modelo.

---

# 9. Tarde T2 — Motor y seguridad conceptual

## 9.1 Elección del motor

| Motor | Escenario orientativo |
|---|---|
| Oracle | soluciones empresariales con altas exigencias y soporte comercial |
| MySQL | aplicaciones web y ecosistema ampliamente difundido |
| SQLite | almacenamiento embebido/local, móvil o aplicación pequeña |
| PostgreSQL | servidor relacional de código abierto con capacidades avanzadas |

La elección requiere criterios: ubicación, concurrencia, disponibilidad, operación, licencia/costo, compatibilidad, escalabilidad y respaldo. No existe un motor universalmente mejor.

## 9.2 Encoding, hashing y cifrado

| Concepto | Finalidad | ¿Reversible? | Ejemplo |
|---|---|---|---|
| encoding | representar datos en otro formato | sí, mediante decodificación | Base64 |
| hashing | obtener una huella para comparación/integridad | no en el sentido normal | SHA-256 |
| cifrado | preservar confidencialidad usando una clave | sí, con clave autorizada | AES |

Base64 no cifra. SHA-256 solo no es un esquema adecuado para almacenar contraseñas: para eso se emplean funciones específicas con sal y costo, como Argon2, scrypt o bcrypt.

Ficha: `FICHAS/2026-08-20_FICHA-MOTORES-ACID-SEGURIDAD.md`.

---

# 10. Caso integrador y evaluación

1. Resolver `CASOS/2026-08-20_CASO-INTEGRADOR-PRUEBAS-ORDENACION-SQL.md`.
2. Realizar `EVALUACIONES/2026-08-20_EVALUACION-DIA-13.md` sin la respuesta modelo.
3. Corregir con `EVALUACIONES/2026-08-20_RESPUESTAS-DIA-13.md`.
4. Completar `RESUMENES/2026-08-20_CIERRE-DIA-13.md` con evidencia real.

---

# 11. Criterio de cierre

```text
total mínimo: 6,0/10
condición: ninguna parte A, B o C completamente en cero
defensa oral: debe conectar prueba, ordenación y consulta
```

Solo después de corregir respuestas reales se actualizan estado, matriz, registro, errores y manifiesto de cierre.
