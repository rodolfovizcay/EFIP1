# Resumen guiado — Día 13

## Pruebas + Inserción/Shellsort + SQL avanzado

**Fecha:** 20/08/2026
**Estado:** material preparado

---

# 1. Mapa de la jornada

```text
REQUISITO
→ prueba con entrada y resultado esperado
→ defecto si no coincide
→ datos de trabajos
→ ordenación por prioridad
→ persistencia relacional
→ JOIN / agregación / subconsulta
→ transacción ACID
→ decisión de motor
```

---

# 2. Verificación y validación

```text
verificación → cumple la especificación
validación   → satisface la necesidad del usuario
```

- Inspección: técnica estática, sin ejecutar.
- Prueba: técnica dinámica, ejecuta y observa.
- Probar aporta confianza y revela defectos; no garantiza ausencia absoluta de defectos.

---

# 3. Artefactos de prueba

```text
modelo      → organización general de las pruebas
plan        → estrategia, recursos, tiempos y cobertura
caso        → qué probar
procedimiento → cómo probar
componente  → automatización
defecto     → anomalía registrada
evaluación  → análisis de resultados y cobertura
```

Un resultado esperado se escribe antes de ejecutar. Un resultado obtenido se registra después.

---

# 4. Niveles y enfoques

```text
unidad → método/clase
integración → colaboración
sistema → producto completo
aceptación → necesidad del cliente
```

```text
caja negra → comportamiento visible según especificación
caja blanca → estructura y caminos internos
```

Para dominio `1..5`, probar fronteras `0/1` y `5/6`, no solamente un valor central.

---

# 5. Inserción

```text
prefijo ordenado | resto pendiente
```

Por cada `i`:

1. guardar clave;
2. desplazar mayores hacia la derecha;
3. insertar en `j+1`.

```text
mejor O(n)
promedio/peor O(n²)
memoria O(1)
estable si compara con >
```

---

# 6. Shellsort

```text
inserción con gaps decrecientes
n/2 → ... → 1
```

Los saltos grandes acercan elementos lejanos. `gap=1` completa el orden. Suele ser in-place y no estable. Su rendimiento depende de la secuencia de gaps; no tiene una única complejidad válida para toda variante.

---

# 7. SQL avanzado

## JOIN

```sql
FROM trabajo AS t
JOIN sector AS s ON s.id_sector = t.id_sector
```

La condición evita combinaciones cartesianas incorrectas.

## Agregación

```text
COUNT, SUM, AVG, MIN, MAX
```

```sql
WHERE ...
GROUP BY ...
HAVING COUNT(*) ...
ORDER BY ...
```

Regla:

```text
WHERE filtra filas
HAVING filtra grupos
```

## Subconsulta

```sql
WHERE prioridad > (SELECT AVG(prioridad) FROM trabajo)
```

Puede devolver un escalar, una lista o ser usada con `EXISTS`.

---

# 8. TCL y ACID

```text
COMMIT   → confirma
ROLLBACK → deshace lo no confirmado
```

```text
A → atomicidad: todo o nada
C → consistencia: conserva reglas
I → aislamiento: concurrencia controlada
D → durabilidad: lo confirmado persiste
```

El `WHERE` sigue siendo obligatorio para cambios selectivos.

---

# 9. Motores

```text
SQLite    → embebido/local/móvil
PostgreSQL→ servidor relacional abierto
MySQL     → aplicación web/ecosistema difundido
Oracle    → plataforma empresarial
```

Elegir por contexto y RNF, no por marca aislada.

---

# 10. Encoding, hashing y cifrado

```text
Base64  → encoding reversible, no seguridad
SHA-256 → hash/huella, no reversible normalmente
AES     → cifrado reversible con clave
```

Para contraseñas se usan funciones específicas con sal y costo; SHA-256 simple no es suficiente.

---

# 11. Frases de defensa

1. “El caso dice qué probar y el procedimiento cómo hacerlo”.
2. “Inserción mantiene ordenado el prefijo izquierdo”.
3. “Shellsort es inserción con incrementos decrecientes y termina en gap uno”.
4. “WHERE filtra filas; HAVING filtra grupos”.
5. “COMMIT confirma y ROLLBACK deshace”.
6. “Base64 representa, SHA-256 genera una huella y AES cifra con clave”.

---

# 12. Autoevaluación antes del cierre

- [ ] Puedo escribir dos casos de frontera sin ayuda.
- [ ] Distingo caso, procedimiento y defecto.
- [ ] Trazo inserción mostrando cada vuelta.
- [ ] Trazo Shellsort mostrando cada gap.
- [ ] Escribo un `JOIN` con condición correcta.
- [ ] Diferencio `WHERE` y `HAVING`.
- [ ] Escribo una subconsulta de promedio.
- [ ] Explico las cuatro propiedades ACID.
- [ ] Justifico SQLite local y un motor servidor.
- [ ] No llamo cifrado a Base64.

Estas marcas se completan solo con desempeño real.
