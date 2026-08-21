# Caso integrador — Ordenación y SQL procedimental

## Contexto

SIGO mantiene trabajos pendientes en el teléfono y sincroniza con una base central. Cuando dos trabajos tienen la misma prioridad, debe conservarse el orden de registro.

Datos locales:

```text
A(3), B(1), C(2), D(3), E(2), F(5), G(1), H(4)
```

En la base central, asignar un trabajo debe cambiar su estado y registrar automáticamente el historial.

---

# Parte A — Algoritmo

1. Ordená los trabajos por prioridad con Mergesort.
2. Mostrá las divisiones hasta llegar a casos base.
3. Mostrá las mezclas principales.
4. Indicá el orden final de `A/D`, `C/E` y `B/G`.
5. Justificá si la estabilidad es un requisito relevante.
6. Explicá qué cambiaría si se usara Quicksort habitual.

---

# Parte B — SQL procedimental

1. Indicá qué objeto usarías para asignar un trabajo mediante una operación explícita.
2. Indicá qué objeto usarías para obtener la cantidad de pendientes.
3. Indicá qué objeto usarías para registrar automáticamente un cambio de estado.
4. Ordená el ciclo de un cursor.
5. Explicá por qué una actualización masiva por conjuntos puede ser preferible al cursor.
6. Explicá qué debe suceder si falla el registro de historial.

---

# Parte C — Decisión

Completá:

```text
necesidad:
alternativas:
decisión:
justificación:
consecuencia positiva:
consecuencia negativa segura:
riesgo:
mitigación:
```

La decisión debe elegir entre:

- ordenar localmente antes de mostrar;
- pedir siempre al servidor el orden;
- combinar ambos enfoques.

---

# Criterio de cierre

El caso está resuelto si la respuesta conecta:

```text
prioridad
→ estabilidad del algoritmo
→ operación central
→ transacción
→ historial
→ consistencia observable
```
