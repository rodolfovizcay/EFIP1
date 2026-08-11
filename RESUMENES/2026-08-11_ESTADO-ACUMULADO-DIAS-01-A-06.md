# Estado acumulado — Días 1 a 6

**Fecha de corte:** 11/08/2026

---

## Resultados

| Jornada | Resultado |
|---|---:|
| Día 1 — Diagnóstico general | 5,6/10 promedio |
| Día 2 — Análisis y Diseño + POO | 8,0/10 global |
| Día 3 — Estructuras + Base de Datos | 8,3/10 global |
| Día 4 — Comunicaciones escrita | 8,6/10 |
| Día 5 — PUD + POO + modelo relacional | 9,0/10 global |
| Día 6 — Requisitos + Pilas + OSI/TCP-IP | **9,2/10 global** |

## Evolución por materia

| Materia | Diagnóstico | Evidencia posterior más relevante |
|---|---:|---|
| Análisis y Diseño | 4,75 | Día 5: PUD aplicado/defendido; Día 6: Ingeniería de Requerimientos aplicada y defensa integrada |
| POO | 5,5 | Día 5: fundamentos aplicados y defendidos; constructor sigue en retención |
| Algoritmos y Estructuras | 7,0 | Día 3: 8,3 global; Día 6: pila, LIFO e implementaciones aplicadas y defendidas |
| Base de Datos | 6,0 | Día 5: modelo relacional y claves aplicados/defendidos |
| Comunicaciones | 4,75 | Día 4: 8,6 escrito; Día 6: OSI/TCP-IP, direccionamiento y recorrido aplicados/defendidos |

> Las evaluaciones posteriores son integradas y no deben transformarse en notas individuales artificiales por asignatura.

---

## Fortalezas actuales

- aplicación de conceptos sobre casos reales de Órdenes de Trabajo;
- núcleo del PUD y fases;
- Ingeniería de Requerimientos;
- elicitación, especificación y validación;
- RF, RNF y reglas de negocio;
- clase/objeto, estado/comportamiento/identidad y encapsulamiento;
- modelo relacional y claves;
- TDA, arreglos, listas básicas y pilas;
- LIFO, `push`, `pop` y simulación;
- comparación entre vector y lista enlazada;
- OSI y TCP/IP;
- encapsulamiento, MAC, IP y puerto;
- capacidad de defensa oral integrada.

---

## Temas con evidencia defendible oralmente

### Análisis y Diseño

- PUD dirigido por casos de uso;
- PUD centrado en arquitectura;
- PUD iterativo e incremental;
- Inicio, Elaboración, Construcción y Transición;
- Ingeniería de Requerimientos;
- elicitación, especificación y validación;
- RF, RNF y regla de negocio en el caso trabajado.

### Programación Orientada a Objetos

- clase y objeto;
- estado, comportamiento e identidad;
- encapsulamiento.

### Algoritmos y Estructuras

- pila como TDA;
- LIFO;
- elección de una pila para deshacer la última modificación.

### Base de Datos

- modelo relacional básico;
- grado y cardinalidad;
- clave candidata, primaria y foránea;
- relación 1:N en el ejemplo trabajado.

### Comunicaciones

- OSI en el recorrido trabajado;
- TCP/IP como arquitectura/pila;
- correspondencia OSI–TCP/IP;
- encapsulamiento y desencapsulamiento;
- MAC, IP y puerto;
- recorrido móvil → servidor.

> Esto no implica que las materias completas estén en estado defendible oralmente.

---

## Recuperaciones importantes logradas

```text
Arquitectura ≠ documentación
Construcción ≠ Transición
Iteración ≠ incremento
Fases PUD ≠ flujos PUD
Estado ≠ comportamiento
Identidad ≠ ID
Sobrecarga ≠ sobrescritura
Grado ≠ cardinalidad
Clave candidata = superclave mínima
FK puede repetirse en 1:N
TDA = interfaz independiente de implementación
TCP/IP = arquitectura/pila
Switch = trama/MAC
Router = paquete/IP
Asíncrona = carácter + start/stop
Síncrona = bloque + cabecera/terminación
```

---

## Corregidos que requieren retención espaciada

- PDU = Unidad de Datos de Protocolo; la fórmula `SDU + PCI` está comprendida, pero la expansión de la sigla volvió a fallar.
- Constructor Java = mismo nombre que la clase y sin tipo de retorno, ni siquiera `void`.
- Alcance del modelo de datos completo, no limitado a una entidad.
- Estructura dinámica no significa cambio de tipo de elemento.
- IP como direccionamiento lógico también dentro de una LAN.
- Selección de estructura: se aplicó correctamente a pila/lista, pero debe generalizarse a otros problemas.

---

## Errores abiertos prioritarios

1. Relaciones UML: asociación, agregación, composición y dependencia.
2. Complejidades de algoritmos de ordenación.
3. DCL/TCL.
4. Precisión general de sintaxis Java.
5. Completo frente a verificable.
6. Riesgo de pila enlazada frente a desbordamiento de vector.
7. Red/Internet produce paquete; Enlace/Acceso produce trama.
8. Física transmite bits/señales, no bytes como unidad principal.

---

## Estado canónico de errores al Día 6

| Estado | Cantidad |
|---|---:|
| Consolidado | 21 |
| Corregido, pendiente de consolidación | 6 |
| Abierto | 8 |
| **Total registrado** | **35** |

---

## Patrón transversal

La principal dificultad sigue siendo la precisión terminológica bajo presión. Sin embargo, el Día 6 mostró una mejora significativa:

- los conceptos fueron aplicados antes de la evaluación;
- la simulación LIFO fue perfecta;
- la correspondencia OSI–TCP/IP fue reproducida sin errores;
- la defensa oral integró tres materias dentro de un solo caso;
- varios errores históricos pasaron de corregidos/abiertos a consolidados.

Los errores que reaparecieron fueron principalmente palabras o unidades cercanas:

```text
protocolo vs. proceso
paquete vs. trama
bits vs. bytes
completo vs. verificable
```

---

## Estrategia que está funcionando

```text
Resumen guiado
    ↓
Recuperación sin apuntes
    ↓
Aplicación a un caso real
    ↓
Corrección inmediata
    ↓
Simulación o ejercicio
    ↓
Evaluación escrita
    ↓
Defensa oral integrada
    ↓
Recuperación espaciada futura
```

---

## Próxima etapa

**Día 7 — 12/08/2026: Casos de uso + Herencia + DER**

- actores y casos de uso;
- `include`, `extend` y generalización;
- flujos, precondiciones y postcondiciones;
- herencia, `extends`, `this`, `super` y miembros estáticos;
- sobrecarga y sobrescritura;
- DER, entidades, relaciones y cardinalidades;
- pasaje inicial a tablas;
- recuperación breve de los pendientes del Día 6.
