# Estado preparado — EFIP I — 15/08/2026
## Caso integrador 1

**Fecha:** sábado 15 de agosto de 2026  
**Duración prevista:** 5 a 6 horas  
**Materias:** Análisis y Diseño + POO + Estructuras + Base de Datos + Comunicaciones  
**Estado de esta documentación:** PREPARADA  
**Estado académico canónico:** Día 8 cerrado y aprobado con 7,9/10  
**Estado del Día 9:** EN PAUSA; caso integrador, evaluación y defensa pendientes

---

# 1. Alcance

El plan maestro asigna el 15/08/2026 al **Caso integrador 1**. La jornada debe integrar las cinco materias mediante un único problema y producir:

- definición del problema y objetivos;
- RF, RNF y reglas de negocio;
- actores y casos de uso;
- modelo de análisis;
- modelo de diseño y secuencia;
- diseño POO con abstracción y polimorfismo;
- elección justificada de Pila o Cola;
- DER y pasaje a tablas;
- normalización hasta 3FN;
- arquitectura de comunicaciones;
- evaluación escrita;
- defensa oral;
- resumen semanal por materia;
- actualización posterior del registro de errores.

---

# 2. Condición especial: Día 9 todavía en pausa

La preparación del caso integrador **no cierra automáticamente el Día 9** y no autoriza a asignarle una nota.

Antes del caso se incluye una recuperación breve de:

```text
I(E)=log₂(1/P(E))
triángulo vacío en generalización UML
toString() con atributos reales
String: equals/isBlank frente a ==
validación que detenga una operación inválida
alternativo con Sincronizador explícito
dependencias parciales de 2FN
PK artificial ≠ normalización automática
unidades en cálculos
```

Los conceptos del Día 9 pueden usarse en el integrador como práctica aplicada, pero su evaluación y cierre formal permanecen separados.

---

# 3. Caso seleccionado

## SIGO Móvil — Registrar ejecución de una Orden de Trabajo

Un Operario debe registrar desde una aplicación móvil la ejecución de una OT. El sistema debe funcionar con y sin conexión, conservar el orden de envío de solicitudes pendientes, permitir deshacer cambios locales no confirmados, notificar por distintos canales y persistir la información sin redundancias.

La misma situación permite integrar:

```text
Requisitos y casos de uso
→ análisis y diseño
→ clases y polimorfismo
→ Pila/Cola
→ DER y normalización
→ TCP/IP y transmisión
→ pruebas y defensa
```

---

# 4. Archivos preparados

1. `DIAS/2026-08-15_CASO-INTEGRADOR-01.md`
2. `CASOS/2026-08-15_CASO-INTEGRADOR-01-SIGO-OT-MOVIL.md`
3. `DIAGRAMAS/2026-08-15_MAPA-INTEGRACION-CASO-01.md`
4. `TARJETAS/2026-08-15_RECUPERACION-PREVIA-CASO-INTEGRADOR-01.md`
5. `EVALUACIONES/2026-08-15_EVALUACION-SEMANAL-CASO-INTEGRADOR-01.md`
6. `EVALUACIONES/2026-08-15_RESPUESTAS-CASO-INTEGRADOR-01.md`
7. `RESUMENES/2026-08-15_RESUMEN-SEMANAL-POR-MATERIA.md`
8. `RESUMENES/2026-08-15_CIERRE-CASO-INTEGRADOR-01.md`
9. `99-MANIFIESTO-PREPARACION-2026-08-15.md`

---

# 5. Criterio de trabajo

## Primera etapa — recuperación y resolución guiada

Se permite consultar únicamente las tarjetas después de intentar responder sin ayuda.

## Segunda etapa — evaluación

- sin apuntes;
- respuestas originales preservadas;
- cálculos con fórmula, desarrollo y unidad;
- supuestos declarados;
- no confundir modelo conceptual con implementación;
- no reemplazar errores después de entregar.

## Tercera etapa — defensa

La defensa debe conectar las cinco materias en una explicación continua y no limitarse a enumerar conceptos.

---

# 6. Evaluación semanal

| Criterio | Puntaje |
|---|---:|
| Análisis y Diseño | 20 |
| POO | 20 |
| Estructuras | 15 |
| Base de Datos | 15 |
| Comunicaciones | 15 |
| Escritura y defensa | 15 |
| **Total** | **100** |

**Aprobación orientativa:** 70/100, sin omitir por completo ninguna materia.

---

# 7. Regla de energía

Si el cansancio impide responder con precisión, se permite dividir la jornada:

```text
15/08
→ recuperación + resolución del caso

16/08
→ corrección de errores + evaluación + defensa
```

Dividir la jornada no equivale a abandonar el caso ni a declarar el Día 9 cerrado.

---

# 8. Archivos canónicos protegidos

Esta preparación no modifica:

- `03-ESTADO-ACTUAL.md`;
- `04-MATRIZ-DE-PROGRESO.md`;
- `05-REGISTRO-DIARIO.md`;
- `06-ERRORES-Y-RECUPERACIONES.md`;
- `99-MANIFIESTO-CIERRE.md`.

Solo después de resolver, evaluar y defender el caso se actualizará el estado canónico correspondiente.
