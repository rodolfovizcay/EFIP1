# Resumen guiado EFIP I — Día 4
## Comunicaciones + mini integración de las cinco materias

**Fecha:** sábado 8 de agosto de 2026  
**Duración prevista:** 3 a 4 horas  
**Materia principal:** Comunicaciones  
**Integración:** Análisis y Diseño, POO, Algoritmos y Estructuras, Base de Datos y Comunicaciones

---

# 1. Objetivo del Día 4

Al finalizar la jornada deberías poder:

1. Explicar qué es un sistema de comunicaciones y cuál es su objetivo.
2. Identificar fuente, transductores, transmisor, medio, receptor y destino.
3. Diferenciar ETD y ETCD.
4. Definir protocolo y reconocer sintaxis, semántica y temporización.
5. Nombrar las siete capas del modelo OSI en orden y explicar la función de cada una.
6. Comparar OSI con la arquitectura TCP/IP de cinco capas utilizada por el material.
7. Explicar encapsulamiento, desencapsulamiento, segmentación y PDU.
8. Diferenciar switch, router, dirección MAC, dirección IP y puerto.
9. Seguir el recorrido de una solicitud desde una aplicación móvil hasta un servidor.
10. Integrar las cinco materias en un mini caso cliente-servidor.
11. Realizar el primer cierre semanal y detectar qué debe reforzarse durante las vacaciones.

El programa oficial incluye en Comunicaciones la interconexión de sistemas, el modelo OSI, la estructura TCP/IP, señales, transmisión, enlace y redes. El Día 4 estudia la base conceptual necesaria para continuar luego con nivel físico, protocolos de capa 2 y redes.

---

# PARTE I — SISTEMA DE COMUNICACIONES

# 2. Qué es un sistema de comunicaciones

Un sistema de comunicaciones es un conjunto de elementos que permite trasladar información desde un origen hasta un destino.

El material formula su objetivo así, en sentido académico:

> Entregar al destino la información generada en el origen de la manera más fiel y confiable posible, reduciendo las distorsiones y en el instante requerido.

No alcanza con que “algo llegue”. Deben considerarse:

- fidelidad;
- confiabilidad;
- oportunidad;
- medio utilizado;
- distancia;
- cantidad de información;
- tipo de información;
- errores y distorsiones.

## 2.1 Ejemplo sencillo

Cuando un operario consulta una orden de trabajo desde un teléfono:

```text
Origen: aplicación móvil del operario
Información: solicitud de consulta de la OT
Transmisión: Wi-Fi o red móvil
Destino: servidor de la cooperativa
Respuesta: datos de la orden de trabajo
```

La comunicación completa incluye más elementos que el teléfono y el servidor.

---

# 3. Elementos de un sistema de comunicaciones

El material presenta el siguiente recorrido general:

```text
Fuente
  ↓
Transductor de salida
  ↓
Transmisor
  ↓
Medio de transmisión
  ↓
Receptor
  ↓
Transductor de entrada
  ↓
Destino
```

## 3.1 Fuente

Es donde se genera la información.

Ejemplos:

- computadora;
- teléfono;
- sensor;
- aplicación;
- usuario que produce un mensaje.

## 3.2 Transductor de salida

Convierte una forma de energía o información en otra forma adecuada para ser transmitida.

Ejemplos del material:

- micrófono;
- teclado;
- alarma;
- sensor.

En una aplicación informática, la conversión puede ser realizada por componentes físicos y lógicos que transforman los datos en señales transmisibles.

## 3.3 Transmisor

Emite la señal a través del medio.

Ejemplos:

- antena;
- placa de red;
- módem;
- interfaz de comunicaciones.

## 3.4 Medio de transmisión

Es el camino por el que viaja la señal.

Puede ser:

- guiado: cable de cobre, coaxial, fibra óptica;
- no guiado: aire, radiofrecuencia, microondas, satélite.

## 3.5 Receptor

Recibe la señal que llega desde el medio.

## 3.6 Transductor de entrada

Convierte la señal recibida en una forma comprensible para el destino.

