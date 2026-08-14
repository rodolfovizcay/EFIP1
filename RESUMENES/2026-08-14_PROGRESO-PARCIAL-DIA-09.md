# Resumen de progreso parcial — Día 9
## Diseño + Abstracción/Polimorfismo + Normalización

**Fecha:** 14/08/2026  
**Estado:** EN PAUSA  
**Motivo:** cansancio  
**Evaluación:** pendiente  
**Defensa:** pendiente  
**Nota:** no asignada

---

# 1. Resumen ejecutivo

El Día 9 avanzó en los tres bloques principales del plan:

```text
Modelo de diseño
Abstracción/Polimorfismo
Normalización hasta 3FN
```

La práctica guiada llegó hasta el control completo de Normalización. Se decidió pausar antes del caso integrador y de la evaluación oficial.

---

# 2. Modelo de diseño

## Comprendido y aplicado

- análisis = estructura conceptual;
- diseño = plano próximo a implementación;
- implementación = código y componentes ejecutables;
- servicios, repositorios y colas como decisiones de diseño;
- participante, línea de vida, mensaje y foco de control;
- secuencia temporal del registro de ejecución;
- alternativo por falta de conexión;
- FIFO como necesidad y `ColaSincronizacion` como solución posible.

## Secuencia resuelta

```text
Operario carga datos
→ AppEjecucion solicita registrar
→ EjecucionService consulta la OT
→ verifica estado
→ EjecucionRepository guarda
→ AppEjecucion informa confirmación
```

## Pendiente

- diagrama de estados escrito por el estudiante;
- caso integrador con subsistemas e interfaces;
- secuencia completa con retornos y `Sincronizador`.

---

# 3. Abstracción y Polimorfismo

## Comprendido y aplicado

```text
Abstracción
→ características esenciales.

Encapsulamiento
→ protección del estado.

Clase abstracta
→ estado, constructor, métodos comunes y abstractos.

Interfaz
→ contrato.

extends
→ herencia.

implements
→ cumplimiento de contrato.

Polimorfismo
→ misma referencia y llamada, comportamiento según objeto concreto.
```

## Código escrito

El estudiante creó:

```text
Auditable
CanalNotificacion
NotificacionEmail
NotificacionMovil
```

La estructura principal fue correcta.

## Errores detectados

- comparación de `String` con `==`;
- validación que no detiene el envío;
- ausencia de `toString()`;
- falta de `@Override`;
- varias clases públicas en el mismo archivo;
- falta de la prueba polimórfica con una colección.

---

# 4. Normalización

## Primera Forma Normal

```text
telefonos_operario
→ viola atomicidad
→ se crea OPERARIO_TELEFONO
```

## Segunda Forma Normal

Clave didáctica:

```text
(id_ot, id_operario, fecha_asignacion)
```

Dependencias recuperadas:

```text
id_ot
→ numero_ot, descripcion_ot, id_sector, nombre_sector

id_operario
→ nombre_operario, especialidad_operario

clave completa
→ estado_asignacion
```

## Tercera Forma Normal

```text
id_ot → id_sector
id_sector → nombre_sector
```

Dependencia transitiva eliminada mediante:

```text
SECTOR
```

## Modelo final

```text
SECTOR
ORDEN_TRABAJO
OPERARIO
OPERARIO_TELEFONO
ASIGNACION_OT
```

## Regla importante

```text
Agregar id_asignacion
≠
normalizar automáticamente
```

---

# 5. Fortalezas del día

1. Buena comprensión de análisis/diseño/implementación.
2. Secuencia normal ordenada correctamente.
3. Clase abstracta e interfaz aplicadas en Java.
4. Polimorfismo explicado correctamente.
5. Anomalías clasificadas sin errores.
6. 1FN y 3FN sólidas.
7. Recuperación efectiva de 2FN después del error inicial.
8. Esquema final normalizado coherente.

---

# 6. Debilidades que deben recuperarse

1. Fórmula de información.
2. `toString()` con atributos reales.
3. Comparación de `String`.
4. Validaciones que bloqueen operaciones inválidas.
5. Alternativo con `Sincronizador` explícito.
6. Dependencias parciales sin ayuda.
7. ID artificial frente a normalización.
8. Generalización UML: “triángulo vacío”.
9. Asociativa frente a débil.
10. Unidades en cálculos.

---

# 7. Pendientes para el domingo

```text
Tarjetas
→ 15 min

Normalización
→ 15 min

POO abstracta/interfaz/polimorfismo
→ 15 min

Caso integrador
→ 20 min

Evaluación escrita
→ 30 min

Defensa oral
→ 10 min
```

---

# 8. Estado documental

```text
Día 9
→ progreso documentado
→ no evaluado
→ no aprobado todavía
→ no cerrado
```

El estado canónico del repositorio debe permanecer en el cierre del Día 8 hasta completar el proceso evaluativo.
