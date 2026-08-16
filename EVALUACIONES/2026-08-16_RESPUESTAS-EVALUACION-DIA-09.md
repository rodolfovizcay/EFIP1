# Respuestas del estudiante — Evaluación escrita final del Día 9
## Diseño + Abstracción/Polimorfismo + Normalización

**Jornada original:** 14/08/2026  
**Recuperación y evaluación:** 16/08/2026  
**Modalidad:** sin apuntes  
**Defensa oral:** no realizada por decisión del estudiante  
**Estado del archivo:** respuestas originales preservadas; correcciones separadas

> Este documento conserva la entrega escrita real. No sustituye errores u omisiones por respuestas corregidas.

---

# Parte A — Modelo de diseño

## 1. Análisis, diseño e implementación

### Modelo de análisis

> Que necesidades requiere cubrir el sistema.

### Modelo de diseño

> Soporte arquitectónico y cómo se pueden llegar a implementar esas necesidades.

### Implementación

> Codificación y construcción de las soluciones.

### Artefactos nombrados

```text
Clases del diseño
Modelo del diseño
Realización de caso de uso–diseño
Diagrama de secuencia
Diagrama de subsistemas
```

---

## 2. Secuencia normal

```text
1. El Operario solicita ejecutar una OT.
2. AppEjecucion captura los datos y los envía a EjecucionService.
3. El sistema verifica la conexión.
4. El sistema tiene conexión.
5. EjecucionService consulta el estado en OrdenTrabajoRepository.
6. EjecucionService verifica que la OT esté DESPACHADA y disponible.
7. EjecucionService envía a registrar la información a EjecucionRepository.
8. El servidor responde que el registro se creó con éxito.
9. EjecucionService notifica el estado a AppEjecucion.
10. AppEjecucion muestra el resultado al Operario.
```

### Alternativo sin conexión

```text
4.1. El sistema detecta desconexión.
4.2. EjecucionService manda a encolar la ejecución en ColaSincronizacion.
4.3. El sistema detecta conexión e inicia el Sincronizador.
4.4. El Sincronizador ejecuta cabecera() en ColaSincronizacion.
4.5. El Sincronizador toma la ejecución y llama a EjecucionService.
4.6. EjecucionService consulta el estado en OrdenTrabajoRepository.
4.7. EjecucionService verifica que la OT esté DESPACHADA.
4.8. EjecucionService envía a registrar en EjecucionRepository.
4.9. El servidor confirma que el registro se creó con éxito.
4.10. EjecucionService devuelve el resultado al Sincronizador.
4.11. El Sincronizador genera la trazabilidad.
4.12. El Sincronizador solicita desencolar a ColaSincronizacion.
4.13. El Sincronizador consulta si la Cola está vacía.
4.14. Si no está vacía, vuelve al paso 4.4.
4.15. Si está vacía, notifica al usuario el resultado de la sincronización.
```

La secuencia entregada respetó:

```text
cabecera
→ envío
→ confirmación
→ trazabilidad
→ desencolar
```

### Estados entregados

```text
PENDIENTE
Despachar → DESPACHADA
Iniciar → EN_EJECUCION
Finalizar + datos → FINALIZADA
```

La transición hacia `ANULADA` fue solicitada, pero no se escribió en la entrega final.

---

## 3. Subsistemas e interfaz

```text
Interfaz: AppEjecucion

Subsistemas propuestos:
- Sincronización
- EjecucionOT
- Notificación
```

Justificación de `ColaSincronizacion`:

> El requisito solicita que no se pierda información, se almacene localmente y luego se procese en formato FIFO. El diseño define cómo se implementará mediante ColaSincronizacion.

---

# Parte B — Abstracción y Polimorfismo

## 4. Conceptos

```text
Abstracción:
representa funcionalidad y atributos sin conocer la implementación.

Encapsulamiento:
protege los estados de los objetos.

Clase abstracta:
clase que no puede instanciarse directamente; tiene atributos,
métodos implementados y uno o más métodos que deben implementarse;
se hereda con extends.

Método abstracto:
representa una función sin implementación que debe completar
la subclase concreta.

Interfaz:
contrato común; contiene métodos que deben implementarse
y se utiliza con implements.

Polimorfismo:
capacidad de objetos concretos de comportarse de forma diferente
manteniendo una referencia común, mediante herencia y sobrescritura.
```

---

## 5. Código Java entregado

