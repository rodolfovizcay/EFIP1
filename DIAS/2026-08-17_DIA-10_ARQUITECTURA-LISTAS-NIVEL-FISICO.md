# Día 10 — Arquitectura + Lista simple + Nivel físico

**Fecha:** 17/08/2026  
**Duración núcleo:** 5,5 horas  
**Materias:** Análisis y Diseño + Estructuras de Datos + Comunicaciones  
**Estado:** cerrado y aprobado en su alcance real

---

# 1. Objetivo de la jornada

Al finalizar, el estudiante deberá poder:

1. explicar la arquitectura como conjunto de decisiones significativas;
2. identificar subsistemas, interfaces, dependencias, cohesión y acoplamiento;
3. relacionar casos de uso, requisitos no funcionales y arquitectura;
4. describir y manipular una lista simplemente enlazada;
5. escribir una implementación Java breve y coherente;
6. diferenciar medios guiados y no guiados;
7. explicar atenuación, ruido, interferencia, dispersión y latencia;
8. reconocer interfaces físicas, módems, repetidores y última milla;
9. ubicar hub/repetidor, switch, router y gateway en el modelo OSI;
10. explicar por qué se trenzan los pares y comparar UTP, FTP y STP;
11. relacionar diafonía, interferencia y blindaje con la elección del cable;
12. integrar arquitectura, estructura de datos y elección de medio en un caso.

---

# 2. Cronograma

## Recuperación inicial — 20 a 25 minutos

Responder sin apuntes las tarjetas preparadas.

Umbral:

```text
10–12 correctas
→ comenzar directamente Arquitectura.

7–9 correctas
→ corregir únicamente las falladas.

0–6 correctas
→ 15 minutos adicionales de repaso.
```

## Mañana M1 — Arquitectura — 90 minutos

### Conceptos

- arquitectura como conjunto de decisiones significativas;
- organización del sistema;
- elementos estructurales e interfaces;
- colaboraciones y comportamiento;
- composición en subsistemas;
- estilo arquitectónico;
- influencia de plataforma, base de datos, comunicaciones, sistemas heredados y RNF;
- comprensión, organización del desarrollo, reutilización y evolución;
- vistas complementarias;
- descripción de arquitectura;
- subsistemas e interfaces;
- alta cohesión y bajo acoplamiento.

### Actividad

Aplicar a SIGO:

```text
Subsistema TrabajoEnCalle
Subsistema Sincronización
Subsistema Notificaciones
Subsistema Persistencia
```

Para cada uno:

- responsabilidad;
- clases o servicios relevantes;
- interfaz proporcionada;
- dependencia con otro subsistema;
- RNF que lo afecta.

### Producto

Mapa textual de arquitectura de SIGO.

---

## Mañana M2 — Lista simplemente enlazada — 90 minutos

### Conceptos

- estructura lineal dinámica;
- nodo;
- dato y referencia `siguiente`;
- cabeza/cabecera;
- lista vacía;
- recorrido hasta `null`;
- insertar;
- buscar;
- modificar;
- eliminar;
- imprimir;
- comparación con arreglo;
- pérdida de referencias;
- tratamiento de `null`;
- comparación de contenido de `String`.

### Actividad manual

Partir de:

```text
cabeza → [OT-101] → [OT-205] → [OT-310] → null
```

Ejecutar:

1. insertar `OT-050` al inicio;
2. buscar `OT-205`;
3. modificar `OT-205` por `OT-206`;
4. eliminar `OT-101`;
5. insertar `OT-400` al final;
6. mostrar la lista final.

### Actividad Java

Completar y explicar:

```text
Nodo
ListaSimple
insertarInicio
insertarFinal
buscar
modificar
eliminar
mostrar
tamanio
```

### Producto

Código didáctico ejecutable y diagrama de evolución.

---

## Cierre de mañana — 30 minutos

Explicar sin mirar:

```text
Arquitectura
→ subsistemas
→ interfaces
→ dependencias
→ alta cohesión / bajo acoplamiento
```

Y dibujar:

```text
lista vacía
→ primer nodo
→ inserción al inicio
→ inserción al final
→ eliminación de cabeza
→ eliminación intermedia
```

---

## Tarde T1 — Nivel físico y mapa de dispositivos — 90 minutos

### Conceptos

- función de la capa física;
- bits y señales;
- medios guiados y no guiados;
- mapa de dispositivos por capa: hub/repetidor, switch, router y gateway;
- firewall y VPN como dispositivos/funciones cuya capa depende de la inspección o implementación;
- par trenzado UTP;
- cancelación de interferencias mediante el trenzado;
- UTP frente a FTP y STP;
- diafonía;
- comparación con coaxial y fibra óptica;
- criterios de elección: ancho de banda, retardo, costo, instalación y mantenimiento;
- enlace punto a punto y multipunto;
- caminos directos, indirectos y alternativos;
- atenuación;
- ruido;
- interferencia electromagnética;
- dispersión;
- latencia;
- interfaces físicas;
- módem;
- repetidor;
- última milla;
- alternativas de acceso.

