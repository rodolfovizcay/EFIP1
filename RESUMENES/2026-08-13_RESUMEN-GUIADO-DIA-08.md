# Resumen guiado EFIP I — Día 8
## Modelo de análisis, Colas y Transmisión

**Fecha de estudio:** 13 de agosto de 2026  
**Materias:** Análisis y Diseño + Algoritmos/Estructuras + Comunicaciones  
**Objetivo:** definir, diferenciar, aplicar y relacionar los tres bloques sin depender del apunte

---

# Cómo estudiar este resumen

Para cada concepto:

```text
1. Definir.
2. Diferenciar.
3. Aplicar.
4. Justificar.
5. Recuperar sin mirar.
```

No considerar dominado un tema solo porque se reconoce su nombre.

---

# PARTE I — MODELO DE ANÁLISIS

# 1. Del requisito al análisis

La captura de requisitos describe qué necesita el usuario. El análisis toma esos requisitos, los refina y los estructura para comprender con mayor precisión cómo puede organizarse internamente el sistema.

```text
Necesidad
   ↓
Requerimiento
   ↓
Caso de uso — vista externa
   ↓
Modelo de análisis — vista interna conceptual
   ↓
Diseño e implementación posteriores
```

El análisis no es todavía diseño técnico definitivo.

---

# 2. Propósito del análisis

El material establece que durante el análisis se busca:

- conseguir una comprensión más precisa de los requisitos;
- producir una descripción fácil de mantener;
- estructurar el sistema y contribuir a su arquitectura;
- eliminar redundancias e inconsistencias;
- ofrecer una primera aproximación al diseño;
- explicar cómo puede realizarse la funcionalidad dentro del sistema.

## Respuesta oral modelo

> El análisis refina y estructura los requisitos mediante un modelo de objetos conceptual. Produce una vista interna del sistema, más formal que el modelo de casos de uso, y sirve como entrada para el diseño y la implementación.

---

# 3. Casos de uso vs. modelo de análisis

| Modelo de casos de uso | Modelo de análisis |
|---|---|
| Vista externa | Vista interna |
| Actor y objetivo | Objetos que colaboran |
| Qué ofrece el sistema | Cómo se organiza conceptualmente la realización |
| Lenguaje cercano al usuario | Lenguaje del desarrollador |
| Casos y relaciones | Clases, objetos, colaboraciones y paquetes |

No confundir:

```text
Caso de uso
≠ clase
≠ método
≠ tabla
```

Un caso de uso suele necesitar varios objetos y responsabilidades.

---

# 4. Artefactos del flujo de análisis

El material enumera:

```text
Modelo de análisis
Clase de análisis
Realización de caso de uso–análisis
Paquete del análisis
Descripción/vista de arquitectura del análisis
```

## 4.1 Modelo de análisis

Modelo conceptual organizado en paquetes. Describe los casos de uso mediante clases y objetos que colaboran.

## 4.2 Clase de análisis

Abstracción conceptual de una o varias clases o subsistemas de diseño. Se clasifica como:

```text
interfaz
entidad
control
```

## 4.3 Realización de caso de uso–análisis

Colaboración que explica cómo se lleva a cabo un caso de uso mediante interacción entre objetos de análisis.

## 4.4 Paquete del análisis

Agrupa artefactos en piezas manejables y busca bajo acoplamiento entre paquetes.

## 4.5 Vista de arquitectura

Presenta paquetes, dependencias, clases fundamentales y realizaciones significativas para la arquitectura.

---

# 5. Clase de interfaz

## Definición

Modela la interacción entre actor y sistema.

Puede representar conceptualmente:

- formularios;
- ventanas;
- paneles;
- terminales;
- sensores;
- impresoras;
- interfaces de comunicación.

## Responsabilidades

```text
recibir una petición
solicitar datos
mostrar información
solicitar selección
solicitar confirmación
```

## Ejemplo OT

```text
<<interfaz>> FormularioCrearOT
```

Responsabilidades posibles:

```text
solicitar servicio, sector, descripción y prioridad
mostrar errores de validación
mostrar número de OT creada
```

