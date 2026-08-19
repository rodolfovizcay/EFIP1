# Estado preparado — EFIP I — Día 13

**Fecha académica prevista:** 20/08/2026
**Jornada:** Pruebas + Inserción/Shellsort + SQL avanzado
**Estado:** **PREPARADO — NO INICIADO**
**Día 12:** cerrado y aprobado — `8,05/10`

---

# 1. Regla de integridad académica

Este archivo prepara la jornada sin atribuir estudio, respuestas ni dominio.

```text
material preparado ≠ contenido estudiado
respuesta modelo ≠ evidencia del estudiante
código ejecutado durante la preparación ≠ ejercicio realizado por el estudiante
```

Hasta el cierre real permanecen sin cambios:

- `03-ESTADO-ACTUAL.md`;
- `04-MATRIZ-DE-PROGRESO.md`;
- `05-REGISTRO-DIARIO.md`;
- `06-ERRORES-Y-RECUPERACIONES.md`;
- `99-MANIFIESTO-CIERRE.md`.

---

# 2. Objetivos del Día 13

Al finalizar, el estudiante deberá poder:

1. diferenciar verificación y validación;
2. explicar para qué sirve un modelo de pruebas;
3. diferenciar plan, caso, procedimiento, componente, defecto y evaluación de prueba;
4. reconocer pruebas de unidad, integración, sistema y aceptación;
5. construir casos de caja negra con datos válidos, inválidos y de frontera;
6. trazar `requisito → caso de uso → diseño → código → prueba → defecto`;
7. ejecutar manualmente ordenación por inserción;
8. explicar el prefijo ordenado y el desplazamiento de elementos;
9. ejecutar Shellsort con incrementos decrecientes y pasada final de `gap = 1`;
10. comparar inserción y Shellsort sin asignar a Shellsort una complejidad única independiente de los incrementos;
11. escribir consultas con `JOIN`, subconsultas y funciones de grupo;
12. diferenciar `WHERE` y `HAVING`;
13. usar correctamente `GROUP BY` y `ORDER BY`;
14. relacionar TCL con transacciones y las propiedades ACID;
15. elegir entre Oracle, MySQL, SQLite y PostgreSQL según un contexto explícito;
16. diferenciar encoding, hashing y cifrado por finalidad y reversibilidad.

---

# 3. Estado de entrada

| Área | Evidencia disponible | Brecha que retoma el Día 13 |
|---|---|---|
| Análisis y Diseño | arquitectura, vistas, implementación y despliegue defendibles | modelo, artefactos y niveles de prueba |
| Estructuras | listas simples y avanzadas aplicadas | ordenación por inserción y Shellsort |
| Base de Datos | SQL básico, restricciones y cambios seguros aplicados | consultas multitabla, agregación, subconsultas, TCL y ACID |
| Comunicaciones | switch/STP comprendidos con recuperación | HDLC/PPP/Ethernet y bucle L2 frente a routing |

Errores abiertos que reaparecen al inicio:

```text
E-063 — HDLC frente a PPP frente a Ethernet
E-065 — bucle de capa 2 frente a bucle de enrutamiento
```

También se comprobará la retención de E-060, E-061, E-062 y E-064. La preparación no abre errores nuevos.

---

# 4. Umbral de recuperación inicial

```text
10–12 correctas → comenzar M1
7–9 correctas   → refuerzo selectivo de 15 minutos
0–6 correctas   → recuperación dirigida de 25 minutos
```

---

# 5. Productos preparados

- guía ampliada de 5,5 horas núcleo;
- recuperación inicial con clave;
- ficha y mapa del modelo de pruebas;
- matriz de casos de prueba para SIGO;
- ficha de inserción y Shellsort;
- programa Java ejecutable con ambos algoritmos;
- ficha y práctica de SQL avanzado;
- ficha de motores, transacciones, ACID y seguridad conceptual;
- caso integrador transversal;
- evaluación de 10 puntos con respuestas modelo;
- resumen guiado y plantilla de cierre;
- manifiesto de preparación y validación.

---

# 6. Cobertura y trazabilidad

## Respaldado directamente por los materiales

- verificación, validación, flujo y modelo de pruebas;
- plan, caso, procedimiento, componente, defecto y evaluación de prueba;
- niveles y técnicas de prueba;
- inserción y Shellsort;
- SQL multitabla, subconsultas, funciones de grupo, `GROUP BY`, `HAVING` y `ORDER BY`;
- DCL, TCL, `COMMIT`, `ROLLBACK` y motores Oracle, MySQL y SQLite.

## Ampliación prevista por el plan maestro

- PostgreSQL como comparación conceptual;
- propiedades ACID vinculadas con transacciones;
- encoding, hashing y cifrado en nivel introductorio;
- automatización Java mínima para comprobar ordenación.

---

# 7. Inicio

```text
Comenzar Día 13
```

La primera evidencia será la recuperación inicial, respondida sin consultar la clave.
