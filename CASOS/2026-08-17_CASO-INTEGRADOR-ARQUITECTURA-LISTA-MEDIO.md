# Caso integrador — Día 10
## SIGO Rural — Arquitectura, relevamiento dinámico y última milla

**Fecha:** 17/08/2026  
**Materias:** Análisis y Diseño + Estructuras de Datos + Comunicaciones

---

# 1. Situación

La Cooperativa desea ampliar SIGO para atender una zona rural donde la conectividad es irregular y no existe una única tecnología de acceso disponible.

Antes de instalar el servicio, un técnico realiza un relevamiento desde una aplicación móvil. Durante la visita registra una cantidad variable de puntos:

```text
código del punto
ubicación descriptiva
distancia estimada
obstáculos
nivel de interferencia observado
medio candidato
observación
```

Durante el relevamiento, los puntos pueden agregarse, buscarse, modificarse o eliminarse. No existe una política obligatoria LIFO o FIFO para esta colección.

Luego, el sistema debe permitir que un responsable técnico analice los puntos y documente una recomendación de medio de última milla.

La solución debe integrarse con SIGO sin mezclar todas las responsabilidades en una sola aplicación.

---

# 2. Datos del ejercicio

## Zona

```text
Localidad: paraje rural a 18 km del casco urbano
Tendido existente: parcial
Obstáculos: árboles y desniveles
Interferencia: media en algunos sectores
Demanda inicial: 25 usuarios
Mantenimiento: acceso vehicular limitado en días de lluvia
```

## Puntos iniciales

```text
P-01 | Escuela rural       | 2 km  | pocos obstáculos | baja interferencia
P-02 | Establecimiento A   | 5 km  | árboles          | media interferencia
P-03 | Establecimiento B   | 9 km  | desnivel         | baja interferencia
```

## Operaciones solicitadas

```text
1. insertar P-00 al inicio;
2. buscar P-02;
3. modificar la interferencia de P-02;
4. eliminar P-01;
5. insertar P-04 al final;
6. mostrar la lista final.
```

---

# 3. Parte A — Arquitectura

## A1. Decisiones significativas

Identificar al menos cinco decisiones sobre:

```text
organización del sistema
elementos estructurales
interfaces
colaboraciones
subsistemas
estilo o separación de responsabilidades
plataforma/conectividad
RNF
```

Formato:

```text
Decisión:
Problema:
Alternativas:
Opción elegida:
Justificación:
Consecuencias:
```

## A2. Subsistemas

Proponer al menos cuatro:

```text
Relevamiento
Análisis técnico
Sincronización
Persistencia
```

Puede agregarse:

```text
Notificaciones
Mapas/Ubicación
Administración
```

Para cada subsistema indicar:

- responsabilidad;
- alta cohesión;
- interfaz proporcionada;
- dependencia necesaria;
- dato o concepto que no debería conocer.

## A3. Interfaces

Proponer operaciones para:

```text
IRelevamiento
IAnalisisMedio
ISincronizacion
```

Ejemplo de formato:

```text
IRelevamiento
+ agregarPunto(datos): Resultado
+ buscarPunto(codigo): PuntoRelevamiento
+ modificarPunto(codigo, cambios): Resultado
+ eliminarPunto(codigo): Resultado
+ listarPuntos(): Lista<PuntoRelevamiento>
```

## A4. Dependencias

Dibujar textualmente:

```text
AppRelevamiento
→ IRelevamiento

Subsistema Relevamiento
→ ISincronizacion

Subsistema AnalisisTecnico
→ IRelevamiento

Subsistema Persistencia
→ repositorios
```

Explicar por qué se busca bajo acoplamiento.

## A5. Vistas

Elegir qué mostraría cada vista:

```text
Casos de uso
Lógica/diseño
Procesos
Implementación
Despliegue
```

Declarar qué elemento del caso es arquitectónicamente significativo.

---

# 4. Parte B — Lista simplemente enlazada

## B1. Justificación

Explicar por qué una lista simple es razonable para el relevamiento didáctico:

```text
cantidad variable
operaciones flexibles
sin política estricta LIFO/FIFO
recorrido secuencial aceptable
```

## B2. Nodo

Proponer:

```text
NodoPunto
- PuntoRelevamiento dato
- NodoPunto siguiente
```

## B3. Evolución

Dibujar cada paso:

```text
Inicio:
P-01 → P-02 → P-03

Insertar P-00 al inicio:

Modificar P-02:

Eliminar P-01:

Insertar P-04 al final:

Lista final:
```

## B4. Algoritmos

Escribir pseudocódigo o Java breve para:

```text
insertarInicio
insertarFinal
buscar
modificar
eliminar
```

## B5. Riesgos

Explicar:

```text
qué pasa si se pierde cabeza;
por qué eliminar cabeza es especial;
por qué se necesita anterior;
qué ocurre si no se avanza actual;
por qué se usa equals para String.
```

## B6. Comparación con arreglo

Comparar:

```text
capacidad
memoria
acceso
inserción
eliminación
riesgo
criterio de elección
```

---

# 5. Parte C — Nivel físico

## C1. Medios candidatos

Analizar al menos tres:

```text
fibra óptica
radioenlace/WiMAX
satélite
```

Puede considerarse cable de cobre si se justifica con infraestructura existente.

Antes de seleccionar el acceso rural, ubicar:

```text
hub/repetidor
switch
router
gateway
```

en el modelo OSI. Si se propone firewall o VPN, indicar qué inspecciona o cómo se implementa antes de asignarle una capa.

## C2. Criterios

Para cada candidato completar:

```text
Tipo guiado/no guiado:
Distancia:
Obstáculos:
Interferencia:
Latencia:
Costo:
Mantenimiento:
Interfaz/dispositivo:
Ventaja:
Riesgo:
Supuesto:
```

## C3. Perturbaciones

Aplicar al caso:

```text
Atenuación:
Ruido:
Interferencia electromagnética:
Dispersión:
Latencia:
```

No responder solo con definiciones; relacionar cada factor con distancia, entorno o equipos.

## C4. Dispositivos

Determinar cuándo podrían intervenir:

```text
interfaz física
módem
repetidor
antena/transceptor
```

## C5. Última milla

Explicar:

```text
qué tramo representa;
por qué suele ser costoso;
qué efecto tiene la geografía;
por qué pueden coexistir varias tecnologías.
```

## C6. Recomendación

Redactar una recomendación técnica condicionada:

```text
Recomiendo ______ si ______.

Descarto ______ en este escenario porque ______.

Antes de decidir deben medirse ______.
```

No presentar la recomendación como universal.

## C7. Enlace interno del puesto técnico

Además del acceso rural, el puesto de coordinación posee:

```text
distancia interna: 45 metros
entorno: tablero eléctrico, motores y canalizaciones compartidas
necesidad: conectar el puesto al switch del edificio
```

Comparar:

```text
UTP
FTP/STP
fibra óptica
```

Explicar:

- por qué se trenzan los pares;
- qué diferencia existe entre trenzado y blindaje;
- cómo aparece la diafonía;
- cuál elegiría y bajo qué supuesto;
- por qué `STP` en este punto significa cable blindado y no Spanning Tree Protocol.

---

# 6. Parte D — Integración

Explicar la cadena:

```text
Necesidad de expansión rural
→ caso de uso Relevar punto de acceso
→ decisiones de arquitectura
→ subsistemas e interfaces
→ lista dinámica de puntos
→ selección de medio físico
→ documentación de la decisión
→ caso de prueba
```

---

# 7. Casos de prueba

Proponer al menos seis:

| ID | Precondición | Acción | Resultado esperado |
|---|---|---|---|
| CP-01 | Lista vacía | Insertar primer punto | Cabeza apunta al nuevo nodo |
| CP-02 | Lista con tres puntos | Buscar P-02 | Devuelve el punto correcto |
| CP-03 | P-02 existente | Modificar interferencia | Dato actualizado |
| CP-04 | P-01 en cabeza | Eliminar P-01 | Cabeza avanza al siguiente |
| CP-05 | Código inexistente | Eliminar | Resultado controlado, lista intacta |
| CP-06 | Medio rural candidato | Evaluar restricciones | Recomendación con supuestos |
| CP-07 | Sala con interferencia alta | Comparar UTP/FTP-STP/fibra | Medio justificado por trenzado, blindaje e inmunidad |
| CP-08 | Firewall o VPN propuesto | Asignar capa | Capa justificada por función/implementación |

Agregar casos para:

```text
String vacío
lista vacía
pérdida de conexión
interferencia alta
latencia no aceptable
```

---

# 8. Defensa oral

Explicar durante 5–7 minutos:

> La arquitectura organiza decisiones, subsistemas, interfaces y dependencias. El relevamiento usa una lista simple porque la colección es dinámica y requiere operaciones flexibles. La elección del medio físico depende de distancia, obstáculos, interferencia, costo, mantenimiento y latencia. La recomendación debe documentar alternativas, supuestos, consecuencias y riesgos.

---

# 9. Criterio de éxito

```text
Arquitectura
→ decisiones justificadas y subsistemas coherentes.

Lista
→ evolución correcta y enlaces preservados.

Nivel físico
→ conceptos diferenciados y medio elegido con supuestos.

Integración
→ una única explicación sin mezclar entidad, subsistema y dispositivo físico.
```
