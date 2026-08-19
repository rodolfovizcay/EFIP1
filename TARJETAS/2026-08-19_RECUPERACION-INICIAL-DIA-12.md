# Recuperación inicial — Día 12

**Fecha:** 19/08/2026
**Tiempo:** 20–25 minutos
**Regla:** responder sin apuntes; se evalúa el concepto, no la ortografía.

---

# Preguntas

1. Diferenciá vista o modelo de implementación y vista o modelo de despliegue.
2. Clasificá: `aplicacion-movil.apk`, `IRepositorioTrabajo`, teléfono del operario y servidor de base de datos.
3. ¿Qué es un componente y qué es un nodo?
4. Diferenciá `throw` y `throws`.
5. ¿Qué obligación impone una excepción checked a quien llama al método?
6. ¿Una excepción unchecked falla siempre que el programa se ejecuta? Justificá.
7. ¿Qué funciones cumplen `try`, `catch` y `finally`?
8. Completá: switch → capa ___ → PDU ___ → dirección ___;
9. Completá: router → capa ___ → PDU ___ → dirección ___;
10. ¿Qué información usa un switch para elegir un puerto de salida?
11. ¿Qué sucede con una trama de destino desconocido en un switch?
12. ¿Para qué sirve STP cuando existen enlaces redundantes entre switches?

---

# Umbral

```text
10–12 → avanzar
7–9   → recuperación selectiva
0–6   → recuperación dirigida
```

---

# Clave breve para corrección

1. Implementación organiza piezas físicas de software; despliegue distribuye artefactos en nodos de ejecución.
2. `.apk`: artefacto/componente de implementación; interfaz: elemento de diseño e implementación contractual; teléfono y servidor: nodos de despliegue.
3. Componente: pieza física/reemplazable de software; nodo: recurso físico de cómputo en tiempo de ejecución.
4. `throw` lanza una excepción; `throws` declara en la firma que puede propagarse.
5. Capturarla o volver a declararla con `throws`.
6. No. Puede compilar y solo falla si ocurre la condición que la lanza y no es capturada.
7. `try` delimita código vigilado, `catch` trata una excepción compatible y `finally` ejecuta la limpieza final casi siempre.
8. Capa 2 → trama → MAC.
9. Capa 3 → paquete → IP.
10. La MAC destino y su tabla `MAC → puerto`; aprende usando la MAC origen.
11. La inunda por los puertos habilitados de la misma VLAN excepto el de entrada.
12. Mantiene una topología lógica sin bucles, bloqueando caminos redundantes que pueden reactivarse ante fallas.

---

# Precisión importante

`finally` se enseña como “se ejecuta siempre”, pero existen terminaciones extraordinarias del proceso en las que no llega a ejecutarse. Para el nivel de la actividad, la regla práctica es que se ejecuta al salir del `try/catch`, incluso con `return`.
