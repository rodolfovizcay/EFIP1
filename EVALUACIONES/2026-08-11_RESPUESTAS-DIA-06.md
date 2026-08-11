# Respuestas del estudiante — Evaluación Día 6

**Fecha:** 11/08/2026  
**Modalidad:** sin apuntes  
**Apuntes utilizados:** no

> Transcripción de las respuestas reales de la jornada. Se normalizó únicamente el formato Markdown; no se reemplazaron silenciosamente los errores conceptuales o terminológicos. Las correcciones se registran en `EVALUACIONES/2026-08-11_RESULTADOS-DIA-06.md` y en los archivos de errores.

---

# Parte A — Ingeniería de requerimientos

## 1. Ingeniería y actividades

### Ingeniería de requerimientos

> El proceso o actividades por lo cual se descubre, analiza, documenta y valida los servicios y restricciones de un sistema.

### Elicitación

> Proceso de descubrimiento y análisis, de los requerimientos que se logran obtener del usuario por medio de entrevistas, encuestas u observaciones.

### Resultado/técnica

- entrevistas;
- encuestas;
- observaciones.

### Especificación

> Proceso de análisis y documentación, acá es donde toda la información recolectada se analiza a fondo para formar requerimientos correctos y no ambiguos, lo que ayuda al usuario y al cliente.

### Validación

> Proceso de validación que permite verificar que los requerimientos son necesarios y cumplen con lo solicitado por el cliente, dando retroalimentación y, en caso de no validarse, volver al ciclo del análisis, especificación y validación.

---

## 2. RF, RNF y regla de negocio

### Requerimiento funcional

> Funciones o servicios que debe brindar el sistema.

### Ejemplo

> RF: El sistema debe permitir crear una orden de trabajo en estado PENDIENTE.

### Requerimiento no funcional

> Restricciones que restringen las decisiones arquitectónicas del sistema.

### Ejemplo

> RNF: El guardado de la orden de trabajo nueva debe hacerse en menos de 0,5 segundo.

### Regla de negocio

> Políticas del negocio o restricciones del negocio.

### Ejemplo

> Regla de negocio: La orden de trabajo siempre debe crearse en estado PENDIENTE.

---

## 3. Calidad

| Propiedad | Respuesta del estudiante |
|---|---|
| Correcto | Que cumple con lo que solicita el usuario |
| Consistente | Que no contradiga otro requerimiento |
| Completo | Que esté bien redactado, que no sea ambiguo y sea medible |
| Realista | Que pueda realizarse con los recursos disponibles, los tiempos y técnicamente |
| Necesario | Que aporte valor real al sistema; si lo quitamos debe generar una falta notable |
| Verificable | Que pueda medirse, controlar que cumple y si lo hace de la forma correcta |
| Rastreable | Que desde su origen hasta las pruebas pueda haber trazabilidad |

### Corrección propuesta para “rápido y fácil”

> El sistema debe poder responder a consultas en menos de 0,2 segundos.

> El usuario, una vez capacitado, debe poder consultar los trabajos pendientes en una secuencia máxima de 2 acciones.

---

# Parte B — Pilas

## 4. Concepto y operaciones

### Pila como TDA

> Una pila es una estructura de dato abstracta donde la entrada y salida de datos se hacen por la cima; contiene comportamientos definidos sin importar la implementación.

### LIFO

> Last In, First Out.

### Cima

> Parte superior de la pila donde se encuentra el último elemento ingresado y el primero que puede salir.

### `push`

> Agrega elementos a la pila.

### `pop`

> Muestra y elimina el elemento de la cima.

### `peek/primero`

> Muestra el elemento de la cima.

### `esVacia`

> Verifica si la pila está vacía.

---

## 5. Simulación

