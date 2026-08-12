# Estado acumulado — Días 1 a 7

**Fecha de corte:** 12/08/2026

---

# 1. Resultados

| Jornada | Resultado |
|---|---:|
| Día 1 — Diagnóstico general | 5,6/10 promedio |
| Día 2 — Análisis y Diseño + POO | 8,0/10 global |
| Día 3 — Estructuras + Base de Datos | 8,3/10 global |
| Día 4 — Comunicaciones escrita | 8,6/10 |
| Día 5 — PUD + POO + modelo relacional | 9,0/10 global |
| Día 6 — Requisitos + Pilas + OSI/TCP-IP | 9,2/10 global |
| Día 7 — Casos de uso + Herencia + DER | **8,3/10 global** |

---

# 2. Evolución por materia

| Materia | Diagnóstico | Evidencia acumulada más relevante |
|---|---:|---|
| Análisis y Diseño | 4,75 | PUD defendido Día 5; Requerimientos defendidos Día 6; casos de uso aplicados Día 7 |
| POO | 5,5 | Fundamentos defendidos Día 5; herencia y Java aplicados Día 7 |
| Algoritmos y Estructuras | 7,0 | Estructuras básicas Día 3; pila/LIFO defendidos Día 6 |
| Base de Datos | 6,0 | Modelo relacional/claves defendidos Día 5; DER y pasaje a tablas aplicados Día 7 |
| Comunicaciones | 4,75 | Día 4: 8,6; OSI/TCP-IP defendido Día 6; recuperaciones consolidadas Día 7 |

> Las notas de jornadas integradas no deben asignarse artificialmente como notas completas e independientes de cada asignatura.

---

# 3. Avances del Día 7

## Análisis y Diseño

- actor como rol externo;
- caso de uso como objetivo con resultado de valor;
- límite del sistema;
- asociación actor–caso;
- `include` obligatorio;
- `extend` opcional/condicionado;
- generalización hijo → padre;
- precondiciones;
- disparador;
- flujo principal;
- alternativos;
- excepciones;
- postcondiciones;
- aplicación a `Crear Orden de Trabajo`.

## POO / Java

- herencia;
- superclase y subclase;
- especialización/reutilización;
- relación `es un`;
- `extends`;
- `this`;
- `super` y `super(...)`;
- miembros estáticos;
- sobrecarga;
- sobrescritura;
- jerarquía `UsuarioSistema → Encargado / Operario`;
- constructor recuperado sin `void`.

## Base de Datos

- DER;
- entidad, atributo y relación;
- cardinalidades 1:N y N:M;
- participación 0..N y 1..1;
- entidad fuerte/débil;
- atributos multivaluados y derivados;
- FK en el lado N;
- tabla asociativa para N:M;
- atributos propios de la relación;
- elección de PK según existencia de historial.

---

# 4. Fortalezas actuales

1. Aplicación de conceptos sobre el dominio real de Órdenes de Trabajo.
2. PUD y Requerimientos en nivel aplicado/defendible dentro del alcance trabajado.
3. Clase/objeto, encapsulamiento, identidad y herencia correctamente aplicados.
4. Java breve con constructores, `this`, `super` y `static`.
5. Modelo relacional, claves y relaciones 1:N.
6. Pilas y LIFO.
7. OSI/TCP-IP y recorrido de datos.
8. DER básico, N:M y tabla asociativa.
9. Capacidad de corregir errores durante la misma jornada.
10. Integración entre requisitos, casos de uso, clases y datos.

---

# 5. Temas con evidencia defendible oralmente

## Análisis y Diseño

- características del PUD;
- fases del PUD;
- iteración e incremento;
- Ingeniería de Requerimientos;
- elicitación, especificación y validación;
- RF/RNF/regla de negocio.

## POO

- clase y objeto;
- estado, comportamiento e identidad;
- encapsulamiento.

## Estructuras

- pila y LIFO.

## Base de Datos

- modelo relacional básico;
- grado/cardinalidad;
- claves;
- relación 1:N.