## Error frecuente

```text
FormularioCrearOT valida todas las reglas,
crea la OT, actualiza stock y guarda todo.
```

Eso concentra responsabilidades que deberían distribuirse.

---

# 6. Clase de entidad

## Definición

Modela información de larga vida, frecuentemente persistente, y comportamiento asociado a conceptos del dominio.

Ejemplos:

```text
OrdenTrabajo
Operario
Sector
EjecucionOT
SolicitudSincronizacion
```

## Responsabilidades

Las clases de entidad pueden:

- conocer datos propios;
- conocer objetos relacionados;
- calcular valores derivados;
- ejecutar comportamiento propio del concepto.

## Ejemplo

```text
<<entidad>> OrdenTrabajo
```

Puede conocer:

```text
estado
prioridad
sector
fecha programada
```

Puede asumir responsabilidades conceptuales como:

```text
aceptar una ejecución válida
informar si está finalizada
cambiar estado respetando reglas
```

No convertir automáticamente cada entidad del análisis en una tabla o clase Java idéntica.

---

# 7. Clase de control

## Definición

Coordina secuencia, flujo, transacción y trabajo entre otros objetos.

## Responsabilidades

```text
seguir el flujo del caso de uso
validar existencia de datos
coordinar interfaz y entidades
realizar cálculos que no pertenecen a una entidad concreta
controlar una transacción conceptual
```

## Ejemplo

```text
<<control>> ControlCrearOT
```

Responsabilidades:

```text
recibir datos desde la interfaz
verificar permisos y reglas
solicitar creación a la entidad
coordinar respuesta
```

## Fórmula mental

```text
Interfaz → recibe/presenta
Control  → coordina
Entidad  → conoce y representa el dominio
```

---

# 8. Responsabilidad vs. operación/método

El material distingue niveles:

```text
Análisis
→ responsabilidades.

Diseño
→ operaciones.

Implementación
→ métodos.
```

En análisis no es necesario escribir:

```java
public OrdenTrabajo crearOT(int idSector, ...)
```

Puede bastar:

```text
ControlCrearOT
Responsabilidad: coordinar la creación de una OT válida.
```

---

# 9. Realización de caso de uso–análisis

## Definición

Colaboración que describe cómo se ejecuta un caso de uso mediante objetos de análisis.

Incluye:

- descripción textual del flujo;
- clases participantes;
- diagramas de interacción para escenarios.

## Trazabilidad

```text
Caso de uso concreto
      ↓
Realización de caso de uso–análisis
      ↓
Clases y objetos participantes
```

---

# 10. Diagrama de colaboración

## Objetivo

Destaca la organización de los objetos y sus enlaces.

Elementos:

```text
Objetos
Enlaces
Mensajes
```

## Diferencia con secuencia

El material recomienda colaboración en análisis porque interesa identificar responsabilidades y enlaces. La secuencia cronológica detallada se reserva principalmente para diseño.

## Pautas

- el actor inicia mediante un mensaje a un objeto de interfaz;
- cada clase identificada debe participar;
- los mensajes expresan propósitos/responsabilidades;
- primero se representa el flujo normal;
- después se agregan alternativas;
- la secuencia exacta no es el objetivo principal.

---

# 11. Ejemplo de colaboración — Crear OT

```text
Actor:
Encargado

Objetos:
:FormularioCrearOT  <<interfaz>>
:ControlCrearOT     <<control>>
:Sector             <<entidad>>
:OrdenTrabajo       <<entidad>>
```

Mensajes conceptuales:

```text
1. Encargado → FormularioCrearOT:
   solicitar creación

2. FormularioCrearOT → ControlCrearOT:
   entregar datos ingresados

3. ControlCrearOT → Sector:
   verificar sector válido

4. ControlCrearOT → OrdenTrabajo:
   crear con estado PENDIENTE

5. ControlCrearOT → FormularioCrearOT:
   informar número y resultado
```

## Preguntas de revisión

