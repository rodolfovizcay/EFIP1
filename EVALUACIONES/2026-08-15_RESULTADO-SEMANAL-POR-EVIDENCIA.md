# Resultado semanal por evidencia acumulada
## Semana intensiva 1 — 10/08 al 16/08/2026

**Cierre inicial:** 15/08/2026  
**Actualización:** 16/08/2026  
**Modalidad:** evaluación acumulada; sin examen semanal adicional  
**Estado:** **SEMANA CERRADA — NIVEL ALTO / APROBADO**

---

## 1. Decisión metodológica

El estudiante decidió no realizar la evaluación semanal adicional de 100 puntos porque durante la semana ya completó evaluaciones escritas, defensas, recuperaciones y ejercicios integradores suficientes para estimar su nivel.

El 16/08 se completó además el componente escrito del Día 9 y se decidió cerrar ese día sin defensa oral.

Este documento:

- no inventa respuestas de exámenes no rendidos;
- no asigna una nota formal al Caso integrador 1;
- no asigna una nota global al Día 9;
- calcula el indicador semanal con evaluaciones completas y comparables;
- registra el escrito del Día 9 como evidencia temática adicional;
- complementa el indicador con evidencia cualitativa por materia.

---

## 2. Evidencia cuantitativa comparable

| Jornada cerrada con modalidad completa | Resultado |
|---|---:|
| Día 5 — PUD + POO + modelo relacional | 9,0/10 |
| Día 6 — Requisitos + Pilas + OSI/TCP-IP | 9,2/10 |
| Día 7 — Casos de uso + Herencia + DER | 8,3/10 |
| Día 8 — Modelo de análisis + Colas + Transmisión | 7,9/10 |

Cálculo:

```text
(9,0 + 9,2 + 8,3 + 7,9) / 4
= 34,4 / 4
= 8,6
```

```text
Indicador semanal de evaluaciones completas = 8,6/10
```

> El 8,6 es un promedio descriptivo de evidencias comparables. No constituye una quinta evaluación ni una nota del examen semanal no realizado.

---

## 3. Evidencia escrita adicional del Día 9

| Parte | Máximo | Obtenido |
|---|---:|---:|
| Modelo de diseño | 2,50 | 1,85 |
| Abstracción/Polimorfismo | 2,50 | 1,55 |
| Normalización | 2,50 | 1,95 |
| Integración | 0,50 | 0,35 |
| **Total escrito** | **8,00** | **5,70** |

```text
Componente escrito Día 9 = 5,70/8,00
Porcentaje = 71,25 %
Equivalencia escrita = 7,1/10
Defensa oral = no realizada
Nota global Día 9 = no asignada
```

Este resultado no se incorpora al promedio 8,6 porque la modalidad completa del Día 9 incluía 2 puntos de defensa que no se realizaron.

---

## 4. Evidencia cualitativa adicional

### Día 9 cerrado sin defensa

Se trabajaron y evaluaron por escrito:

- análisis vs. diseño vs. implementación;
- servicios, repositorios, secuencia y estados;
- abstracción y encapsulamiento;
- clase/método abstractos;
- interfaz y polimorfismo;
- código Java parcial;
- anomalías, dependencias, 1FN, 2FN y 3FN;
- integración entre requisitos, diseño, código, datos y pruebas.

### Caso integrador 1 guiado

Se resolvieron de forma interactiva:

- problema, objetivos y requisitos;
- actores, casos de uso, `include`, `extend` y generalización;
- caso detallado con modo sin conexión;
- análisis y diseño;
- Pila, Cola y trazabilidad;
- entidades, cardinalidades, claves y normalización;
- arquitectura TCP/IP y cálculos;
- integración oral de las cinco materias.

La práctica guiada aporta evidencia de aplicación, pero no recibe puntaje formal.

---

## 5. Nivel estimado por materia

| Materia | Nivel | Fundamentación |
|---|---|---|
| Análisis y Diseño | **Alto** | domina PUD, requisitos, casos de uso y análisis; aplica diseño y secuencias con ajustes puntuales |
| POO | **Medio-alto** | comprende encapsulamiento, herencia, abstracción, interfaces y polimorfismo; el código completo todavía necesita práctica |
| Estructuras | **Alto** | Pila y Cola correctamente seleccionadas, simuladas y comparadas |
| Base de Datos | **Medio-alto** | modelo relacional, DER y normalización aplicados; faltan precisión y completitud en PK/FK/UNIQUE |
| Comunicaciones | **Medio-alto** | OSI/TCP-IP, encapsulamiento y cálculos aplicados; supuestos y nivel físico requieren precisión |
| Integración | **Alto en práctica guiada** | conecta las cinco materias y autocorrige decisiones |

---

## 6. Fortalezas de la semana

1. Aplicación de teoría a Órdenes de Trabajo reales.
2. Diferenciación entre requisitos, caso de uso, análisis, diseño e implementación.
3. Pila LIFO y Cola FIFO correctamente justificadas.
4. Secuencia sin conexión segura: consultar, enviar, confirmar, trazar y eliminar.
5. Modelo relacional, DER y normalización hasta 3FN.
6. OSI/TCP-IP, switch/router, información y muestreo.
7. Mejora continua después de correcciones.
8. Capacidad de integración transversal.

---

## 7. Brechas que impiden considerar dominio completo

### Prioridad alta

- código Java completo y compilable;
- constructor y validación de `String`;
- `toString()` y `@Override`;
- entidad asociativa frente a entidad débil;
- modelo relacional final con PK, FK y `UNIQUE` completos.

### Prioridad media

- relaciones UML distintas de generalización;
- subsistema frente a entidad;
- diagrama de estados completo;
- supuestos de transmisión coherentes.

### Temas todavía pendientes del programa

- algoritmos de ordenación y complejidades;
- DCL/TCL y SQL académico;
- `equals/hashCode`, excepciones y archivos;
- nivel físico avanzado, medios y perturbaciones.

El material de repaso se encuentra en:

```text
RESUMENES/2026-08-16_REPASO-SEMANAL-PUNTOS-DEBILES.md
```

---

## 8. Resultado semanal actualizado

```text
Nivel semanal: ALTO
Estado: APROBADO POR EVIDENCIA ACUMULADA
Indicador descriptivo: 8,6/10
Examen semanal de 100 puntos: NO REALIZADO
Nota del Caso integrador 1: NO ASIGNADA
Día 9: CERRADO SIN DEFENSA ORAL
Nota global Día 9: NO ASIGNADA
```

---

## 9. Criterio para continuar

La semana queda cerrada. La próxima etapa no necesita repetir todos los contenidos; debe:

1. utilizar el repaso de puntos débiles;
2. continuar con los temas no recorridos del plan maestro;
3. practicar Java completo en bloques breves;
4. realizar una defensa integral en un simulacro posterior.
