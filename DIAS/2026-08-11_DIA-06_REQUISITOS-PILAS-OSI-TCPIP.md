# Martes 11/8 — Día 6
## Requisitos + Pilas + OSI/TCP-IP

**Etapa:** segunda jornada intensiva de vacaciones  
**Duración indicada por el plan:** 5,5 horas núcleo  
**Materias:** Análisis y Diseño + Algoritmos/Estructuras + Comunicaciones  
**Modalidad:** teoría, recuperación activa, simulación, aplicación integrada, evaluación y oral

> Nota de planificación: los bloques detallados del plan suman 6 horas efectivas —90 + 90 + 30 + 90 + 60 minutos— aunque el encabezado indica 5,5 horas núcleo. Se conservan todos los bloques y los últimos 30 minutos pueden utilizarse como cierre ajustable según energía.

---

# 1. Resultado esperado

Al terminar la jornada deben existir:

- explicación académica de ingeniería de requerimientos;
- diferenciación entre elicitación, especificación y validación;
- RF y RNF redactados y clasificados;
- control de calidad de requerimientos;
- definición de pila, LIFO y operaciones;
- simulación manual de una pila;
- comparación entre pila con vector y pila enlazada;
- siete capas OSI en orden;
- cinco capas TCP/IP según el material;
- correspondencia OSI–TCP/IP;
- explicación de encapsulamiento, desencapsulamiento y PDU;
- evaluación escrita;
- defensa oral;
- plantilla de cierre.

---

# 2. Archivos de la jornada

1. `RESUMENES/2026-08-11_RESUMEN-GUIADO-DIA-06.md`
2. `PLANTILLAS/2026-08-11_PLANTILLA-REQUERIMIENTOS.md`
3. `FICHAS/2026-08-11_FICHA-PILA.md`
4. `FICHAS/2026-08-11_TABLA-OSI-TCPIP.md`
5. `CASOS/2026-08-11_CASO-INTEGRADOR-REQUISITOS-PILA-COMUNICACION.md`
6. `EVALUACIONES/2026-08-11_EVALUACION-DIA-06.md`
7. `EVALUACIONES/2026-08-11_RESPUESTAS-DIA-06.md`
8. `RESUMENES/2026-08-11_CIERRE-DIA-06.md`

---

# 3. Cronograma operativo

## Mañana

| Bloque | Duración | Actividad |
|---|---:|---|
| Recuperación inicial | 15 min | TDA, fases/flujos, constructor, PDU y síncrona/asíncrona |
| M1 — Requisitos | 75 min | Ingeniería, actividades, RF/RNF y calidad |
| Pausa | 15 min | Descanso real |
| M2 — Pilas | 90 min | TDA Pila, LIFO, operaciones e implementaciones |
| Cierre de mañana | 30 min | Simulación y explicación sin apuntes |

## Tarde

| Bloque | Duración | Actividad |
|---|---:|---|
| T1 — Comunicaciones | 90 min | OSI, TCP/IP, comparación, encapsulamiento y PDU |
| Pausa | 15 min | Descanso |
| T2 — Evaluación y oral | 60 min | Preguntas, corrección, defensa y resumen |

---

# 4. Recuperación inicial — sin apuntes

Responder en una o dos oraciones:

1. ¿Qué es un TDA y qué relación tiene con interfaz e implementación?
2. ¿Qué diferencia existe entre una fase y un flujo de trabajo del PUD?
3. ¿Qué condiciones sintácticas debe cumplir un constructor Java?
4. ¿Qué significa PDU?
5. ¿Qué contiene una PDU?
6. Completá:

```text
Asíncrona = ______ + start/stop
Síncrona  = ______ + cabecera/terminación
```

No leer las respuestas antes de intentar la recuperación.

---

# 5. Bloque M1 — Ingeniería de requerimientos

## 5.1 Definición central

La ingeniería de requerimientos comprende las actividades necesarias para descubrir, analizar, documentar y verificar los servicios y restricciones del sistema.

## 5.2 Actividades principales

### Elicitación

Objetivo:

- adquirir conocimiento del trabajo del cliente/usuario;
- comprender necesidades;
- identificar restricciones del entorno.

Técnicas del material:

- entrevistas;
- cuestionarios;
- observación;
- análisis de documentos;
- tormenta de ideas;
- JAD.

### Especificación

Objetivo:

- describir los requerimientos;
- producir una especificación que sirva como acuerdo entre usuarios y desarrolladores;
- expresar qué debe hacer el sistema y qué propiedades debe cumplir, sin detallar todavía toda la implementación.

### Validación

Objetivo:

- comprobar que se está atacando el problema correcto;
- verificar que los requerimientos representan las expectativas del usuario;
- detectar errores, contradicciones y omisiones.

Técnicas:

- revisiones;
- prototipos;
- casos de prueba;
- análisis de consistencia.

## 5.3 RF y RNF

### Requerimiento funcional

Describe una función o servicio que el sistema debe proporcionar y cómo debe responder ante determinadas entradas o estímulos.

### Requerimiento no funcional

Expresa propiedades, restricciones o condiciones que limitan o condicionan la solución, por ejemplo:

- rendimiento;
- seguridad;
- fiabilidad;
- mantenimiento;
- portabilidad;
- plataforma;
- estándares.

## 5.4 Características de calidad

Todo requerimiento debe revisarse para comprobar si es:

- correcto;
- consistente;
- completo;
- realista;
- necesario;
- verificable;
- rastreable.

## 5.5 Aplicación

Completar:

`PLANTILLAS/2026-08-11_PLANTILLA-REQUERIMIENTOS.md`

Caso sugerido:

> El operario necesita consultar una OT desde el móvil y poder deshacer la última modificación todavía no confirmada.

Redactar como mínimo:

- 4 RF;
- 4 RNF;
- 3 reglas de negocio;
- fuente de cada requerimiento;
- criterio de verificación.

## 5.6 Control de salida

No pasar al siguiente bloque hasta poder explicar:

- ingeniería de requerimientos;
- elicitación vs. especificación vs. validación;
- RF vs. RNF;
- verificable vs. rastreable;
- por qué un requerimiento técnicamente posible puede no ser necesario.

---

# 6. Bloque M2 — Pilas

## 6.1 Concepto

Una pila es un TDA lineal restrictivo en el que las inserciones y extracciones se realizan por un único extremo llamado cima o tope.

```text
LIFO = Last In, First Out
     = último en entrar, primero en salir
```

## 6.2 Operaciones

```text
push(elemento) → agrega en la cima
pop()          → extrae y elimina la cima
peek()/primero() → consulta la cima sin eliminarla
esVacia()      → informa si no hay elementos
longitud()     → cantidad de elementos
```

## 6.3 Implementación con vector

Elementos principales:

- arreglo de capacidad definida;
- índice `top` o tope;
- control de desbordamiento;
- acceso directo a la cima.

## 6.4 Implementación con lista enlazada

Elementos principales:

- referencia `top` al nodo de la cima;
- cada nodo contiene dato + referencia al siguiente;
- `push`: nuevo nodo apunta a la cima anterior;
- `pop`: la cima pasa al nodo siguiente;
- crecimiento mientras exista memoria disponible.

## 6.5 Comparación

| Criterio | Vector | Lista enlazada |
|---|---|---|
| Capacidad | definida al crear | variable durante ejecución |
| Memoria | espacio reservado | memoria por nodo |
| Cima | índice | referencia a nodo |
| `push`/`pop` | sobre posición `top` | sobre primer nodo |
| Riesgo específico | desbordamiento por capacidad | agotamiento de memoria / referencias incorrectas |

## 6.6 Simulación obligatoria

Partir de una pila vacía y realizar:

```text
push(A)
push(B)
push(C)
peek()
pop()
push(D)
pop()
pop()
```

Después de cada operación, dibujar la pila y señalar la cima.

## 6.7 Aplicación al caso

Usar una pila para representar acciones no confirmadas:

```text
Cambiar prioridad
Cambiar fecha
Agregar observación
```

Al ejecutar `deshacer()`, se retira la última acción registrada.

## 6.8 Control de salida

Responder sin mirar:

- ¿por qué una pila es LIFO?;
- ¿qué diferencia hay entre `pop` y `peek`?;
- ¿por qué la pila es un TDA?;
- ¿qué no cambia para el usuario si se reemplaza vector por lista?;
- ¿qué cambia internamente?

---

# 7. Cierre de mañana — 30 minutos

## Simulación — 10 minutos

Rehacer la secuencia sin apuntes.

## Explicación oral — 10 minutos

Explicar:

1. TDA Pila;
2. LIFO;
3. operaciones;
4. vector;
5. lista enlazada;
6. elección según el problema.

## Corrección — 10 minutos

Revisar:

- orden de extracción;
- actualización de la cima;
- diferencia entre consulta y eliminación;
- interfaz frente a implementación.

---

# 8. Bloque T1 — OSI y TCP/IP

## 8.1 OSI

Es un modelo de referencia de siete capas que divide la comunicación en funciones más pequeñas y permite describir la interconexión de sistemas diferentes.

Orden ascendente:

```text
1 Física
2 Enlace de datos
3 Red
4 Transporte
5 Sesión
6 Presentación
7 Aplicación
```

## 8.2 TCP/IP según el material

```text
1 Física
2 Acceso a la red
3 Internet
4 Transporte
5 Aplicación
```

TCP/IP debe definirse como una **arquitectura o pila de protocolos**, no como un único protocolo.

## 8.3 Correspondencia

Completar sin mirar la tabla incluida en:

`FICHAS/2026-08-11_TABLA-OSI-TCPIP.md`

## 8.4 Encapsulamiento

En el emisor, cada capa puede agregar información de control a los datos recibidos de la capa superior.

```text
Aplicación → datos
Transporte → segmento/unidad de transporte
Red        → paquete
Enlace     → trama
Física     → bits/señales
```

En el receptor se realiza el proceso inverso: desencapsulamiento.

## 8.5 PDU

```text
PDU = Protocol Data Unit
PDU = Unidad de Datos de Protocolo
PDU = SDU + PCI
PDU = datos + información de control
```

## 8.6 Recorrido práctico

Explicar una solicitud móvil:

```text
Aplicación genera solicitud
↓
Transporte identifica procesos y comunicación extremo a extremo
↓
Internet agrega direccionamiento y encaminamiento IP
↓
Acceso a red forma la trama y utiliza MAC
↓
Física transmite bits/señales
```

El servidor desencapsula en orden inverso.

## 8.7 Control de salida

No finalizar el bloque hasta poder:

- nombrar las capas OSI 1→7;
- nombrar TCP/IP como arquitectura/pila;
- establecer la correspondencia;
- explicar PDU sin confundirla con PUD;
- explicar emisor y receptor;
- diferenciar MAC, IP y puerto.

---

# 9. Caso integrador

Resolver:

`CASOS/2026-08-11_CASO-INTEGRADOR-REQUISITOS-PILA-COMUNICACION.md`

La respuesta debe conectar:

```text
Necesidad del usuario
→ RF/RNF
→ pila de acciones
→ solicitud cliente-servidor
→ OSI/TCP-IP
→ encapsulamiento/PDU
```

---

# 10. Evaluación

Resolver sin apuntes:

`EVALUACIONES/2026-08-11_EVALUACION-DIA-06.md`

Condiciones:

- máximo 50 minutos para la parte escrita;
- no corregir mientras se responde;
- defensa oral posterior de 8–10 minutos;
- registrar dudas y errores sin borrar la respuesta original.

---

# 11. Criterio de aprobación

## Escrito — 8 puntos

- mínimo equivalente a 7/10;
- ningún bloque principal completamente omitido;
- requerimientos correctamente clasificados;
- simulación LIFO correcta;
- PDU correctamente definida.

## Oral — 2 puntos

- definición;
- aplicación;
- justificación;
- diferencias conceptuales;
- conexión entre las tres materias.

---

# 12. Fuentes de la jornada

- `Analisis_y_Diseno_de_Software.md`:
  - ingeniería de requerimientos;
  - elicitación, especificación y validación;
  - RF, RNF y propiedades de calidad.
- `Taller_de_Algoritmos_y_Estructuras_de_Datos_I.md`:
  - TDA Pila;
  - LIFO;
  - operaciones;
  - implementación con vector y lista enlazada.
- `COMUNICACIONES.md`:
  - OSI;
  - TCP/IP;
  - comparación;
  - encapsulamiento y PDU.
- `02-PLAN-MAESTRO-HASTA-03-09.md`.
- cierre acumulado hasta el Día 5.

Los ejemplos de Órdenes de Trabajo se utilizan para aplicar los conceptos, sin reemplazar la terminología de las fuentes universitarias.

---

# 13. Comando de inicio

> **Iniciar EFIP — 2026-08-11 — Día 6**
