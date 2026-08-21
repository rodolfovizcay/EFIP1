# Día 15 — Redes y simulacro completo 1

**Fecha:** 22/08/2026
**Duración núcleo:** 6 horas
**Estado:** **PREPARADO — NO INICIADO**

---

# 1. Cronograma

| Bloque | Duración | Producto |
|---|---:|---|
| Recuperación inicial | 20 min | 12 respuestas |
| M1 — IPv4 y CIDR | 70 min | cálculos y prefijos |
| Pausa | 10–15 min | — |
| M2 — transporte y routing | 50 min | TCP/UDP + tabla |
| M2 — tipos y seguridad de red | 30 min | diseño SIGO |
| Control de redes | 30 min | cinco ejercicios |
| Pausa larga | 45–60 min | — |
| Simulacro escrito | 150 min | respuestas de 100 puntos |
| Resguardo de evidencia | 10 min | tiempos, ayudas y dudas separados |

Los bloques de trabajo suman `360 minutos = 6 horas`. Las pausas no se cuentan dentro del núcleo.

No se corrige el simulacro el mismo día. Esa separación evita alterar respuestas mientras todavía se produce la evidencia.

---

# 2. IPv4 y CIDR

## 2.1 Bits

Una dirección IPv4 tiene 32 bits. El prefijo `/n` indica cuántos pertenecen a la red.

```text
bits de host = 32 - prefijo
direcciones totales = 2^(bits de host)
hosts tradicionales = 2^(bits de host) - 2
```

La resta de dos corresponde a red y broadcast en subredes tradicionales.

| Prefijo | Bits host | Totales | Utilizables tradicionales |
|---:|---:|---:|---:|
| `/32` | 0 | 1 | ruta de host; no aplicar la resta |
| `/31` | 1 | 2 | caso especial punto a punto |
| `/30` | 2 | 4 | 2 |
| `/29` | 3 | 8 | 6 |
| `/28` | 4 | 16 | 14 |
| `/27` | 5 | 32 | 30 |
| `/26` | 6 | 64 | 62 |

## 2.2 Selección

```text
3 hosts  → /29
14 hosts → /28
30 hosts → /27
36 hosts → /26
62 hosts → /26
```

Se elige la subred más pequeña que cubra la demanda y reserve red/broadcast cuando corresponde.

## 2.3 Red y broadcast

Ejemplo:

```text
192.168.1.70/26
```

`/26` implica bloques de 64:

```text
red       → 192.168.1.64
broadcast → 192.168.1.127
utilizables → 192.168.1.65 a 192.168.1.126
```

---

# 3. TCP y UDP

| Criterio | TCP | UDP |
|---|---|---|
| conexión | orientado a conexión | sin conexión |
| entrega | confiabilidad mediante control/retransmisión | no garantiza entrega |
| orden | preserva orden del flujo | no garantiza orden |
| overhead | mayor | menor |
| ejemplos | HTTPS, transferencia, sincronización | voz en tiempo real, telemetría tolerante a pérdida |

Handshake:

```text
cliente → SYN
servidor → SYN-ACK
cliente → ACK
```

No significa que TCP sea siempre mejor. La decisión depende de confiabilidad, latencia, tolerancia a pérdida y costo de control.

---

# 4. Switch, router y tabla de enrutamiento

```text
switch → capa 2 → trama → MAC → tabla MAC
router → capa 3 → paquete → IP → tabla de enrutamiento
```

Si el destino está en otra red, la primera trama se dirige a la MAC de la puerta de enlace, no a la MAC del servidor remoto.

Una entrada de routing suele indicar:

| Campo | Significado |
|---|---|
| destino/prefijo | red a alcanzar |
| siguiente salto | router al que enviar |
| interfaz | salida local |
| métrica | costo o preferencia |

Se busca la coincidencia de prefijo más específica. La ruta por defecto `0.0.0.0/0` se usa cuando no existe una ruta más específica.

---

# 5. Tipos de red y conmutación

- difusión: todas las terminales comparten el medio y observan la transmisión;
- conmutada: nodos intermedios encaminan el tráfico;
- circuitos: reserva un camino durante la comunicación;
- paquetes: divide la información y comparte enlaces.

Alcance:

```text
LAN → área local
MAN → área metropolitana
WAN → área extensa
```

El alcance geográfico no determina por sí solo seguridad, velocidad o propiedad.

---

# 6. VPN, DMZ, MPLS y firewall

| Elemento | Función | No confundir con |
|---|---|---|
| VPN | túnel protegido sobre una red no confiable | una DMZ |
| DMZ | segmento aislado para servicios expuestos | cifrado |
| MPLS | reenvío por etiquetas en una red de proveedor | cifrado automático |
| firewall | aplica reglas de tráfico | router sin políticas |

Arquitectura SIGO:

```text
teléfono
→ Internet
→ VPN/HTTPS
→ firewall
→ DMZ [API expuesta]
→ firewall interno
→ red de aplicaciones
→ red de base de datos
```

La base central no debe publicarse directamente en Internet.

---

# 7. Actividades obligatorias

1. Calcular totales y utilizables de `/29`, `/28`, `/27` y `/26`.
2. Elegir prefijo para 3, 14, 30, 36 y 62 hosts.
3. Obtener red y broadcast de `192.168.10.70/26`.
4. Elegir TCP o UDP para:
   - sincronización de trabajos;
   - video en vivo;
   - consulta SQL;
   - sensor periódico tolerante a pérdida.
5. Interpretar:

| Destino | Siguiente salto | Interfaz | Métrica |
|---|---|---|---:|
| `192.168.10.0/24` | directa | LAN | 0 |
| `10.20.0.0/16` | `192.168.10.1` | LAN | 10 |
| `0.0.0.0/0` | `192.168.10.254` | WAN | 100 |

6. Resolver `CASOS/2026-08-22_CASO-INTEGRADOR-RED-SIGO.md`.

---

# 8. Simulacro

Usar:

```text
EVALUACIONES/2026-08-22_SIMULACRO-COMPLETO-01.md
```

Reglas:

1. tiempo máximo: 150 minutos;
2. sin clave ni respuestas anteriores;
3. indicar dudas sin modificar luego la respuesta;
4. conservar la evidencia;
5. corregir recién el 23/08;
6. la nota no se calcula hasta terminar la defensa.
