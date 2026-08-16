# Resumen semanal por materia
## Semana intensiva 1 — 10/08 al 16/08/2026

**Cierre inicial:** 15/08/2026  
**Actualización:** 16/08/2026  
**Modalidad:** cierre por evidencia acumulada  
**Indicador descriptivo:** **8,6/10**  
**Examen semanal adicional:** no realizado  
**Caso integrador 1:** práctica guiada completa, sin puntaje formal  
**Día 9:** cerrado sin defensa oral; escrito `5,70/8,00`; sin nota global

---

# 1. Análisis y Diseño de Software

## Temas recorridos

```text
PUD
Requisitos
Casos de uso
Modelo de análisis
Modelo de diseño
Secuencia
Estados
Subsistemas e interfaces
```

## Consolidado o aplicado

- PUD dirigido por casos de uso, centrado en la arquitectura e iterativo/incremental.
- Fases de Inicio, Elaboración, Construcción y Transición.
- Ingeniería de Requerimientos, elicitación, especificación y validación.
- RF, RNF y reglas de negocio.
- Actor, caso de uso, resultado de valor y límite del sistema.
- `include`, `extend` y generalización.
- Modelo de análisis como vista interna conceptual.
- Clases de interfaz, control y entidad.
- Análisis frente a diseño e implementación.
- Servicios, repositorios, Cola y Sincronizador como elementos de diseño.
- Secuencia normal y alternativo sin conexión.

## Evidencia del Día 9

```text
Modelo de diseño:
1,85/2,50 en el escrito.

Secuencia offline:
cabecera→envío→confirmación→trazabilidad→desencolar.

Estados:
flujo principal correcto; transición a ANULADA omitida.
```

## Precisión pendiente

- asociación, agregación, composición y dependencia;
- entidad frente a subsistema;
- interfaz proporcionada con operaciones concretas;
- diagrama de estados completo;
- líneas de vida y foco de control en representación gráfica.

## Respuesta oral breve

> Los requisitos expresan necesidades y restricciones. Los casos de uso muestran externamente qué objetivo realiza el actor. El análisis explica conceptualmente qué objetos y responsabilidades colaboran. El diseño transforma esa solución en clases, operaciones, servicios, repositorios, interfaces y subsistemas próximos a implementación.

---

# 2. Programación Orientada a Objetos

## Temas recorridos

```text
Clase y objeto
Encapsulamiento
Herencia
this/super/static
Sobrecarga/sobrescritura
Abstracción
Clase abstracta
Interfaz
Polimorfismo
toString()
```

## Consolidado o aplicado

- clase y objeto;
- estado, comportamiento e identidad;
- encapsulamiento;
- constructor Java sin retorno;
- `this`, `super` y miembros estáticos;
- herencia y relación `es un`;
- sobrecarga y sobrescritura;
- abstracción frente a encapsulamiento;
- clase/método abstractos;
- interfaz `Auditable`;
- `extends`, `implements` y polimorfismo.

## Evidencia del Día 9

```text
Abstracción/Polimorfismo:
1,55/2,50 en el escrito.

Código:
CanalNotificacion, Email, Móvil y Auditable.
```

## Precisión pendiente

- validar antes de asignar;
- no llamar mediante `super` a un método de la propia clase;
- comparar `String` por contenido;
- `toString()` con atributos reales;
- `@Override` completo;
- una clase pública por archivo cuando corresponde;
- prueba polimórfica completa;
- `equals`, `hashCode`, excepciones y archivos.

## Ejemplo mínimo correcto

```java
protected CanalNotificacion(String destinatario) {
    if (destinatario == null || destinatario.isBlank()) {
        throw new IllegalArgumentException(
            "El destinatario es obligatorio"
        );
    }
    this.destinatario = destinatario;
}
```

## Respuesta oral breve

> La abstracción representa lo esencial y el encapsulamiento protege el estado. Una clase abstracta comparte estado, constructor y comportamiento dentro de una familia; una interfaz define un contrato transversal. El polimorfismo permite que una referencia común ejecute el método sobrescrito del objeto concreto.

---

# 3. Taller de Algoritmos y Estructuras de Datos I

## Temas recorridos

```text
TDA
Vector/lista
Pila/LIFO
Cola/FIFO
Frente/final
Selección por operación dominante
```

## Consolidado o aplicado

- TDA e independencia de implementación;
- Pila LIFO para deshacer;
- Cola FIFO para pendientes;
- `push`, `pop`, `peek`, `encolar`, `cabecera` y `desencolar`;
- vector frente a lista enlazada;
- elección de estructura por política;
- confirmación antes de desencolar.

## Regla de sincronización consolidada

```text
cabecera()
→ enviar
→ recibir confirmación
→ registrar trazabilidad
→ desencolar()
```

## Precisión pendiente

- FIFO frente a trazabilidad como definición automática;
- listas doble, circular y ordenada;
- algoritmos de ordenación;
- complejidades de Inserción, Mergesort y Quicksort.

## Respuesta oral breve

> La Pila trabaja con LIFO y sirve para deshacer el último cambio. La Cola trabaja con FIFO y procesa primero la solicitud que llegó primero. La política y las operaciones del TDA permanecen aunque cambie la representación mediante vector o lista enlazada.

---

# 4. Base de Datos I

## Temas recorridos

```text
Modelo relacional
Claves
DER
Cardinalidades
Entidad fuerte/débil/asociativa
1FN
2FN
3FN
PK/FK/UNIQUE
```