- ¿la interfaz coordina demasiado?;
- ¿el control conserva datos de larga vida?;
- ¿la entidad conoce detalles de pantalla?;
- ¿cada objeto participa?;
- ¿los mensajes expresan responsabilidades?

---

# 12. Cómo analizar un caso de uso

Según el material:

1. identificar clases de análisis necesarias;
2. distribuir comportamiento entre objetos;
3. capturar requisitos especiales;
4. definir nombre, responsabilidades, atributos y relaciones;
5. describir interacciones mediante colaboración.

## Procedimiento práctico

```text
Paso 1: leer flujo normal.
Paso 2: marcar interacción con actor → interfaz.
Paso 3: identificar información de larga vida → entidad.
Paso 4: identificar coordinación → control.
Paso 5: distribuir responsabilidades.
Paso 6: graficar/enumerar enlaces y mensajes.
Paso 7: revisar alternativas.
```

---

# 13. Errores frecuentes del modelo de análisis

| Error | Corrección |
|---|---|
| Interfaz = pantalla física definitiva | Es una abstracción conceptual |
| Entidad = tabla | Puede trazarse, pero no es equivalencia automática |
| Control = “controlador MVC” necesariamente | Es estereotipo conceptual del análisis |
| Mensaje = método Java definitivo | En análisis expresa responsabilidad |
| Caso de uso = una clase | Requiere colaboración de objetos |
| Diseñar tecnología en análisis | Posponer decisiones no necesarias |
| Clase que no participa | Revisar si realmente es necesaria |

---

# PARTE II — COLAS

# 14. Cola como TDA

Una Cola es una estructura lineal restrictiva:

```text
inserción → final
extracción → frente
```

Principio:

```text
FIFO
First In, First Out
Primero en entrar, primero en salir
```

Ejemplo:

```text
Frente → [Solicitud A][Solicitud B][Solicitud C] ← Final
```

La próxima solicitud atendida es A.

---

# 15. Operaciones de cola

El material utiliza:

```text
longitud()
esVacia()
encolar(elemento)
desencolar()
cabecera()
```

## `encolar`

Agrega un elemento al final.

## `desencolar`

Devuelve y elimina el elemento del frente.

## `cabecera`

Consulta el primer elemento sin eliminarlo.

## `esVacia`

Indica si la cola no tiene elementos.

## `longitud`

Informa cuántos elementos contiene.

---

# 16. Simulación

Secuencia:

```text
encolar(A)
encolar(B)
encolar(C)
cabecera()
desencolar()
encolar(D)
desencolar()
```

Resultado:

| Paso | Operación | Devuelve | Cola | Frente | Final |
|---:|---|---|---|---|---|
| 0 | inicio | — | `[]` | — | — |
| 1 | `encolar(A)` | — | `[A]` | A | A |
| 2 | `encolar(B)` | — | `[A,B]` | A | B |
| 3 | `encolar(C)` | — | `[A,B,C]` | A | C |
| 4 | `cabecera()` | A | `[A,B,C]` | A | C |
| 5 | `desencolar()` | A | `[B,C]` | B | C |
| 6 | `encolar(D)` | — | `[B,C,D]` | B | D |
| 7 | `desencolar()` | B | `[C,D]` | C | D |

---

# 17. Cola enlazada

## Representación

```text
cabecera → frente
cola     → final
longitud → cantidad
```

## Encolar

```text
nuevo.siguiente = null

si está vacía:
    cabecera = nuevo
si no:
    final.siguiente = nuevo

final = nuevo
longitud++
```

## Desencolar

```text
valor = cabecera.elemento
cabecera = cabecera.siguiente
longitud--

si quedó vacía:
    final = null
```

## Consultar

```text
cabecera.elemento
```

sin modificar referencias.

## Riesgos

- olvidar actualizar final cuando queda vacía;
- perder una referencia;
- enlazar incorrectamente;
- agotar memoria.

---

# 18. Cola con vector

## Representación

```text
vector[n]
frente
final
cantidad
```

## Características

