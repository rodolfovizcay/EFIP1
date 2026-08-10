# Resumen guiado EFIP I — Día 6
## Ingeniería de requerimientos, pilas y OSI/TCP-IP

**Fecha de estudio:** 11 de agosto de 2026  
**Materias:** Análisis y Diseño + Algoritmos/Estructuras + Comunicaciones  
**Objetivo:** comprender, aplicar y defender los tres bloques sin depender del apunte

---

# Cómo usar este resumen

Para cada concepto realizar cuatro pasos:

```text
1. Definir.
2. Diferenciar de conceptos cercanos.
3. Aplicar a un caso.
4. Justificar la decisión.
```

No marcar un tema como aprendido solamente porque la definición resulta familiar.

---

# PARTE I — INGENIERÍA DE REQUERIMIENTOS

# 1. Qué es un requerimiento

Un requerimiento expresa una característica, servicio, comportamiento o restricción que el sistema debe considerar para satisfacer su propósito.

Un requerimiento puede describir:

- algo que el sistema debe hacer;
- una respuesta ante una entrada;
- una restricción;
- una propiedad de calidad;
- una condición establecida por usuarios u organización.

## 1.1 Para qué sirve

Los requerimientos permiten:

- acordar qué necesita el cliente;
- orientar el diseño;
- determinar qué se implementará;
- preparar pruebas;
- controlar alcance;
- rastrear decisiones y funcionalidades.

---

# 2. Ingeniería de requerimientos

Es el proceso de:

```text
descubrir
analizar
documentar
verificar
```

los servicios y restricciones del sistema.

No consiste solamente en escribir lo que el usuario dice. Requiere comprender el contexto, detectar contradicciones y comprobar que el sistema solicitado sea el correcto.

## 2.1 Respuesta oral modelo

> La ingeniería de requerimientos comprende las actividades necesarias para descubrir, analizar, documentar y verificar los servicios y restricciones del sistema, de modo que usuarios y desarrolladores compartan una especificación suficientemente completa, consistente y no ambigua.

---

# 3. Elicitación

## 3.1 Concepto

Es el proceso mediante el cual se adquiere conocimiento del trabajo y las necesidades del cliente o usuario y se identifican restricciones del entorno.

## 3.2 Resultado

```text
Conjunto inicial de necesidades y requerimientos de las partes involucradas.
```

## 3.3 Técnicas

- entrevista;
- cuestionario;
- observación;
- análisis de documentos;
- tormenta de ideas;
- JAD.

## 3.4 No confundir

```text
Elicitación ≠ copiar literalmente pedidos.
```

El analista debe preguntar, comprender, contrastar y descubrir necesidades que el usuario puede no haber expresado claramente.

## 3.5 Ejemplo

El usuario dice:

> Quiero que las OT urgentes aparezcan primero.

Preguntas de elicitación:

- ¿qué significa urgente?;
- ¿cómo se representa la prioridad?;
- ¿qué ocurre si dos OT tienen la misma prioridad?;
- ¿se considera fecha y hora?;
- ¿hay OT protegidas que no deben reprogramarse?;
- ¿quién puede cambiar la prioridad?

---

# 4. Especificación

## 4.1 Concepto

Es el proceso de describir los requerimientos de forma organizada para producir una especificación que sirva como acuerdo entre usuarios y desarrolladores.

Debe expresar:

- funcionalidad esperada;
- propiedades;
- restricciones;
- condiciones verificables.

No necesita explicar todavía toda la implementación interna.

## 4.2 Ejemplo

Pedido informal:

> El sistema tiene que ser rápido.

Especificación mejorada:

> El sistema deberá mostrar la programación diaria de hasta 1.000 OT en un tiempo menor a 20 segundos bajo la carga prevista.

---

# 5. Validación

## 5.1 Concepto

Es el proceso que comprueba que se está atacando el problema correcto y que los requerimientos representan las expectativas de los usuarios.

## 5.2 Técnicas

- revisiones;
- prototipos;
- generación de casos de prueba;
- análisis de consistencia;
- revisión con usuarios.

## 5.3 Preguntas de validación

- ¿el requerimiento corresponde a una necesidad real?;
- ¿contradice otro?;
- ¿puede probarse?;
- ¿es técnicamente posible?;
- ¿está completo?;
- ¿se conoce su origen?;
- ¿está dentro del alcance?

