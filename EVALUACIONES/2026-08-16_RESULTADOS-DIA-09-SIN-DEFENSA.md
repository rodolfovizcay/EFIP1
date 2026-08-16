# Resultados del Día 9 — cierre sin defensa oral
## Diseño + Abstracción/Polimorfismo + Normalización

**Jornada original:** 14/08/2026  
**Recuperación y evaluación escrita:** 16/08/2026  
**Decisión de cierre:** cerrar sin defensa oral  
**Estado:** **CERRADO DOCUMENTALMENTE — SIN NOTA GLOBAL**

---

# 1. Integridad del resultado

La evaluación oficial estaba compuesta por:

```text
Escrito: 8 puntos
Defensa oral: 2 puntos
Total previsto: 10 puntos
```

El estudiante realizó el componente escrito y decidió no realizar la defensa oral.

Por lo tanto:

- se registra el puntaje escrito real;
- se informa su equivalencia porcentual;
- no se asigna una nota global sobre 10;
- no se declara aprobado ni desaprobado el esquema completo;
- el Día 9 queda cerrado por decisión del estudiante;
- el resultado no modifica el indicador semanal de 8,6/10.

---

# 2. Resultado escrito

| Parte | Máximo | Obtenido |
|---|---:|---:|
| A — Modelo de diseño | 2,50 | **1,85** |
| B — Abstracción y Polimorfismo | 2,50 | **1,55** |
| C — Normalización | 2,50 | **1,95** |
| D — Integración | 0,50 | **0,35** |
| **Total escrito** | **8,00** | **5,70** |

```text
Resultado escrito = 5,70/8,00
Porcentaje = 71,25 %
Equivalencia del componente escrito = 7,1/10
```

> La equivalencia 7,1/10 describe únicamente el componente escrito. No reemplaza los 2 puntos de defensa que no se realizaron.

---

# 3. Defensa oral

```text
Estado: NO REALIZADA
Puntaje: NO ASIGNADO
```

La ausencia de defensa no se transforma artificialmente en `0/2`, porque la decisión documental es cerrar la jornada sin calcular una nota global.

---

# 4. Resultado global

```text
Nota global Día 9: NO ASIGNADA
Estado académico: CERRADO SIN DEFENSA ORAL
Componente escrito: APROBADO EN SU ESCALA
```

El Día 9 aporta evidencia temática a la matriz de progreso, pero no se incorpora como una quinta nota al promedio semanal.

---

# 5. Corrección por bloque

## A. Modelo de diseño — 1,85/2,50

### Aciertos

- distinguió análisis, diseño e implementación;
- reconoció artefactos del diseño;
- construyó una secuencia normal coherente;
- desarrolló correctamente el alternativo sin conexión;
- respetó el orden:

```text
cabecera()
→ envío
→ confirmación
→ trazabilidad
→ desencolar()
```

- justificó `ColaSincronizacion` como decisión de diseño.

### Ajustes

- análisis no es solamente “qué necesidades cubrir”: también modela objetos, responsabilidades y colaboraciones;
- faltó escribir la transición hacia `ANULADA`;
- `EjecucionOT` fue propuesta como subsistema, aunque es una entidad;
- faltó definir una interfaz proporcionada con operaciones concretas.

### Ejemplo corregido de estados

```text
PENDIENTE
   ── despachar ──>
DESPACHADA
   ── iniciar ──>
EN_EJECUCION
   ── finalizar [datos completos] ──>
FINALIZADA

PENDIENTE / DESPACHADA / EN_EJECUCION
   ── anular [anulación permitida] ──>
ANULADA
```

---

## B. Abstracción y Polimorfismo — 1,55/2,50

### Aciertos

- definió abstracción y encapsulamiento;
- diferenció clase abstracta e interfaz;
- aplicó `extends` e `implements`;
- comprendió el polimorfismo mediante una referencia común;
- escribió las subclases Email y Móvil.

### Errores principales

1. Se utilizó:

```java
super.validarDestinatario();
```

pero el método pertenece a la misma clase abstracta, no a la superclase `Object`.

2. La validación debe ocurrir antes de asignar el atributo.

3. Faltó `toString()`.

4. Faltó `@Override` en `registrarAuditoria()`.

5. No se desarrollaron explícitamente tipo de referencia, objeto concreto y comportamiento ejecutado.

### Constructor corregido

