# Matriz de progreso del programa

**Actualizada al cierre semanal por evidencia acumulada — 15/08/2026**

Estados:

- `NI` = No iniciado
- `EA` = En aprendizaje
- `C` = Comprendido
- `A` = Aplicado
- `DO` = Defendible oralmente

> El cierre semanal no asigna una nueva nota por materia. Los estados reflejan la mejor evidencia de evaluaciones, defensas, recuperaciones y práctica guiada. El indicador semanal 8,6/10 es un promedio descriptivo de los Días 5 a 8.

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
| Notación de generalización UML | C | Dirección correcta; triángulo vacío requiere automatización |
| Precondiciones, flujos y postcondiciones | A | Crear OT y Registrar ejecución |
| Propósito del análisis | A/DO | Día 8 |
| Caso de uso vs. modelo de análisis | DO | Vista externa/interna defendida |
| Artefactos del análisis | C/A | Modelo, clase, realización, paquete y vista |
| Interfaz/control/entidad | DO | Clasificados y defendidos |
| Responsabilidades conceptuales | A | Casos Registrar ejecución |
| Realización y colaboración | A | Flujos normales aplicados |
| Alternativo sin conexión | C/A | Aplicado con correcciones de secuencia |
| Mensajes vs. métodos definitivos | A | Diferenciados |
| Análisis vs. diseño vs. implementación | A | Día 9 parcial y Caso integrador |
| Modelo de diseño | A parcial | Servicios, repositorios, Cola y Sincronizador |
| Diagrama de secuencia | C/A | Orden temporal aplicado; foco/líneas de vida a reforzar |
| Diagrama de estados | C | Estados y transiciones comprendidos; producto completo pendiente |
| Subsistemas e interfaces | C/A | Introducidos en Día 9 |
| Asociación/agregación/composición/dependencia | EA | Brecha prioritaria |
| Modelo de implementación/pruebas | NI/EA | Pendiente como bloque formal |

---

# 2. Programación Orientada a Objetos

| Tema | Estado | Evidencia acumulada |
|---|---|---|
| Clase y objeto | DO | Día 5 |
| Estado, comportamiento e identidad | DO | Día 5 |
| Encapsulamiento | DO | Aplicado a OT y solicitudes |
| Atributos, métodos y constructor | A | Constructor consolidado |
| `this` y `super` | A | Día 7 |
| Miembros estáticos | A | Contador de instancias |
| Herencia y relación `es un` | A | UsuarioSistema y canales |
| Superclase/subclase y `extends` | A | Aplicados |
| Sobrecarga/sobrescritura | A | `buscarOT`/`getRol`/`enviar` |
| Clase `Object` | C | Reconocida |
| `toString()` conceptual | C/A | Comprendido; escritura autónoma a consolidar |
| Abstracción | A | Día 9 parcial |
| Abstracción vs. encapsulamiento | A | Diferenciadas |
| Clase abstracta | A | `CanalNotificacion` |
| Método abstracto | A | `enviar(String)` |
| Constructor de abstracta | A | Parte común mediante `super(...)` |
| Interfaz | A | `Auditable` |
| `implements` | A | Email, Móvil y capacidad auditable |
| Clase abstracta vs. interfaz | C/A | Defendida en núcleo |
| Polimorfismo | A | `List<CanalNotificacion>` |
| Referencia común/objeto concreto | A | Explicado oralmente |
| Validación de `String` | C | `==` corregido hacia `isBlank/isEmpty`; repetir en código |
| `@Override` | C/A | Comprendido; omisión en código inicial |
| Sintaxis/completitud Java | EA/A | Código funcional conceptual con errores puntuales |
| `equals/hashCode` | NI | Pendiente |
| Excepciones | EA | Utilizadas en corrección; bloque formal pendiente |
| Colecciones/archivos | NI/EA | `List` aplicada; resto pendiente |

---

# 3. Algoritmos y Estructuras de Datos