---

# 6. Elicitación, especificación y validación

```text
ELICITACIÓN
Descubrir y comprender.

ESPECIFICACIÓN
Describir y documentar.

VALIDACIÓN
Comprobar que es correcto.
```

## 6.1 Ejemplo integrado

```text
Elicitación:
El encargado explica que necesita reprogramar OT vencidas.

Especificación:
El sistema deberá identificar OT candidatas según estado,
fecha, hora, prioridad y protección manual.

Validación:
El encargado revisa ejemplos y confirma que las reglas
incluyen todos los casos relevantes.
```

---

# 7. Requerimientos funcionales — RF

## 7.1 Definición

Describen las funciones o servicios que el sistema debe proporcionar y cómo debe comportarse ante determinados estímulos.

## 7.2 Fórmula útil

```text
El sistema deberá + verbo + objeto + condición/resultado.
```

## 7.3 Ejemplos

```text
RF-01. El sistema deberá permitir al operario consultar una OT asignada.

RF-02. El sistema deberá registrar una acción no confirmada en el historial de la sesión.

RF-03. El sistema deberá permitir deshacer la última acción no confirmada.

RF-04. El sistema deberá mostrar el estado resultante de la OT.
```

## 7.4 No confundir

```text
RF = qué función brinda el sistema.
```

No todo sustantivo o decisión técnica constituye un RF.

---

# 8. Requerimientos no funcionales — RNF

## 8.1 Definición

Son propiedades, restricciones o condiciones que limitan la elección de alternativas durante diseño y construcción.

## 8.2 Ejemplos de categorías

- rendimiento;
- seguridad;
- fiabilidad;
- disponibilidad;
- mantenimiento;
- portabilidad;
- plataforma;
- interoperabilidad;
- estándares;
- restricciones legales.

## 8.3 Ejemplos

```text
RNF-01. La consulta de una OT deberá responder en menos de 3 segundos
bajo las condiciones de carga definidas.

RNF-02. La comunicación entre el dispositivo móvil y el servidor deberá
realizarse sobre la infraestructura de red autorizada.

RNF-03. Solo los usuarios autenticados con permiso podrán modificar una OT.

RNF-04. La aplicación deberá ejecutarse en los dispositivos móviles
admitidos por la organización.
```

## 8.4 Relación con arquitectura

Los RNF condicionan decisiones arquitectónicas, pero no son la arquitectura.

```text
RNF: responder en menos de 3 segundos.
Decisión arquitectónica: procesar cerca de los datos, usar índices,
reducir transferencias y medir rendimiento.
```

---

# 9. Regla de negocio

Una regla de negocio expresa una política, condición o restricción del dominio.

Ejemplos:

```text
RN-01. Una OT nueva nace en estado PENDIENTE.
RN-02. La prioridad debe encontrarse entre 1 y 5.
RN-03. Solo se puede deshacer una acción todavía no confirmada.
```

No confundir:

```text
RF → función del sistema.
RNF → propiedad o restricción de calidad/entorno.
Regla de negocio → regla propia del dominio.
```

---

# 10. Calidad de requerimientos

# 10.1 Correcto

Representa una necesidad real y no contiene errores.

# 10.2 Consistente

No contradice a otros requerimientos.

Ejemplo inconsistente:

```text
R1: máximo 10 usuarios simultáneos.
R2: deben operar 12 usuarios simultáneos en cierre.
```

# 10.3 Completo

Contiene la información necesaria para comprenderlo y no deja estados, entradas, salidas o restricciones esenciales sin describir.

# 10.4 Realista

Puede implementarse con la tecnología, presupuesto, tiempo y recursos disponibles.

# 10.5 Necesario

Su omisión provocaría una deficiencia o impediría satisfacer una necesidad válida.

# 10.6 Verificable

Puede comprobarse mediante una prueba, revisión o medición.

Malo:

```text
El sistema será intuitivo.
```

Mejor:

```text
Un operario capacitado deberá consultar una OT en no más de tres pasos
desde la pantalla inicial.
```

# 10.7 Rastreable

Puede vincularse con su fuente y con los artefactos que lo realizan y verifican.

```text
Necesidad → requerimiento → caso de uso → diseño → código → prueba
```

---

# 11. Plantilla mínima de requerimiento

