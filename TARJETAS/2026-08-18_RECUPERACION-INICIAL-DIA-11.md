# Recuperación inicial — Día 11

**Fecha:** 18/08/2026  
**Tiempo:** 20–25 minutos  
**Regla:** responder sin apuntes; se evalúan conceptos, no ortografía.

## Preguntas

1. Diferenciá vista de implementación y vista de despliegue.
2. Escribí las asignaciones para eliminar la cabeza y un nodo intermedio de una Lista simple.
3. ¿Qué comparan `==` y `equals()` cuando se usan objetos `String`?
4. Diferenciá `super(...)` y `super.metodo()`.
5. ¿Por qué se valida un parámetro antes de asignarlo al atributo?
6. Diferenciá arreglo y `ArrayList` según tamaño y acceso.
7. ¿Qué problema resuelve una lista doble frente a una simple?
8. ¿Cómo se reconoce el final de una vuelta en una lista circular?
9. ¿Qué propiedad mantiene una lista ordenada después de cada inserción?
10. Clasificá `CREATE TABLE`, `SELECT`, `INSERT`, `UPDATE` y `DELETE` como DDL o DML.
11. ¿Qué función cumplen `FROM` y `WHERE` en un `SELECT`?
12. ¿Qué riesgo existe al ejecutar `UPDATE` o `DELETE` sin `WHERE`?

## Umbral

```text
10–12 → avanzar
7–9   → recuperación selectiva
0–6   → recuperación dirigida
```

---

# Clave breve para corrección

1. Implementación organiza software; despliegue lo asigna a nodos.
2. `cabeza=cabeza.siguiente`; `anterior.siguiente=actual.siguiente`.
3. `==` compara referencias; `equals()` compara igualdad lógica/contenido.
4. Constructor de superclase frente a invocación explícita de método heredado.
5. Evita dejar el objeto con estado inválido.
6. Arreglo con capacidad fijada; `ArrayList` redimensionable. Ambos acceden por índice.
7. Acceso y actualización en ambos sentidos mediante `anterior` y `siguiente`.
8. Se guarda el nodo inicial y se termina al regresar a él.
9. Los elementos permanecen ordenados por una clave.
10. `CREATE`=DDL; las restantes=DML.
11. `FROM` indica fuentes; `WHERE` filtra filas.
12. Se afectan todas las filas alcanzadas por la sentencia.
