# Respuestas modelo — Caso de red SIGO

**No atribuir al estudiante.**

## Parte A — VLSM

Asignación válida:

| Uso | Necesidad | Prefijo | Red | Rango | Broadcast |
|---|---:|---:|---|---|---|
| puestos | 36 | `/26` | `192.168.50.0` | `.1–.62` | `.63` |
| servidores | 14 | `/28` | `192.168.50.64` | `.65–.78` | `.79` |
| administración | 6 | `/29` | `192.168.50.80` | `.81–.86` | `.87` |
| punto a punto | 2 | `/30` | `192.168.50.88` | `.89–.90` | `.91` |

`/27` ofrece 30 hosts tradicionales y no alcanza para 36.

## Parte B — Arquitectura

- DMZ: API o reverse proxy;
- nunca exponer directamente la base;
- permitir desde Internet solo el puerto del servicio publicado;
- permitir de DMZ a aplicación únicamente la comunicación necesaria;
- permitir de aplicación a base solo el puerto y origen requeridos.

El firewall perimetral limita exposición externa; el interno protege aplicación y datos aunque la DMZ sea comprometida.

## Parte C — Transporte

1. sincronización: TCP/HTTPS;
2. videollamada: normalmente UDP por latencia;
3. API a base: TCP;
4. sensor tolerante: UDP puede ser adecuado.

La elección depende de los requisitos reales, no solo del nombre de la aplicación.

## Parte D — Routing

1. `10.30.40.25` → `10.30.40.0/24` por `192.168.50.2`;
2. `10.30.80.10` → `10.30.0.0/16` por `192.168.50.1`;
3. `8.8.8.8` → ruta por defecto por `192.168.50.254`;
4. primero se usa el prefijo más específico; la métrica compara alternativas equivalentes según el protocolo y la configuración.

## Parte E — WAN

- VPN: menor costo inicial, depende de Internet, cifra según el protocolo usado y requiere administración propia;
- MPLS: servicio administrado con conectividad WAN y políticas de proveedor, costo recurrente y dependencia alta;
- MPLS no garantiza cifrado; puede complementarse con VPN;
- la decisión depende de disponibilidad, SLA, costo, control y capacidad operativa.
