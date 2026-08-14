# Estado parcial — EFIP I — Día 9

**Fecha:** 14/08/2026  
**Jornada:** Diseño + Abstracción/Polimorfismo + Normalización  
**Estado:** **EN PAUSA**  
**Último cierre oficial:** Día 8 — 7,9/10 — APROBADO  
**Evaluación Día 9:** pendiente  
**Defensa Día 9:** pendiente

---

## Alcance de este archivo

Este documento registra el avance del Día 9 sin modificar el estado académico canónico. No asigna nota ni declara aprobación.

---

## Avance confirmado

### Análisis y Diseño

- análisis vs. diseño vs. implementación;
- propósito del modelo de diseño;
- elementos más próximos a implementación;
- servicios, repositorios y Cola de sincronización;
- participante, línea de vida, mensaje y foco de control;
- orden temporal de una secuencia;
- alternativo por falta de conexión;
- FIFO como necesidad y Cola como decisión de diseño.

### POO / Java

- abstracción vs. encapsulamiento;
- clase abstracta;
- método abstracto;
- constructor de clase abstracta;
- interfaz;
- `extends`;
- `implements`;
- sobrescritura;
- polimorfismo;
- referencia general y objeto concreto;
- código parcial de canales de notificación.

### Base de Datos

- objetivo de la normalización;
- anomalías de inserción, modificación y borrado;
- 1FN y valores atómicos;
- tabla `OPERARIO_TELEFONO`;
- 2FN y dependencias parciales, con recuperación;
- 3FN y dependencia transitiva;
- esquema final con `SECTOR`, `ORDEN_TRABAJO`, `OPERARIO`, `OPERARIO_TELEFONO` y `ASIGNACION_OT`;
- ID artificial frente a normalización.

---

## Pendientes

1. Caso integrador.
2. Diagrama de estados escrito por el estudiante.
3. Corrección completa del código Java.
4. Evaluación escrita.
5. Defensa oral.
6. Cierre documental canónico.

---

## Recuperaciones todavía activas

```text
I(E)=log₂(1/P(E))
Unidad=bits

Generalización UML
→ triángulo vacío hacia el padre

toString()
→ Object
→ representación textual con valores reales

String
→ no comparar contenido con ==

2FN
→ datos de OT dependen de id_ot
→ datos de Operario dependen de id_operario
→ estado_asignacion depende de la clave completa

PK artificial
→ no normaliza automáticamente
```

---

## Continuación prevista

**Domingo 16/08/2026**

> **Recuperar EFIP — 2026-08-16 — completar Día 9**

---

## Regla documental

Hasta completar la evaluación y la defensa no deben actualizarse como cierre:

- `03-ESTADO-ACTUAL.md`;
- `04-MATRIZ-DE-PROGRESO.md`;
- `05-REGISTRO-DIARIO.md`;
- `06-ERRORES-Y-RECUPERACIONES.md`;
- `99-MANIFIESTO-CIERRE.md`.