| Paso | Operación | Devuelve | Estado de la pila | Cima |
|---:|---|---|---|---|
| 0 | Inicio | — | `[]` | — |
| 1 | `push(A)` | — | `[A]` | A |
| 2 | `push(B)` | — | `[B, A]` | B |
| 3 | `push(C)` | — | `[C, B, A]` | C |
| 4 | `pop()` | C | `[B, A]` | B |
| 5 | `push(D)` | — | `[D, B, A]` | D |
| 6 | `peek()` | D | `[D, B, A]` | D |
| 7 | `pop()` | D | `[B, A]` | B |
| 8 | `pop()` | B | `[A]` | A |

### Cima final

> En la cima queda A.

---

## 6. Implementaciones

| Criterio | Vector | Lista enlazada |
|---|---|---|
| Cima | Se representa con el índice de la última incorporación | Se representa con la cabecera |
| Capacidad | Es fija; se debe definir | La limita la memoria |
| Memoria | Acotada; puede reservar espacios vacíos sin elementos | Consume elemento más enlace al siguiente nodo |
| `push` | Coloca un elemento en la cima | Coloca un elemento en la cima |
| `pop` | Muestra y elimina el elemento de la cima | Muestra y elimina el elemento de la cima |
| Riesgo | Desbordamiento | Desbordamiento / perder referencia de nodo |

### Elección y justificación

> Vectores: para cuando está definida la cantidad de espacio a asignar y se necesita acceder con índice.

> Lista enlazada: cuando no se tiene clara la cantidad de la pila.

### Qué cambia

> En los vectores hay que definir el tamaño. La estructura interna es diferente.

### Qué permanece igual

> El comportamiento permanece igual dado que las interfaces nos abstraen de la implementación.

---

# Parte C — OSI/TCP-IP

## 7. Modelos y correspondencia

### OSI

> Es el modelo de referencia en el cual los protocolos se basan y divide el proceso de la comunicación en 7 capas.

### TCP/IP

> Es la arquitectura o pila de protocolos que se utiliza en la práctica para comunicar los equipos.

### Capas OSI 1→7

1. Física.
2. Enlace.
3. Red.
4. Transporte.
5. Sesión.
6. Presentación.
7. Aplicación.

### Capas TCP/IP 1→5

1. Física.
2. Acceso a la red.
3. Internet.
4. Transporte.
5. Aplicación.

### Correspondencia

| OSI | TCP/IP |
|---|---|
| Aplicación | Aplicación |
| Presentación | Aplicación |
| Sesión | Aplicación |
| Transporte | Transporte |
| Red | Internet |
| Enlace | Acceso a la red |
| Física | Física |

---

## 8. Encapsulamiento y PDU

### Encapsulamiento

> Tomar los datos de la capa superior y agregarle la información de control de la capa actual.

### Desencapsulamiento

> Tomar datos encapsulados de la capa inferior y sacarle la información de control.

### PDU

> Unidad de datos de procesos.

### SDU

> Datos de la capa superior.

### PCI

> Información de control.

### Fórmula

```text
PDU = SDU + PCI
```

### Orden del emisor

```text
Datos → Segmento → Paquete → Trama → Bits
```

### Proceso del receptor

> En el receptor sucede el proceso inverso, desacoplando la información.

---

## 9. Direccionamiento y recorrido

### MAC

> Dirección física local.

### IP

> Dirección lógica de red.

### Puerto

> Identifica el proceso o servicio en el host.

### Recorrido móvil → servidor

> Para consultar una orden de trabajo, la aplicación pasa la información de consulta a la capa de transporte, la cual segmenta la información y le pone los puertos de servicio o proceso origen y destino. Luego esa información, esa PDU, se pasa a la capa de red, en donde la red le coloca la IP de destino y origen y los datos de control, el direccionamiento. Luego eso se pasa como paquete a la capa de acceso a la red, en la cual genera una trama colocando las direcciones MAC y haciendo el enrutamiento local, y luego eso se transmite a través de señales por cable por medio de bits. El desencapsulamiento en el lado del servidor hace el proceso inverso, obteniendo la trama, después desencapsulando la trama, pasando el paquete que tiene interno a la capa de red, desencapsulando el paquete para después pasarle el segmento a la capa de transporte; la capa de transporte une los segmentos, desencapsula ese segmento y se lo pasa a la capa de aplicación. Luego el servidor hace el mismo proceso para responder.

