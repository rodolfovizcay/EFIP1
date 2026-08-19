# Ficha — Implementación, despliegue e infraestructura

**Fecha:** 19/08/2026
**Materia:** Análisis y Diseño de Software
**Estado:** material preparado

---

# 1. Idea central

El diseño define responsabilidades y colaboraciones. La implementación las materializa en piezas físicas de software. El despliegue coloca los artefactos ejecutables en recursos físicos.

```text
diseño      → qué responsabilidades y contratos existen
implementación → en qué componentes se materializan
despliegue  → en qué nodos se instalan y ejecutan
```

---

# 2. Modelo de implementación

El modelo de implementación describe:

- cómo los elementos de diseño se implementan mediante componentes;
- cómo se organizan esos componentes usando los mecanismos del lenguaje y del entorno;
- qué subsistemas, interfaces y dependencias existen;
- qué componentes son relevantes para la arquitectura;
- cómo se integran en una construcción ejecutable.

Ejemplos de mecanismos concretos:

| Mecanismo | Ejemplo |
|---|---|
| archivo fuente | `TrabajoPendiente.java` |
| paquete Java | `sigo.persistencia` |
| biblioteca | `persistencia-local.jar` |
| ejecutable/entregable | `aplicacion-movil.apk` |
| archivo de configuración | `application.properties` |
| script/esquema físico | `schema.sql` |

No conviene crear un componente por cada clase sin necesidad: el modelo debe mostrar piezas significativas y manejables.

---

# 3. Elementos principales

## 3.1 Componente

Una pieza física y reemplazable del sistema en la plataforma de implementación. Empaqueta o materializa elementos lógicos, como clases y colaboraciones.

Puede:

- ofrecer interfaces;
- requerir interfaces;
- depender de otros componentes;
- implementar varias clases;
- aparecer como fuente, biblioteca, ejecutable, tabla o documento.

## 3.2 Subsistema de implementación

Agrupación de elementos del modelo en una parte manejable. Puede contener:

- componentes;
- interfaces;
- otros subsistemas.

Se manifiesta mediante el mecanismo del entorno, por ejemplo un paquete Java. Tiene una finalidad coherente; no es una carpeta arbitraria.

## 3.3 Interfaz

Contrato que especifica operaciones ofrecidas o requeridas sin acoplar al consumidor con una implementación concreta.

```java
interface IRepositorioTrabajo {
    void guardar(TrabajoPendiente trabajo) throws PersistenciaException;
}
```

La misma idea contractual del diseño puede conservarse en la implementación.

## 3.4 Artefacto

Archivo concreto producido, utilizado o desplegado: código fuente, `.class`, `.jar`, `.apk`, configuración, script o documento.

## 3.5 Construcción

Versión ejecutable e integrada que agrega o refina una porción manejable de funcionalidad. Debe probarse y conservarse bajo control de versiones.

---

# 4. Modelo de despliegue

Describe la distribución física de la funcionalidad entre nodos de cómputo. Permite mostrar:

- nodos;
- conexiones entre nodos;
- artefactos alojados en cada nodo;
- protocolos o características relevantes de las conexiones;
- configuraciones alternativas de producción, prueba o simulación.

## Nodo

Recurso físico que existe en tiempo de ejecución, normalmente con memoria y capacidad de procesamiento.

Ejemplos:

- teléfono del operario;
- servidor de aplicaciones;
- servidor de base de datos;
- equipo de respaldo;
- dispositivo de red cuando resulta arquitectónicamente relevante.

Un nodo no es un `.jar`. El nodo aloja artefactos; el artefacto es software.

---

# 5. Diagrama de componentes frente a diagrama de despliegue

| Pregunta | Componentes | Despliegue |
|---|---|---|
| ¿Qué muestra? | piezas de software, interfaces y dependencias | nodos, conexiones y artefactos alojados |
| Vista principal | implementación estática | distribución física |
| Ejemplos | `.jar`, `.apk`, paquetes, interfaces | teléfono, servidor, red |
| Relación típica | usa, depende, realiza | alojado/desplegado en, conexión |
| Error común | confundir clase con componente | clasificar un archivo como nodo |

Regla rápida:

```text
¿Qué pieza de software es? → implementación
¿Dónde se instala o ejecuta? → despliegue
```

---

# 6. Trazabilidad completa

| Nivel | Ejemplo SIGO | Verificación |
|---|---|---|
| requisito/caso | registrar trabajo sin conexión | existe flujo alternativo sin red |
| diseño | `TrabajoPendiente`, `IRepositorioTrabajo` | responsabilidades y contrato claros |
| implementación | paquete `sigo.persistencia` | organiza las clases concretas |
| componente | `persistencia-local.jar` | realiza la interfaz |
| artefacto entregable | `aplicacion-movil.apk` | incluye los componentes requeridos |
| despliegue | teléfono del operario | aloja el artefacto y archivo local |

La traza permite responder qué requisito implementa cada pieza y dónde se ejecuta.

---

# 7. Ejemplo de organización

