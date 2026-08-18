# Matriz de progreso del programa

**Actualizada al cierre académico del Día 10 — 17/08/2026**

Estados:

- `NI` = No iniciado
- `EA` = En aprendizaje
- `C` = Comprendido
- `A` = Aplicado
- `DO` = Defendible oralmente

> El Día 9 se cerró con evaluación escrita `5,70/8,00` y sin defensa oral. Sus estados reflejan evidencia escrita y práctica, pero no se asigna una nota global. El indicador semanal `8,6/10` continúa calculado con los Días 5 a 8.

> **Día 10 cerrado el 17/08/2026:** evaluación integradora real `8,5/10` y recuperación selectiva `4/4`. Los estados cambian únicamente donde existe evidencia del estudiante; los contenidos preparados pero no trabajados permanecen `NI` o `EA`.

---

# 1. Análisis y Diseño de Software

| Tema | Estado | Evidencia acumulada |
|---|---|---|
| Modelos y finalidad del modelado | A | Días 2 y 5 |
| Metodología, método, técnica y herramienta | A | Días 2 y 5 |
| Cascada, incremental y prototipado | C/A | Comparados; espiral pendiente |
| PUD: tres características | DO | Día 5 |
| Fases del PUD | DO | Inicio, Elaboración, Construcción y Transición |
| Fases frente a flujos | A | Días 5–6 |
| Iteración e incremento | DO | Aplicados y defendidos |
| Ingeniería de Requerimientos | DO | Día 6 |
| Elicitación/especificación/validación | DO | Aplicadas y defendidas |
| RF/RNF/regla de negocio | DO | Días 6 y Caso integrador |
| Calidad de requerimientos | A | Completo/verificable consolidado |
| Actor, caso de uso y límite | A | Día 7 |
| Resultado de valor | C/A | Aplicado; evitar persistencia como única formulación |
| `include` y `extend` | A | Obligatoriedad, opcionalidad y dirección aplicadas |
| Generalización conceptual | A | Hijo→padre |
| Notación de generalización UML | C | Triángulo vacío pendiente de automatización |
| Precondiciones, flujos y postcondiciones | A | Crear OT y Registrar ejecución |
| Propósito del análisis | A/DO | Día 8 |
| Caso de uso vs. modelo de análisis | DO | Vista externa/interna defendida |
| Artefactos del análisis | C/A | Modelo, clase, realización, paquete y vista |
| Interfaz/control/entidad | DO | Clasificados y defendidos |
| Responsabilidades conceptuales | A | Registrar ejecución |
| Realización y colaboración | A | Flujos normales aplicados |
| Alternativo sin conexión | A | Consolidado en escrito Día 9 |
| Mensajes vs. métodos definitivos | A | Diferenciados |
| Análisis vs. diseño vs. implementación | A | Evaluación escrita Día 9 |
| Modelo de diseño | A | Servicios, repositorios, Cola y Sincronizador |
| Clase de diseño | C/A | Operaciones y parámetros comprendidos |
| Realización de caso de uso–diseño | A | Secuencia normal/offline |
| Diagrama de secuencia | A | Orden temporal y participantes aplicados |
| Línea de vida | C | Definición corregida; práctica gráfica pendiente |
| Foco de control | C | Definición comprendida |
| Diagrama de estados | C/A | Flujo principal escrito; anulación omitida en evaluación |
| Estado/evento/transición/acción | C/A | Comprendidos con precisión en recuperación |
| Subsistemas de diseño | A/DO | Relevamiento, Análisis Técnico, Persistencia y Sincronización defendidos con responsabilidades |
| Interfaces de diseño | A/DO | Contratos, operaciones y dirección de dependencias aplicados |
| Descripción de arquitectura | A/DO | Decisiones, alternativas, RNF, consecuencias, riesgos y artefactos aplicados |
| Asociación/agregación/composición/dependencia | C/A | Definiciones correctas en recuperación inicial; requiere repaso espaciado |
| Vistas arquitectónicas 4+1 | A/DO | Casos de uso, lógica, procesos, implementación y despliegue recuperados 4/4 |
| Modelo de implementación/pruebas | NI/EA | Vista de implementación comprendida; bloque formal y pruebas pendientes |

---

# 2. Programación Orientada a Objetos

