# Tarjetas de recuperación — Caso integrador 1
## 15/08/2026

**Uso:** responder el frente antes de leer el reverso.  
**Objetivo:** recuperar errores activos y conceptos que deben aparecer en el caso semanal.

---

# A. Control de entrada — 12 preguntas

Responder sin apuntes:

1. ¿Qué representa una línea doble en DER?
2. ¿Qué diferencia existe entre modelo de análisis y diseño?
3. ¿Qué conserva y qué cambia un TDA entre implementaciones?
4. ¿Qué diferencia existe entre FIFO y trazabilidad?
5. ¿Cuál es la fórmula de información?
6. ¿Qué unidades representan `bits`, `bits/símbolo` y `bits/segundo`?
7. ¿Cuál es la relación entre período y frecuencia?
8. ¿Cuál es la frecuencia mínima de muestreo para `fmax=4 kHz`?
9. ¿Por qué no se compara el contenido de un `String` con `==`?
10. ¿Qué debe devolver `toString()`?
11. ¿Qué es una dependencia parcial?
12. ¿Agregar un ID artificial normaliza automáticamente una relación?

## Respuestas del control

```text
1. Participación total.
2. Análisis=responsabilidades conceptuales; diseño=plano próximo a implementación.
3. Permanece contrato/política; cambia representación interna.
4. FIFO ordena; trazabilidad reconstruye la historia mediante registros.
5. I(E)=log₂(1/P(E)).
6. Cantidad; información media por símbolo; tasa por segundo.
7. f=1/T y T=1/f.
8. 8 k muestras/s.
9. == compara referencias; usar equals/isBlank según el caso.
10. Una representación textual con valores reales del objeto.
11. Atributo no clave que depende solo de una parte de una PK compuesta.
12. No; deben analizarse dependencias y redundancias.
```

---

# B. Análisis y Diseño

## Tarjeta 1

**Frente:** ¿Qué diferencia existe entre caso de uso y resultado de valor?

**Reverso:**

```text
Caso de uso
→ interacción que realiza un objetivo.

Resultado de valor
→ estado útil que obtiene el actor al finalizar.
```

## Tarjeta 2

**Frente:** ¿Qué diferencia existe entre modelo de casos de uso y modelo de análisis?

**Reverso:**

```text
Casos de uso
→ vista externa.

Análisis
→ vista interna conceptual.
```

## Tarjeta 3

**Frente:** ¿Qué diferencia existe entre modelo de análisis y modelo de diseño?

**Reverso:**

```text
Análisis
→ objetos y responsabilidades conceptuales.

Diseño
→ clases, operaciones, interfaces, subsistemas y restricciones próximas a implementación.
```

## Tarjeta 4

**Frente:** En `Registrar ejecución de OT`, ¿cómo debe comenzar un alternativo sin conexión?

**Reverso:**

```text
1. El Operario solicita registrar la ejecución.
2. La aplicación detecta falta de conexión.
3. Conserva una solicitud pendiente.
4. Informa al Operario.
5. Sincronizador envía al volver la conexión.
```

No cambiar el objetivo por `Crear OT`.

## Tarjeta 5

**Frente:** ¿Cómo se representa la generalización UML?

**Reverso:**

```text
línea continua
+
triángulo vacío
+
apunta al padre
```

## Tarjeta 6

**Frente:** ¿Qué representan participante, línea de vida, mensaje y foco de control?

**Reverso:**

```text
Participante → actor/objeto que interviene.
Línea de vida → existencia durante la interacción.
Mensaje → solicitud o respuesta.
Foco de control → período de ejecución activa.
```

## Tarjeta 7

**Frente:** ¿Por qué `ColaSincronizacion` puede aparecer en diseño y no necesariamente en análisis?

**Reverso:**

```text
Análisis detecta la necesidad FIFO.
Diseño elige una Cola.
Implementación decide vector, lista, tabla o broker.
```

