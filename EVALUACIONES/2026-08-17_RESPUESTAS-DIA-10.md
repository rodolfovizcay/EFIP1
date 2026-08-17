# Respuestas del estudiante — Día 10
## Arquitectura + Lista simple + Nivel físico

**Fecha:** 17/08/2026  
**Modalidad real:** evaluación progresiva dialogada, sin apuntes  
**Tiempo real:** no cronometrado

> Este registro conserva las respuestas y operaciones principales. Las correcciones y la calificación se documentan por separado.

---

# 1. Recuperación inicial

## Respuestas principales

- Asociación: relación entre clases.
- Agregación: relación todo/parte débil; la parte puede existir sin el todo.
- Composición: relación todo/parte fuerte; la parte no existe independientemente.
- Dependencia: uso temporal de otra clase para una operación.
- `EjecucionOT`: entidad del dominio con persistencia.
- Sincronización: agrupación de clases, interfaces y responsabilidades.
- Cohesión: agrupar elementos con un objetivo funcional común.
- Bajo acoplamiento: dependencias mínimas y controladas mediante interfaces.
- Constructor: validar antes de ejecutar `this.nombre = nombre`.
- `super(...)`: constructor de la superclase; `super.metodo()`: implementación heredada.
- Pila: LIFO. Cola: FIFO.
- Inserción al inicio: `nuevo.siguiente = cabeza; cabeza = nuevo`.
- Física: bits mediante señales.
- Desconexión no implica transmisión asíncrona.

**Resultado:** `8,75/12`; recuperación breve posterior: `4,5/5`.

---

# 2. Arquitectura

## Definición

> La arquitectura es el conjunto de decisiones significativas respecto de la organización del sistema, sus elementos estructurales, subsistemas e interfaces, condicionada por casos de uso, RNF, comunicación, plataforma, base de datos y sistemas heredados.

## Decisiones justificadas

### Persistencia local

```text
Problema: pérdida de información cuando el teléfono pierde conexión.
Decisión: persistir localmente para sincronizar después.
Tecnología posible: SQLite.
Beneficio: evitar pérdida de información.
Riesgo: redundancia, conflictos o pérdidas si la sincronización falla.
```

### Persistencia central

```text
Problema: mantener un estado común para todos los teléfonos.
Decisión: servidor central autoritativo.
Tecnología posible: PostgreSQL.
Beneficio: datos centralizados.
Riesgo: disponibilidad, concurrencia, copias y capacidad del servidor.
```

### Comunicación

```text
Problema: transmitir información entre teléfonos y servidor.
Decisión: interfaz cliente-servidor REST con JSON.
Tecnologías posibles: Spring Boot y Android.
Riesgos: desconexión, latencia, reintentos, seguridad y versionado.
```

## Subsistemas e interfaces

- Relevamiento registra, valida y administra puntos.
- Persistencia guarda y recupera información, sin conocer la captura.
- Sincronización conoce qué, cuándo y en qué orden sincronizar.
- Persistencia conoce cómo almacenar y recuperar.
- Las dependencias apuntan al contrato utilizado.

## Vistas 4+1

```text
casos de uso → escenario significativo
lógica/diseño → clases, subsistemas e interfaces
procesos → concurrencia, cola y reintentos
implementación → componentes y archivos
despliegue → dispositivos y servidores
```

## Decisión documentada

Se eligió separar Sincronización como subsistema independiente. Durante la corrección se agregaron alternativas reales, consecuencias positivas y negativas, riesgos, RNF y artefactos afectados.

---

# 3. Lista simplemente enlazada

## Inserción

```java
nuevo.siguiente = cabeza;
cabeza = nuevo;

X.siguiente = A.siguiente;
A.siguiente = X;
```

## Recorrido

```java
Nodo actual = cabeza;
while (actual != null) {
    System.out.println(actual.dato);
    actual = actual.siguiente;
}
```

## Búsqueda

```java
while (actual != null) {
    if (actual.dato == buscado) {
        return actual;
    }
    actual = actual.siguiente;
}
return null;
```

## Eliminación recuperada

```java
cabeza = cabeza.siguiente;
anterior.siguiente = actual.siguiente;
```

## Complejidad

```text
primer nodo = O(1)
insertar al inicio = O(1)
buscar = O(n)
acceder por posición = O(n) en el peor caso
```

---

# 4. Nivel físico

- UTP, fibra y coaxial: guiados.
- Radiofrecuencia y satélite: no guiados.
- UTP transporta señales eléctricas; Física interpreta bits; Enlace reconoce tramas.
- Los pares se trenzan para reducir interferencia.
- UTP es apropiado en oficina común por costo y facilidad.
- Entre edificios con interferencia eléctrica se eligió fibra por inmunidad electromagnética y aislamiento eléctrico.

```text
Repetidor/hub → capa 1 → señal/bits
Switch → capa 2 → trama/MAC
Router → capa 3 → paquete/IP
```

---

# 5. Evaluación integradora real

Se respondieron diez consignas sobre:

1. tecnología frente a decisión arquitectónica;
2. cohesión y acoplamiento;
3. vistas 4+1;
4. RNF, consecuencias y riesgos;
5. inserción y eliminación en Lista;
6. complejidades;
7. señales, bits y tramas;
8. switch/router, capas y direcciones;
9. medios guiados/no guiados;
10. fibra entre edificios.

**Resultado:** `8,5/10`.

## Recuperación final

```text
Implementación = cómo se organiza el software.
Despliegue = dónde se ejecuta.
APK = implementación.
Teléfono = despliegue.
Switch = capa 2, trama, MAC.
Router = capa 3, paquete, IP.
Consecuencia negativa = mayor complejidad/componentes.
Riesgo = duplicados durante reintentos.
```

**Resultado de recuperación:** `4/4`.
