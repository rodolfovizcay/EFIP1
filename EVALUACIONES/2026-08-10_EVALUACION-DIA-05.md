# Evaluación Día 5
## PUD + fundamentos de POO + modelo relacional

**Fecha:** 10/08/2026  
**Modalidad:** sin apuntes  
**Tiempo escrito:** 40–45 minutos  
**Defensa oral:** 8–10 minutos  
**Puntaje total:** 10 puntos

---

# Parte A — Evaluación escrita — 8 puntos

## 1. Modelo — 0,6 puntos

Definí qué es un modelo y explicá dos razones por las que se modela.

## 2. Metodología, método, técnica y herramienta — 0,8 puntos

Diferenciá los cuatro conceptos. No alcanza con enumerarlos.

## 3. PUD — 1 punto

Explicá:

- por qué está dirigido por casos de uso;
- por qué está centrado en la arquitectura;
- qué significa iterativo e incremental.

## 4. Iteración, incremento y fases — 0,8 puntos

a. Diferenciá iteración de incremento.  
b. Indicá el propósito principal de Inicio, Elaboración, Construcción y Transición.

---

## 5. Clase, objeto y propiedades — 0,8 puntos

Definí clase y objeto. Después explicá estado, comportamiento e identidad mediante un mismo ejemplo.

## 6. Constructor y encapsulamiento — 0,7 puntos

Explicá qué hace un constructor, para qué se utiliza `this` y por qué el encapsulamiento suele combinar atributos privados con métodos públicos.

## 7. Java — 1,5 puntos

Escribí una clase `OrdenTrabajo` que incluya:

- `numero`;
- `descripcion`;
- `estado`;
- atributos privados;
- constructor con parámetros;
- uso correcto de `this`;
- método `getEstado()`;
- método `cambiarEstado(...)`;
- método booleano `estaPendiente()`.

No se evalúa sofisticación. Se evalúan concepto, coherencia y sintaxis mínima.

---

## 8. Estructura tabular — 0,8 puntos

Definí:

- relación;
- cabecera;
- cuerpo;
- tupla;
- atributo;
- dominio;
- grado;
- cardinalidad.

## 9. Claves — 0,6 puntos

Diferenciá:

- superclave;
- clave candidata;
- clave primaria;
- clave foránea.

## 10. Aplicación relacional — 0,4 puntos

Dada:

```text
ORDEN_TRABAJO(
    id_ot,
    descripcion,
    prioridad,
    estado,
    id_sector
)
```

y suponiendo 250 filas, indicá:

- grado;
- cardinalidad;
- primaria probable;
- foránea probable y relación que debería referenciar;
- dominio posible de `prioridad`;
- una tupla válida.

---

# Parte B — Defensa oral — 2 puntos

Responder durante 8–10 minutos:

> Explique cómo un caso de uso del PUD puede conducir a una clase Java y a una relación de base de datos para el mismo concepto del dominio. Diferencie claramente los tres modelos y justifique las decisiones.

Debe incluir:

1. PUD y sus tres características;
2. iteración e incremento;
3. clase y objeto;
4. estado, comportamiento e identidad;
5. constructor y encapsulamiento;
6. relación, tupla, dominio, grado y cardinalidad;
7. claves;
8. memoria frente a persistencia;
9. ejemplo aplicado;
10. orden y terminología académica.

---

# Rúbrica

| Criterio | Máximo |
|---|---:|
| Comprensión conceptual | 3 |
| Terminología académica | 2 |
| Aplicación práctica | 3 |
| Justificación oral | 2 |
| **Total** | **10** |

---

# Criterio de resultado

- Menor a 6: recuperación obligatoria.
- De 6 a 6,9: aprobado débil; repetir ejercicios centrales.
- De 7 a 7,9: aprobado; repaso dirigido.
- De 8 a 10: aprobado sólido sobre el alcance trabajado; mantener mediante recuperación espaciada.

Un resultado alto no implica que las materias completas estén cerradas. Solo evalúa el alcance del Día 5.

---

# Recuperación espaciada — no suma a la nota principal

Responder brevemente:

1. ¿Qué es un TDA?
2. ¿Qué diferencia existe entre sobrecarga y sobrescritura?
3. ¿Qué es una PDU?
4. ¿Qué identifica un puerto?
5. ¿Qué diferencia existe entre transmisión síncrona y asíncrona?