| Tema | Estado | Evidencia acumulada |
|---|---|---|
| Clase y objeto | DO | Día 5 |
| Estado, comportamiento e identidad | DO | Día 5 |
| Encapsulamiento | DO | Aplicado a OT y solicitudes |
| Atributos, métodos y constructor | A | Constructor conceptual consolidado |
| `this` y `super` | A | Día 7; uso preciso de `super` requiere práctica |
| Miembros estáticos | A | Contador de instancias |
| Herencia y relación `es un` | A | UsuarioSistema y canales |
| Superclase/subclase y `extends` | A | Aplicados |
| Sobrecarga/sobrescritura | A | `buscarOT`, `getRol`, `enviar` |
| Clase `Object` | C | Reconocida |
| `toString()` conceptual | C/A | Comprendido; omitido en escrito final Día 9 |
| Abstracción | A | Día 9 |
| Abstracción vs. encapsulamiento | A | Diferenciadas |
| Clase abstracta | A | `CanalNotificacion` |
| Método abstracto | A | `enviar(String)` |
| Constructor de abstracta | C/A | Concepto correcto; implementación con error de `super` |
| Interfaz | A | `Auditable` |
| `implements` | A | Email y Móvil |
| Clase abstracta vs. interfaz | A | Decisión conceptual comprendida |
| Polimorfismo | A | Tipo común y objetos concretos |
| Referencia común/objeto concreto | A | Explicado en controles |
| Sobrescritura polimórfica | A | Email/Push |
| Comparación de `String` | C/A | `isBlank()` comprendido |
| Validación que detiene | C | Excepción comprendida; código autónomo pendiente |
| `@Override` | C/A | Aplicado parcialmente; omisión en auditoría |
| Sintaxis/completitud Java | EA | Error en `super.validarDestinatario()`, `toString()` y archivos públicos |
| `equals/hashCode` | NI | Pendiente |
| Excepciones | EA/C | `IllegalArgumentException` aplicada; bloque formal pendiente |
| Colecciones | C/A | `List<CanalNotificacion>` comprendida |
| Archivos | NI | Pendiente |
| Elección de Java, JVM y portabilidad | NI | Complementario; previsto 18/08 |
| Excepciones checked/unchecked y flujo completo | NI | Complementario; previsto 18/08 |
| Principios SOLID | NI | Complementario conceptual; previsto 18/08 |
| Encoding, hashing y cifrado | NI | Complementario transversal; previsto 20/08 |

---

# 3. Algoritmos y Estructuras de Datos

| Tema | Estado | Evidencia acumulada |
|---|---|---|
| TDA e interfaz/implementación | A/DO | Contrato aplicado a Pila y Cola |
| Arreglos, capacidad y longitud | A | Día 3 |
| Nodos y referencias | A/DO | Inserción, recorrido, búsqueda y eliminación ejecutados mentalmente |
| Lista simplemente enlazada | A/DO | Cabeza, lista vacía, inserción, recorrido, búsqueda, eliminación y complejidad |
| Pila y LIFO | DO | Día 6 y Caso integrador |
| `push`, `pop`, `peek`, cima | A | Simulaciones correctas |
| Pila con vector/lista | A | Comparadas |
| Cola y FIFO | DO | Día 8 y caso |
| Frente y final | A | Aplicados |
| `encolar`, `desencolar`, `cabecera` | A | Simulaciones y sincronización |
| Cola con vector | A/DO | Índices, capacidad y reutilización |
| Cola con lista enlazada | A/DO | Nodos, referencias y memoria |
| Comparación vector/lista | A/DO | Riesgos consolidados |
| Contrato TDA vs. implementación | A/DO | Consolidado |
| Pila vs. Cola | A/DO | LIFO/FIFO aplicados |
| FIFO vs. trazabilidad | C/A | Orden vs. historia diferenciados |
| Confirmación antes de desencolar | A | Consolidado en evaluación Día 9 |
| Cola de prioridad | C/A | Elegida para urgencias |
| Selección de estructura | DO | Política y operación dominante |
| Listas doble/circular/ordenada | NI | Pendiente |
| Inserción | A | Inicio y posición intermedia aplicados; inserción final pendiente |
| Mergesort | C | Estrategia conocida; práctica pendiente |
| Quicksort | C | Pivote/recursión conocidos; complejidad a reforzar |
| Complejidades | EA | Brecha prioritaria |

---

# 4. Base de Datos I

