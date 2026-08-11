# Estado actual — EFIP I

**Fecha académica registrada:** 11 de agosto de 2026  
**Jornada:** Día 6 — Requisitos + Pilas + OSI/TCP-IP — CERRADO  
**Modalidad evaluada:** escrita + defensa oral integrada  
**Próxima acción:** preparar el Día 7 del 12/08/2026 con Casos de uso + Herencia + DER.

---

## Resultado acumulado

| Materia | Diagnóstico Día 1 | Última evidencia | Estado actual |
|---|---:|---:|---|
| Análisis y Diseño | 4,75/10 | Día 6: evaluación integrada 9,2/10 + oral 9,0/10 | PUD e Ingeniería de Requerimientos aplicados y defendibles en los núcleos trabajados |
| Programación Orientada a Objetos | 5,5/10 | Día 5: evaluación integrada 9,0/10 + oral 9,0/10 | Fundamentos aplicados y defendibles; sintaxis Java en consolidación |
| Algoritmos y Estructuras | 7,0/10 | Día 6: evaluación integrada 9,2/10 + oral 9,0/10 | TDA y Pilas aplicados; LIFO defendible oralmente |
| Base de Datos | 6,0/10 | Día 5: evaluación integrada 9,0/10 + oral 9,0/10 | Modelo relacional y claves aplicados y defendibles |
| Comunicaciones | 4,75/10 | Día 6: evaluación integrada 9,2/10 + oral 9,0/10 | OSI/TCP-IP aplicado y defendible en el recorrido trabajado |

> Las notas de los Días 5 y 6 corresponden a evaluaciones integradas. No deben interpretarse como exámenes individuales completos de cada materia.

---

## Resultado del Día 6

- Evaluación escrita: **7,35/8,00 = 9,2/10**.
- Defensa oral: **1,80/2,00 = 9,0/10**.
- Resultado global: **9,15/10 → 9,2/10 — APROBADO**.
- Materias principales: **Análisis y Diseño + Algoritmos/Estructuras + Comunicaciones**.
- Caso integrador: **deshacer la última modificación no confirmada de una OT**.

---

## Avances confirmados

### Análisis y Diseño — Requerimientos

- Ingeniería de Requerimientos como proceso de descubrir, analizar, documentar y verificar.
- Elicitación mediante entrevistas, preguntas, observación y otras técnicas.
- Especificación como documentación organizada de servicios, propiedades y restricciones.
- Validación mediante revisión con usuarios, prototipos, casos de prueba y consistencia.
- Requerimiento funcional.
- Requerimiento no funcional.
- Regla de negocio.
- Calidad: correcto, consistente, completo, realista, necesario, verificable y rastreable.
- Aplicación sobre Órdenes de Trabajo.

### Algoritmos y Estructuras — Pilas

- TDA con interfaz independiente de implementación.
- Pila como estructura lineal restrictiva.
- LIFO.
- Cima/tope.
- `push`, `pop`, `peek/primero` y `esVacia`.
- Simulación completa sin errores.
- Pila con vector e índice `top`.
- Pila con lista enlazada y cabecera/top.
- Comparación de capacidad, memoria y riesgos.
- Elección de pila/lista enlazada para un historial de tamaño desconocido.

### Comunicaciones — OSI/TCP-IP

- Siete capas OSI en orden.
- Cinco capas TCP/IP adoptadas por el material.
- TCP/IP definido como arquitectura/pila, no como protocolo único.
- Correspondencia completa OSI–TCP/IP.
- Encapsulamiento y desencapsulamiento.
- `PDU = SDU + PCI`.
- Datos, segmento, paquete, trama y bits.
- MAC, IP y puerto.
- Switch capa 2 y router capa 3.
- Procesamiento parcial por nodos intermedios.
- Recorrido completo móvil → servidor → respuesta.

### Integración

- Una necesidad informal se transforma en RF, RNF y regla de negocio.
- La operación `deshacer` se modela mediante una pila LIFO.
- Las acciones no confirmadas forman un historial temporal.
- La pila se vacía después de la confirmación exitosa del servidor.
- La confirmación se encapsula y viaja mediante TCP/IP.

---

## Recuperaciones consolidadas en el Día 6

1. TDA = datos/objetos + operaciones + interfaz independiente de implementación.
2. Fases del PUD frente a flujos de trabajo.
3. Síncrona frente a asíncrona.
4. TCP/IP como arquitectura/pila.
5. Switch/trama/MAC frente a router/paquete/IP.
6. Correspondencia OSI–TCP/IP.
7. Procesamiento parcial de nodos y desencapsulamiento completo en destino.

---

## Ajustes detectados durante el Día 6

1. `Completo` y `verificable` son propiedades diferentes.
2. `peek()` consulta/devuelve la cima sin eliminarla.
3. Una pila enlazada no se desborda por una capacidad fija; está limitada por memoria y referencias.
4. PDU significa **Unidad de Datos de Protocolo**, no de proceso.
5. El constructor Java no declara tipo de retorno, ni siquiera `void`.
6. Internet/Red forma un paquete; Acceso/Enlace forma una trama.
7. Física transmite bits/señales, no bytes como unidad principal.
8. La pila temporal debe vaciarse después de recibir confirmación exitosa del servidor.
9. Un RNF de rendimiento necesita condiciones de carga y ambiente para ser completamente verificable.

---

## Pendientes abiertos prioritarios

### Análisis y Diseño

1. Relaciones UML: asociación, agregación, composición y dependencia.
2. Completo frente a verificable — recuperación espaciada.
3. Casos de uso, actores, `include`, `extend` y generalización.

### Programación Orientada a Objetos / Java

4. Precisión de sintaxis Java escrita, especialmente constructor.
5. Herencia, `extends`, `super` y miembros estáticos.

### Algoritmos y Estructuras

6. Complejidades de algoritmos de ordenación.
7. Riesgo de vector frente a lista enlazada sin ayuda.
8. Colas e implementaciones posteriores.

### Base de Datos

9. DCL/TCL.
10. DER y pasaje a tablas.

### Comunicaciones

11. PDU: expansión exacta de la sigla.
12. Paquete frente a trama bajo presión oral.
13. Bits frente a bytes en Física.
14. Contenidos de transmisión, enlace, redes y WAN todavía no recorridos.

---

## Estado de errores canónico

| Estado | Cantidad |
|---|---:|
| Consolidado | 21 |
| Corregido, pendiente de consolidación | 6 |
| Abierto | 8 |
| **Total registrado** | **35** |

---

## Evidencia principal del Día 6

- `EVALUACIONES/2026-08-11_RESPUESTAS-DIA-06.md`
- `EVALUACIONES/2026-08-11_RESULTADOS-DIA-06.md`
- `04-MATRIZ-DE-PROGRESO-ACTUALIZACION-DIA-06.md`
- `06-ERRORES-Y-RECUPERACIONES-DIA-06.md`
- `RESUMENES/2026-08-11_CIERRE-DIA-06.md`
- `RESUMENES/2026-08-11_ESTADO-ACUMULADO-DIAS-01-A-06.md`

---

## Criterio de cierre

El Día 6 se considera **CERRADO Y APROBADO con 9,2/10**.

Los estados `Defendible oralmente` se aplican únicamente a los núcleos efectivamente defendidos durante esta jornada, no a la totalidad de cada asignatura.