Ejemplo clásico:

- un parlante transforma la señal en sonido.

## 3.7 Destino

Es quien recibe y utiliza la información.

Puede ser:

- una persona;
- una aplicación;
- una computadora;
- un servidor;
- un proceso.

---

# 4. ETD y ETCD

El material utiliza dos términos académicos importantes.

## 4.1 ETD — Equipo Terminal de Datos

También aparece como DTE en inglés.

Funciona como:

- fuente de datos;
- destino de datos;
- dispositivo que genera o consume información;
- equipo que puede controlar parte de la comunicación.

Ejemplos:

- computadora;
- terminal;
- impresora;
- servidor.

## 4.2 ETCD — Equipo de Terminación de Circuitos de Datos

También aparece como DCE.

Su función es transformar la información entregada por el ETD en señales compatibles con el canal de transmisión.

Ejemplos:

- módem;
- códec;
- equipos de adaptación al medio.

## 4.3 Ejemplo

```text
Computadora del operario → ETD
Módem o interfaz de acceso → ETCD
Canal de comunicación → medio
Servidor → ETD de destino
```

La separación ETD/ETCD permite distinguir el equipo que produce o consume datos del equipo que adapta esos datos al canal.

---

# 5. Funciones generales necesarias para comunicar

El sistema debe resolver, entre otras, estas funciones:

1. uso eficiente del sistema de transmisión;
2. implementación de una interfaz con el medio;
3. generación de señales interpretables;
4. sincronización entre emisión y recepción;
5. detección y tratamiento de errores;
6. direccionamiento;
7. control de flujo;
8. segmentación y ensamblado;
9. establecimiento y liberación de conexiones;
10. multiplexación de diferentes procesos.

Estas funciones se distribuyen entre capas y protocolos.

---

# PARTE II — PROTOCOLOS

# 6. Qué es un protocolo

Un protocolo es un conjunto de reglas que permite que dos o más entidades intercambien información.

Para que dos dispositivos se comuniquen no alcanza con estar conectados físicamente. Deben acordar:

- cómo se representan los datos;
- qué significa cada campo;
- cuándo se envía;
- en qué orden;
- cómo se detectan errores;
- cómo se identifica origen y destino.

## 6.1 Tres elementos de un protocolo

### Sintaxis

Define la forma o estructura del mensaje.

Ejemplos:

- orden de campos;
- tamaño;
- formato;
- niveles de señal.

### Semántica

Define el significado de la información de control.

Ejemplos:

- qué significa una confirmación;
- cómo se indica un error;
- qué acción debe ejecutar el receptor.

### Temporización

Define aspectos relacionados con tiempo y secuencia.

Ejemplos:

- cuándo transmitir;
- a qué velocidad;
- en qué orden;
- cómo sincronizar emisor y receptor.

## 6.2 Regla mental

```text
Sintaxis     = cómo está formado
Semántica    = qué significa
Temporización = cuándo y en qué orden
```

---

# 7. Funciones de los protocolos

Aunque varias se estudiarán con mayor profundidad después, conviene reconocerlas desde ahora.

## 7.1 Segmentación y ensamblado

La información puede dividirse en unidades menores para facilitar:

- transmisión;
- control de errores;
- uso compartido del canal;
- almacenamiento temporal.

En destino, esas unidades deben volver a reunirse en el orden correcto.

## 7.2 Encapsulamiento

Cada capa puede agregar información de control.

Ejemplos:

- dirección de origen;
- dirección de destino;
- tipo de información;
- datos de control de flujo;
- datos para detección de errores.

## 7.3 Control de conexión

Gestiona estados como:

```text
establecimiento → transmisión → desconexión
```

## 7.4 Control de flujo

Evita que un emisor envíe más información de la que la red o el receptor pueden procesar.

## 7.5 Control de errores

Permite detectar pérdida, alteración o desorden de unidades transmitidas.

## 7.6 Direccionamiento

Permite saber:

- quién envía;
- quién recibe;
- a qué red pertenece;
- qué proceso o aplicación espera la información.

## 7.7 Multiplexación

