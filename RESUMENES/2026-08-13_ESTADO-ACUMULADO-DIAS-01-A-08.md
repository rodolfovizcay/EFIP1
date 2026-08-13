# Estado acumulado — Días 1 a 8

**Fecha de corte:** 13/08/2026

---

# 1. Resultados acumulados

| Jornada | Resultado |
|---|---:|
| Día 1 — Diagnóstico general | 5,6/10 promedio |
| Día 2 — Análisis y Diseño + POO | 8,0/10 global |
| Día 3 — Estructuras + Base de Datos | 8,3/10 global |
| Día 4 — Comunicaciones escrita | 8,6/10 |
| Día 5 — PUD + POO + modelo relacional | 9,0/10 global |
| Día 6 — Requisitos + Pilas + OSI/TCP-IP | 9,2/10 global |
| Día 7 — Casos de uso + Herencia + DER | 8,3/10 global |
| Día 8 — Modelo de análisis + Colas + Transmisión | **7,9/10 global** |

---

# 2. Evolución por materia

| Materia | Diagnóstico | Evidencia acumulada más relevante |
|---|---:|---|
| Análisis y Diseño | 4,75 | PUD defendido Día 5; Requerimientos Día 6; casos de uso Día 7; modelo de análisis defendido Día 8 |
| POO | 5,5 | Fundamentos Día 5; herencia/Java Día 7; `toString()` conceptualmente recuperado Día 8 |
| Algoritmos y Estructuras | 7,0 | Estructuras básicas Día 3; Pila/LIFO Día 6; Cola/FIFO defendida Día 8 |
| Base de Datos | 6,0 | Modelo relacional/claves Día 5; DER y tablas Día 7; recuperaciones parciales Día 8 |
| Comunicaciones | 4,75 | Día 4: 8,6; OSI/TCP-IP Día 6; Transmisión aplicada con recuperación dirigida Día 8 |

> Las notas de jornadas integradas no se asignan artificialmente como notas completas de cada materia.

---

# 3. Avances del Día 8

## Análisis y Diseño

- propósito del análisis;
- casos de uso como vista externa;
- modelo de análisis como vista interna conceptual;
- cinco artefactos principales;
- clase de interfaz;
- clase de control;
- clase de entidad;
- responsabilidades conceptuales;
- realización de caso de uso–análisis;
- colaboración entre objetos;
- mensajes conceptuales frente a métodos definitivos;
- colaboración frente a secuencia de diseño.

## Algoritmos y Estructuras

- Cola como TDA lineal restrictivo;
- FIFO;
- frente y final;
- `encolar`, `desencolar`, `cabecera`, `esVacia`, `longitud`;
- simulación FIFO completa;
- Cola con vector;
- Cola con lista enlazada;
- comparación de implementaciones;
- Pila frente a Cola;
- Cola de prioridad;
- selección según la política de orden.

## Comunicaciones

- información, probabilidad e incertidumbre;
- fórmula `I(E)` introducida y aplicada en práctica;
- entropía y tasa de información;
- señal analógica/digital;
- amplitud, período y frecuencia;
- relación `f=1/T`;
- muestreo;
- regla `fs≥2·fmax`;
- serie/paralela;
- asíncrona/síncrona;
- combinación de categorías;
- integración de sensor analógico con sistema digital.

---

# 4. Fortalezas actuales

1. Aplicación de teoría al dominio real de Órdenes de Trabajo.
2. PUD y fases defendibles.
3. Ingeniería de Requerimientos y RF/RNF/reglas defendibles.
4. Actores, casos de uso y flujos aplicados.
5. Modelo de análisis e interfaz/control/entidad defendidos.
6. Clase/objeto/encapsulamiento/herencia aplicados.
7. Constructor, `this`, `super`, `static`, sobrecarga y sobrescritura.
8. Modelo relacional, claves y relaciones 1:N.
9. DER, N:M y tabla asociativa.
10. Pila/LIFO y Cola/FIFO.
11. Simulaciones de estructuras sin errores.
12. OSI/TCP-IP y recorrido de datos.
13. Serie/paralela y síncrona/asíncrona.
14. Cálculos de frecuencia y muestreo.
15. Capacidad de integrar análisis, estructura y comunicación.

---

# 5. Temas defendibles oralmente dentro del alcance trabajado

## Análisis y Diseño

- características y fases del PUD;
- iteración/incremento;
- Ingeniería de Requerimientos;
- RF/RNF/regla de negocio;
- modelo de casos de uso frente a modelo de análisis;
- clases de interfaz, control y entidad.

## POO

- clase/objeto;
- estado, comportamiento e identidad;
- encapsulamiento.

## Estructuras

- Pila/LIFO;
- Cola/FIFO;
- vector frente a lista enlazada para Cola.

## Base de Datos

- modelo relacional básico;
- grado/cardinalidad;
- claves;
- relación 1:N.

## Comunicaciones

- OSI/TCP-IP;
- encapsulamiento;
- MAC/IP/puerto;
- clasificación serie/paralela y síncrona/asíncrona en el núcleo trabajado.

