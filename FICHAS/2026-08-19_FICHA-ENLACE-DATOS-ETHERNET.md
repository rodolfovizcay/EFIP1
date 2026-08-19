# Ficha — Enlace de datos, protocolos y Ethernet

**Fecha:** 19/08/2026
**Materia:** Comunicaciones
**Estado:** material preparado

---

# 1. Ubicación en OSI

```text
Capa 3 — Red              → paquetes y direcciones IP
Capa 2 — Enlace de datos  → tramas y direcciones MAC
Capa 1 — Física           → bits representados por señales
```

La capa 2 prepara la PDU de red para transportarla sobre un enlace concreto. Sus responsabilidades incluyen entramado, direccionamiento físico, acceso al medio y detección de errores.

No garantiza por sí sola que toda comunicación extremo a extremo sea exitosa: trabaja sobre el enlace o segmento correspondiente.

---

# 2. Funciones generales de los protocolos

Un protocolo define reglas y el formato de las PDU intercambiadas. Entre sus funciones pueden aparecer:

| Función | Pregunta que resuelve |
|---|---|
| encapsulado | ¿qué información de control se agrega? |
| segmentación | ¿cómo se divide la información? |
| reensamblado | ¿cómo se reconstruye en destino? |
| ordenamiento | ¿cómo se conserva o recupera la secuencia? |
| control de conexión | ¿cómo se establece, mantiene y termina? |
| control de flujo | ¿cómo se evita superar al receptor? |
| direccionamiento | ¿quién origina y quién recibe? |
| control/detección de errores | ¿cómo se detectan pérdidas o alteraciones? |
| multiplexación | ¿cómo comparten el vínculo varios protocolos/procesos? |

No todos los protocolos implementan todas las funciones del mismo modo.

---

# 3. PDU e interfaz entre capas

Modelo conceptual:

```text
SDU = datos recibidos de la capa superior
PCI = información de control propia del protocolo
PDU = PCI + SDU
```

En capa 2:

```text
PDU de capa 3
→ se encapsula como datos de una trama
→ se agrega encabezado y tráiler
→ capa física transmite los bits como señales
```

---

# 4. Estructura general de una trama

```text
encabezado | datos | tráiler
```

- **Encabezado:** direccionamiento y control del protocolo.
- **Datos:** PDU de capa 3 encapsulada.
- **Tráiler:** información para detectar errores, como FCS/CRC.

Detección no significa corrección. Si el cálculo del receptor no coincide con el FCS recibido, la trama se considera dañada.

---

# 5. HDLC

HDLC (*High-Level Data Link Control*) es un protocolo de referencia importante de capa 2.

Ideas del material:

- propósito general;
- comunicación controlada y confiable sobre el enlace;
- mecanismos ante pérdida, secuencia y otros errores;
- estaciones primaria, secundaria y combinada;
- configuraciones balanceada y no balanceada;
- distintos modos de transferencia.

Para el examen conceptual alcanza con reconocerlo como protocolo modelo de enlace y no confundirlo con Ethernet o IP.

---

# 6. PPP

PPP (*Point-to-Point Protocol*) se utiliza en enlaces punto a punto.

Características centrales:

- enlace entre dos extremos;
- operación bidireccional;
- tramas ordenadas según el supuesto del enlace;
- encapsulación de diferentes protocolos de capa de red;
- LCP para establecer, configurar y probar el vínculo;
- autenticación opcional mediante PAP o CHAP;
- trama con delimitadores, control, datos y comprobación.

Regla oral:

```text
PPP → punto a punto
Ethernet → LAN y acceso al medio
HDLC → protocolo de referencia/control de enlace
```

---

# 7. Ethernet

Ethernet es una familia de tecnologías ampliamente usada en LAN. Abarca aspectos de capa 2 y capa 1 y se relaciona con los estándares IEEE 802.3.

En el nivel conceptual del día:

- la unidad de capa 2 es la trama;
- las direcciones físicas son MAC;
- MAC interviene en encapsulado y acceso al medio;
- LLC relaciona la capa de red con MAC;
- el switch de capa 2 decide a partir de direcciones MAC.

## Ethernet e IEEE 802.3

No deben tratarse como sinónimos históricos perfectos. Para la defensa:

```text
IEEE 802.3 especifica Ethernet para LAN,
incluidos aspectos de MAC y capa física.
```

El material destaca estándares y velocidades diferentes dentro de la familia.

---

# 8. Subcapas LLC y MAC

## LLC — Logical Link Control

- parte superior de enlace de datos;
- atiende la relación entre la capa de red y MAC;
- ayuda a identificar o entregar la PDU al protocolo superior correspondiente;
- se asocia históricamente con IEEE 802.2.

## MAC — Media Access Control

