# Ficha — Modelo de pruebas

**Fecha:** 20/08/2026
**Estado:** material preparado

---

# 1. Propósito de probar

Las pruebas ejecutan software con datos controlados y comparan el comportamiento obtenido con el esperado. Aportan confianza y revelan defectos; no demuestran que el programa carezca de todo defecto posible.

```text
verificación → conformidad con especificaciones
validación   → adecuación a necesidades y expectativas
```

| Técnica | ¿Ejecuta software? | Ejemplo |
|---|---|---|
| inspección/revisión | no | revisar requisitos, diagrama o código |
| prueba | sí | invocar `validarPrioridad(6)` y observar el resultado |

---

# 2. Modelo y artefactos

El modelo de pruebas describe principalmente cómo se prueban las construcciones ejecutables mediante pruebas de integración y de sistema. Reúne casos, procedimientos y componentes de prueba.

| Elemento | Contenido mínimo |
|---|---|
| plan | alcance, estrategia, recursos, cronograma, criterios de entrada/salida y cobertura |
| caso | objetivo, precondiciones, entradas, resultado esperado |
| procedimiento | preparación y pasos concretos para ejecutar casos |
| componente | código o herramienta que automatiza total o parcialmente el procedimiento |
| defecto | síntoma/anomalía observada, contexto, severidad, evidencia y estado |
| evaluación | síntesis de resultados, cobertura y defectos pendientes |

Frase de examen:

> El caso indica qué probar; el procedimiento indica cómo hacerlo; el componente de prueba puede automatizarlo.

---

# 3. Niveles

## Unidad

Prueba el bloque pequeño, normalmente un método o clase.

```text
TrabajoPendiente.validarPrioridad(1)
TrabajoPendiente.validarPrioridad(0)
```

## Integración

Prueba la colaboración de unidades o subsistemas.

```text
ServicioTrabajo → IRepositorioTrabajo → RepositorioSQLite
```

## Sistema

Prueba el sistema integrado y sus requisitos funcionales/no funcionales.

```text
registrar sin conexión → persistir → reiniciar → recuperar → sincronizar
```

## Aceptación

Confirma con el cliente/usuario que el producto satisface la necesidad acordada en el ambiente correspondiente.

---

# 4. Caja negra y caja blanca

| Enfoque | Se apoya en | Pregunta |
|---|---|---|
| caja negra | especificación y comportamiento visible | ¿para esta entrada entrega la salida esperada? |
| caja blanca | estructura interna, ramas y caminos | ¿se ejecutaron las decisiones relevantes? |

Para una prioridad válida `1..5`:

| Clase | Datos representativos |
|---|---|
| válida | `1`, `3`, `5` |
| menor inválida | `0` |
| mayor inválida | `6` |

Valores de frontera:

```text
0 | 1 ........ 5 | 6
    válido
```

No basta probar solo `3`: los límites suelen revelar errores como usar `< 5` en lugar de `<= 5`.

---

# 5. Plantilla de caso de prueba

| Campo | Ejemplo |
|---|---|
| ID | `CP-REG-01` |
| requisito | registrar trabajo válido sin conexión |
| objetivo | comprobar que un trabajo válido queda almacenado localmente |
| precondición | aplicación sin red y repositorio disponible |
| datos | id `104`, prioridad `2`, descripción `Revisar módem` |
| pasos | abrir formulario, completar, confirmar, consultar listado |
| resultado esperado | trabajo visible como `PENDIENTE` y persistido localmente |
| resultado obtenido | se completa al ejecutar |
| estado | no ejecutado / aprobado / fallido / bloqueado |
| evidencia | captura, log, salida o referencia reproducible |

Durante la preparación, `resultado obtenido` y `estado` deben permanecer sin completar.

---

# 6. Defecto

Un caso fallido no es todavía una explicación de la causa. Registrar:

```text
ID
título breve
versión/entorno
precondiciones
pasos para reproducir
resultado esperado
resultado observado
evidencia
severidad/prioridad
estado
```

Después de corregir, ejecutar una prueba de confirmación y las regresiones pertinentes.

---

# 7. Trazabilidad

```text
requisito
→ caso de uso/escenario
→ elemento de diseño
→ componente implementado
→ caso de prueba
→ resultado/defecto
```

La trazabilidad permite responder qué requisito valida una prueba y qué pruebas deben repetirse cuando cambia una pieza.

---

# 8. Errores frecuentes

- confundir plan de prueba con caso de prueba;
- escribir pasos sin resultado esperado;
- declarar “aprobado” sin ejecutar;
- probar solo el camino feliz;
- confundir defecto con excepción;
- asumir que caja negra significa “sin documentación”;
- usar cobertura alta como garantía de ausencia de defectos;
- corregir un defecto sin hacer prueba de regresión.
