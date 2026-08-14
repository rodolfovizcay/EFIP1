# Caso integrador — Día 9
## Diseño + Polimorfismo + Normalización

**Fecha:** 14/08/2026  
**Modalidad:** resolución escrita, código breve y defensa oral

---

# 1. Situación

Una cooperativa dispone del caso de uso:

```text
Registrar ejecución de Orden de Trabajo
```

Un Operario registra desde una aplicación móvil:

- OT;
- resultado;
- observación;
- fecha/hora;
- medición opcional de sensor;
- fotografías opcionales.

Si no hay conexión, la solicitud queda pendiente y debe enviarse respetando el orden de llegada.

Cuando la ejecución se registra, el sistema notifica al Encargado. Las notificaciones pueden enviarse por correo electrónico o por notificación móvil. En el futuro podrán agregarse otros canales.

La base actual guarda en una sola tabla datos de OT, Sector, Operario, teléfonos y asignación, generando redundancia.

---

# 2. Requisitos de referencia

```text
RF-01
El sistema debe permitir al Operario registrar la ejecución de una OT.

RF-02
Si no existe conexión, la ejecución debe quedar pendiente de sincronización.

RF-03
Las solicitudes pendientes deben enviarse por orden de llegada.

RF-04
El sistema debe notificar al Encargado cuando la ejecución se registre.

RN-01
Una OT solo admite ejecución cuando su estado lo permite.

RN-02
La notificación debe enviarse mediante todos los canales habilitados.

RNF-01
El diseño debe permitir incorporar nuevos canales sin modificar el algoritmo general de notificación.

RNF-02
La estructura relacional debe evitar redundancia y anomalías de actualización.
```

---

# 3. Parte A — Modelo de diseño

## 3.1 Comparación

Explicá:

```text
Modelo de análisis:
Modelo de diseño:
```

Indicá qué nuevas decisiones aparecen al considerar:

- tecnología móvil;
- conexión intermitente;
- persistencia;
- notificaciones;
- estructura relacional.

---

## 3.2 Clases y componentes de diseño

Clasificá y justificá:

```text
AppRegistrarEjecucion
ServicioRegistrarEjecucion
RepositorioOrdenTrabajo
RepositorioEjecucion
OrdenTrabajo
EjecucionOT
ColaSincronizacion
CanalNotificacion
```

Para cada uno indicá:

- responsabilidad;
- interfaz proporcionada;
- dependencias principales;
- si proviene de una o varias clases de análisis.

---

## 3.3 Secuencia normal

Ordená y completá:

```text
Operario
AppRegistrarEjecucion
ServicioRegistrarEjecucion
RepositorioOrdenTrabajo
OrdenTrabajo
EjecucionOT
RepositorioEjecucion
CanalNotificacion
```

Debe contener al menos diez mensajes.

Plantilla:

```text
1. Operario → App:
2. App → Servicio:
3. Servicio → RepositorioOT:
4. RepositorioOT → Servicio:
5. Servicio → OrdenTrabajo:
6. OrdenTrabajo → Servicio:
7. Servicio → EjecucionOT:
8. Servicio → RepositorioEjecucion:
9. RepositorioEjecucion → Servicio:
10. Servicio → CanalNotificacion:
11. Servicio → App:
12. App → Operario:
```

---

## 3.4 Alternativo sin conexión

Completar sin cambiar el objetivo del caso:

```text
A1. App detecta...
A2. App crea...
A3. App encola...
A4. App informa...
A5. Cuando vuelve la conexión...
```

Explicá:

```text
FIFO garantiza:
Trazabilidad requiere:
```

---

## 3.5 Diagrama de estados

Para `OrdenTrabajo`, proponer:

```text
Estados:
Eventos:
Condiciones:
Transiciones:
```

Utilizar como mínimo:

```text
PENDIENTE
DESPACHADA
EN_EJECUCION
FINALIZADA
ANULADA
```

Validar que las operaciones que provocan transiciones existan y sean invocadas por casos de uso.

---

## 3.6 Subsistemas e interfaces

Proponer al menos tres subsistemas:

```text
Subsistema móvil:
Subsistema OT:
Subsistema ejecución/notificación:
```

Definir una interfaz visible por subsistema.

Ejemplo de formato:

```text
IOrdenTrabajo
+ buscarPorId(idOT)
+ validarEstadoParaEjecucion(idOT)
```

---

# 4. Parte B — Abstracción y Polimorfismo

## 4.1 Selección de abstracción

Tenemos dos canales:

```text
NotificacionEmail
NotificacionMovil
```

Responder:

1. ¿Qué características comparten?
2. ¿Qué comportamiento debe variar?
3. ¿Conviene una clase abstracta, una interfaz o ambas?
4. ¿Qué estado común justificaría una clase abstracta?
5. ¿Qué contrato independiente justificaría una interfaz?

---

## 4.2 Clase abstracta

Completar:

```java
public abstract class CanalNotificacion {
    private final String destinatario;

    public CanalNotificacion(String destinatario) {
        // validar y asignar
    }

    public String getDestinatario() {
        // devolver
    }

    public abstract void enviar(String mensaje);

    @Override
    public String toString() {
        // representación textual
    }
}
```

Explicar:

- por qué no puede instanciarse;
- para qué sirve el constructor;
- qué comparte;
- qué delega a subclases.

---

## 4.3 Interfaz

Completar:

```java
public interface Auditable {
    void registrarAuditoria(String evento);
}
```

Explicar:

- por qué no necesita relación de familia;
- por qué una clase puede implementar varias interfaces;
- qué palabra reservada se utiliza.

---

## 4.4 Subclases

Escribir:

```java
NotificacionEmail
NotificacionMovil
```

Condiciones:

- `extends CanalNotificacion`;
- `implements Auditable`;
- constructor con `super(...)`;
- `enviar(...)` sobrescrito;
- `registrarAuditoria(...)` público.

---

## 4.5 Polimorfismo

Completar:

```java
List<CanalNotificacion> canales = List.of(
    // email,
    // móvil
);

for (CanalNotificacion canal : canales) {
    // misma llamada polimórfica
}
```

Responder:

1. ¿Cuál es el tipo de la referencia?
2. ¿Cuál es el tipo real de cada objeto?
3. ¿Qué implementación se ejecuta?
4. ¿Qué se modifica para agregar `NotificacionSMS`?
5. ¿Se modifica el algoritmo general?

---

## 4.6 Defensa abstracta vs. interfaz

Preparar una respuesta continua:

> Una clase abstracta se utiliza cuando... Una interfaz se utiliza cuando... En este caso `CanalNotificacion`... y `Auditable`...

Debe contener:

- instanciación;
- constructor;
- atributos;
- métodos concretos/abstractos;
- `extends`;
- `implements`;
- multiplicidad de interfaces;
- polimorfismo.

---

# 5. Parte C — Normalización

## 5.1 Relación inicial

```text
ASIGNACION_OT_SIN_NORMALIZAR

id_ot
numero_ot
descripcion_ot
id_sector
nombre_sector
id_operario
nombre_operario
especialidad_operario
telefonos_operario
fecha_asignacion
estado_asignacion
```

Supuesto:

```text
Una misma pareja OT–Operario puede asignarse varias veces
si la fecha de asignación es diferente.
```

---

## 5.2 Clave candidata

Proponer y justificar:

```text
(id_ot, id_operario, fecha_asignacion)
```

Analizar una alternativa con `id_asignacion` y explicar por qué un ID artificial no normaliza automáticamente la tabla.

---

## 5.3 Dependencias funcionales

Completar:

```text
id_ot →

id_operario →

id_sector →

(id_ot, id_operario, fecha_asignacion) →
```

---

## 5.4 Primera forma normal

Identificar la violación:

```text
telefonos_operario
```

Proponer:

```text
OPERARIO_TELEFONO(...)
```

Marcar PK y FK.

---

## 5.5 Segunda forma normal

Identificar dependencias parciales:

```text
id_ot → ...
id_operario → ...
```

Descomponer en:

```text
ORDEN_TRABAJO_2FN
OPERARIO_2FN
ASIGNACION_OT_2FN
OPERARIO_TELEFONO_2FN
```

---

## 5.6 Tercera forma normal

Identificar:

```text
id_ot → id_sector
id_sector → nombre_sector
```

Explicar por qué es transitiva y crear:

```text
SECTOR
```

---

## 5.7 Modelo final

Completar:

```text
SECTOR(
)

ORDEN_TRABAJO(
)

OPERARIO(
)

OPERARIO_TELEFONO(
)

ASIGNACION_OT(
)
```

Marcar:

- PK;
- FK;
- `UNIQUE`;
- atributo que depende de toda la clave de asignación.

---

## 5.8 Anomalías

Dar un ejemplo de:

```text
Anomalía de inserción:
Anomalía de modificación:
Anomalía de borrado:
```

Explicar cómo la descomposición las reduce.

---

# 6. Parte D — Integración

Completar la trazabilidad:

```text
Necesidad:

RF/RNF:

Caso de uso:

Realización de análisis:

Realización de diseño:

Diagrama de secuencia:

Clase abstracta:

Interfaz:

Comportamiento polimórfico:

Relaciones normalizadas:

Caso de prueba:
```

---

# 7. Caso de prueba integrado

Diseñar una prueba con:

```text
OT: 1587
Estado: DESPACHADA
Operario: 20
Conexión: ausente al primer intento
Canales: EMAIL + PUSH
Teléfonos: dos
Sector: Redes
```

Verificar:

1. La ejecución queda pendiente sin conexión.
2. La solicitud conserva identificador y orden FIFO.
3. Al volver la conexión se registra.
4. La OT acepta la transición correspondiente.
5. Ambos canales reciben el mismo mensaje con comportamiento propio.
6. Los datos no se duplican en la estructura normalizada.
7. La asignación histórica conserva fecha y estado.

---

# 8. Preguntas de defensa

1. ¿Qué decisiones convierten análisis en diseño?
2. ¿Por qué un diagrama de secuencia pertenece al diseño?
3. ¿Qué diferencia hay entre mensaje y operación?
4. ¿Qué muestra el diagrama de estados?
5. ¿Por qué `CanalNotificacion` es abstracta?
6. ¿Por qué `Auditable` es interfaz?
7. ¿Dónde aparece el polimorfismo?
8. ¿Qué viola 1FN?
9. ¿Qué dependencia parcial se eliminó?
10. ¿Qué dependencia transitiva se eliminó?
11. ¿Por qué un ID artificial no basta?
12. ¿Cómo se integran diseño, código y datos?

---

# 9. Criterio de corrección

- [ ] Mantiene el objetivo `Registrar ejecución`.
- [ ] Incluye alternativo sin conexión.
- [ ] Declara supuestos tecnológicos.
- [ ] Distingue análisis y diseño.
- [ ] Ordena correctamente mensajes.
- [ ] Diferencia estado/evento/transición.
- [ ] Distingue clase abstracta e interfaz.
- [ ] Utiliza `extends` e `implements`.
- [ ] Aplica polimorfismo real.
- [ ] Incluye `toString()`.
- [ ] Aplica 1FN, 2FN y 3FN en orden.
- [ ] Identifica dependencias parciales/transitivas.
- [ ] Marca PK/FK/UNIQUE.
- [ ] Justifica anomalías evitadas.
