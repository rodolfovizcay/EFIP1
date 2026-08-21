# Caso integrador — Red para SIGO

## Contexto

SIGO tiene:

- teléfonos de operarios que trabajan por Internet;
- API pública controlada;
- servidor de aplicaciones;
- base de datos central;
- una sede con 36 puestos;
- una red de servidores con 14 direcciones;
- una red de administración con 6 direcciones;
- un enlace tradicional punto a punto con 2 direcciones utilizables.

Se dispone de `192.168.50.0/24` para la sede.

---

# Parte A — VLSM

1. Elegí el prefijo mínimo para cada necesidad.
2. Asigná subredes sin superposición, de mayor a menor.
3. Para cada subred indicá:
   - red;
   - primer host;
   - último host;
   - broadcast.
4. Explicá por qué no alcanza `/27` para 36 hosts.

Tabla a completar:

| Uso | Necesidad | Prefijo | Red | Rango | Broadcast |
|---|---:|---:|---|---|---|
| puestos | 36 | | | | |
| servidores | 14 | | | | |
| administración | 6 | | | | |
| punto a punto | 2 | | | | |

---

# Parte B — Arquitectura

Representá:

```text
teléfono
→ Internet
→ VPN o HTTPS
→ firewall perimetral
→ DMZ
→ firewall interno
→ aplicación
→ base de datos
```

Indicá:

1. qué componente ubicarías en DMZ;
2. qué componente nunca publicarías directamente;
3. qué reglas mínimas aplicarías;
4. qué función cumple cada firewall.

---

# Parte C — Transporte

Elegí TCP o UDP y justificá:

1. sincronizar trabajos;
2. videollamada del operario;
3. consulta desde API a base de datos;
4. sensor que informa temperatura cada segundo y tolera alguna pérdida.

---

# Parte D — Routing

Tabla:

| Destino | Siguiente salto | Interfaz | Métrica |
|---|---|---|---:|
| `192.168.50.0/24` | directa | LAN | 0 |
| `10.30.0.0/16` | `192.168.50.1` | LAN | 20 |
| `10.30.40.0/24` | `192.168.50.2` | LAN | 10 |
| `0.0.0.0/0` | `192.168.50.254` | WAN | 100 |

Respondé:

1. ¿qué ruta se usa para `10.30.40.25`?
2. ¿qué ruta se usa para `10.30.80.10`?
3. ¿qué ruta se usa para `8.8.8.8`?
4. ¿por qué se elige la coincidencia más específica antes que la métrica?

---

# Parte E — Decisión WAN

Compará:

- VPN sobre Internet;
- servicio MPLS contratado.

Usá:

- costo;
- control;
- disponibilidad;
- cifrado;
- administración;
- dependencia del proveedor.

No atribuyas cifrado automático a MPLS.

---

# Clave estructural

La solución debe poder defender este recorrido:

```text
necesidad de hosts
→ prefijo
→ subred
→ router
→ transporte
→ segmentación
→ exposición controlada
```
