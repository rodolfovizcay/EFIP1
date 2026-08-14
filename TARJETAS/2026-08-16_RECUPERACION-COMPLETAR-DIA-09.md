# Tarjetas de recuperación — completar Día 9

**Fecha prevista:** 16/08/2026  
**Objetivo:** recuperar errores activos, resolver el caso integrador y completar evaluación/defensa del Día 9.

## Uso

1. Leer solo el frente.
2. Responder sin mirar.
3. Comparar con el reverso.
4. Marcar:
   - `0` no recordado;
   - `1` parcial;
   - `2` correcto;
   - `3` correcto y defendible.
5. Repetir únicamente las tarjetas con 0 o 1.

---

# Grupo A — Recuperación del Día 8

## Tarjeta A1

**Frente**

```text
¿Qué significa una línea doble en un DER?
```

**Reverso**

```text
Participación total:
toda instancia de la entidad debe participar en la relación.
```

---

## Tarjeta A2

**Frente**

```text
¿Cómo se representa una generalización UML?
```

**Reverso**

```text
Línea continua con triángulo vacío apuntando al padre.
Hijo → padre.
```

---

## Tarjeta A3

**Frente**

```text
¿Qué es una instancia de una entidad?
```

**Reverso**

```text
Una ocurrencia concreta.
Ejemplo: OT 123, descripción Trabajo de poda, estado PENDIENTE.
```

---

## Tarjeta A4

**Frente**

```text
Entidad asociativa vs. entidad débil.
```

**Reverso**

```text
Asociativa:
representa una relación, normalmente N:M, y conserva sus atributos.

Débil:
depende de otra entidad para identificarse o existir conceptualmente.

Tener dos FK no vuelve débil automáticamente una tabla.
```

---

# Grupo B — TDA, Cola y trazabilidad

## Tarjeta B1

**Frente**

```text
En una Cola con vector o lista, ¿qué permanece y qué cambia?
```

**Reverso**

```text
Permanece:
FIFO + encolar + desencolar + cabecera + esVacia + longitud.

Cambia:
representación interna mediante índices/vector o nodos/referencias.
```

---

## Tarjeta B2

**Frente**

```text
Pila, Cola y trazabilidad.
```

**Reverso**

```text
Pila = LIFO.
Cola = FIFO.
Trazabilidad = reconstrucción histórica de eventos, usuarios, fechas, estados y resultados.
FIFO preserva orden, no garantiza trazabilidad.
```

---

## Tarjeta B3

**Frente**

```text
Alternativo sin conexión para Registrar ejecución de OT.
```

**Reverso**

```text
1. Operario solicita registrar ejecución.
2. App detecta ausencia de conexión.
3. Captura datos.
4. Conserva solicitud PENDIENTE DE ENVÍO.
5. Informa al Operario.
6. Al volver conexión, Sincronizador desencola y envía en FIFO.
```

---

# Grupo C — Información y señales

## Tarjeta C1

**Frente**

```text
Relación entre probabilidad, incertidumbre e información.
```

**Reverso**

```text
P↑ → incertidumbre↓ → información↓
P↓ → incertidumbre↑ → información↑
```

---

## Tarjeta C2

**Frente**

```text
Fórmula de información y unidad.
```

**Reverso**

```text
I(E)=log₂(1/P(E))
Unidad=bits
```

---

## Tarjeta C3

**Frente**

```text
Diferenciá bits, bits/símbolo y bits/segundo.
```

**Reverso**

```text
bits = cantidad de información.
bits/símbolo = información media por símbolo.
bits/segundo = tasa de información por tiempo.
```

---

## Tarjeta C4

**Frente**

```text
A, T, f y fórmulas.
```

**Reverso**

```text
A = amplitud.
T = período, segundos por ciclo.
f = frecuencia, ciclos por segundo, Hz.
f=1/T
T=1/f
```

---

## Tarjeta C5

**Frente**

```text
Regla mínima de muestreo.
```

**Reverso**

```text
fs mínima = 2·fmax
Resultado expresado en muestras/segundo.
```

---

## Tarjeta C6

**Frente**

```text
¿I(E) decide qué datos se envían?
```

**Reverso**

```text
No.
I(E) mide información técnica según probabilidad.
Las reglas, requisitos y políticas del sistema deciden qué enviar.
```

---

## Tarjeta C7

**Frente**

```text
¿Puede transmitirse una señal analógica como analógica?
```

**Reverso**

```text
Sí.
Se digitaliza cuando la solución requiere representar, procesar, almacenar o transmitir datos digitalmente.
```

---

# Grupo D — Modelo de diseño

## Tarjeta D1

**Frente**

```text
Análisis vs. diseño vs. implementación.
```

**Reverso**

```text
Análisis = estructura conceptual y responsabilidades.
Diseño = plano próximo a implementación, operaciones, interfaces y restricciones.
Implementación = código, BD y componentes ejecutables.
```

---

## Tarjeta D2

**Frente**

```text
¿Qué representa un diagrama de secuencia?
```

**Reverso**

```text
Participantes, mensajes y orden temporal.
Tiempo de arriba hacia abajo.
```

---

## Tarjeta D3

**Frente**

```text
Participante, línea de vida, mensaje y foco de control.
```

**Reverso**

```text
Participante = actor/objeto/servicio/subsistema.
Línea de vida = existencia durante la interacción.
Mensaje = solicitud o respuesta.
Foco de control = intervalo de ejecución activa.
```