- parte inferior de enlace de datos;
- se comunica directamente con la capa física;
- arma y desarma tramas;
- agrega encabezado y tráiler;
- proporciona direccionamiento físico;
- realiza detección mediante FCS/CRC;
- controla la colocación y remoción de tramas en el medio.

```text
capa 3
↓
LLC — vínculo lógico con protocolos superiores
↓
MAC — trama, dirección y acceso al medio
↓
capa física
```

---

# 9. Dirección MAC

Una dirección MAC Ethernet habitual tiene 48 bits y se expresa en hexadecimal.

Ejemplo:

```text
AA:BB:CC:DD:EE:FF
```

En una trama aparecen MAC origen y MAC destino.

- **origen:** permite identificar quién transmitió en ese enlace; el switch aprende a partir de ella;
- **destino:** permite decidir a qué puerto reenviar la trama.

La MAC opera en el dominio de capa 2 correspondiente. Una dirección IP cumple una función lógica distinta en capa 3.

---

# 10. Trama Ethernet ampliada

Esta estructura detallada es una ampliación de apoyo:

| Campo | Tamaño típico | Función |
|---|---:|---|
| preámbulo | 7 bytes | sincronización |
| SFD | 1 byte | inicio de trama |
| MAC destino | 6 bytes | receptor de capa 2 |
| MAC origen | 6 bytes | emisor de capa 2 |
| tipo/longitud | 2 bytes | protocolo superior o longitud |
| datos y relleno | 46–1500 bytes | PDU encapsulada |
| FCS | 4 bytes | detección de errores CRC |

El tamaño Ethernet común de 64 a 1518 bytes no cuenta preámbulo ni SFD y puede variar cuando existen etiquetas como VLAN. Para el núcleo, retener campos y función, no memorizar tamaños si no se solicita.

---

# 11. CSMA/CD y Ethernet conmutada

El material presenta CSMA/CD como mecanismo clásico de acceso por contienda en medios Ethernet compartidos: escuchar, transmitir, detectar colisión, detenerse, esperar un tiempo aleatorio y reintentar.

Precisión complementaria:

- fue relevante en Ethernet compartida o half-duplex;
- en enlaces modernos conmutados full-duplex no se producen colisiones entre los dos extremos del enlace y CSMA/CD no se utiliza en la operación normal;
- esto no elimina broadcasts ni el riesgo de bucles entre switches.

---

# 12. IEEE 802.x — mapa mínimo

| Estándar | Tema que debe reconocerse |
|---|---|
| IEEE 802.1 | arquitectura/puentes y familia 802; STP pertenece a esta familia |
| IEEE 802.2 | LLC, referencia histórica |
| IEEE 802.3 | Ethernet |
| IEEE 802.11 | LAN inalámbrica |
| IEEE 802.15 | redes personales inalámbricas |

No es necesario memorizar toda la familia para defender el núcleo del día.

---

# 13. Comparación

| Rasgo | HDLC | PPP | Ethernet |
|---|---|---|---|
| capa | 2 | 2 | 2 y especificaciones físicas asociadas |
| escenario | control general de enlace | punto a punto | LAN |
| acceso compartido | no es la idea central | no, dos extremos | históricamente contienda; hoy conmutado |
| negociación | según modo/protocolo | LCP y protocolos asociados | no es el foco de esta comparación |
| dirección relevante del día | campos propios del enlace | dirección fija en el formato presentado | MAC origen/destino |

---

# 14. Errores frecuentes

1. Decir que el cable “transporta tramas” físicamente: transporta señales que representan bits; la trama es la organización lógica de esos bits en capa 2.
2. Confundir FCS con corrección automática.
3. Confundir MAC con IP.
4. Ubicar PPP en capa 3.
5. Afirmar que LLC y MAC son capas OSI independientes; son subcapas de enlace.
6. Suponer que Ethernet e IEEE 802.3 son términos históricos idénticos en toda definición.
7. Generalizar CSMA/CD a todos los enlaces Ethernet actuales.

---

# 15. Defensa oral breve

1. ¿Qué encapsula una trama en su campo de datos?
2. ¿Qué diferencia hay entre detectar y corregir errores?
3. ¿Por qué PPP es adecuado para punto a punto?
4. ¿Qué función cumple LCP?
5. ¿Cómo se dividen LLC y MAC las responsabilidades?
6. ¿Qué campos usa un switch para aprender y para decidir?
7. ¿Qué relación existe entre capa 1, bits, señales y trama?

---

# 16. Fuente y alcance

Funciones de protocolos, PDU, HDLC, PPP, Ethernet, trama, LLC, MAC, IEEE 802.x, CSMA/CD y STP: `COMUNICACIONES.md`.
Detalle de campos/tamaños de Ethernet y precisión sobre Ethernet conmutada full-duplex: ampliación complementaria.
