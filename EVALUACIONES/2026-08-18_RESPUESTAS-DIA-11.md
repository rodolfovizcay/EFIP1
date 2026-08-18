# Respuestas del estudiante — Evaluación Día 11

**Fecha:** 18/08/2026<br>
**Estado:** completada<br>
**Apuntes utilizados:** no informados durante la evaluación final

> Transcripción normalizada solo en ortografía y formato. Se conservan el contenido, las decisiones y los errores conceptuales que luego fueron corregidos.

---

# Parte A — Java

## 1. Arreglo y ArrayList

> El arreglo tiene tamaño fijo, asignado al crearse. El `ArrayList` es variable: cuando necesita más capacidad crea internamente un arreglo mayor y copia los elementos. En ambos el acceso es por índices. Insertar al final es constante y en el medio es `O(n)` porque hay que desplazar elementos. Los arreglos admiten primitivos y objetos; `ArrayList` admite objetos y wrappers. El arreglo puede quedarse sin capacidad y `ArrayList` está limitado por la memoria disponible.

## 2. Igualdad

> Con `equals()` se comparan los objetos y, en `String`, sus contenidos. Con `==` se compara si son la misma instancia. Si la igualdad se define por el identificador, `hashCode()` también debe usar ese identificador: objetos iguales deben producir el mismo hash, pero el mismo hash no garantiza que sean iguales.

## 3. Excepciones

> Las checked heredan de `Exception` y las unchecked de `RuntimeException`. `try` contiene el código que se prueba, `catch` captura y controla el error, y `finally` se ejecuta siempre. `throw` dispara la excepción y `throws` avisa en la firma que puede propagarse. En la respuesta inicial se afirmó de manera demasiado general que todo `throws` obliga a controlar la excepción y que una unchecked va a fallar en ejecución.

## 4. JVM

> El JDK aporta las herramientas de desarrollo y compilación. El archivo `.java` se compila a bytecode `.class`; una JVM específica de cada sistema operativo ejecuta ese bytecode. La portabilidad no es absoluta: rutas de Windows, variables de entorno o comandos propios del sistema pueden hacer que el programa falle en otra plataforma. Un `.jar` puede agrupar clases y otros recursos.

---

# Parte B — Listas avanzadas

## 5. Comparación

> La lista simple tiene un enlace, termina en `null` y es flexible, aunque requiere recorrido para buscar y puede perderse la cadena si se rompe una referencia. La doble tiene enlaces anterior y siguiente, termina con `null` en ambos extremos y permite recorrer en las dos direcciones, con mayor memoria y complejidad de enlaces. La circular conecta el último nodo con el primero y una vuelta termina al regresar al inicio; si no se controla esa condición puede producirse un ciclo infinito. La ordenada puede ser simple o doble y mantiene el criterio de orden al insertar; buscar la posición de inserción cuesta `O(n)`.

## 6. Enlaces

```java
X.siguiente = A.siguiente;
X.anterior = A;
A.siguiente = X;
B.anterior = X;
```

Representación resultante:

```text
null ← A ↔ X ↔ B → null
```

## 7. Circular e iterador

> Una vuelta termina cuando `actual == inicio` después de haber recorrido al menos un nodo. `hasNext()` comprueba si queda otro elemento; `next()` devuelve el siguiente y avanza; `Iterator.remove()` elimina el último elemento devuelto por `next()`. No conviene modificar directamente la colección mientras la recorre el iterador porque puede producir un fallo en tiempo de ejecución.

---

# Parte C — SQL

## 8. Familias

| Sentencia | Familia |
|---|---|
| `CREATE` | DDL |
| `ALTER` | DDL |
| `SELECT` | DML |
| `INSERT` | DML |
| `UPDATE` | DML |
| `DELETE` | DML |
| `COMMIT` | TCL |
| `GRANT` | DCL |

## 9. Consulta

```sql
SELECT id_trabajo, descripcion, prioridad
FROM TRABAJO
WHERE estado = 'PENDIENTE'
ORDER BY prioridad, id_trabajo;
```

## 10. Cambios seguros

```sql
INSERT INTO TRABAJO
    (id_trabajo, id_sector, descripcion, prioridad, estado)
VALUES
    (104, 1, 'Revisar módem', 2, 'PENDIENTE');

SELECT *
FROM TRABAJO
WHERE id_trabajo = 101;

UPDATE TRABAJO
SET estado = 'ASIGNADO'
WHERE id_trabajo = 101;

SELECT *
FROM TRABAJO
WHERE id_trabajo = 102;

DELETE FROM TRABAJO
WHERE id_trabajo = 102;
```

> Si `UPDATE` o `DELETE` omiten `WHERE`, se modifican o eliminan registros sin control. En la evaluación se dijo “muchos registros”; la precisión requerida es que la sentencia afecta todas las filas alcanzadas por la operación.

---

# Parte D — Integración y SOLID

> Elegiría SRP y DIP. SRP porque `AgendaTrabajos` no debería tener muchas responsabilidades; separaría validación, persistencia, sincronización y menú. DIP porque `AgendaTrabajos` debería depender de `IRepositorio` y no directamente de PostgreSQL. Las validaciones deben estar en Java para detectar errores antes de guardar y también en la base de datos para garantizar la integridad de los datos aunque entren por otra vía.

---

# Recuperación oral posterior

Respuesta del estudiante:

> `throw` dispara excepciones, que pueden ser checked o unchecked, mientras que `throws` firma que una función puede propagarlas. Las checked obligan a controlar el error y las unchecked no es necesario controlarlas, aunque pueden aparecer en tiempo de ejecución.

Precisión incorporada durante la corrección:

```text
throw  = lanza una excepción concreta en ese punto
throws = declara en la firma que el método puede propagarla
checked = el llamador debe capturarla o volver a declararla
unchecked = no existe obligación de compilación; solo falla si ocurre y queda sin capturar
```

El estudiante aceptó la corrección y el tema quedó comprendido, sujeto a recuperación espaciada.

---

# Dudas y errores detectados

1. La obligación de capturar o declarar corresponde a las excepciones checked, no a todo uso de `throws`.
2. Una excepción unchecked no ocurre necesariamente; depende de que se produzca la condición que la lanza.
3. En SQL, omitir `WHERE` afecta todas las filas de la tabla alcanzadas por la sentencia; la recuperación puede depender de una transacción o respaldo.
