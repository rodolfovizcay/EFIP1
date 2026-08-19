# Día 12 — Implementación, archivos y enlace de datos

**Fecha:** 19/08/2026
**Duración núcleo:** 5,5 horas
**Estado:** **PREPARADO — NO INICIADO**

---

# 1. Propósito de la jornada

La jornada une tres preguntas:

```text
¿Cómo se materializa el diseño?       → implementación y componentes
¿Cómo persiste localmente la app?     → archivos y excepciones Java
¿Cómo llega una trama por la LAN?     → enlace de datos, switch y STP
```

El hilo integrador será una aplicación móvil de trabajos pendientes que guarda un archivo local y se comunica con un servidor mediante una LAN Ethernet.

---

# 2. Resultados esperados

Al finalizar, el estudiante deberá producir evidencia propia de que puede:

- trazar una clase de diseño hasta un archivo o componente ejecutable;
- ubicar artefactos en nodos sin confundir implementación con despliegue;
- comparar infraestructura propia y contratada mediante criterios explícitos;
- guardar y recuperar objetos desde un archivo de texto;
- explicar el flujo de una excepción desde `throw` hasta `catch`;
- reconocer las partes básicas de una trama;
- simular el aprendizaje y la consulta de una tabla MAC;
- explicar cómo STP mantiene redundancia sin dejar un ciclo lógico activo;
- comparar conmutación de capa 2 y encaminamiento de capa 3.

---

# 3. Trazabilidad del contenido

## Núcleo universitario

- flujo y artefactos de implementación;
- modelo de implementación y de despliegue;
- componentes, subsistemas, interfaces y nodos;
- excepciones propias en Java;
- funciones y estructura de protocolos;
- HDLC, PPP, Ethernet, LLC, MAC, IEEE 802.x y STP.

## Ampliación complementaria

- persistencia de texto con `java.nio.file`;
- `try-with-resources`, UTF-8 explícito y conservación de la causa;
- decisión de infraestructura propia/contratada;
- algoritmo detallado de aprendizaje y reenvío de switches;
- tabla MAC frente a ARP y tabla de enrutamiento;
- diferencia inicial entre bucles de capa 2 y de capa 3.

La ampliación sirve para la defensa oral; no reemplaza ni altera las definiciones de los apuntes.

---

# 4. Cronograma ampliado

| Bloque | Duración | Núcleo | Producto verificable |
|---|---:|---|---|
| Recuperación inicial | 20–25 min | Día 10–11 y prerrequisitos | 12 respuestas |
| Mañana M1 | 90 min | implementación y despliegue | mapa + decisión |
| Pausa | 10–15 min | descanso | — |
| Mañana M2 | 90 min | archivos y excepciones propias | programa razonado |
| Cierre de mañana | 30 min | trazabilidad UML→código→nodo | tabla completa |
| Pausa larga | 45–60 min | descanso | — |
| Tarde T1 | 90 min | protocolos y Ethernet | trama + cuadro comparativo |
| Tarde T2 | 60 min | switch, tabla MAC y STP | simulación + oral |
| Evaluación | 50–60 min | integración | evidencia final |

Si el tiempo real se acorta, conservar M1, M2, la simulación MAC y la explicación de STP. La evaluación puede realizarse en un bloque separado sin declarar dominio antes de corregirla.

---

# 5. Recuperación inicial

Usar `TARJETAS/2026-08-19_RECUPERACION-INICIAL-DIA-12.md` sin consultar las fichas.

Reglas:

1. responder primero;
2. corregir después con la clave;
3. registrar solamente los errores observados;
4. repetir oralmente `throw`, `throws`, checked y unchecked si aparece una confusión.

---

# 6. Mañana M1 — Implementación y despliegue

## Secuencia conceptual

```text
caso de uso
→ clases e interfaces de diseño
→ subsistemas de implementación
→ componentes y artefactos
→ construcción ejecutable
→ nodos de despliegue
```

## Conceptos que deben quedar diferenciados

| Concepto | Pregunta que responde |
|---|---|
| clase/interfaz de diseño | ¿qué responsabilidades y contratos tiene el software? |
| componente | ¿en qué pieza física de software se materializa? |
| subsistema de implementación | ¿cómo agrupamos componentes manejables? |
| interfaz | ¿qué operaciones ofrece o requiere una pieza? |
| artefacto | ¿qué archivo concreto se produce o despliega? |
| nodo | ¿qué recurso físico de ejecución lo aloja? |
| modelo de implementación | ¿cómo se organizan los componentes? |
| modelo de despliegue | ¿cómo se distribuyen los artefactos entre nodos? |