---

## Tarjeta D4

**Frente**

```text
¿Por qué ColaSincronizacion es diseño y no requisito?
```

**Reverso**

```text
El requisito pide FIFO/orden de llegada.
El diseño elige ColaSincronizacion como una solución posible.
La implementación decide vector, lista, tabla, broker, etc.
```

---

# Grupo E — Abstracción y Polimorfismo

## Tarjeta E1

**Frente**

```text
Abstracción vs. encapsulamiento.
```

**Reverso**

```text
Abstracción = características esenciales.
Encapsulamiento = protección del estado y control de acceso.
```

---

## Tarjeta E2

**Frente**

```text
¿Por qué una clase abstracta no se instancia pero puede tener constructor?
```

**Reverso**

```text
No se instancia porque representa un concepto general/incompleto.
Tiene constructor para inicializar la parte común de sus subclases.
```

---

## Tarjeta E3

**Frente**

```text
Clase abstracta vs. interfaz.
```

**Reverso**

```text
Clase abstracta:
estado, constructor, métodos concretos y abstractos, extends.

Interfaz:
contrato, sin constructor de instancia, implements.
```

---

## Tarjeta E4

**Frente**

```text
¿Qué es polimorfismo?
```

**Reverso**

```text
Una referencia de tipo común puede apuntar a objetos concretos distintos.
La misma llamada ejecuta la implementación sobrescrita del objeto real.
```

---

## Tarjeta E5

**Frente**

```text
¿Qué hace toString()?
```

**Reverso**

```text
Se hereda de Object.
Devuelve una representación textual del objeto.
Se sobrescribe para mostrar valores relevantes.
```

Ejemplo:

```java
@Override
public String toString() {
    return id + " - " + descripcion + " - " + estado;
}
```

---

## Tarjeta E6

**Frente**

```text
¿Por qué no usar == para comparar String?
```

**Reverso**

```text
== compara referencias.
Para contenido usar equals(), isEmpty() o isBlank() según el caso.
```

---

## Tarjeta E7

**Frente**

```text
¿Cómo evitar que una validación informe el error pero continúe enviando?
```

**Reverso**

```text
Devolver boolean y controlar el resultado, o lanzar una excepción.
La operación inválida no debe continuar.
```

---

# Grupo F — Normalización

## Tarjeta F1

**Frente**

```text
1FN.
```

**Reverso**

```text
Valores atómicos y sin grupos repetitivos.
telefonos_operario → OPERARIO_TELEFONO.
```

---

## Tarjeta F2

**Frente**

```text
2FN.
```

**Reverso**

```text
Estar en 1FN y que todo atributo no clave dependa de la PK compuesta completa.
```

---

## Tarjeta F3

**Frente**

```text
Dependencias parciales del ejercicio.
```

**Reverso**

```text
id_ot → numero_ot, descripcion_ot, id_sector, nombre_sector
id_operario → nombre_operario, especialidad_operario
clave completa → estado_asignacion
```

---

## Tarjeta F4

**Frente**

```text
3FN.
```

**Reverso**

```text
Estar en 2FN y no tener dependencias transitivas de atributos no clave.
```

---

## Tarjeta F5

**Frente**

```text
Dependencia transitiva del ejercicio.
```

**Reverso**

```text
id_ot → id_sector
id_sector → nombre_sector
Por eso nombre_sector va a SECTOR.
```

---

## Tarjeta F6

**Frente**

```text
¿Agregar id_asignacion normaliza automáticamente?
```

**Reverso**

```text
No.
Una PK artificial identifica filas, pero no elimina redundancias ni dependencias funcionales indebidas.
```

---

## Tarjeta F7

**Frente**

```text
Modelo final normalizado.
```

**Reverso**

```text
SECTOR
ORDEN_TRABAJO
OPERARIO
OPERARIO_TELEFONO
ASIGNACION_OT
```

---

# Grupo G — Caso integrador de salida

## Tarjeta G1

**Frente**

```text
Explicá la cadena completa del Día 9.
```

**Reverso**

```text
Requisito
→ análisis conceptual
→ diseño con secuencia/servicios/repositorios
→ código con abstracta/interfaz/polimorfismo
→ datos normalizados hasta 3FN
→ prueba integrada
```

---

## Tarjeta G2

**Frente**

```text
Caso sin conexión: elementos mínimos.
```

**Reverso**

```text
AppEjecucion
ColaSincronizacion
Sincronizador
solicitud pendiente
estado
fecha/hora
intentos
resultado
```

---

# Mini examen de salida

Responder sin mirar:

1. Escribí `I(E)` correctamente.
2. Explicá FIFO vs. trazabilidad.
3. Definí línea de vida.
4. Definí foco de control.
5. Escribí una generalización UML.
6. Escribí `toString()` con atributos.
7. Corregí `destinatario == ""`.
8. Diferenciá clase abstracta/interfaz.
9. Explicá el bucle polimórfico.
10. Identificá dependencias parciales de 2FN.
11. Identificá la transitiva de 3FN.
12. Explicá por qué `id_asignacion` no normaliza.
13. Enumerá las cinco relaciones finales.
14. Escribí el alternativo con `Sincronizador`.
15. Integrá requisito, diseño, código y BD.

Criterio para continuar con la evaluación:

```text
12/15 correctas o más
+ fórmula I(E) correcta
+ 2FN correcta
+ toString() correcto
```