Permite que diferentes procesos compartan una misma conexión o medio.

---

# PARTE III — MODELO OSI

# 8. Qué es el modelo OSI

OSI significa **Open Systems Interconnection** o Interconexión de Sistemas Abiertos.

Es un modelo de referencia que describe cómo puede viajar la información desde una aplicación de un extremo hasta una aplicación del otro extremo.

Su objetivo principal es permitir la comunicación entre sistemas diferentes sin depender de un único fabricante o arquitectura propietaria.

## 8.1 Por qué utiliza capas

La comunicación completa es un problema complejo.

OSI lo divide en siete problemas más pequeños:

- cada capa atiende funciones determinadas;
- utiliza servicios de la capa inferior;
- ofrece servicios a la capa superior;
- dialoga conceptualmente con su capa par en el otro extremo.

Esto permite:

- modularidad;
- reemplazar tecnologías de una capa sin rediseñar todo;
- localizar responsabilidades;
- estandarizar interfaces y protocolos;
- facilitar el aprendizaje y diagnóstico.

---

# 9. Las siete capas OSI

Orden ascendente:

```text
1. Física
2. Enlace de datos
3. Red
4. Transporte
5. Sesión
6. Presentación
7. Aplicación
```

Orden descendente:

```text
7. Aplicación
6. Presentación
5. Sesión
4. Transporte
3. Red
2. Enlace de datos
1. Física
```

## 9.1 Capa 1 — Física

### Función

Transmitir bits mediante un medio físico o no guiado.

Define aspectos como:

- medios;
- conectores;
- niveles eléctricos;
- potencia;
- codificación;
- modulación;
- detección de señal;
- tasa de señalización.

### Ejemplos

- cable UTP;
- fibra óptica;
- radiofrecuencia;
- conectores;
- repetidores;
- módems en su función física.

### Unidad conceptual

```text
Bits
```

---

## 9.2 Capa 2 — Enlace de datos

### Función

Gestionar la transmisión dentro de un segmento de red y preparar la información para la capa física.

Funciones importantes:

- control de acceso al medio;
- delimitación de tramas;
- direccionamiento físico;
- detección de errores;
- control de flujo inicial;
- recuperación ante fallos según el protocolo.

### Conceptos asociados

- trama;
- dirección MAC;
- switch;
- Ethernet;
- LLC y MAC.

### Unidad conceptual

```text
Trama
```

---

## 9.3 Capa 3 — Red

### Función

Comunicar equipos que no están conectados directamente y encaminar paquetes entre redes.

Funciones:

- direccionamiento lógico;
- elección de ruta;
- encaminamiento;
- interconexión de redes;
- control de congestión en el enfoque del material.

### Conceptos asociados

- paquete;
- dirección IP;
- router;
- tabla de enrutamiento.

### Unidad conceptual

```text
Paquete
```

---

## 9.4 Capa 4 — Transporte

### Función

Proporcionar comunicación extremo a extremo entre procesos o usuarios terminales.

Puede realizar:

- establecimiento de conexiones;
- segmentación;
- reensamblado;
- control de flujo;
- recuperación de comunicación;
- control final de errores;
- identificación mediante puertos.

### Protocolos asociados

- TCP;
- UDP.

### Idea clave

La capa de transporte oculta a las aplicaciones los detalles de las redes intermedias.

---

## 9.5 Capa 5 — Sesión

### Función

Organizar el diálogo entre aplicaciones y establecer puntos que permitan recuperar una comunicación.

El material señala que tuvo uso en operaciones como transacciones y que hoy muchas de sus funciones quedan absorbidas por capas superiores o aplicaciones.

---

## 9.6 Capa 6 — Presentación

### Función

Definir cómo se representan los datos.

Puede encargarse de:

- formato;
- conversión;
- representación de caracteres;
- imágenes;
- estructuras de datos;
- adaptación entre representaciones diferentes.

La pregunta principal es:

```text
¿Cómo deben interpretarse los datos?
```

---

## 9.7 Capa 7 — Aplicación

### Función