```text
sigo/
├── dominio/
│   └── TrabajoPendiente.java
├── aplicacion/
│   └── AgendaTrabajos.java
├── persistencia/
│   ├── IRepositorioTrabajo.java
│   └── RepositorioArchivo.java
├── sincronizacion/
│   └── SincronizadorTrabajos.java
└── presentacion/
    └── MenuAgenda.java
```

Una posible correspondencia:

```text
dominio + aplicación + persistencia + sincronización + presentación
→ aplicacion-movil.apk
→ teléfono del operario
```

El backend y la base se representarían con artefactos y nodos diferentes.

---

# 8. Decisión de infraestructura

## Problema

Elegir dónde alojar el backend y la persistencia central de SIGO.

## Alternativa A — Servidor propio

Ventajas posibles:

- control directo del hardware y la configuración;
- posibilidad de conservar datos dentro de la organización;
- integración cercana con infraestructura existente;
- costos recurrentes previsibles cuando ya existe capacidad.

Costos y riesgos:

- inversión inicial;
- energía, espacio, climatización y reemplazos;
- mantenimiento, parches, monitoreo y copias a cargo del equipo;
- dependencia de conectividad y energía locales;
- capacidad de recuperación ante desastre que debe diseñarse.

## Alternativa B — Servidor o plataforma contratada

Ventajas posibles:

- menor inversión inicial;
- aprovisionamiento y escalado más rápidos;
- servicios de disponibilidad, respaldo y monitoreo según contrato;
- acceso desde múltiples ubicaciones.

Costos y riesgos:

- costo recurrente y posible variación por consumo;
- dependencia del proveedor y de internet;
- menor control sobre algunas capas;
- necesidad de revisar ubicación de datos, contrato, salida y recuperación;
- configuración insegura si se delega la responsabilidad sin gobernanza.

## No existe una respuesta universal

La elección depende de los requisitos y capacidades del contexto. “La nube es mejor” o “lo propio es más seguro” no son justificaciones suficientes.

---

# 9. Matriz de decisión sugerida

Calificar cada opción de 1 a 5 y justificar cada valor.

| Criterio | Peso | Propio | Contratado |
|---|---:|---:|---:|
| disponibilidad requerida | 5 | | |
| capacidad operativa interna | 5 | | |
| seguridad/cumplimiento | 5 | | |
| recuperación y copias | 4 | | |
| conectividad | 4 | | |
| escalabilidad | 3 | | |
| costo inicial | 3 | | |
| costo recurrente | 3 | | |
| tiempo de puesta en marcha | 2 | | |
| portabilidad/salida | 2 | | |

La puntuación ayuda a comparar; no reemplaza la argumentación ni elimina riesgos.

---

# 10. Plantilla de decisión arquitectónica

```text
Título:
Estado:
Contexto/problema:
RNF relacionados:

Alternativa 1:
Alternativa 2:
Alternativa 3, si corresponde:

Opción elegida:
Criterios y justificación:
Consecuencias positivas:
Consecuencias negativas seguras/costos:
Riesgos posibles:
Mitigaciones:
Artefactos afectados:
Fecha de revisión:
```

## Diferencias

- **RNF:** condición de calidad o restricción que debe satisfacerse.
- **Consecuencia:** efecto derivado de adoptar la decisión.
- **Costo:** efecto negativo esperado o seguro.
- **Riesgo:** evento incierto que podría ocurrir.
- **Mitigación:** acción que reduce probabilidad o impacto.

---

# 11. Errores frecuentes

1. Poner “servidor” en la vista de implementación sin aclarar que es un nodo.
2. Poner `.apk` en la vista de despliegue como si fuera hardware; en despliegue aparece como artefacto alojado.
3. Crear un componente por clase y perder la visión arquitectónica.
4. Llamar subsistema a cualquier carpeta sin responsabilidad coherente.
5. Elegir tecnología antes de definir el problema y los RNF.
6. Presentar solo la alternativa elegida y ocultar “mantener lo actual”.
7. Confundir una consecuencia segura con un riesgo posible.

---

# 12. Preguntas de defensa oral

1. ¿Por qué `TrabajoPendiente` no es necesariamente un componente?
2. ¿Qué relación existe entre una interfaz de diseño y una interfaz Java?
3. ¿En qué vista ubicarías `persistencia-local.jar` y en cuál el teléfono?
4. ¿Qué cambia en implementación si se reemplaza archivo por SQLite?
5. ¿Qué cambia en despliegue si el backend pasa de un servidor propio a uno contratado?
6. ¿Qué RNF usarías para justificar esa decisión?
7. ¿Qué riesgo no debe confundirse con el costo recurrente?

---

# 13. Fuente y alcance

Definiciones de modelo de implementación, componente, subsistema, interfaz, modelo de despliegue, nodo y diagramas: material de `Analisis_y_Diseno_de_Software.md`, módulo de implementación y despliegue.
Comparación de infraestructura y matriz ponderada: ampliación complementaria prevista por el plan maestro.