---

# Parte D — Integración y recuperación

## 10. Integración

### RF

> El sistema debe permitir deshacer la última modificación no confirmada.

### Regla de negocio

> Solo se permiten deshacer las modificaciones no confirmadas.

### Justificación de la pila

> Para mantener el orden de modificación y desacople, dado que es un proceso LIFO.

### Confirmación hacia el servidor

> La pila debe vaciarse, dado que las modificaciones quedaron confirmadas y el sistema no permite deshacer.

---

## 11. Recuperación espaciada

```text
TDA = tipo de dato abstracto

Constructor Java = se nombra como la clase y no devuelve nada

Fases PUD = Inicio, Elaboración, Construcción, Transición

Flujos PUD = Requisitos, Análisis, Diseño, Implementación y Prueba

Asíncrona = carácter + start/stop

Síncrona = bloque + cabecera/terminación

PUD = Proceso Unificado de Desarrollo

PDU = Unidad de Datos de Protocolos
```

---

# Defensa oral

## Desarrollo real — puntos principales

> Para relevar esta funcionalidad, primero tenemos que empezar haciendo entrevistas y preguntas de las cuales saldrá esta nueva funcionalidad con el usuario, observando lo que necesita hacer. Eso después, en la etapa de elicitación, se hacen las preguntas, y en la etapa de especificación es donde se crean los RF, RNF y la regla de negocio.

> Un RF puede ser que el sistema debe permitir al usuario deshacer la última modificación pendiente. Un RNF puede decir que el sistema debe permitir deshacer las modificaciones en menos de 0,1 segundo. Una regla de negocio puede ser que no se pueden deshacer modificaciones ya confirmadas.

> Para validar ese requerimiento se valida con el usuario, verificando que funcione como lo solicitó y que cumpla con las solicitudes realizadas por el cliente.

> La estructura sería LIFO, usando una pila, porque es la estructura necesaria para guardar en orden las modificaciones y desapilar las modificaciones anteriores. No se puede desapilar una modificación de dos o tres instancias anteriores saltando las posteriores porque el usuario lo vería como un error.

> Al confirmar la modificación debe vaciarse la pila porque no tiene razón de seguir existiendo esa información, dado que una vez confirmada no se puede deshacer.

> La solicitud pasa por Aplicación; después Transporte, donde se segmenta, se colocan puertos de origen y destino y datos de control; luego Red, donde se colocan IP de origen y destino. Se indicó oralmente que Red “crea una trama”. Después pasa a Enlace/Acceso a la red, donde se agregan MAC y datos de control; luego Física transmite “bytes” por medios guiados o no guiados.

> El encapsulamiento toma datos de la capa superior y agrega datos de control. El desencapsulamiento es el proceso inverso. En el servidor se desencapsula desde Física hasta Aplicación, se procesa la solicitud y se responde mediante el mismo circuito.

---

# Autoevaluación posterior registrada por la corrección

| Criterio | Resultado observado |
|---|---|
| Comprensión conceptual | Alta |
| Terminología académica | Buena, con ajustes puntuales |
| Aplicación práctica | Muy alta |
| Claridad y orden | Buena |

## Dudas/ajustes detectados

1. Completo frente a verificable.
2. PDU = Protocolo, no proceso.
3. Pila enlazada: memoria/referencias frente a desbordamiento fijo.
4. Red produce paquete; Enlace produce trama.
5. Física transmite bits/señales, no bytes.
6. Constructor sin tipo de retorno, ni siquiera `void`.
