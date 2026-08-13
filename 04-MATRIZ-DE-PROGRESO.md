# Matriz de progreso del programa

**Actualizada al cierre del Día 8 — 13/08/2026**

Estados: `NI` No iniciado, `EA` En aprendizaje, `C` Comprendido, `A` Aplicado, `DO` Defendible oralmente.

> `DO` se limita al núcleo efectivamente defendido. El detalle histórico por tema se conserva en las matrices de actualización de cada jornada.

---

## 1. Análisis y Diseño de Software

| Tema | Estado | Evidencia acumulada |
|---|---|---|
| Modelos y finalidad del modelado | A | Días 2 y 5 |
| Metodología, método, técnica y herramienta | A | Días 2 y 5 |
| Cascada, incremental y prototipado | C/A | Comparados y aplicados; espiral pendiente |
| PUD: tres características | DO | Defendidas Día 5 |
| Fases del PUD | DO | Inicio, Elaboración, Construcción y Transición |
| Flujos frente a fases | A | Recuperados Días 5–6 |
| Iteración e incremento | DO | Aplicados y defendidos |
| Ingeniería de Requerimientos | DO | Día 6 |
| Elicitación/especificación/validación | DO | Aplicadas y defendidas |
| RF/RNF/regla de negocio | DO | Diferenciadas y aplicadas |
| Calidad y trazabilidad | A | Completo/verificable consolidado Día 8 |
| Actor, caso de uso y límite | A | Día 7 |
| Resultado de valor | C/A | Evitar confundirlo con persistencia interna |
| `include` y `extend` | A | Dirección y obligatoriedad aplicadas |
| Generalización conceptual | A | Hijo→padre |
| Notación de generalización UML | C | Corregida; triángulo vacío pendiente de automatizar |
| Precondiciones, flujos y postcondiciones | A | Caso Crear OT |
| Propósito del análisis | A/DO | Día 8 |
| Casos de uso vs. modelo de análisis | DO | Vista externa/interna defendida |
| Artefactos del análisis | C/A | Modelo, clase, realización, paquete y vista |
| Clase de interfaz | DO | App/formulario/API |
| Clase de control | DO | Coordinación del caso |
| Clase de entidad | DO | Conceptos duraderos del dominio |
| Responsabilidades conceptuales | A | Interfaz/control/entidad |
| Realización y colaboración | A | Flujo normal aplicado; alternativo pendiente |
| Mensajes vs. métodos definitivos | A | Diferenciados Día 8 |
| Colaboración vs. secuencia de diseño | C/A | Secuencia detallada pendiente Día 9 |
| Asociación/agregación/composición/dependencia | EA | Brecha prioritaria |
| Modelo de diseño | NI | Día 9 |
| Modelo de implementación/pruebas | NI | Pendiente |

---

## 2. Programación Orientada a Objetos

| Tema | Estado | Evidencia acumulada |
|---|---|---|
| Clases y objetos | DO | Día 5 |
| Estado, comportamiento e identidad | DO | Día 5 |
| Encapsulamiento y acceso | DO | Día 5 |
| Atributos, métodos y constructor | A | Constructor consolidado Día 7 |
| `this` y `super` | A | Jerarquía Java Día 7 |
| Miembros estáticos | A | Contador de instancias |
| Herencia y relación `es un` | A | `UsuarioSistema`/subclases |
| Superclase/subclase y `extends` | A | Día 7 |
| Sobrecarga/sobrescritura | A | `buscarOT`/`getRol` |
| Clase `Object` | C | Reconocida |
| `toString()` conceptual | C | Recuperado Día 8; implementación pendiente |
| Sintaxis/completitud Java | EA/A | Código aplicable con omisiones puntuales |
| Abstracción | NI | Día 9 |
| Clase/método abstracto | C diagnóstico | Profundización Día 9 |
| Interfaces y `implements` | C diagnóstico | Profundización Día 9 |
| Polimorfismo | EA | Bloque formal Día 9 |
| `equals/hashCode` | NI | Pendiente |
| Excepciones, colecciones y archivos | NI | Pendiente |

---

## 3. Algoritmos y Estructuras de Datos

| Tema | Estado | Evidencia acumulada |
|---|---|---|
| TDA e interfaz/implementación | A | Concepto consolidado; aplicación a Cola bajo recuperación |
| Arreglos, capacidad y longitud | A | Día 3 |
| Nodos y referencias | C/A | Listas y Colas |
| Lista simplemente enlazada | A | Inserción/recorrido |
| Pila y LIFO | DO | Día 6 |
| `push`, `pop`, `peek`, cima | A | Simulaciones correctas |
| Pila con vector/lista | A | Comparadas |
| Cola y FIFO | DO | Día 8 |
| Frente y final | A | Aplicados |
| `encolar`, `desencolar`, `cabecera` | A | Simulación perfecta |
| Cola con vector | A/DO | Índices, capacidad y riesgos |
| Cola con lista enlazada | A/DO | Nodos, referencias y memoria |
| Comparación vector/lista | A/DO | Riesgo consolidado Día 8 |
| Contrato TDA vs. implementación | EA | Error escrito; oral correcto |
| Pila vs. Cola | A | LIFO/FIFO; error bajo presión pendiente |
| Cola de prioridad | C/A | Elegida para urgencias |
| Selección de estructura | Consolidado | Según política y operación dominante |
| FIFO vs. trazabilidad | EA | Orden no equivale a registro histórico |
| Listas doble/circular/ordenada | NI | Pendiente |
| Ordenación y complejidades | EA | Brecha prioritaria |