```text
Código:
Tipo: RF / RNF / regla de negocio
Fuente:
Descripción:
Justificación:
Prioridad:
Criterio de aceptación/verificación:
Dependencias:
Trazabilidad:
Observaciones:
```

---

# 12. Errores frecuentes en requerimientos

- escribir soluciones técnicas como si fueran necesidades;
- utilizar palabras ambiguas: rápido, fácil, adecuado;
- no indicar condiciones ni resultados;
- mezclar varios requerimientos en un único enunciado;
- contradecir otra regla;
- no indicar la fuente;
- no definir cómo verificarlo;
- redactar una regla de negocio como si fuera una pantalla;
- asumir que el usuario ya explicó todo el contexto.

---

# PARTE II — PILAS

# 13. Pila como TDA

Una pila es un Tipo de Dato Abstracto lineal y restrictivo.

Define una interfaz de operaciones sin obligar al usuario a conocer cómo se almacenan internamente los elementos.

```text
TDA Pila
├── implementación con vector
└── implementación con lista enlazada
```

## 13.1 Respuesta oral modelo

> Una pila es un TDA lineal en el que las inserciones y extracciones se realizan por un único extremo llamado cima. Sigue el principio LIFO y puede implementarse con un vector o con una lista enlazada sin cambiar el comportamiento que ofrece su interfaz.

---

# 14. LIFO

```text
LIFO = Last In, First Out
     = último en entrar, primero en salir
```

Ejemplo:

```text
push(A)
push(B)
push(C)
```

Estado:

```text
cima → C
       B
       A
```

El primer `pop()` devuelve `C`.

---

# 15. Operaciones de la pila

## 15.1 `push(elemento)`

Agrega un elemento en la cima.

## 15.2 `pop()`

Retira y devuelve el elemento de la cima.

Es destructiva: después de ejecutarla, el elemento ya no está en la pila.

## 15.3 `peek()` o `primero()`

Consulta el elemento de la cima sin eliminarlo.

## 15.4 `esVacia()`

Indica si la pila no contiene elementos.

## 15.5 `longitud()`

Devuelve la cantidad de elementos almacenados.

## 15.6 Diferencia clave

```text
peek → consulta
pop  → consulta + elimina
```

---

# 16. Interfaz conceptual

```java
public interface Pila<T> {
    int longitud();
    boolean esVacia();
    void push(T elemento);
    T pop();
    T peek();
}
```

Este fragmento es una representación de estudio de las operaciones desarrolladas en el material.

---

# 17. Pila con vector

## 17.1 Estructura interna

```text
elementos[]
top = índice de la cima
capacidad = cantidad máxima reservada
```

Pila vacía:

```text
top = -1
```

## 17.2 `push`

```text
1. Comprobar que haya capacidad.
2. Incrementar top.
3. Guardar el elemento en elementos[top].
```

## 17.3 `pop`

```text
1. Comprobar que no esté vacía.
2. Guardar elementos[top].
3. Limpiar la posición si corresponde.
4. Decrementar top.
5. Devolver el elemento.
```

## 17.4 Ventajas y limitaciones

Ventajas:

- representación simple;
- cima localizada por índice;
- no requiere un objeto nodo por elemento.

Limitaciones:

- capacidad definida;
- posible desbordamiento si se supera;
- puede reservar posiciones que no se utilizan.

---

# 18. Pila con lista enlazada

## 18.1 Estructura interna

```text
top → primer nodo
nodo = elemento + siguiente
longitud
```

## 18.2 `push`

```text
nuevo.siguiente = top
top = nuevo
longitud++
```

## 18.3 `pop`

```text
elemento = top.elemento
top = top.siguiente
longitud--
devolver elemento
```

## 18.4 Ventajas y limitaciones

Ventajas:

- cantidad de elementos variable;
- no necesita una capacidad máxima fija;
- inserción y extracción sobre la cima.

Limitaciones:

- memoria adicional por las referencias;
- riesgo de errores al actualizar enlaces;
- limitada por la memoria disponible.

---

# 19. Vector vs. lista enlazada

| Criterio | Pila con vector | Pila enlazada |
|---|---|---|
| Almacenamiento | posiciones contiguas | nodos enlazados |
| Cima | índice `top` | referencia `top` |
| Capacidad | definida | variable |
| Memoria adicional | poca por elemento | referencia por nodo |
| Desbordamiento | al alcanzar capacidad | al agotar memoria |
| Interfaz externa | igual | igual |