Brindar servicios de comunicaciones a las aplicaciones del usuario.

Ejemplos:

- web;
- correo electrónico;
- nombres de dominio;
- transferencia de archivos;
- servicios de aplicación.

No significa que toda la aplicación esté “dentro” de la capa. Representa los servicios de red disponibles para los procesos de aplicación.

---

# 10. Tabla OSI para estudiar

| Capa | Función central | Ejemplo o concepto |
|---|---|---|
| 7. Aplicación | Servicios para aplicaciones | Web, correo, DNS |
| 6. Presentación | Representación de datos | Formatos y conversiones |
| 5. Sesión | Diálogo y recuperación | Control de sesión |
| 4. Transporte | Extremo a extremo | TCP/UDP, puertos |
| 3. Red | Encaminamiento | IP, router, paquete |
| 2. Enlace | Segmento y acceso al medio | MAC, switch, trama |
| 1. Física | Transmisión de señal | Medio, conectores, bits |

## 10.1 Fórmula del material

```text
Aplicación  → semántica de los datos
Presentación → representación de los datos
Sesión      → diálogo ordenado
Transporte  → extremo a extremo
Red         → encaminamiento
Enlace      → punto a punto o segmento
Física      → eléctrico/mecánico y medio
```

---

# 11. Cómo memorizar OSI sin recitar vacío

No alcanza con repetir nombres. Asociá una pregunta a cada capa:

```text
Aplicación   → ¿qué servicio usa el programa?
Presentación → ¿cómo se representan los datos?
Sesión       → ¿cómo se mantiene el diálogo?
Transporte   → ¿cómo llegan de extremo a extremo?
Red          → ¿por qué ruta y a qué IP?
Enlace       → ¿a qué MAC y cómo accede al medio?
Física       → ¿cómo viajan realmente los bits?
```

---

# PARTE IV — TCP/IP

# 12. Qué es TCP/IP

TCP/IP es la arquitectura de protocolos más utilizada para interconectar redes y sostener Internet.

El material diferencia:

- OSI: modelo de referencia general;
- TCP/IP: arquitectura construida alrededor de protocolos reales.

Ambos comparten:

- organización en capas;
- separación de funciones;
- comunicación entre niveles;
- responsabilidad extremo a extremo en transporte;
- abstracción de detalles inferiores.

---

# 13. Cinco capas TCP/IP según el material

El material adopta cinco capas:

```text
1. Física
2. Acceso a la red
3. Internet
4. Transporte
5. Aplicación
```

## 13.1 Aplicación

Comunicación entre procesos o aplicaciones de equipos separados.

Reúne funciones que OSI separa en:

- aplicación;
- presentación;
- sesión.

## 13.2 Transporte

Transferencia extremo a extremo mediante TCP o UDP.

## 13.3 Internet

Encaminamiento de datos mediante IP.

## 13.4 Acceso a la red

Interfaz lógica entre un sistema final y una subred.

Incluye las funciones que se relacionan con el acceso al medio y el enlace.

## 13.5 Física

Medio de transmisión, codificación y señalización.

---

# 14. Correspondencia OSI–TCP/IP

| OSI | TCP/IP del material |
|---|---|
| Aplicación | Aplicación |
| Presentación | Aplicación |
| Sesión | Aplicación |
| Transporte | Transporte |
| Red | Internet |
| Enlace | Acceso a la red |
| Física | Física |

## 14.1 Diferencia importante

OSI fue concebido como un modelo general antes de que todos los protocolos estuvieran definidos.

En TCP/IP los protocolos aparecieron y la arquitectura describe cómo se organizan y relacionan.

## 14.2 Respuesta oral modelo

> OSI es un modelo de referencia de siete capas que organiza todas las funciones típicas de una comunicación. TCP/IP es una arquitectura de protocolos utilizada en la práctica. Ambos separan responsabilidades en niveles, pero TCP/IP agrupa sesión y presentación dentro de aplicación y utiliza una menor cantidad de capas.

---

# PARTE V — ENCAPSULAMIENTO Y PDU

# 15. Qué es encapsular

