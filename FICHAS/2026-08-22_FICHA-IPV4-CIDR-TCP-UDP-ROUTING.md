# Ficha — IPv4, CIDR, TCP/UDP y routing

## CIDR

```text
IPv4 = 32 bits
bits de host = 32 - prefijo
total = 2^h
utilizables tradicionales = 2^h - 2
```

| Necesidad | Prefijo mínimo tradicional |
|---:|---:|
| 2 hosts | `/30` |
| 3–6 | `/29` |
| 7–14 | `/28` |
| 15–30 | `/27` |
| 31–62 | `/26` |

`/31` se usa como caso especial en enlaces punto a punto; `/32` identifica una única dirección.

## Bloques

En el último octeto:

```text
/26 → 64
/27 → 32
/28 → 16
/29 → 8
/30 → 4
```

La red es el múltiplo del tamaño de bloque que contiene la IP. El broadcast es el valor anterior al siguiente bloque.

## Transporte

```text
TCP → conexión, orden, control y retransmisión
UDP → menor overhead, sin garantía de entrega u orden
```

Handshake TCP:

```text
SYN → SYN-ACK → ACK
```

## Routing

```text
destino/prefijo
→ coincidencia más específica
→ siguiente salto
→ interfaz
→ métrica
```

La MAC cambia por enlace. Las IP origen/destino del paquete normalmente se conservan de extremo a extremo, salvo mecanismos como NAT.

## Errores a evitar

- usar la MAC del servidor remoto en la primera trama;
- restar dos hosts a `/31` o `/32` sin aclarar el caso;
- creer que `/24` significa 24 hosts;
- afirmar que UDP nunca sirve;
- pensar que la métrica es la dirección del siguiente salto;
- creer que MPLS cifra por definición.