```java
protected CanalNotificacion(String destinatario) {
    if (destinatario == null || destinatario.isBlank()) {
        throw new IllegalArgumentException(
            "El destinatario es obligatorio"
        );
    }

    this.destinatario = destinatario;
}
```

### `toString()` corregido

```java
@Override
public String toString() {
    return getClass().getSimpleName()
        + "{destinatario='" + destinatario + "'}";
}
```

---

## C. Normalización — 1,95/2,50

### Aciertos

- identificó la violación de 1FN en `telefonos_operario`;
- identificó correctamente las dependencias parciales de 2FN;
- identificó la dependencia transitiva de 3FN;
- explicó por qué una PK artificial no normaliza automáticamente.

### Ajustes

- faltó escribir la transformación completa de 1FN;
- el modelo final quedó incompleto;
- faltaron atributos y restricciones `UNIQUE`;
- `OPERARIO_TELEFONO` requiere PK compuesta, no solo una restricción `UNIQUE`.

### Modelo final esperado

```text
SECTOR
- id_sector PK
- nombre_sector UNIQUE

ORDEN_TRABAJO
- id_ot PK
- numero_ot UNIQUE
- descripcion_ot
- id_sector FK → SECTOR.id_sector

OPERARIO
- id_operario PK
- nombre_operario
- especialidad_operario

OPERARIO_TELEFONO
- id_operario FK → OPERARIO.id_operario
- telefono
- PK(id_operario, telefono)

ASIGNACION_OT
- id_ot FK → ORDEN_TRABAJO.id_ot
- id_operario FK → OPERARIO.id_operario
- fecha_asignacion
- estado_asignacion
- PK(id_ot, id_operario, fecha_asignacion)
```

---

## D. Integración — 0,35/0,50

### Aciertos

- relacionó requisito, caso de uso, análisis, diseño, código, datos y pruebas;
- explicó el valor del polimorfismo;
- justificó la normalización.

### Omisión

Faltó integrar el flujo sin conexión:

```text
sin conexión
→ SolicitudPendiente
→ PENDIENTE_ENVIO
→ Cola FIFO
→ Sincronizador
→ cabecera()
→ envío
→ confirmación
→ trazabilidad
→ desencolar()
```

---

# 6. Nivel temático resultante

| Tema | Estado propuesto |
|---|---|
| Análisis vs. diseño vs. implementación | **Aplicado** |
| Secuencia normal | **Aplicada** |
| Alternativo sin conexión | **Aplicado** |
| Diagrama de estados | **Comprendido/Aplicado con omisión** |
| Subsistemas e interfaces | **Comprendido** |
| Abstracción | **Aplicada** |
| Clase abstracta | **Aplicada conceptualmente** |
| Interfaz | **Aplicada** |
| Polimorfismo | **Aplicado conceptualmente** |
| Java completo | **En aprendizaje** |
| 1FN | **Aplicada** |
| 2FN | **Aplicada** |
| 3FN | **Aplicada** |
| Modelo relacional final | **Comprendido/Aplicado con omisiones** |
| Integración transversal | **Aplicada** |

---

# 7. Fortalezas

1. Buena comprensión conceptual del diseño.
2. Secuencia offline segura y bien ordenada.
3. Diferencia entre necesidad FIFO y decisión de Cola.
4. Comprensión de clase abstracta, interfaz y polimorfismo.
5. Dependencias parciales y transitivas correctamente identificadas.
6. Explicación correcta de ID artificial frente a normalización.
7. Capacidad de integrar varias capas del desarrollo.

---

# 8. Puntos débiles prioritarios

1. Código Java completo y compilable.
2. Constructor y validación de `String`.
3. `toString()` con valores reales.
4. Uso consistente de `@Override`.
5. Subsistema frente a entidad.
6. Diagrama de estados completo.
7. PK, FK y `UNIQUE` del modelo final.
8. Entidad asociativa frente a entidad débil.
9. Incorporar el modo sin conexión en una explicación integradora.

El repaso detallado se encuentra en:

```text
RESUMENES/2026-08-16_REPASO-SEMANAL-PUNTOS-DEBILES.md
```

---

# 9. Decisión final

```text
Día 9: CERRADO DOCUMENTALMENTE
Evaluación escrita: REALIZADA
Defensa oral: NO REALIZADA
Nota global: NO ASIGNADA
Recuperación futura obligatoria: NO
Repaso dirigido recomendado: SÍ
```

La semana intensiva 1 permanece cerrada con indicador descriptivo `8,6/10`, calculado únicamente con los Días 5 a 8.