> Transmisión no se considera defendible de forma completa: fórmulas, unidades y parámetros de señal todavía requieren recuperación.

---

# 6. Recuperaciones consolidadas hasta el Día 8

```text
TDA = interfaz independiente de implementación
Constructor = mismo nombre + sin retorno
PDU = Protocol Data Unit = SDU + PCI
Red/Internet → paquete
Enlace/Acceso → trama
Física → bits/señales
TCP/IP = arquitectura/pila
Síncrona ≠ asíncrona
Pila = LIFO
Cola = FIFO
Clave candidata = superclave mínima
FK puede repetirse en 1:N
1:N → FK en lado N
N:M → tabla asociativa
Completo ≠ verificable
Riesgo vector ≠ riesgo lista enlazada
```

También quedó consolidada la selección de estructura según operación dominante.

---

# 7. Pendientes de precisión inmediata

## Análisis y Diseño

1. Asociación, agregación, composición y dependencia.
2. Generalización UML con triángulo vacío.
3. Realización con alternativos completos.
4. Mantener el objetivo exacto del caso durante la colaboración.
5. Diferenciar vista de arquitectura del análisis y diseño tecnológico.

## POO / Java

6. Escribir `toString()` cuando se solicita.
7. Profundizar `Object`, `equals` y `hashCode`.
8. Abstracción, interfaces y polimorfismo.

## Base de Datos

9. Instancia como ocurrencia concreta.
10. Línea doble = participación total.
11. Asociativa frente a débil sin decidir solo por la PK.
12. Reglas generales de pasaje y `UNIQUE`.
13. DCL/TCL.
14. Normalización y álgebra relacional.

## Estructuras

15. Contrato del TDA frente a implementación.
16. Pila=LIFO y Cola=FIFO bajo presión.
17. Orden FIFO frente a trazabilidad.
18. Complejidades de ordenación.

## Comunicaciones

19. Probabilidad/incertidumbre/información.
20. `I(E)=log₂(1/P(E))` y unidad bits.
21. bits, bits/símbolo y bits/segundo.
22. Amplitud, período y frecuencia.
23. `f=1/T` y `T=1/f`.
24. Definición de muestreo.
25. Efecto de aumentar `fs`.
26. Digitalización frente a transmisión analógica.
27. Declaración de supuestos de protocolo.
28. Profundizar medios, enlace, Ethernet, WAN y conmutación.

---

# 8. Estado del registro de errores

Después del Día 8:

| Estado | Cantidad |
|---|---:|
| Consolidado | **29** |
| Corregido | **5** |
| Abierto | **11** |
| **Total** | **45** |

Cambios de estado:

```text
E-011 → consolidado
E-032 → consolidado
E-033 → consolidado
E-036 → corregido
E-037 → corregido
E-039 → corregido
E-038 → continúa abierto
```

Errores nuevos:

```text
E-040 — realización de análisis incompleta/caso desviado
E-041 — contrato del TDA frente a implementación
E-042 — Pila/Cola y orden frente a trazabilidad
E-043 — información: relación, fórmula y unidades
E-044 — parámetros de señal, fórmulas y muestreo
E-045 — digitalización, política de envío y supuestos
```

---

# 9. Tarjetas de recuperación

Se incorporó:

```text
TARJETAS/2026-08-13_TARJETAS-RECUPERACION-ERRORES-DIA-08.md
```

El mazo contiene:

- tarjetas de Modelo de análisis;
- TDA/Pila/Cola;
- información y unidades;
- señales y muestreo;
- formas de transmisión;
- recuperaciones todavía activas del Día 7;
- mini examen de salida.

---

# 10. Patrón de aprendizaje

La fortaleza continúa siendo la aplicación y la integración de conceptos. La dificultad principal se concentra en:

```text
definiciones académicas exactas
+ fórmulas
+ unidades
+ conceptos cercanos que se mezclan bajo presión
```

Patrón observado en Día 8:

```text
Cálculo numérico correcto
pero fórmula/unidad omitida.

Clasificación correcta
pero definición imprecisa.

Aplicación correcta
pero alcance del concepto exagerado.
```

Estrategia recomendada:

```text
Tarjeta → respuesta oral → fórmula escrita → ejemplo → contraste
```

---

# 11. Próxima etapa

**Día 9 — 14/08/2026: Diseño + Abstracción/Polimorfismo + Normalización**

Bloques previstos:

- modelo de diseño;
- diagrama de secuencia;
- estados;
- subsistemas e interfaces;
- abstracción;
- clase y método abstractos;
- interfaz;
- polimorfismo;
- 1FN, 2FN y 3FN;
- dependencias parciales y transitivas.

Recuperación inicial recomendada:

- realización de análisis con alternativo;
- contrato TDA/implementación;
- Pila/Cola y trazabilidad;
- información, fórmulas y unidades;
- parámetros de señal y muestreo;
- línea doble, instancia y asociativa/débil.
