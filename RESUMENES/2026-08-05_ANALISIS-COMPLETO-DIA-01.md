# Análisis completo del Día 1 — Diagnóstico general

**Fecha:** 5 de agosto de 2026  
**Condición:** diagnóstico completo de las cinco materias y una situación integradora.  
**Importante:** estas notas no predicen automáticamente la nota del EFIP. Su función es distribuir el estudio.

---

## 1. Resultado cuantitativo

| Materia | Nota diagnóstica | Estado inicial |
|---|---:|---|
| Análisis y Diseño | 4,75/10 | En aprendizaje |
| Programación Orientada a Objetos | 5,5/10 | En aprendizaje |
| Algoritmos y Estructuras | 7/10 | Comprendido con ajustes |
| Base de Datos | 6/10 | Comprendido en la práctica |
| Comunicaciones | 4,75/10 | En aprendizaje |
| **Promedio** | **5,6/10** | Línea de base |

La situación integradora obtuvo aproximadamente **5,5/10**: se identificaron decisiones válidas de las cinco materias, pero faltó profundidad en modelado, relaciones, justificación y alcance.

---

## 2. Conclusión central

La principal brecha no es la capacidad de resolver problemas. La brecha es convertir la experiencia práctica en una respuesta académica, completa y defendible.

El patrón observado fue:

1. Se reconoce el concepto general.
2. Se propone una solución práctica razonable.
3. Faltan el nombre académico exacto, la diferencia con conceptos cercanos o la justificación.
4. En casos integradores se identifica la entidad o componente principal, pero se simplifica demasiado el sistema completo.

Por eso, el método de estudio debe trabajar siempre en cuatro capas:

```text
Definición académica
Diferencia con conceptos cercanos
Ejemplo propio
Justificación de la decisión
```

---

## 3. Análisis por materia

### 3.1 Análisis y Diseño — 4,75/10

#### Fortalezas

- Se comprende que el PUD organiza el desarrollo.
- Se reconoce que los casos de uso son centrales.
- Se clasificaron correctamente RF y RNF.
- Se comprendió la idea general de `include` y `extend`.
- Existe experiencia real documentando proyectos.

#### Brechas

- Se confundió arquitectura con documentación.
- Se mezclaron asociación, agregación, composición, dependencia y herencia.
- La diferencia entre iteración e incremento fue expresada de manera imprecisa.
- En la situación integradora faltaron actores, arquitectura, modelos y trazabilidad.

#### Prioridad

**Alta.** Es una materia en la que la experiencia ayuda mucho, pero la terminología puede definir el resultado del oral.

---

### 3.2 Programación Orientada a Objetos — 5,5/10

#### Fortalezas

- Se comprende la utilidad de una clase abstracta.
- Se interpretó correctamente el código con `Trabajo` y `Reparacion`.
- Se reconoció la implementación del método abstracto.
- Se comprende el uso de clases para modelar el dominio.

#### Brechas

- Estado se confundió con visibilidad o mutabilidad.
- Objeto se definió como “primera instancia” en lugar de cualquier instancia.
- No se recordó sobrecarga frente a sobrescritura.
- Se utilizó polimorfismo en la explicación, pero no se nombró formalmente.
- En la integración se propusieron atributos, pero faltó comportamiento y encapsulamiento.

#### Prioridad

**Media-alta.** No hace falta practicar sintaxis elemental durante horas; sí hay que fijar conceptos, estructura de clases y fragmentos breves de Java.

---

### 3.3 Algoritmos y Estructuras — 7/10

#### Fortalezas

- LIFO y FIFO bien comprendidos.
- Buena noción de arreglo, nodos y lista enlazada.
- Inserción al inicio comprendida gráficamente.
- Se recuerda la estrategia de división de mergesort y el pivote de quicksort.

#### Brechas

- Faltó expresar formalmente los cambios de referencias.
- Las complejidades se recordaron de forma incompleta.
- Se eligió un arreglo para órdenes pendientes por facilidad de recorrido, sin analizar la regla de prioridad y fecha.
- Falta comparar estructuras según operaciones dominantes.

#### Prioridad

**Media.** Es la mejor materia del diagnóstico; conviene consolidarla y no sobredimensionar sus horas.

---

### 3.4 Base de Datos — 6/10

#### Fortalezas

- Se detectó correctamente la redundancia de la estructura `VENTA`.
- Se propusieron correctamente `CLIENTE`, `PRODUCTO`, `VENTA` y `DETALLE_VENTA`.
- Se diferenciaron bien `WHERE`, `GROUP BY` y `HAVING`.
- La experiencia práctica permite diseñar soluciones rápidamente.

#### Brechas