---

# C. POO y Java

## Tarjeta 8

**Frente:** Abstracción vs. encapsulamiento.

**Reverso:**

```text
Abstracción
→ características esenciales.

Encapsulamiento
→ protege estado y controla acceso.
```

## Tarjeta 9

**Frente:** Clase abstracta vs. interfaz.

**Reverso:**

```text
Clase abstracta
→ estado, constructor, comportamiento común y métodos abstractos.
→ extends.

Interfaz
→ contrato común.
→ implements.
```

## Tarjeta 10

**Frente:** ¿Por qué una clase abstracta puede tener constructor si no se instancia?

**Reverso:**

Para inicializar la parte común de los objetos de las subclases mediante `super(...)`.

## Tarjeta 11

**Frente:** ¿Qué es polimorfismo?

**Reverso:**

```text
misma referencia común
+
misma llamada
+
objeto concreto diferente
=
comportamiento diferente
```

## Tarjeta 12

**Frente:** ¿Qué función cumple la sobrescritura en el polimorfismo?

**Reverso:**

Aporta la implementación específica que ejecutará cada objeto concreto.

## Tarjeta 13

**Frente:** ¿Por qué `destinatario == ""` es incorrecto?

**Reverso:**

`==` compara referencias. Para contenido usar `equals`, `isEmpty` o `isBlank`, tratando también `null` cuando corresponda.

## Tarjeta 14

**Frente:** ¿Qué problema existe si una validación solo imprime un mensaje y luego continúa?

**Reverso:**

La operación inválida se ejecuta igual. Debe devolverse un resultado controlado o lanzarse una excepción.

## Tarjeta 15

**Frente:** ¿Qué hace `toString()`?

**Reverso:**

Método heredado de `Object` que devuelve una representación textual del objeto. Debe usar valores reales de atributos.

```java
@Override
public String toString() {
    return id + " - " + descripcion + " - " + estado;
}
```

## Tarjeta 16

**Frente:** ¿Qué aporta `@Override`?

**Reverso:**

Permite al compilador verificar que realmente se está sobrescribiendo o implementando una operación compatible.

---

# D. Estructuras

## Tarjeta 17

**Frente:** Pila vs. Cola.

**Reverso:**

```text
Pila → LIFO → deshacer.
Cola → FIFO → solicitudes por llegada.
```

## Tarjeta 18

**Frente:** ¿Qué permanece al implementar una Cola con vector o lista?

**Reverso:**

```text
FIFO
encolar
desencolar
cabecera
esVacia
longitud
```

## Tarjeta 19

**Frente:** ¿Qué cambia entre vector y lista enlazada?

**Reverso:**

```text
Vector → posiciones e índices; capacidad definida.
Lista → nodos y referencias; tamaño variable.
```

## Tarjeta 20

**Frente:** ¿Por qué FIFO no garantiza trazabilidad?

**Reverso:**

FIFO solo define el orden. La trazabilidad necesita guardar identificador, usuario, fecha/hora, estados, intentos y resultado.

## Tarjeta 21

**Frente:** ¿Qué debe pasar si el envío de la primera solicitud falla?

**Reverso:**

No eliminarla silenciosamente. Conservarla o aplicar la política definida, registrar el intento y su resultado.

---

# E. Base de Datos

## Tarjeta 22

**Frente:** ¿Qué es una instancia de entidad?

**Reverso:**

Ocurrencia concreta de una entidad.

## Tarjeta 23

**Frente:** Rectángulo doble, elipse doble y línea doble.

**Reverso:**

```text
Rectángulo doble → entidad débil.
Elipse doble → atributo multivaluado.
Línea doble → participación total.
```

## Tarjeta 24

**Frente:** Entidad asociativa vs. entidad débil.

**Reverso:**

```text
Asociativa
→ representa una relación, normalmente N:M.

Débil
→ depende para identificarse o existir.
```

