# Manifiesto — Preparación del Día 7

**Fecha preparada:** 12/08/2026  
**Jornada:** Casos de uso + Herencia + DER  
**Estado:** material listo para iniciar; jornada todavía no evaluada

---

## Archivos incluidos

1. `03-ESTADO-ACTUAL-PREPARADO-DIA-07.md`
2. `DIAS/2026-08-12_DIA-07_CASOS-DE-USO-HERENCIA-DER.md`
3. `RESUMENES/2026-08-12_RESUMEN-GUIADO-DIA-07.md`
4. `PLANTILLAS/2026-08-12_PLANTILLA-CASO-DE-USO.md`
5. `FICHAS/2026-08-12_FICHA-HERENCIA-JAVA.md`
6. `FICHAS/2026-08-12_FICHA-DER-Y-PASAJE-A-TABLAS.md`
7. `CASOS/2026-08-12_CASO-INTEGRADOR-OT-CASOS-HERENCIA-DER.md`
8. `EVALUACIONES/2026-08-12_EVALUACION-DIA-07.md`
9. `EVALUACIONES/2026-08-12_RESPUESTAS-DIA-07.md`
10. `RESUMENES/2026-08-12_CIERRE-DIA-07.md`
11. `99-MANIFIESTO-PREPARACION-DIA-07.md`

---

## Plan maestro respetado

### Mañana M1 — Análisis y Diseño

- actores;
- casos de uso;
- `include`, `extend` y generalización;
- flujos, precondiciones y postcondiciones;
- prototipo de interfaz.

### Mañana M2 — POO

- herencia;
- `extends`;
- `this` y `super`;
- miembros estáticos;
- sobrecarga y sobrescritura.

### Cierre de mañana

- diagrama de casos de uso;
- jerarquía de clases.

### Tarde T1 — Base de Datos

- DER;
- entidades;
- atributos;
- relaciones;
- cardinalidades;
- pasaje inicial a tablas.

### Tarde T2

- veinte minutos de Java;
- evaluación oral;
- resumen.

### Producto

- caso pequeño con casos de uso, clases y DER.

---

## Fuentes declaradas

- `02-PLAN-MAESTRO-HASTA-03-09.md`.
- `Analisis_y_Diseno_de_Software.md`.
- `INF382_Programacion_Orientada_a_Objetos.md`.
- `Taller_de_Algoritmos_y_Estructuras_de_Datos_I.md` como apoyo de herencia y sobrescritura.
- `INF387_Base_de_Datos_I_RESUMEN.md`.
- estado, matriz, resultados y errores acumulados hasta el Día 6.

---

## Contenido derivado de los materiales

### Casos de uso

- actor como rol;
- caso como funcionalidad que aporta valor;
- nombres verbales;
- asociación;
- generalización hijo → padre;
- `include` desde el caso base hacia el incluido;
- `extend` desde el caso de extensión hacia el base;
- precondiciones, postcondiciones y secuencias detalladas;
- prototipo para comprender la interacción.

### Herencia

- superclase y subclase;
- reutilización/especialización;
- `extends`;
- constructor de superclase mediante `super(...)`;
- `this` para la instancia actual;
- miembros estáticos;
- sobrescritura y sobrecarga;
- clase `Object`.

### DER

- entidad, atributo, relación y cardinalidad;
- simbología básica;
- entidades fuertes y débiles;
- participación;
- generalización/especialización;
- pasaje inicial de 1:N mediante FK;
- pasaje de N:M mediante tabla asociativa.

---

## Recuperaciones incorporadas

- Constructor Java: mismo nombre de clase y sin retorno.
- PDU: Unidad de Datos de Protocolo = `SDU + PCI`.
- Completo frente a verificable.
- Red/Internet: paquete.
- Enlace/Acceso: trama.
- Física: bits/señales.
- `peek`: consulta sin eliminar.
- `pop`: devuelve y elimina.

---

## Decisiones de alcance

- Se conserva el foco exacto del plan del 12/08.
- El caso de Órdenes de Trabajo conecta las tres materias sin sustituir la teoría.
- Se incluye un prototipo textual, pero no se confunde con el caso de uso.
- Se trabajan generalizaciones de actores, casos y clases distinguiendo sus modelos.
- La herencia se limita al núcleo `extends`, `super`, `this`, estáticos, sobrecarga/sobrescritura y `Object`.
- No se adelanta abstracción/interfaces/polimorfismo como bloque completo.
- El DER se limita a diseño conceptual e inicio del pasaje a tablas.
- No se adelanta normalización ni álgebra relacional.
- La tabla asociativa se presenta con advertencia sobre historial y elección de PK.
- Las respuestas y el cierre permanecen sin notas ni estados inventados.

---

## Validación documental

- [x] Estado preparado separado del estado canónico.
- [x] Guía operativa.
- [x] Resumen guiado.
- [x] Plantilla de caso de uso.
- [x] Ficha de herencia.
- [x] Ficha DER.
- [x] Caso integrado.
- [x] Evaluación escrita y oral.
- [x] Plantilla de respuestas.
- [x] Plantilla de cierre.
- [x] Fuentes declaradas.
- [x] Recuperaciones del Día 6 incorporadas.
- [x] Alcance de jornadas posteriores preservado.

---

## Regla de publicación

Este paquete **prepara** la jornada. No modifica:

- `03-ESTADO-ACTUAL.md`;
- `04-MATRIZ-DE-PROGRESO.md`;
- `05-REGISTRO-DIARIO.md`;
- `06-ERRORES-Y-RECUPERACIONES.md`;
- `99-MANIFIESTO-CIERRE.md`.

Esos archivos solo deben actualizarse después de completar la evaluación, la defensa y el cierre del Día 7.

Después de la jornada deberán agregarse:

- respuestas reales;
- resultados;
- matriz específica;
- errores y recuperaciones;
- cierre;
- estado acumulado;
- actualización canónica.

---

## Comando de inicio

> **Iniciar EFIP — 2026-08-12 — Día 7**