| Tema | Estado | Evidencia acumulada |
|---|---|---|
| TDA e interfaz/implementación | A/DO | Contrato aplicado a Pila y Cola |
| Arreglos, capacidad y longitud | A | Día 3 |
| Nodos y referencias | C/A | Listas, Pilas y Colas |
| Lista simplemente enlazada | A | Inserción/recorrido |
| Pila y LIFO | DO | Día 6 y Caso integrador |
| `push`, `pop`, `peek`, cima | A | Simulaciones correctas |
| Pila con vector/lista | A | Comparadas |
| Cola y FIFO | DO | Día 8 y Caso integrador |
| Frente y final | A | Aplicados |
| `encolar`, `desencolar`, `cabecera` | A | Simulaciones y sincronización |
| Cola con vector | A/DO | Índices, capacidad y reutilización |
| Cola con lista enlazada | A/DO | Nodos, referencias y memoria |
| Comparación vector/lista | A/DO | Riesgos consolidados |
| Contrato TDA vs. implementación | A | Recuperado en Día 9 y caso |
| Pila vs. Cola | A/DO | LIFO/FIFO aplicados |
| FIFO vs. trazabilidad | C/A | Orden vs. historia diferenciados con corrección |
| Confirmación antes de desencolar | C/A | Regla aplicada tras corrección |
| Cola de prioridad | C/A | Elegida para urgencias |
| Selección de estructura | DO | Política y operación dominante |
| Listas doble/circular/ordenada | NI | Pendiente |
| Ordenación y complejidades | EA | Brecha prioritaria |

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
| Instancia | A | Ocurrencia concreta recuperada |
| Cardinalidad 1:1/1:N/N:M | A | Sector–OT, OT–Operario, ejecuciones |
| Participación mínima/máxima | A | 0..N y 1..1 con supuestos |
| Entidad fuerte/débil | C | Concepto comprendido; aplicación bajo presión pendiente |
| Entidad asociativa | A | `ASIGNACION_OT` |
| Asociativa vs. débil | EA/C | Reapareció confusión oral; prioridad de recuperación |
| Simbología DER | A | Rectángulo doble y línea doble recuperados |
| Atributo multivaluado/derivado | A | Teléfono/edad |
| Pasaje entidad→tabla | A | Día 7 |
| Pasaje 1:N | A | FK en lado N |
| Pasaje N:M | A | Tabla asociativa |
| N:M conceptual vs. asociativa | A | Aplicado |
| Historial y elección de PK | C/A | Fecha en clave, ID artificial y `UNIQUE` |
| Restricción `UNIQUE` | C/A | Número de OT y clave histórica |
| Normalización: propósito/anomalías | A | Día 9 parcial |
| 1FN | A | Teléfonos atómicos |
| 2FN | A | Dependencias parciales recuperadas |
| 3FN | A | Dependencia transitiva Sector |
| Dependencias funcionales | C/A | Aplicadas; terminología a reforzar |
| ID artificial vs. normalización | A | Comprendido |
| Claves de Ejecución/Solicitud | C | Diseño recomendado; precisión pendiente |
| DDL/DML | C | `CREATE`/`INSERT` |
| DCL/TCL | EA | `GRANT`/`COMMIT` pendientes |
| Álgebra relacional y SQL académico | NI/EA | Pendiente |
| Procedimientos, cursores y triggers | NI | Pendiente |

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
| Información e incertidumbre | C/A | Relación general aplicada |
| Fórmula `I(E)` y unidad | C/A | Recuperada finalmente con `1/16=4 bits` |
| Entropía y tasa | C | Cálculos básicos |
| bits / bits-símbolo / bits-segundo | C/A | Diferenciados |
| Señal analógica/digital | A | Aplicadas |
| Amplitud | EA/C | Diferencia con potencia pendiente |
| Período y frecuencia | A | `500 Hz` calculado correctamente |
| `f=1/T`, `T=1/f` | A | Aplicadas |
| Muestreo | A | Concepto y cálculo |
| `fs≥2·fmax` | A | `8 k muestras/s` aplicado |
| Cuantificación/codificación | C/A | Integradas conceptualmente |
| Serie/paralela | A | Diferenciadas |
| Síncrona/asíncrona | A | Definiciones correctas |
| Supuestos de transmisión | EA/C | No derivar asincronía de desconexión |
| Transmisión analógica posible | C | Corregido |
| Medios guiados/no guiados | C | Móvil puede iniciar por medio no guiado |
| Atenuación/ruido/interferencia/dispersión/latencia | NI | Pendiente |
| Enlace, Ethernet, WAN y última milla | NI/EA | Pendiente |

---

# 6. Integración y defensa

| Tema | Estado | Evidencia acumulada |
|---|---|---|
| Requisito→caso de uso | A/DO | Explicado oralmente |
| Caso→análisis→diseño | A | Caso integrador |
| Diseño→POO/estructuras | A | Servicios, Pila, Cola y polimorfismo |
| Diseño→datos | A | DER y normalización |
| Aplicación→comunicaciones | A | Recorrido TCP/IP |
| Práctica guiada transversal | A | 15/08 |
| Defensa continua 8–12 minutos | C/A | Integración oral parcial; simulacro formal pendiente |

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

```text
Día 9: sin nota; permanece en pausa.
Caso integrador 1: práctica guiada; sin puntaje formal.
```

---

# 8. Pendientes de retención inmediata

1. Asociativa frente a débil.
2. Generalización UML y relaciones UML restantes.
3. Alternativo sin conexión con participantes completos.
4. `String`, validaciones, `@Override` y `toString()`.
5. Confirmación antes de desencolar.
6. Claves/cardinalidades de ejecución y solicitud.
7. `UNIQUE` histórico.
8. Supuestos de transmisión.
9. Amplitud y nivel físico.
10. DCL/TCL y ordenación/complejidades.

---

## Regla de lectura

La matriz resume la mejor evidencia disponible. `DO` no significa dominio total de la materia, sino capacidad de defender el núcleo trabajado. El cierre semanal no reemplaza la evaluación pendiente del Día 9.
