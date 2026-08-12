# Plantilla académica de caso de uso — Día 7

**Fecha:** 12/08/2026  
**Uso:** captura, especificación, validación y trazabilidad de casos de uso

---

# 1. Identificación

| Campo | Contenido |
|---|---|
| Código | |
| Nombre verbal | |
| Paquete/módulo | |
| Prioridad | Alta / Media / Baja |
| Tipo | Esencial / Soporte |
| Naturaleza | Concreto / Abstracto |
| Versión | |
| Estado | Borrador / En revisión / Aprobado |

## Regla del nombre

```text
Verbo en infinitivo + objeto/resultado
```

Ejemplo:

```text
Crear Orden de Trabajo
```

---

# 2. Objetivo y valor

## Objetivo


## Resultado de valor para el actor


## Requerimientos relacionados

| Código | Tipo | Descripción breve |
|---|---|---|
| | RF/RNF/RN | |
| | | |

---

# 3. Actores

## Actor principal

| Actor | Rol | Responsabilidad | Por qué inicia/participa |
|---|---|---|---|
| | | | |

## Actores secundarios

| Actor | Rol/interacción |
|---|---|
| | |
| | |

## Sistemas externos

| Sistema externo | Intercambio esperado |
|---|---|
| | |

---

# 4. Límite del sistema

## Dentro del sistema

-

## Fuera del sistema

-

## Supuestos de alcance

1.
2.
3.

---

# 5. Disparador

Evento que inicia el caso:


---

# 6. Precondiciones

Estados que deben ser verdaderos antes de comenzar:

1.
2.
3.

No escribir aquí pasos del flujo.

---

# 7. Postcondiciones

## Éxito

1.
2.
3.

## Fallo o cancelación

1.
2.

---

# 8. Flujo principal

| Paso | Actor | Sistema |
|---:|---|---|
| 1 | | |
| 2 | | |
| 3 | | |
| 4 | | |
| 5 | | |
| 6 | | |
| 7 | | |
| 8 | | |

Reglas:

- mantener orden temporal;
- separar acciones del actor y responsabilidades del sistema;
- describir qué ocurre, no detalles innecesarios de implementación;
- terminar con resultado observable.

---

# 9. Flujos alternativos

## Alternativo A — título

**Se inicia desde el paso:**  
**Condición:**

| Paso | Acción |
|---:|---|
| A1 | |
| A2 | |
| A3 | |

**Retorno al flujo:**

## Alternativo B — título

**Se inicia desde el paso:**  
**Condición:**

| Paso | Acción |
|---:|---|
| B1 | |
| B2 | |

**Retorno al flujo:**

---

# 10. Excepciones

## Excepción E1 — título

**Se detecta en el paso:**  
**Causa:**

| Paso | Respuesta del sistema |
|---:|---|
| E1.1 | |
| E1.2 | |

**Postcondición de fallo:**

---

# 11. Relaciones UML

## Asociación actor–caso

| Actor | Caso de uso | Justificación |
|---|---|---|
| | | |

## `include`

| Caso base | Caso incluido | Por qué es obligatorio | Dirección verificada |
|---|---|---|---|
| | | | base → incluido |

## `extend`

| Caso de extensión | Caso base | Condición | Dirección verificada |
|---|---|---|---|
| | | | extensión → base |

## Generalización

| Hijo | Padre | Comportamiento heredado/especializado |
|---|---|---|
| | | |

---

# 12. Reglas de negocio

| Código | Regla | Paso afectado |
|---|---|---:|
| RN- | | |
| RN- | | |

---

# 13. Requerimientos no funcionales del caso

| Código | Categoría | Condición medible | Forma de verificación |
|---|---|---|---|
| RNF- | | | |
| RNF- | | | |

---

# 14. Prototipo textual

```text
[TÍTULO DE PANTALLA]

Campo 1: [____________]
Campo 2: [____________]
Campo 3: [____________]

[Acción principal] [Cancelar]
```

## Correspondencia con el flujo

| Elemento de interfaz | Paso del caso | Obligatorio/opcional |
|---|---:|---|
| | | |

## Mensajes de validación

1.
2.
3.

---

# 15. Trazabilidad

```text
Necesidad:
RF/RNF/RN:
Caso de uso:
Clase/método:
Entidad/tabla:
Caso de prueba:
```

| Origen | Destino | Evidencia |
|---|---|---|
| Necesidad | Requerimiento | |
| Requerimiento | Caso de uso | |
| Caso de uso | Diseño/clases | |
| Caso de uso | DER/tablas | |
| Caso de uso | Prueba | |

---

# 16. Validación

## Lista de control

- [ ] El nombre comienza con verbo y expresa un objetivo.
- [ ] El actor es un rol externo.
- [ ] El caso entrega un resultado de valor.
- [ ] El límite está claro.
- [ ] Las precondiciones son estados, no pasos.
- [ ] El flujo principal está ordenado.
- [ ] Los alternativos indican condición y retorno.
- [ ] Las excepciones tienen una salida definida.
- [ ] Las postcondiciones son observables.
- [ ] `include` es obligatorio y apunta base → incluido.
- [ ] `extend` es opcional y apunta extensión → base.
- [ ] La generalización apunta hijo → padre.
- [ ] Los RNF son verificables.
- [ ] Existe trazabilidad.

## Preguntas al usuario

1.
2.
3.
4.
5.

---

# 17. Aprobación

| Rol | Nombre | Decisión | Fecha |
|---|---|---|---|
| Usuario/representante | | Aprobar / Corregir | |
| Analista | | Completo / Pendiente | |
| Revisor | | Consistente / Inconsistente | |
