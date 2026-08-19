# Manifiesto — Preparación Día 13

## 20/08/2026 — Pruebas + Inserción/Shellsort + SQL avanzado

**Estado:** **PREPARADO — NO INICIADO**

---

# 1. Base académica

- Día 12 cerrado y aprobado con `8,05/10`;
- estado canónico posterior al Día 12 preservado;
- plan maestro vigente para el 20/08/2026;
- materiales universitarios de Análisis y Diseño, Taller de Algoritmos y Base de Datos I;
- ampliaciones expresamente delimitadas por el plan maestro.

---

# 2. Trazabilidad

| Contenido | Clasificación | Fuente principal |
|---|---|---|
| verificación, validación y propósito de pruebas | respaldado | Análisis y Diseño |
| modelo, plan, caso, procedimiento, componente y defecto | respaldado | Análisis y Diseño |
| niveles, caja negra, caja blanca y fronteras | respaldado | Análisis y Diseño |
| inserción y Shellsort | respaldado | Taller de Algoritmos |
| `JOIN`, subconsultas y funciones de grupo | respaldado | Base de Datos I |
| `GROUP BY`, `HAVING`, `ORDER BY` | respaldado | Base de Datos I |
| DCL, TCL, `COMMIT` y `ROLLBACK` | respaldado | Base de Datos I |
| Oracle, MySQL y SQLite | respaldado | Base de Datos I |
| PostgreSQL comparativo | ampliación prevista | plan maestro |
| ACID | ampliación prevista | plan maestro / relación con TCL |
| encoding, hashing y cifrado | ampliación conceptual prevista | plan maestro |
| programa Java de ordenación | ampliación práctica | integración Java |

---

# 3. Archivos creados

1. `03-ESTADO-ACTUAL-PREPARADO-DIA-13.md`
2. `DIAS/2026-08-20_DIA-13_PRUEBAS-ORDENACION-SQL.md`
3. `TARJETAS/2026-08-20_RECUPERACION-INICIAL-DIA-13.md`
4. `FICHAS/2026-08-20_FICHA-MODELO-PRUEBAS.md`
5. `DIAGRAMAS/2026-08-20_MAPA-MODELO-PRUEBAS.md`
6. `CASOS/2026-08-20_MATRIZ-CASOS-PRUEBA-SIGO.md`
7. `FICHAS/2026-08-20_FICHA-INSERCION-SHELLSORT.md`
8. `CODIGO/DemoDia13.java`
9. `CODIGO/2026-08-20_ORDENACION-JAVA.md`
10. `FICHAS/2026-08-20_FICHA-SQL-AVANZADO.md`
11. `BASE-DATOS/2026-08-20_PRACTICA-SQL-DIA-13.sql`
12. `FICHAS/2026-08-20_FICHA-MOTORES-ACID-SEGURIDAD.md`
13. `CASOS/2026-08-20_CASO-INTEGRADOR-PRUEBAS-ORDENACION-SQL.md`
14. `EVALUACIONES/2026-08-20_EVALUACION-DIA-13.md`
15. `EVALUACIONES/2026-08-20_RESPUESTAS-DIA-13.md`
16. `RESUMENES/2026-08-20_RESUMEN-GUIADO-DIA-13.md`
17. `RESUMENES/2026-08-20_CIERRE-DIA-13.md`
18. `99-MANIFIESTO-PREPARACION-DIA-13.md`

---

# 4. Cobertura

```text
recuperación selectiva
→ modelo de pruebas
→ casos y trazabilidad
→ inserción y Shellsort
→ código ejecutable
→ SQL avanzado
→ TCL y ACID
→ decisión de motor
→ seguridad conceptual
→ caso integrador
→ evaluación y cierre
```

---

# 5. Validaciones ejecutadas

- [x] `DemoDia13.java` compila en modo de archivo fuente y produce la salida esperada;
- [x] las consultas de práctica se ejecutan dentro de una transacción descartable;
- [x] `ROLLBACK` deja la base de prueba sin objetos residuales;
- [x] evaluación y respuestas usan la misma numeración del 1 al 13;
- [x] el puntaje suma `10,00`;
- [x] los bloques Markdown están balanceados;
- [x] las 18 referencias del manifiesto apuntan a archivos existentes;
- [x] no se modificaron archivos canónicos;
- [x] no se declaró contenido como estudiado;
- [x] `git diff --check` finaliza sin errores.

La práctica SQL se validó en una base SQLite transitoria por compartir el núcleo SQL utilizado; los ejemplos DCL específicos de PostgreSQL permanecen comentados porque requieren un rol y permisos reales.

---

# 6. Estado canónico preservado

```text
03-ESTADO-ACTUAL.md             → sin modificar
04-MATRIZ-DE-PROGRESO.md        → sin modificar
05-REGISTRO-DIARIO.md           → sin modificar
06-ERRORES-Y-RECUPERACIONES.md  → sin modificar
99-MANIFIESTO-CIERRE.md         → sin modificar
```

No se crea todavía:

- resultado del Día 13;
- actualización de la matriz;
- actualización del historial de errores;
- nota o condición de aprobación;
- cierre canónico.

---

# 7. Inicio

```text
Comenzar Día 13
```

El cierre deberá conservar respuestas reales, correcciones, tiempo, resultado y pendientes antes de actualizar el estado acumulativo.
