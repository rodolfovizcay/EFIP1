# Manifiesto — Preparación del Día 8

**Fecha preparada:** 13/08/2026  
**Jornada:** Modelo de análisis + Colas + Transmisión  
**Estado:** material listo para iniciar; jornada todavía no evaluada

---

## Archivos incluidos

1. `03-ESTADO-ACTUAL-PREPARADO-DIA-08.md`
2. `DIAS/2026-08-13_DIA-08_MODELO-ANALISIS-COLAS-TRANSMISION.md`
3. `RESUMENES/2026-08-13_RESUMEN-GUIADO-DIA-08.md`
4. `FICHAS/2026-08-13_MAPA-MODELO-ANALISIS.md`
5. `FICHAS/2026-08-13_FICHA-COLA.md`
6. `FICHAS/2026-08-13_CUADRO-TRANSMISION.md`
7. `CASOS/2026-08-13_CASO-INTEGRADOR-ANALISIS-COLA-TRANSMISION.md`
8. `EVALUACIONES/2026-08-13_EVALUACION-DIA-08.md`
9. `EVALUACIONES/2026-08-13_RESPUESTAS-DIA-08.md`
10. `RESUMENES/2026-08-13_CIERRE-DIA-08.md`
11. `99-MANIFIESTO-PREPARACION-DIA-08.md`

---

## Plan maestro respetado

### Mañana M1 — Análisis y Diseño

- propósito del análisis;
- clases de interfaz, control y entidad;
- realizaciones de casos de uso;
- colaboración entre objetos.

### Mañana M2 — Estructuras

- cola;
- FIFO;
- frente y final;
- implementación con vector y lista.

### Cierre de mañana

- comparación Pila/Cola.

### Tarde T1 — Comunicaciones

- medida de información;
- señales;
- muestreo;
- transmisión serie/paralela;
- transmisión síncrona/asíncrona.

### Tarde T2

- preguntas;
- mapa conceptual;
- resumen.

### Productos

- mapa del modelo de análisis;
- ficha de cola;
- cuadro de transmisión.

---

## Fuentes declaradas

- `02-PLAN-MAESTRO-HASTA-03-09.md`.
- `Analisis_y_Diseno_de_Software.md`.
- `Taller_de_Algoritmos_y_Estructuras_de_Datos_I.md`.
- `COMUNICACIONES.md`.
- `03-ESTADO-ACTUAL.md` al cierre del Día 7.
- evaluación, resultados y errores reales del Día 7.

---

## Contenido derivado de los materiales

### Modelo de análisis

- refinamiento y estructuración de requisitos;
- vista interna conceptual;
- clases y paquetes;
- artefactos del análisis;
- clases de interfaz, entidad y control;
- responsabilidades en lugar de métodos definitivos;
- realización de caso de uso–análisis;
- colaboración, mensajes y enlaces;
- preferencia del material por colaboración durante análisis.

### Colas

- Cola como TDA lineal restrictivo;
- FIFO;
- frente y final;
- `longitud`, `esVacia`, `encolar`, `desencolar` y `cabecera`;
- cola enlazada con cabecera/final;
- cola con vector e índices;
- comparación de implementaciones;
- comparación Pila/Cola.

### Transmisión

- información como medida técnica de incertidumbre;
- `I(E)=log2(1/P(E))`;
- entropía en bits/símbolo;
- tasa `R=m·H` en bits/s;
- señales analógicas/digitales;
- amplitud, período y frecuencia;
- `f=1/T`;
- muestreo mínimo `fs≥2·fmax` según el material;
- serie/paralela;
- asíncrona con start/stop;
- síncrona con cabecera/terminación de bloque.

---

## Recuperaciones incorporadas

- `E-036` — generalización UML.
- `E-037` — instancia.
- `E-038` — rectángulo doble/línea doble.
- `E-039` — asociativa frente a débil.
- `E-032` — completo frente a verificable.
- `toString()` heredado de `Object`.
- N:M conceptual frente a tabla asociativa.
- riesgo de vector frente a lista enlazada.

La recuperación se basa en los errores reales de la entrega y el cierre del Día 7; no se agregan errores inventados.

---

## Decisiones de alcance

- Se mantiene el foco exacto del plan del 13/08.
- El modelo de análisis se presenta como vista interna conceptual, no como diseño tecnológico.
- Las responsabilidades no se transforman automáticamente en métodos Java.
- Las clases de interfaz/control/entidad no se equiparan automáticamente a pantalla/controlador/tabla definitivos.
- El diagrama de colaboración se estudia antes que la secuencia detallada de diseño.
- La cola circular y las colas de prioridad se mencionan solo como extensiones, no como bloque central.
- Los cálculos de información y muestreo se limitan al alcance de los materiales.
- No se adelantan ruido, medios, Ethernet, WAN o conmutación como bloques completos.
- El caso de sincronización de OT es una adaptación didáctica para conectar las tres materias.
- Las respuestas y el cierre permanecen sin notas ni evidencia inventada.

---

## Validación documental

- [x] Estado preparado separado del estado canónico.
- [x] Guía operativa.
- [x] Resumen guiado.
- [x] Mapa del modelo de análisis.
- [x] Ficha de Cola.
- [x] Cuadro de transmisión.
- [x] Caso integrador.
- [x] Evaluación escrita y oral.
- [x] Plantilla de respuestas.
- [x] Plantilla de cierre.
- [x] Recuperaciones reales del Día 7.
- [x] Fuentes declaradas.
- [x] Alcance de jornadas posteriores preservado.

---

## Regla de publicación

Este paquete **prepara** la jornada. No modifica:

- `03-ESTADO-ACTUAL.md`;
- `04-MATRIZ-DE-PROGRESO.md`;
- `05-REGISTRO-DIARIO.md`;
- `06-ERRORES-Y-RECUPERACIONES.md`;
- `99-MANIFIESTO-CIERRE.md`.

Esos archivos deben actualizarse únicamente después de completar la jornada, evaluar, corregir y cerrar el Día 8.

Después de la jornada deberán incorporarse:

- respuestas reales;
- resultados;
- matriz específica;
- errores y recuperaciones;
- cierre;
- estado acumulado;
- actualización canónica.

---

## Evaluación preparada

```text
Modelo de análisis:        2,5 puntos
Colas:                     2,5 puntos
Transmisión:               2,5 puntos
Integración/recuperación:  0,5 puntos
────────────────────────────────────
Escrito:                   8,0 puntos
Defensa oral:              2,0 puntos
Total:                    10,0 puntos
```

La evaluación agrega una estructura de medición coherente con las jornadas anteriores del repositorio. El plan maestro exige preguntas, mapa y resumen, pero no prescribe esa distribución numérica.

---

## Comando de inicio

> **Iniciar EFIP — 2026-08-13 — Día 8**
