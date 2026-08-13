# Jueves 13/8 — Día 8
## Modelo de análisis + Colas + Transmisión

**Etapa:** cuarta jornada intensiva de vacaciones  
**Duración indicada por el plan:** 5,5 horas núcleo  
**Materias:** Análisis y Diseño + Algoritmos/Estructuras + Comunicaciones  
**Modalidad:** recuperación activa, modelado, simulación, cálculos breves, evaluación y defensa

> Nota de planificación: los bloques del plan suman 6 horas efectivas —90 + 90 + 30 + 90 + 60 minutos— aunque el encabezado indica 5,5 horas núcleo. Se conservan todos los contenidos; el tramo final puede ajustarse según energía.

---

# 1. Resultado esperado

Al finalizar la jornada deben existir:

- explicación del propósito del análisis;
- comparación modelo de casos de uso vs. modelo de análisis;
- mapa con clases de interfaz, entidad y control;
- realización textual de un caso de uso mediante colaboración;
- definición y simulación de una Cola FIFO;
- comparación de Pila y Cola;
- comparación de cola con vector y lista enlazada;
- explicación de medida de información e incertidumbre;
- ejercicios breves de `I(E)`, frecuencia y muestreo;
- comparación de señales analógicas/digitales;
- cuadro serie/paralela y síncrona/asíncrona;
- caso integrador;
- evaluación escrita;
- defensa oral o distribuida registrada;
- plantilla de cierre.

---

# 2. Productos obligatorios del plan

1. `FICHAS/2026-08-13_MAPA-MODELO-ANALISIS.md`
2. `FICHAS/2026-08-13_FICHA-COLA.md`
3. `FICHAS/2026-08-13_CUADRO-TRANSMISION.md`

Producto integrador adicional:

- `CASOS/2026-08-13_CASO-INTEGRADOR-ANALISIS-COLA-TRANSMISION.md`

---

# 3. Cronograma operativo

## Mañana

| Bloque | Duración | Actividad |
|---|---:|---|
| Recuperación inicial | 20 min | Generalización, instancia, DER, asociativa/débil, completo/verificable, `toString`, N:M/tabla |
| M1 — Modelo de análisis | 70 min | Propósito, artefactos, clases y colaboración |
| Pausa | 15 min | Descanso real |
| M2 — Colas | 90 min | FIFO, operaciones, vector/lista y simulación |
| Cierre de mañana | 30 min | Comparar Pila/Cola y completar mapa parcial |

## Tarde

| Bloque | Duración | Actividad |
|---|---:|---|
| T1 — Transmisión | 90 min | Información, señales, muestreo y formas de transmisión |
| Pausa | 15 min | Descanso |
| T2.1 — Caso integrador | 20 min | OT móvil + cola de solicitudes + transmisión |
| T2.2 — Evaluación | 30 min | Escrito breve |
| T2.3 — Defensa y síntesis | 10 min | Mapa conceptual y cierre inicial |

---

# 4. Recuperación inicial — sin apuntes

Responder en una o dos oraciones:

1. ¿Cómo se representa una generalización UML y hacia dónde apunta?
2. ¿Qué es una instancia de una entidad?
3. Completá:

```text
Rectángulo doble →
Línea doble      →
```

4. ¿Qué diferencia existe entre entidad asociativa y entidad débil?
5. ¿Qué diferencia existe entre requerimiento completo y verificable?
6. ¿Qué es `toString()` y de qué clase se hereda?
7. ¿Qué diferencia existe entre una relación N:M conceptual y una tabla asociativa?
8. ¿Cuál es el riesgo principal de una implementación con vector y cuál el de una lista enlazada?

Reglas:

- responder antes de abrir fichas;
- no corregir silenciosamente;
- repetir al final únicamente los errores reales.

---

# 5. M1 — Modelo de análisis

## 5.1 Propósito del análisis

Durante el análisis se refinan y estructuran los requisitos capturados para obtener:

- una comprensión más precisa;
- una descripción fácil de mantener;
- una estructura interna inicial del sistema;
- una base para arquitectura, diseño e implementación.

