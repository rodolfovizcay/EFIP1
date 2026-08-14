# Manifiesto — Preparación del Día 9

**Fecha preparada:** 14/08/2026  
**Jornada:** Diseño + Abstracción/Polimorfismo + Normalización  
**Estado:** material listo para iniciar; jornada todavía no evaluada

---

## Archivos incluidos

1. `03-ESTADO-ACTUAL-PREPARADO-DIA-09.md`
2. `DIAS/2026-08-14_DIA-09_DISENO-ABSTRACCION-POLIMORFISMO-NORMALIZACION.md`
3. `RESUMENES/2026-08-14_RESUMEN-GUIADO-DIA-09.md`
4. `DIAGRAMAS/2026-08-14_DIAGRAMA-SECUENCIA-REGISTRAR-EJECUCION-OT.md`
5. `CODIGO/2026-08-14_EJEMPLO-POLIMORFICO-OT.md`
6. `BASE-DATOS/2026-08-14_NORMALIZACION-ASIGNACION-OT.md`
7. `TARJETAS/2026-08-14_RECUPERACION-INICIAL-DIA-09.md`
8. `CASOS/2026-08-14_CASO-INTEGRADOR-DISENO-POLIMORFISMO-NORMALIZACION.md`
9. `EVALUACIONES/2026-08-14_EVALUACION-DIA-09.md`
10. `EVALUACIONES/2026-08-14_RESPUESTAS-DIA-09.md`
11. `RESUMENES/2026-08-14_CIERRE-DIA-09.md`
12. `99-MANIFIESTO-PREPARACION-DIA-09.md`

---

## Plan maestro respetado

### Mañana M1 — Análisis y Diseño

- modelo de diseño;
- diagrama de secuencia;
- estados;
- subsistemas e interfaces.

### Mañana M2 — POO

- abstracción;
- clase y método abstractos;
- interfaz;
- polimorfismo.

### Cierre de mañana

- defensa clase abstracta frente a interfaz.

### Tarde T1 — Base de Datos

- 1FN;
- 2FN;
- 3FN;
- dependencias parciales y transitivas.

### Tarde T2

- código breve;
- normalización de una tabla;
- resumen.

### Productos

- diagrama de secuencia;
- ejemplo polimórfico;
- tabla normalizada.

---

## Fuentes declaradas

- `02-PLAN-MAESTRO-HASTA-03-09.md`.
- `Analisis_y_Diseno_de_Software.md`.
- `INF382_Programacion_Orientada_a_Objetos.md`.
- `INF387_Base_de_Datos_I_RESUMEN.md`.
- estado, matriz, resultados, errores y tarjetas acumulados hasta el cierre del Día 8.

No se utilizaron fuentes externas para reemplazar el contenido universitario.

---

## Contenido derivado de los materiales

### Diseño

- propósito del flujo de diseño;
- modelo físico como plano de implementación;
- modelo/clase/realización/subsistema/interfaz/despliegue/arquitectura;
- diagrama de secuencia;
- participantes, mensajes, líneas de vida y focos de control;
- estado, evento, transición, acción y actividad;
- consistencia entre métodos de cambio de estado y casos de uso;
- subsistemas e interfaces proporcionadas.

### Abstracción y Polimorfismo

- abstracción como selección de características relevantes;
- diferencia frente a encapsulamiento;
- clase abstracta no instanciable;
- constructor y comportamiento común;
- método abstracto sin cuerpo;
- interfaz como contrato;
- `implements`;
- comparación clase abstracta/interfaz;
- polimorfismo mediante referencia general y comportamiento específico.

### Normalización

- propósito y anomalías;
- dependencias funcionales;
- 1FN: valores atómicos y eliminación de repetitivos;
- 2FN: dependencia de clave completa y eliminación de parciales;
- 3FN: eliminación de transitivas;
- PK, FK y `UNIQUE`;
- advertencia sobre identificadores artificiales.

---

## Recuperaciones incorporadas

### Abierto del Día 7

