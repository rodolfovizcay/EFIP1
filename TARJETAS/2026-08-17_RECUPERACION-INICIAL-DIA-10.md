# Recuperación inicial — Día 10
## Arquitectura + Lista simple + Nivel físico

**Fecha prevista:** 17/08/2026  
**Modalidad:** responder el frente antes de leer el reverso  
**Objetivo:** comprobar errores activos y conocimientos necesarios para los temas nuevos.

---

# Control de entrada — 12 preguntas

## 1. Relaciones UML

**Frente**

Diferenciá:

```text
Asociación
Agregación
Composición
Dependencia
```

**Reverso**

```text
Asociación
→ vínculo estructural entre clases.

Agregación
→ relación todo/parte débil o compartida;
  la parte puede existir independientemente.

Composición
→ relación todo/parte fuerte;
  la vida de la parte depende del todo.

Dependencia
→ relación de uso;
  un cambio en el elemento utilizado puede afectar al dependiente.
```

---

## 2. Entidad frente a subsistema

**Frente**

¿Por qué `EjecucionOT` es una entidad y `Subsistema Sincronización` es un subsistema?

**Reverso**

```text
EjecucionOT
→ concepto del dominio con identidad, datos y comportamiento.

Subsistema Sincronización
→ agrupación de clases, servicios, interfaces y responsabilidades relacionadas.
```

---

## 3. Cohesión y acoplamiento

**Frente**

¿Qué busca una buena arquitectura respecto de cohesión y acoplamiento?

**Reverso**

```text
Alta cohesión
→ elementos del subsistema fuertemente relacionados con su propósito.

Bajo acoplamiento
→ pocas dependencias y dependencias controladas entre subsistemas.
```

---

## 4. Constructor y validación

**Frente**

Corregí conceptualmente:

```java
this.nombre = nombre;
if (nombre == null || nombre.isBlank()) {
    throw new IllegalArgumentException();
}
```

**Reverso**

Primero se valida y luego se asigna:

```java
if (nombre == null || nombre.isBlank()) {
    throw new IllegalArgumentException("Nombre obligatorio");
}
this.nombre = nombre;
```

---

## 5. Uso de `super`

**Frente**

¿Cuándo corresponde usar `super`?

**Reverso**

```text
- llamar al constructor de la superclase;
- acceder explícitamente a una implementación heredada.

No se usa para llamar un método definido en la misma clase actual.
```

---

## 6. `String` y `toString()`

**Frente**

Completá:

```text
`==` en String =
`isBlank()` =
`toString()` =
```

**Reverso**

```text
`==`
→ compara referencias.

`isBlank()`
→ comprueba vacío o solo espacios.

`toString()`
→ devuelve una representación textual con valores reales del objeto.
```

---

## 7. Inserción al inicio

**Frente**

Completá una inserción al inicio de una lista simplemente enlazada:

```text
nuevo.siguiente = ______
cabeza = ______
```

**Reverso**

```text
nuevo.siguiente = cabeza
cabeza = nuevo
```

---

## 8. Lista frente a Pila y Cola

**Frente**

¿Qué diferencia existe entre una lista simple, una Pila y una Cola?

**Reverso**

```text
Lista simple
→ permite inserción, búsqueda, modificación y eliminación flexibles.

Pila
→ restringe entrada/salida a la cima; LIFO.

Cola
→ inserta por final y elimina por frente; FIFO.
```

---

## 9. Contrato del TDA

**Frente**

¿Qué permanece y qué cambia si una Lista se implementa con nodos o con otra representación?

**Reverso**

```text
Permanece
→ interfaz y comportamiento esperado.

Cambia
→ estructura interna, referencias, memoria y algoritmos concretos.
```

---

## 10. Capa física

**Frente**

¿Qué transmite la capa física y cómo?

**Reverso**

```text
Transmite bits representados mediante señales:
- impulsos eléctricos;
- señales radioeléctricas;
- impulsos luminosos.
```

---

## 11. Analógica y conectividad

**Frente**

Respondé:

```text
¿Una señal analógica puede transmitirse analógicamente?
¿La falta de conexión implica transmisión asíncrona?
```

**Reverso**

```text
Sí, una señal analógica puede transmitirse como analógica.

No. Sin conexión no hay transmisión en ese momento.
Síncrona/asíncrona depende de la organización del protocolo asumido.
```

---

## 12. Modelo relacional final

**Frente**

¿Por qué no alcanza con escribir solo nombres de tablas e IDs?

**Reverso**

Un modelo final debe incluir:

```text
atributos
PK
FK con destino
UNIQUE de claves candidatas
restricciones relevantes
```

---

# Umbral

```text
10–12 correctas
→ comenzar Arquitectura.

7–9 correctas
→ repetir solo las falladas.

0–6 correctas
→ repaso dirigido adicional.
```

---

# Mini recuperación oral

Explicar en 90 segundos:

> Una arquitectura organiza decisiones, subsistemas e interfaces. Una lista simple enlaza nodos y permite operaciones flexibles. La capa física transporta bits mediante señales y su medio se elige según distancia, costo, interferencia, mantenimiento y latencia.