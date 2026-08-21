# Respuestas modelo — Simulacro completo 1

**Uso:** corrección del 23/08/2026.
**No atribuir al estudiante.**

---

# Parte A — 20

## A1

- RF: el sistema debe registrar trabajos sin conexión y sincronizarlos posteriormente.
- RNF: los datos locales deben permanecer después de reiniciar.
- Caso prioridad `6`: entrada `6`, resultado esperado rechazo mediante error controlado; nivel unitario; caja negra por frontera.

## A2

Ejemplo:

```text
guardar sin conexión
→ subsistema de persistencia
→ IRepositorioTrabajo / RepositorioSQLite
→ componente persistencia-local / aplicacion-movil.apk
→ teléfono
→ prueba de sistema con reinicio
```

## A3

- `IRepositorioTrabajo`: interfaz, vista de diseño;
- `RepositorioSQLite.java`: archivo fuente/clase, implementación;
- `aplicacion-movil.apk`: artefacto, implementación;
- teléfono y servidor: nodos, despliegue;
- enlace móvil: enlace, despliegue.

## A4

Se acepta cualquiera de las dos decisiones si compara costo, control, mantenimiento, seguridad, disponibilidad, escalabilidad y soporte; separa consecuencia segura de riesgo y asocia una mitigación concreta.

---

# Parte B — 20

## B1

```text
parseInt("ocho")
→ NumberFormatException
→ catch (NumberFormatException e)
→ throw new FormatoTrabajoException("Prioridad inválida", e)
```

`throw` lanza; `throws` declara posible propagación. Si `FormatoTrabajoException` es checked, el llamador debe capturarla o declararla.

## B2

La clase viola SRP porque tiene varias razones de cambio. Separación:

- `ValidadorTrabajo`;
- `IRepositorioTrabajo` con `RepositorioSQLite`;
- `SincronizadorTrabajos`;
- `Vista/MenuTrabajo`;
- `AgendaTrabajos` orquesta dependiendo de interfaces.

DIP: la lógica depende de abstracciones, no de SQLite.

## B3

- `==` compara referencias en objetos; `equals` igualdad lógica;
- si `equals` es verdadero, `hashCode` debe coincidir;
- arreglo: tamaño fijo; `ArrayList`: tamaño dinámico y elementos objeto;
- `Iterator.remove()` elimina de forma coordinada con el estado del iterador y evita modificación estructural externa.

## B4

`Path` representa ruta; `Files` ofrece operaciones; UTF-8 fija codificación; try-with-resources cierra el recurso; `IOException` es checked; conservar la causa mantiene diagnóstico y trazabilidad técnica.

---

# Parte C — 20

## C1

- pila LIFO; cola FIFO;
- lista enlazada usa nodos/enlaces y no requiere contigüidad; arreglo es contiguo y de tamaño fijo;
- insertar al inicio con referencia a cabeza: `O(1)`;
- buscar por valor: `O(n)`.

## C2

Inserción mantiene `A[0..i-1]` ordenado, mejor `O(n)` y peor `O(n²)`, estable en la forma habitual. `gap` es distancia entre elementos comparados; Shellsort termina en `1` para ordenar globalmente, depende de gaps y no garantiza estabilidad.

## C3

```text
[A(3),B(1),C(2)] | [D(3),E(2),F(1)]
→ [B(1),C(2),A(3)] | [F(1),E(2),D(3)]
→ [B(1),F(1),C(2),E(2),A(3),D(3)]
```

Con mezcla estable se conserva `B` antes que `F`, `C` antes que `E` y `A` antes que `D`.

## C4

El pivote permite particionar. Caso base: 0 o 1 elemento. Promedio esperado `O(n log n)`; peor `O(n²)`. Pivote y esquema determinan estados intermedios.

---

# Parte D — 20

## D1

- PK: cada identificador;
- `TRABAJO.id_sector` FK a `SECTOR`;
- `HISTORIAL.id_trabajo` FK a `TRABAJO`;
- prioridad con `CHECK 1..5`;
- sector 1:N trabajo; trabajo 1:N historial.

Asociativa resuelve una relación —normalmente N:M— y contiene FKs de las entidades relacionadas. Débil depende de una entidad propietaria para su identificación completa.

## D2

```sql
SELECT
    s.id_sector,
    s.nombre,
    COUNT(t.id_trabajo) AS cantidad_pendientes,
    AVG(t.prioridad) AS prioridad_promedio
FROM sector AS s
JOIN trabajo AS t
  ON t.id_sector = s.id_sector
WHERE t.estado = 'PENDIENTE'
GROUP BY s.id_sector, s.nombre
HAVING COUNT(t.id_trabajo) >= 2
ORDER BY cantidad_pendientes DESC, s.nombre;
```

## D3

```sql
BEGIN;
UPDATE trabajo
SET estado = 'ASIGNADO'
WHERE id_trabajo = 101
  AND estado = 'PENDIENTE';

INSERT INTO historial (
    id_trabajo, estado_anterior, estado_nuevo, fecha
)
VALUES (101, 'PENDIENTE', 'ASIGNADO', CURRENT_TIMESTAMP);
COMMIT;
```

Si falla el historial: `ROLLBACK` de ambas operaciones. Atomicidad = todo o nada; consistencia = restricciones; aislamiento = concurrencia; durabilidad = confirmado permanece.

## D4

- procedimiento: acción;
- función: valor;
- cursor: filas;
- trigger: evento automático.

SQLite local por conectividad, bajo costo y administración embebida. PostgreSQL central por concurrencia, transacciones y administración. Riesgo: conflictos/desincronización; mitigación: identificadores únicos, idempotencia y estados de sincronización.

---

# Parte E — 20

## E1

```text
switch → capa 2 → trama → MAC → tabla MAC
router → capa 3 → paquete → IP → tabla de enrutamiento
```

La PC envía la primera trama a la MAC de la puerta de enlace.

## E2

- 36 hosts → `/26`;
- `/28` → 16 totales, 14 utilizables tradicionales;
- `192.168.10.70/26`:
  - red `192.168.10.64`;
  - broadcast `192.168.10.127`;
  - rango `192.168.10.65–126`.

## E3

TCP ofrece conexión, orden, control y retransmisión; UDP reduce overhead sin garantía. Para sincronización: TCP, normalmente mediante HTTPS. Handshake: solicitud `SYN`, aceptación `SYN-ACK` y confirmación `ACK`.

## E4

- LAN local, MAN metropolitana, WAN extensa;
- VPN túnel protegido, DMZ segmento expuesto controlado, MPLS reenvío WAN por etiquetas sin cifrado implícito;
- L2 repite tramas sin TTL y STP bloquea redundancia; routing repite paquetes, TTL limita;
- API/reverse proxy en DMZ; aplicación y base en redes internas separadas.

---

# Rúbrica global

| Rango | Interpretación provisional |
|---:|---|
| 90–100 | alto, sujeto a defensa |
| 75–89 | aprobado con recuperación selectiva |
| 60–74 | recuperación prioritaria |
| 0–59 | brecha estructural |

La nota final se asigna después de la defensa y debe descontar ayuda no prevista si la hubo.
