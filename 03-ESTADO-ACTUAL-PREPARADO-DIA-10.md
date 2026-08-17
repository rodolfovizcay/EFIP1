# Estado preparado — EFIP I — Día 10

**Fecha académica prevista:** 17/08/2026  
**Jornada:** Arquitectura + Listas simplemente enlazadas + Nivel físico  
**Estado:** **PREPARADO — NO INICIADO**  
**Semana intensiva 1:** cerrada por evidencia acumulada — indicador descriptivo 8,6/10  
**Día 9:** cerrado documentalmente sin defensa oral; escrito 5,70/8,00  

---

# 1. Regla documental

Este archivo prepara la nueva jornada, pero no modifica todavía el estado académico canónico.

No se declara:

- estudio realizado;
- evaluación completada;
- nota;
- recuperación consolidada;
- cierre del Día 10.

Los archivos canónicos solo deberán actualizarse después de conservar respuestas, corregir la evaluación y decidir el cierre.

---

# 2. Alcance del plan maestro

El Día 10 corresponde al primer día de la Semana intensiva 2:

```text
Análisis y Diseño
→ elementos de arquitectura
→ diseño
→ vistas
→ documentación

Estructuras
→ lista simple
→ inserción
→ búsqueda
→ modificación
→ eliminación

Comunicaciones
→ medios guiados y no guiados
→ limitaciones del canal
→ atenuación
→ ruido
→ interferencia
→ dispersión
→ latencia
→ dispositivos físicos
→ última milla
```

Producto esperado:

```text
mapa de arquitectura
+
implementación didáctica de lista simple
+
cuadro de selección de medios físicos
```

---

# 3. Estado de entrada por materia

## Análisis y Diseño

Fortalezas de entrada:

- diferencia entre análisis, diseño e implementación;
- modelo de diseño aplicado de manera introductoria;
- servicios, repositorios, subsistemas e interfaces reconocidos;
- secuencia sin conexión correctamente ordenada.

Brechas relevantes:

- asociación, agregación, composición y dependencia (`E-002`);
- entidad frente a subsistema;
- arquitectura como conjunto de decisiones y vistas;
- documentación arquitectónica completa;
- cohesión y acoplamiento.

## Estructuras

Fortalezas de entrada:

- TDA y representación interna diferenciados;
- nodo y referencias comprendidos;
- inserción al inicio consolidada;
- Pila y Cola aplicadas.

Tema nuevo principal:

```text
Lista simplemente enlazada
→ estructura lineal dinámica
→ nodo + referencia siguiente
→ operaciones sin política LIFO/FIFO obligatoria
```

Brechas relacionadas:

- código Java completo (`E-016`);
- pérdida de referencias;
- recorridos y tratamiento de `null`;
- comparación correcta de `String`.

## Comunicaciones

Fortalezas de entrada:

- OSI/TCP-IP;
- capa física = bits/señales;
- señales analógicas/digitales;
- frecuencia y muestreo;
- switch/router y encapsulamiento.

Brechas relevantes:

- digitalización y supuestos (`E-045`);
- conectividad no determina sincronía (`E-049`);
- amplitud frente a potencia;
- medios y factores que degradan la señal;
- dispositivos del nivel físico;
- problemática de última milla.

---

# 4. Recuperación inicial prevista

Antes de abrir temas nuevos se comprobarán:

```text
1. Asociación, agregación, composición y dependencia.
2. Entidad frente a subsistema.
3. Alta cohesión y bajo acoplamiento.
4. Constructor: validar antes de asignar.
5. `super` solo para la parte heredada.
6. `String`: null || isBlank().
7. `toString()` con valores reales.
8. Inserción al inicio de una lista.
9. TDA: contrato frente a representación.
10. Física transmite bits mediante señales.
11. Una señal analógica puede transmitirse analógicamente.
12. Conectividad ≠ síncrona/asíncrona.
```

---

# 5. Criterios de finalización del Día 10

Para cerrar la jornada deberán existir evidencias del estudiante sobre:

- definición de arquitectura y decisiones significativas;
- identificación de subsistemas, interfaces y dependencias;
- explicación de cohesión y acoplamiento;
- ejecución mental y código de lista simple;
- inserción, búsqueda, modificación y eliminación;
- comparación lista/arreglo;
- medios guiados y no guiados;
- atenuación, ruido, interferencia, dispersión y latencia;
- módem, repetidor e interfaz física;
- problemática de la última milla;
- evaluación escrita;
- defensa oral o evidencia oral distribuida;
- actualización del registro de errores.

---

# 6. Próxima acción

```text
Iniciar EFIP — 2026-08-17 — Día 10
```

La primera actividad será el control de recuperación de 12 preguntas, seguido por el bloque de Arquitectura.