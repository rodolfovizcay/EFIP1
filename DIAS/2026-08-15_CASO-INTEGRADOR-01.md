# Sábado 15/08/2026 — Caso integrador 1
## SIGO Móvil — Ejecución de Órdenes de Trabajo

**Duración:** 5 a 6 horas  
**Modalidad:** recuperación activa + resolución integral + evaluación semanal + defensa  
**Materias:** Análisis y Diseño + POO + Estructuras + Base de Datos + Comunicaciones

---

# 1. Objetivo de la jornada

Resolver un único caso conectando las cinco materias y demostrar que los conceptos no se estudian de manera aislada.

Al finalizar deben existir:

- problema y objetivos redactados;
- RF, RNF y reglas de negocio;
- actores, casos de uso y relaciones;
- realización de análisis;
- secuencia de diseño con alternativo sin conexión;
- diagrama de estados textual;
- diseño de clases Java;
- clase abstracta, interfaz y llamada polimórfica;
- elección de Pila y Cola;
- DER y cardinalidades;
- relaciones normalizadas hasta 3FN;
- arquitectura TCP/IP y recorrido de datos;
- cálculo breve de información, frecuencia y muestreo;
- evaluación semanal;
- defensa oral;
- resumen semanal por materia.

---

# 2. Regla previa

El Día 9 continúa en pausa. Esta jornada integra los contenidos aprendidos, pero no sustituye automáticamente:

- la evaluación escrita del Día 9;
- su defensa oral;
- su cierre documental canónico.

---

# 3. Cronograma operativo

## Recuperación inicial — 25 minutos

Responder sin apuntes el control de `TARJETAS/2026-08-15_RECUPERACION-PREVIA-CASO-INTEGRADOR-01.md`.

Puntos obligatorios:

```text
I(E)=log₂(1/P(E))
Pila=LIFO
Cola=FIFO
FIFO≠trazabilidad
f=1/T
fs mínima=2·fmax
línea doble=participación total
triángulo vacío hacia el padre
2FN=dependencia de clave completa
ID artificial≠normalización
```

### Umbral de entrada

- 10–12 correctas: comenzar el caso.
- 7–9 correctas: corregir tarjetas falladas y comenzar.
- 0–6 correctas: dedicar 20 minutos adicionales a recuperación antes del caso.

---

## Mañana — aproximadamente 3 horas

### Bloque M1 — Problema y requisitos — 45 minutos

1. Definir el problema.
2. Establecer alcance y exclusiones.
3. Redactar objetivo general y objetivos específicos.
4. Escribir RF, RNF y reglas de negocio.
5. Revisar que cada requisito sea completo y verificable.

### Bloque M2 — Casos de uso y modelos — 55 minutos

1. Identificar actores.
2. Nombrar casos de uso con verbo.
3. Determinar `include`, `extend` y generalización cuando corresponda.
4. Redactar el caso `Registrar ejecución de OT`.
5. Construir la realización de análisis:
   - interfaz;
   - control;
   - entidades;
   - flujo normal;
   - alternativo sin conexión.
6. Refinar al diseño:
   - servicio;
   - repositorios;
   - cola de sincronización;
   - sincronizador;
   - secuencia temporal.

### Bloque M3 — POO y Estructuras — 60 minutos

1. Diseñar las clases principales.
2. Incorporar encapsulamiento.
3. Utilizar una clase abstracta para canales de notificación.
4. Utilizar una interfaz para auditoría.
5. Explicar el polimorfismo.
6. Escribir un `toString()` correcto.
7. Elegir:
   - Pila para deshacer cambios locales;
   - Cola para solicitudes pendientes.
8. Diferenciar orden FIFO de trazabilidad.

### Cierre de mañana — 20 minutos

Explicar sin mirar:

```text
Requisito
→ caso de uso
→ análisis
→ diseño
→ código
→ estructura
```

---

## Tarde — aproximadamente 2 a 3 horas

### Bloque T1 — Datos — 60 minutos

1. Identificar entidades.
2. Establecer cardinalidades y participación.
3. Convertir el DER a relaciones.
4. Normalizar la relación inicial:
   - 1FN;
   - 2FN;
   - 3FN.
5. Marcar PK, FK y `UNIQUE`.
6. Justificar por qué `id_asignacion` no normaliza automáticamente.

### Bloque T2 — Comunicaciones — 45 minutos

1. Dibujar la arquitectura cliente-servidor.
2. Explicar el recorrido:
   - Aplicación;
   - Transporte/puerto;
   - IP;
   - trama/MAC;
   - bits/señales.
3. Diferenciar switch y router.
4. Explicar el comportamiento sin conexión.
5. Resolver:
   - cantidad de información;
   - frecuencia/período;
   - muestreo.
6. Declarar supuestos de transmisión.

### Bloque T3 — Evaluación y defensa — 60 minutos

1. Evaluación semanal de 100 puntos.
2. Defensa oral de 8–12 minutos.
3. Corrección.
4. Registrar errores reales.
5. Completar resumen semanal por materia.

---

# 4. Caso base

El caso completo está en:

```text
CASOS/2026-08-15_CASO-INTEGRADOR-01-SIGO-OT-MOVIL.md
```

No consultar una solución externa mientras se responde.

---

# 5. Productos de la jornada

- respuestas del caso;
- evaluación semanal;
- defensa registrada;
- resumen semanal por materia;
- cierre del caso integrador;
- actualización posterior de errores.

---

# 6. Criterios de calidad

## Requisitos

- no ambiguos;
- completos;
- verificables;
- rastreables;
- consistentes.

## Modelos

- actor fuera del sistema;
- objetivo exacto conservado;
- análisis conceptual;
- diseño próximo a implementación;
- decisiones tecnológicas declaradas como tales.

## Código

- constructor sin retorno;
- `String` comparado por contenido;
- validación que detiene la operación inválida;
- `@Override`;
- `toString()` con valores reales;
- polimorfismo demostrado mediante un tipo común.

## Datos

- valores atómicos;
- sin dependencias parciales indebidas;
- sin dependencias transitivas indebidas;
- claves y restricciones explícitas.

## Comunicaciones

- fórmulas y unidades;
- categorías no mezcladas;
- supuestos declarados;
- PDU y direccionamiento explicados por capa.

---

# 7. Criterio de finalización

La jornada no se considera terminada solo por completar el caso. Deben existir:

```text
resolución
+ evaluación
+ defensa
+ corrección
+ resumen semanal
```

Si se divide entre sábado y domingo, el estado queda `EN CURSO` hasta completar los cinco elementos.