Encapsular significa agregar información de control a los datos a medida que descienden por las capas.

Cada capa recibe datos desde la capa superior y puede agregar:

- cabecera;
- tráiler;
- direcciones;
- identificadores;
- control de flujo;
- control de errores;
- información propia del protocolo.

En el receptor ocurre el proceso inverso:

```text
Desencapsulamiento
```

Cada capa interpreta y elimina la información que le corresponde antes de entregar los datos a la capa superior.

---

# 16. PDU

PDU significa **Protocol Data Unit** o Unidad de Datos de Protocolo.

Es la unidad de datos que una capa intercambia con su capa par según un protocolo.

El material explica que una PDU combina:

- datos recibidos desde la capa superior;
- información de control propia del protocolo.

De forma simplificada:

```text
PDU = datos + información de control
```

## 16.1 SDU y PCI

El material también utiliza:

- **SDU:** datos de servicio recibidos desde la capa superior;
- **PCI:** información de control agregada por el protocolo.

```text
PDU = SDU + PCI
```

Para el Día 4 no es necesario memorizar todas las siglas adicionales, pero sí comprender la idea.

---

# 17. Cadena práctica de encapsulamiento

Como recurso de estudio puede pensarse:

```text
Aplicación  → datos
Transporte  → segmento o unidad de transporte
Red         → paquete
Enlace      → trama
Física      → bits/señales
```

En el receptor se recorre en sentido contrario.

La denominación concreta de la PDU depende de la capa y del protocolo, pero el principio permanece: cada nivel agrega o interpreta control propio.

---

# 18. Ejemplo: consultar una OT desde un móvil

## 18.1 Emisor

### Aplicación

El operario pulsa “Consultar OT 145”.

La aplicación genera una solicitud.

### Transporte

Se establece la comunicación extremo a extremo y se identifica el proceso mediante puertos.

### Internet/Red

Se agregan direcciones IP de origen y destino y se determina el encaminamiento.

### Acceso/Enlace

Se forma una trama con direcciones físicas correspondientes al segmento inmediato y control de acceso al medio.

### Física

Los bits se convierten en señales y viajan por Wi-Fi, red móvil, cable o fibra según el trayecto.

## 18.2 Receptor

El servidor recibe la señal y desencapsula:

```text
bits → trama → paquete → transporte → datos de aplicación
```

La aplicación del servidor interpreta la solicitud, consulta la base y prepara la respuesta.

## 18.3 Respuesta

La respuesta vuelve a encapsularse y atraviesa el proceso inverso hacia el móvil.

---

# 19. Direccionamiento por nivel

Una comunicación completa utiliza distintos identificadores.

| Nivel | Identificador o concepto |
|---|---|
| Aplicación | servicio o recurso solicitado |
| Transporte | puerto o proceso |
| Red | dirección IP |
| Enlace | dirección MAC |
| Física | señal y medio |

No confundir:

```text
MAC   = dirección física del enlace local
IP    = dirección lógica para interconectar redes
Puerto = identifica un proceso o servicio
```

---

# 20. Switch y router

Esta recuperación corrige una dificultad del diagnóstico inicial.

## 20.1 Switch

- trabaja principalmente en capa 2;
- conecta dispositivos dentro de una LAN;
- reenvía tramas;
- utiliza direcciones MAC;
- mantiene una tabla que asocia MAC con puertos físicos.

## 20.2 Router

- trabaja principalmente en capa 3;
- conecta redes diferentes;
- encamina paquetes;
- utiliza direcciones IP y tablas de enrutamiento;
- decide la próxima interfaz o ruta.

## 20.3 DHCP no es la función esencial del router

Un equipo comercial puede incluir:

- router;
- switch;
- punto de acceso;
- servidor DHCP;
- firewall.

Pero conceptualmente son funciones distintas.

## 20.4 Tabla

| Elemento | Switch | Router |
|---|---|---|
| Capa | 2 | 3 |
| Unidad | Trama | Paquete |
| Dirección | MAC | IP |
| Función | Conectar equipos de una LAN | Conectar redes |