## Consolidado o aplicado

- relación, tupla, atributo, dominio, grado y cardinalidad;
- superclave, candidata, primaria y foránea;
- 1:N con FK en el lado N;
- N:M mediante entidad asociativa;
- atributos multivaluados;
- 1FN y valores atómicos;
- 2FN y dependencias parciales;
- 3FN y dependencia transitiva;
- ID artificial frente a normalización.

## Evidencia del Día 9

```text
Normalización:
1,95/2,50 en el escrito.

Dependencias correctas:
id_ot → datos de OT
id_operario → datos de Operario
clave completa → estado_asignacion

Transitiva:
id_ot → id_sector → nombre_sector
```

## Precisión pendiente

- entidad asociativa frente a entidad débil;
- escribir todos los atributos finales;
- diferenciar PK y `UNIQUE`;
- `PK(id_operario, telefono)`;
- claves históricas y cardinalidades exactas;
- DCL/TCL y álgebra relacional.

## Modelo mínimo que debe salir sin ayuda

```text
SECTOR(id_sector PK, nombre_sector UNIQUE)

ORDEN_TRABAJO(
  id_ot PK,
  numero_ot UNIQUE,
  descripcion_ot,
  id_sector FK
)

OPERARIO(
  id_operario PK,
  nombre_operario,
  especialidad_operario
)

OPERARIO_TELEFONO(
  id_operario FK,
  telefono,
  PK(id_operario, telefono)
)

ASIGNACION_OT(
  id_ot FK,
  id_operario FK,
  fecha_asignacion,
  estado_asignacion,
  PK(id_ot, id_operario, fecha_asignacion)
)
```

## Respuesta oral breve

> En 1FN los valores son atómicos; por eso se separan los teléfonos. En 2FN todo atributo no clave depende de la clave compuesta completa; por eso se separan datos de OT y Operario. En 3FN no debe haber dependencias transitivas; por eso el nombre del Sector se guarda en SECTOR. Un ID artificial no elimina dependencias ni redundancias.

---

# 5. Comunicaciones

## Temas recorridos

```text
Sistema de comunicaciones
OSI/TCP-IP
Encapsulamiento/PDU
MAC/IP/puerto
Switch/router
Información
Señales
Frecuencia y muestreo
Serie/paralela
Síncrona/asíncrona
```

## Consolidado o aplicado

- modelo OSI y arquitectura TCP/IP;
- encapsulamiento y desencapsulamiento;
- datos, segmento, paquete, trama y bits;
- PDU, SDU y PCI;
- MAC, IP y puerto;
- switch y router;
- `I(E)=log₂(1/P(E))`;
- `f=1/T`, `T=1/f`;
- `fs≥2·fmax`;
- serie/paralela y síncrona/asíncrona.

## Precisión pendiente

- declarar supuestos tecnológicos;
- no deducir asincronía de la desconexión;
- amplitud frente a potencia;
- señal analógica puede transmitirse como analógica;
- MAC cambia por enlace;
- medios, atenuación, ruido, dispersión y latencia.

## Fórmulas

```text
I(E)=log₂(1/P(E))
Unidad=bits

f=1/T
T=1/f

fs mínima=2·fmax
```

## Respuesta oral breve

> Aplicación genera datos; Transporte agrega puertos y forma segmentos; Internet agrega IP y forma paquetes; Acceso agrega MAC y forma tramas; Física transmite bits mediante señales. Sin conexión, la aplicación conserva la solicitud localmente y la transmite cuando vuelve la conectividad.

---

# 6. Integración transversal

## Cadena

```text
Problema
→ objetivos
→ requisitos
→ casos de uso
→ análisis
→ diseño
→ POO y estructuras
→ base normalizada
→ comunicaciones
→ pruebas
```

## Mayor fortaleza

```text
Conectar conceptos académicos con el dominio real de Órdenes de Trabajo.
```

## Mayor debilidad

```text
Completar la solución con precisión técnica:
código compilable, estados completos y claves finales.
```

---

# 7. Resultado semanal

| Evaluación completa | Resultado |
|---|---:|
| Día 5 | 9,0/10 |
| Día 6 | 9,2/10 |
| Día 7 | 8,3/10 |
| Día 8 | 7,9/10 |
| **Indicador promedio** | **8,6/10** |

```text
Semana intensiva 1:
CERRADA — NIVEL ALTO / APROBADO
```

Evidencia adicional:

```text
Día 9 escrito = 5,70/8,00 = 71,25 %
Defensa Día 9 = no realizada
Nota global Día 9 = no asignada
```

---

# 8. Prioridades de la siguiente etapa

1. Java completo y compilable.
2. Asociativa frente a débil.
3. Modelo relacional con PK/FK/UNIQUE.
4. Entidad frente a subsistema.
5. Estados UML completos.
6. Relaciones UML restantes.
7. Supuestos de transmisión.
8. DCL/TCL.
9. Ordenación y complejidades.
10. Simulacro oral integral posterior.

Documento de estudio:

```text
RESUMENES/2026-08-16_REPASO-SEMANAL-PUNTOS-DEBILES.md
```

---

# 9. Estado documental

```text
Semana: CERRADA
Caso integrador 1: práctica guiada, sin nota
Día 9: CERRADO SIN DEFENSA ORAL
Indicador semanal: 8,6/10
```
