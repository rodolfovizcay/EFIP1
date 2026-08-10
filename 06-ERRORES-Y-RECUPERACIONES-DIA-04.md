# Errores y recuperaciones — Estado al cierre del Día 4

## Recuperaciones confirmadas

### E-009 — Capas OSI

**Estado:** recuperado conceptualmente.

El estudiante recordó las siete capas y explicó sus funciones.

```text
1 Física
2 Enlace
3 Red
4 Transporte
5 Sesión
6 Presentación
7 Aplicación
```

Pendiente menor: respetar el sentido solicitado por la consigna.

---

## Error todavía abierto del diagnóstico

### E-010 — Síncrona / asíncrona

**Estado:** abierto.

No fue evaluado en el Día 4.

Recordatorio futuro:

```text
Asíncrona:
carácter por carácter, bits de inicio/parada, intervalos variables.

Síncrona:
bloques/tramas sincronizados, mayor eficiencia de canal.
```

---

## Nuevos errores / ajustes del Día 4

### E-024 — TCP/IP tratado como un único protocolo

- **Tipo:** terminológico.
- **Corrección:** TCP/IP es una arquitectura o pila/conjunto de protocolos.
- **Estado:** abierto.

---

### E-025 — PDU definida solo como datos

- **Tipo:** conceptual.
- **Corrección:**

```text
PDU = SDU + PCI
PDU = datos + información de control del protocolo
```

- **Estado:** abierto.

---

### E-026 — IP limitada a “fuera de la red local”

- **Tipo:** conceptual.
- **Corrección:** IP es direccionamiento lógico para identificar interfaces/redes y permitir encaminamiento; existe también dentro de la LAN.
- **Estado:** corregido, pendiente de consolidación.

---

### E-027 — Puerto como puerta física/lógica de entrada y salida

- **Tipo:** terminológico.
- **Corrección:** un puerto identifica un proceso o servicio de transporte dentro de un host.
- **Estado:** abierto.

---

### E-028 — Función de dispositivo atribuida a la capa

- **Tipo:** precisión conceptual.
- **Ejemplos:**
  - tabla MAC → comportamiento típico de un switch;
  - tabla de enrutamiento → comportamiento típico de un router.
- **Corrección:** distinguir las funciones generales de la capa de las implementaciones de dispositivos concretos.
- **Estado:** abierto.

---

### E-029 — Unidad asociada a switch/router omitida

- **Tipo:** cobertura de consigna.
- **Corrección:**

```text
Switch → trama
Router → paquete/datagrama
```

- **Estado:** abierto.

---

## Fórmulas de recuperación

```text
TCP/IP = arquitectura/pila de protocolos

PDU = datos + información de control

MAC = direccionamiento de enlace

IP = direccionamiento lógico de red

Puerto = proceso/servicio

Switch = capa 2 + MAC + trama

Router = capa 3 + IP + paquete
```
