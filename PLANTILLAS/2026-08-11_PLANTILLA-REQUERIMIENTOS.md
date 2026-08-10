# Plantilla académica de requerimientos — Día 6

**Fecha:** 11/08/2026  
**Uso:** elicitación, especificación, validación y trazabilidad

---

# 1. Contexto

## Problema observado


## Objetivo del sistema o funcionalidad


## Usuarios o partes involucradas


## Alcance incluido


## Fuera de alcance


---

# 2. Elicitación

## Fuente principal

- [ ] Entrevista.
- [ ] Cuestionario.
- [ ] Observación.
- [ ] Análisis de documentos.
- [ ] Tormenta de ideas.
- [ ] Otra:

## Persona/rol consultado


## Necesidad expresada originalmente


## Preguntas realizadas

1.
2.
3.
4.
5.

## Restricciones del entorno detectadas

1.
2.
3.

## Términos del dominio que requieren definición

| Término | Definición acordada |
|---|---|
| | |
| | |
| | |

---

# 3. Requerimientos funcionales

Usar preferentemente:

```text
El sistema deberá + verbo + objeto + condición/resultado.
```

| Código | Fuente | Descripción | Prioridad | Criterio de aceptación |
|---|---|---|---|---|
| RF-01 | | | | |
| RF-02 | | | | |
| RF-03 | | | | |
| RF-04 | | | | |
| RF-05 | | | | |

---

# 4. Requerimientos no funcionales

Evitar palabras no medibles como “rápido”, “seguro” o “fácil” sin indicar condición verificable.

| Código | Categoría | Descripción | Fuente | Método de verificación |
|---|---|---|---|---|
| RNF-01 | Rendimiento | | | |
| RNF-02 | Seguridad | | | |
| RNF-03 | Fiabilidad/Disponibilidad | | | |
| RNF-04 | Plataforma/Portabilidad | | | |
| RNF-05 | Otra | | | |

---

# 5. Reglas de negocio

| Código | Regla | Justificación | Excepción conocida |
|---|---|---|---|
| RN-01 | | | |
| RN-02 | | | |
| RN-03 | | | |
| RN-04 | | | |

---

# 6. Validación de calidad

Evaluar cada requerimiento importante.

| Código | Correcto | Consistente | Completo | Realista | Necesario | Verificable | Rastreable | Ajuste necesario |
|---|:---:|:---:|:---:|:---:|:---:|:---:|:---:|---|
| | [ ] | [ ] | [ ] | [ ] | [ ] | [ ] | [ ] | |
| | [ ] | [ ] | [ ] | [ ] | [ ] | [ ] | [ ] | |
| | [ ] | [ ] | [ ] | [ ] | [ ] | [ ] | [ ] | |
| | [ ] | [ ] | [ ] | [ ] | [ ] | [ ] | [ ] | |

## Significado de las comprobaciones

```text
Correcto    → representa una necesidad real y no contiene errores.
Consistente → no contradice otros requerimientos.
Completo    → incluye la información necesaria.
Realista    → puede realizarse con recursos y tecnología disponibles.
Necesario   → su ausencia produciría una deficiencia.
Verificable → puede comprobarse mediante prueba o medición.
Rastreable  → se conoce su origen y sus artefactos relacionados.
```

---

# 7. Contradicciones u omisiones encontradas

| Hallazgo | Requerimientos afectados | Acción de resolución |
|---|---|---|
| | | |
| | | |
| | | |

---

# 8. Trazabilidad inicial

| Necesidad/Fuente | Requerimiento | Caso o proceso relacionado | Diseño/Componente previsto | Prueba futura |
|---|---|---|---|---|
| | | | | |
| | | | | |
| | | | | |

> En el Día 6 no es obligatorio desarrollar todavía el caso de uso completo. La columna se conserva para demostrar rastreabilidad y será profundizada en la jornada siguiente.

---

# 9. Ejercicio obligatorio del Día 6

Caso:

> Un operario modifica datos de una Orden de Trabajo desde un dispositivo móvil. Antes de confirmar, debe poder deshacer la última modificación. Una vez confirmada la operación, no podrá deshacerse desde esa sesión. El servidor debe procesar la solicitud y devolver el estado actualizado.

Producir:

- 4 RF;
- 4 RNF;
- 3 reglas de negocio;
- una pregunta de elicitación por cada ambigüedad;
- criterio de aceptación para cada RF;
- al menos una contradicción hipotética y su resolución;
- trazabilidad inicial.

---

# 10. Autoevaluación

1. ¿Separé necesidades de decisiones técnicas?
2. ¿Cada RF contiene una función observable?
3. ¿Cada RNF puede medirse o verificarse?
4. ¿Las reglas de negocio pertenecen al dominio?
5. ¿Hay palabras ambiguas?
6. ¿Dos requerimientos se contradicen?
7. ¿Se conoce la fuente de cada requerimiento?
8. ¿Podría diseñarse una prueba para demostrar su cumplimiento?
9. ¿El alcance está claro?
10. ¿Expliqué por qué cada requerimiento es necesario?
