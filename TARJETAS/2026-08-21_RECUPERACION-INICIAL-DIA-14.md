# Recuperación inicial — Día 14

**Fecha:** 21/08/2026
**Uso:** responder sin apuntes antes de mirar la clave.

---

# Preguntas

1. Si una prueba espera `IllegalArgumentException` al validar prioridad `6` y la excepción se lanza, ¿la prueba pasa o falla?
2. ¿Qué tramo está ordenado antes de procesar `i` en inserción?
3. ¿Dónde se guarda temporalmente la clave?
4. En Shellsort con `gap = 2`, ¿qué índices compara `i = 6` hacia atrás?
5. ¿Por qué Shellsort debe terminar con `gap = 1`?
6. Diferenciá mejor y peor caso de inserción.
7. ¿De qué depende especialmente el rendimiento de Shellsort?
8. Diferenciá HDLC, PPP y Ethernet en una oración cada uno.
9. ¿Por qué un broadcast puede permanecer en un bucle de capa 2?
10. ¿Qué mecanismo limita un bucle de paquetes en capa 3?
11. ¿Qué hace `catch (NumberFormatException e)` antes de lanzar una excepción propia?
12. ¿Por qué se conserva `e` como causa?

---

# Umbral

```text
10–12 → avanzar
7–9   → recuperación selectiva
0–6   → recuperación dirigida
```

---

# Clave

1. Pasa: la excepción esperada confirma el rechazo correcto.
2. `A[0..i-1]`.
3. En una variable temporal.
4. `6 → 4 → 2 → 0`, mientras corresponda desplazar.
5. Porque gaps mayores solo ordenan subsecuencias.
6. Mejor `O(n)` si ya está ordenado; peor `O(n²)`.
7. De la secuencia de gaps y del estado de los datos.
8. HDLC: referencia de enlace orientada al control; PPP: enlace punto a punto; Ethernet: tecnología LAN de capas 1 y 2.
9. Las tramas no tienen TTL y los enlaces redundantes activos pueden reenviarlas repetidamente.
10. TTL, junto con convergencia y métricas de routing.
11. Captura la causa técnica producida al convertir texto inválido.
12. Para preservar diagnóstico técnico y encadenamiento de errores.