---

# PARTE VI — MINI INTEGRACIÓN DE LAS CINCO MATERIAS

# 21. Caso de estudio

Una cooperativa necesita un sistema web y móvil para que:

- el encargado cree y asigne órdenes de trabajo;
- el operario consulte sus órdenes desde un teléfono;
- el operario inicie y finalice la atención;
- el servidor almacene los datos en una base relacional;
- los clientes se conecten desde la red local, Wi-Fi o datos móviles.

El equipo ya identificó los requisitos principales y ahora está detallando los casos de uso y definiendo una arquitectura estable antes de implementar el módulo completo.

---

# 22. Análisis y Diseño

## 22.1 Actores

- Encargado.
- Operario.

## 22.2 Casos de uso

- Crear OT.
- Asignar OT.
- Consultar OT asignadas.
- Iniciar trabajo.
- Finalizar trabajo.

## 22.3 Requerimientos funcionales

```text
El sistema debe permitir al encargado crear una OT.
El sistema debe permitir asignar una OT a un operario.
El sistema debe permitir al operario consultar sus OT.
El sistema debe permitir iniciar y finalizar una OT.
```

## 22.4 Requerimientos no funcionales

```text
El sistema debe funcionar desde navegadores web y dispositivos móviles.
Los datos deben almacenarse en una base relacional.
La comunicación debe realizarse mediante una arquitectura cliente-servidor.
```

## 22.5 Fase del PUD

El caso se encuentra principalmente en **Elaboración**, porque:

- los requisitos principales ya se conocen;
- se detallan casos de uso;
- se resuelven decisiones técnicas;
- se busca una línea base estable de arquitectura;
- todavía no se implementó el producto completo.

---

# 23. Programación Orientada a Objetos

## 23.1 Clase `OrdenTrabajo`

```text
OrdenTrabajo
- id
- descripcion
- prioridad
- estado
- fecha

+ asignarOperario()
+ iniciar()
+ finalizar()
```

## 23.2 Clase `Operario`

```text
Operario
- id
- nombre
- sector

+ consultarOrdenes()
+ aceptarAsignacion()
```

## 23.3 Relación

Para un modelo inicial:

```text
Operario 1 ───── 0..* OrdenTrabajo
```

Esto supone que una OT se asigna a un solo operario y un operario puede tener varias OT. Si el dominio permite cuadrillas o varias asignaciones, el modelo debe ampliarse.

## 23.4 Encapsulamiento

Los atributos deben mantenerse privados y los cambios de estado deben controlarse mediante métodos.

```java
public void iniciar() {
    if ("DESPACHADA".equals(estado)) {
        estado = "EN_EJECUCION";
    }
}
```

---

# 24. Algoritmos y Estructuras

La aplicación puede cargar en memoria las órdenes consultadas.

## Posibilidades

### Arreglo

Conviene si:

- se conoce una cantidad máxima;
- se necesita acceso por índice;
- hay pocas inserciones y eliminaciones.

### Lista enlazada

Conviene si:

- la cantidad cambia;
- hay inserciones o eliminaciones frecuentes;
- se acepta recorrido secuencial.

### Lista ordenada

Para atender OT por prioridad y fecha, puede analizarse una lista ordenada por:

```text
1. prioridad
2. fecha
```

La estructura debe elegirse desde la regla del problema, no solo por comodidad para mostrar datos.

---

# 25. Base de Datos

Para un modelo inicial simplificado:

```text
OPERARIO(
    id_operario,
    nombre,
    sector
)

ORDEN_TRABAJO(
    id_ot,
    descripcion,
    prioridad,
    estado,
    fecha,
    id_operario
)
```

## Claves

```text
OPERARIO.id_operario → clave primaria
ORDEN_TRABAJO.id_ot → clave primaria
ORDEN_TRABAJO.id_operario → clave foránea
```

## Grados

```text
OPERARIO → grado 3
ORDEN_TRABAJO → grado 6
```

## Dominios

```text
prioridad ∈ {BAJA, MEDIA, ALTA}
estado ∈ {PENDIENTE, DESPACHADA, EN_EJECUCION, EJECUTADA, ANULADA}
```

