# Matriz de progreso del programa

**Actualizada al cierre académico del Día 12 — 19/08/2026**

Estados:

- `NI` = No iniciado
- `EA` = En aprendizaje
- `C` = Comprendido
- `A` = Aplicado
- `DO` = Defendible oralmente

> El Día 9 se cerró con evaluación escrita `5,70/8,00` y sin defensa oral. Sus estados reflejan evidencia escrita y práctica, pero no se asigna una nota global. El indicador semanal `8,6/10` continúa calculado con los Días 5 a 8.

> **Día 10 cerrado el 17/08/2026:** evaluación integradora real `8,5/10` y recuperación selectiva `4/4`. Los estados cambian únicamente donde existe evidencia del estudiante; los contenidos preparados pero no trabajados permanecen `NI` o `EA`.

> **Día 11 cerrado el 18/08/2026:** evaluación final `9,2/10` y recuperación oral posterior de excepciones. Java complementario, listas avanzadas, SQL y SOLID se elevan solo según la evidencia real; la ejecución automática de ejemplos durante la preparación no se atribuye al estudiante.

> **Día 12 cerrado el 19/08/2026:** evaluación final `8,05/10` y defensa integradora `1/1`. Implementación/despliegue, archivos Java y enlace de datos avanzan según evidencia real; HDLC/PPP/Ethernet y bucle L2 frente a routing quedan abiertos.

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
| Modelo de implementación | A | Componentes, artefactos y trazabilidad aplicados en el Día 12 |
| Modelo de despliegue y nodos | A/DO | Diferencia con implementación defendida en la integración final |
| Modelo de pruebas | NI/EA | Bloque formal previsto para el Día 13 |
| Trazabilidad diseño→código→artefacto→nodo | A/DO | Defensa integradora del Día 12 `1/1` |
| Decisión de infraestructura | A | Servidor propio/contratado comparados por costo, control, disponibilidad y riesgo |
| Componente/subsistema/artefacto | C/A | Aplicado con imprecisiones; recuperación espaciada requerida |

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
| `toString()` conceptual | A | Función explicada correctamente en Día 11 |
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
| Comparación de `String` | A/DO | `==` como referencia y `equals()` como contenido defendidos tras recuperación |
| Validación que detiene | C | Excepción comprendida; código autónomo pendiente |
| `@Override` | C/A | Aplicado parcialmente; omisión en auditoría |
| Sintaxis/completitud Java | EA | Error en `super.validarDestinatario()`, `toString()` y archivos públicos |
| `equals/hashCode` | C/A | Igualdad por `id` y contrato de hash aplicados; requiere recuperación espaciada |
| Excepciones | A | Checked/unchecked y flujo completo aplicados; precisión final recuperada |
| Colecciones | A/DO | Arreglo, `ArrayList`, acceso, redimensionamiento e iterador defendidos |
| Archivos | C/A | `Path`, `Files`, lectura/escritura y opciones de apertura aplicados en Día 12 |
| UTF-8 y `try-with-resources` | A | Codificación y cierre automático explicados |
| Excepciones propias con causa | A | `FormatoArchivoException`, `throw`, `throws` y causa aplicados |
| Elección de Java, JVM y portabilidad | A/DO | `.java→bytecode→JVM` y límites por rutas/comandos defendidos |
| Excepciones checked/unchecked y flujo completo | A/DO | Consolidadas con archivos y excepción propia en Día 12 |
| Principios SOLID | A/DO | SRP, DIP y OCP aplicados a `AgendaTrabajos` |
| Encoding, hashing y cifrado | NI | Complementario transversal; previsto 20/08 |

---

# 3. Algoritmos y Estructuras de Datos

