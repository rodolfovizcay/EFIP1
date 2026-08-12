# Resultados de evaluación — Día 7
## Casos de uso + Herencia + DER

**Fecha:** 12/08/2026  
**Materias principales:** Análisis y Diseño + Programación Orientada a Objetos + Base de Datos  
**Modalidad:** evaluación escrita + defensa distribuida durante la jornada

---

## Resultado general

| Instancia | Resultado |
|---|---:|
| Evaluación escrita | **6,53/8,00 = 8,2/10** |
| Defensa distribuida | **1,72/2,00 = 8,6/10** |
| **Resultado global** | **8,25/10 → 8,3/10** |

**Estado: APROBADO**

> La defensa se evaluó utilizando las respuestas interactivas y justificadas producidas durante los controles de casos de uso, herencia y DER. No existió una única exposición final de 8–10 minutos; por eso el cierre conserva la denominación `defensa distribuida` y no eleva automáticamente todos los temas a `DO`.

---

# 1. Evaluación escrita — 6,53/8,00

| Pregunta | Tema | Máximo | Obtenido |
|---:|---|---:|---:|
| 1 | Actor, caso de uso y límite | 0,70 | **0,64** |
| 2 | `include`, `extend` y generalización | 0,90 | **0,70** |
| 3 | Caso de uso detallado | 0,90 | **0,76** |
| 4 | Herencia, superclase y subclase | 0,70 | **0,62** |
| 5 | `extends`, `this`, `super` y `static` | 0,80 | **0,74** |
| 6 | Jerarquía Java y métodos | 1,00 | **0,86** |
| 7 | DER, conceptos y simbología | 0,80 | **0,48** |
| 8 | Modelado y cardinalidades | 0,90 | **0,84** |
| 9 | Pasaje inicial a tablas | 0,80 | **0,54** |
| 10 | Integración | 0,30 | **0,20** |
| 11 | Recuperación espaciada | 0,20 | **0,15** |
| **Total** | | **8,00** | **6,53** |

---

# 2. Parte A — Casos de uso — 2,10/2,50

## 2.1 Aciertos

- Actor definido como agente/rol externo.
- Caso de uso reconocido como función o servicio del sistema.
- Límite interno/externo correctamente diferenciado.
- Asociación actor–caso comprendida como interacción.
- Nombres de interfaz y persistencia reemplazados por nombres verbales.
- `include` asociado a comportamiento obligatorio.
- `extend` asociado a comportamiento opcional.
- Generalización asociada a relación hijo–padre.
- Actor, objetivo, disparador y precondiciones del caso `Crear Orden de Trabajo` correctamente identificados.
- Flujo principal, alternativo y excepción coherentes con el enunciado.

## 2.2 Ajustes

### Resultado de valor

Debe expresarse desde la perspectiva del actor, no como mecanismo técnico.

```text
Mejor:
El Encargado obtiene una OT creada, identificada y disponible para gestión.

Evitar como única formulación:
Persistir una fila o registro.
```

### Notación de generalización

La representación:

```text
Encargado --|> UsuarioSistema
```

es una notación textual válida para una generalización con triángulo apuntando al padre. No debe reemplazarse por una flecha común si con eso se pierde la simbología UML.

### `include` y `extend`

Las propuestas eran conceptualmente correctas cuando se interpreta la dirección:

```text
Crear OT ──<<include>>──> Validar datos obligatorios
Adjuntar fotografía ──<<extend>>──> Registrar ejecución
```

### Postcondiciones

La respuesta entregó una postcondición de éxito y una de fallo, aunque la consigna pedía dos de éxito.

```text
Éxito 1: existe una OT nueva en estado PENDIENTE.
Éxito 2: la OT tiene número/identificación y queda disponible para consulta.
Fallo: no existe una OT nueva ni quedan datos parciales.
```

---

# 3. Parte B — Herencia y Java — 2,22/2,50

## 3.1 Aciertos

- Relación conceptual `es un` aplicada correctamente.
- `Operario extends UsuarioSistema` justificado.
- `OrdenTrabajo extends Sector` rechazado correctamente.
- `extends`, `this`, `super`, `super(...)` y `static` diferenciados.
- Constructor corregido sin `void`.
- `super(...)` ubicado como primera sentencia.
- Miembros estáticos e individuales correctamente diferenciados.
- Jerarquía `UsuarioSistema → Encargado / Operario` escrita sin errores estructurales centrales.
- Contador estático incrementado desde el constructor de la superclase.
- `buscarOT(int)` y `buscarOT(String)` implementados como sobrecarga.
- `getRol()` redefinido en las subclases como sobrescritura.

## 3.2 Ajustes

### Definición de herencia

La definición debe incluir reutilización y especialización:

> La herencia permite definir una subclase a partir de una superclase, reutilizando y especializando atributos y métodos.

### `super`

No significa únicamente “la herencia”. Referencia la superclase inmediata y permite acceder a su constructor o miembros heredados accesibles.

### `toString()`

La consigna exigía sobrescribir `toString()` y el código entregado no lo incluyó.

Ejemplo esperado:

```java
@Override
public String toString() {
    return getRol();
}
```

### `@Override`

No es obligatorio para que exista sobrescritura, pero es recomendable para que el compilador verifique la signatura.

### Archivos Java

Si las tres clases se declaran `public`, normalmente deben ubicarse en archivos separados:

```text
UsuarioSistema.java
Encargado.java
Operario.java
```

Este detalle no afectó de forma relevante la nota conceptual.

---

# 4. Parte C — DER — 1,86/2,50

Este fue el bloque con mayor pérdida de puntaje.

## 4.1 Aciertos

- DER identificado como representación de estructura y relaciones de datos.
- Entidad, atributo, relación y cardinalidad reconocidos.
- Entidad fuerte asociada a identificación propia.
- Entidad débil asociada a dependencia de identificación.
- Simbología de entidad, atributo, relación, multivaluado y derivado correctamente identificada.
- Entidades `SECTOR`, `ORDEN_TRABAJO`, `OPERARIO` y `ASIGNACION_OT` seleccionadas.
- PK y FK principales correctamente ubicadas.
- `SECTOR 1:N ORDEN_TRABAJO` correctamente modelado.
- Participaciones mínimas finales correctas:
  - `SECTOR → OT = 0..N`;
  - `OT → SECTOR = 1..1`.
- `ORDEN_TRABAJO N:M OPERARIO` correctamente reconocido.
- Tabla `ASIGNACION_OT` creada con ambas FK y atributos propios.
- Escenario de un único operario vigente sin historial resuelto trasladando la FK a `ORDEN_TRABAJO`.

## 4.2 Errores y correcciones

### Instancia

La respuesta fue “cantidad de objetos”.

Corrección:

```text
Instancia
→ ocurrencia concreta de una entidad.

Ejemplo:
Entidad: OPERARIO
Instancia: Operario 145 — Juan Pérez
```

La cantidad de instancias corresponde a otra noción, no a la definición de instancia.

### Simbología

La correspondencia correcta es:

```text
Rectángulo doble → entidad débil
Línea doble      → participación total
```

En la entrega se dejó vacío `Rectángulo doble` y se vinculó `Línea doble` con entidad fuerte.

### Entidad asociativa vs. entidad débil

`ASIGNACION_OT` no debe declararse automáticamente como entidad débil.

```text
ASIGNACION_OT
→ materializa una relación N:M y conserva atributos propios.
```

Puede depender existencialmente de OT y Operario, pero la clasificación conceptual fuerte/débil debe justificarse según identificación y dependencia; no deriva simplemente de ser tabla intermedia.

### Reglas generales de pasaje

La consigna pedía reglas, no solamente ejemplos:

```text
Entidad fuerte
→ tabla con PK propia.

Relación 1:N
→ PK del lado 1 como FK en el lado N.

Relación N:M
→ tabla asociativa con las FK de ambas entidades y atributos de la relación.

Entidad débil
→ tabla con clave de la propietaria + identificación parcial o diseño equivalente según el modelo.
```

### `UNIQUE`

Faltó indicar un ejemplo relevante, como:

```text
ORDEN_TRABAJO.numero UNIQUE
```

si el número visible no puede repetirse.

### Historial de asignaciones

Cuando existe una sola asignación por pareja, puede utilizarse:

```text
PK(id_ot, id_operario)
```

Si la misma pareja puede asignarse varias veces históricamente, conviene distinguir cada ocurrencia, por ejemplo:

```text
id_asignacion PK
id_ot FK
id_operario FK
fecha_asignacion
estado_asignacion
```

---

# 5. Parte D — Integración y recuperación — 0,35/0,50

## 5.1 Integración

Aciertos:

- RF de creación y asignación identificados.
- Actor `Encargado` correcto.
- Entidades `ORDEN_TRABAJO` y `OPERARIO` relacionadas.
- Caso de prueba con datos concretos.
- Caso de uso diferenciado de método único.
- Clase Java diferenciada de tabla relacional.

Ajustes:

- La consigna solicitaba una clase **y un método**; se listaron principalmente clases y atributos.
- La cardinalidad `OPERARIO 1:N ORDEN_TRABAJO` solo es válida si se declara el supuesto de un único operario por OT. En el caso trabajado durante el día, la relación general era N:M mediante `ASIGNACION_OT`.

## 5.2 Recuperación

Correcto:

```text
Constructor Java = mismo nombre y sin tipo de retorno, ni void.
PDU = Protocol Data Unit.
Red/Internet = paquete.
Enlace/Acceso = trama.
Física = bits/señales.
peek = consulta la cima sin eliminar.
pop = devuelve y elimina la cima.
```

Pendiente:

La definición de requerimiento completo volvió a incluir “medible”, propiedad que corresponde principalmente a verificable.

```text
Completo
→ contiene toda la información necesaria.

Verificable
→ puede comprobarse objetivamente.
```

---

# 6. Defensa distribuida — 1,72/2,00

La defensa se construyó a partir de los controles interactivos respondidos durante la jornada.

| Criterio | Máximo | Obtenido |
|---|---:|---:|
| Precisión conceptual | 0,50 | **0,42** |
| Terminología académica | 0,40 | **0,33** |
| Aplicación y justificación | 0,50 | **0,46** |
| Integración entre materias | 0,40 | **0,34** |
| Claridad y orden | 0,20 | **0,17** |
| **Total** | **2,00** | **1,72** |

## Evidencia oral/interactiva

- Justificó actor, caso de uso, límite y resultado de valor.
- Diferenció `include`, `extend` y generalización, con ajuste de notación.
- Construyó un caso de uso con precondiciones, flujo, alternativo, excepción y postcondiciones.
- Explicó herencia mediante la relación `es un`.
- Justificó `super(...)`, `this`, `static`, sobrecarga y sobrescritura.
- Escribió una jerarquía Java completa y recuperó el constructor.
- Modeló 1:N y N:M.
- Justificó atributos propios de `ASIGNACION_OT`.
- Corrigió la cardinalidad `OT → SECTOR = 1..1`.
- Reconoció la limitación de la PK compuesta ante historial.

## Limitación metodológica

No se realizó una exposición final única de 8–10 minutos. Para el examen real conviene practicar una defensa continua que conecte:

```text
Necesidad/RF
→ actor y caso de uso
→ clases y métodos
→ DER y tablas
→ prueba
```

---

# 7. Avances confirmados

## Análisis y Diseño

- actor y caso de uso;
- resultado de valor;
- límite del sistema;
- asociación actor–caso;
- `include` y `extend`;
- generalización en el alcance conceptual;
- precondiciones, disparador, flujo principal, alternativo, excepción y postcondición;
- aplicación a `Crear Orden de Trabajo`.

## POO / Java

- herencia;
- superclase y subclase;
- relación `es un`;
- `extends`;
- `this` y `super`;
- constructor de subclase;
- miembro estático;
- sobrecarga y sobrescritura;
- jerarquía Java breve.

## Base de Datos

- DER básico;
- entidades, atributos y relaciones;
- cardinalidades 1:N y N:M;
- participación mínima/máxima;
- entidad fuerte/débil en concepto;
- tabla asociativa;
- atributos propios de la relación;
- pasaje inicial a tablas.

---

# 8. Recuperaciones del Día 6

| Tema | Resultado Día 7 |
|---|---|
| Constructor Java | **Consolidado**: no reapareció `void`; `super(...)` correcto |
| PDU | **Consolidado**: expansión y concepto recuperados |
| Paquete/trama | **Consolidado** |
| Bits/bytes | **Consolidado** |
| `peek`/`pop` | Correcto en los controles y la evaluación |
| Completo/verificable | **Sigue abierto**: volvió a mezclarse con “medible” |
| Alcance del modelo de datos | **Consolidado** mediante DER con varias entidades y relaciones |

---

# 9. Interpretación académica

El Día 7 confirma una buena capacidad para aplicar conceptos sobre un dominio real. Herencia fue el bloque más sólido: la jerarquía, los constructores, `super`, `this`, `static`, sobrecarga y sobrescritura quedaron correctamente aplicados.

Casos de uso quedó aplicado, aunque debe automatizarse la notación UML de generalización y la separación estricta entre valor del actor e implementación interna.

DER quedó comprendido y aplicado en 1:N y N:M, pero todavía requiere precisión en:

- instancia;
- simbología de entidad débil y participación total;
- entidad asociativa frente a entidad débil;
- reglas generales de transformación;
- elección de claves cuando existe historial.

---

# 10. Próxima recuperación obligatoria

1. Generalización UML: línea continua + triángulo vacío hacia el padre.
2. Instancia = ocurrencia concreta, no cantidad.
3. Rectángulo doble = entidad débil.
4. Línea doble = participación total.
5. Tabla asociativa ≠ entidad débil automáticamente.
6. Completo ≠ verificable.
7. Incluir `toString()` cuando la consigna lo exige.
8. Diferenciar relación N:M conceptual de su implementación relacional.

---

## Decisión

**Día 7 APROBADO con 8,3/10.**
