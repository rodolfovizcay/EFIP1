# Evaluación Día 2 — Análisis y Diseño + POO

**Fecha:** 6/8/2026  
**Tiempo recomendado:** 25–35 minutos  
**Puntaje:** 10 puntos  
**Sin apuntes.**

---

# Parte A — Análisis y Diseño — 5 puntos

## A1. Modelo y metodología — 1 punto

Definí:

- modelo;
- metodología;
- técnica;
- herramienta.

No uses más de dos oraciones por concepto.

## A2. Modelos de proceso — 1 punto

Elegí el modelo más adecuado y justificá:

a. El cliente no puede expresar con claridad la interfaz que necesita.

b. Los requisitos están estables y se exige una ejecución secuencial.

c. Se necesita entregar primero un núcleo útil y agregar funciones después.

## A3. PUD — 1,5 puntos

Explicá:

- dirigido por casos de uso;
- centrado en la arquitectura;
- iterativo e incremental.

## A4. Fases — 1 punto

Relacioná:

```text
Inicio
Elaboración
Construcción
Transición
```

con:

```text
Línea base de arquitectura
Alcance y viabilidad
Producto completo
Beta, correcciones y formación
```

## A5. Iteración e incremento — 0,5 puntos

Explicá la diferencia usando un ejemplo del proyecto SIGO.

---

# Parte B — POO — 5 puntos

## B1. Fundamentos — 1 punto

Definí:

- clase;
- objeto;
- estado;
- comportamiento;
- identidad.

## B2. Constructor y encapsulamiento — 1 punto

Explicá:

- qué hace un constructor;
- por qué se usan atributos privados;
- por qué un setter no debería aceptar cualquier valor.

## B3. Recuperación — 1 punto

Diferenciá:

- estado y visibilidad;
- sobrecarga y sobrescritura.

## B4. Código — 2 puntos

Escribí una clase Java de entre 15 y 25 líneas:

```text
OrdenTrabajo
```

Debe contener:

- atributos privados `id`, `descripcion`, `prioridad`, `estado`;
- constructor;
- método `iniciar()`;
- método `cambiarPrioridad(String nuevaPrioridad)`;
- getter de estado.

El método `cambiarPrioridad` debe aceptar solamente:

```text
BAJA
MEDIA
ALTA
```

No se exige una excepción propia; puede usarse una validación simple.

---

# Parte C — Defensa oral

No suma puntos adicionales, pero determina si el tema alcanza estado `Defendible oralmente`.

Responder durante cinco minutos:

> Explicá cómo el PUD organizaría el desarrollo de un módulo de órdenes de trabajo y cómo una clase `OrdenTrabajo` representa estado, comportamiento, identidad y encapsulamiento.

---

# Rúbrica

| Criterio | Puntos |
|---|---:|
| Conceptos académicos correctos | 3 |
| Diferencias terminológicas | 2 |
| Aplicación al proyecto | 2 |
| Código Java | 2 |
| Claridad y justificación | 1 |

## Interpretación

- 8–10: defendible.
- 7–7,9: aprobado, falta fluidez.
- 6–6,9: inestable.
- Menos de 6: recuperación obligatoria.