### Actividad de selección

Elegir un medio para tres escenarios:

```text
A. Dos oficinas enfrentadas en zona urbana.
B. Cliente rural sin tendido de cable.
C. Enlace interno con alta interferencia electromagnética.
```

Para cada escenario justificar:

- medio guiado o no guiado;
- distancia;
- obstáculos;
- interferencia;
- costo;
- mantenimiento;
- latencia;
- interfaz/dispositivo necesario;
- supuesto declarado.

En el escenario C se debe comparar explícitamente:

```text
UTP
FTP/STP
fibra óptica
```

La respuesta debe separar:

```text
trenzado → ayuda a cancelar perturbaciones inducidas
blindaje → agrega protección frente a interferencia
fibra → no transporta la señal mediante corriente eléctrica
```

### Producto

Cuadro comparativo de medios y perturbaciones.

---

## Tarde T2 — Integración y evaluación — 60 minutos

1. resolver el caso integrador;
2. responder preguntas orales;
3. completar evaluación escrita;
4. registrar errores reales;
5. completar resumen de cierre.

---

# 3. Relación entre los tres bloques

```text
Arquitectura
→ decide cómo organizar el sistema y sus interfaces.

Lista simple
→ permite administrar una colección dinámica con operaciones flexibles.

Nivel físico
→ permite seleccionar cómo los bits viajarán realmente entre nodos.
```

Caso común:

```text
SIGO debe ampliar su operación a una zona rural.

Arquitectura
→ define subsistemas de relevamiento, sincronización y comunicaciones.

Lista simple
→ conserva una colección dinámica de puntos de relevamiento.

Nivel físico
→ permite elegir el medio de acceso y evaluar sus limitaciones.
```

---

# 4. Criterios de calidad

## Arquitectura

- no confundir entidad con subsistema;
- no convertir todo requisito en una tecnología;
- distinguir interfaz proporcionada de interfaz gráfica;
- justificar dependencias;
- buscar alta cohesión y bajo acoplamiento;
- documentar decisiones y razones.

## Lista simple

- no perder la referencia a la cabeza;
- manejar lista vacía;
- usar `equals()` para contenido textual;
- verificar `null`;
- actualizar correctamente enlaces al eliminar;
- diferenciar nodo actual y nodo anterior.

## Nivel físico

- Física transmite bits mediante señales;
- no confundir ruido con interferencia;
- no confundir atenuación con latencia;
- no afirmar que un medio es siempre mejor;
- declarar distancia, costo, obstáculos y mantenimiento;
- conectividad no determina sincronía/asíncronía.
- no confundir STP como cable blindado con STP como Spanning Tree Protocol;
- no asignar una capa única a todo firewall o VPN sin declarar su tipo;
- gateway es un término funcional amplio; para el examen se conserva la ubicación indicada por el material y se aclara el supuesto.

---

# 5. Productos de la jornada

- ficha de arquitectura;
- mapa de subsistemas e interfaces;
- ficha de lista simple;
- código Java de lista simple;
- cuadro de nivel físico;
- tabla dispositivo → capa → unidad/dirección utilizada;
- caso integrador;
- evaluación;
- respuestas preservadas;
- cierre diario.

---

# 6. Evaluación

```text
Arquitectura:       2,5 puntos
Lista simple:       2,5 puntos
Nivel físico:       2,5 puntos
Integración:        0,5 puntos
Escrito:            8,0 puntos
Defensa oral:       2,0 puntos
Total:             10,0 puntos
```

Aprobación orientativa:

```text
7/10
+
ningún bloque central omitido
+
operaciones de lista resueltas
+
defensa integrada
```

---

# 7. Comando de inicio

```text
Iniciar EFIP — 2026-08-17 — Día 10
```

---

# Cierre real de la jornada

```text
Evaluación integradora adaptada = 8,5/10
Recuperación selectiva final = 4/4
Estado = CERRADO Y APROBADO
```

La secuencia real fue progresiva: recuperación inicial, actividades guiadas, evaluación integradora y recuperación selectiva. El instrumento preparado de `8+2` no se ejecutó con ese formato exacto.

Quedaron reprogramados, sin marcar como dominados:

- código Java completo, modificación e inserción final de Lista;
- atenuación, ruido, dispersión y latencia;
- gateway, módem, última milla y caso integrador completo.

Fuentes de evidencia:

- `EVALUACIONES/2026-08-17_RESPUESTAS-DIA-10.md`
- `EVALUACIONES/2026-08-17_RESULTADOS-DIA-10.md`
- `RESUMENES/2026-08-17_CIERRE-DIA-10.md`
