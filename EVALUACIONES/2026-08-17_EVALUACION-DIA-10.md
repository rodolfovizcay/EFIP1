# Evaluación EFIP I — Día 10
## Arquitectura + Lista simple + Nivel físico

**Fecha:** 17/08/2026  
**Modalidad:** sin apuntes  
**Tiempo máximo escrito:** 45 minutos  
**Escrito:** 8 puntos  
**Defensa oral:** 2 puntos  
**Total:** 10 puntos

La evaluación es deliberadamente breve. Se responde completa en un único mensaje.

---

# Parte A — Arquitectura — 2,5 puntos

## 1. Concepto y decisiones — 0,8

Definí arquitectura de software y nombrá cuatro decisiones significativas que contiene.

Después explicá dos factores que la condicionan:

```text
casos de uso
RNF
plataforma
base de datos
comunicaciones
sistemas heredados
```

## 2. Subsistemas e interfaces — 0,9

Para SIGO Rural proponé tres subsistemas.

Para uno de ellos indicá:

```text
responsabilidad
interfaz proporcionada
dependencia
alta cohesión
bajo acoplamiento
```

Explicá por qué `PuntoRelevamiento` es una entidad y `Subsistema Relevamiento` no.

## 3. Vistas y documentación — 0,8

Explicá para qué sirven las vistas arquitectónicas.

Indicá qué documentarías en:

```text
vista de casos de uso
vista lógica/diseño
vista de despliegue
```

Después diferenciá:

```text
arquitectura
tecnología
```

---

# Parte B — Lista simplemente enlazada — 2,5 puntos

## 4. Concepto y simulación — 1,1

Definí:

```text
lista simple
nodo
cabeza
lista vacía
```

Partiendo de:

```text
cabeza → [A] → [B] → [C] → null
```

Ejecutá:

```text
insertarInicio(X)
modificar(B, B2)
eliminar(A)
insertarFinal(D)
```

Dibujá la lista después de cada paso.

## 5. Algoritmos y errores — 0,9

Escribí pseudocódigo o Java breve para:

```text
insertarInicio
buscar
eliminar
```

Debe contemplar:

```text
lista vacía
eliminación de cabeza
nodo anterior
comparación de String
```

## 6. Comparación — 0,5

Compará lista simple y arreglo según:

```text
capacidad
acceso
inserción/eliminación
memoria
criterio de elección
```

Explicá qué permanece como contrato del TDA y qué cambia en la implementación.

---

# Parte C — Nivel físico — 2,5 puntos

## 7. Medios y perturbaciones — 1,4

Definí y diferenciá:

```text
medio guiado / no guiado
UTP / FTP / STP
trenzado / blindaje
atenuación
ruido
diafonía
interferencia electromagnética
dispersión
latencia
```

Explicá por qué los pares están trenzados y no confundas `STP` como cable con Spanning Tree Protocol.

Caso:

> Se necesita conectar un cliente rural sin tendido de cable, con obstáculos y mantenimiento difícil.

Proponé dos medios candidatos y comparalos mediante:

```text
distancia
obstáculos
latencia
costo
mantenimiento
interfaz/dispositivo
supuesto
```

## 8. Dispositivos y última milla — 1,1

Explicá:

```text
interfaz física
módem
repetidor
última milla
```

Completá y justificá:

| Dispositivo/función | Capa principal |
|---|---|
| Hub/repetidor | |
| Switch | |
| Router | |
| Gateway | |
| Firewall | |
| VPN | |

Para firewall, VPN y gateway se acepta una capa variable únicamente si se declara la función o implementación considerada.

Después respondé:

```text
¿Una señal analógica puede transmitirse analógicamente?
¿La falta de conexión implica transmisión asíncrona?
¿Por qué no existe un medio universalmente mejor?
```

---

# Parte D — Integración y recuperación — 0,5 puntos

## 9. Integración — 0,3

Explicá en 6–8 líneas:

```text
necesidad rural
→ arquitectura
→ subsistemas/interfaces
→ lista de puntos
→ medio físico
→ decisión documentada
→ prueba
```

## 10. Recuperación — 0,2

Completá:

```text
Asociación =
Agregación =
Composición =
Dependencia =

Validación String =
Inserción al inicio =

Física transmite =
Conectividad ≠
```

---

# Defensa oral — 2 puntos

Desarrollo de 5–7 minutos:

> Explique cómo la arquitectura organiza SIGO Rural mediante subsistemas, interfaces y dependencias. Justifique una lista simplemente enlazada para los puntos de relevamiento y describa inserción, búsqueda y eliminación. Finalmente, compare medios físicos para la última milla y explique atenuación, ruido, interferencia, dispersión y latencia.

La defensa debe incluir una comparación breve UTP/FTP/STP y la ubicación razonada de switch, router y un firewall o VPN.

## Rúbrica

| Criterio | Máximo |
|---|---:|
| Precisión conceptual | 0,50 |
| Terminología | 0,40 |
| Aplicación al caso | 0,50 |
| Integración | 0,40 |
| Claridad/autocorrección | 0,20 |
| **Total** | **2,00** |

---

# Aprobación

```text
7/10 o más
+
ningún bloque central omitido
+
lista simulada correctamente
+
selección de medio justificada
+
defensa realizada o evidencia oral equivalente documentada
```