| Tema | Estado | Evidencia acumulada |
|---|---|---|
| Relación, tupla, atributo y dominio | A | Días 3 y 5 |
| Grado y cardinalidad relacional | DO | Día 5 |
| Superclave y clave candidata | DO | Candidata=superclave mínima |
| PK y FK | DO | Aplicadas |
| DER: propósito | A | Día 7 |
| Entidad, atributo y relación | A | Aplicados |
| Instancia | A | Ocurrencia concreta consolidada |
| Cardinalidad 1:1/1:N/N:M | A | Sector–OT, OT–Operario y ejecuciones |
| Participación mínima/máxima | A | 0..N y 1..1 con supuestos |
| Entidad fuerte/débil | C | Aplicación bajo presión pendiente |
| Entidad asociativa | A | `ASIGNACION_OT` |
| Asociativa vs. débil | EA/C | Confusión reaparecida; prioridad alta |
| Simbología DER | A | Rectángulo doble y línea doble consolidados |
| Atributo multivaluado/derivado | A | Teléfono/edad |
| Pasaje entidad→tabla | A | Día 7 |
| Pasaje 1:N | A | FK en lado N |
| Pasaje N:M | A | Tabla asociativa |
| N:M conceptual vs. asociativa | A | Aplicado |
| Historial y elección de PK | C/A | Fecha en clave e ID artificial |
| Restricción `UNIQUE` | C/A | Concepto comprendido; escritura final incompleta |
| Normalización: propósito/anomalías | A | Día 9 |
| 1FN | A | Teléfonos atómicos |
| Transformación a `OPERARIO_TELEFONO` | C/A | Concepto correcto; esquema omitido en escrito |
| 2FN | A | Dependencias parciales consolidadas |
| Dependencia parcial | A | Aplicada correctamente |
| 3FN | A | Dependencia transitiva Sector |
| Dependencia transitiva | A | Aplicada correctamente |
| Dependencias funcionales | A | Identificadas |
| ID artificial vs. normalización | A | Consolidado |
| Modelo final 3FN | C/A | Estructura comprendida; atributos y claves omitidos |
| PK de `OPERARIO_TELEFONO` | EA/C | Debe ser compuesta, no solo `UNIQUE` |
| DDL/DML | C | `CREATE`/`INSERT` |
| DCL/TCL | EA | `GRANT`/`COMMIT` pendientes |
| Álgebra relacional y SQL académico | NI/EA | Pendiente |
| Procedimientos, cursores y triggers | NI | Pendiente |
| Oracle/MySQL/SQLite: elección por escenario | NI/EA | Motores respaldados por el material; previsto 20/08 |
| PostgreSQL: comparación conceptual | NI | Complementario; previsto 20/08 |
| Transacciones y propiedades ACID | NI/EA | TCL/transacciones respaldadas; ACID complementario; previsto 20/08 |

---

# 5. Comunicaciones

| Tema | Estado | Evidencia acumulada |
|---|---|---|
| Sistema de comunicaciones | C | Día 4 |
| Protocolo, sintaxis, semántica y temporización | A | Día 4 |
| Modelo OSI | DO | Día 6 |
| TCP/IP y correspondencia | DO | Día 6 |
| Encapsulamiento/desencapsulamiento | DO | Días 6 y caso |
| PDU/SDU/PCI | A/DO | `PDU=SDU+PCI` |
| Datos/segmento/paquete/trama/bits | A/DO | Orden aplicado |
| MAC, IP y puerto | DO | Día 6 |
| Switch/router | A/DO | Capa, dirección y PDU |
| MAC por enlace local | C/A | Corregido en caso |
| Información e incertidumbre | C/A | Relación aplicada |
| Fórmula `I(E)` y unidad | C/A | Recuperada con `1/16=4 bits` |
| Entropía y tasa | C | Cálculos básicos |
| bits / bits-símbolo / bits-segundo | C/A | Diferenciados |
| Señal analógica/digital | A | Aplicadas |
| Amplitud | EA/C | Diferencia con potencia pendiente |
| Período y frecuencia | A | Cálculos correctos |
| `f=1/T`, `T=1/f` | A | Aplicadas |
| Muestreo | A | Concepto y cálculo |
| `fs≥2·fmax` | A | Aplicado |
| Cuantificación/codificación | C/A | Integradas conceptualmente |
| Serie/paralela | A | Diferenciadas |
| Síncrona/asíncrona | A | Definiciones correctas |
| Supuestos de transmisión | EA/C | No derivar asincronía de desconexión |
| Transmisión analógica posible | C | Corregido |
| Medios guiados/no guiados | A/DO | UTP, coaxial, fibra, radiofrecuencia y satélite clasificados |
| Atenuación/ruido/interferencia/dispersión/latencia | NI | Pendiente |
| Enlace, Ethernet, WAN y última milla | NI/EA | Pendiente |
| Hub/repetidor/switch/router por capa | A/DO | Capa, PDU y dirección defendidas; recuperación final correcta |
| Gateway por capa | NI/EA | Preparado, pero no evaluado en la jornada real |
| UTP y motivo del trenzado | A/DO | Medio guiado, señal eléctrica y reducción de interferencia explicados |
| Diafonía e interferencia | C | Relación general comprendida; precisión sobre diafonía pendiente |
| FTP/STP como tipos de cable | C/A | Blindaje comprendido; diferencia con Spanning Tree aclarada |
| Switch: aprendizaje y tabla MAC | NI | Complementario sobre función respaldada; previsto 19/08 |
| STP y bucles de capa 2 | NI/EA | Respaldado; previsto 19/08 |
| Bucle de routing, TTL y métricas | NI | Complementario; previsto 19/08–21/08 |
| IPv4, máscara, red y broadcast | NI | Complementario; previsto 21/08 |
| CIDR y selección de prefijo | NI | Complementario; previsto 21/08 |
| Clases A/B/C históricas | NI | Complementario; previsto 21/08 |
| TCP frente a UDP | NI/EA | Mención respaldada y desarrollo complementario; previsto 21/08 |
| Three-way handshake | NI | Complementario; previsto 21/08 |
| Router y tabla de enrutamiento | NI/EA | Función respaldada y tabla complementaria; previsto 21/08 |
| LAN/MAN/WAN | NI/EA | Respaldado; previsto 21/08 |
| MPLS | NI/EA | Respaldado; previsto 21/08 |
| VPN, DMZ y firewall por capas | NI | Complementario; previsto 21/08 |
| Servidor propio frente a contratado | NI | Complementario de infraestructura; previsto 19/08 |

