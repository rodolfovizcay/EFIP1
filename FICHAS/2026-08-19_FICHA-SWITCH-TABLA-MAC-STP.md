# Ficha — Switch, tabla MAC y STP

**Fecha:** 19/08/2026
**Materia:** Comunicaciones
**Estado:** material preparado

---

# 1. Qué hace un switch de capa 2

Un switch recibe tramas por sus puertos y decide cómo reenviarlas dentro de una LAN o VLAN. La decisión utiliza:

```text
MAC destino + tabla MAC → puerto de salida
```

El aprendizaje utiliza una información diferente:

```text
MAC origen + puerto de entrada → actualización de tabla MAC
```

Regla fundamental:

> El switch aprende observando la MAC origen; decide consultando la MAC destino.

---

# 2. Tabla MAC

También puede llamarse tabla de direcciones o tabla de reenvío de capa 2.

Ejemplo:

| VLAN | MAC | Puerto | Tipo/edad |
|---:|---|---|---|
| 10 | `AA-AA-AA-AA-AA-AA` | 1 | dinámica |
| 10 | `BB-BB-BB-BB-BB-BB` | 2 | dinámica |
| 10 | `CC-CC-CC-CC-CC-CC` | 3 | dinámica |

Una entrada dinámica se actualiza cuando llegan tramas y se elimina después de un tiempo sin actividad. Ese envejecimiento evita conservar ubicaciones antiguas indefinidamente.

---

# 3. Algoritmo por cada trama recibida

```text
1. Recibir la trama por un puerto.
2. Verificar la trama según las capacidades del equipo.
3. Aprender/actualizar MAC origen → puerto de entrada.
4. Consultar la MAC destino.
5. Aplicar una decisión de reenvío.
```

## Decisiones

| Destino | Acción básica |
|---|---|
| unicast conocido en otro puerto | reenviar solo por ese puerto |
| unicast conocido en el mismo puerto de entrada | filtrar; no reenviar |
| unicast desconocido | inundar por puertos habilitados de la VLAN, excepto entrada |
| broadcast | inundar por la VLAN, excepto entrada |
| multicast | depende de configuración; sin mecanismos específicos puede inundarse |

“Inundar” no significa enviar a cualquier red: se limita al dominio lógico correspondiente y respeta puertos/estados habilitados.

---

# 4. Simulación completa

Topología:

```text
P1 — A (AA)
P2 — B (BB)
P3 — C (CC)
P4 — enlace a otro switch
```

Tabla inicial: vacía.

## Paso 1 — A envía a B

```text
origen AA entra por P1 → aprender AA→P1
destino BB desconocido → inundar P2, P3 y P4
```

Tabla:

| MAC | Puerto |
|---|---|
| AA | P1 |

## Paso 2 — B responde a A

```text
origen BB entra por P2 → aprender BB→P2
destino AA conocido → reenviar solo P1
```

Tabla:

| MAC | Puerto |
|---|---|
| AA | P1 |
| BB | P2 |

## Paso 3 — C envía a A

```text
origen CC entra por P3 → aprender CC→P3
destino AA conocido → reenviar solo P1
```

## Paso 4 — A envía nuevamente a B

```text
refrescar AA→P1
destino BB conocido → reenviar solo P2
```

La primera trama puede inundarse; las siguientes se vuelven selectivas cuando la tabla tiene información.

---

# 5. Movimientos y envejecimiento

Si una MAC antes aprendida en P1 aparece como origen por P3, el switch actualiza su ubicación. Esto permite que un equipo cambie de puerto.

Si el mismo origen alterna rápidamente entre puertos sin un movimiento real, puede existir:

- un bucle;
- una conexión incorrecta;
- una topología redundante sin control;
- otra anomalía.

Este síntoma se conoce como inestabilidad o *flapping* de MAC.

---

# 6. Por qué un bucle de capa 2 es peligroso

Los enlaces redundantes mejoran disponibilidad, pero si todos reenvían simultáneamente pueden formar un ciclo.

```text
trama broadcast o unicast desconocida
→ switch la inunda
→ otro switch la vuelve a recibir e inundar
→ aparecen copias
→ la trama circula por el ciclo
```

Consecuencias:

- tormenta de broadcast;
- duplicación de tramas;
- uso excesivo de enlaces y CPU;
- saturación de búferes;
- cambios continuos en la tabla MAC;
- degradación o caída de la LAN.

Una trama Ethernet no posee un campo TTL equivalente al de IP que termine el ciclo después de cierta cantidad de saltos.

---

# 7. Función de STP