## Actividad A — Clasificación

Clasificar cada elemento:

```text
TrabajoPendiente.java
persistencia-local.jar
aplicacion-movil.apk
IRepositorioTrabajo
paquete sigo.persistencia
teléfono del operario
servidor de aplicaciones
servidor de base de datos
enlace móvil o LAN
```

## Actividad B — Trazabilidad

Completar una fila por cada elemento importante:

| Diseño | Código | Componente/artefacto | Subsistema | Nodo |
|---|---|---|---|---|
| `TrabajoPendiente` | | | | |
| `IRepositorioTrabajo` | | | | |
| `RepositorioArchivo` | | | | |
| `SincronizadorTrabajos` | | | | |

## Actividad C — Decisión de infraestructura

Problema: alojar el servicio central de SIGO.

Comparar:

- servidor propio;
- servidor, VPS o plataforma contratada.

Usar criterios, no preferencias aisladas:

```text
costo inicial y recurrente
control
disponibilidad
conectividad
capacidad del equipo
seguridad y responsabilidad operativa
escalabilidad
copias de seguridad y recuperación
requisitos legales o de ubicación de datos
```

La respuesta debe adoptar el formato:

```text
problema → alternativas → opción → criterios → consecuencias → riesgos → RNF
```

---

# 7. Mañana M2 — Archivos y excepciones propias

## Secuencia

1. archivo y persistencia fuera del proceso;
2. ruta mediante `Path`;
3. lectura/escritura mediante `Files`;
4. codificación UTF-8;
5. cierre automático de recursos;
6. `IOException` como checked;
7. excepción propia de dominio o persistencia;
8. `throw`, `throws`, `try`, `catch` y conservación de la causa;
9. validación al reconstruir objetos;
10. integración de la aplicación.

## Actividades

- predecir qué archivo genera `DemoDia12`;
- localizar dónde se crea cada excepción;
- marcar qué métodos declaran `throws`;
- explicar por qué el `catch` está en el borde de la aplicación;
- cambiar una línea válida por una corrupta y predecir el flujo;
- explicar por qué no debe ignorarse una `IOException`;
- distinguir sobrescritura y agregado al final.

## Evidencia mínima

```text
Path:
Files:
UTF-8:
try-with-resources:
IOException:
excepción propia:
throw:
throws:
causa original:
```

El código de apoyo está en `CODIGO/2026-08-19_ARCHIVOS-EXCEPCIONES-JAVA.md`.

---

# 8. Cierre de mañana — Del diseño a la ejecución

Explicar oralmente este recorrido:

```text
TrabajoPendiente (clase UML)
→ TrabajoPendiente.java (código fuente)
→ bytecode y componente de persistencia
→ aplicación-móvil.apk (artefacto)
→ teléfono del operario (nodo)
→ trabajos.txt (archivo local)
```

Luego responder:

1. ¿Una clase y un componente son lo mismo?
2. ¿Un `.jar` y un servidor son lo mismo?
3. ¿Dónde aparece la interfaz `IRepositorioTrabajo`?
4. ¿Qué cambia si el repositorio local usa SQLite en vez de archivo?
5. ¿Qué vista muestra ese cambio y cuál muestra el teléfono?

---

# 9. Tarde T1 — Enlace de datos

## Funciones generales de los protocolos

- encapsulado;
- segmentación y reensamblado;
- ordenamiento;
- control de conexión;
- control de flujo;
- direccionamiento;
- detección o control de errores;
- multiplexación.

## Protocolos a comparar

| Protocolo/tecnología | Contexto principal | Idea clave |
|---|---|---|
| HDLC | referencia general de capa 2 | estructura y control del enlace |
| PPP | enlace punto a punto | negociación del enlace y transporte de protocolos de red |
| Ethernet | LAN | trama, MAC y acceso al medio |

## Trama

La estructura general es:

```text
encabezado | datos encapsulados de capa 3 | tráiler/FCS
```

La práctica ampliada usa:

```text
preámbulo/SFD | MAC destino | MAC origen | tipo/longitud | datos | FCS
```

## LLC y MAC

```text
LLC → vincula la capa de red con la subcapa MAC
MAC → encapsula, direcciona, detecta errores y controla el acceso al medio
```

## Actividad

Construir un cuadro con:

