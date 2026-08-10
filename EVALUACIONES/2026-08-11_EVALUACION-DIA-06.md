# Evaluación EFIP I — Día 6
## Requisitos + Pilas + OSI/TCP-IP

**Fecha:** 11/08/2026  
**Modalidad:** sin apuntes  
**Tiempo máximo escrito:** 50 minutos  
**Puntaje escrito:** 8 puntos  
**Defensa oral:** 2 puntos  
**Total:** 10 puntos

---

# Instrucciones

- Responder con terminología académica.
- Aplicar los conceptos al caso cuando se solicite.
- No borrar errores después de entregar.
- Si una respuesta requiere una suposición, declararla.
- Diferenciar definición, ejemplo y justificación.

---

# Parte A — Ingeniería de requerimientos — 2,5 puntos

## 1. Ingeniería y actividades — 0,8 puntos

Definí ingeniería de requerimientos y diferenciá:

- elicitación;
- especificación;
- validación.

Para cada actividad, indicá un resultado esperado o una técnica aplicable.

## 2. RF, RNF y regla de negocio — 0,8 puntos

Definí y diferenciá:

- requerimiento funcional;
- requerimiento no funcional;
- regla de negocio.

Redactá un ejemplo de cada uno para una aplicación de Órdenes de Trabajo.

## 3. Calidad de requerimientos — 0,9 puntos

Explicá brevemente qué significa que un requerimiento sea:

- correcto;
- consistente;
- completo;
- realista;
- necesario;
- verificable;
- rastreable.

Después corregí este enunciado para volverlo verificable:

> El sistema debe ser rápido y fácil de usar.

---

# Parte B — Pilas — 2,5 puntos

## 4. Concepto y operaciones — 0,8 puntos

Definí una pila como TDA y explicá:

- LIFO;
- cima;
- `push`;
- `pop`;
- `peek/primero`;
- `esVacia`.

## 5. Simulación — 0,9 puntos

Partiendo de una pila vacía, realizá:

```text
push(A)
push(B)
push(C)
pop()
push(D)
peek()
pop()
pop()
```

Indicá:

- elemento devuelto en cada consulta/extracción;
- estado de la pila después de cada operación;
- cima final.

## 6. Implementaciones — 0,8 puntos

Compará pila con vector y pila con lista enlazada según:

- representación de la cima;
- capacidad;
- memoria;
- `push`/`pop`;
- riesgos;
- criterio de elección.

Explicá qué cambia y qué permanece igual desde la perspectiva del TDA.

---

# Parte C — OSI/TCP-IP — 2,5 puntos

## 7. Modelos y correspondencia — 0,9 puntos

- Definí OSI.
- Definí TCP/IP como arquitectura/pila.
- Nombrá las siete capas OSI en orden ascendente.
- Nombrá las cinco capas TCP/IP adoptadas por el material.
- Establecé la correspondencia entre ambos.

## 8. Encapsulamiento y PDU — 0,9 puntos

Definí:

- encapsulamiento;
- desencapsulamiento;
- PDU;
- SDU;
- PCI.

Completá:

```text
PDU = ______ + ______
```

Ordená:

```text
datos — segmento — paquete — trama — bits
```

para el emisor y explicá qué ocurre en el receptor.

## 9. Direccionamiento y recorrido — 0,7 puntos

Explicá qué identifica:

- MAC;
- IP;
- puerto.

Después describí brevemente cómo una solicitud móvil `Consultar OT` llega al servidor mediante TCP/IP.

---

# Parte D — Integración y recuperación — 0,5 puntos

## 10. Integración — 0,3 puntos

Para la necesidad:

> El operario debe poder deshacer la última modificación no confirmada.

Explicá:

- un RF;
- una regla de negocio;
- por qué conviene una pila;
- qué ocurre cuando la confirmación se envía al servidor.

## 11. Recuperación espaciada — 0,2 puntos

Completá:

```text
TDA =
Constructor Java =
Fases PUD =
Flujos PUD =
Asíncrona =
Síncrona =
PUD =
PDU =
```

---

# Defensa oral — 2 puntos

Responder durante 8–10 minutos:

> Un usuario solicita una funcionalidad para deshacer la última modificación no confirmada de una OT. Explique cómo relevaría, especificaría y validaría el requerimiento; por qué una pila es adecuada y cómo la confirmación viajaría desde el móvil hasta el servidor mediante OSI/TCP-IP.

## Rúbrica oral

| Criterio | Máximo |
|---|---:|
| Precisión conceptual | 0,5 |
| Terminología académica | 0,4 |
| Aplicación y justificación | 0,5 |
| Relación entre las tres materias | 0,4 |
| Claridad y orden | 0,2 |
| **Total** | **2,0** |

---

# Criterio de aprobación

- Resultado global equivalente a 7/10 o más.
- Ningún bloque central completamente omitido.
- La simulación debe respetar LIFO.
- TCP/IP debe tratarse como arquitectura/pila.
- PDU debe incluir datos e información de control.
- La defensa debe relacionar las tres materias.
