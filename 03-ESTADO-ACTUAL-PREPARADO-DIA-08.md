# Estado actual — Preparado para el Día 8

**Fecha académica:** 13 de agosto de 2026  
**Etapa:** cuarta jornada intensiva de vacaciones  
**Jornada:** Día 8 — Modelo de análisis + Colas + Transmisión  
**Estado:** PREPARADO, todavía no evaluado

---

## Punto de partida

El Día 7 quedó cerrado y publicado con **8,3/10 global**.

| Área | Evidencia previa relevante | Necesidad del Día 8 |
|---|---|---|
| Análisis y Diseño | Casos de uso aplicados; PUD y Requerimientos defendibles | Pasar de la vista externa del caso de uso a la vista interna del modelo de análisis |
| POO / Java | Herencia, `extends`, `this`, `super` y `static` aplicados | Recuperar `toString()` como método heredado de `Object`, sin abrir aún abstracción/polimorfismo |
| Algoritmos y Estructuras | Pilas y LIFO aplicados y defendidos | Estudiar Cola, FIFO, frente/final y vector/lista enlazada |
| Base de Datos | DER, 1:N y N:M aplicados | Recuperar instancia, simbología y asociativa/débil; no abrir normalización |
| Comunicaciones | OSI/TCP-IP aplicado; PDU, paquete/trama y bits consolidados | Estudiar medida de información, señales, muestreo y tipos de transmisión |

---

## Objetivos de la jornada

1. Explicar el propósito del análisis dentro del PUD.
2. Diferenciar el modelo de casos de uso —vista externa— del modelo de análisis —vista interna—.
3. Reconocer los artefactos principales del análisis:
   - modelo de análisis;
   - clases de análisis;
   - realización de caso de uso–análisis;
   - paquetes de análisis;
   - vista de arquitectura del análisis.
4. Diferenciar clases de interfaz, entidad y control por sus responsabilidades.
5. Construir una realización textual de caso de uso mediante colaboración entre objetos.
6. Definir Cola como TDA lineal restrictivo FIFO.
7. Aplicar frente, final, encolar, desencolar, consultar cabecera, longitud y `esVacia`.
8. Comparar cola implementada con vector y con lista enlazada.
9. Comparar Pila/LIFO frente a Cola/FIFO según la operación dominante.
10. Explicar la medida técnica de información y su relación con probabilidad/incertidumbre.
11. Diferenciar señal analógica y señal digital.
12. Aplicar período, frecuencia y la relación `f = 1/T`.
13. Explicar muestreo y tasa mínima de Nyquist según el material: `fs ≥ 2·fmax`.
14. Diferenciar transmisión serie/paralela y síncrona/asíncrona.
15. Integrar modelo de análisis, cola y transmisión en un caso de sincronización de Órdenes de Trabajo.

---

## Recuperaciones obligatorias del Día 7

1. **Generalización UML**

```text
HIJO ─────▷ PADRE
```

Línea continua con triángulo vacío apuntando al elemento general.

2. **Instancia**

```text
Instancia = ocurrencia concreta de una entidad.
```

3. **Simbología DER**

```text
Rectángulo doble → entidad débil
Línea doble      → participación total
```

4. **Entidad asociativa vs. entidad débil**

```text
Asociativa → materializa una relación N:M.
Débil      → depende de otra para identificarse o existir.
```

5. **Completo vs. verificable**

```text
Completo    → contiene toda la información necesaria.
Verificable → puede comprobarse objetivamente.
```

6. **`toString()`**

Método heredado de `Object` que puede sobrescribirse para producir una representación textual del objeto.

7. **N:M conceptual vs. tabla asociativa**

```text
N:M conceptual → regla del DER.
Tabla asociativa → implementación relacional de esa relación.
```

8. **Vector vs. lista enlazada**

```text
Vector → capacidad definida; posible desbordamiento por límite.
Lista  → tamaño variable; limitada por memoria y referencias.
```

---

## Alcance controlado

### Se estudia hoy

- propósito y artefactos del modelo de análisis;
- clases de interfaz, entidad y control;
- realización de caso de uso–análisis;
- colaboración entre objetos;
- Cola/FIFO;
- frente y final;
- implementación con vector y lista enlazada;
- comparación Pila/Cola;
- medida de información;
- señales analógicas y digitales;
- amplitud, período y frecuencia;
- muestreo;
- serie/paralela;
- síncrona/asíncrona.

### No se abre hoy como bloque principal

- modelo de diseño;
- diagrama de secuencia de diseño;
- subsistemas e interfaces de diseño;
- clase abstracta, interfaz y polimorfismo;
- normalización 1FN/2FN/3FN;
- álgebra relacional;
- medios, ruido, Ethernet, WAN y conmutación como bloques completos;
- colas de prioridad, bicolas y colas concurrentes en profundidad.

---

## Archivos preparados

1. `DIAS/2026-08-13_DIA-08_MODELO-ANALISIS-COLAS-TRANSMISION.md`
2. `RESUMENES/2026-08-13_RESUMEN-GUIADO-DIA-08.md`
3. `FICHAS/2026-08-13_MAPA-MODELO-ANALISIS.md`
4. `FICHAS/2026-08-13_FICHA-COLA.md`
5. `FICHAS/2026-08-13_CUADRO-TRANSMISION.md`
6. `CASOS/2026-08-13_CASO-INTEGRADOR-ANALISIS-COLA-TRANSMISION.md`
7. `EVALUACIONES/2026-08-13_EVALUACION-DIA-08.md`
8. `EVALUACIONES/2026-08-13_RESPUESTAS-DIA-08.md`
9. `RESUMENES/2026-08-13_CIERRE-DIA-08.md`
10. `99-MANIFIESTO-PREPARACION-DIA-08.md`

---

## Condición de cierre futuro

El Día 8 podrá cerrarse después de contar con:

- recuperación inicial sin apuntes;
- mapa del modelo de análisis;
- realización textual de un caso de uso mediante colaboración;
- simulación correcta de una cola FIFO;
- comparación vector/lista y pila/cola;
- ejercicios de información, frecuencia y muestreo;
- cuadro de transmisión completado;
- evaluación escrita;
- defensa oral o distribuida claramente registrada;
- corrección y errores;
- cierre diario.

Hasta entonces, `03-ESTADO-ACTUAL.md` conserva correctamente al Día 7 como último cierre académico.

---

## Comando de inicio

> **Iniciar EFIP — 2026-08-13 — Día 8**