## 19.1 Idea central

```text
La interfaz del TDA puede mantenerse.
Lo que cambia es la implementación.
```

---

# 20. Simulación completa

Partimos de vacío:

```text
[]
```

### `push(A)`

```text
cima → A
```

### `push(B)`

```text
cima → B
       A
```

### `push(C)`

```text
cima → C
       B
       A
```

### `peek()`

Devuelve `C` y la pila no cambia.

### `pop()`

Devuelve `C`:

```text
cima → B
       A
```

### `push(D)`

```text
cima → D
       B
       A
```

### `pop()`

Devuelve `D`:

```text
cima → B
       A
```

### `pop()`

Devuelve `B`:

```text
cima → A
```

---

# 21. Aplicaciones de pila

- pila de llamadas a métodos;
- historial de navegación;
- deshacer acciones;
- evaluación de expresiones;
- procesamiento anidado;
- recorrido con retorno al último contexto.

## 21.1 Caso OT

```text
push(Cambiar prioridad)
push(Cambiar fecha)
push(Agregar observación)
```

`deshacer()` realiza `pop()` y revierte primero `Agregar observación`.

---

# 22. Errores frecuentes en pilas

- extraer el primer elemento que entró y confundir pila con cola;
- modificar el fondo en lugar de la cima;
- confundir `peek` con `pop`;
- no controlar pila vacía;
- no actualizar `top`;
- creer que una implementación define al TDA;
- afirmar que la pila enlazada es infinita;
- elegir una pila cuando el problema exige FIFO o acceso arbitrario.

---

# PARTE III — OSI Y TCP/IP

# 23. Modelo OSI

OSI es un modelo de referencia que organiza las funciones típicas de una comunicación en siete capas.

Su finalidad es facilitar la interconexión de sistemas diferentes y dividir un problema complejo en responsabilidades más pequeñas.

## 23.1 Orden ascendente

```text
1 Física
2 Enlace de datos
3 Red
4 Transporte
5 Sesión
6 Presentación
7 Aplicación
```

---

# 24. Funciones de las capas OSI

## 24.1 Física

- transmite bits/señales;
- define medios, conectores, codificación y aspectos eléctricos/mecánicos.

Unidad conceptual:

```text
bits
```

## 24.2 Enlace de datos

- transmisión dentro de un segmento;
- acceso al medio;
- tramas;
- dirección MAC;
- detección de errores según el protocolo.

Unidad:

```text
trama
```

## 24.3 Red

- comunica equipos no conectados directamente;
- direccionamiento lógico;
- encaminamiento entre redes;
- IP.

Unidad:

```text
paquete/datagrama
```

## 24.4 Transporte

- comunicación extremo a extremo;
- segmentación y reensamblado;
- control de flujo/errores según servicio;
- puertos para procesos o servicios.

Unidad:

```text
segmento/unidad de transporte
```

## 24.5 Sesión

- establece y mantiene el diálogo;
- puntos de recuperación según el material.

## 24.6 Presentación

- representación de la información;
- formatos y codificación de datos.

## 24.7 Aplicación

- servicios específicos utilizados por aplicaciones y usuarios.

---

# 25. TCP/IP

TCP/IP es la arquitectura o pila de protocolos más utilizada para interconectar redes.

No debe definirse como un único protocolo.

## 25.1 Cinco capas adoptadas por el material

```text
1 Física
2 Acceso a la red
3 Internet
4 Transporte
5 Aplicación
```

## 25.2 Funciones

### Aplicación

Comunicación entre procesos o aplicaciones de equipos separados. Absorbe funciones que OSI separa en aplicación, presentación y sesión.

### Transporte

Transferencia extremo a extremo mediante protocolos como TCP o UDP.

### Internet

Encaminamiento mediante IP.

### Acceso a la red

Interfaz lógica con la subred, enlace y acceso al medio.

### Física

Medio, señalización y codificación.

---

# 26. Correspondencia OSI–TCP/IP

| OSI | TCP/IP del material |
|---|---|
| Aplicación | Aplicación |
| Presentación | Aplicación |
| Sesión | Aplicación |
| Transporte | Transporte |
| Red | Internet |
| Enlace de datos | Acceso a la red |
| Física | Física |

---

# 27. Similitudes y diferencias

## 27.1 Similitudes