---

## 4. Base de Datos I

| Tema | Estado | Evidencia acumulada |
|---|---|---|
| Relación, tupla, atributo y dominio | A | Días 3 y 5 |
| Grado y cardinalidad relacional | DO | Defendidos Día 5 |
| Superclave y clave candidata | DO | Candidata=superclave mínima |
| PK y FK | DO | FK repetible en lado N |
| DER: propósito | A | Día 7 |
| Entidad y atributo | A | Aplicados |
| Instancia | C | Corregida; ocurrencia concreta pendiente de automatizar |
| Relación y cardinalidad 1:1/1:N/N:M | A | Sector–OT y OT–Operario |
| Participación mínima/máxima | A | 0..N y 1..1 |
| Entidad fuerte/débil | C | Asociativa/débil corregida |
| Simbología DER | EA | Línea doble pendiente |
| Atributo multivaluado/derivado | A | Teléfono/edad |
| Pasaje entidad→tabla | A | Día 7 |
| Pasaje 1:N | A | FK en lado N |
| Pasaje N:M | A | Tabla asociativa |
| N:M conceptual vs. tabla asociativa | A | Consolidado en núcleo Día 8 |
| Historial y elección de PK | C/A | PK compuesta vs. identificador propio |
| Restricción `UNIQUE` | C | Aplicación pendiente |
| DDL/DML | C | `CREATE`/`INSERT` |
| DCL/TCL | EA | `GRANT`/`COMMIT` pendientes |
| 1FN/2FN/3FN | EA | Bloque formal Día 9 |
| Álgebra relacional y SQL académico | NI/EA | Pendiente |
| Procedimientos, cursores y triggers | NI | Pendiente |

---

## 5. Comunicaciones

| Tema | Estado | Evidencia acumulada |
|---|---|---|
| Sistema de comunicaciones | C | Día 4 |
| Protocolo, sintaxis, semántica y temporización | A | Día 4 |
| Modelo OSI | DO | Día 6 |
| TCP/IP y correspondencia | DO | Día 6 |
| Encapsulamiento/desencapsulamiento | DO | Día 6 |
| PDU/SDU/PCI | A consolidado | Día 7 |
| Datos/segmento/paquete/trama/bits | A | Recuperados |
| MAC, IP y puerto | DO | Día 6 |
| Switch/router | A | Capa y PDU diferenciadas |
| Información e incertidumbre | C | Relación general; contradicción oral pendiente |
| Fórmula `I(E)` y unidad | EA | Fórmula/unidad omitidas en evaluación |
| Entropía y tasa | EA/C | Cálculo correcto; unidades pendientes |
| bits / bits-símbolo / bits-segundo | EA | Recuperación prioritaria |
| Señal analógica/digital | A | Aplicadas |
| Amplitud | EA | Confundida con potencia |
| Período y frecuencia | C/A | Cálculos correctos; definiciones pendientes |
| `f=1/T`, `T=1/f` | EA/A | Aplicadas en práctica, omitidas en teoría escrita |
| Muestreo | A | Cálculo correcto; definición pendiente |
| `fs≥2·fmax` | A | Aplicada correctamente |
| Efecto de aumentar `fs` | C | Mayor volumen identificado; recursos incompletos |
| Serie/paralela | A | Clasificación correcta |
| Síncrona/asíncrona | A | Fórmulas correctas; desarrollo oral incompleto |
| Combinación de categorías | A | Dimensiones independientes |
| Digitalización de señal | EA | Motivo y alcance pendientes |
| Supuestos de protocolo | EA/C | Deben declararse cuando no están dados |
| Medios, enlace, Ethernet y WAN | NI/EA | Pendiente |

---

## Evidencia evaluativa acumulada

| Jornada | Resultado |
|---|---:|
| Día 1 — Diagnóstico | 5,6/10 promedio |
| Día 2 — Análisis y Diseño + POO | 8,0/10 |
| Día 3 — Estructuras + BD | 8,3/10 |
| Día 4 — Comunicaciones | 8,6/10 |
| Día 5 — PUD + POO + relacional | 9,0/10 |
| Día 6 — Requisitos + Pilas + OSI/TCP-IP | 9,2/10 |
| Día 7 — Casos de uso + Herencia + DER | 8,3/10 |
| Día 8 — Modelo de análisis + Colas + Transmisión | **7,9/10** |

---

## Pendientes de retención inmediata

1. Realización con alternativo por falta de conexión.
2. Contrato TDA frente a implementación.
3. Pila=LIFO; Cola=FIFO.
4. FIFO frente a trazabilidad.
5. `I(E)=log₂(1/P(E))` y unidad bits.
6. bits, bits/símbolo y bits/segundo.
7. Amplitud, período y frecuencia.
8. `f=1/T`, `T=1/f`.
9. Muestreo y efecto de `fs`.
10. Digitalización y supuestos de protocolo.
11. Línea doble = participación total.
12. Generalización UML, instancia y asociativa/débil.

## Regla de lectura

La matriz resume la mejor evidencia disponible. Los detalles y errores exactos se conservan en las matrices y registros diarios.