El material denomina **modelo de análisis** al modelo de objetos conceptual utilizado para refinar los requisitos.

## 5.2 Vista externa vs. vista interna

```text
Modelo de casos de uso
→ vista externa
→ quién usa el sistema y qué resultado obtiene.

Modelo de análisis
→ vista interna
→ qué objetos conceptuales colaboran para realizar los casos.
```

El modelo de análisis:

- está expresado en lenguaje del desarrollador;
- introduce mayor formalismo;
- se estructura mediante clases y paquetes;
- sirve como primera aproximación al diseño;
- no debería contener redundancias ni inconsistencias entre requisitos.

## 5.3 Artefactos principales

Según el material, los artefactos fundamentales del análisis son:

```text
Modelo de análisis
Clase de análisis
Realización de caso de uso–análisis
Paquete del análisis
Vista/Descripción de arquitectura del análisis
```

### Modelo de análisis

Sistema conceptual organizado en paquetes de análisis. Los casos de uso se describen mediante clases y objetos que colaboran.

### Clase de análisis

Abstracción conceptual que encaja en uno de tres estereotipos:

```text
<<interfaz>>
<<entidad>>
<<control>>
```

### Realización de caso de uso–análisis

Colaboración que describe cómo se lleva a cabo un caso de uso mediante interacción entre objetos de análisis.

### Paquete de análisis

Agrupa clases, realizaciones y otros paquetes en piezas manejables.

### Vista de arquitectura

Muestra los artefactos de análisis más significativos para la arquitectura: paquetes, dependencias, clases fundamentales y realizaciones críticas.

---

# 6. Clases de análisis

## 6.1 Clase de interfaz

Modela la interacción entre actor y sistema: intercambio de información y solicitudes.

Puede representar conceptualmente:

- ventana;
- formulario;
- panel;
- terminal;
- interfaz de comunicación;
- sensor;
- impresora.

Responsabilidades típicas:

```text
solicitar datos
mostrar información
solicitar selección
solicitar confirmación
recibir una petición externa
```

No debe concentrar toda la lógica del negocio.

## 6.2 Clase de entidad

Modela información de larga vida, a menudo persistente, y comportamiento asociado a un hecho o concepto del dominio.

Ejemplos del caso OT:

```text
OrdenTrabajo
Operario
EjecucionOT
SolicitudSincronizacion
```

Responsabilidades de entidad:

```text
conocer datos propios
conocer objetos relacionados
calcular información derivada
realizar comportamiento propio del concepto
```

Una clase de entidad del análisis no equivale automáticamente a una tabla ni a una clase Java definitiva.

## 6.3 Clase de control

Representa coordinación, secuencia, transacción y control de otros objetos.

Responsabilidades típicas:

```text
seguir el flujo del caso de uso
validar datos
coordinar interfaz y entidades
calcular un resultado que no pertenece a una entidad concreta
manejar una transacción conceptual
```

Ejemplo:

```text
ControlRegistrarEjecucion
ControlSincronizarOT
```

## 6.4 Fórmula de memoria

```text
INTERFAZ
→ habla con el actor.

CONTROL
→ coordina el caso de uso.

ENTIDAD
→ representa información del dominio.
```

---

# 7. Realización de caso de uso–análisis

## 7.1 Objetivo

Analizar un caso de uso permite:

1. identificar las clases de análisis necesarias;
2. distribuir el comportamiento entre objetos;
3. capturar requisitos especiales de esa realización.

## 7.2 Colaboración

Una colaboración describe los objetos participantes y los mensajes que intercambian para cumplir un propósito.

Conceptos:

```text
Interacción
→ conjunto de mensajes entre objetos.

Mensaje
→ comunicación que transmite información y desencadena una responsabilidad.

Enlace
→ conexión semántica entre objetos; instancia de una asociación.
```

En análisis, el interés principal es identificar responsabilidades y enlaces; la secuencia cronológica detallada queda para diseño.

## 7.3 Regla de inicio

El flujo comienza cuando:

```text
Actor
  ↓ mensaje
Objeto de interfaz
  ↓
Objetos de control y entidad
```

## 7.4 Ejemplo textual — Registrar ejecución de OT