- organización en capas;
- separación de responsabilidades;
- servicios entre niveles;
- protocolos pares;
- transporte como nivel extremo a extremo.

## 27.2 Diferencias

```text
OSI
- modelo de referencia general;
- siete capas;
- concebido antes de muchos protocolos.

TCP/IP
- arquitectura/pila aplicada en la práctica;
- cinco capas según el material;
- organizada alrededor de protocolos reales;
- agrupa sesión y presentación en aplicación.
```

---

# 28. Encapsulamiento

Encapsular es agregar información de control a los datos a medida que descienden por las capas.

Puede incluir:

- cabeceras;
- tráileres;
- direcciones;
- puertos;
- control de flujo;
- detección de errores;
- información propia del protocolo.

## 28.1 Desencapsulamiento

En el receptor, cada capa interpreta y retira la información que le corresponde y entrega los datos a la capa superior.

```text
Emisor   → encapsula de arriba hacia abajo.
Receptor → desencapsula de abajo hacia arriba.
```

---

# 29. PDU

```text
PDU = Protocol Data Unit
    = Unidad de Datos de Protocolo
```

Una PDU es la unidad que una capa intercambia con su capa par conforme a un protocolo.

## 29.1 Fórmula

```text
PDU = SDU + PCI
```

- SDU: datos recibidos desde la capa superior;
- PCI: información de control agregada por el protocolo.

Simplificado:

```text
PDU = datos + información de control
```

## 29.2 No confundir

```text
PUD = Proceso Unificado de Desarrollo.
PDU = Unidad de Datos de Protocolo.
```

---

# 30. Cadena de encapsulamiento

```text
Aplicación  → datos
Transporte  → segmento
Red/Internet → paquete
Enlace/Acceso → trama
Física      → bits/señales
```

En destino se recorre en orden inverso.

---

# 31. MAC, IP y puerto

```text
MAC    → direccionamiento de enlace/local.
IP     → direccionamiento lógico y redes.
Puerto → proceso o servicio de transporte dentro del host.
```

No limitar IP a equipos fuera de la LAN: también se utiliza dentro de redes locales.

---

# 32. Caso cliente-servidor

Un operario pulsa `Consultar OT 1587`.

## Emisor

```text
Aplicación
Genera la solicitud.

Transporte
Identifica procesos/servicios mediante puertos.

Internet/Red
Agrega direcciones IP y permite encaminamiento.

Acceso/Enlace
Forma una trama y utiliza direccionamiento MAC local.

Física
Transmite bits/señales por el medio.
```

## Receptor

El servidor realiza el desencapsulamiento hasta que la aplicación recibe la solicitud.

La respuesta vuelve mediante el mismo principio.

---

# 33. Errores frecuentes en Comunicaciones

- llamar protocolo único a TCP/IP;
- confundir PDU con PUD;
- definir PDU solo como datos;
- ubicar seguridad como una capa OSI independiente;
- responder las capas en orden contrario al solicitado;
- atribuir a toda una capa una función específica de un dispositivo;
- decir que IP solo sirve fuera de la LAN;
- definir puerto como una puerta física;
- confundir síncrona/asíncrona con retransmisión de paquetes.

---

# PARTE IV — INTEGRACIÓN

# 34. Caso: deshacer una modificación de OT

Necesidad:

> El operario quiere deshacer la última modificación no confirmada realizada sobre una OT desde el móvil.

## 34.1 Requerimientos

```text
RF: registrar cada modificación no confirmada.
RF: permitir deshacer la última modificación.
RNF: responder en el tiempo definido.
Regla: no se puede deshacer una acción ya confirmada.
```

## 34.2 Estructura

```text
Pila de acciones
push → registrar modificación
pop  → obtener la última para deshacerla
```

## 34.3 Comunicación

```text
Móvil → encapsula solicitud → red → servidor
Servidor → desencapsula → procesa → responde
```

## 34.4 Cadena completa

```text
Necesidad
→ elicitación
→ especificación de RF/RNF
→ validación
→ diseño con TDA Pila
→ implementación vector/enlazada
→ solicitud cliente-servidor
→ OSI/TCP-IP
→ encapsulamiento/PDU
→ prueba
```

---

# PARTE V — RECUPERACIÓN DEL DÍA 5

# 35. Tarjetas

## TDA

```text
Datos/objetos + operaciones + interfaz independiente de implementación.
```

