# Cierre — Caso integrador 1
## SIGO Móvil — Registrar ejecución de OT

**Fecha:** 15/08/2026  
**Estado:** **PRÁCTICA GUIADA CERRADA**  
**Evaluación de 100 puntos:** no realizada por decisión del estudiante  
**Puntaje formal:** no asignado  
**Defensa formal:** no realizada  
**Evidencia oral integrada:** realizada durante la práctica

---

# 1. Decisión

El estudiante decidió cerrar la semana sin rendir la evaluación semanal adicional porque ya contaba con cuatro evaluaciones integradas corregidas, defensas orales y suficiente evidencia práctica para determinar el nivel semanal.

El caso se considera:

```text
resuelto de forma guiada
+
utilizado como evidencia de integración
+
no calificado como examen formal
```

No se inventa una nota ni se completan respuestas que no fueron rendidas como evaluación independiente.

---

# 2. Actividades realizadas

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
- [ ] Defensa formal calificada.

---

# 3. Evidencia principal

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
ORDEN_TRABAJO/OPERARIO 1:N EJECUCION_OT según supuesto
EJECUCION_OT 0..1 SOLICITUD_PENDIENTE activa según supuesto
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

# 4. Aciertos

1. Mantuvo el objetivo `Registrar ejecución de OT`.
2. Diferenció análisis, diseño e implementación.
3. Justificó Pila LIFO y Cola FIFO.
4. Comprendió que la solicitud no se elimina antes de confirmar.
5. Aplicó polimorfismo mediante un tipo común.
6. Modeló N:M mediante `ASIGNACION_OT`.
7. Aplicó 1FN, 2FN y 3FN.
8. Explicó el recorrido TCP/IP.
9. Recuperó correctamente `I(E)=log₂(1/P(E))` al final del bloque.
10. Integró oralmente las cinco materias.

---

# 5. Ajustes observados

- el objetivo general inicial fue demasiado amplio;
- algunos RNF no eran suficientemente verificables;
- se confundió actor principal/secundario en notificaciones;
- faltaron detalles de confirmación y trazabilidad en el primer alternativo;
- se intentó desencolar antes de confirmar en una secuencia inicial;
- `ASIGNACION_OT` volvió a mezclarse parcialmente con entidad débil;
- claves de `EJECUCION_OT` y `SOLICITUD_PENDIENTE` necesitaron corrección;
- la ausencia de conexión se usó erróneamente para justificar asincronía;
- la unidad `4 kHz` se expresó oralmente una vez como `4 Hz`.

---

# 6. Resultado del caso

```text
Práctica guiada: COMPLETADA
Integración de materias: EVIDENCIADA
Examen formal: NO REALIZADO
Puntaje: NO ASIGNADO
Aprobación formal del caso: NO APLICA
```

El caso aporta evidencia cualitativa para el cierre semanal, pero no genera una nota adicional.

---

# 7. Estado del Día 9

```text
Caso integrador guiado de la semana:
completado.

Evaluación específica del Día 9:
pendiente.

Defensa específica del Día 9:
pendiente.

Día 9:
EN PAUSA.
```

No se declara el Día 9 aprobado mediante este cierre.

---

# 8. Decisión de cierre

- [x] Práctica guiada del Caso integrador cerrada.
- [x] Semana cerrada por evidencia acumulada.
- [ ] Caso integrador evaluado formalmente.
- [ ] Día 9 cerrado.

**Justificación:** las evaluaciones de los Días 5 a 8 y la práctica guiada permiten determinar el nivel semanal sin una evaluación adicional. El promedio descriptivo de las evaluaciones cerradas es 8,6/10.

---

# 9. Próximo paso

```text
Opción A:
descanso el 16/08.

Opción B:
Recuperar EFIP — 2026-08-16 — completar Día 9.
```