```java
public interface Auditable {
    void registrarAuditoria(String evento);
}

abstract class CanalNotificacion {

    private String destinatario;

    protected CanalNotificacion(String destinatario) {
        this.destinatario = destinatario;
        super.validarDestinatario();
    }

    public String getDestinatario() {
        return this.destinatario;
    }

    public void validarDestinatario() {
        if (this.destinatario == null || this.destinatario.isBlank()) {
            throw new IllegalArgumentException(
                "Destinatario es requerido"
            );
        }
    }

    abstract public void enviar(String mensaje);
}

public class NotificacionEmail
        extends CanalNotificacion
        implements Auditable {

    public NotificacionEmail(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviar(String mensaje) {
        System.err.println(
            "Enviado por mail a: "
            + super.getDestinatario()
            + " Mensaje:" + mensaje
        );
    }

    public void registrarAuditoria(String evento) {
        System.out.println(evento);
    }
}

public class NotificacionMovil
        extends CanalNotificacion
        implements Auditable {

    public NotificacionMovil(String detinatario) {
        super(detinatario);
    }

    @Override
    public void enviar(String mensaje) {
        System.err.println(
            "Enviado al móvil: "
            + super.getDestinatario()
            + " Mensaje:" + mensaje
        );
    }

    public void registrarAuditoria(String evento) {
        System.out.println(evento);
    }
}
```

Omisiones conservadas:

```text
toString() solicitado pero no escrito
@Override omitido en registrarAuditoria()
constructor llama super.validarDestinatario()
varios tipos public si se pretendiera un único archivo
```

---

## 6. Explicación polimórfica

> Funciona porque el polimorfismo permite a un objeto concreto tener su propio comportamiento por medio de la herencia y la sobrescritura.

La entrega no desarrolló explícitamente todos los términos solicitados:

```text
tipo de referencia
objeto concreto
método sobrescrito
comportamiento ejecutado
```

---

# Parte C — Normalización

## 7. Primera, Segunda y Tercera Forma Normal

### 1FN

```text
telefonos_operario viola 1FN
porque los atributos deben ser atómicos
y no contener grupos repetidos.
```

La separación en `OPERARIO_TELEFONO` no se escribió completa en esta respuesta.

### 2FN

```text
id_ot
→ numero_ot
→ descripcion_ot
→ id_sector

id_operario
→ nombre_operario
→ especialidad_operario

(id_ot, id_operario, fecha_asignacion)
→ estado_asignacion
```

### 3FN

```text
id_ot → id_sector → nombre_sector
```

Tabla propuesta:

```text
SECTOR
```

---

## 8. Modelo final entregado

```text
SECTOR
- id_sector PK

ORDEN_TRABAJO
- id_ot PK
- id_sector FK

OPERARIO
- id_operario PK

OPERARIO_TELEFONO
- id_operario FK
- (id_operario, telefono) UNIQUE

ASIGNACION_OT
- id_ot FK
- id_operario FK
- PK(id_ot, id_operario, fecha_asignacion)
```

Omisiones conservadas:

```text
faltan atributos descriptivos
faltan numero_ot UNIQUE y nombre_sector UNIQUE
OPERARIO_TELEFONO requiere PK compuesta, no solo UNIQUE
```

---

## 9. ID artificial

> Crear un índice puede facilitar la búsqueda, pero los datos repetidos siguen existiendo. Para corregirlo debe normalizarse la relación y descomponerse en relaciones mejor estructuradas, reduciendo redundancia, dependencias indebidas y anomalías.

---

# Parte D — Integración

Respuesta entregada:

```text
El requisito expresa una necesidad del sistema.

El caso de uso representa esa necesidad, quién la necesita,
qué función o servicio se brinda y cuál es el resultado.

El modelo de análisis refina los requerimientos para entender
cómo interactúan los objetos, sus comportamientos y responsabilidades.

El modelo de diseño transforma lo conceptual en algo más específico
y cercano a la implementación.

El polimorfismo permite reutilizar código y generar comportamientos
diferentes para objetos concretos.

Normalizar los datos permite reducir redundancia,
dependencias indebidas y anomalías.

Las pruebas garantizan que lo solicitado por los requerimientos
y casos de uso se cumpla.
```

Omisión conservada:

```text
No se explicó qué sucede sin conexión,
aunque era una condición expresa de la consigna.
```

---

# Defensa oral

```text
NO REALIZADA
```

Decisión del estudiante del 16/08/2026:

> Cerrar el Día 9 sin realizar la defensa oral y utilizar la evidencia escrita y semanal para orientar el repaso.