- capacidad definida;
- control mediante índices;
- estado vacía/llena;
- posible desbordamiento por capacidad;
- puede requerir estrategia circular para reutilizar posiciones.

El concepto central del Día 8 no es implementar toda la cola circular, sino comprender dos índices y FIFO.

---

# 19. Comparación de implementaciones

| Criterio | Vector | Lista enlazada |
|---|---|---|
| Capacidad | Fija/definida | Variable |
| Frente/final | Índices | Referencias |
| Memoria | Reserva posiciones | Nodo + enlace |
| Encolar | En índice final | Nodo nuevo al final |
| Desencolar | Desde índice frente | Retira cabecera |
| Riesgo | Llenado/desbordamiento | Referencias/memoria |
| Conveniencia | Máximo conocido | Volumen incierto |

## Interfaz vs. implementación

```text
El usuario de la cola sigue usando:
encolar, desencolar, cabecera, esVacia.

La estructura interna puede cambiar.
```

---

# 20. Pila vs. Cola

| Criterio | Pila | Cola |
|---|---|---|
| Política | LIFO | FIFO |
| Entrada | Cima | Final |
| Salida | Cima | Frente |
| Próximo en salir | Último agregado | Primero agregado |
| Ejemplo | Deshacer | Turnos/peticiones |

## Elección

```text
Revertir última acción
→ Pila.

Procesar solicitudes por orden de llegada
→ Cola.
```

---

# 21. Aplicaciones de cola

El material menciona:

- peticiones que esperan procesador;
- documentos enviados a una impresora;
- líneas de atención;
- reparto de tiempo y recursos.

Aplicación SIGO:

```text
Solicitudes móviles pendientes de sincronización
→ cola FIFO
```

Siempre que la regla sea atender por orden de llegada.

---

# 22. Respuesta oral modelo — Cola

> Una cola es un TDA lineal restrictivo FIFO. Los elementos se encolan por el final y se desencolan por el frente, de modo que el primero que llega es el primero que sale. Puede implementarse con un vector controlado por índices de frente y final, o con una lista enlazada que mantiene referencias a cabecera y cola. La interfaz se conserva aunque cambie la implementación.

---

# PARTE III — INFORMACIÓN, SEÑALES Y TRANSMISIÓN

# 23. Medida técnica de información

La información se estudia como cantidad asociada a incertidumbre, no por el significado del mensaje.

Principio:

```text
Evento muy probable
→ poca información.

Evento poco probable
→ mucha información.
```

## Fórmula

```text
I(E) = log2(1/P(E))
```

Unidad:

```text
bit
```

## Casos

```text
P(E)=1
I(E)=0
```

Lo seguro no aporta incertidumbre nueva.

```text
P(E)=1/2
I(E)=1 bit
```

```text
P(E)=1/8
I(E)=3 bits
```

---

# 24. Entropía y tasa de información

## Entropía

Valor medio de información por símbolo:

```text
H(S)
unidad: bits/símbolo
```

## Tasa

Si la fuente produce `m` símbolos por segundo:

```text
R = m · H(S)
```

Unidad:

```text
bits/segundo
```

Ejemplo:

```text
m = 100 símbolos/s
H = 2 bits/símbolo
R = 200 bits/s
```

No confundir:

```text
bit/símbolo
vs.
bits/segundo
```

---

# 25. Señal

Una señal u onda electromagnética permite transportar información. El resultado de la transmisión depende de:

- calidad de señal;
- características del medio.

---

# 26. Señal analógica

Características del material:

```text
continua
ondulante
voltaje variable en el tiempo
frecuente en fenómenos naturales
```

Representación típica: onda sinusoidal.

---

# 27. Señal digital

Características:

```text
discreta/pulsante
niveles definidos durante intervalos
frecuente en tecnología
```

Representación aproximada: pulsos rectangulares.

---

# 28. Amplitud, período y frecuencia

## Amplitud

Magnitud o nivel de la señal.

## Período

Tiempo de un ciclo:

```text
T
unidad: segundos
```

## Frecuencia

Ciclos por segundo:

```text
f
unidad: Hz
```

Relación:

