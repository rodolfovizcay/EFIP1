# Evaluación Día 3 — Estructuras básicas + Modelo relacional

**Fecha:** 7/8/2026  
**Tiempo recomendado:** 25–30 minutos  
**Puntaje:** 10 puntos  
**Modalidad:** sin apuntes

---

# Parte A — Diez preguntas — 6 puntos

## 1. TDA — 0,6

Definí un tipo de dato abstracto y explicá qué significa abstraerse de la implementación.

## 2. Estática y dinámica — 0,6

Explicá la diferencia y proponé un ejemplo de cada una.

## 3. Arreglo — 0,6

Definí arreglo, elemento e índice.

## 4. Capacidad y longitud — 0,6

Explicá la diferencia usando un arreglo de 10 posiciones con 3 elementos cargados.

## 5. Nodo y lista — 0,6

¿Qué contiene un nodo de una lista simple y qué representa `null`?

## 6. Elección de estructura — 0,6

¿Cuándo elegirías un arreglo y cuándo una lista enlazada?

## 7. Modelo relacional — 0,6

Definí relación, tupla y atributo.

## 8. Dominio — 0,6

Definí dominio y proponé dominios para `prioridad` y `estado` de una OT.

## 9. Grado y cardinalidad — 0,6

Explicá la diferencia.

## 10. Claves — 0,6

Diferenciá clave candidata, primaria y foránea.

---

# Parte B — Ejercicios — 4 puntos

## Ejercicio 1 — Lista enlazada — 2 puntos

Dada:

```text
cabeza → A → B → C → null
```

Insertá X al inicio:

1. escribí los pasos;
2. representá el resultado;
3. explicá qué ocurriría si se actualizara `cabeza` antes de enlazar X con A;
4. escribí un fragmento Java breve.

## Ejercicio 2 — Relación — 2 puntos

Dada la relación:

```text
ORDEN_TRABAJO(
    id_ot,
    descripcion,
    prioridad,
    estado,
    id_sector
)
```

Y suponiendo que tiene 250 filas, indicá:

1. nombre de la relación;
2. cabecera;
3. grado;
4. cardinalidad;
5. clave primaria probable;
6. clave foránea probable;
7. dos dominios;
8. una tupla de ejemplo.

---

# Defensa oral integradora

Responder durante 3–5 minutos:

> Explique la diferencia entre un arreglo y una lista enlazada, y cómo se relacionan esas estructuras en memoria con una base de datos relacional que almacena órdenes de trabajo.

Para alcanzar `Defendible oralmente` debe mencionar:

- TDA o interfaz/implementación;
- acceso por índice frente a recorrido por nodos;
- relación, tupla y atributo;
- grado y cardinalidad;
- clave primaria/foránea;
- memoria frente a persistencia.

---

# Recuperación espaciada del Día 2 — no suma a la nota principal

1. Construcción frente a Transición.
2. Iteración frente a incremento.
3. Estado frente a comportamiento.
4. Sobrecarga frente a sobrescritura.
