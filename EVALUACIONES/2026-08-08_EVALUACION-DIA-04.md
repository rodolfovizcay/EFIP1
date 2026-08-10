# Evaluación escrita EFIP I — Día 4
## Comunicaciones + integración de las cinco materias

**Fecha de estudio:** 8/8/2026  
**Modalidad:** exclusivamente escrita  
**Tiempo recomendado:** 45–55 minutos  
**Puntaje:** 10 puntos  
**Condición:** resolver sin apuntes.

---

# Parte A — Comunicaciones — 6 puntos

## 1. Sistema de comunicaciones — 0,8 puntos

Explicá brevemente cuál es el objetivo de un sistema de comunicaciones.

Después definí la función de:

- fuente;
- transmisor;
- medio de transmisión;
- receptor;
- destino.

---

## 2. Protocolo — 0,7 puntos

Definí qué es un protocolo de comunicaciones.

Explicá la diferencia entre:

- sintaxis;
- semántica;
- temporización.

Dá un ejemplo sencillo de por qué dos dispositivos necesitan respetar el mismo protocolo para poder comunicarse.

---

## 3. Modelo OSI — 1,5 puntos

Escribí las **siete capas del modelo OSI en orden ascendente**, desde la capa 1 hasta la capa 7.

Para cada capa indicá su función principal.

Además, asociá correctamente los siguientes conceptos a una capa:

```text
bits
trama
MAC
IP
encaminamiento
transporte extremo a extremo
sesión
representación de datos
servicio a la aplicación
```

---

## 4. OSI y TCP/IP — 1 punto

Respondé:

### a.
¿Cuál es la diferencia general entre el modelo OSI y la arquitectura TCP/IP?

### b.
Escribí las cinco capas TCP/IP utilizadas en el material.

### c.
Completá la correspondencia:

```text
OSI Aplicación     → TCP/IP __________
OSI Presentación   → TCP/IP __________
OSI Sesión         → TCP/IP __________
OSI Transporte     → TCP/IP __________
OSI Red            → TCP/IP __________
OSI Enlace         → TCP/IP __________
OSI Física         → TCP/IP __________
```

---

## 5. Encapsulamiento — 1,2 puntos

Explicá:

- qué es encapsulamiento;
- qué es desencapsulamiento;
- qué es una PDU.

Después completá la cadena simplificada:

```text
Aplicación  → __________
Transporte  → __________
Red         → __________
Enlace      → __________
Física      → __________
```

Finalmente explicá qué ocurre con esa información cuando llega al equipo receptor.

---

## 6. Direccionamiento y dispositivos — 0,8 puntos

### a. Direcciones

Explicá la función general de:

- dirección MAC;
- dirección IP;
- puerto.

### b. Dispositivos

Compará `switch` y `router` indicando:

- capa principal;
- dirección que utilizan;
- unidad de información asociada;
- función principal.

---

# Parte B — Caso integrador escrito — 4 puntos

## Caso

Una cooperativa utiliza un sistema de Órdenes de Trabajo.

Un encargado crea una OT desde una computadora de la oficina.  
Un operario consulta desde su teléfono móvil las órdenes pendientes.  
La aplicación se comunica con un servidor donde se encuentra la base de datos.

La OT contiene:

```text
id_ot
descripcion
prioridad
estado
id_sector
```

Las órdenes pueden tener prioridad:

```text
BAJA
MEDIA
ALTA
```

El sistema debe funcionar desde computadoras y teléfonos móviles.

---

## 7. Análisis y Diseño — 0,7 puntos

Indicá:

1. Dos actores.
2. Dos casos de uso.
3. Un requerimiento funcional.
4. Un requerimiento no funcional.
5. En qué fase del PUD ubicarías el trabajo de detallar casos de uso y estabilizar la arquitectura.

Justificá la última respuesta.

---

## 8. POO — 0,7 puntos

Definí una clase:

```text
OrdenTrabajo
```

Indicá:

- cuatro atributos;
- dos comportamientos;
- un ejemplo de estado de un objeto;
- cómo aplicarías encapsulamiento;
- qué podría representar su identidad.

No es necesario escribir código Java completo.

---

## 9. Estructuras de datos — 0,7 puntos

La aplicación obtiene de la base las órdenes pendientes y debe mantenerlas temporalmente en memoria.

Elegí entre:

- arreglo;
- lista enlazada;
- lista ordenada.

Explicá cuál utilizarías considerando:

- acceso;
- inserción;
- eliminación;
- prioridad;
- fecha.

No alcanza con nombrar la estructura: debe justificarse la decisión.

---

## 10. Base de Datos — 0,8 puntos

Usando:

```text
ORDEN_TRABAJO(
    id_ot,
    descripcion,
    prioridad,
    estado,
    id_sector
)
```

indicá:

1. relación;
2. atributos;
3. una tupla de ejemplo;
4. grado;
5. qué representa la cardinalidad;
6. clave primaria probable;
7. clave foránea probable;
8. dominio posible de `prioridad`.

---

## 11. Comunicaciones aplicadas — 1,1 puntos

El operario pulsa en su teléfono:

> Consultar OT 145

Explicá el recorrido de la solicitud desde la aplicación móvil hasta el servidor.

Tu respuesta debe mencionar, como mínimo:

- aplicación;
- transporte;
- IP;
- enlace;
- MAC;
- medio físico o inalámbrico;
- switch o router cuando corresponda;
- encapsulamiento;
- desencapsulamiento.

No es necesario indicar protocolos específicos que no hayan sido estudiados.

---

# Parte C — Recuperación espaciada — sin puntaje

Responder igualmente, porque se utilizará para verificar retención de los días anteriores.

## 12. TDA

¿Qué significa que un TDA sea independiente de su implementación?

---

## 13. Claves

¿Qué diferencia existe entre:

- clave candidata;
- clave primaria;
- clave foránea?

---

## 14. PUD

Explicá la diferencia entre:

- Construcción;
- Transición.

---

## 15. POO

Explicá la diferencia entre:

- sobrecarga;
- sobrescritura.

Dá un ejemplo conceptual de cada una.

---

# Rúbrica

| Área | Puntaje |
|---|---:|
| Sistema de comunicaciones y protocolos | 1,5 |
| OSI y TCP/IP | 2,5 |
| Encapsulamiento, direccionamiento y dispositivos | 2 |
| Integración Análisis/POO/Estructuras/BD | 2,9 |
| Comunicaciones aplicadas al caso | 1,1 |
| **Total** | **10** |

---

# Criterio de resultado

```text
9–10    Muy buen dominio
8–8,9   Buen dominio
7–7,9   Aprobado, con puntos a recuperar
6–6,9   Conocimiento inestable
< 6     Recuperación necesaria
```

La recuperación espaciada no modifica directamente la nota del Día 4, pero se registra para actualizar el estado general de progreso.

---

# Alcance de la evaluación

La evaluación cubre solamente los contenidos trabajados en el Día 4 y los conceptos de integración ya estudiados en los Días 2 y 3.

No incluye todavía en profundidad:

- señales analógicas y digitales;
- transmisión síncrona y asíncrona;
- HDLC;
- PPP;
- Ethernet detallado;
- LLC/MAC en profundidad;
- WAN;
- MPLS;
- congestión;
- última milla.

Esos temas pertenecen al programa de Comunicaciones, pero serán desarrollados en jornadas posteriores.
