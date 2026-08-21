# Simulacro completo 1 — EFIP I

**Fecha de ejecución prevista:** 22/08/2026
**Corrección y defensa:** 23/08/2026
**Tiempo:** 150 minutos
**Puntaje:** 100 puntos
**Estado:** **PREPARADO — NO REALIZADO**

---

# Caso

Una cooperativa implementará SIGO para registrar trabajos desde teléfonos. La aplicación debe funcionar sin conexión, validar prioridad `1..5`, guardar localmente, sincronizar sin duplicados y permitir consultas centrales por sector.

La solución usa:

- aplicación móvil;
- almacenamiento SQLite;
- API central;
- base de datos servidor;
- red de sede y acceso remoto;
- historial de cambios de estado.

---

# Parte A — Análisis y Diseño — 20 puntos

## A1 — Requisito y prueba — 5

Escribí:

- un requisito funcional;
- un requisito no funcional;
- un caso de prueba para prioridad `6`;
- el nivel y enfoque de esa prueba.

## A2 — Trazabilidad — 5

Construí:

```text
requisito
→ diseño
→ clase/interfaz
→ componente/artefacto
→ nodo
→ prueba
```

## A3 — Implementación y despliegue — 5

Clasificá:

- `IRepositorioTrabajo`;
- `RepositorioSQLite.java`;
- `aplicacion-movil.apk`;
- teléfono del operario;
- servidor de aplicaciones;
- enlace móvil.

## A4 — Decisión — 5

Compará servidor propio y contratado para el servicio central. Elegí uno y registrá:

- cuatro criterios;
- consecuencia negativa segura;
- riesgo;
- mitigación;
- RNF relacionado.

---

# Parte B — POO y Java — 20 puntos

## B1 — Excepciones — 5

Completá conceptualmente:

```text
Integer.parseInt("ocho")
→ ...
→ catch (...)
→ throw new FormatoTrabajoException(..., ...)
```

Explicá `throw`, `throws` y la obligación si la excepción propia es checked.

## B2 — SOLID — 5

`AgendaTrabajos` valida, guarda en SQLite, sincroniza y muestra el menú. Identificá el problema y proponé separación usando SRP y DIP.

## B3 — Igualdad y colecciones — 5

Explicá:

- `==` frente a `equals`;
- contrato `equals/hashCode`;
- arreglo frente a `ArrayList`;
- por qué usar `Iterator.remove()` durante una iteración.

## B4 — Archivos — 5

Explicá `Path`, `Files`, UTF-8, try-with-resources, `IOException` y por qué se conserva la causa original.

---

# Parte C — Algoritmos y Estructuras — 20 puntos

## C1 — Estructuras — 5

Diferenciá:

- pila y cola;
- lista simple y arreglo;
- costo de insertar al inicio de una lista;
- costo de buscar por valor.

## C2 — Inserción y Shellsort — 5

Explicá:

- tramo ordenado de inserción;
- mejor y peor caso;
- significado de `gap`;
- por qué Shellsort termina con `gap = 1`;
- estabilidad de ambos.

## C3 — Mergesort — 5

Ordená manteniendo etiquetas:

```text
[A(3), B(1), C(2), D(3), E(2), F(1)]
```

Mostrá división, mezcla final y orden relativo de iguales.

## C4 — Quicksort — 5

Explicá pivote, partición, caso base, promedio y peor caso. Indicá por qué una traza debe declarar el esquema usado.

---

# Parte D — Base de Datos — 20 puntos

Esquema:

```text
SECTOR(id_sector, nombre)
TRABAJO(id_trabajo, id_sector, descripcion, prioridad, estado)
HISTORIAL(id_historial, id_trabajo, estado_anterior, estado_nuevo, fecha)
```

## D1 — Modelo — 5

Indicá PK, FK, dominio de prioridad y cardinalidades. Explicá entidad asociativa frente a entidad débil.

## D2 — SQL — 5

Escribí una consulta que muestre sectores con dos o más trabajos pendientes y su prioridad promedio.

## D3 — Transacción y ACID — 5

Asigná el trabajo `101` y registrá historial en una transacción. Explicá qué ocurre si falla el historial y relacioná ACID.

## D4 — SQL procedimental y motor — 5

Diferenciá procedimiento, función, cursor y trigger. Elegí motor local y central con tres criterios y un riesgo.

---

# Parte E — Comunicaciones — 20 puntos

## E1 — OSI y dispositivos — 5

Completá:

```text
switch → capa → PDU → dirección → tabla
router → capa → PDU → dirección → tabla
```

Explicá la primera trama hacia un servidor remoto.

## E2 — CIDR — 5

1. Prefijo mínimo tradicional para 36 hosts.
2. Totales y utilizables de `/28`.
3. Red, broadcast y rango de `192.168.10.70/26`.

## E3 — TCP/UDP — 5

Comparalos y elegí para sincronización. Explicá `SYN → SYN-ACK → ACK`.

## E4 — Arquitectura de red — 5

Diferenciá LAN, MAN y WAN; VPN, DMZ y MPLS; bucle L2 y routing. Proponé la ubicación de API y base de datos.

---

# Reglas de evidencia

- No consultar `2026-08-22_RESPUESTAS-SIMULACRO-COMPLETO-01.md`.
- No corregir respuestas durante la ejecución.
- Marcar dudas en un margen o sección separada.
- Guardar hora de inicio y finalización.
- La nota final requiere corrección y defensa el 23/08.