- capa;
- PDU;
- dirección;
- equipo que decide;
- tabla consultada.

---

# 10. Tarde T2 — Switch, tabla MAC y STP

## Simulación de aprendizaje

Topología:

```text
puerto 1 — A: AA-AA-AA-AA-AA-AA
puerto 2 — B: BB-BB-BB-BB-BB-BB
puerto 3 — C: CC-CC-CC-CC-CC-CC
puerto 4 — otro switch
```

Procesar en orden:

1. A envía a B con tabla vacía;
2. B responde a A;
3. C envía a A;
4. A envía nuevamente a B.

Por cada trama registrar:

| Paso | MAC aprendida | Destino conocido | Acción | Puertos de salida |
|---|---|---|---|---|
| 1 | | | | |
| 2 | | | | |
| 3 | | | | |
| 4 | | | | |

Reglas centrales:

```text
aprender desde MAC origen
consultar MAC destino
destino conocido → reenviar por un puerto
destino desconocido/broadcast → inundar excepto por el puerto de entrada
mismo puerto de entrada y salida → filtrar
```

## STP

Explicar esta cadena:

```text
enlaces redundantes
→ ciclo lógico de capa 2
→ repetición de broadcast/unicast desconocido
→ tormenta, duplicados e inestabilidad de tabla MAC
→ STP deja una topología lógica sin bucles
→ conserva un camino redundante para una falla
```

## Comparación oral final

```text
switch → trama → MAC → tabla MAC → puerto
router → paquete → IP de destino → tabla de routing → siguiente salto/interfaz
```

No confundir la tabla MAC del switch con la caché ARP de un host/router ni con una tabla de enrutamiento.

---

# 11. Caso integrador

Resolver `CASOS/2026-08-19_CASO-INTEGRADOR-IMPLEMENTACION-ARCHIVOS-ETHERNET.md` sin mirar la guía de corrección.

Debe contener:

- un mapa de implementación;
- un mapa de despliegue;
- una decisión de infraestructura;
- un flujo de archivo y excepción;
- una simulación de switch;
- una explicación de STP;
- una comparación switch/router.

---

# 12. Evaluación

Usar `EVALUACIONES/2026-08-19_EVALUACION-DIA-12.md`.

```text
Parte A — Implementación y despliegue: 3 puntos
Parte B — Java y archivos:            3 puntos
Parte C — Enlace de datos:            3 puntos
Parte D — Integración oral:           1 punto
```

Umbral sugerido:

```text
6,0/10 y ninguna parte esencial en cero
```

La calificación solo se registra después de corregir respuestas reales.

---

# 13. Criterios de cierre

Para cerrar el día debe existir evidencia propia de:

- implementación frente a despliegue;
- componente, subsistema y nodo;
- trazabilidad UML→código→artefacto→nodo;
- decisión de infraestructura basada en criterios;
- lectura y escritura segura de archivos;
- excepción propia y flujo completo;
- HDLC, PPP y Ethernet diferenciados;
- trama, LLC y MAC;
- aprendizaje y reenvío del switch;
- función y necesidad de STP;
- switch frente a router.

No elevar como dominado un punto que solo fue leído o cuya respuesta fue copiada.

---

# 14. Archivos de trabajo

- `FICHAS/2026-08-19_FICHA-IMPLEMENTACION-DESPLIEGUE-INFRAESTRUCTURA.md`
- `DIAGRAMAS/2026-08-19_MAPA-UML-CODIGO-COMPONENTE-NODO.md`
- `FICHAS/2026-08-19_FICHA-ARCHIVOS-EXCEPCIONES-JAVA.md`
- `CODIGO/2026-08-19_ARCHIVOS-EXCEPCIONES-JAVA.md`
- `FICHAS/2026-08-19_FICHA-ENLACE-DATOS-ETHERNET.md`
- `FICHAS/2026-08-19_FICHA-SWITCH-TABLA-MAC-STP.md`
- `DIAGRAMAS/2026-08-19_FLUJO-SWITCH-MAC-STP.md`
- `CASOS/2026-08-19_CASO-INTEGRADOR-IMPLEMENTACION-ARCHIVOS-ETHERNET.md`
- `EVALUACIONES/2026-08-19_EVALUACION-DIA-12.md`
- `RESUMENES/2026-08-19_RESUMEN-GUIADO-DIA-12.md`
- `RESUMENES/2026-08-19_CIERRE-DIA-12.md`

---

# 15. Comando de inicio

```text
Comenzar Día 12
```
