# Ficha — LAN, MAN, WAN, VPN, DMZ y MPLS

## Alcance

| Tipo | Alcance típico |
|---|---|
| LAN | edificio, oficina o predio |
| MAN | área metropolitana |
| WAN | regiones, países o sedes distantes |

## Conmutación

- difusión: el medio es compartido;
- circuitos: camino reservado;
- paquetes: enlaces compartidos y datos divididos en paquetes;
- datagrama: paquetes pueden seguir caminos distintos;
- circuito virtual: paquetes siguen un camino lógico establecido.

## Seguridad e interconexión

### VPN

Crea un túnel protegido para conectar usuarios o redes sobre infraestructura no confiable.

### DMZ

Segmento separado donde se ubican servicios que deben ser accesibles desde redes externas. Reduce exposición de la red interna, pero no reemplaza autenticación ni actualización.

### MPLS

Tecnología de operador que reenvía tráfico usando etiquetas y permite construir servicios WAN. No implica cifrado por sí sola.

### Firewall

Aplica políticas de tráfico. Puede filtrar por direcciones, puertos, estado de conexión y, según el equipo, información de capas superiores.

## Diseño mínimo SIGO

```text
Internet
→ firewall perimetral
→ DMZ: API/reverse proxy
→ firewall interno
→ aplicación
→ base de datos
```

Acceso remoto:

```text
teléfono → HTTPS o VPN → API
```

Sedes:

```text
LAN sede A ↔ VPN/MPLS ↔ LAN sede central
```

## Principio

```text
exponer solo lo necesario
segmentar por función
dar mínimo privilegio
no publicar la base de datos
```