- Relación, tupla, dominio, grado y cardinalidad no estaban consolidados.
- Se confundió grado con normalización y cardinalidad con orden.
- Faltó clasificar `GRANT` y `COMMIT`.
- En la integración se propuso solo `ORDEN_TRABAJO`, sin modelar operarios, sectores y asignaciones.

#### Prioridad

**Media.** El estudio debe centrarse en términos formales, álgebra, normalización y sublenguajes SQL, no en ejercicios laborales rutinarios.

---

### 3.5 Comunicaciones — 4,75/10

#### Fortalezas

- Se diferencia en general OSI de TCP/IP.
- Se reconoce al switch en capa 2 y al router en capa 3.
- Se comprende LAN, acceso móvil y medios guiados/no guiados.
- Hay una base práctica suficiente para recuperar rápidamente la materia.

#### Brechas

- No se recordaron las siete capas en orden.
- “Seguridad” fue tratada como capa.
- Síncrona/asíncrona se mezcló con retransmisión y control de errores.
- Faltó separar función de router, direccionamiento IP y servicio DHCP.
- La decisión de red se expresó como dispositivos aislados y no como arquitectura cliente-servidor.

#### Prioridad

**Alta.** Requiere recuperación sistemática, aunque la materia sea reciente.

---

## 4. Patrones transversales detectados

### 4.1 Resolución práctica superior a terminología

El estudiante suele saber qué haría, pero no siempre cómo se denomina académicamente.

**Tratamiento:** después de cada respuesta práctica se debe producir una formulación de examen de entre 2 y 4 oraciones.

### 4.2 Conceptos cercanos se mezclan

Ejemplos:

- arquitectura / documentación;
- agregación / composición / herencia;
- estado / visibilidad;
- sobrecarga / sobrescritura;
- grado / cardinalidad;
- sincronización / retransmisión.

**Tratamiento:** usar tablas comparativas y preguntas de contraste.

### 4.3 Falta formalizar pasos

La idea gráfica de insertar `X` antes de `A` era correcta, pero faltó declarar:

```text
X.siguiente = cabeza
cabeza = X
```

**Tratamiento:** explicar siempre qué referencia, atributo, fase o capa cambia y en qué orden.

### 4.4 Simplificación excesiva en casos

En la integración se propuso una clase, una tabla y un router, cuando el caso exigía relaciones entre varios elementos.

**Tratamiento:** aplicar siempre esta secuencia:

```text
Actores → Casos de uso → Conceptos del dominio → Clases
→ Estructuras → Entidades y relaciones → Arquitectura de comunicaciones
```

### 4.5 Escritura rápida

Los errores ortográficos y de tipeo no se consideran errores conceptuales, pero pueden volver ambigua una respuesta escrita.

**Tratamiento:** reservar los últimos 2 minutos de cada ejercicio para revisar:

- nombres de conceptos;
- negaciones;
- dirección de relaciones;
- sintaxis mínima;
- claridad de la justificación.

---

## 5. Clasificación de los 12 errores abiertos

| Grupo | Errores | Tratamiento |
|---|---|---|
| Terminología académica | E-001, E-003, E-007, E-008, E-009 | Definición + ejemplo |
| Diferencias conceptuales | E-002, E-004, E-010 | Tabla comparativa |
| Formalización de algoritmos | E-005, E-006 | Pasos y referencias |
| Selección y alcance de solución | E-011, E-012 | Justificación desde requisitos |

Ningún error se considera consolidado todavía. Se cerrará únicamente después de una recuperación sin apuntes.

---

## 6. Ajuste del plan

Se mantiene el estudio de las cinco materias, pero los bloques de recuperación se distribuirán así:

1. Análisis y Diseño.
2. Comunicaciones.
3. POO.
4. Base de Datos.
5. Algoritmos y Estructuras.

No se reduce Estructuras ni Base de Datos: se les asigna menos recuperación porque ya tienen una base práctica mayor.

---

## 7. Método de respuesta desde el Día 2

### Para una definición

```text
Concepto:
Definición académica:
Ejemplo:
Diferencia importante:
```

### Para elegir una solución

```text
Requisito:
Decisión:
Justificación:
Alternativa descartada:
```

### Para un fragmento Java

```text
Clase:
Estado:
Comportamiento:
Constructor:
Encapsulamiento:
```

### Para una defensa oral

1. Definir.
2. Aplicar al caso.
3. Justificar.
4. Comparar con una alternativa.

---

## 8. Objetivo inmediato

El Día 2 debe recuperar cuatro brechas del diagnóstico:

- arquitectura no es documentación;
- iteración no es incremento;
- estado no es visibilidad;
- sobrecarga no es sobrescritura.

Y debe incorporar los temas previstos:

- modelos y metodologías;
- características y fases del PUD;
- clase y objeto;
- estado, comportamiento e identidad;
- constructores y encapsulamiento.