```text
Actor: Operario

Objetos:
:FormularioEjecucion        <<interfaz>>
:ControlRegistrarEjecucion <<control>>
:OrdenTrabajo              <<entidad>>
:EjecucionOT               <<entidad>>
```

Colaboración conceptual:

```text
1. Operario → FormularioEjecucion:
   solicitar registrar ejecución

2. FormularioEjecucion → ControlRegistrarEjecucion:
   enviar datos ingresados

3. ControlRegistrarEjecucion → OrdenTrabajo:
   verificar que la OT admita ejecución

4. ControlRegistrarEjecucion → EjecucionOT:
   registrar resultado de trabajo

5. ControlRegistrarEjecucion → OrdenTrabajo:
   actualizar estado correspondiente

6. ControlRegistrarEjecucion → FormularioEjecucion:
   informar resultado
```

En el análisis, los mensajes expresan propósitos/responsabilidades; no es obligatorio convertirlos todavía en métodos con signaturas Java.

## 7.5 Control de calidad

- cada clase identificada debe participar en la colaboración;
- si una clase no participa, revisar si realmente se necesita;
- primero modelar flujo normal;
- después incorporar alternativos;
- no adelantar tecnología de interfaz o persistencia innecesaria.

---

# 8. M2 — Cola como TDA

## 8.1 Definición

Una Cola o `queue` es un TDA lineal restrictivo:

- se inserta únicamente por el **final**;
- se elimina únicamente por el **frente**;
- el primer elemento en entrar es el primero en salir.

```text
FIFO = First In, First Out
     = primero en entrar, primero en salir
```

## 8.2 Partes

```text
Frente
→ primer elemento; próximo en salir.

Final
→ último elemento; lugar de inserción.
```

Ejemplo:

```text
Frente → [A][B][C] ← Final
```

## 8.3 Operaciones

La interfaz estudiada en el material incluye:

```text
longitud()
esVacia()
encolar(elemento)
desencolar()
cabecera()
```

### `encolar`

Agrega al final.

### `desencolar`

Devuelve y elimina el elemento del frente.

### `cabecera`

Consulta el frente sin eliminarlo.

### `esVacia`

Informa si no existen elementos.

### `longitud`

Informa cantidad de elementos.

---

# 9. Simulación FIFO

Partiendo de una cola vacía:

```text
encolar(A)
encolar(B)
encolar(C)
cabecera()
desencolar()
encolar(D)
desencolar()
```

Evolución:

```text
[]
[A]
[A,B]
[A,B,C]

cabecera() → A
cola sigue [A,B,C]

desencolar() → A
queda [B,C]

encolar(D)
queda [B,C,D]

desencolar() → B
queda [C,D]
```

```text
Frente final → C
Final final  → D
```

---

# 10. Cola con lista enlazada

El material utiliza dos referencias:

```text
cabecera → frente
cola     → final
```

## Encolar

1. crear nodo con siguiente `null`;
2. si está vacía, cabecera y final apuntan al nodo;
3. si no, enlazar el final actual con el nuevo;
4. mover final al nuevo nodo;
5. incrementar longitud.

Pseudocódigo:

```text
nuevo = Nodo(elemento, null)

si longitud == 0:
    cabecera = nuevo
si no:
    final.siguiente = nuevo

final = nuevo
longitud++
```

## Desencolar

1. tomar elemento de cabecera;
2. mover cabecera al siguiente;
3. reducir longitud;
4. si quedó vacía, final pasa a `null`.

```text
si está vacía:
    no hay elemento

valor = cabecera.elemento
cabecera = cabecera.siguiente
longitud--

si longitud == 0:
    final = null

retornar valor
```

Ventaja principal:

- tamaño variable según memoria disponible.

Riesgos:

- manejo incorrecto de referencias;
- pérdida de enlaces;
- agotamiento de memoria.

---

# 11. Cola con vector

El material indica que se necesitan:

```text
vector de n elementos
frente (f)
final (r)
```

Operaciones conceptuales:

- encolar en la posición de final;
- desencolar desde la posición de frente;
- consultar el primer elemento;
- controlar vacía/llena;
- vaciar.

