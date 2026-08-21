# Resumen guiado — Día 15

## IPv4

```text
32 bits
prefijo = bits de red
host = 32 - prefijo
total = 2^h
utilizables tradicionales = 2^h - 2
```

```text
/29 → 8/6
/28 → 16/14
/27 → 32/30
/26 → 64/62
```

## Transporte

```text
TCP → confiabilidad, orden, retransmisión
UDP → menor overhead, tolerancia a pérdida
```

Handshake:

```text
SYN → SYN-ACK → ACK
```

## Interconexión

```text
switch → MAC → trama → capa 2
router → IP → paquete → capa 3
```

Primera trama a otra red: MAC de la puerta de enlace.

Routing:

```text
prefijo más específico
→ siguiente salto
→ interfaz
→ métrica
```

## Arquitectura

```text
VPN  → túnel protegido
DMZ  → segmento de exposición controlada
MPLS → red de proveedor por etiquetas
firewall → aplica políticas
```

## Defensa breve

> IPv4 usa 32 bits y CIDR separa red y host. El switch decide con MAC dentro de la red local y el router con IP entre redes. TCP se elige cuando importan entrega y orden; UDP cuando se prioriza latencia y se toleran pérdidas. En SIGO, la API puede exponerse en una DMZ detrás de firewall, mientras aplicación y base permanecen internas. Una VPN protege acceso remoto y MPLS puede conectar sedes, pero MPLS no cifra automáticamente.
