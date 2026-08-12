# Estado actual — Preparado para el Día 7

**Fecha académica:** 12 de agosto de 2026  
**Etapa:** tercera jornada intensiva de vacaciones  
**Jornada:** Día 7 — Casos de uso + Herencia + DER  
**Estado:** PREPARADO, todavía no evaluado

---

## Punto de partida

El Día 6 quedó cerrado con **9,2/10 global**, incluyendo evaluación escrita y defensa oral integrada.

| Área | Estado previo relevante |
|---|---|
| Análisis y Diseño | Ingeniería de Requerimientos aplicada y defendida; actores, casos de uso y relaciones UML todavía requieren bloque formal |
| POO / Java | Fundamentos aplicados; sobrecarga/sobrescritura recuperadas; constructor, herencia, `extends`, `super` y miembros estáticos pendientes de consolidación |
| Base de Datos | Modelo relacional y claves aplicados; DER, cardinalidades de diseño y pasaje inicial a tablas todavía pendientes |
| Comunicaciones / Estructuras | PDU, paquete/trama, bits/bytes y `peek()` requieren recuperación breve, no un bloque nuevo completo |

---

## Objetivos de la jornada

1. Definir actor como rol externo que interactúa con el sistema.
2. Definir caso de uso como funcionalidad que aporta un resultado de valor a un actor.
3. Identificar límite del sistema, asociaciones y nombres verbales de casos de uso.
4. Diferenciar `include`, `extend` y generalización, incluyendo la dirección de cada relación.
5. Redactar precondición, disparador, flujo principal, flujos alternativos y postcondiciones.
6. Relacionar casos de uso con un prototipo simple de interfaz.
7. Definir herencia, superclase, subclase, especialización y reutilización.
8. Aplicar `extends`, `super`, `this`, miembros estáticos y sobrescritura en Java.
9. Mantener la diferencia entre sobrecarga y sobrescritura.
10. Definir DER, entidad, atributo, relación y cardinalidad.
11. Reconocer entidades fuertes/débiles y relaciones 1:1, 1:N y N:M en el alcance introductorio.
12. Realizar un pasaje inicial del DER al modelo relacional.
13. Integrar casos de uso, jerarquía de clases y DER en un mismo caso de Órdenes de Trabajo.

---

## Recuperaciones obligatorias

- Constructor Java = mismo nombre que la clase y **sin tipo de retorno**, ni siquiera `void`.
- PDU = **Unidad de Datos de Protocolo** = `SDU + PCI`.
- Requerimiento completo ≠ requerimiento verificable.
- Red/Internet forma **paquete**; Enlace/Acceso forma **trama**.
- Física transmite **bits/señales**, no bytes como unidad principal.
- `peek()` consulta/devuelve la cima **sin eliminarla**.

Estas recuperaciones deben resolverse al inicio, sin ocupar el bloque principal del día.

---

## Alcance controlado

### Se estudia hoy

- actores y casos de uso;
- asociación actor–caso de uso;
- `include`, `extend` y generalización;
- precondiciones, postcondiciones y flujos;
- prototipo de interfaz en relación con el caso de uso;
- herencia, superclase, subclase, `extends`, `super`, `this` y miembros estáticos;
- sobrecarga/sobrescritura como recuperación y aplicación;
- DER, entidades, atributos, relaciones, cardinalidades y pasaje inicial a tablas.

### No se abre hoy como bloque principal

- modelo de análisis con clases de interfaz/control/entidad;
- colas;
- abstracción, interfaces y polimorfismo como bloque completo;
- normalización 1FN/2FN/3FN;
- álgebra relacional;
- señales y transmisión física;
- diagramas de secuencia, estados, componentes o despliegue.

Esos contenidos pertenecen a jornadas posteriores del plan maestro.

---

## Archivos preparados

1. `DIAS/2026-08-12_DIA-07_CASOS-DE-USO-HERENCIA-DER.md`
2. `RESUMENES/2026-08-12_RESUMEN-GUIADO-DIA-07.md`
3. `PLANTILLAS/2026-08-12_PLANTILLA-CASO-DE-USO.md`
4. `FICHAS/2026-08-12_FICHA-HERENCIA-JAVA.md`
5. `FICHAS/2026-08-12_FICHA-DER-Y-PASAJE-A-TABLAS.md`
6. `CASOS/2026-08-12_CASO-INTEGRADOR-OT-CASOS-HERENCIA-DER.md`
7. `EVALUACIONES/2026-08-12_EVALUACION-DIA-07.md`
8. `EVALUACIONES/2026-08-12_RESPUESTAS-DIA-07.md`
9. `RESUMENES/2026-08-12_CIERRE-DIA-07.md`
10. `99-MANIFIESTO-PREPARACION-DIA-07.md`

---

## Condición de cierre futuro

El Día 7 podrá cerrarse después de contar con:

- recuperación inicial sin apuntes;
- caso de uso detallado;
- diagrama textual de casos de uso y relaciones justificadas;
- jerarquía Java escrita y corregida;
- DER pequeño y pasaje inicial a tablas;
- evaluación escrita;
- defensa oral;
- corrección y registro de errores;
- cierre diario.

Hasta entonces, `03-ESTADO-ACTUAL.md` conserva correctamente al Día 6 como último cierre académico.

---

## Comando de inicio

> **Iniciar EFIP — 2026-08-12 — Día 7**