STP (*Spanning Tree Protocol*) permite conservar enlaces físicos redundantes y construir una topología lógica sin bucles.

Idea central:

```text
topología física con redundancia
→ STP selecciona caminos activos
→ deja algún camino redundante sin reenviar tráfico normal
→ si cambia la topología, recalcula
```

## Proceso conceptual ampliado

1. elegir un puente raíz;
2. calcular el mejor costo hacia la raíz;
3. asignar funciones a los puertos;
4. permitir reenvío en los caminos elegidos;
5. impedir el reenvío en los caminos redundantes que cerrarían el ciclo;
6. reconverger cuando ocurre una falla o cambio.

Para el núcleo basta con explicar función, problema y resultado. Los roles, estados, temporizadores y variantes rápidas pueden estudiarse después.

---

# 8. Redundancia no significa reenvío simultáneo irrestricto

STP no “elimina el cable” ni destruye la redundancia. Mantiene un enlace disponible físicamente, pero controla si participa del reenvío lógico.

```text
enlace redundante bloqueado lógicamente
→ falla un camino activo
→ cambio de topología
→ STP puede habilitar el alternativo
```

Existe un período de reconvergencia; no debe prometerse continuidad instantánea sin conocer la tecnología y configuración.

---

# 9. Bucle de capa 2 frente a bucle de enrutamiento

| Rasgo | Bucle de capa 2 | Bucle de capa 3 |
|---|---|---|
| unidad | trama | paquete IP |
| decisión | tabla MAC/puerto | tabla de rutas/siguiente salto |
| causa típica | caminos redundantes de switching activos | rutas inconsistentes entre routers |
| límite incorporado | trama Ethernet sin TTL | IP usa TTL/Hop Limit |
| control relacionado | STP/RSTP y diseño L2 | protocolos/métricas, convergencia y TTL |

El TTL limita la vida de un paquete, pero un bucle de routing sigue causando pérdida, latencia y consumo de recursos hasta que la red converge o se corrige.

---

# 10. Tabla MAC, ARP y tabla de routing

| Estructura | Relación que guarda | Consumidor principal |
|---|---|---|
| tabla MAC | MAC → puerto | switch de capa 2 |
| caché ARP | IPv4 local → MAC | host o router |
| tabla de routing | red IP/prefijo → siguiente salto/interfaz | router o host |

No son nombres distintos para la misma tabla.

---

# 11. Switch frente a router

```text
Switch capa 2
entrada: trama
clave: MAC destino
tabla: MAC → puerto
salida: puerto dentro de la LAN/VLAN
```

```text
Router capa 3
entrada: paquete IP extraído de una trama
clave: IP destino y prefijo más específico
tabla: red IP → siguiente salto/interfaz
salida: otra interfaz y nueva trama para el enlace siguiente
```

Un router no reenvía la misma trama Ethernet extremo a extremo: procesa el paquete y construye una trama apropiada para el enlace de salida.

---

# 12. Dominios

Ampliación útil:

- cada puerto de un switch en full-duplex forma un dominio de colisión separado;
- una VLAN delimita un dominio de broadcast de capa 2;
- para comunicar VLAN o redes IP distintas se necesita función de capa 3.

STP opera sobre la topología de capa 2; no reemplaza al enrutamiento.

---

# 13. Errores frecuentes

1. Decir que el switch aprende de la MAC destino.
2. Decir que un destino desconocido se descarta siempre.
3. Inundar también por el puerto de entrada.
4. Confundir inundación con broadcast originado por el switch.
5. Suponer que la tabla MAC es permanente.
6. Confundir tabla MAC, ARP y routing.
7. Decir que STP elimina la redundancia física.
8. Afirmar que un bucle L2 se corta por TTL.
9. Usar STP para resolver un bucle de rutas IP.

---

# 14. Preguntas de defensa oral

1. ¿De qué campo aprende el switch y qué registra?
2. ¿Qué consulta para decidir el reenvío?
3. ¿Qué diferencia hay entre destino conocido y desconocido?
4. ¿Cuándo filtra una trama?
5. ¿Por qué envejecen las entradas dinámicas?
6. ¿Qué efectos produce un bucle de capa 2?
7. ¿Cómo conserva STP la redundancia sin mantener el ciclo activo?
8. ¿Qué diferencia hay entre la tabla de un switch y la de un router?

---

# 15. Fuente y alcance

Switch de capa 2, STP y bucles por enlaces redundantes: `COMUNICACIONES.md`.
Aprendizaje detallado, tabla MAC, inundación, envejecimiento, flapping, ausencia de TTL en Ethernet y comparación de tablas: ampliación complementaria prevista por el plan maestro.
