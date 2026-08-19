# Estado preparado — EFIP I — Día 12

**Fecha académica prevista:** 19/08/2026
**Jornada:** Implementación + Archivos Java + Enlace de datos
**Estado:** **PREPARADO — NO INICIADO**
**Día 11:** cerrado y aprobado — `9,2/10`

---

# 1. Regla de integridad

Este archivo prepara la jornada sin modificar el estado académico canónico.

```text
material preparado ≠ contenido estudiado
respuesta modelo leída ≠ evidencia del estudiante
ejemplo ejecutado durante la preparación ≠ ejercicio resuelto por el estudiante
```

Hasta el cierre real permanecen sin cambios:

- `03-ESTADO-ACTUAL.md`;
- `04-MATRIZ-DE-PROGRESO.md`;
- `05-REGISTRO-DIARIO.md`;
- `06-ERRORES-Y-RECUPERACIONES.md`;
- `99-MANIFIESTO-CIERRE.md`.

---

# 2. Objetivo del Día 12

Al finalizar, el estudiante deberá poder:

1. diferenciar modelo de implementación y modelo de despliegue;
2. relacionar clases e interfaces de diseño con paquetes, componentes y artefactos;
3. diferenciar componente, subsistema, interfaz, artefacto y nodo;
4. representar componentes en nodos y justificar una decisión de infraestructura;
5. leer y escribir archivos de texto en Java de manera segura;
6. usar `Path`, `Files`, UTF-8 y `try-with-resources`;
7. crear, lanzar, declarar, capturar y propagar una excepción propia;
8. integrar dominio, repositorio de archivos y aplicación Java;
9. explicar funciones generales de los protocolos;
10. diferenciar HDLC, PPP y Ethernet;
11. explicar trama, LLC, MAC e IEEE 802.x;
12. ejecutar el razonamiento de aprendizaje y reenvío de un switch;
13. explicar por qué aparecen bucles de capa 2 y qué función cumple STP;
14. comparar `switch: MAC → puerto` con `router: red IP → siguiente salto/interfaz`.

---

# 3. Estado de entrada

| Área | Evidencia disponible | Brecha que retoma el Día 12 |
|---|---|---|
| Análisis y Diseño | arquitectura, vistas 4+1, componentes y despliegue reconocidos | construir trazabilidad completa y decisión de infraestructura |
| Java | excepciones recuperadas; Java complementario aprobado | archivos separados, persistencia en texto y excepción propia integrada |
| Comunicaciones | nivel físico, switch C2/MAC y router C3/IP | trama, protocolos de enlace, tabla MAC, decisión de reenvío y STP |

Pendientes trasladados expresamente desde el Día 11:

```text
programa Java autónomo con archivos separados
manipulación de archivos y excepciones propias integradas
práctica espaciada de checked/unchecked y throw/throws
```

Errores canónicos que reaparecen como recuperación espaciada:

```text
E-051 — implementación frente a despliegue
E-057 — excepciones y propagación
```

No se abre un error nuevo durante la preparación. Solo puede registrarse después de observar una respuesta real.

---

# 4. Umbral de recuperación inicial

```text
10–12 correctas → comenzar M1 directamente
7–9 correctas   → recuperación selectiva de 15 minutos
0–6 correctas   → recuperación dirigida de 25 minutos
```

---

# 5. Productos preparados

- guía ampliada de la jornada;
- recuperación inicial con clave breve;
- ficha de implementación, despliegue e infraestructura;
- mapa de trazabilidad UML → código → componente → nodo;
- ficha de archivos y excepciones propias en Java;
- ejemplo Java integrado y ejecutable;
- ficha de enlace de datos, protocolos y trama Ethernet;
- ficha de aprendizaje MAC, reenvío y STP;
- mapa del flujo interno de un switch;
- caso integrador SIGO;
- evaluación de 10 puntos y respuestas modelo;
- resumen guiado;
- plantilla de cierre;
- manifiesto de preparación y trazabilidad.

---

# 6. Clasificación de la cobertura

## Respaldado directamente por los materiales

- modelo de implementación, componente, subsistema, interfaz, nodo y despliegue;
- diagrama de componentes y diagrama de despliegue;
- excepciones propias y `try/catch`;
- funciones de los protocolos, HDLC, PPP, Ethernet, trama, LLC, MAC e IEEE 802.x;
- STP como solución frente a bucles por enlaces redundantes.

## Ampliación complementaria prevista por el plan

- API moderna de archivos con `Path` y `Files`;
- UTF-8 explícito, `try-with-resources` y traducción de excepciones;
- servidor propio frente a servicio contratado;
- aprendizaje detallado `MAC origen → puerto`, envejecimiento y decisión de reenvío;
- distinción inicial entre bucle de capa 2 y bucle de enrutamiento.

---

# 7. Inicio

```text
Comenzar Día 12
```

La primera actividad es la recuperación inicial de doce preguntas sin apuntes.
