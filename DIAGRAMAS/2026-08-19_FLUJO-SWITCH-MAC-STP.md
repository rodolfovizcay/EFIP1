# Mapa — Flujo de un switch, tabla MAC y STP

**Fecha:** 19/08/2026

---

# 1. Decisión por trama

```mermaid
flowchart TD
    A["Llega una trama por puerto P"] --> B["Aprender o actualizar<br/>MAC origen → P"]
    B --> C{"¿Qué tipo de destino?"}
    C -->|"Broadcast"| F["Inundar por la VLAN<br/>excepto P"]
    C -->|"Unicast"| D{"¿MAC destino está<br/>en la tabla?"}
    D -->|"No"| F
    D -->|"Sí"| E{"¿Puerto de salida<br/>es P?"}
    E -->|"Sí"| G["Filtrar"]
    E -->|"No"| H["Reenviar solo por<br/>el puerto conocido"]
```

Orden que debe recordarse:

```text
primero aprender origen
después consultar destino
```

---

# 2. Simulación de tabla

```mermaid
sequenceDiagram
    participant A as A / P1 / MAC AA
    participant S as Switch
    participant B as B / P2 / MAC BB
    participant C as C / P3 / MAC CC

    A->>S: origen AA, destino BB
    Note over S: aprende AA→P1<br/>BB desconocida: inunda
    S-->>B: copia por P2
    S-->>C: copia por P3
    B->>S: origen BB, destino AA
    Note over S: aprende BB→P2<br/>AA conocida
    S-->>A: reenvía solo P1
    C->>S: origen CC, destino AA
    Note over S: aprende CC→P3<br/>AA conocida
    S-->>A: reenvía solo P1
```

Tabla final:

| MAC | Puerto |
|---|---|
| AA | P1 |
| BB | P2 |
| CC | P3 |

---

# 3. Problema del ciclo

```mermaid
flowchart LR
    S1["Switch 1"] --- S2["Switch 2"]
    S2 --- S3["Switch 3"]
    S3 --- S1
```

Los tres enlaces forman redundancia física y también un ciclo. Una trama inundada puede volver al punto de origen y generar copias sucesivas.

---

# 4. Resultado lógico de STP

```mermaid
flowchart LR
    S1["Switch raíz"] ---|"reenviando"| S2["Switch 2"]
    S2 ---|"reenviando"| S3["Switch 3"]
    S3 -.-|"camino redundante<br/>sin reenvío normal"| S1
```

Interpretación:

- el cable redundante continúa existiendo;
- la topología lógica activa no contiene un ciclo;
- ante un cambio, STP puede recalcular y habilitar el camino alternativo;
- la convergencia requiere tiempo y depende de la variante/configuración.

---

# 5. Comparación de decisiones

```mermaid
flowchart TB
    D["Destino de la comunicación"]
    D --> L2["Switch C2"]
    D --> L3["Router C3"]
    L2 --> M["MAC destino"]
    M --> TM["Tabla MAC"]
    TM --> P["Puerto"]
    L3 --> I["IP destino"]
    I --> TR["Tabla de routing"]
    TR --> N["Siguiente salto / interfaz"]
```

---

# 6. Consigna oral

Explicar el mapa completo sin usar las palabras “manda a todos” como única respuesta. Deben aparecer:

```text
origen
destino
aprendizaje
tabla
destino conocido/desconocido
inundación limitada
redundancia
bucle
STP
```