| Tema | Estado | Evidencia acumulada |
|---|---|---|
| TDA e interfaz/implementación | A/DO | Contrato aplicado a Pila y Cola |
| Arreglos, capacidad y longitud | A/DO | Comparados con `ArrayList` en Día 11 |
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
| Listas doble/circular/ordenada | A/DO | Enlaces, finales, ventajas, riesgos y complejidades aplicados |
| Iteradores | A/DO | `hasNext()`, `next()` y `Iterator.remove()` explicados y aplicados |
| Inserción | A | Inicio y posición intermedia aplicados; inserción final pendiente |
| Mergesort | C | Estrategia conocida; práctica pendiente |
| Quicksort | C | Pivote/recursión conocidos; complejidad a reforzar |
| Complejidades | C/A | Listas: búsqueda `O(n)` y enlaces conocidos `O(1)`; ordenación sigue abierta |

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
| Restricción `UNIQUE` | A | Diferenciada de PK y aplicada con restricciones SQL |
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
| DDL/DML | A/DO | `CREATE`, `ALTER`, `SELECT`, `INSERT`, `UPDATE` y `DELETE` clasificados |
| DCL/TCL | A/DO | `GRANT` y `COMMIT` clasificados correctamente en dos instancias |
| Álgebra relacional y SQL académico | A | Proyección, filtro, orden y cambios seguros aplicados; álgebra formal pendiente |
| Procedimientos, cursores y triggers | NI | Pendiente |
| Oracle/MySQL/SQLite: elección por escenario | NI/EA | Motores respaldados por el material; previsto 20/08 |
| PostgreSQL: comparación conceptual | NI | Complementario; previsto 20/08 |
| Transacciones y propiedades ACID | C/EA | `BEGIN`, `COMMIT` y `ROLLBACK` comprendidos; propiedades ACID pendientes |

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
| Enlace y Ethernet | C/A | Trama, MAC, FCS y aplicación en LAN trabajados en Día 12 |
| WAN y última milla | NI/EA | Pendiente |
| Hub/repetidor/switch/router por capa | A/DO | Capa, PDU y dirección defendidas; recuperación final correcta |
| Gateway por capa | NI/EA | Preparado, pero no evaluado en la jornada real |
| UTP y motivo del trenzado | A/DO | Medio guiado, señal eléctrica y reducción de interferencia explicados |
| Diafonía e interferencia | C | Relación general comprendida; precisión sobre diafonía pendiente |
| FTP/STP como tipos de cable | C/A | Blindaje comprendido; diferencia con Spanning Tree aclarada |
| HDLC/PPP/Ethernet | EA/C | Trabajados; comparación final incompleta, E-063 abierto |
| LLC/MAC | C/A | Funciones recuperadas; evitar “enrutamiento físico” |
| Switch: aprendizaje y tabla MAC | A | Aprendizaje por origen, consulta de destino, flooding y reenvío selectivo aplicados |
| STP y bucles de capa 2 | C/A | Función comprendida; comparación con routing pendiente |
| Bucle de routing, TTL y métricas | EA | Diferencia final no demostrada sin apoyo; E-065 abierto |
| IPv4, máscara, red y broadcast | NI | Complementario; previsto 21/08 |
| CIDR y selección de prefijo | NI | Complementario; previsto 21/08 |
| Clases A/B/C históricas | NI | Complementario; previsto 21/08 |
| TCP frente a UDP | NI/EA | Mención respaldada y desarrollo complementario; previsto 21/08 |
| Three-way handshake | NI | Complementario; previsto 21/08 |
| Router y tabla de enrutamiento | C/A | Función integrada en defensa final; desarrollo de métricas pendiente |
| LAN/MAN/WAN | NI/EA | Respaldado; previsto 21/08 |
| MPLS | NI/EA | Respaldado; previsto 21/08 |
| VPN, DMZ y firewall por capas | NI | Complementario; previsto 21/08 |
| Servidor propio frente a contratado | A | Decisión justificada con costo, control, disponibilidad, riesgo y mitigación |

---

# 6. Integración y defensa

| Tema | Estado | Evidencia acumulada |
|---|---|---|
| Requisito→caso de uso | A/DO | Explicado oralmente |
| Caso→análisis→diseño | A | Día 9 y Caso integrador |
| Diseño→POO/estructuras | A/DO | Servicios, colecciones, listas, excepciones y SOLID integrados |
| Diseño→datos | A | DER y normalización |
| Aplicación→comunicaciones | A | Recorrido TCP/IP |
| Práctica guiada transversal | A | 15/08 |
| Integración escrita Día 9 | C/A | Cadena correcta; modo offline omitido |
| Defensa continua 8–12 minutos | C/A | Evidencia oral previa; defensa específica Día 9 no realizada |
| Validación Java + restricciones de base | A/DO | Detección temprana e integridad ante múltiples vías defendidas |

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
| Día 11 — Java + listas avanzadas + SQL + SOLID | **9,2/10** |
| Día 12 — Implementación + archivos Java + enlace de datos | **8,05/10** |

```text
Día 9:
cerrado sin defensa oral
nota global no asignada

Caso integrador 1:
práctica guiada, sin puntaje formal
```

---

# 8. Pendientes de retención inmediata

1. Java completo: archivos separados, ejecución autónoma y prueba polimórfica.
2. Asociativa frente a débil.
3. Diagrama de estados completo.
4. Modelo final con PK/FK/UNIQUE y atributos.
5. Generalización UML y relaciones UML restantes.
6. Digitalización, política y supuestos de transmisión.
7. Atenuación, ruido, dispersión, latencia, gateway, módem y última milla.
8. Programa Java autónomo con archivos separados.
9. HDLC frente a PPP frente a Ethernet.
10. Bucle de capa 2 frente a bucle de enrutamiento.
11. Componente frente a subsistema y artefacto.
12. Ordenación y sus complejidades.

Documento de repaso:

```text
RESUMENES/2026-08-16_REPASO-SEMANAL-PUNTOS-DEBILES.md
```

---

## Regla de lectura

La matriz resume la mejor evidencia disponible. `DO` no significa dominio total. El Día 9 aporta evidencia escrita sin nota global. El Día 10 aporta `8,5/10 + 4/4`; el Día 11 aporta `9,2/10`; el Día 12 aporta `8,05/10` y defensa integradora `1/1`.
