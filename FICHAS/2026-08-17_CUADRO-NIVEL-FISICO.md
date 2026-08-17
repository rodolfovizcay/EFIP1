# Cuadro — Nivel físico, medios y limitaciones
## Día 10 — 17/08/2026

---

# 1. Función de la capa física

La capa física tiene como propósito transportar bits de una máquina a otra mediante señales.

```text
Bits
→ codificación o modulación
→ señal eléctrica, luminosa o radioeléctrica
→ medio físico
→ receptor
```

Puede definir:

```text
medio
conectores
interfaz física
niveles eléctricos o de potencia
codificación
modulación
detección de señal
```

No interpreta:

```text
IP
puertos
estado de una OT
contenido de aplicación
```

---

# 2. Medios guiados y no guiados

## Guiados

La señal sigue un medio material.

Ejemplos del material:

```text
cobre
par trenzado
coaxial
fibra óptica
```

## No guiados

La señal se propaga por el espacio.

Ejemplos del material:

```text
radiofrecuencia
transmisión inalámbrica terrestre
satélite
láser a través del aire
```

## Par trenzado: UTP, FTP y STP

Los conductores se organizan en pares y se trenzan para que las perturbaciones inducidas afecten de manera semejante a ambos conductores y puedan reducirse al interpretar la diferencia de la señal.

```text
Trenzado
→ reduce susceptibilidad a interferencia y diafonía.

Blindaje
→ agrega protección frente a campos electromagnéticos externos.
```

| Cable | Idea principal | Ventaja | Condición a considerar |
|---|---|---|---|
| UTP | Par trenzado sin blindaje adicional | costo e instalación habituales | más dependiente del ambiente electromagnético |
| FTP | Pares con blindaje global mediante lámina | mayor protección externa | instalación y puesta a tierra correctas |
| STP | Par trenzado con blindaje adicional según construcción | mayor inmunidad en ambientes exigentes | costo, rigidez y terminación |

No confundir:

```text
STP — cable
→ Shielded Twisted Pair.

STP — protocolo
→ Spanning Tree Protocol.
```

`COMUNICACIONES.md` menciona UTP, par trenzado, diafonía e interferencia. La comparación FTP/STP y la explicación detallada del trenzado son ampliaciones complementarias.

---

# 3. Criterios de selección

Ningún medio es siempre mejor. Deben analizarse:

```text
ancho de banda requerido
distancia
retardo/latencia
costo inicial
costo de mantenimiento
facilidad de instalación
obstáculos
interferencia electromagnética
seguridad física
infraestructura existente
condiciones ambientales
escalabilidad
```

Plantilla:

```text
Escenario:
Distancia:
Obstáculos:
Capacidad requerida:
Interferencia:
Latencia tolerable:
Infraestructura disponible:
Costo:
Mantenimiento:
Medio candidato:
Interfaz/dispositivo:
Supuesto:
```

---

# 4. Cuadro comparativo didáctico

| Medio | Tipo | Ventaja conceptual | Limitación a analizar | Escenario típico |
|---|---|---|---|---|
| UTP | Guiado | Instalación extendida y costo moderado | distancia, interferencia y calidad del cable | red local/acceso existente |
| FTP/STP | Guiado | blindaje frente a interferencia electromagnética | costo, puesta a tierra y terminación | entorno industrial o eléctricamente ruidoso |
| Coaxial | Guiado | Buen confinamiento de señal | instalación y tecnología disponible | redes y distribución específicas |
| Fibra óptica | Guiado | alta capacidad y resistencia a interferencia electromagnética | costo, terminación e interfaces compatibles | troncales y enlaces exigentes |
| Radio/Wi-Fi | No guiado | despliegue sin cable | obstáculos, interferencia y cobertura | acceso local/móvil |
| WiMAX | No guiado | alternativa de acceso metropolitano | cobertura, espectro e infraestructura | última milla sin cable |
| Satélite | No guiado | cobertura en zonas remotas | latencia, costo y condiciones del servicio | zonas rurales o aisladas |