Características:

- capacidad definida;
- acceso por índices;
- requiere controlar frente, final y cantidad;
- puede desbordarse al alcanzar la capacidad.

Una implementación circular puede reutilizar posiciones liberadas, pero hoy se estudia solamente como extensión opcional; el núcleo es comprender frente/final y FIFO.

---

# 12. Vector vs. lista enlazada

| Criterio | Vector | Lista enlazada |
|---|---|---|
| Capacidad | Definida | Variable |
| Frente/final | Índices | Referencias |
| Memoria | Puede reservar espacios no usados | Nodo + referencia por elemento |
| Encolar | Posición final | Nuevo nodo al final |
| Desencolar | Posición frente | Retirar cabecera |
| Riesgo | Capacidad/desbordamiento | Referencias/memoria |
| Elección | Máximo conocido y controlado | Volumen desconocido o variable |

La interfaz del TDA permanece igual aunque cambie la implementación.

---

# 13. Pila vs. Cola

| Pila | Cola |
|---|---|
| LIFO | FIFO |
| Inserta en cima | Inserta en final |
| Elimina en cima | Elimina en frente |
| Último en entrar sale primero | Primero en entrar sale primero |
| Deshacer | Turnos/peticiones |

Ejemplos:

```text
Historial Deshacer
→ Pila

Solicitudes al servidor por orden de llegada
→ Cola
```

La estructura se elige por la operación dominante y la regla del problema.

---

# 14. T1 — Medida de la información

## 14.1 Información como término técnico

El material separa la medida técnica de información de su significado semántico.

Idea central:

```text
Menor probabilidad de un evento
→ mayor incertidumbre previa
→ mayor información cuando ocurre.
```

Si un mensaje era completamente seguro:

```text
P(E) = 1
I(E) = 0
```

## 14.2 Fórmula

Utilizando base 2:

```text
I(E) = log2(1 / P(E))
```

Unidad:

```text
bits
```

Ejemplos:

```text
P(E)=1/2
I(E)=log2(2)=1 bit

P(E)=1/8
I(E)=log2(8)=3 bits
```

## 14.3 Entropía y tasa

El material define la entropía como el valor medio de información por símbolo:

```text
H(S) → bits/símbolo
```

Si una fuente genera `m` símbolos por segundo:

```text
R = m · H(S)
```

Unidad:

```text
bits/segundo
```

Para el Día 8 se exige comprender concepto, unidad y un cálculo simple; no se profundiza la demostración matemática.

---

# 15. Señales

## 15.1 Concepto

Una señal u onda electromagnética es una forma de propagación de radiación electromagnética a través del espacio. El éxito de la transmisión depende de la calidad de la señal y del medio.

## 15.2 Señal analógica

Características del material:

- continua;
- ondulante;
- voltaje variable en el tiempo;
- típica de fenómenos naturales.

## 15.3 Señal digital

Características:

- discreta o pulsante;
- amplitud fija durante intervalos determinados;
- típica de la tecnología.

## 15.4 Amplitud, período y frecuencia

```text
Amplitud (A)
→ magnitud de la señal.

Período (T)
→ tiempo para completar un ciclo.

Frecuencia (f)
→ cantidad de ciclos por segundo.
```

Relación:

```text
f = 1 / T
T = 1 / f
```

Unidades:

```text
f → hertz (Hz)
T → segundos (s)
```

Ejemplo:

```text
T = 0,01 s
f = 1 / 0,01 = 100 Hz
```

---

# 16. Muestreo

Una señal continua puede representarse mediante muestras.

Regla del material:

```text
fs ≥ 2 · fmax
```

Donde:

```text
fs   = frecuencia de muestreo
fmax = frecuencia máxima de la señal
```

Ejemplo:

```text
fmax = 10 kHz
fs mínima = 20 k muestras/segundo
```

Si se toman más muestras, se obtiene una mejor representación, aunque crece el ancho de banda requerido según el tratamiento del material.

Error a evitar:

```text
10 kHz de señal
≠ 10 k muestras/s mínimas
```

Se necesitan al menos 20 k muestras/s.

---

