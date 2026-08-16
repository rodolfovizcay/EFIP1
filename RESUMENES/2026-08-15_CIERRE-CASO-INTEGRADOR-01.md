# Cierre — Caso integrador 1 y Semana intensiva 1
## SIGO Móvil — Registrar ejecución de OT

**Cierre inicial:** 15/08/2026  
**Actualización:** 16/08/2026  
**Práctica guiada:** **CERRADA**  
**Evaluación de 100 puntos:** no realizada por decisión del estudiante  
**Puntaje formal del caso:** no asignado  
**Semana:** **CERRADA POR EVIDENCIA ACUMULADA**  
**Día 9:** **CERRADO SIN DEFENSA ORAL**

---

# 1. Decisión

El estudiante decidió cerrar la semana sin rendir una evaluación semanal adicional porque ya contaba con cuatro evaluaciones completas, defensas, recuperaciones y suficiente evidencia práctica.

Posteriormente, el 16/08 completó la evaluación escrita del Día 9 y decidió cerrarlo sin defensa oral.

```text
Caso integrador 1
→ práctica guiada completa
→ sin nota formal

Día 9
→ escrito realizado
→ defensa no realizada
→ sin nota global

Semana
→ cerrada por evidencia acumulada
→ indicador descriptivo 8,6/10
```

---

# 2. Actividades del Caso integrador

- [x] Recuperación inicial.
- [x] Problema y objetivos.
- [x] RF, RNF y reglas de negocio.
- [x] Actores y casos de uso.
- [x] `include`, `extend` y generalización.
- [x] Caso detallado `Registrar ejecución de OT`.
- [x] Flujo principal.
- [x] Alternativo sin conexión.
- [x] Excepción por estado.
- [x] Medición opcional.
- [x] Modelo de análisis.
- [x] Modelo de diseño.
- [x] Secuencia sin conexión.
- [x] Pila/LIFO.
- [x] Cola/FIFO.
- [x] FIFO frente a trazabilidad.
- [x] Diseño POO conceptual.
- [x] Polimorfismo explicado.
- [x] DER y cardinalidades.
- [x] Pasaje a relaciones.
- [x] 1FN, 2FN y 3FN.
- [x] Arquitectura TCP/IP.
- [x] Cálculos de información, frecuencia y muestreo.
- [x] Integración oral de las cinco materias.
- [ ] Evaluación semanal formal de 100 puntos.

---

# 3. Evidencia del Caso integrador

## Análisis y Diseño

```text
Problema:
registrar ejecuciones móviles con conectividad intermitente.

Caso central:
Registrar ejecución de OT.

Análisis:
AppRegistrarEjecucion, ControlRegistrarEjecucion,
OrdenTrabajo, EjecucionOT y SolicitudPendiente.

Diseño:
AppEjecucion, EjecucionService, repositorios,
ColaSincronizacion y Sincronizador.
```

## POO y Estructuras

```text
Pila:
deshacer la última modificación no confirmada.

Cola:
procesar pendientes por orden de llegada.

Polimorfismo:
CanalNotificacion con Email y Móvil.

Auditoría:
interfaz Auditable.
```

## Base de Datos

```text
SECTOR 1:N ORDEN_TRABAJO
ORDEN_TRABAJO N:M OPERARIO mediante ASIGNACION_OT
OPERARIO 1:N OPERARIO_TELEFONO
```

```text
1FN:
separar teléfonos.

2FN:
separar datos de OT y Operario de ASIGNACION_OT.

3FN:
separar nombre_sector mediante SECTOR.
```

## Comunicaciones

```text
Aplicación→Transporte→Internet→Acceso→Física
Datos→Segmento→Paquete→Trama→Bits
PDU=SDU+PCI
Switch=C2/MAC/trama
Router=C3/IP/paquete
```

```text
P(E)=1/16 → I(E)=4 bits
T=0,002 s → f=500 Hz
fmax=4 kHz → fs mínima=8 k muestras/s
```

---

# 4. Resultado semanal

| Jornada completa | Resultado |
|---|---:|
| Día 5 | 9,0/10 |
| Día 6 | 9,2/10 |
| Día 7 | 8,3/10 |
| Día 8 | 7,9/10 |
| **Promedio descriptivo** | **8,6/10** |

```text
Semana intensiva 1:
CERRADA

Nivel:
ALTO / APROBADO

Examen semanal:
NO REALIZADO
```

---

# 5. Evidencia adicional del Día 9

| Parte escrita | Máximo | Obtenido |
|---|---:|---:|
| Modelo de diseño | 2,50 | 1,85 |
| Abstracción/Polimorfismo | 2,50 | 1,55 |
| Normalización | 2,50 | 1,95 |
| Integración | 0,50 | 0,35 |
| **Total escrito** | **8,00** | **5,70** |

```text
Escrito Día 9 = 5,70/8,00
Porcentaje = 71,25 %
Defensa = no realizada
Nota global = no asignada
```

El resultado no modifica el indicador 8,6 porque no corresponde a una evaluación completa comparable.

---

# 6. Aciertos semanales

1. Mantuvo el objetivo `Registrar ejecución de OT`.
2. Diferenció análisis, diseño e implementación.
3. Justificó Pila LIFO y Cola FIFO.
4. Aplicó la secuencia segura de sincronización.
5. Comprendió clase abstracta, interfaz y polimorfismo.
6. Modeló N:M mediante `ASIGNACION_OT`.
7. Aplicó 1FN, 2FN y 3FN.
8. Explicó el recorrido TCP/IP.
9. Recuperó `I(E)=log₂(1/P(E))`.
10. Integró las cinco materias.

---

# 7. Puntos débiles

- código Java completo y compilable;
- validación de `String` y uso de `super`;
- `toString()` y `@Override`;
- entidad frente a subsistema;
- diagrama de estados completo;
- asociativa frente a débil;
- modelo final con PK/FK/UNIQUE;
- supuestos de transmisión;
- DCL/TCL y algoritmos de ordenación.

Documento de repaso:

```text
RESUMENES/2026-08-16_REPASO-SEMANAL-PUNTOS-DEBILES.md
```

---

# 8. Estado final

```text
Caso integrador 1:
PRÁCTICA GUIADA CERRADA
SIN NOTA FORMAL

Semana intensiva 1:
CERRADA POR EVIDENCIA ACUMULADA
INDICADOR 8,6/10

Día 9:
CERRADO SIN DEFENSA ORAL
ESCRITO 5,70/8,00
NOTA GLOBAL NO ASIGNADA
```

---

# 9. Evidencia

- `EVALUACIONES/2026-08-15_RESULTADO-SEMANAL-POR-EVIDENCIA.md`
- `EVIDENCIAS/2026-08-15_EVIDENCIA-GUIADA-CASO-INTEGRADOR-01.md`
- `EVALUACIONES/2026-08-16_RESPUESTAS-EVALUACION-DIA-09.md`
- `EVALUACIONES/2026-08-16_RESULTADOS-DIA-09-SIN-DEFENSA.md`
- `RESUMENES/2026-08-14_CIERRE-DIA-09.md`
- `RESUMENES/2026-08-16_REPASO-SEMANAL-PUNTOS-DEBILES.md`

---

# 10. Próximo paso

Continuar el plan con temas no recorridos y utilizar el repaso dirigido como recuperación espaciada. No es necesario volver a rendir el examen semanal omitido ni la defensa específica del Día 9.