Dos FK no hacen automáticamente débil a una tabla.

## Tarjeta 25

**Frente:** 1FN.

**Reverso:**

Valores atómicos y sin grupos repetitivos.

## Tarjeta 26

**Frente:** 2FN.

**Reverso:**

```text
Estar en 1FN
+
ningún atributo no clave depende solo de una parte de una PK compuesta.
```

## Tarjeta 27

**Frente:** 3FN.

**Reverso:**

```text
Estar en 2FN
+
ningún atributo no clave depende transitivamente de la PK.
```

## Tarjeta 28

**Frente:** Dependencias del caso.

**Reverso:**

```text
id_ot → numero_ot, descripcion_ot, id_sector
id_operario → nombre_operario, especialidad
clave completa de asignación → estado_asignacion
id_sector → nombre_sector
```

## Tarjeta 29

**Frente:** ¿Por qué `numero_ot` no queda en `ASIGNACION_OT`?

**Reverso:**

Porque depende de `id_ot`; repetirlo en cada asignación genera redundancia.

## Tarjeta 30

**Frente:** ¿Agregar `id_asignacion` normaliza automáticamente?

**Reverso:**

No. La PK artificial identifica filas, pero no elimina dependencias funcionales ni redundancias.

---

# F. Comunicaciones

## Tarjeta 31

**Frente:** Relación probabilidad–información.

**Reverso:**

```text
P↑ → incertidumbre↓ → información↓
P↓ → incertidumbre↑ → información↑
```

## Tarjeta 32

**Frente:** Fórmula y unidad de información.

**Reverso:**

```text
I(E)=log₂(1/P(E))
Unidad=bits
```

## Tarjeta 33

**Frente:** Diferenciar unidades.

**Reverso:**

```text
bits → cantidad de información.
bits/símbolo → información media por símbolo.
bits/segundo → tasa de información.
```

## Tarjeta 34

**Frente:** Período y frecuencia.

**Reverso:**

```text
T → tiempo de un ciclo, segundos.
f → ciclos por segundo, Hz.
f=1/T
T=1/f
```

## Tarjeta 35

**Frente:** Muestreo mínimo.

**Reverso:**

```text
fs mínima=2·fmax
```

Para `fmax=4 kHz`:

```text
fs mínima=8 k muestras/s
```

## Tarjeta 36

**Frente:** ¿Puede una señal analógica transmitirse como analógica?

**Reverso:**

Sí. La digitalización se realiza cuando la solución necesita representar, procesar, almacenar o transmitir datos digitales.

## Tarjeta 37

**Frente:** ¿I(E) decide qué debe enviarse?

**Reverso:**

No. Mide información técnica; las reglas, requisitos y políticas del sistema deciden qué datos enviar.

## Tarjeta 38

**Frente:** Serie/paralela y síncrona/asíncrona.

**Reverso:**

```text
Serie → bits sucesivos.
Paralela → bits simultáneos por líneas distintas.
Asíncrona → start + carácter + stop.
Síncrona → cabecera + bloque + terminación.
```

## Tarjeta 39

**Frente:** ¿Qué hace un switch y qué hace un router?

**Reverso:**

```text
Switch → trama/MAC, capa 2.
Router → paquete/IP, capa 3 y nueva trama por enlace.
```

## Tarjeta 40

**Frente:** PDU.

**Reverso:**

```text
PDU=SDU+PCI
```

Datos de capa superior más información de control de la capa actual.

---

# G. Mini salida

Antes de comenzar el caso, responder correctamente:

```text
I(E) para P=1/16
f para T=0,002 s
fs mínima para 4 kHz
una dependencia parcial
una dependencia transitiva
un ejemplo de polimorfismo
una diferencia FIFO/trazabilidad
un alternativo sin conexión
```

Resultados numéricos esperados:

```text
I(E)=4 bits
f=500 Hz
fs mínima=8 k muestras/s
```
