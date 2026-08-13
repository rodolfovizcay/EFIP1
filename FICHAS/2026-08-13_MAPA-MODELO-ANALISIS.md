# Mapa del modelo de análisis — Día 8

**Fecha:** 13/08/2026  
**Materia:** Análisis y Diseño de Software  
**Producto del plan:** mapa del modelo de análisis

---

# 1. Mapa central

```text
REQUISITOS
   │
   │ se refinan y estructuran
   ▼
MODELO DE ANÁLISIS
   │
   ├── proporciona una vista interna conceptual
   ├── usa lenguaje del desarrollador
   ├── organiza clases y paquetes
   ├── elimina redundancias/inconsistencias
   ├── esboza cómo realizar la funcionalidad
   └── sirve como entrada para diseño e implementación
```

---

# 2. Vista externa vs. interna

```text
MODELO DE CASOS DE USO
Vista externa

Actor
  ↓
Caso de uso
  ↓
Resultado de valor
```

```text
MODELO DE ANÁLISIS
Vista interna conceptual

Objeto de interfaz
      ↓
Objeto de control
      ↓
Objetos de entidad
```

| Casos de uso | Análisis |
|---|---|
| Qué necesita el actor | Cómo colaboran objetos conceptuales |
| Vista externa | Vista interna |
| Actor/caso/relaciones | Clases/objetos/colaboraciones/paquetes |
| Lenguaje cercano al usuario | Lenguaje del desarrollador |

---

# 3. Artefactos

```text
MODELO DE ANÁLISIS
│
├── Clase de análisis
│   ├── <<interfaz>>
│   ├── <<control>>
│   └── <<entidad>>
│
├── Realización de caso de uso–análisis
│   └── colaboración entre objetos
│
├── Paquete de análisis
│   └── organiza artefactos
│
└── Vista de arquitectura
    └── muestra elementos significativos
```

## Definiciones

```text
Clase de análisis
→ abstracción conceptual de clases/subsistemas posteriores.

Realización de caso de uso–análisis
→ colaboración que explica cómo se lleva a cabo un caso.

Paquete de análisis
→ agrupación manejable de clases y realizaciones.

Vista de arquitectura
→ selección de artefactos relevantes para la arquitectura.
```

---

# 4. Estereotipos de clases

## 4.1 `<<interfaz>>`

```text
Actor ↔ Sistema
```

Responsabilidades:

- recibir solicitudes;
- solicitar datos;
- presentar información;
- solicitar selección;
- solicitar confirmación;
- aislar cambios de interacción.

Ejemplos conceptuales:

```text
FormularioCrearOT
AppRegistrarEjecucion
APIRecepcionOT
SensorMedicion
```

## 4.2 `<<control>>`

```text
Coordina el flujo del caso de uso
```

Responsabilidades:

- seguir el flujo de eventos;
- validar datos o existencia;
- coordinar interfaz y entidades;
- controlar transacciones conceptuales;
- realizar cálculos no propios de una entidad.

Ejemplos:

```text
ControlCrearOT
ControlRegistrarEjecucion
ControlSincronizarSolicitudes
```

## 4.3 `<<entidad>>`

```text
Información de larga vida / dominio
```

Responsabilidades:

- conocer datos propios;
- conocer relaciones;
- calcular valores derivados;
- ejecutar comportamiento propio del concepto.

Ejemplos:

```text
OrdenTrabajo
Sector
Operario
EjecucionOT
SolicitudSincronizacion
```

---

# 5. Fórmula de memoria

```text
INTERFAZ
→ habla con el actor.

CONTROL
→ coordina el caso.

ENTIDAD
→ representa y conoce el dominio.
```

---

# 6. Niveles de abstracción

```text
ANÁLISIS
→ responsabilidades conceptuales.

DISEÑO
→ operaciones y decisiones tecnológicas.

IMPLEMENTACIÓN
→ métodos y código.
```

Ejemplo:

```text
Análisis:
ControlCrearOT — responsabilidad: coordinar creación válida.

Implementación futura:
crearOT(datos): OrdenTrabajo
```

