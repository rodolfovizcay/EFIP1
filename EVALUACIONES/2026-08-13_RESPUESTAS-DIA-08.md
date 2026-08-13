# Respuestas del estudiante — Evaluación Día 8
## Modelo de análisis + Colas + Transmisión

**Fecha:** 13/08/2026  
**Modalidad:** sin apuntes  
**Fuente:** entrega Markdown original + defensa oral posterior

> Se normalizó el formato sin reemplazar respuestas incorrectas. Las correcciones están separadas en `EVALUACIONES/2026-08-13_RESULTADOS-DIA-08.md`.

---

# Parte A — Modelo de análisis

## 1. Propósito y artefactos

```text
Modelo de casos de uso:
representa los servicios y funciones que ofrece el sistema.

Modelo de análisis:
representa internamente cómo colaboran los objetos para obtener el resultado de valor.

Modelo de análisis:
refinar los requerimientos para comprender internamente los comportamientos.

Clase de análisis:
representa clases del sistema de manera conceptual.

Realización de caso de uso–análisis:
representa cómo interactúan los objetos para obtener el resultado de valor.

Paquete de análisis:
agrupa elementos en paquetes manejables.

Vista de arquitectura:
diseño conceptual de la estructura del sistema.
```

## 2. Interfaz, control y entidad

```text
Clase de interfaz:
representa vistas, formularios, ingreso de datos y mensajes.

Clase de entidad:
representa persistencia, instancias y estados.

Clase de control:
representa validación y comunicación entre interfaz y entidades; orquesta la información.
```

Clasificación entregada:

```text
FormularioCrearOT         → interfaz
ControlCrearOT            → control
OrdenTrabajo              → entidad
Sector                    → entidad
APIRecepcionEjecucion     → interfaz
```

Responsabilidades entregadas:

```text
Interfaz:
carga de datos, mostrar formularios y mensajes.

Control:
validar, consultar entidades, controlar datos y devolver mensajes.

Entidad:
persistir información y conocer sus estados.
```

## 3. Realización y colaboración

Flujo escrito:

```text
Actor envía datos a AppRegistrarEjecucion.
AppRegistrarEjecucion envía datos a ControlRegistrarEjecucion.
El control valida y solicita información a OrdenTrabajo.
OrdenTrabajo devuelve el estado.
El control comprueba el estado y solicita una ejecución.
EjecucionOT devuelve el resultado.
El control devuelve el estado a la interfaz.
La interfaz muestra el resultado al actor.
```

Respuestas adicionales:

```text
Actor e interfaz:
la interfaz es el canal de entrada.

Mensajes vs. métodos:
los mensajes representan comportamientos de forma conceptual.

Colaboración vs. secuencia:
la secuencia toma en cuenta el tiempo y corresponde a una etapa más próxima al diseño.
```

No se escribió el alternativo solicitado por falta de conexión. El primer mensaje habló de “crear una OT”, aunque el caso era registrar una ejecución.

---

# Parte B — Colas

## 4. Concepto y operaciones

```text
Cola = TDA lineal restrictivo FIFO.
FIFO = First In, First Out.
Frente = próximo elemento a desencolar.
Final = último elemento encolado.
encolar() = agrega al final.
desencolar() = muestra y elimina el frente.
cabecera() = muestra el frente.
esVacia() = verifica si está vacía.
longitud() = cantidad de elementos.
```

## 5. Simulación

| Paso | Operación | Devuelve | Cola | Frente | Final |
|---:|---|---|---|---|---|
| 0 | Inicio | — | `[]` | — | — |
| 1 | `encolar(A)` | — | `[A]` | A | A |
| 2 | `encolar(B)` | — | `[A,B]` | A | B |
| 3 | `encolar(C)` | — | `[A,B,C]` | A | C |
| 4 | `cabecera()` | A | `[A,B,C]` | A | C |
| 5 | `desencolar()` | A | `[B,C]` | B | C |
| 6 | `encolar(D)` | — | `[B,C,D]` | B | D |
| 7 | `desencolar()` | B | `[C,D]` | C | D |
| 8 | `encolar(E)` | — | `[C,D,E]` | C | E |

```text
Cola final = [C,D,E]
Frente final = C
Final final = E
```

## 6. Implementaciones

```text
Vector:
frente/final mediante índices; capacidad fija; reserva espacios; riesgo de desbordamiento y de no reutilizar espacios iniciales.

Lista enlazada:
frente como cabecera y final como último nodo; capacidad según memoria; cada nodo guarda enlace; riesgo de memoria y pérdida de referencias.
```

Otras respuestas:

```text
Qué cambia y permanece:
“se debe controlar estrictamente el tamaño”.

Cola para llegada:
porque es FIFO.

Pila:
se indicó LIFO, pero la frase final describió “primero en llegar, primero en salir”.

Urgencias:
cola de prioridades.
```

---

# Parte C — Información, señales y transmisión

## 7. Información

```text
Probabilidad = posibilidad de que un evento suceda.
Incertidumbre = conocimiento sobre el evento.
Información = mensaje con alta incertidumbre y baja probabilidad.
I(E) = incertidumbre del evento.
Unidad = sin completar.
```

Cálculos entregados:

```text
P(E)=1/8 → I(E)=3
m=400 símbolos/s; H=2,5 bits/símbolo → R=1000
```

No se mostraron las unidades ni se diferenciaron `bits`, `bits/símbolo` y `bits/segundo`.

## 8. Señales y muestreo

```text
Señal analógica = onda fluida y continua.
Señal digital = onda discreta con saltos altos.
Amplitud = potencia.
Período = tiempo.
Frecuencia = ciclo en que se envían bits.
Muestreo = cantidad de información obtenida por tiempo.
f = frecuencia.
T = tiempo.
fs mínima = frecuencia mínima.
```

Cálculos:

```text
T=0,002 s → f=500 Hz
fmax=8 kHz → fs mínima=16 k muestras/s
```

Al aumentar el muestreo:

> aumenta el tamaño de los datos.

## 9. Formas de transmisión

```text
Serie = un solo canal.
Paralela = múltiples canales.
Asíncrona = start + carácter + stop.
Síncrona = cabecera + bloque + terminación.
```

Clasificación:

```text
bit después de bit → serie
8 bits simultáneos → paralela
start/stop → asíncrona
bloque delimitado → síncrona
```

Serie y asíncrona pueden combinarse porque no son mutuamente excluyentes.

---

# Parte D — Integración y recuperación

## 10. Integración

```text
RF = procesar OT por orden de llegada.
Caso de uso = Procesar OT.
Interfaz = AppCargaEjecucionOT.
Control = ControlProcesarOT.
Entidades = ORDEN_TRABAJO y EJECUTAR OT.
Estructura = Cola.
FIFO = primero en entrar, primero en salir.
Señal original = analógica.
Muestreo = fs mínima=2·fmax.
Transmisión declarada = asíncrona.
Prueba = cargar 10 OT y verificar el orden.
```

Justificaciones:

```text
La Cola no pertenece automáticamente al análisis porque el análisis se abstrae de tecnología.
Puede aparecer en implementación porque se pide procesar por llegada.
La señal analógica debe transformarse porque “la distorsión corrompería los datos”.
```

## 11. Recuperación

```text
Generalización UML = Hijo -|> Padre.
Instancia = un dato específico.
Rectángulo doble = entidad débil.
Línea doble = sin completar.
Entidad asociativa = representa N:M.
Entidad débil = su identificación depende de otra entidad.
Completo = información necesaria para comprender sin ambigüedad.
Verificable = puede probarse y medirse.
toString() = pertenece a Object y devuelve un textual.
N:M conceptual = muchos a muchos.
Tabla asociativa = representa N:M en el modelo relacional.
```

---

# Defensa oral — puntos principales preservados

- Explicó el pasaje de caso de uso a modelo de análisis.
- Clasificó `AppRegistrarEjecucion`, `ControlRegistrarEjecucion`, `OrdenTrabajo` y `EjecucionOT`.
- Describió la colaboración completa.
- Incorporó solicitudes pendientes cuando no hay conexión.
- Explicó Cola FIFO y comparó vector/lista.
- Indicó que permanece la interfaz del TDA y cambia la implementación.
- Dijo que FIFO garantiza trazabilidad.
- Al explicar información dijo primero “mayor probabilidad, mayor incertidumbre e información” y después la relación inversa correcta.
- Diferenció analógica/digital y mencionó muestreo.
- Indicó que la transmisión puede ser serie/paralela y síncrona/asíncrona.

---

# Errores originales conservados

1. Alternativo sin conexión omitido en el escrito.
2. Caso desviado de registrar ejecución a crear OT.
3. Contrato del TDA no respondido en el escrito.
4. Pila formulada parcialmente como FIFO.
5. Fórmula/unidad de información omitidas.
6. Unidades de tasa omitidas.
7. Amplitud, frecuencia y muestreo imprecisos.
8. `f=1/T` y `T=1/f` omitidas.
9. Línea doble sin completar.
10. Digitalización justificada como corrupción universal de analógica.
11. Contradicción oral en probabilidad/información.
12. FIFO confundido con trazabilidad.
