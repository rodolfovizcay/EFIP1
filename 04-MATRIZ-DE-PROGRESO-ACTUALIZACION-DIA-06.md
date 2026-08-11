# Matriz de progreso — actualización al cierre del Día 6

**Fecha:** 11/08/2026

Estados:

- `NI` = No iniciado
- `EA` = En aprendizaje
- `C` = Comprendido
- `A` = Aplicado
- `DO` = Defendible oralmente

> `DO` se asigna solamente al contenido efectivamente defendido durante la jornada; no implica dominio de la materia completa.

---

## Análisis y Diseño — Ingeniería de Requerimientos

| Tema | Estado previo | Estado Día 6 | Evidencia |
|---|---|---|---|
| Ingeniería de requerimientos | NI | DO | Definida, aplicada y defendida en el caso `deshacer` |
| Elicitación | NI/EA | DO | Entrevistas, preguntas y observación aplicadas al caso |
| Especificación | NI/EA | DO | Transformación de necesidades en RF, RNF y reglas |
| Validación | NI/EA | DO | Revisión con usuario, retroalimentación y detección de omisiones |
| RF | C parcial | DO | Definición, clasificación y ejemplos escritos/orales |
| RNF | C parcial | DO | Rendimiento, seguridad, plataforma y fiabilidad diferenciados |
| Regla de negocio | NI/EA | DO | Diferenciada de RF/RNF y aplicada a OT |
| Correcto | NI/EA | A | Evaluado; se corrigió no confundir ambigüedad con incorrección automática |
| Consistente | NI/EA | A | Contradicción con otros requerimientos correctamente identificada |
| Completo | NI/EA | A | Aplicado con ajuste: no confundir con verificable |
| Realista | NI/EA | A | Relacionado con recursos, tecnología y tiempo disponibles |
| Necesario | NI/EA | A | Relacionado con deficiencia producida al eliminarlo |
| Verificable | NI/EA | A | Requerimientos ambiguos convertidos en condiciones medibles |
| Rastreable | NI/EA | A | Origen → requerimiento → diseño/implementación → prueba |
| Fases frente a flujos PUD | C | A | Recuperación escrita correcta; formulación estabilizada |

---

## Algoritmos y Estructuras — Pilas

| Tema | Estado previo | Estado Día 6 | Evidencia |
|---|---|---|---|
| TDA e interfaz/implementación | C | A | Definido sin ayuda y aplicado a vector/lista enlazada |
| Pila como TDA | C diagnóstica | DO | Definida y defendida oralmente |
| LIFO | C diagnóstica | DO | Simulación completa y justificación del caso `deshacer` |
| Cima/tope | EA | A | Identificada en cada paso de la simulación |
| `push` | EA | A | Aplicado correctamente |
| `pop` | EA | A | Aplicado correctamente y relacionado con deshacer |
| `peek/primero` | EA | A | Simulado sin eliminar; terminología a retener |
| `esVacia` | EA | C | Definido correctamente |
| Pila con vector | NI | A | Índice `top`, capacidad y desbordamiento comprendidos |
| Pila con lista enlazada | NI | A | Cabecera/top, nodos y tamaño variable comprendidos |
| Comparación vector/lista | NI/EA | A | Memoria, capacidad, riesgos e interfaz comparados |
| Elección de implementación | EA | A | Lista elegida cuando la cantidad de acciones es desconocida |
| Selección de estructura según problema | A | A | Pila elegida por la operación dominante: deshacer lo último |

---

## Comunicaciones — OSI/TCP-IP

| Tema | Estado previo | Estado Día 6 | Evidencia |
|---|---|---|---|
| Modelo OSI | A | DO | Siete capas reproducidas y utilizadas en defensa oral |
| Funciones de capas | A/C | DO en el recorrido trabajado | Transporte, Red, Enlace y Física explicadas en el caso |
| TCP/IP como arquitectura/pila | C, pendiente precisión | DO | Definido repetidamente como arquitectura/pila y defendido |
| Cinco capas TCP/IP | EA | A | Física, Acceso, Internet, Transporte y Aplicación reproducidas |
| Correspondencia OSI–TCP/IP | A | DO | Correspondencia completa y correcta |
| Encapsulamiento | C/A | DO | Explicado en evaluación y defensa |
| Desencapsulamiento | C | DO | Recorrido inverso hasta aplicación del servidor |
| PDU = SDU + PCI | C | A | Fórmula y concepto correctos; sigla todavía inestable |
| SDU | EA | A | Datos de la capa superior |
| PCI | EA | A | Información de control de protocolo |
| Datos/segmento/paquete/trama/bits | A | A | Orden correcto en escrito; dos ajustes orales pendientes |
| MAC | C | DO | Enlace local/trama |
| IP | C | DO | Direccionamiento lógico y encaminamiento |
| Puerto | C | DO | Proceso/servicio de transporte dentro del host |
| Switch | A | A | Capa 2, MAC y trama |
| Router | A | A | Capa 3, IP y paquete/datagrama |
| Síncrona/asíncrona | C, pendiente retención | A | Recuperada al inicio y en la evaluación escrita |

---

## Integración

| Tema | Estado Día 6 | Evidencia |
|---|---|---|
| Necesidad → RF/RNF/regla | A/DO | Caso de deshacer especificado y defendido |
| Regla → estructura | A/DO | Pila elegida por LIFO |
| Confirmación local → servidor | A/DO | Persistencia confirmada antes de vaciar historial temporal |
| Móvil → servidor TCP/IP | A/DO | Aplicación, puertos, IP, MAC, trama, señales y desencapsulamiento |

---

## Resultado global del Día 6

- Evaluación escrita: **7,35/8 = 9,2/10**.
- Defensa oral: **1,80/2 = 9,0/10**.
- Resultado global: **9,15/10 → 9,2/10 — APROBADO**.

## Pendientes de retención

1. Constructor Java: mismo nombre de la clase y sin tipo de retorno, ni siquiera `void`.
2. `Completo` frente a `verificable`.
3. `PDU = Unidad de Datos de Protocolo`.
4. Internet/Red produce paquete; Acceso/Enlace produce trama.
5. Física transmite bits/señales, no bytes como unidad principal.
6. Una pila enlazada está limitada por memoria/referencias, no por una capacidad fija.
7. `peek()` consulta la cima sin eliminarla.