```text
E-038
→ Rectángulo doble = entidad débil.
→ Línea doble = participación total.
```

### Abiertos del Día 8

```text
E-040
→ mantener Registrar ejecución;
→ incluir alternativo sin conexión.

E-041
→ permanece contrato/FIFO;
→ cambia vector/nodos.

E-042
→ Pila=LIFO;
→ Cola=FIFO;
→ trazabilidad requiere registros.

E-043
→ P↑→I↓;
→ I(E)=log₂(1/P(E));
→ unidad bits;
→ diferenciar unidades.

E-044
→ A/T/f;
→ f=1/T;
→ fs mínima=2·fmax;
→ definición de muestreo.

E-045
→ analógica puede transmitirse;
→ política decide qué enviar;
→ declarar supuesto de protocolo.
```

### Corregidos a comprobar

```text
E-036 — generalización UML.
E-037 — instancia.
E-039 — asociativa frente a débil.
E-016 — toString() cuando se solicita.
```

No se registran como consolidados antes de la evaluación.

---

## Decisiones de alcance

1. El modelo de diseño se presenta como plano físico cercano a implementación, no como código terminado.
2. Las clases de diseño incorporan operaciones y signaturas, pero los nombres concretos se declaran como supuestos didácticos.
3. El diagrama de secuencia utiliza el caso `Registrar ejecución de OT` para mantener continuidad.
4. El flujo alternativo conserva el objetivo del caso.
5. La Cola aparece como decisión de diseño/implementación para FIFO; no se inserta automáticamente en análisis.
6. El diagrama de estados utiliza un conjunto didáctico de estados de OT.
7. La clase abstracta/interfaz sigue el alcance y terminología del material universitario.
8. No se introducen características modernas de interfaces que el material no desarrolla.
9. El ejemplo Java incluye `toString()` para recuperar E-016.
10. La normalización llega hasta 3FN; BCFN queda fuera del bloque.
11. La PK compuesta de asignación incluye fecha para representar historial.
12. Se incluye alternativa con ID artificial, aclarando que no normaliza automáticamente.
13. No se adelantan álgebra relacional, triggers, cursores o procedimientos.

---

## Validación académica previa

- [x] Recuperación inicial.
- [x] Guía operativa.
- [x] Resumen guiado.
- [x] Diagrama de secuencia con flujo normal.
- [x] Alternativo sin conexión.
- [x] Diagrama de estados complementario.
- [x] Subsistemas e interfaces.
- [x] Clase abstracta y método abstracto.
- [x] Interfaz y `implements`.
- [x] Ejemplo polimórfico.
- [x] `toString()`.
- [x] Normalización 1FN/2FN/3FN.
- [x] Dependencias parciales/transitivas.
- [x] Caso integrador.
- [x] Evaluación escrita y oral.
- [x] Plantilla de respuestas.
- [x] Plantilla de cierre.

---

## Regla de publicación

Este paquete **prepara** el Día 9. No modifica:

- `03-ESTADO-ACTUAL.md`;
- `04-MATRIZ-DE-PROGRESO.md`;
- `05-REGISTRO-DIARIO.md`;
- `06-ERRORES-Y-RECUPERACIONES.md`;
- `99-MANIFIESTO-CIERRE.md`.

Esos archivos solo deben actualizarse después de:

- completar la jornada;
- guardar respuestas reales;
- corregir la evaluación;
- registrar la defensa;
- revisar errores y recuperaciones;
- aprobar el cierre documental.

---

## Condición de uso de los productos

Los productos preparados no se registran automáticamente como completados por el estudiante.

Durante el cierre se deberá distinguir:

```text
Archivo existente
Archivo usado como guía
Producto resuelto por el estudiante
Producto defendido oralmente
```

---

## Próxima acción

1. Revisar el PR de preparación.
2. Fusionarlo únicamente como material de estudio.
3. Iniciar con:

> **Iniciar EFIP — 2026-08-14 — Día 9**

4. Comenzar por las tarjetas de recuperación.
5. Cerrar documentalmente solo después de evaluar.