## Constructor Java

```text
Mismo nombre de la clase + sin tipo de retorno.
```

## Fases vs. flujos

```text
Fases: Inicio, Elaboración, Construcción, Transición.
Flujos: Requisitos, Análisis, Diseño, Implementación, Prueba.
```

## Iteración vs. ciclo

```text
Iteración → produce incremento.
Ciclo completo → produce nueva versión.
```

## PDU

```text
PDU = datos + información de control.
```

## Síncrona/asíncrona

```text
Asíncrona = carácter + start/stop.
Síncrona  = bloque + cabecera/terminación.
```

---

# 36. Preguntas de autoevaluación

## Requisitos

1. ¿Qué es ingeniería de requerimientos?
2. ¿Qué diferencia existe entre elicitación y especificación?
3. ¿Qué valida la validación?
4. ¿Qué es un RF?
5. ¿Qué es un RNF?
6. ¿Qué diferencia existe entre RNF y arquitectura?
7. ¿Qué significa que un requerimiento sea consistente?
8. ¿Qué significa verificable?
9. ¿Qué significa rastreable?
10. ¿Qué diferencia existe entre RF y regla de negocio?

## Pilas

11. ¿Qué es una pila?
12. ¿Qué significa LIFO?
13. ¿Qué hace `push`?
14. ¿Qué diferencia existe entre `pop` y `peek`?
15. ¿Cómo se representa la cima con vector?
16. ¿Cómo se representa con lista enlazada?
17. ¿Qué permanece igual si cambia la implementación?
18. ¿Qué riesgo existe en una pila con capacidad fija?
19. ¿Por qué una pila no es una cola?
20. ¿Qué aplicación real utilizaría una pila?

## Comunicaciones

21. ¿Qué es OSI?
22. ¿Cuáles son sus siete capas en orden ascendente?
23. ¿Qué es TCP/IP?
24. ¿Cuáles son sus cinco capas según el material?
25. ¿Cómo se corresponden ambos?
26. ¿Qué es encapsulamiento?
27. ¿Qué es desencapsulamiento?
28. ¿Qué es una PDU?
29. ¿Qué diferencia existe entre MAC, IP y puerto?
30. ¿Qué cadena forman datos, segmento, paquete, trama y bits?

---

# 37. Hoja final de una página

```text
REQUERIMIENTOS
Ingeniería = descubrir + analizar + documentar + verificar.
Elicitación = conocer necesidades.
Especificación = describirlas.
Validación = comprobar el problema correcto.
RF = función.
RNF = propiedad/restricción.
Calidad = correcto, consistente, completo, realista,
necesario, verificable y rastreable.

PILA
TDA lineal restrictivo.
LIFO = último en entrar, primero en salir.
push = agregar.
pop = extraer/eliminar.
peek = consultar.
Vector = top por índice, capacidad definida.
Lista = top por referencia, tamaño variable.

OSI
1 Física
2 Enlace
3 Red
4 Transporte
5 Sesión
6 Presentación
7 Aplicación

TCP/IP — 5 CAPAS
Física
Acceso a la red
Internet
Transporte
Aplicación

CORRESPONDENCIA
OSI 7/6/5 → Aplicación TCP/IP
OSI 4     → Transporte
OSI 3     → Internet
OSI 2     → Acceso
OSI 1     → Física

ENCAPSULAMIENTO
Datos → segmento → paquete → trama → bits.
PDU = SDU + PCI = datos + control.
MAC = enlace; IP = red; puerto = proceso.
```

---

# 38. Fuentes utilizadas

Este resumen se basa en:

- `Analisis_y_Diseno_de_Software.md`:
  - páginas dedicadas a ingeniería de requerimientos;
  - RF/RNF;
  - propiedades de calidad;
  - captura de requisitos en PUD.
- `Taller_de_Algoritmos_y_Estructuras_de_Datos_I.md`:
  - pila;
  - LIFO;
  - operaciones;
  - pila con vector y lista enlazada.
- `COMUNICACIONES.md`:
  - modelo OSI;
  - arquitectura TCP/IP;
  - comparación;
  - encapsulamiento y PDU.
- plan maestro y estado acumulado al cierre del Día 5.

Los ejemplos de Órdenes de Trabajo se emplean para aplicar los conceptos y no sustituyen las definiciones de las fuentes.
