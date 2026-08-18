# Día 11 — Java complementario + Listas avanzadas + SQL

**Fecha:** 18/08/2026  
**Duración núcleo:** 5,5 horas  
**Estado:** preparado, no iniciado

---

# 1. Objetivos

- completar fundamentos prácticos de Java;
- diferenciar arreglo y `ArrayList`;
- aplicar `equals`, `hashCode` y `toString`;
- manejar excepciones y comprender su propagación;
- reconocer los cinco principios SOLID sin convertirlos en un bloque avanzado;
- comparar listas doble, circular y ordenada;
- utilizar iteradores para recorrer colecciones;
- clasificar y escribir sentencias SQL básicas;
- evitar `UPDATE` y `DELETE` sin `WHERE`;
- integrar los tres bloques en un caso SIGO.

---

# 2. Trazabilidad

## Respaldado directamente

- Java, objetos, `String`, `equals`, `hashCode`, `toString`, excepciones y `try/catch`;
- `ArrayList`, `Iterator`, `hasNext()` y `next()`;
- listas doblemente enlazadas, circulares y ordenadas;
- SQL no procedimental, DDL, DML, `SELECT`, `FROM`, `WHERE`, `INSERT`, `UPDATE` y `DELETE`.

## Ampliación complementaria

- JVM y portabilidad como defensa conceptual del plan;
- checked frente a unchecked;
- explicación completa de `finally`, `throw` y `throws`;
- SRP, OCP, LSP, ISP y DIP.

## Vista previa contextual

`BEGIN`, `ROLLBACK` y `COMMIT` aparecen únicamente para practicar con seguridad. El bloque formal de TCL permanece pendiente.

---

# 3. Cronograma

| Bloque | Duración | Núcleo | Producto |
|---|---:|---|---|
| Recuperación inicial | 20–25 min | errores del Día 10 y prerrequisitos | 12 respuestas |
| Mañana M1 | 90 min | Java complementario | código razonado |
| Pausa | 10–15 min | descanso | — |
| Mañana M2 | 90 min | listas avanzadas e iteradores | simulaciones |
| Cierre de mañana | 25–30 min | comparación de variantes | cuadro de decisión |
| Pausa larga | 45–60 min | descanso | — |
| Tarde T1 | 90 min | DDL/DML y SQL básico | consultas escritas |
| Tarde T2 | 60 min | Java, SQL, SOLID y evaluación | evidencia final |

Si el tiempo real se acorta, conservar M1, M2 y T1. El caso completo y la defensa SOLID pueden pasar al cierre sin declarar dominio.

---

# 4. Recuperación inicial

Usar `TARJETAS/2026-08-18_RECUPERACION-INICIAL-DIA-11.md` sin apuntes.

---

# 5. Mañana M1 — Java complementario

## Secuencia

1. arreglo frente a `ArrayList`;
2. `String`, `==` y `equals()`;
3. contrato `equals/hashCode`;
4. JVM y portabilidad;
5. excepción checked frente a unchecked;
6. `try/catch/finally/throw/throws`;
7. lectura y ejecución de `DemoDia11`.

## Actividades

- predecir la salida antes de ejecutar;
- marcar dónde se crea y dónde se captura cada excepción;
- explicar por qué el constructor lanza `IllegalArgumentException`;
- justificar por qué `buscar()` declara `throws`;
- explicar por qué `equals` y `hashCode` usan el mismo identificador;
- modificar un trabajo mediante la instancia recuperada.

## Evidencia mínima

```text
ArrayList:
== frente a equals:
regla equals/hashCode:
checked:
unchecked:
throw:
throws:
finally:
JVM:
```

---

# 6. Mañana M2 — Listas avanzadas

## Lista doble

Cada nodo conoce al anterior y al siguiente. Permite recorrer en ambas direcciones, pero cada inserción o eliminación debe mantener dos sentidos.

## Lista circular

El último nodo enlaza con el primero. El recorrido no puede esperar `null`: termina cuando vuelve al nodo inicial.

## Lista ordenada

La posición se decide comparando claves durante la inserción. No se agrega primero para ordenar después.

## Iterador

Abstrae el recorrido mediante `hasNext()` y `next()`. En Java, `Iterator.remove()` permite eliminar de forma controlada el último elemento devuelto.

## Simulaciones obligatorias

1. insertar `10`, `20`, `30` en una lista doble y recorrer hacia atrás;
2. insertar tres valores en una circular y mostrar exactamente una vuelta;
3. insertar `30`, `10`, `20`, `20` en una ordenada;
4. explicar qué referencias cambian en cada operación;
5. detectar por qué `while (actual != null)` no sirve para una circular no vacía.

---

# 7. Cierre de mañana

Completar:

| Necesidad | Variante elegida | Justificación | Riesgo |
|---|---|---|---|
| recorrer hacia atrás | | | |
| turnos repetitivos | | | |
| mantener prioridades ordenadas | | | |
| colección general de Java | | | |

---

# 8. Tarde T1 — SQL

## Secuencia

1. SQL como lenguaje declarativo/no procedimental;
2. DDL frente a DML;
3. `SELECT`, `FROM` y `WHERE`;
4. `INSERT`;
5. `UPDATE` con condición;
6. `DELETE` con condición;
7. transacción temporal de práctica;
8. ejercicio opcional con `JOIN`, `GROUP BY` y `ORDER BY` como repaso.

## Regla de seguridad

> Antes de ejecutar un `UPDATE` o `DELETE`, escribir un `SELECT` con el mismo `WHERE` y verificar las filas objetivo.

## Evidencia mínima

- clasificar ocho sentencias;
- escribir dos consultas;
- escribir un `INSERT`;
- escribir un `UPDATE` seguro;
- escribir un `DELETE` seguro;
- explicar qué ocurre al omitir `WHERE`.

---

# 9. Tarde T2 — Integración y evaluación

```text
20 min → Java escrito
20 min → SQL en papel
15 min → SOLID oral básico
5 min  → cierre
```

Si se aplica la evaluación completa, reservar 55–60 minutos adicionales o reemplazar este bloque por la evaluación.

---

# 10. Criterios de cierre

Para cerrar el día debe existir evidencia propia de:

- arreglo frente a `ArrayList`;
- `==`, `equals`, `hashCode` y `toString`;
- checked/unchecked;
- `try/catch/finally/throw/throws`;
- diferencias entre listas doble, circular y ordenada;
- condición de fin de una circular;
- propósito de `Iterator`;
- DDL frente a DML;
- consultas y modificaciones seguras;
- al menos tres principios SOLID explicados correctamente.

No elevar como dominado un punto leído pero no respondido.

---

# 11. Archivos de trabajo

- `FICHAS/2026-08-18_FICHA-JAVA-COMPLEMENTARIO.md`
- `CODIGO/2026-08-18_JAVA-EXCEPCIONES-Y-COMPARACION.md`
- `FICHAS/2026-08-18_FICHA-LISTAS-AVANZADAS.md`
- `CODIGO/2026-08-18_LISTAS-AVANZADAS-JAVA.md`
- `FICHAS/2026-08-18_FICHA-SQL-DDL-DML.md`
- `BASE-DATOS/2026-08-18_PRACTICA-SQL-DIA-11.sql`
- `CASOS/2026-08-18_CASO-INTEGRADOR-JAVA-LISTAS-SQL.md`
- `EVALUACIONES/2026-08-18_EVALUACION-DIA-11.md`

---

# 12. Comando de inicio

```text
Comenzar Día 11
```
