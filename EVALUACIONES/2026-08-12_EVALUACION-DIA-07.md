# Evaluación EFIP I — Día 7
## Casos de uso + Herencia + DER

**Fecha:** 12/08/2026  
**Modalidad:** sin apuntes  
**Tiempo máximo escrito:** 50 minutos  
**Puntaje escrito:** 8 puntos  
**Defensa oral:** 2 puntos  
**Total:** 10 puntos

---

# Instrucciones

- Responder con terminología académica.
- Diferenciar definición, ejemplo y justificación.
- Declarar supuestos cuando el enunciado no determine una cardinalidad o comportamiento.
- No borrar respuestas incorrectas después de entregar.
- En Java, priorizar estructura correcta y reglas centrales.
- En el DER, marcar PK, FK y cardinalidades.

---

# Parte A — Casos de uso — 2,5 puntos

## 1. Actor, caso de uso y límite — 0,7 puntos

Definí:

- actor;
- caso de uso;
- resultado de valor;
- límite del sistema;
- asociación actor–caso.

Después explicá por qué estos nombres no son buenos casos de uso:

```text
Pantalla OT
Botón Guardar
Tabla OrdenTrabajo
```

Redactá una alternativa correcta para cada uno cuando sea posible.

---

## 2. `include`, `extend` y generalización — 0,9 puntos

Definí y diferenciá:

- `include`;
- `extend`;
- generalización de actores o casos.

Para cada relación indicá:

- cuándo se utiliza;
- si el comportamiento es obligatorio u opcional;
- dirección de la flecha/dependencia.

Analizá estas propuestas:

```text
Crear OT <<include>> Validar datos obligatorios
Adjuntar fotografía <<extend>> Registrar ejecución
Encargado --|> UsuarioSistema
```

Justificá si son correctas.

---

## 3. Caso de uso detallado — 0,9 puntos

Para el caso `Crear Orden de Trabajo`, redactá:

- actor principal;
- objetivo;
- resultado de valor;
- disparador;
- dos precondiciones;
- flujo principal de al menos seis pasos;
- un flujo alternativo;
- una excepción;
- dos postcondiciones de éxito;
- una postcondición de fallo.

Reglas del caso:

- servicio, sector, descripción y prioridad son obligatorios;
- una OT nueva nace `PENDIENTE`;
- la fecha programada es opcional;
- no debe quedar una OT parcial si falta el sector.

---

# Parte B — Herencia y Java — 2,5 puntos

## 4. Conceptos — 0,7 puntos

Definí y diferenciá:

- herencia;
- superclase;
- subclase;
- especialización;
- reutilización;
- relación “es un”.

Explicá por qué:

```text
Operario es un UsuarioSistema
```

puede modelarse con herencia, pero:

```text
OrdenTrabajo es un Sector
```

no debería modelarse así.

---

## 5. `extends`, `this`, `super` y `static` — 0,8 puntos

Explicá:

- qué hace `extends`;
- diferencia entre `this` y `super`;
- función de `super(...)` en un constructor;
- posición obligatoria de `super(...)`;
- qué significa que un miembro sea `static`;
- un ejemplo de dato que sí debería ser estático y uno que no.

Además, corregí:

```java
public void Operario(int id, String nombre) {
    this.especialidad = "REDES";
    super(id, nombre);
}
```

---

## 6. Código y métodos — 1,0 punto

Escribí una jerarquía Java breve:

```text
UsuarioSistema
├── Encargado
└── Operario
```

Debe incluir:

- atributos privados comunes;
- un miembro estático justificado;
- constructor correcto de la superclase;
- constructores de subclases con `super(...)`;
- un atributo específico con `this`;
- método `getRol()` sobrescrito en ambas subclases;
- `toString()` sobrescrito;
- dos versiones sobrecargadas de `buscarOT(...)`.

Después explicá por qué `getRol()` es sobrescritura y `buscarOT(...)` es sobrecarga.

---

# Parte C — DER — 2,5 puntos

## 7. Conceptos y simbología — 0,8 puntos

Definí:

- DER;
- entidad;
- instancia;
- atributo;
- relación;
- cardinalidad;
- entidad fuerte;
- entidad débil.

Relacioná:

```text
Rectángulo
Elipse
Rombo
Elipse doble
Elipse discontinua
Rectángulo doble
Línea doble
```

con su significado.

---

## 8. Modelado y cardinalidades — 0,9 puntos

Caso:

- cada OT pertenece obligatoriamente a un sector;
- un sector puede tener cero o muchas OT;
- una OT puede asignarse a varios operarios;
- un operario puede participar en varias OT;
- la asignación registra fecha y estado.

Realizá un DER textual con:

- `SECTOR`;
- `ORDEN_TRABAJO`;
- `OPERARIO`;
- la relación/asociación necesaria;
- cardinalidades mínimas y máximas cuando puedan determinarse;
- atributos principales e identificadores.

Explicá por qué `fecha_asignacion` pertenece a la relación OT–Operario.

---

## 9. Pasaje inicial a tablas — 0,8 puntos

Convertí el DER anterior a tablas.

Para cada tabla indicá:

- PK;
- FK;
- restricciones `UNIQUE` relevantes;
- atributos de la relación asociativa.

Explicá las reglas generales:

```text
Entidad fuerte →
Relación 1:N   →
Relación N:M   →
Entidad débil  →
```

Finalmente analizá qué cambiaría si cada OT solo pudiera tener un operario vigente y no se necesitara historial.

---

# Parte D — Integración y recuperación — 0,5 puntos

## 10. Integración — 0,3 puntos

Para la funcionalidad `Crear y asignar Orden de Trabajo`, relacioná:

- un RF;
- un caso de uso;
- un actor;
- una clase y método;
- una entidad/tabla;
- una relación y cardinalidad;
- un caso de prueba.

Explicá por qué un caso de uso no equivale a un método único y una clase Java no equivale exactamente a una tabla.

---

## 11. Recuperación espaciada — 0,2 puntos

Completá:

```text
Constructor Java =

PDU =

Requerimiento completo =

Requerimiento verificable =

Red/Internet forma =

Enlace/Acceso forma =

Física transmite =

peek() =

pop() =
```

---

# Defensa oral — 2 puntos

Responder durante 8–10 minutos:

> Una cooperativa necesita que un Encargado cree y programe Órdenes de Trabajo y que uno o varios Operarios registren su ejecución. Explique cómo representaría la necesidad mediante actores, casos de uso, `include`, `extend`, flujos y postcondiciones; cómo diseñaría una jerarquía Java con herencia, `super`, sobrescritura y miembros estáticos; y cómo construiría el DER y su pasaje inicial a tablas. Declare los supuestos y relacione los tres modelos.

## Rúbrica oral

| Criterio | Máximo |
|---|---:|
| Precisión conceptual | 0,5 |
| Terminología académica | 0,4 |
| Aplicación y justificación | 0,5 |
| Integración entre materias | 0,4 |
| Claridad y orden | 0,2 |
| **Total** | **2,0** |

---

# Criterio de aprobación

- Resultado global equivalente a 7/10 o más.
- Ningún bloque central completamente omitido.
- `include` y `extend` deben diferenciarse correctamente.
- La dirección de las relaciones debe ser correcta.
- El constructor no puede declarar `void`.
- `super(...)` debe ubicarse correctamente.
- Debe existir una relación “es un” válida.
- El DER debe incluir cardinalidades.
- La relación N:M debe transformarse mediante tabla asociativa.
- La defensa debe conectar casos de uso, clases y datos.
