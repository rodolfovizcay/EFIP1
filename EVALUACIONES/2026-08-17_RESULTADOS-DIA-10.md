# Resultados — Evaluación Día 10
## Arquitectura + Lista simple + Nivel físico

**Fecha:** 17/08/2026  
**Estado:** aprobado con recuperación selectiva completada

---

# 1. Modalidad realmente aplicada

La jornada no utilizó el instrumento preparado de `8 puntos escritos + 2 puntos de defensa` en su formato original. Se aplicó:

1. recuperación inicial de doce preguntas;
2. recuperación breve de cinco consignas;
3. actividades guiadas por concepto;
4. evaluación integradora de diez preguntas;
5. recuperación selectiva final de cuatro consignas.

Por integridad académica no se inventa un desglose por bloques ni se registra una defensa formal inexistente.

---

# 2. Resultado

```text
Evaluación integradora = 8,5/10
Recuperación selectiva final = 4/4
Resultado = APROBADO
```

La recuperación corrigió completamente los errores bloqueantes de la evaluación: implementación frente a despliegue, switch/router con PDU y dirección, y consecuencia negativa frente a riesgo.

---

# 3. Evidencia por bloque

| Bloque | Evidencia alcanzada | Estado |
|---|---|---|
| Arquitectura | decisiones, alternativas, RNF, consecuencias, riesgos, subsistemas, interfaces, dependencias y vistas | Aprobado |
| Lista simple | cabeza, nodo, inserción, recorrido, búsqueda, eliminación y complejidad | Aprobado en núcleo |
| Nivel físico | medios, UTP, trenzado, blindaje, fibra y dispositivos C1–C3 | Aprobado en núcleo |
| Integración | caso de sincronización y elección de medio aplicados | Aprobado con guía |

---

# 4. Aciertos

- arquitectura definida como decisiones y no como lista de tecnologías;
- alta cohesión y bajo acoplamiento explicados;
- interfaces utilizadas para ocultar implementación;
- inserción y búsqueda en Lista resueltas;
- eliminación recuperada correctamente;
- complejidades básicas correctas;
- medios guiados/no guiados clasificados;
- fibra correctamente elegida frente a interferencia eléctrica;
- switch y router recuperados por capa, PDU y dirección.

---

# 5. Errores corregidos

- repetir la opción elegida dentro de alternativas;
- reducir consecuencia a beneficio;
- invertir implementación y despliegue;
- suponer que `cabeza` era un nodo adicional con dato cero;
- no avanzar `cabeza` al eliminar el primer nodo;
- enlazar el anterior nuevamente con el nodo eliminado;
- mezclar nombres de capas OSI y TCP/IP;
- omitir MAC/IP al describir switch/router.

---

# 6. Cobertura no demostrada

Los siguientes contenidos estaban preparados, pero no obtuvieron evidencia suficiente y no se elevan en la matriz:

- código Java completo de Lista;
- inserción al final y modificación;
- atenuación, ruido, dispersión y latencia;
- gateway, firewall/VPN por implementación;
- módem, interfaces físicas y última milla;
- caso integrador completo previsto.

---

# 7. Decisión

El Día 10 se cierra y aprueba por la evaluación real `8,5/10` y la recuperación final `4/4`. Los faltantes se reprograman; no obligan a repetir toda la jornada.
