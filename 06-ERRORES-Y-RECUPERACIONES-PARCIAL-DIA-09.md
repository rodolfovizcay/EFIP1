# Errores y recuperaciones — progreso parcial Día 9

**Fecha:** 14/08/2026  
**Estado:** jornada pausada; evaluación pendiente

> Los códigos `P09-*` son provisionales. No se incorporan al registro canónico `E-*` hasta completar y evaluar el Día 9.

---

# 1. Recuperaciones correctas

## E-038 — Simbología DER

Respuesta correcta:

```text
Rectángulo doble → entidad débil
Línea doble      → participación total
```

**Estado provisional:** recuperado; falta comprobarlo en la evaluación final.

## E-041 — Contrato del TDA frente a implementación

Respuesta correcta:

```text
Permanece:
- política FIFO;
- encolar, desencolar, cabecera, esVacia y longitud.

Cambia:
- vector e índices;
- lista y referencias.
```

**Estado provisional:** recuperado.

## E-037 — Instancia

Respuesta:

```text
Instancia = dato concreto.
Ejemplo: OT 123, trabajo de poda.
```

Corrección terminológica:

```text
Instancia = ocurrencia concreta de una entidad.
```

**Estado provisional:** recuperado.

---

# 2. Recuperaciones parciales

## E-040 — Realización con alternativo sin conexión

Problemas observados:

- el flujo comenzó detectando la conexión antes de la solicitud del actor;
- se habló de “despachar las OT” en vez de enviar solicitudes de registro de ejecución;
- en diseño no se explicitó inicialmente el `Sincronizador`.

Regla:

```text
Mantener el objetivo Registrar ejecución de OT.
Conservar una solicitud pendiente de envío.
Informar al Operario.
Al volver la conexión, Sincronizador desencola y envía.
```

**Estado provisional:** corregido con repetición pendiente.

## E-042 — Pila, Cola y trazabilidad

Respuesta correcta:

```text
Pila = LIFO
Cola = FIFO
```

Ajuste:

```text
FIFO preserva orden.
Trazabilidad reconstruye la historia mediante registros.
```

**Estado provisional:** parcial.

## E-044 — Señales, fórmulas y muestreo

Correcto:

```text
A = amplitud
T = período
f = frecuencia
f=1/T
T=1/f
fs mínima=2·fmax
```

Error menor:

```text
250 sin unidad Hz
```

**Estado provisional:** corregido con automatización pendiente.

## E-045 — Digitalización, política y supuestos

Correcto:

- una señal analógica puede transmitirse como analógica;
- `I(E)` no decide qué enviar;
- las reglas del sistema definen los datos necesarios.

Ajuste:

```text
Elegir una forma de transmisión y declarar el supuesto que la justifica.
No declarar “un supuesto para ambas”.
```

**Estado provisional:** parcial.

## E-036 — Generalización UML

Correcto:

```text
hijo → padre
```

Ajuste pendiente:

```text
línea continua + triángulo vacío
```

**Estado provisional:** corregido con precisión verbal pendiente.

## E-039 — Asociativa frente a débil

Correcto:

```text
Asociativa → representa relación, normalmente N:M.
Débil → depende para identificarse o existir.
```

Ajuste:

```text
Un ID artificial no elimina automáticamente dependencia de existencia.
Dos FK tampoco convierten automáticamente una tabla en débil.
```

**Estado provisional:** parcial.

---

# 3. Error previo todavía abierto

## E-043 — Información, fórmula y unidades

La relación fue correcta:

```text
P↑ → incertidumbre↓ → información↓
P↓ → incertidumbre↑ → información↑
```

Pero volvió a escribirse:

```text
I(E)=log₂(1·P(E))
```

Corrección:

```text
I(E)=log₂(1/P(E))
Unidad=bits
```

**Estado provisional:** abierto.

---

# 4. Errores provisionales nuevos del Día 9

## P09-01 — `toString()` literal

Respuesta:

```java
return "Id - descripcion - Estado";
```

Problema:

- devuelve un literal fijo;
- no utiliza atributos;
- se escribió `Objetc` en vez de `Object`.

Corrección:

```java
@Override
public String toString() {
    return id + " - " + descripcion + " - " + estado;
}
```

**Estado:** corregido, requiere escritura sin ayuda.

## P09-02 — Comparación de `String` con `==`

Código:

```java
if (destinatario == "")
```

Problema:

```text
== compara referencias, no contenido textual.
```

Corrección posible:

```java
if (destinatario == null || destinatario.isBlank())
```

**Estado:** abierto.

## P09-03 — Validación que no detiene la operación

Código:

```java
validarDestinatario();
System.err.println("Enviado...");
```

Problema: se informa el error pero el envío continúa.

Soluciones:

- devolver `boolean` y verificar;
- lanzar una excepción.

**Estado:** abierto.

## P09-04 — Código Java incompleto

Faltaron:

- `@Override`;
- `toString()`;
- prueba con `List<CanalNotificacion>`;
- organización correcta de tipos públicos en archivos separados.

**Estado:** abierto.

## P09-05 — Dependencias parciales de 2FN

Primer intento:

```text
id_ot → id_operario
id_operario → fecha_asignacion
```

Corrección:

```text
id_ot → numero_ot, descripcion_ot, id_sector, nombre_sector
id_operario → nombre_operario, especialidad_operario
clave completa → estado_asignacion
```

**Estado:** corregido después de recuperación inmediata.

## P09-06 — `numero_ot` como “parte de id_ot”

Problema: `numero_ot` no forma parte de `id_ot`; depende funcionalmente de él.

Regla:

```text
id_ot → numero_ot
```

**Estado:** corregido.

## P09-07 — ID artificial confundido con entidad débil

Conclusión correcta:

```text
id_asignacion no normaliza automáticamente.
```

Razón inicial incorrecta: dependencia de existencia.

Razón correcta:

```text
La normalización depende de redundancias y dependencias funcionales.
```

**Estado:** corregido.

## P09-08 — Nombre de teléfono en plural

En `OPERARIO_TELEFONO`, cada fila contiene un valor:

```text
telefono
```

No:

```text
telefonos_operario
```

**Estado:** corregido.

---

# 5. Tarjetas obligatorias para el domingo

1. `I(E)=log₂(1/P(E))`.
2. `Object` y `toString()` con atributos.
3. `String`: `==` frente a `equals/isBlank`.
4. Validación que bloquea la operación.
5. Clase abstracta vs. interfaz.
6. Bucle polimórfico.
7. Dependencias parciales de 2FN.
8. Dependencia transitiva de 3FN.
9. PK artificial ≠ normalización.
10. Alternativo con `Sincronizador`.

---

# 6. Regla de cierre

Los errores provisionales solo se convierten en códigos canónicos después de:

```text
caso integrador
+ evaluación escrita
+ defensa oral
+ corrección final
```