## Comunicaciones

- OSI/TCP-IP;
- encapsulamiento/desencapsulamiento;
- MAC/IP/puerto.

> Los contenidos nuevos del Día 7 se consideran `A` principalmente. La defensa se realizó de forma distribuida, no como una única exposición integradora formal.

---

# 6. Recuperaciones consolidadas al Día 7

```text
TDA = interfaz independiente de implementación
Constructor Java = mismo nombre + sin retorno
PDU = Protocol Data Unit = SDU + PCI
Red/Internet → paquete
Enlace/Acceso → trama
Física → bits/señales
Síncrona ≠ asíncrona
TCP/IP = arquitectura/pila
Switch = trama/MAC
Router = paquete/IP
Clave candidata = superclave mínima
FK puede repetirse en 1:N
```

También quedó consolidado que el modelo de datos debe incluir todas las entidades y relaciones relevantes antes de pasar a tablas.

---

# 7. Pendientes de precisión inmediata

## Análisis y Diseño

1. Notación UML de generalización.
2. Asociación/agregación/composición/dependencia.
3. Completo frente a verificable.
4. Resultado de valor frente a persistencia interna.
5. Postcondiciones completas.

## POO / Java

6. `toString()` cuando la consigna lo exige.
7. Precisión general de sintaxis y una clase pública por archivo.
8. Profundizar `Object`, `equals` y comparación.

## Base de Datos

9. Instancia como ocurrencia concreta.
10. Rectángulo doble = entidad débil.
11. Línea doble = participación total.
12. Entidad asociativa frente a entidad débil.
13. Relación N:M conceptual frente a tabla asociativa.
14. Reglas generales del pasaje a tablas.
15. `UNIQUE` y claves cuando existe historial.

## Estructuras

16. Riesgo de lista enlazada frente a capacidad fija de vector.
17. Complejidades de ordenación.
18. Colas.

## Comunicaciones

19. Profundizar transmisión, señales y muestreo.
20. Contenidos de enlace, Ethernet, WAN y conmutación.

## Base de Datos pendiente histórico

21. DCL/TCL.
22. Normalización.
23. Álgebra relacional y SQL académico.

---

# 8. Estado del registro de errores

Después del Día 7:

| Estado | Cantidad |
|---|---:|
| Consolidado | **26** |
| Corregido | **3** |
| Abierto | **10** |
| **Total** | **39** |

Nuevos errores:

- `E-036` — notación de generalización UML;
- `E-037` — instancia confundida con cantidad;
- `E-038` — simbología de entidad débil/participación total;
- `E-039` — entidad asociativa confundida con entidad débil.

---

# 9. Patrón de aprendizaje

La principal fortaleza sigue siendo la aplicación a casos reales. La principal dificultad continúa siendo la precisión terminológica y gráfica bajo presión, especialmente cuando dos conceptos cercanos comparten palabras o estructuras:

```text
include / extend / generalización
fuerte / débil / asociativa
completo / verificable
relación N:M / tabla asociativa
actor / clase / entidad
```

La estrategia continúa siendo:

```text
Definir
  ↓
Diferenciar
  ↓
Aplicar
  ↓
Justificar
  ↓
Corregir
  ↓
Recuperar sin apuntes
  ↓
Evaluar
  ↓
Defender
```

---

# 10. Próxima etapa

**Día 8 — 13/08/2026: Modelo de análisis + Colas + Transmisión**

Bloques previstos:

- propósito del modelo de análisis;
- clases de interfaz, control y entidad;
- realizaciones de casos de uso;
- colaboración entre objetos;
- cola y FIFO;
- implementación con vector y lista;
- medida de la información;
- señales y muestreo;
- transmisión serie/paralela y síncrona/asíncrona.

Recuperación breve del Día 7:

- generalización UML;
- instancia;
- simbología DER;
- asociativa frente a débil;
- completo/verificable;
- `toString()`;
- N:M conceptual frente a tabla asociativa.
