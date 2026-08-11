# Resultados de evaluación — Día 6

**Fecha:** 11/08/2026  
**Materias principales:** Análisis y Diseño + Algoritmos/Estructuras + Comunicaciones  
**Modalidad:** evaluación escrita + defensa oral integrada

---

## Resultado general

| Instancia | Resultado |
|---|---:|
| Evaluación escrita | **7,35/8,00 = 9,2/10** |
| Defensa oral | **1,80/2,00 = 9,0/10** |
| **Resultado global** | **9,15/10 → 9,2/10** |

**Estado: APROBADO**

> La nota global corresponde a una evaluación integrada de Requisitos, Pilas y OSI/TCP-IP. No debe asignarse artificialmente como una nota independiente de 9,2/10 a cada asignatura completa.

---

## Evaluación escrita

| Pregunta | Tema | Máximo | Obtenido |
|---|---|---:|---:|
| 1 | Ingeniería, elicitación, especificación y validación | 0,80 | 0,75 |
| 2 | RF, RNF y regla de negocio | 0,80 | 0,75 |
| 3 | Calidad de requerimientos | 0,90 | 0,75 |
| 4 | Pila como TDA y operaciones | 0,80 | 0,75 |
| 5 | Simulación LIFO | 0,90 | 0,90 |
| 6 | Vector frente a lista enlazada | 0,80 | 0,70 |
| 7 | OSI/TCP-IP y correspondencia | 0,90 | 0,90 |
| 8 | Encapsulamiento, PDU, SDU y PCI | 0,90 | 0,75 |
| 9 | MAC, IP, puerto y recorrido | 0,70 | 0,65 |
| 10 | Integración del caso `deshacer` | 0,30 | 0,30 |
| 11 | Recuperación espaciada | 0,20 | 0,15 |
| **Total escrito** | | **8,00** | **7,35** |

### Fortalezas escritas

- Ingeniería de requerimientos correctamente definida y aplicada.
- Elicitación, especificación y validación diferenciadas.
- RF, RNF y regla de negocio aplicados al dominio de OT.
- Simulación de pila completamente correcta.
- Diferencia entre interfaz del TDA e implementación interna comprendida.
- OSI y TCP/IP enumerados y relacionados correctamente.
- MAC, IP y puerto correctamente diferenciados.
- Caso de deshacer integrado con una pila y confirmación al servidor.

### Ajustes escritos

1. `Completo` no significa necesariamente medible; la medición pertenece principalmente a `verificable`.
2. `peek()` consulta/devuelve la cima sin eliminarla; no conviene definirlo solamente como “mostrar”.
3. Una pila enlazada no tiene desbordamiento por capacidad fija; puede fallar por agotamiento de memoria o por errores de referencias.
4. PDU significa **Unidad de Datos de Protocolo**, no “de procesos”.
5. El constructor Java no declara ningún tipo de retorno, ni siquiera `void`.

---

## Defensa oral

| Criterio | Máximo | Obtenido |
|---|---:|---:|
| Precisión conceptual | 0,50 | 0,42 |
| Terminología académica | 0,40 | 0,33 |
| Aplicación y justificación | 0,50 | 0,48 |
| Integración entre materias | 0,40 | 0,40 |
| Claridad y orden | 0,20 | 0,17 |
| **Total oral** | **2,00** | **1,80** |

### Fortalezas orales

- Secuencia elicitación → especificación → validación correctamente organizada.
- RF, RNF y regla de negocio formulados sobre el caso.
- Pila elegida y justificada mediante LIFO.
- Confirmación asociada al vaciado del historial temporal.
- Recorrido Aplicación → Transporte → Internet/Red → Acceso/Enlace → Física explicado.
- Puertos, IP, MAC, encapsulamiento y desencapsulamiento relacionados en un único desarrollo.

### Ajustes orales

1. La validación de requerimientos puede realizarse antes de implementar mediante revisiones, prototipos y casos de prueba derivados.
2. No puede deshacerse una acción anterior saltando las posteriores; puede alcanzarse mediante varios `pop()` sucesivos.
3. La pila debe vaciarse después de que el servidor confirme exitosamente la persistencia.
4. Internet/Red produce un **paquete/datagrama**; Acceso/Enlace produce una **trama**.
5. Física transmite **bits/señales**, no bytes como unidad principal.
6. OSI utiliza `Enlace de Datos`; TCP/IP utiliza `Acceso a la red`. `Acceso al medio` es una función/subárea, no el nombre completo equivalente de la capa.

---

## Resultado por bloque

| Bloque | Puntaje escrito | Estado al cierre |
|---|---:|---|
| Ingeniería de Requerimientos | **2,25/2,50** | Aplicado y defendido oralmente |
| Pilas | **2,35/2,50** | Aplicado y defendido oralmente |
| OSI/TCP-IP | **2,30/2,50** | Aplicado y defendido oralmente |
| Integración/recuperación | **0,45/0,50** | Aprobado |

---

## Recuperaciones verificadas

| Tema | Resultado |
|---|---|
| TDA e interfaz independiente de implementación | Recuperado en respuesta inicial y aplicación vector/lista |
| Fases frente a flujos PUD | Recuperado en instancia inicial y escrita |
| Síncrona/asíncrona | Recuperada sin mezclar retransmisión |
| TCP/IP como arquitectura/pila | Recuperado y defendido |
| Función de switch/router | Recuperada: switch capa 2, router capa 3 |
| Unidad de switch/router | Recuperada: trama frente a paquete/datagrama |
| PDU = SDU + PCI | Concepto correcto; expansión de la sigla todavía inestable |
| Constructor Java | Concepto corregido; formulación todavía requiere retención |

---

## Interpretación académica

El Día 6 muestra dominio aplicado en tres núcleos nuevos. El estudiante ya puede:

- transformar pedidos informales en RF, RNF y reglas;
- evaluar calidad de requerimientos con criterios académicos;
- simular y justificar una pila;
- distinguir interfaz e implementación;
- reproducir la correspondencia OSI–TCP/IP;
- explicar el recorrido completo de una solicitud móvil hasta un servidor.

Los estados `Defendible oralmente` deben aplicarse solamente a los temas realmente defendidos, no a las asignaturas completas.

---

## Próxima recuperación obligatoria

- completo frente a verificable;
- constructor Java sin tipo de retorno;
- `PDU = Unidad de Datos de Protocolo`;
- paquete en Red/Internet frente a trama en Enlace/Acceso;
- bits/señales en Física;
- riesgo de pila enlazada frente a desbordamiento de vector.
