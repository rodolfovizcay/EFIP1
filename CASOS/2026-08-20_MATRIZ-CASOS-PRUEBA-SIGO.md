# Matriz preparada — Casos de prueba SIGO

**Fecha:** 20/08/2026
**Estado:** **DISEÑADA — NO EJECUTADA**

Esta matriz es una plantilla de estudio. Las columnas “obtenido” y “estado” solo se completan durante una ejecución real.

| ID | Nivel | Objetivo | Precondición | Datos/acción | Resultado esperado | Obtenido | Estado |
|---|---|---|---|---|---|---|---|
| CP-PRI-01 | unidad | aceptar frontera inferior | objeto en construcción | prioridad `1` | valor aceptado | — | no ejecutado |
| CP-PRI-02 | unidad | aceptar frontera superior | objeto en construcción | prioridad `5` | valor aceptado | — | no ejecutado |
| CP-PRI-03 | unidad | rechazar valor bajo | objeto en construcción | prioridad `0` | `IllegalArgumentException` | — | no ejecutado |
| CP-PRI-04 | unidad | rechazar valor alto | objeto en construcción | prioridad `6` | `IllegalArgumentException` | — | no ejecutado |
| CP-DES-01 | unidad | rechazar descripción vacía | objeto en construcción | `"   "` | `IllegalArgumentException` | — | no ejecutado |
| CP-REP-01 | integración | guardar mediante contrato | repositorio disponible | guardar trabajo `104` | puede recuperarse por id | — | no ejecutado |
| CP-SIN-01 | sistema | registrar sin conexión | red deshabilitada | registrar trabajo válido | persistido localmente y marcado pendiente | — | no ejecutado |
| CP-SIN-02 | sistema | sincronizar al volver la red | trabajo pendiente y servidor disponible | ejecutar sincronización | servidor recibe una vez y estado cambia | — | no ejecutado |
| CP-ACE-01 | aceptación | sostener tarea del operario | dispositivo configurado | recorrido real sin señal | no se pierde información | — | no ejecutado |

---

# Procedimiento preparado para CP-SIN-01

1. Confirmar que la aplicación está instalada y el almacenamiento local vacío.
2. Deshabilitar Wi-Fi y datos móviles.
3. Abrir la opción “Registrar trabajo”.
4. Ingresar id `104`, descripción `Revisar módem`, prioridad `2` y sector `1`.
5. Confirmar.
6. Consultar la lista de pendientes.
7. Cerrar y volver a abrir la aplicación.
8. Consultar nuevamente la lista.
9. Comparar con el resultado esperado.

Resultado esperado:

```text
El trabajo 104 aparece como PENDIENTE antes y después del reinicio,
sin requerir conexión y sin duplicarse.
```

---

# Trazabilidad

| Requisito | Diseño | Implementación | Casos |
|---|---|---|---|
| prioridad entre 1 y 5 | `TrabajoPendiente` | validador/constructor | CP-PRI-01..04 |
| descripción obligatoria | `TrabajoPendiente` | validador/constructor | CP-DES-01 |
| persistencia local | `IRepositorioTrabajo` | `RepositorioSQLite` | CP-REP-01, CP-SIN-01 |
| sincronización posterior | `SincronizadorTrabajos` | cliente HTTP/backend | CP-SIN-02 |
| trabajo sin conexión | arquitectura offline-first | aplicación móvil | CP-SIN-01, CP-ACE-01 |
