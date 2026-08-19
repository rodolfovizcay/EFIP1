# Manifiesto — Preparación Día 12

## 19/08/2026 — Implementación + Archivos Java + Enlace de datos

**Estado:** **PREPARADO — NO INICIADO**

---

# 1. Base académica

- Día 11 cerrado y aprobado con `9,2/10`;
- recuperación oral de excepciones completada;
- estado canónico posterior al Día 11 preservado;
- plan maestro vigente para el 19/08/2026;
- materiales universitarios de Análisis y Diseño, POO y Comunicaciones.

---

# 2. Trazabilidad

| Contenido | Clasificación | Fuente principal |
|---|---|---|
| modelo y flujo de implementación | respaldado | Análisis y Diseño |
| componente, subsistema, interfaz y construcción | respaldado | Análisis y Diseño |
| nodo, modelo y diagrama de despliegue | respaldado | Análisis y Diseño |
| excepción propia y `try/catch` | respaldado | POO |
| funciones de protocolos y PDU | respaldado | Comunicaciones |
| HDLC, PPP y trama | respaldado | Comunicaciones |
| Ethernet, LLC, MAC e IEEE 802.x | respaldado | Comunicaciones |
| STP frente a enlaces redundantes | respaldado | Comunicaciones |
| servidor propio frente a contratado | ampliación planificada | plan maestro |
| `Path`, `Files`, UTF-8 y `try-with-resources` | ampliación práctica | plan maestro / Java estándar |
| traducción de excepción con causa | ampliación práctica | integración Java |
| aprendizaje, inundación y envejecimiento MAC | ampliación planificada | plan maestro |
| STP detallado y bucle de routing inicial | ampliación planificada | plan maestro |

---

# 3. Archivos creados

1. `03-ESTADO-ACTUAL-PREPARADO-DIA-12.md`
2. `DIAS/2026-08-19_DIA-12_IMPLEMENTACION-ARCHIVOS-ENLACE.md`
3. `TARJETAS/2026-08-19_RECUPERACION-INICIAL-DIA-12.md`
4. `FICHAS/2026-08-19_FICHA-IMPLEMENTACION-DESPLIEGUE-INFRAESTRUCTURA.md`
5. `DIAGRAMAS/2026-08-19_MAPA-UML-CODIGO-COMPONENTE-NODO.md`
6. `FICHAS/2026-08-19_FICHA-ARCHIVOS-EXCEPCIONES-JAVA.md`
7. `CODIGO/DemoDia12.java`
8. `CODIGO/2026-08-19_ARCHIVOS-EXCEPCIONES-JAVA.md`
9. `FICHAS/2026-08-19_FICHA-ENLACE-DATOS-ETHERNET.md`
10. `FICHAS/2026-08-19_FICHA-SWITCH-TABLA-MAC-STP.md`
11. `DIAGRAMAS/2026-08-19_FLUJO-SWITCH-MAC-STP.md`
12. `CASOS/2026-08-19_CASO-INTEGRADOR-IMPLEMENTACION-ARCHIVOS-ETHERNET.md`
13. `EVALUACIONES/2026-08-19_EVALUACION-DIA-12.md`
14. `EVALUACIONES/2026-08-19_RESPUESTAS-DIA-12.md`
15. `RESUMENES/2026-08-19_RESUMEN-GUIADO-DIA-12.md`
16. `RESUMENES/2026-08-19_CIERRE-DIA-12.md`
17. `99-MANIFIESTO-PREPARACION-DIA-12.md`

---

# 4. Cobertura del paquete

```text
recuperación espaciada
→ teoría guiada
→ mapas de trazabilidad
→ código ejecutable
→ simulación de switch
→ caso integrador
→ evaluación y respuestas
→ plantilla de cierre
```

La guía incluye núcleo de 5,5 horas y actividades adicionales. Si no se completan, se registrarán como pendientes y no como dominio.

---

# 5. Validaciones ejecutadas

- [x] `DemoDia12.java` compila y se ejecuta en modo archivo fuente;
- [x] la salida coincide exactamente con la documentada;
- [x] el archivo generado conserva `módem` en UTF-8;
- [x] evaluación y respuesta usan la misma numeración y puntajes;
- [x] el puntaje total suma 10;
- [x] los bloques Markdown están balanceados;
- [x] los 16 documentos Markdown se procesan como GFM sin error;
- [x] las referencias internas apuntan a archivos existentes;
- [x] no se modificaron archivos canónicos;
- [x] no se declaró contenido como estudiado;
- [x] `git diff --check` finaliza sin errores.

El entorno de preparación no incluye `javac`; la compilación y ejecución se validaron con el modo de archivo fuente de `java`, que produjo la salida y el archivo esperados.

---

# 6. Estado canónico preservado

```text
03-ESTADO-ACTUAL.md             → sin modificar
04-MATRIZ-DE-PROGRESO.md        → sin modificar
05-REGISTRO-DIARIO.md           → sin modificar
06-ERRORES-Y-RECUPERACIONES.md  → sin modificar
99-MANIFIESTO-CIERRE.md         → sin modificar
```

No se crea todavía:

- resultado del Día 12;
- actualización de matriz;
- actualización de errores;
- cierre canónico;
- nota o condición de aprobación.

---

# 7. Publicación

La preparación local no implica publicación. Cualquier `push` o PR del Día 12 requiere autorización explícita separada.

---

# 8. Inicio

```text
Comenzar Día 12
```

El cierre debe conservar respuestas reales, correcciones, tiempo, resultado y pendientes antes de actualizar el estado acumulativo.
