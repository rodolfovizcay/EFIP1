# Estado actual — Preparado para el Día 9

**Fecha académica:** 14 de agosto de 2026  
**Etapa:** quinta jornada intensiva de vacaciones  
**Jornada:** Día 9 — Diseño + Abstracción/Polimorfismo + Normalización  
**Estado:** PREPARADO, todavía no evaluado

---

## Punto de partida

El Día 8 quedó cerrado y aprobado con **7,9/10 global**.

| Área | Evidencia vigente | Necesidad del Día 9 |
|---|---|---|
| Análisis y Diseño | Casos de uso y modelo de análisis aplicados; núcleo del análisis defendido | Pasar del modelo conceptual de análisis al modelo físico de diseño |
| POO / Java | Fundamentos y herencia aplicados | Trabajar abstracción, clase/método abstracto, interfaz, `implements` y polimorfismo |
| Base de Datos | Modelo relacional, claves y DER aplicados | Normalizar relaciones hasta 3FN y reconocer dependencias parciales/transitivas |
| Recuperación transversal | E-038 y E-040 a E-045 continúan abiertos; E-036/E-037/E-039 corregidos | Recuperación breve antes de incorporar contenido nuevo |

---

## Objetivos de la jornada

### Análisis y Diseño

1. Explicar el propósito del diseño y su relación con análisis e implementación.
2. Diferenciar modelo de análisis y modelo de diseño.
3. Reconocer los artefactos fundamentales del diseño.
4. Definir clase de diseño, subsistema de diseño e interfaz.
5. Construir una realización de caso de uso–diseño.
6. Leer y escribir un diagrama de secuencia textual.
7. Reconocer actor, objetos, líneas de vida, mensajes y focos de control.
8. Representar flujo normal y alternativo.
9. Definir estado, evento y transición.
10. Construir un diagrama de estados didáctico para una Orden de Trabajo.
11. Relacionar paquetes de análisis con subsistemas e interfaces de diseño.

### POO / Java

12. Definir abstracción en el alcance del material.
13. Diferenciar abstracción y encapsulamiento.
14. Definir clase abstracta y método abstracto.
15. Explicar por qué una clase abstracta no puede instanciarse.
16. Utilizar `abstract`, `extends` y `@Override`.
17. Definir interfaz y utilizar `implements`.
18. Comparar clase abstracta e interfaz.
19. Aplicar polimorfismo mediante una referencia de superclase o interfaz.
20. Escribir un ejemplo breve relacionado con Órdenes de Trabajo.

### Base de Datos

21. Explicar para qué se normalizan las tablas.
22. Reconocer anomalías de inserción, modificación y borrado.
23. Definir dependencia funcional.
24. Aplicar 1FN: valores atómicos y eliminación de grupos repetitivos.
25. Aplicar 2FN: dependencia de la clave completa y eliminación de dependencias parciales.
26. Aplicar 3FN: eliminación de dependencias transitivas.
27. Descomponer una relación sin perder el significado del dominio.
28. Marcar PK, FK y restricciones de unicidad relevantes.
29. Explicar por qué una PK artificial no corrige por sí sola un diseño no normalizado.

---

## Recuperación inicial obligatoria

Se recuperarán los errores activos del cierre del Día 8:

```text
E-038 — Rectángulo doble = entidad débil;
        línea doble = participación total.

E-040 — Mantener el objetivo exacto del caso;
        incluir flujo alternativo sin conexión.

E-041 — En un TDA permanece el contrato/comportamiento;
        cambia la representación interna.

E-042 — Pila=LIFO; Cola=FIFO;
        FIFO preserva orden, no trazabilidad por sí solo.

E-043 — P↑→I↓; P↓→I↑;
        I(E)=log₂(1/P(E)); unidad bits;
        bits ≠ bits/símbolo ≠ bits/segundo.

E-044 — A=amplitud; T=período; f=frecuencia;
        f=1/T; T=1/f; fs mínima=2·fmax.

E-045 — Una señal analógica puede transmitirse;
        digitalizar depende de la solución;
        la política decide qué enviar;
        el protocolo debe declararse como supuesto.
```

Recuperaciones corregidas a comprobar nuevamente:

```text
E-036 — generalización: triángulo vacío hacia el padre.
E-037 — instancia: ocurrencia concreta de una entidad.
E-039 — asociativa implementa N:M; débil depende para identificar/existir.
E-016 — incluir toString() cuando la consigna lo exige.
```

---

## Alcance controlado

### Se estudia hoy

- modelo de diseño;
- realización de caso de uso–diseño;
- diagrama de secuencia;
- diagrama de estados;
- subsistemas e interfaces;
- abstracción;
- clase y método abstractos;
- interfaz Java;
- `implements`;
- polimorfismo;
- 1FN, 2FN y 3FN;
- dependencias parciales y transitivas.

### No se abre como bloque principal

- componentes y despliegue completos;
- pruebas de arquitectura;
- excepciones y archivos Java;
- `equals/hashCode` como bloque formal;
- álgebra relacional;
- BCFN;
- triggers, cursores o procedimientos;
- redes, Ethernet, WAN y conmutación.

La BCFN aparece en el material de Base de Datos, pero el plan del Día 9 llega únicamente hasta 3FN.

---

## Productos preparados

1. `DIAS/2026-08-14_DIA-09_DISENO-ABSTRACCION-POLIMORFISMO-NORMALIZACION.md`
2. `RESUMENES/2026-08-14_RESUMEN-GUIADO-DIA-09.md`
3. `DIAGRAMAS/2026-08-14_DIAGRAMA-SECUENCIA-REGISTRAR-EJECUCION-OT.md`
4. `CODIGO/2026-08-14_EJEMPLO-POLIMORFICO-OT.md`
5. `BASE-DATOS/2026-08-14_NORMALIZACION-ASIGNACION-OT.md`
6. `TARJETAS/2026-08-14_RECUPERACION-INICIAL-DIA-09.md`
7. `CASOS/2026-08-14_CASO-INTEGRADOR-DISENO-POLIMORFISMO-NORMALIZACION.md`
8. `EVALUACIONES/2026-08-14_EVALUACION-DIA-09.md`
9. `EVALUACIONES/2026-08-14_RESPUESTAS-DIA-09.md`
10. `RESUMENES/2026-08-14_CIERRE-DIA-09.md`
11. `99-MANIFIESTO-PREPARACION-DIA-09.md`

---

## Productos exigidos por el plan

```text
Diagrama de secuencia
→ DIAGRAMAS/2026-08-14_DIAGRAMA-SECUENCIA-REGISTRAR-EJECUCION-OT.md

Ejemplo polimórfico
→ CODIGO/2026-08-14_EJEMPLO-POLIMORFICO-OT.md

Tabla normalizada
→ BASE-DATOS/2026-08-14_NORMALIZACION-ASIGNACION-OT.md
```

---

## Condición de cierre futuro

El Día 9 podrá cerrarse después de contar con:

- recuperación inicial sin apuntes;
- diagrama de secuencia propio;
- diagrama de estados breve;
- comparación modelo de análisis/modelo de diseño;
- código abstracto/polimórfico escrito y corregido;
- defensa clase abstracta frente a interfaz;
- normalización de una tabla hasta 3FN;
- evaluación escrita;
- defensa oral o distribuida registrada;
- actualización de matriz, errores, estado acumulado y manifiesto.

Hasta entonces, `03-ESTADO-ACTUAL.md` conserva correctamente al Día 8 como último cierre académico.

---

## Comando de inicio

> **Iniciar EFIP — 2026-08-14 — Día 9**
