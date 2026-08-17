# Manifiesto — Preparación Día 10
## 17/08/2026 — Arquitectura + Lista simple + Nivel físico

**Estado:** PREPARADO — NO INICIADO  
**Rama:** `agent/preparacion-dia-10-2026-08-17`

---

# 1. Objetivo

Preparar la primera jornada de la Semana intensiva 2 conforme al plan maestro, utilizando:

- programa y materiales de Análisis y Diseño;
- material de Estructuras de Datos;
- material de Comunicaciones;
- estado canónico posterior al cierre del Día 9;
- errores y recuperaciones vigentes.

---

# 2. Alcance académico

## Análisis y Diseño

```text
arquitectura
organización del sistema
elementos estructurales
interfaces
colaboraciones
subsistemas
estilo arquitectónico
vistas
documentación
alta cohesión
bajo acoplamiento
```

## Estructuras

```text
lista simplemente enlazada
nodo
cabeza
inserción
búsqueda
modificación
eliminación
recorrido
arreglo vs. lista
Java
```

## Comunicaciones

```text
capa física
medios guiados y no guiados
atenuación
ruido
interferencia
dispersión
latencia
interfaces físicas
módem
repetidor
última milla
```

---

# 3. Recuperaciones priorizadas

```text
E-002 — asociación/agregación/composición/dependencia
E-016 — Java completo
E-039 — asociativa frente a débil
E-045 — digitalización y supuestos
E-049 — conectividad frente a sincronía
E-050 — modelo final completo
```

También se recuperan:

```text
entidad frente a subsistema
alta cohesión/bajo acoplamiento
String y toString()
inserción al inicio
Física=bits/señales
```

---

# 4. Archivos incorporados

1. `03-ESTADO-ACTUAL-PREPARADO-DIA-10.md`
2. `DIAS/2026-08-17_DIA-10_ARQUITECTURA-LISTAS-NIVEL-FISICO.md`
3. `TARJETAS/2026-08-17_RECUPERACION-INICIAL-DIA-10.md`
4. `FICHAS/2026-08-17_FICHA-ARQUITECTURA.md`
5. `FICHAS/2026-08-17_FICHA-LISTA-SIMPLE.md`
6. `CODIGO/2026-08-17_LISTA-SIMPLE-JAVA.md`
7. `FICHAS/2026-08-17_CUADRO-NIVEL-FISICO.md`
8. `CASOS/2026-08-17_CASO-INTEGRADOR-ARQUITECTURA-LISTA-MEDIO.md`
9. `EVALUACIONES/2026-08-17_EVALUACION-DIA-10.md`
10. `EVALUACIONES/2026-08-17_RESPUESTAS-DIA-10.md`
11. `RESUMENES/2026-08-17_RESUMEN-GUIADO-DIA-10.md`
12. `RESUMENES/2026-08-17_CIERRE-DIA-10.md`
13. `99-MANIFIESTO-PREPARACION-DIA-10.md`

---

# 5. Fuentes utilizadas

```text
02-PLAN-MAESTRO-HASTA-03-09.md
Analisis_y_Diseno_de_Software.md
Taller_de_Algoritmos_y_Estructuras_de_Datos_I.md
COMUNICACIONES.md
03-ESTADO-ACTUAL.md
06-ERRORES-Y-RECUPERACIONES.md
RESUMENES/2026-08-16_REPASO-SEMANAL-PUNTOS-DEBILES.md
```

---

# 6. Decisiones de contenido

1. La arquitectura se presenta como decisiones significativas, no como una lista de tecnologías.
2. Las vistas `4+1` se incluyen como complemento didáctico estándar porque los nombres se encuentran principalmente en una figura del material fuente.
3. Se conserva la terminología del material para subsistemas, interfaces, cohesión y acoplamiento.
4. La Lista simple se trabaja mediante las operaciones del material: insertar, eliminar, buscar y modificar.
5. El ejemplo Java corrige errores ya observados: validación, `String`, `toString()`, `@Override` y tipos públicos.
6. El nivel físico se centra en medios, perturbaciones, dispositivos y última milla.
7. No se inventan prestaciones numéricas de medios que el caso no proporciona.
8. Las decisiones de medios deben declararse como recomendaciones condicionadas.

---

# 7. Integridad documental

No se modifican como cierre:

```text
03-ESTADO-ACTUAL.md
04-MATRIZ-DE-PROGRESO.md
05-REGISTRO-DIARIO.md
06-ERRORES-Y-RECUPERACIONES.md
99-MANIFIESTO-CIERRE.md
```

No se asigna:

```text
nota
estado de aprobación
errores consolidados
productos completados
```

La preparación debe fusionarse como material previo, no como cierre académico.

---

# 8. Evaluación preparada

```text
Arquitectura:       2,5
Lista simple:       2,5
Nivel físico:       2,5
Integración:        0,5
Escrito:            8,0
Defensa:            2,0
Total:             10,0
```

La evaluación se condensa en diez consignas para evitar repeticiones.

---

# 9. Criterio de inicio

Comando:

```text
Iniciar EFIP — 2026-08-17 — Día 10
```

Secuencia:

```text
recuperación
→ arquitectura
→ lista simple
→ nivel físico
→ integración
→ evaluación
→ cierre
```

---

# 10. Estado final de esta preparación

```text
Material: preparado
Jornada: no iniciada
Evaluación: no respondida
Cierre: plantilla
Archivos canónicos: sin modificar
```