```text
f = 1/T
T = 1/f
```

Ejemplos:

```text
T = 0,02 s
f = 50 Hz
```

```text
f = 1 kHz = 1000 Hz
T = 1/1000 s = 0,001 s
```

---

# 29. Muestreo

## Definición

Tomar valores de una señal continua en instantes determinados para representarla y recuperarla.

## Regla de Nyquist utilizada por el material

```text
fs ≥ 2 · fmax
```

Ejemplos:

```text
fmax = 1 kHz
fs mínima = 2 k muestras/s
```

```text
fmax = 10 kHz
fs mínima = 20 k muestras/s
```

Si se toman más muestras, mejora la representación. El material también señala que aumenta el ancho de banda ocupado por la señal muestreada.

## Error frecuente

```text
fs = fmax ❌
```

La frecuencia mínima debe ser el doble.

---

# 30. Transmisión serie

Características del material:

- bit a bit;
- una línea de señal y otra de retorno en el ejemplo;
- adecuada para mayor distancia que la transmisión paralela descripta.

```text
1 → 0 → 1 → 1
```

Ejemplo del material: RS-232.

---

# 31. Transmisión paralela

Características:

- varias líneas simultáneas;
- 8, 16, 32 o 64 líneas conjuntas según el material;
- utilizada en distancias cortas en el ejemplo.

```text
[1][0][1][1][0][0][1][0]
transmitidos simultáneamente por líneas diferentes
```

---

# 32. Serie vs. paralela

| Serie | Paralela |
|---|---|
| Bit a bit | Varios bits simultáneos |
| Menos líneas | Más líneas |
| Mayor distancia en el material | Distancia corta en el material |
| Menor complejidad física de cableado | Más conductores |

No afirmar de manera absoluta que una siempre es “más rápida” sin declarar condiciones y tecnología.

---

# 33. Transmisión asíncrona

Características:

- sincronismo a nivel de carácter;
- intervalo entre caracteres no constante;
- cada unidad se delimita con bit de `start` y uno o dos bits de `stop`;
- el material ejemplifica una eficiencia menor por bits de control.

```text
start + carácter + stop
```

---

# 34. Transmisión síncrona

Características:

- regularidad entre bits de un bloque;
- bloque delimitado por cabecera y terminación;
- rendimiento mayor al aumentar el bloque, según el material.

```text
cabecera + bloque de datos + terminación
```

---

# 35. Síncrona vs. asíncrona

| Asíncrona | Síncrona |
|---|---|
| Carácter | Bloque |
| Start/stop | Cabecera/terminación |
| Intervalo variable entre caracteres | Regularidad dentro del bloque |
| Más control por unidad | Mejor rendimiento en bloques grandes según material |

No relacionar la diferencia principal con retransmisión de segmentos o tolerancia a errores.

---

# 36. Respuesta oral modelo — Transmisión

> La información se mide técnicamente según la incertidumbre: un evento menos probable aporta más información, medida en bits. Las señales pueden ser analógicas o digitales; una señal periódica se caracteriza por amplitud, período y frecuencia, con `f=1/T`. Para muestrear una señal, el material exige una frecuencia mínima igual al doble de su frecuencia máxima. La transmisión serie envía bits uno a uno y la paralela utiliza varias líneas simultáneas. La asíncrona delimita caracteres con start/stop y la síncrona transmite bloques delimitados por cabecera y terminación.

---

# PARTE IV — INTEGRACIÓN

# 37. Caso didáctico

> Un Operario registra una ejecución de OT desde el móvil. Varias solicitudes pueden quedar pendientes y el servidor debe atenderlas por orden de llegada. Además, una medición analógica opcional de un sensor se digitaliza antes de enviarse.

## Modelo de análisis

```text
<<interfaz>> AppRegistrarEjecucion
<<control>> ControlRegistrarEjecucion
<<entidad>> OrdenTrabajo
<<entidad>> EjecucionOT
<<entidad>> SolicitudSincronizacion
```

## Colaboración