No adelantar la signatura definitiva durante análisis.

---

# 7. Realización de caso de uso–análisis

```text
CASO DE USO
   │
   │ se analiza
   ▼
REALIZACIÓN DE CASO DE USO–ANÁLISIS
   │
   ├── descripción textual
   ├── clases participantes
   └── interacción/colaboración
```

Objetivos:

1. identificar clases necesarias;
2. distribuir comportamiento;
3. capturar requisitos especiales;
4. establecer responsabilidades y relaciones.

---

# 8. Colaboración

```text
Actor
  │ mensaje inicial
  ▼
Objeto de interfaz
  │ delega/coordinación
  ▼
Objeto de control
  │ consulta/modifica
  ▼
Objetos de entidad
```

Conceptos:

```text
Interacción
→ conjunto de mensajes para cumplir un propósito.

Mensaje
→ comunicación que desencadena una responsabilidad.

Enlace
→ conexión semántica entre objetos.
```

---

# 9. Ejemplo — Crear Orden de Trabajo

## Objetos

```text
:FormularioCrearOT  <<interfaz>>
:ControlCrearOT     <<control>>
:Sector             <<entidad>>
:OrdenTrabajo       <<entidad>>
```

## Mensajes conceptuales

```text
1. Encargado → FormularioCrearOT
   solicitar creación

2. FormularioCrearOT → ControlCrearOT
   entregar datos

3. ControlCrearOT → Sector
   verificar sector válido

4. ControlCrearOT → OrdenTrabajo
   crear OT PENDIENTE

5. ControlCrearOT → FormularioCrearOT
   informar número y resultado
```

## Distribución

| Objeto | Responsabilidad |
|---|---|
| FormularioCrearOT | Recibir/presentar información |
| ControlCrearOT | Coordinar y validar el flujo |
| Sector | Informar validez/existencia conceptual |
| OrdenTrabajo | Representar la nueva OT y sus reglas |

---

# 10. Pautas del diagrama de colaboración

- comenzar por el flujo normal;
- el actor invoca un objeto de interfaz;
- cada clase identificada debe tener al menos un objeto participante;
- si una clase no participa, revisar su necesidad;
- los mensajes expresan responsabilidades, no métodos finales;
- priorizar enlaces y distribución de comportamiento;
- agregar después los flujos alternativos;
- no buscar todavía la secuencia cronológica detallada propia del diseño.

---

# 11. Control de errores

| Error | Corrección |
|---|---|
| Caso de uso = clase | El caso se realiza mediante colaboración |
| Interfaz guarda toda la lógica | La interfaz recibe/presenta |
| Control almacena información persistente | La entidad representa información duradera |
| Entidad conoce botones/pantallas | La entidad pertenece al dominio |
| Mensaje = método Java definitivo | En análisis expresa propósito/responsabilidad |
| Clase de análisis = tabla exacta | La trazabilidad no implica equivalencia automática |
| Secuencia detallada como objetivo principal | En análisis se priorizan responsabilidades/enlaces |

---

# 12. Lista de control

- [ ] Puedo explicar el propósito del análisis.
- [ ] Puedo diferenciar vista externa e interna.
- [ ] Puedo nombrar cinco artefactos.
- [ ] Puedo reconocer interfaz, control y entidad.
- [ ] Puedo asignar responsabilidades.
- [ ] Puedo definir realización de caso de uso–análisis.
- [ ] Puedo explicar interacción, mensaje y enlace.
- [ ] Puedo construir una colaboración textual.
- [ ] Evito escribir métodos definitivos en análisis.
- [ ] Evito equiparar clase de análisis, clase Java y tabla.

---

# 13. Respuesta oral compacta

> El modelo de análisis refina y estructura los requisitos y ofrece una vista interna conceptual del sistema. Está organizado mediante clases y paquetes. Las clases de interfaz modelan la interacción con los actores, las de entidad representan información duradera del dominio y las de control coordinan el flujo de los casos de uso. Una realización de caso de uso–análisis es una colaboración que muestra cómo esos objetos interactúan y distribuyen responsabilidades para ejecutar un caso concreto.
