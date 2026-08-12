# Caso integrador — Día 7
## Casos de uso + Herencia + DER

**Fecha:** 12/08/2026  
**Modalidad:** resolución escrita + Java breve + defensa oral

---

# Situación

Una cooperativa necesita administrar Órdenes de Trabajo desde una aplicación web y móvil.

Los **Encargados** crean y programan OT. Los **Operarios** consultan las OT asignadas y registran su ejecución. Ambos son usuarios del sistema y deben autenticarse.

Al crear una OT se deben registrar obligatoriamente:

- servicio;
- sector responsable;
- descripción;
- prioridad.

Una OT nueva nace en estado `PENDIENTE`.

Al registrar una ejecución, el Operario puede adjuntar una fotografía, pero no es obligatorio. Una OT pertenece a un único sector. Una OT puede tener varios operarios asignados y un operario puede participar en varias OT. La asignación debe conservar fecha y estado.

---

# Supuestos iniciales

1. La autenticación existe como comportamiento común obligatorio para las funciones protegidas.
2. `Adjuntar fotografía` es opcional durante `Registrar ejecución`.
3. Encargado y Operario son especializaciones de un usuario general.
4. La relación OT–Operario es N:M.
5. La creación de OT exige un sector válido.

Estos supuestos deben revisarse durante la resolución. Si se modifica uno, registrar el impacto.

---

# Parte A — Actores y límite

## 1. Actores

Identificá:

- actor general;
- actores especializados;
- cualquier sistema externo necesario;
- responsabilidades de cada uno.

| Actor | Tipo | Responsabilidad | Casos principales |
|---|---|---|---|
| | General/especializado/externo | | |
| | | | |
| | | | |

## 2. Límite

### Dentro del sistema

-

### Fuera del sistema

-

### Elementos que no son actores

1.
2.
3.

---

# Parte B — Casos de uso

## 3. Casos candidatos

Proponer al menos seis casos con nombre verbal.

| Código | Nombre | Actor principal | Resultado de valor |
|---|---|---|---|
| CU-01 | | | |
| CU-02 | | | |
| CU-03 | | | |
| CU-04 | | | |
| CU-05 | | | |
| CU-06 | | | |

## 4. Relaciones

### Asociación

| Actor | Caso | Justificación |
|---|---|---|
| | | |

### `include`

Propuesta inicial:

```text
Crear OT <<include>> Validar datos obligatorios
```

Completá:

| Caso base | Caso incluido | Por qué es obligatorio | Dirección |
|---|---|---|---|
| | | | base → incluido |

### `extend`

Propuesta inicial:

```text
Adjuntar fotografía <<extend>> Registrar ejecución
```

Completá:

| Extensión | Caso base | Condición | Dirección |
|---|---|---|---|
| | | | extensión → base |

### Generalización

| Hijo | Padre | Qué hereda/especializa |
|---|---|---|
| | | |

## 5. Detección de errores

Indicá por qué serían incorrectas estas propuestas:

1. `Validar datos obligatorios <<include>> Crear OT`.
2. `Registrar ejecución <<extend>> Adjuntar fotografía`.
3. `OrdenTrabajo` como actor.
4. `Pantalla de creación` como nombre del caso principal.
5. `Sector` como subclase de `OrdenTrabajo`.

---

# Parte C — Caso de uso detallado

Completar `Crear Orden de Trabajo`.

## 6. Identificación

```text
Código:
Nombre:
Actor principal:
Objetivo:
Resultado de valor:
Disparador:
```

## 7. Precondiciones

1.
2.
3.

## 8. Flujo principal

| Paso | Actor | Sistema |
|---:|---|---|
| 1 | | |
| 2 | | |
| 3 | | |
| 4 | | |
| 5 | | |
| 6 | | |
| 7 | | |

## 9. Flujo alternativo

Crear un alternativo para fecha programada opcional.

```text
Paso de origen:
Condición:
A1.
A2.
Retorno:
```

## 10. Excepción

Crear una excepción por sector faltante o inválido.

```text
Paso de origen:
E1.
E2.
Postcondición de fallo:
```

## 11. Postcondiciones

### Éxito

1.
2.

### Fallo

1.
2.

## 12. Prototipo textual

```text
[CREAR ORDEN DE TRABAJO]

Servicio:           [____________ v]
Sector responsable: [____________ v]
Descripción:        [______________]
Prioridad:          [____________ v]
Fecha programada:   [______________]

[Guardar OT] [Cancelar]
```

Analizá:

- campos obligatorios;
- mensaje ante error;
- correspondencia con el flujo;
- qué parte es decisión de interfaz y qué parte es requerimiento.

---

# Parte D — Herencia y Java

## 13. Jerarquía

Diseñar:

```text
UsuarioSistema
├── Encargado
└── Operario
```

Indicar:

| Clase | Atributos comunes/específicos | Métodos |
|---|---|---|
| UsuarioSistema | | |
| Encargado | | |
| Operario | | |

## 14. Relación “es un”

Explicar:

```text
Encargado es un UsuarioSistema porque...
Operario es un UsuarioSistema porque...
```

## 15. Java

Escribir sin copiar:

```java
public class UsuarioSistema {
    // atributos privados
    // miembro static justificado
    // constructor correcto
    // getRol()
    // toString()
}
```

```java
public class Encargado extends UsuarioSistema {
    // constructor con super(...)
    // getRol() sobrescrito
    // programarOT(...)
}
```

```java
public class Operario extends UsuarioSistema {
    // atributo específico
    // constructor con super(...) y this
    // getRol() sobrescrito
    // registrarEjecucion(...)
}
```

## 16. Sobrecarga

Agregar dos versiones de búsqueda:

```java
buscarOT(int numero)
buscarOT(String texto)
```

Explicar por qué es sobrecarga y no sobrescritura.

## 17. Preguntas de código

1. ¿Por qué `super(...)` debe ejecutarse primero?
2. ¿Qué diferencia hay entre `this` y `super`?
3. ¿Qué dato merece ser `static`?
4. ¿Qué método proviene de `Object`?
5. ¿Qué error hay en `public void Operario(...)`?

---

# Parte E — DER

## 18. Entidades

Identificar entidades y atributos.

| Entidad | Identificador | Atributos | Fuerte/débil |
|---|---|---|---|
| | | | |
| | | | |
| | | | |

## 19. Relaciones

| Entidad A | Relación verbal | Entidad B | Cardinalidad | Participación/supuesto |
|---|---|---|---|---|
| | | | | |
| | | | | |

## 20. DER textual

Completar:

```text
SECTOR ___ ───── ___ ORDEN_TRABAJO

ORDEN_TRABAJO ___ ───── ___ OPERARIO
                    mediante _____________
```

## 21. Relación asociativa

Definir atributos de `ASIGNACION_OT`.

```text
ASIGNACION_OT
- 
- 
- 
- 
```

Explicar por qué esos atributos no pertenecen exclusivamente a OT ni a Operario.

## 22. Pasaje inicial a tablas

```text
SECTOR(
)

ORDEN_TRABAJO(
)

OPERARIO(
)

ASIGNACION_OT(
)
```

Marcar:

- PK;
- FK;
- restricciones `UNIQUE` necesarias;
- supuestos sobre historial.

## 23. Cambio de supuesto

Analizar impacto:

> Cada OT puede tener solamente un operario vigente.

Responder:

1. ¿La relación sigue siendo N:M?
2. ¿Se mantiene `ASIGNACION_OT`?
3. ¿Qué pasa si necesitamos historial de reasignaciones?
4. ¿Dónde quedaría la FK en una versión sin historial?

---

# Parte F — Integración

## 24. Trazabilidad

Completar:

```text
Necesidad:
RF:
Caso de uso:
Actor:
Clase/método:
Entidad/tabla:
Caso de prueba:
```

## 25. Relaciones entre modelos

Explicar por qué:

- un actor no es necesariamente una clase persistida;
- un caso de uso no equivale a un método único;
- una clase Java no equivale exactamente a una tabla;
- una relación N:M requiere una decisión de persistencia;
- cambiar una regla de negocio puede impactar casos, clases y DER.

---

# Parte G — Recuperación breve

Completar sin mirar:

```text
Constructor Java =
PDU =
Completo =
Verificable =
Red/Internet forma =
Enlace/Acceso forma =
Física transmite =
peek() =
pop() =
```

---

# Defensa oral

Preparar una exposición de 8–10 minutos:

> Explique cómo la necesidad de crear, programar y ejecutar Órdenes de Trabajo se representa mediante actores y casos de uso, cómo los roles comunes se modelan con herencia en Java y cómo los datos se organizan en un DER y se transforman inicialmente en tablas. Justifique `include`, `extend`, `super(...)`, un miembro estático, la cardinalidad 1:N y la tabla asociativa de la relación N:M.

---

# Criterios de revisión

- [ ] Actores como roles externos.
- [ ] Casos con resultado de valor.
- [ ] `include` obligatorio y dirección correcta.
- [ ] `extend` opcional y dirección correcta.
- [ ] Generalización hijo → padre.
- [ ] Precondiciones y postcondiciones válidas.
- [ ] Jerarquía “es un”.
- [ ] Constructor sin retorno.
- [ ] `super(...)` primero.
- [ ] Sobrescritura y sobrecarga diferenciadas.
- [ ] Entidades y atributos correctamente separados.
- [ ] Cardinalidades justificadas.
- [ ] FK en lado N para 1:N.
- [ ] Tabla asociativa para N:M.
- [ ] Supuestos declarados.
- [ ] Trazabilidad entre modelos.