## Supuesto explícito

El modelo anterior supone una sola asignación vigente por OT. Si una OT puede tener varios operarios o historial de asignaciones, debe existir una relación adicional como `ASIGNACION`.

---

# 26. Comunicaciones

## Arquitectura general

```text
Aplicación móvil/web
        ↓
Red local, Wi-Fi o datos móviles
        ↓
Routers y redes intermedias
        ↓
Servidor de aplicación
        ↓
Base de datos relacional
```

## Recorrido OSI

```text
Aplicación:
solicitud de consultar OT

Presentación:
representación de los datos

Sesión:
diálogo de la aplicación

Transporte:
comunicación extremo a extremo

Red:
direcciones IP y encaminamiento

Enlace:
tramas y direcciones MAC del segmento

Física:
señales por Wi-Fi, radio, cobre o fibra
```

---

# 27. Respuesta integradora modelo

> El módulo se encuentra principalmente en Elaboración del PUD porque los requisitos principales ya fueron identificados y se están detallando los casos de uso y estabilizando la arquitectura. Los actores son Encargado y Operario, con casos de uso como crear, asignar, consultar, iniciar y finalizar una OT. En POO pueden modelarse las clases `OrdenTrabajo` y `Operario`, manteniendo atributos privados y cambios controlados mediante métodos. En memoria, las órdenes pueden organizarse en una lista o colección ordenada según prioridad y fecha. En la base relacional pueden existir las relaciones `OPERARIO` y `ORDEN_TRABAJO`, vinculadas mediante `id_operario` como clave foránea, bajo el supuesto de una única asignación vigente. Cuando el operario consulta una OT desde el móvil, la solicitud atraviesa las capas de aplicación, transporte, red, enlace y física; se encapsula en el emisor y se desencapsula en el servidor. Un switch conecta equipos de la LAN mediante MAC y un router comunica redes mediante IP.

---

# PARTE VII — RECUPERACIÓN ESPACIADA

# 28. Tarjetas de los Días 2 y 3

## Tarjeta 1 — TDA

```text
TDA = datos + operaciones + interfaz independiente de implementación
```

Una pila sigue siendo una pila aunque se implemente con arreglo o lista.

## Tarjeta 2 — Clave candidata

```text
Clave candidata = superclave mínima
```

Identifica una tupla y no contiene atributos innecesarios.

## Tarjeta 3 — Clave foránea

```text
Atributo o conjunto de atributos que referencia una clave de otra relación
```

## Tarjeta 4 — Sobrecarga

```text
Mismo nombre + distinta cantidad o tipos de parámetros
```

## Tarjeta 5 — Sobrescritura

```text
Subclase + método heredado + misma signatura + nueva implementación
```

## Tarjeta 6 — Construcción / Transición

```text
Construcción = producto completo
Transición = beta, correcciones, capacitación y despliegue
```

---

# PARTE VIII — PRIMER RESUMEN SEMANAL

# 29. Evolución de la etapa de diagnóstico

| Área | Diagnóstico inicial | Último resultado antes del Día 4 |
|---|---:|---:|
| Análisis y Diseño | 4,75 | Día 2: 8,0 global |
| POO | 5,5 | Día 2: 8,0 global |
| Algoritmos y Estructuras | 7 | Día 3: 8,3 global integrado |
| Base de Datos | 6 | Día 3: 8,3 global integrado |
| Comunicaciones | 4,75 | Se evalúa en Día 4 |

## 29.1 Fortalezas actuales

- Capacidad para aplicar conceptos a Órdenes de Trabajo.
- Buena comprensión práctica de POO.
- Arreglos, listas y modelo relacional básicos mejorados.
- Encapsulamiento y claves principales comprendidos.
- Mayor precisión académica que en el diagnóstico.

## 29.2 Brechas actuales

