# Estado actual — EFIP I

**Fecha académica registrada:** 16 de agosto de 2026  
**Semana intensiva 1:** **CERRADA POR EVIDENCIA ACUMULADA**  
**Nivel semanal:** **ALTO / APROBADO**  
**Indicador descriptivo:** **8,6/10**  
**Día 9:** **CERRADO DOCUMENTALMENTE — SIN DEFENSA ORAL**

---

# 1. Integridad de los resultados

## Semana intensiva 1

El indicador semanal continúa calculado únicamente con evaluaciones completas y comparables:

| Jornada | Resultado |
|---|---:|
| Día 5 | 9,0/10 |
| Día 6 | 9,2/10 |
| Día 7 | 8,3/10 |
| Día 8 | 7,9/10 |
| **Promedio descriptivo** | **8,6/10** |

```text
Semana: CERRADA
Nivel: ALTO / APROBADO
Examen semanal adicional: NO REALIZADO
```

El promedio 8,6 no es una nueva nota de examen ni una calificación del Caso integrador 1.

## Día 9

```text
Evaluación escrita: 5,70/8,00
Porcentaje escrito: 71,25 %
Equivalencia escrita: 7,1/10
Defensa oral: NO REALIZADA
Nota global: NO ASIGNADA
Estado: CERRADO SIN DEFENSA ORAL
```

El resultado escrito aporta evidencia temática, pero no se incorpora al promedio semanal porque la modalidad completa del Día 9 incluía 2 puntos de defensa.

---

# 2. Estado por materia

| Materia | Nivel actual | Evidencia principal | Precisión pendiente |
|---|---|---|---|
| Análisis y Diseño | **Alto — aplicado y parcialmente defendible** | PUD, requisitos, casos de uso, análisis, diseño, secuencias y caso integrado | relaciones UML, subsistemas/interfaces y estados completos |
| POO | **Medio-alto — aplicado conceptualmente** | encapsulamiento, herencia, abstracción, clase abstracta, interfaz y polimorfismo | Java completo, constructor, `String`, `toString()`, `@Override` |
| Estructuras | **Alto — aplicado y defendible en Pila/Cola** | TDA, LIFO, FIFO, vector/lista y secuencia segura de sincronización | algoritmos de ordenación y complejidades |
| Base de Datos | **Medio-alto — aplicado** | modelo relacional, DER, N:M, 1FN, 2FN y 3FN | asociativa/débil y modelo final con PK/FK/UNIQUE completos |
| Comunicaciones | **Medio-alto — aplicado** | OSI/TCP-IP, PDU, switch/router, información, frecuencia y muestreo | supuestos de transmisión y nivel físico avanzado |
| Integración | **Alto — aplicado** | cadena requisito→caso→análisis→diseño→POO/estructuras→datos→comunicaciones | defensa continua formal en simulacro posterior |

---

# 3. Avances confirmados del Día 9

## Modelo de diseño

- análisis, diseño e implementación diferenciados;
- servicios y repositorios reconocidos como elementos de diseño;
- secuencia normal construida;
- alternativo sin conexión aplicado;
- regla segura:

```text
cabecera()
→ envío
→ confirmación
→ trazabilidad
→ desencolar()
```

- Cola diferenciada de la necesidad FIFO;
- diagrama de estados comprendido, con anulación omitida en el escrito;
- subsistemas e interfaces comprendidos en alcance introductorio.

## Abstracción y Polimorfismo

- abstracción y encapsulamiento diferenciados;
- clase y método abstractos aplicados;
- interfaz `Auditable` aplicada;
- `extends`, `implements` y sobrescritura comprendidos;
- polimorfismo comprendido mediante tipo común y objetos concretos;
- código Java todavía presenta errores estructurales.

## Normalización

- anomalías identificadas;
- 1FN aplicada conceptualmente;
- dependencias parciales de 2FN identificadas;
- dependencia transitiva de 3FN identificada;
- ID artificial diferenciado de normalización;
- modelo final comprendido, pero escrito con omisiones de atributos y claves.

---

# 4. Caso integrador 1

```text
Práctica guiada: COMPLETADA
Integración de materias: EVIDENCIADA
Evaluación formal de 100 puntos: NO REALIZADA
Puntaje formal: NO ASIGNADO
```

La práctica permanece como evidencia cualitativa y no como examen.

---

# 5. Estado de errores

| Estado | Cantidad |
|---|---:|
| Consolidado | **36** |
| Corregido | **6** |
| Abierto | **8** |
| **Total registrado** | **50** |

Cambios del cierre del Día 9:

```text
Consolidados:
E-040 — realización y alternativo sin conexión
E-047 — 2FN e ID artificial
E-048 — confirmación antes de desencolar

Nuevo abierto:
E-050 — modelo relacional final incompleto
```

Continúan como prioridades:

```text
E-016 — código Java completo
E-039 — asociativa frente a débil
E-045 — digitalización y supuestos
E-049 — conectividad frente a sincronía
```

---

# 6. Puntos débiles prioritarios

1. Constructor Java: validar antes de asignar.
2. No utilizar `super` para métodos de la propia clase.
3. Escribir `toString()` con valores reales.
4. Aplicar `@Override` de forma completa.
5. Diferenciar entidad y subsistema.
6. Completar diagramas de estados.
7. Automatizar asociativa frente a débil.
8. Escribir el modelo final con todos los atributos, PK, FK y `UNIQUE`.
9. Declarar supuestos tecnológicos coherentes.
10. Profundizar DCL/TCL, relaciones UML y ordenación.

Documento de estudio:

```text
RESUMENES/2026-08-16_REPASO-SEMANAL-PUNTOS-DEBILES.md
```

---

# 7. Evidencia principal nueva

- `EVALUACIONES/2026-08-16_RESPUESTAS-EVALUACION-DIA-09.md`
- `EVALUACIONES/2026-08-16_RESULTADOS-DIA-09-SIN-DEFENSA.md`
- `RESUMENES/2026-08-14_CIERRE-DIA-09.md`
- `RESUMENES/2026-08-16_REPASO-SEMANAL-PUNTOS-DEBILES.md`
- `EVALUACIONES/2026-08-15_RESULTADO-SEMANAL-POR-EVIDENCIA.md`

Los archivos parciales del Día 9 se conservan como historia del estado previo a la recuperación.

---

# 8. Próxima etapa

La semana intensiva 1 y el Día 9 ya están cerrados documentalmente.

La siguiente etapa debe combinar:

```text
repaso dirigido de puntos débiles
+
continuación de temas todavía no recorridos
+
práctica breve de Java
+
simulacro oral integral posterior
```

No es necesario repetir las evaluaciones ya cerradas.