> Las prestaciones concretas dependen de la tecnología y del estándar. No deben inventarse distancias o velocidades si el caso no las proporciona.

---

# 5. Tipos de enlace

## Punto a punto

```text
comunicación directa o dedicada entre dos puntos
```

Ventajas posibles:

- menor exposición a terceros;
- menor ruido/distorsión en un enlace controlado;
- comportamiento más predecible.

Costo posible:

- implementación más cara.

## Multipunto o compartido

```text
varios participantes comparten parte del medio
```

Consecuencias posibles:

- menor costo;
- mayor necesidad de coordinación;
- más posibilidad de ruido, interferencia o competencia por el medio.

---

# 6. Caminos directos e indirectos

```text
Directo
→ origen y destino se conectan sin intermediarios relevantes.

Indirecto
→ la señal pasa por puntos intermedios.

Indirecto con alternativas
→ existen rutas alternativas si un punto falla o se congestiona.
```

Una ruta lógica puede atravesar múltiples medios físicos.

---

# 7. Atenuación

La atenuación es la pérdida de fuerza y amplitud de la señal a medida que avanza por el canal.

```text
más distancia
→ normalmente mayor pérdida
```

Puede mitigarse mediante:

```text
selección adecuada de medio
reducción de distancia
repetidores/regeneradores
mejora de conectores y cableado
diseño correcto del enlace
```

No es lo mismo que latencia:

```text
Atenuación
→ pérdida de intensidad.

Latencia
→ demora temporal.
```

---

# 8. Ruido

El ruido son adiciones no deseadas a la señal.

Efecto:

```text
señal original + ruido
→ lectura incorrecta en el receptor
```

Ejemplos mencionados:

```text
diafonía
ruido impulsivo
ruido blanco
ruido térmico
```

No se debe afirmar que una señal real está totalmente libre de ruido.

---

# 9. Interferencia electromagnética

Se produce cuando una fuente externa acopla impulsos o campos electromagnéticos que modifican la señal original.

Ejemplos de fuentes posibles:

```text
motores
transformadores
líneas de potencia
equipos inductivos
otras transmisiones radioeléctricas
```

Diferencia:

```text
Ruido
→ categoría general de perturbaciones no deseadas.

Interferencia electromagnética
→ perturbación asociada al acoplamiento de fuentes externas.
```

---

# 10. Dispersión

La dispersión ocurre cuando la señal se ensancha en el tiempo.

En transmisión digital:

```text
un bit puede interferir temporalmente con el siguiente
```

Posibles medidas:

```text
medio/cable adecuado
menor longitud del enlace
diseño y velocidad compatibles
```

---

# 11. Latencia

La latencia es la demora entre origen y destino.

Causas principales del material:

```text
tiempo de propagación
+
retardo introducido por dispositivos y procesamiento
```

No se confunde con:

```text
ancho de banda
atenuación
cantidad de datos
```

Un enlace puede tener alta capacidad y, aun así, presentar latencia significativa.

---

# 12. Interfaces físicas

Una interfaz física permite conectar un equipo con el medio de transporte.

Ejemplos:

```text
módem
tarjeta de red
puerto serie
infrarrojo
interfaz inalámbrica
interfaz de fibra
```

Regla:

> El medio y la interfaz deben ser compatibles.

No alcanza con elegir fibra si los equipos no poseen transceptores o interfaces adecuados.

---

# 13. Mapa OSI de dispositivos

| Dispositivo o función | Capa principal | Qué examina o trata |
|---|---:|---|
| Hub/repetidor | 1 — Física | bits y señales |
| Switch de capa 2 | 2 — Enlace | tramas y direcciones MAC |
| Switch multicapa | 2/3 | tramas y, según función, paquetes IP |
| Router | 3 — Red | paquetes, redes y direcciones IP |
| Gateway | Variable; el material lo presenta en transporte/aplicación | traducción entre protocolos o aplicaciones |
| Firewall | 3/4 o 7, según inspección | IP, puertos, estado o contenido de aplicación |
| VPN | 2, 3 o 7, según implementación | encapsulación/túnel en la capa declarada |

