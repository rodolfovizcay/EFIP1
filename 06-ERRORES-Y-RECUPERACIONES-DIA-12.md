# Errores y recuperaciones — Día 12

**Fecha:** 19/08/2026<br>
**Evaluación:** **8,05/10 — APROBADO**

---

# 1. Errores previos recuperados

| Código | Tema | Evidencia del Día 12 | Estado nuevo |
|---|---|---|---|
| E-051 | implementación frente a despliegue | diferencia defendida en recuperación, evaluación e integración oral | consolidado |
| E-055 | switch/router: capa, PDU y dirección | switch C2/MAC y router C3/IP defendidos al final | consolidado |
| E-057 | checked/unchecked y `throw`/`throws` | regla aplicada a `IOException`, excepción propia y llamadas | consolidado |

---

# 2. Nuevos errores observados

| Código | Materia | Tema | Situación observada | Estado al cierre |
|---|---|---|---|---|
| E-060 | Análisis y Diseño | componente/subsistema/artefacto | se clasificaron algunos archivos o paquetes como componentes sin distinguir el nivel físico de empaquetado | corregido |
| E-061 | POO/Java | traducción de excepción | después de capturar `NumberFormatException` se intentó lanzar nuevamente el mismo tipo en vez de `FormatoArchivoException` | corregido |
| E-062 | Comunicaciones | aprendizaje y reenvío del switch | la primera simulación confundió destino conocido, acción y puerto de salida | corregido |
| E-063 | Comunicaciones | HDLC/PPP/Ethernet | la comparación quedó incompleta en la evaluación final | **abierto** |
| E-064 | Comunicaciones | LLC/MAC | se llamó “enrutamiento físico” a MAC y faltó inicialmente su relación precisa con capa física | corregido |
| E-065 | Comunicaciones | bucle L2 frente a routing | no se completó la diferencia solicitada en la evaluación final | **abierto** |

---

# 3. Reglas retenidas

```text
componente = pieza modular de software
subsistema = agrupación coherente de elementos con una responsabilidad
artefacto = archivo físico producido o utilizado
nodo = recurso donde se despliega y ejecuta
```

```text
parseInt("ocho")
→ NumberFormatException
→ catch
→ new FormatoArchivoException(mensaje, causa)
```

```text
switch aprende MAC origen
switch consulta MAC destino
destino desconocido → flooding salvo puerto de entrada
destino conocido → reenvío selectivo
```

```text
HDLC = control de enlace
PPP = enlace punto a punto
Ethernet = LAN, trama y MAC
```

```text
bucle L2 = tramas sin TTL; STP crea topología lógica sin ciclos
bucle de routing = paquetes IP y rutas; TTL/Hop Limit limita su permanencia
```

---

# 4. Recuperación próxima

Responder sin apuntes:

1. Diferenciar componente, subsistema, artefacto y nodo con un ejemplo de SIGO.
2. Escribir el flujo completo de una prioridad no numérica leída desde archivo.
3. Diferenciar HDLC, PPP y Ethernet.
4. Simular dos tramas con tabla MAC inicialmente vacía.
5. Comparar un bucle de capa 2 con uno de enrutamiento.

---

# 5. Estado acumulado resultante

```text
Consolidados = 42
Corregidos   = 16
Abiertos     = 7
Total        = 65
```
