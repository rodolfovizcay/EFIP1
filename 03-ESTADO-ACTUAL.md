# Estado actual — EFIP I

**Actualizado al cierre académico del Día 13 — 20/08/2026**
**Día 13:** **CERRADO Y APROBADO CON REFUERZO PENDIENTE — 8,0/10**
**Corrección técnica de respuestas entregadas:** **10,00/10,00**
**Defensa integradora:** **COMPLETADA CON APOYO**
**Día 12:** **CERRADO Y APROBADO — 8,05/10**
**Día 11:** **CERRADO Y APROBADO — 9,2/10**
**Día 10:** **CERRADO Y APROBADO — 8,5/10 + recuperación 4/4**
**Semana intensiva 1:** **CERRADA POR EVIDENCIA ACUMULADA — 8,6/10**

---

# 1. Integridad del resultado

```text
Corrección técnica = 10,00/10,00
Ajuste por resolución asistida = -2,00
Nota académica general = 8,0/10
Estado = cerrado y aprobado con refuerzo pendiente
```

Las respuestas entregadas fueron técnicamente correctas, pero la evaluación y la defensa requirieron ayuda. Por integridad académica, `10/10` se conserva solo como corrección técnica y la nota general se fija en `8,0/10`. El solucionario permanece separado de las respuestas del estudiante.

---

# 2. Estado por materia

| Materia | Nivel actual | Evidencia principal | Precisión pendiente |
|---|---|---|---|
| Análisis y Diseño | **Alto — aplicado y defendible** | arquitectura, trazabilidad y modelo de pruebas | repaso espaciado de componente/subsistema/artefacto |
| POO | **Alto conceptual — aplicado** | colecciones, excepciones, archivos, SOLID y seguridad conceptual | programa Java autónomo y sintaxis completa |
| Estructuras | **Medio-alto — aplicado con apoyo** | listas, iteradores, inserción y Shellsort | confirmar complejidades y trazas sin ayuda; luego Mergesort y Quicksort |
| Base de Datos | **Alto — aplicado** | SQL básico/avanzado, agregación, subconsultas, TCL/DCL y ACID | confirmar autonomía; procedimientos, cursores, triggers y modelo relacional final |
| Comunicaciones | **Medio-alto — aplicado** | Ethernet, switching, STP, routing y TTL | perturbaciones, direccionamiento y tecnologías WAN |

---

# 3. Evidencia del Día 13

- V&V, estática/dinámica y artefactos del modelo de pruebas;
- niveles, caja negra/blanca, fronteras y registro de defectos;
- inserción y Shellsort con trazas, estabilidad, memoria y complejidad;
- `JOIN`, agregaciones, `HAVING`, subconsultas y producto cartesiano;
- transacciones, ACID, DCL y selección de motores;
- Base64, SHA-256 y AES;
- defensa requisito→prueba→ordenación→SQL→ACID→motores.

---

# 4. Estado de errores

| Estado | Cantidad |
|---|---:|
| Consolidado | **42** |
| Corregido | **21** |
| Abierto | **4** |
| **Total registrado** | **67** |

Pasaron de abiertos a corregidos en el Día 13:

```text
E-005 — complejidades de ordenación
E-063 — HDLC/PPP/Ethernet
E-065 — bucle L2 frente a routing
```

Nuevos corregidos:

```text
E-066 — excepción esperada y resultado de la prueba
E-067 — recorrido completo de Shellsort por gap
```

Abiertos prioritarios:

```text
E-016 — Java completo
E-039 — entidad asociativa frente a débil
E-045 — digitalización, política y supuestos
E-050 — modelo relacional final completo
```

---

# 5. Evidencias canónicas

- `EVALUACIONES/2026-08-20_RESPUESTAS-ESTUDIANTE-DIA-13.md`
- `EVALUACIONES/2026-08-20_RESULTADOS-DIA-13.md`
- `RESUMENES/2026-08-20_CIERRE-DIA-13.md`
- `06-ERRORES-Y-RECUPERACIONES-DIA-13.md`
- `DIAS/2026-08-20_DIA-13_PRUEBAS-ORDENACION-SQL.md`

---

# 6. Próxima acción

```text
Estado del plan = PAUSADO
→ no iniciar automáticamente el Día 14
→ retomar E-005/E-063/E-065/E-066/E-067 o avanzar solo cuando sea solicitado
```