- OSI, TCP/IP y encapsulamiento todavía deben evaluarse.
- Relaciones UML necesitan consolidación.
- TDA y clave candidata requieren definición exacta.
- Sobrecarga/sobrescritura requieren ejemplos firmes.
- Java escrito conserva errores de sintaxis.
- El oral debe mencionar todos los elementos pedidos sin omitirlos.

## 29.3 Objetivo del sábado

Cerrar la etapa diagnóstica con:

- primera evaluación de Comunicaciones;
- mini integración de las cinco materias;
- resumen semanal;
- prioridades para las vacaciones que comienzan el lunes 10/8.

---

# 30. Preguntas de autoevaluación

Responder sin mirar:

1. ¿Cuál es el objetivo de un sistema de comunicaciones?
2. ¿Qué diferencia existe entre fuente y destino?
3. ¿Qué diferencia existe entre ETD y ETCD?
4. ¿Qué es un protocolo?
5. ¿Qué son sintaxis, semántica y temporización?
6. ¿Por qué OSI utiliza capas?
7. Nombrá las siete capas en orden.
8. ¿Qué función tiene la capa física?
9. ¿Qué función tiene la capa de enlace?
10. ¿Qué función tiene la capa de red?
11. ¿Qué función tiene transporte?
12. ¿Qué diferencia existe entre OSI y TCP/IP?
13. ¿Cuáles son las cinco capas TCP/IP adoptadas por el material?
14. ¿Qué es encapsulamiento?
15. ¿Qué es una PDU?
16. ¿Qué significa desencapsular?
17. ¿Qué diferencia existe entre MAC, IP y puerto?
18. ¿Qué diferencia existe entre switch y router?
19. ¿En qué fase del PUD se encuentra el mini caso y por qué?
20. ¿Cómo se conectan clases, tablas, estructuras en memoria y comunicaciones?

## Criterio

- 17–20 correctas: listo para evaluación.
- 14–16: repasar tabla OSI y encapsulamiento.
- 10–13: releer OSI/TCP-IP.
- Menos de 10: rehacer el mapa completo en una hoja.

---

# 31. Hoja final de una página

```text
SISTEMA DE COMUNICACIONES
Origen → transmisión → destino.
Objetivo: información fiel, confiable y oportuna.

ELEMENTOS
Fuente → transductor → transmisor → medio
→ receptor → transductor → destino.

PROTOCOLO
Reglas para comunicar.
Sintaxis = forma.
Semántica = significado.
Temporización = tiempo y orden.

OSI
7 Aplicación     servicios
6 Presentación   representación
5 Sesión         diálogo
4 Transporte     extremo a extremo
3 Red            encaminamiento / IP
2 Enlace         trama / MAC / acceso al medio
1 Física         bits / señales / medio

TCP/IP — 5 CAPAS
Aplicación
Transporte
Internet
Acceso a la red
Física

ENCAPSULAMIENTO
Cada capa agrega control.
PDU = datos + información de protocolo.
Destino desencapsula en orden inverso.

DIRECCIONES
MAC = enlace local.
IP = redes.
Puerto = proceso.

DISPOSITIVOS
Switch = capa 2, MAC, LAN.
Router = capa 3, IP, interconecta redes.

MINI CASO
PUD: Elaboración.
POO: OrdenTrabajo + Operario.
Estructura: lista/colección según operaciones.
BD: OPERARIO + ORDEN_TRABAJO.
Comunicación: cliente-servidor mediante TCP/IP.
```

---

# 32. Fuentes utilizadas

Este resumen utiliza únicamente:

- `PROGRAMA EFIP I - INFORMATICA NUEVO.pdf`;
- `COMUNICACIONES.md`:
  - páginas 5–10: sistema de comunicaciones, ETD/ETCD y funciones;
  - páginas 25–32: modelo OSI y sus siete capas;
  - páginas 37–43: TCP/IP y comparación con OSI;
  - páginas 109–117: protocolos, PDU, encapsulamiento y direccionamiento;
- documentación de cierre de los Días 2 y 3;
- plan maestro EFIP I hasta el 3/9.

Los ejemplos de Órdenes de Trabajo se usan para aplicar los conceptos sin reemplazar las definiciones de las fuentes.