Regla de defensa:

> No memorizar una única capa para firewall, VPN o gateway sin indicar qué función concreta realizan.

---

# 14. Módem

Módem significa modulador–demodulador.

Función conceptual:

```text
flujo digital
↔
señal adecuada para el sistema de transmisión
```

Puede existir en distintas tecnologías:

```text
telefónica
DSL
cable
inalámbrica
```

---

# 15. Repetidor

Un repetidor es un dispositivo de capa física que:

```text
recibe la señal
→ regenera/amplifica
→ retransmite
```

Permite superar limitaciones de distancia, pero agrega retardo y no interpreta direcciones IP o MAC como función principal.

---

# 16. Última milla

La última milla o bucle de abonado es el tramo que conecta al usuario final con el operador de telecomunicaciones.

Problemas principales:

```text
costo de instalación
mantenimiento
geografía
distancia
infraestructura existente
calidad del medio
demanda de capacidad
```

Alternativas mencionadas:

```text
ADSL
cablemódem
inalámbrico
WiMAX
satélite
Wi-Fi en determinados escenarios
```

No existe una única solución universal.

---

# 17. Caso rural

Escenario:

```text
cliente rural
sin tendido de cable
obstáculos geográficos
larga distancia
mantenimiento costoso
```

Análisis esperado:

```text
1. descartar opciones incompatibles por distancia/infraestructura;
2. comparar acceso inalámbrico terrestre y satelital;
3. considerar cobertura, obstáculos, latencia y costo;
4. declarar que la elección depende de datos concretos del sitio;
5. identificar interfaces y equipos necesarios.
```

No responder simplemente:

```text
"fibra es mejor"
```

sin analizar disponibilidad y costo.

---

# 18. Recuperación de supuestos

## Señal analógica

```text
Puede transmitirse como señal analógica.
```

Se digitaliza cuando la solución necesita procesar, almacenar o transmitir una representación digital.

## Conectividad

```text
Sin conexión
→ no hay transmisión efectiva en ese momento.
```

No implica automáticamente:

```text
transmisión asíncrona
```

La organización síncrona/asíncrona depende del protocolo asumido.

---

# 19. Ejercicio de selección

## Escenario A

Dos edificios enfrentados, distancia corta, visibilidad directa y necesidad de instalación rápida.

Responder:

```text
Medio candidato:
Alternativa:
Interferencias:
Latencia:
Costo:
Interfaz:
Supuesto:
```

## Escenario B

Cliente rural sin tendido y con obstáculos.

## Escenario C

Sala industrial con motores y alta interferencia electromagnética.

Comparar obligatoriamente UTP, FTP/STP y fibra. Justificar qué aporta el trenzado, qué aporta el blindaje y por qué la fibra es inmune a interferencia electromagnética en el medio.

---

# 20. Preguntas de control

1. ¿Qué transporta la capa física?
2. ¿Qué diferencia existe entre medio guiado y no guiado?
3. ¿Qué criterios se analizan al elegir un medio?
4. ¿Qué es atenuación?
5. ¿Qué es ruido?
6. ¿Qué es interferencia electromagnética?
7. ¿Qué es dispersión?
8. ¿Qué es latencia?
9. ¿Qué hace un módem?
10. ¿Qué hace un repetidor?
11. ¿Qué es la última milla?
12. ¿Por qué no hay un medio universalmente mejor?
13. ¿Por qué se trenzan los pares?
14. ¿Qué diferencias conceptuales existen entre UTP, FTP y STP?
15. ¿En qué capas trabajan hub, switch y router?
16. ¿Por qué firewall y VPN no tienen necesariamente una capa única?
