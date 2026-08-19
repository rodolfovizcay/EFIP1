# Recuperación inicial — Día 13

**Fecha:** 20/08/2026
**Tiempo:** 20–25 minutos
**Regla:** responder sin apuntes; corregir únicamente al terminar.

---

# Preguntas

1. Diferenciá componente, subsistema de implementación y artefacto.
2. Diferenciá modelo de implementación y modelo de despliegue.
3. Completá el flujo: `Integer.parseInt("ocho") → ______ → catch → throw new ______("Prioridad inválida", e)`.
4. ¿Por qué se conserva `e` como causa de una excepción propia?
5. Un switch recibe por P1 una trama `AA → CC` con tabla vacía: ¿qué aprende y qué hace?
6. En el paso anterior, ¿el switch aprendió usando la MAC origen o la MAC destino?
7. Diferenciá en una frase HDLC, PPP y Ethernet.
8. Diferenciá LLC y MAC sin usar la expresión “enrutamiento físico”.
9. ¿Por qué un broadcast puede repetirse en un ciclo de capa 2?
10. ¿Qué hace STP con un camino redundante y qué ocurre si falla el principal?
11. Diferenciá un bucle de capa 2 de un bucle de enrutamiento usando trama/paquete y TTL.
12. Si la PC destino está en otra red, ¿la primera trama se dirige a la MAC del servidor remoto o a la MAC de la puerta de enlace? ¿Por qué?

---

# Umbral

```text
10–12 → avanzar a M1
7–9   → refuerzo selectivo
0–6   → recuperación dirigida
```

E-063 y E-065 requieren corrección aunque el total sea 10 o más.

---

# Clave breve

1. Componente: pieza física/reemplazable de software; subsistema: agrupación coherente y manejable; artefacto: archivo concreto producido o desplegado.
2. Implementación organiza piezas de software; despliegue ubica artefactos en nodos de ejecución.
3. `NumberFormatException`; `FormatoArchivoException`.
4. Conserva el diagnóstico y la traza técnica original mientras la excepción propia agrega significado del dominio.
5. Aprende `AA → P1`; como `CC` es desconocida, hace flooding por los puertos habilitados salvo P1.
6. Por la MAC origen; decide la salida consultando la MAC destino.
7. HDLC: protocolo/modelo de control de enlace; PPP: enlace punto a punto; Ethernet: tecnología predominante de LAN con tramas y MAC.
8. LLC vincula capa de red con MAC e identifica el protocolo superior; MAC encapsula tramas, direcciona y controla acceso al medio hacia capa física.
9. Ethernet no incorpora TTL en la trama y los switches vuelven a inundarla por caminos redundantes.
10. STP bloquea lógicamente un camino para formar una topología sin ciclos; ante falla, reconverge y puede habilitar el respaldo.
11. El de capa 2 repite tramas entre switches y se controla con STP; el de capa 3 repite paquetes entre routers y el TTL/Hop Limit finalmente los descarta.
12. A la MAC de la puerta de enlace, porque el servidor está fuera de la red local; el paquete conserva como destino la IP remota.
