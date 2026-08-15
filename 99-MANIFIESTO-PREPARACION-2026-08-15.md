# Manifiesto de preparación — 15/08/2026
## Caso integrador 1 — SIGO Móvil

**Fecha preparada:** 15/08/2026  
**Rama:** `agent/preparacion-2026-08-15-caso-integrador-01`  
**Estado:** material preparado; jornada no realizada  
**Tipo de publicación:** preparación académica

---

# 1. Objetivo

Preparar la documentación de la jornada asignada por el plan maestro al **Caso integrador 1**, conectando las cinco materias mediante el caso `Registrar ejecución de OT`.

La preparación debe permitir:

- estudiar y recuperar errores;
- resolver el caso;
- evaluar sobre 100 puntos;
- realizar defensa oral;
- producir un resumen semanal por materia;
- documentar el cierre posteriormente.

---

# 2. Estado académico preservado

```text
Último cierre oficial:
Día 8 — 7,9/10 — APROBADO

Día 9:
EN PAUSA
sin nota
caso integrador pendiente
evaluación pendiente
defensa pendiente
```

Esta preparación no declara aprobado ni cerrado el Día 9.

---

# 3. Base documental

## Plan

- `02-PLAN-MAESTRO-HASTA-03-09.md`.

El plan establece para el sábado 15/08:

```text
problema
objetivos
RF/RNF
casos de uso
modelo de análisis
diagrama de clases
diseño POO
Pila/Cola
DER
normalización
arquitectura de comunicaciones
defensa oral
```

## Materiales universitarios utilizados

- `Analisis_y_Diseno_de_Software.md`;
- `INF382_Programacion_Orientada_a_Objetos.md`;
- `Taller_de_Algoritmos_y_Estructuras_de_Datos_I.md`;
- `INF387_Base_de_Datos_I_RESUMEN.md`;
- `COMUNICACIONES.md`.

Se conservaron su terminología y alcance:

- modelos, PUD, requisitos, UML, análisis y diseño;
- abstracción, encapsulamiento, herencia, interfaces y polimorfismo;
- TDA, Pila y Cola;
- modelo relacional, DER y formas normales;
- OSI/TCP-IP, información, señales y transmisión.

## Estado y errores acumulados

- `03-ESTADO-ACTUAL.md`;
- `03-ESTADO-ACTUAL-PARCIAL-DIA-09.md`;
- `06-ERRORES-Y-RECUPERACIONES.md`;
- `06-ERRORES-Y-RECUPERACIONES-PARCIAL-DIA-09.md`;
- `TARJETAS/2026-08-16_RECUPERACION-COMPLETAR-DIA-09.md`.

---

# 4. Archivos incorporados

1. `03-ESTADO-ACTUAL-PREPARADO-2026-08-15.md`
2. `DIAS/2026-08-15_CASO-INTEGRADOR-01.md`
3. `CASOS/2026-08-15_CASO-INTEGRADOR-01-SIGO-OT-MOVIL.md`
4. `DIAGRAMAS/2026-08-15_MAPA-INTEGRACION-CASO-01.md`
5. `TARJETAS/2026-08-15_RECUPERACION-PREVIA-CASO-INTEGRADOR-01.md`
6. `EVALUACIONES/2026-08-15_EVALUACION-SEMANAL-CASO-INTEGRADOR-01.md`
7. `EVALUACIONES/2026-08-15_RESPUESTAS-CASO-INTEGRADOR-01.md`
8. `RESUMENES/2026-08-15_RESUMEN-SEMANAL-POR-MATERIA.md`
9. `RESUMENES/2026-08-15_CIERRE-CASO-INTEGRADOR-01.md`
10. `99-MANIFIESTO-PREPARACION-2026-08-15.md`

---

# 5. Caso integrador

## Dominio

SIGO Móvil para registrar ejecuciones de Órdenes de Trabajo.

## Funcionalidades integradoras

- registro de ejecución;
- funcionamiento sin conexión;
- Cola FIFO de pendientes;
- Pila LIFO para deshacer cambios;
- trazabilidad de intentos;
- notificaciones polimórficas;
- auditoría mediante interfaz;
- DER y normalización;
- arquitectura móvil-servidor;
- medición analógica opcional y muestreo.

---

# 6. Recuperaciones incorporadas

```text
E-038 / simbología DER
E-040 / alternativo sin cambiar objetivo
E-041 / contrato del TDA e implementación
E-042 / Pila, Cola y trazabilidad
E-043 / información, fórmula y unidades
E-044 / parámetros de señal y muestreo
E-045 / digitalización, política y supuestos
```

Más los errores provisionales del Día 9:

```text
toString() literal
String comparado con ==
validación que no detiene
código polimórfico incompleto
dependencias parciales de 2FN
numero_ot confundido con id_ot
PK artificial confundida con normalización
```

---

# 7. Evaluación

La evaluación sigue la distribución del plan:

| Área | Puntaje |
|---|---:|
| Análisis y Diseño | 20 |
| POO | 20 |
| Estructuras | 15 |
| Base de Datos | 15 |
| Comunicaciones | 15 |
| Escritura y defensa | 15 |
| **Total** | **100** |

**Aprobación orientativa:** 70/100.

Se agregaron criterios específicos para:

- mantener el objetivo del caso;
- declarar supuestos;
- usar fórmulas y unidades;
- demostrar polimorfismo;
- aplicar 1FN, 2FN y 3FN;
- diferenciar FIFO y trazabilidad.

---

# 8. Decisiones documentales

1. No se modifican archivos canónicos de cierre.
2. No se asigna nota.
3. No se marca el caso como resuelto.
4. No se considera completado el Día 9.
5. Las respuestas permanecen vacías hasta que las produzca el estudiante.
6. El mapa de integración funciona como guía, no como respuesta entregada.
7. El caso puede dividirse entre sábado y domingo si aparece cansancio.
8. La nota del caso integrador y la nota del Día 9 deben mantenerse separadas.
9. Los errores se actualizan después de evaluar, no durante la preparación.

---

# 9. Archivos canónicos protegidos

No se modificaron:

- `03-ESTADO-ACTUAL.md`;
- `04-MATRIZ-DE-PROGRESO.md`;
- `05-REGISTRO-DIARIO.md`;
- `06-ERRORES-Y-RECUPERACIONES.md`;
- `99-MANIFIESTO-CIERRE.md`.

---

# 10. Inicio de la jornada

Comando sugerido:

> **Iniciar EFIP — 2026-08-15 — Caso integrador 1**

---

# 11. Cierre posterior

Después de resolver:

```text
respuestas originales
→ corrección
→ evaluación 100 puntos
→ defensa
→ resumen semanal
→ errores
→ estado/matriz/registro/manifiesto
```

Hasta entonces, este manifiesto representa únicamente la preparación.
