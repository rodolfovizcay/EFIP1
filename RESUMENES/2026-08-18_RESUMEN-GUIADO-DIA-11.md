# Resumen guiado — Día 11
## Java complementario + Listas avanzadas + SQL

---

# 1. Respuesta oral de Java

> Un arreglo tiene capacidad fijada al crearse, mientras que `ArrayList` administra una colección redimensionable. En objetos, `==` compara referencias y `equals` expresa igualdad lógica; si se redefine `equals`, debe redefinirse `hashCode` coherentemente. Las excepciones checked deben capturarse o declararse; las unchecked no lo exigen. `throw` lanza una excepción y `throws` declara su posible propagación.

## Mapa rápido

```text
try     → código riesgoso
catch   → manejo de un tipo de error
finally → limpieza o acción final
throw   → lanza una instancia
throws  → declara propagación
```

```text
.java → compilador → bytecode → JVM compatible → ejecución
```

Portabilidad no significa independencia absoluta de bibliotecas, sistema de archivos o componentes nativos.

---

# 2. Respuesta oral de listas

> Una lista doble agrega referencias anterior y siguiente para recorrer en ambos sentidos. Una circular enlaza el último con el primero y termina su recorrido al volver al nodo inicial. Una ordenada conserva una relación de orden después de cada inserción. Un iterador abstrae el recorrido mediante `hasNext()` y `next()`.

| Necesidad | Elección |
|---|---|
| retroceder | doble |
| ciclo repetitivo | circular |
| prioridad permanente | ordenada |
| recorrido independiente de representación | iterador |

---

# 3. Respuesta oral de SQL

> SQL es declarativo: expresa qué datos consultar o modificar. DDL define estructuras y DML consulta o modifica filas. `SELECT` indica qué mostrar, `FROM` las fuentes y `WHERE` las filas. `UPDATE` y `DELETE` sin `WHERE` pueden afectar todas las filas.

```text
DDL → CREATE, ALTER, DROP, TRUNCATE
DML → SELECT, INSERT, UPDATE, DELETE
TCL → COMMIT, ROLLBACK, SAVEPOINT
DCL → GRANT, REVOKE
```

Regla segura:

```text
SELECT con el WHERE
→ verificar filas
→ UPDATE o DELETE con el mismo WHERE
→ confirmar o deshacer
```

---

# 4. SOLID mínimo

```text
SRP → una razón principal de cambio
OCP → abierto a extensión, cerrado a modificación
LSP → subtipo sustituye al tipo base
ISP → interfaces pequeñas y específicas
DIP → depender de abstracciones
```

Es contenido complementario para reconocimiento y defensa oral.

---

# 5. Errores que deben evitarse

- `ArrayList` no implica acceso enlazado;
- `==` no reemplaza `equals`;
- hash igual no garantiza objetos iguales;
- checked no significa error más grave;
- `finally` no corrige automáticamente una excepción;
- una circular no vacía no termina en `null`;
- una ordenada no es necesariamente doble;
- `WHERE` filtra filas, no columnas;
- `DELETE` no es `DROP`;
- `UPDATE` sin `WHERE` no modifica una sola fila.

---

# 6. Autoevaluación

1. ¿Qué permanece igual entre arreglo y `ArrayList`?
2. ¿Cuándo deben coincidir dos `hashCode`?
3. ¿Qué diferencia existe entre `throw` y `throws`?
4. ¿Qué cuatro enlaces cambian en una inserción doble?
5. ¿Cómo termina una vuelta circular?
6. ¿Qué garantiza una lista ordenada?
7. ¿Qué oculta un iterador?
8. ¿Qué diferencia existe entre DDL y DML?
9. ¿Qué hace `WHERE`?
10. ¿Cómo se protege un `UPDATE`?
