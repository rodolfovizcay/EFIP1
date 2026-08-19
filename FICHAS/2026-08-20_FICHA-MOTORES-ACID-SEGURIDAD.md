# Ficha — Motores, ACID y seguridad conceptual

**Fecha:** 20/08/2026
**Estado:** material preparado

---

# 1. Elegir un motor por contexto

| Motor | Fortalezas orientativas | Caso representativo | Atención |
|---|---|---|---|
| Oracle | plataforma empresarial, soporte y capacidades amplias | organización grande con operación crítica | licenciamiento, especialización y costo |
| MySQL | adopción web, ecosistema y disponibilidad | aplicación web tradicional | edición, configuración y necesidades concretas |
| SQLite | embebido, sin servidor separado, archivo local | aplicación móvil/offline | concurrencia y operación centralizada limitada |
| PostgreSQL | servidor relacional abierto, extensible y robusto | backend central de SIGO | requiere administrar servidor, respaldo y disponibilidad |

El material académico presenta Oracle, MySQL y SQLite. PostgreSQL se incorpora como comparación complementaria prevista por el plan.

## Decisión SIGO posible

```text
teléfono → SQLite para persistencia local
servidor → PostgreSQL para datos centrales
```

No es contradicción: resuelven necesidades diferentes. La interfaz de repositorio reduce el acoplamiento entre lógica e implementación.

Criterios de defensa:

- ubicación y modo embebido/servidor;
- concurrencia;
- disponibilidad;
- volumen y crecimiento;
- capacidades del equipo;
- costo/licencia y soporte;
- copias, recuperación y monitoreo;
- compatibilidad y migración.

---

# 2. Transacción y ACID

Una transacción agrupa operaciones como una unidad lógica.

Ejemplo: asignar un trabajo y registrar el historial deberían confirmarse juntos.

```sql
BEGIN;

UPDATE trabajo
SET estado = 'ASIGNADO'
WHERE id_trabajo = 101;

INSERT INTO historial_trabajo (id_trabajo, estado_nuevo)
VALUES (101, 'ASIGNADO');

COMMIT;
```

Si falla una operación y la unidad debe deshacerse:

```sql
ROLLBACK;
```

## ACID

| Propiedad | Idea | Pregunta SIGO |
|---|---|---|
| atomicidad | todas las operaciones o ninguna | ¿puede cambiar el estado sin registrar historial? |
| consistencia | cada transacción conserva reglas válidas | ¿siguen cumpliéndose FK, CHECK y estados permitidos? |
| aislamiento | transacciones concurrentes no interfieren indebidamente | ¿dos operadores ven/alteran datos de forma controlada? |
| durabilidad | un `COMMIT` exitoso persiste aun tras una falla posterior | ¿la asignación confirmada sobrevive al reinicio? |

ACID no elimina la necesidad de respaldos, alta disponibilidad, seguridad ni buen diseño.

---

# 3. DCL y mínimo privilegio

```text
GRANT  → concede permisos
REVOKE → retira permisos
```

Principio de mínimo privilegio: cada rol recibe solo lo necesario. Un usuario de consulta no necesita `DROP TABLE`; un operador quizá no necesite administrar roles.

---

# 4. Encoding, hashing y cifrado

## Encoding

Transforma una representación para transporte o compatibilidad.

```text
datos → Base64 → texto transportable
texto → decodificación → datos originales
```

Es reversible sin secreto. **Base64 no protege confidencialidad.**

## Hashing

Produce una huella de longitud fija para comparación o integridad.

```text
mensaje → SHA-256 → huella
```

No se “descifra” normalmente. Dos entradas iguales generan la misma huella con el mismo algoritmo; una colisión es posible en teoría, aunque se busca que sea impracticable encontrarla.

Para contraseñas no se recomienda SHA-256 directo: se usan funciones lentas y con sal como Argon2, scrypt o bcrypt.

## Cifrado

Protege confidencialidad mediante una clave.

```text
texto claro + clave → AES → texto cifrado
texto cifrado + clave autorizada → texto claro
```

La gestión de claves forma parte esencial de la seguridad.

---

# 5. Comparación de examen

| Pregunta | Encoding | Hashing | Cifrado |
|---|---|---|---|
| finalidad | representación | huella/integridad/verificación | confidencialidad |
| reversible | sí | no normalmente | sí con clave |
| usa secreto | no | no necesariamente | sí |
| ejemplo | Base64 | SHA-256 | AES |

---

# 6. Errores frecuentes

- llamar cifrado a Base64;
- afirmar que un hash se descifra;
- guardar contraseñas con SHA-256 simple;
- creer que ACID equivale a copia de seguridad;
- elegir SQLite para un servidor multiusuario solo porque “es más fácil”;
- elegir Oracle/PostgreSQL/MySQL sin relacionarlo con RNF y capacidad operativa;
- conceder permisos de administración a todo usuario.
