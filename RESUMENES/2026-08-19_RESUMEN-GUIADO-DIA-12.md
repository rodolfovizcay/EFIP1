# Resumen guiado — Día 12

## Implementación + Archivos Java + Enlace de datos

**Fecha:** 19/08/2026
**Estado:** material de estudio preparado

---

# 1. Mapa de la jornada

```text
DISEÑO
clases + interfaces + responsabilidades
        ↓
IMPLEMENTACIÓN
archivos + paquetes + componentes + ejecutables
        ↓
DESPLIEGUE
artefactos instalados en nodos conectados
        ↓
EJECUCIÓN LOCAL
objetos ↔ archivo UTF-8
        ↓
COMUNICACIÓN
paquete IP dentro de trama Ethernet
        ↓
CONMUTACIÓN
MAC origen → aprendizaje
MAC destino → puerto
        ↓
REDUNDANCIA
STP evita ciclos lógicos de capa 2
```

---

# 2. Implementación frente a despliegue

## Implementación

Responde cómo se materializa y organiza el software.

```text
clase → archivo fuente
clases relacionadas → paquete/subsistema
paquetes → componente
componentes → construcción/artefacto ejecutable
```

Ejemplos: `.java`, `.jar`, `.apk`, paquetes, interfaces, bibliotecas y dependencias.

## Despliegue

Responde dónde se instalan y ejecutan los artefactos.

Ejemplos: teléfono, servidor de aplicaciones, servidor de base de datos y conexiones.

Regla:

```text
.apk = artefacto
teléfono = nodo
.jar = componente/artefacto
servidor = nodo
```

---

# 3. Elementos

| Elemento | Definición mínima |
|---|---|
| componente | pieza física/reemplazable de software |
| subsistema | agrupación coherente y manejable de componentes/interfaces |
| interfaz | contrato de operaciones ofrecidas o requeridas |
| artefacto | archivo concreto producido o desplegado |
| nodo | recurso físico de cómputo en ejecución |
| construcción | versión ejecutable e integrada |

---

# 4. Decisión de infraestructura

No elegir por moda. Comparar:

```text
propio ↔ contratado
```

Criterios:

- disponibilidad;
- costo inicial y recurrente;
- capacidad operativa;
- control;
- seguridad y cumplimiento;
- conectividad;
- escalabilidad;
- respaldo y recuperación;
- tiempo de puesta en marcha;
- dependencia y plan de salida.

Formato de defensa:

```text
problema
→ alternativas
→ opción
→ criterios
→ consecuencias seguras
→ riesgos posibles
→ mitigaciones
→ RNF y artefactos afectados
```

---

# 5. Archivos Java

## Flujo

```text
Path representa la ruta
Files abre/crea/consulta
BufferedWriter escribe
BufferedReader lee
UTF-8 fija la codificación
try-with-resources cierra
```

## Lectura

```java
try (BufferedReader lector = Files.newBufferedReader(
        archivo, StandardCharsets.UTF_8)) {
    String linea;
    while ((linea = lector.readLine()) != null) {
        // convertir y validar
    }
}
```

## Reglas

- validar también lo que viene del archivo;
- no silenciar excepciones;
- conservar la causa al traducir;
- distinguir sobrescribir de agregar;
- no mezclar dominio, persistencia y menú;
- usar rutas compuestas en lugar de separadores fijos de Windows/Linux.

---

# 6. Excepciones

```text
throw  = lanza una instancia ahora
throws = declara posible propagación
checked = capturar o declarar
unchecked = sin obligación del compilador
```

Traducción correcta:

```java
catch (IOException e) {
    throw new PersistenciaException("No se pudo leer", e);
}
```

La excepción propia expresa el problema en el nivel del repositorio y la causa conserva el diagnóstico técnico.

---

# 7. Capa de enlace

```text
capa 3 → paquete / IP
capa 2 → trama / MAC
capa 1 → bits como señales
```

Trama general:

```text
encabezado | datos de capa 3 | tráiler/FCS
```

FCS detecta alteraciones; no equivale a corregirlas.

---

# 8. HDLC, PPP y Ethernet

| Elemento | Frase de defensa |
|---|---|
| HDLC | protocolo/modelo importante de control de enlace |
| PPP | enlace punto a punto; LCP y autenticación opcional |
| Ethernet | LAN, trama y MAC; familia IEEE 802.3 |

---

# 9. LLC y MAC

```text
LLC → relación lógica entre capa de red y MAC
MAC → entramado, dirección física, FCS y acceso al medio
```

MAC está junto a la capa física, pero la capa física solo transmite señales que representan bits.

---

# 10. Switch

Algoritmo:

```text
entra una trama por P
→ aprender MAC origen→P
→ consultar MAC destino
→ conocida en otro puerto: reenviar solo allí
→ conocida en P: filtrar
→ desconocida: inundar excepto P
→ broadcast: inundar excepto P
```

Tabla:

```text
MAC → puerto
```

No confundir:

```text
tabla MAC: MAC → puerto
ARP: IPv4 local → MAC
routing: red IP → siguiente salto/interfaz
```

---

# 11. STP

Problema:

```text
redundancia sin control
→ ciclo L2
→ tramas sin TTL circulan/copias
→ tormenta + duplicados + flapping + saturación
```

Solución conceptual:

```text
STP conserva enlaces físicos redundantes
pero construye una topología lógica sin bucles
y recalcula ante cambios
```

STP no es un protocolo de enrutamiento y no elimina físicamente el enlace alternativo.

---

# 12. Switch frente a router

```text
switch
trama → MAC destino → tabla MAC → puerto
```

```text
router
paquete → IP destino → tabla de rutas → siguiente salto/interfaz
```

El router desencapsula el paquete de la trama recibida y lo vuelve a encapsular para el enlace de salida.

---

# 13. Defensa integrada de 90 segundos

> El diseño define `TrabajoPendiente` e `IRepositorioTrabajo`. En implementación, esas clases e interfaces se codifican, se agrupan en componentes y forman el artefacto móvil. En despliegue, el artefacto se instala en el teléfono. El repositorio guarda trabajos en un archivo UTF-8, cierra recursos automáticamente y traduce una `IOException` a una excepción propia sin perder la causa. Para comunicarse, el paquete IP se encapsula en una trama Ethernet. El switch aprende la MAC origen y decide con la MAC destino y su tabla de puertos. El router usa IP y rutas para pasar a otra red. Si hay enlaces redundantes entre switches, STP evita un ciclo lógico de capa 2.

---

# 14. Autoevaluación rápida

Responder sin mirar:

1. ¿Componente y nodo?
2. ¿Implementación y despliegue?
3. ¿`Path` y `Files`?
4. ¿`throw` y `throws`?
5. ¿Por qué conservar la causa?
6. ¿HDLC, PPP y Ethernet?
7. ¿LLC y MAC?
8. ¿De qué MAC aprende el switch?
9. ¿Qué hace con destino desconocido?
10. ¿Por qué hace falta STP?
11. ¿Tabla MAC, ARP y routing?
12. ¿Switch y router?

Si una respuesta necesita la ficha, todavía está en adquisición y requiere una repetición oral posterior.