# 17. Transmisión serie y paralela

## Serie

Según el material:

- transmite bit a bit;
- utiliza una línea de señal y otra de retorno;
- permite distancias mayores que la paralela del ejemplo estudiado.

```text
bit → bit → bit → bit
```

## Paralela

- transmite varias líneas simultáneamente;
- puede trabajar con 8, 16, 32 o 64 líneas conjuntas;
- en el ejemplo del material se limita a distancias cortas.

```text
8/16/32/64 bits en líneas simultáneas
```

## Comparación

| Serie | Paralela |
|---|---|
| Bit a bit | Varios bits simultáneos |
| Menos líneas | Más líneas físicas |
| Adecuada para mayor distancia en el material | Adecuada para distancia corta en el material |
| Ej.: RS-232 | Ej.: interfaz paralela local del material |

---

# 18. Transmisión asíncrona y síncrona

## Asíncrona

- no existe sincronismo a nivel de mensaje;
- sí existe sincronismo a nivel de carácter;
- cada carácter se delimita mediante `start` y uno o dos bits `stop`;
- el intervalo entre caracteres puede variar.

```text
start + carácter + stop
```

## Síncrona

- existe regularidad entre los bits de un bloque;
- la información queda entre cabecera y terminación de bloque;
- el rendimiento aumenta al crecer el bloque según el material.

```text
cabecera + bloque + terminación
```

## Comparación

```text
Asíncrona
→ carácter + start/stop

Síncrona
→ bloque + cabecera/terminación
```

No confundir esta diferencia con tolerancia a fallos ni segmentación de Transporte.

---

# 19. Caso integrador del Día 8

Situación didáctica:

> Un Operario registra la ejecución de una OT desde una aplicación móvil. Si varias solicitudes llegan al servidor, deben procesarse por orden de llegada. Una medición analógica opcional de un sensor se muestrea, se digitaliza y se transmite al servidor.

Integración:

```text
Caso de uso
Registrar ejecución de OT
        ↓
Modelo de análisis
Interfaz → Control → Entidades
        ↓
Estructura
Cola FIFO de solicitudes pendientes
        ↓
Transmisión
señal analógica → muestreo → datos digitales
→ serie/síncrona o asíncrona según solución
```

El caso no obliga una tecnología concreta: sirve para aplicar los conceptos y declarar supuestos.

---

# 20. T2 — Evaluación y síntesis

Resolver:

```text
EVALUACIONES/2026-08-13_EVALUACION-DIA-08.md
```

Reglas:

- sin apuntes;
- conservar respuestas originales;
- declarar supuestos;
- incluir cálculos y unidades;
- diferenciar modelo conceptual de decisión de implementación.

Después completar:

- mapa conceptual;
- dudas;
- errores;
- cierre inicial.

---

# 21. Criterio de aprobación

## Escrito

- equivalente a 7/10 o más;
- ningún bloque central omitido;
- interfaz/control/entidad correctamente diferenciadas;
- simulación FIFO correcta;
- muestreo con factor mínimo 2;
- serie/paralela y síncrona/asíncrona diferenciadas.

## Defensa

- relacionar caso de uso, colaboración, cola y transmisión;
- justificar por qué la cola es FIFO;
- explicar responsabilidades sin adelantar métodos de diseño;
- usar unidades correctas.

## Consolidación

`DO` solo se propone para contenidos formalmente defendidos; reconocer un concepto no convierte toda la materia en defendible.

---

# 22. Fuentes de la jornada

- `02-PLAN-MAESTRO-HASTA-03-09.md`.
- `Analisis_y_Diseno_de_Software.md`.
- `Taller_de_Algoritmos_y_Estructuras_de_Datos_I.md`.
- `COMUNICACIONES.md`.
- estado, matriz, evaluación y errores acumulados hasta el Día 7.

Los ejercicios y el caso integrador son adaptaciones didácticas del dominio de Órdenes de Trabajo. Las definiciones, categorías, operaciones y fórmulas conservan el alcance y la terminología de los materiales universitarios.

---

# 23. Comando de inicio

> **Iniciar EFIP — 2026-08-13 — Día 8**
