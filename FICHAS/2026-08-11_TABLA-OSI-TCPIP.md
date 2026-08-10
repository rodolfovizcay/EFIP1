# Tabla de estudio — OSI y TCP/IP

**Fecha:** 11/08/2026  
**Materia:** Comunicaciones

---

## Definiciones

```text
OSI
Modelo de referencia de siete capas que organiza las funciones
típicas de una comunicación.

TCP/IP
Arquitectura o pila de protocolos utilizada en la práctica
para interconectar redes.
```

No definir TCP/IP como un único protocolo.

---

## Correspondencia

| N.º OSI | Capa OSI | Función principal | Conceptos/PDU | Capa TCP/IP del material |
|---:|---|---|---|---|
| 7 | Aplicación | Servicios a aplicaciones/usuarios | Datos, servicios | Aplicación |
| 6 | Presentación | Representación de la información | Formatos/codificación | Aplicación |
| 5 | Sesión | Diálogo y mantenimiento de sesión | Puntos de diálogo | Aplicación |
| 4 | Transporte | Comunicación extremo a extremo | Segmento, puerto | Transporte |
| 3 | Red | Direccionamiento lógico y encaminamiento | Paquete/datagrama, IP | Internet |
| 2 | Enlace de datos | Tramas, MAC y acceso al medio | Trama, MAC | Acceso a la red |
| 1 | Física | Transmisión de bits/señales | Bits, medio | Física |

---

## Cinco capas TCP/IP según el material

```text
5 Aplicación
4 Transporte
3 Internet
2 Acceso a la red
1 Física
```

### Aplicación

Agrupa funciones que OSI separa en:

- aplicación;
- presentación;
- sesión.

### Transporte

Transferencia extremo a extremo mediante protocolos como TCP o UDP.

### Internet

Direccionamiento y encaminamiento mediante IP.

### Acceso a la red

Interfaz lógica con la subred, enlace y acceso al medio.

### Física

Medio, codificación y señalización.

---

## Similitudes

- organización en capas;
- separación de responsabilidades;
- servicios entre niveles;
- protocolos pares;
- transporte extremo a extremo.

## Diferencias

| OSI | TCP/IP |
|---|---|
| Modelo general de referencia | Arquitectura/pila aplicada en la práctica |
| Siete capas | Cinco capas según el material |
| Concebido antes de muchos protocolos | Organizado alrededor de protocolos reales |
| Sesión y Presentación separadas | Sus funciones quedan en Aplicación |

---

## Encapsulamiento

```text
Emisor:
Aplicación → Transporte → Internet/Red → Acceso/Enlace → Física

Receptor:
Física → Acceso/Enlace → Internet/Red → Transporte → Aplicación
```

Cada capa puede agregar información de control. En destino, cada capa interpreta y retira la información que le corresponde.

---

## Cadena de unidades

```text
Datos
  ↓
Segmento / unidad de transporte
  ↓
Paquete / datagrama
  ↓
Trama
  ↓
Bits / señales
```

---

## PDU

```text
PDU = Protocol Data Unit
    = Unidad de Datos de Protocolo

PDU = SDU + PCI
PDU = datos + información de control
```

- **SDU:** datos recibidos desde la capa superior.
- **PCI:** información de control agregada por el protocolo.

### No confundir

```text
PUD → Proceso Unificado de Desarrollo.
PDU → Unidad de Datos de Protocolo.
```

---

## Direccionamiento

```text
MAC    → enlace local.
IP     → direccionamiento lógico y redes.
Puerto → proceso o servicio de transporte dentro del host.
```

---

## Dispositivos y unidades

```text
Switch
- capa 2;
- MAC;
- trama;
- comunicación dentro de la LAN.

Router
- capa 3;
- IP;
- paquete/datagrama;
- interconexión y encaminamiento entre redes.
```

Distinguir funciones generales de la capa de las funciones particulares de un dispositivo.

---

## Recorrido de una consulta móvil

```text
1. Aplicación genera “Consultar OT 1587”.
2. Transporte identifica procesos mediante puertos.
3. Internet agrega IP y permite encaminamiento.
4. Acceso a red forma la trama y utiliza MAC local.
5. Física transmite bits/señales.
6. El servidor desencapsula en orden inverso.
7. La respuesta vuelve siguiendo el mismo principio.
```

---

## Tabla para reproducir sin mirar

Completar de memoria:

| OSI | Función | PDU/concepto | TCP/IP |
|---|---|---|---|
| Aplicación | | | |
| Presentación | | | |
| Sesión | | | |
| Transporte | | | |
| Red | | | |
| Enlace | | | |
| Física | | | |

---

## Respuesta oral modelo

> OSI es un modelo de referencia de siete capas que organiza las funciones de una comunicación. TCP/IP es una arquitectura o pila de protocolos empleada en la práctica y el material la presenta en cinco capas. Ambos separan responsabilidades, pero TCP/IP reúne las funciones de Aplicación, Presentación y Sesión de OSI dentro de su capa de Aplicación. Durante el encapsulamiento, cada capa agrega control; el receptor desencapsula en orden inverso. Una PDU combina datos e información de control.

---

## Preguntas rápidas

1. ¿Cuáles son las siete capas OSI en orden ascendente?
2. ¿Cuáles son las cinco capas TCP/IP?
3. ¿Qué capas OSI reúne Aplicación TCP/IP?
4. ¿Qué función tiene Transporte?
5. ¿Qué diferencia existe entre Red y Enlace?
6. ¿Qué es encapsular?
7. ¿Qué es desencapsular?
8. ¿Qué es una PDU?
9. ¿Qué diferencia existe entre MAC, IP y puerto?
10. ¿Qué unidades manejan switch y router?