---

# 6. Integración y defensa

| Tema | Estado | Evidencia acumulada |
|---|---|---|
| Requisito→caso de uso | A/DO | Explicado oralmente |
| Caso→análisis→diseño | A | Día 9 y Caso integrador |
| Diseño→POO/estructuras | A | Servicios, Pila, Cola y polimorfismo |
| Diseño→datos | A | DER y normalización |
| Aplicación→comunicaciones | A | Recorrido TCP/IP |
| Práctica guiada transversal | A | 15/08 |
| Integración escrita Día 9 | C/A | Cadena correcta; modo offline omitido |
| Defensa continua 8–12 minutos | C/A | Evidencia oral previa; defensa específica Día 9 no realizada |

---

# 7. Evidencia evaluativa acumulada

| Jornada | Resultado |
|---|---:|
| Día 1 — Diagnóstico | 5,6/10 promedio |
| Día 2 — Análisis y Diseño + POO | 8,0/10 |
| Día 3 — Estructuras + BD | 8,3/10 |
| Día 4 — Comunicaciones | 8,6/10 |
| Día 5 — PUD + POO + relacional | 9,0/10 |
| Día 6 — Requisitos + Pilas + OSI/TCP-IP | 9,2/10 |
| Día 7 — Casos de uso + Herencia + DER | 8,3/10 |
| Día 8 — Modelo de análisis + Colas + Transmisión | 7,9/10 |
| Semana 10–15/08 — promedio descriptivo Días 5–8 | **8,6/10** |
| Día 9 — componente escrito | **5,70/8,00 = 71,25 %** |
| Día 10 — evaluación integradora adaptada | **8,5/10 + recuperación 4/4** |

```text
Día 9:
cerrado sin defensa oral
nota global no asignada

Caso integrador 1:
práctica guiada, sin puntaje formal
```

---

# 8. Pendientes de retención inmediata

1. Java completo: `@Override`, archivos y prueba polimórfica.
2. Asociativa frente a débil.
3. Diagrama de estados completo.
4. Modelo final con PK/FK/UNIQUE y atributos.
5. Generalización UML y relaciones UML restantes.
6. Digitalización, política y supuestos de transmisión.
7. Atenuación, ruido, dispersión, latencia, gateway, módem y última milla.
8. Inserción final, modificación y código Java completo de Lista.
9. DCL/TCL.
10. Ordenación y complejidades.

Documento de repaso:

```text
RESUMENES/2026-08-16_REPASO-SEMANAL-PUNTOS-DEBILES.md
```

---

## Regla de lectura

La matriz resume la mejor evidencia disponible. `DO` no significa dominio total. El Día 9 aporta evidencia escrita sin nota global. El Día 10 aporta una evaluación integradora adaptada de 8,5/10 y recuperación 4/4; no se atribuye el desglose 8+2 del instrumento preparado.