```text
Operario
→ AppRegistrarEjecucion
→ ControlRegistrarEjecucion
→ OrdenTrabajo / EjecucionOT
→ confirmación
```

## Cola

```text
Solicitud 1
Solicitud 2
Solicitud 3
```

Se atienden:

```text
1, luego 2, luego 3
```

## Transmisión

```text
medición analógica
→ muestreo
→ datos digitales
→ transmisión serie
→ sincronización según protocolo/solución declarada
```

La elección concreta síncrona/asíncrona depende de la solución; el ejercicio exige justificar, no adivinar.

---

# 38. Trazabilidad

```text
RF:
procesar solicitudes pendientes por orden de llegada.

Caso de uso:
Sincronizar ejecución de OT.

Modelo de análisis:
interfaz + control + entidades.

Estructura:
cola FIFO.

Transmisión:
datos digitales enviados al servidor.

Prueba:
encolar tres solicitudes y verificar orden de procesamiento.
```

---

# PARTE V — RECUPERACIÓN DEL DÍA 7

# 39. Tarjetas

## Generalización UML

```text
HIJO ─────▷ PADRE
```

Triángulo vacío hacia el padre.

## Instancia

```text
Entidad: OPERARIO
Instancia: Operario 145 — Juan Pérez
```

## Simbología DER

```text
Rectángulo doble → entidad débil
Línea doble      → participación total
```

## Asociativa vs. débil

```text
Asociativa → implementa N:M.
Débil → depende para identificarse o existir.
```

## Completo vs. verificable

```text
Completo → información suficiente.
Verificable → comprobable objetivamente.
```

## `toString()`

```java
@Override
public String toString() {
    return getRol() + " - " + getNombre();
}
```

Método heredado de `Object`.

## N:M vs. asociativa

```text
DER: A N:M B
Modelo relacional: TABLA_A_B con dos FK
```

---

# 40. Veinticuatro preguntas rápidas

1. ¿Cuál es el propósito del análisis?
2. ¿Qué vista ofrece el modelo de casos de uso?
3. ¿Qué vista ofrece el modelo de análisis?
4. ¿Qué artefactos principales existen?
5. ¿Qué hace una clase de interfaz?
6. ¿Qué hace una clase de entidad?
7. ¿Qué hace una clase de control?
8. ¿Qué es una realización de caso de uso–análisis?
9. ¿Qué destaca un diagrama de colaboración?
10. ¿Por qué los mensajes no son todavía métodos definitivos?
11. ¿Qué significa FIFO?
12. ¿Dónde se encola?
13. ¿Dónde se desencola?
14. ¿Qué diferencia existe entre `cabecera()` y `desencolar()`?
15. ¿Cómo representa frente/final un vector?
16. ¿Cómo los representa una lista enlazada?
17. ¿Cuándo usar pila y cuándo cola?
18. ¿Cómo cambia la información con la probabilidad?
19. ¿Qué unidad produce `log2`?
20. ¿Qué relación existe entre frecuencia y período?
21. ¿Cuál es la tasa mínima de muestreo?
22. ¿Qué diferencia existe entre serie y paralela?
23. ¿Qué diferencia existe entre síncrona y asíncrona?
24. ¿Cómo se integran análisis, cola y transmisión en el caso OT?

---

# 41. Criterio de preparación

```text
21–24 correctas
→ listo para evaluación.

17–20
→ recuperar cálculos y colaboración.

13–16
→ volver a los tres bloques débiles.

Menos de 13
→ estudiar definición, diferencia, ejemplo y justificación.
```

---

# 42. Fuentes

Este resumen conserva la terminología y el alcance de:

- `Analisis_y_Diseno_de_Software.md`;
- `Taller_de_Algoritmos_y_Estructuras_de_Datos_I.md`;
- `COMUNICACIONES.md`;
- `02-PLAN-MAESTRO-HASTA-03-09.md`;
- cierre y errores reales del Día 7.

Los ejemplos de Órdenes de Trabajo son adaptaciones didácticas para aplicar los conceptos; no reemplazan ni alteran las definiciones de los materiales.
