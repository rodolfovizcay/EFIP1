# Producto Día 9 — Ejemplo polimórfico en Java
## Notificaciones de Órdenes de Trabajo

**Fecha:** 14/08/2026  
**Materia:** Programación Orientada a Objetos  
**Producto del plan:** ejemplo polimórfico

---

# 1. Objetivo

Aplicar:

- abstracción;
- clase abstracta;
- método abstracto;
- interfaz;
- `extends`;
- `implements`;
- sobrescritura;
- polimorfismo;
- `toString()`.

---

# 2. Problema

Una Orden de Trabajo puede notificarse por distintos canales:

```text
Correo electrónico
Notificación móvil
```

Todos deben responder a:

```text
enviar(mensaje)
```

pero cada canal realiza la operación de manera diferente.

Además, los canales deben poder registrar auditoría mediante un contrato común.

---

# 3. Diseño

```text
                 <<abstract>>
              CanalNotificacion
              - destinatario
              + validarDestinatario()
              + enviar(mensaje) abstracto
              + toString()
                    ▲
          ┌─────────┴─────────┐
          │                   │
NotificacionEmail    NotificacionMovil
          │                   │
          └──── implements Auditable ────┘
```

---

# 4. Código completo en un solo archivo

Guardar como:

```text
DemoPolimorfismoOT.java
```

```java
import java.util.List;
import java.util.Objects;

interface Auditable {
    void registrarAuditoria(String evento);
}

abstract class CanalNotificacion {
    private final String destinatario;

    protected CanalNotificacion(String destinatario) {
        if (destinatario == null || destinatario.isBlank()) {
            throw new IllegalArgumentException(
                "El destinatario es obligatorio"
            );
        }
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public boolean validarDestinatario() {
        return !destinatario.isBlank();
    }

    public abstract void enviar(String mensaje);

    @Override
    public String toString() {
        return getClass().getSimpleName()
            + "{destinatario='" + destinatario + "'}";
    }
}

final class NotificacionEmail extends CanalNotificacion
    implements Auditable {

    NotificacionEmail(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviar(String mensaje) {
        Objects.requireNonNull(mensaje, "El mensaje es obligatorio");
        System.out.println(
            "EMAIL a " + getDestinatario() + ": " + mensaje
        );
    }

    @Override
    public void registrarAuditoria(String evento) {
        System.out.println("AUDITORIA EMAIL: " + evento);
    }
}

final class NotificacionMovil extends CanalNotificacion
    implements Auditable {

    NotificacionMovil(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviar(String mensaje) {
        Objects.requireNonNull(mensaje, "El mensaje es obligatorio");
        System.out.println(
            "PUSH a " + getDestinatario() + ": " + mensaje
        );
    }

    @Override
    public void registrarAuditoria(String evento) {
        System.out.println("AUDITORIA PUSH: " + evento);
    }
}

public class DemoPolimorfismoOT {

    public static void notificarTodos(
        List<CanalNotificacion> canales,
        String mensaje
    ) {
        for (CanalNotificacion canal : canales) {
            canal.enviar(mensaje);
        }
    }

    public static void auditar(Auditable elemento, String evento) {
        elemento.registrarAuditoria(evento);
    }

    public static void main(String[] args) {
        CanalNotificacion email =
            new NotificacionEmail("encargado@coop.test");

        CanalNotificacion movil =
            new NotificacionMovil("operario-15");

        List<CanalNotificacion> canales = List.of(email, movil);

        notificarTodos(
            canales,
            "La OT 1587 fue asignada"
        );

        auditar(
            (Auditable) email,
            "Notificación enviada para OT 1587"
        );

        auditar(
            (Auditable) movil,
            "Notificación enviada para OT 1587"
        );

        System.out.println(email);
        System.out.println(movil);
    }
}
```

---

# 5. Salida esperada

```text
EMAIL a encargado@coop.test: La OT 1587 fue asignada
PUSH a operario-15: La OT 1587 fue asignada
AUDITORIA EMAIL: Notificación enviada para OT 1587
AUDITORIA PUSH: Notificación enviada para OT 1587
NotificacionEmail{destinatario='encargado@coop.test'}
NotificacionMovil{destinatario='operario-15'}
```

---

# 6. Dónde está cada concepto

## Abstracción

```text
CanalNotificacion
```

representa únicamente las características relevantes de un canal:

- destinatario;
- validación común;
- capacidad de enviar.

No expone todos los detalles internos de correo o push.

## Clase abstracta

```java
abstract class CanalNotificacion
```

No puede instanciarse directamente.

Aporta:

- estado común `destinatario`;
- constructor;
- método concreto `validarDestinatario()`;
- método abstracto `enviar()`;
- `toString()` común.

## Método abstracto

```java
public abstract void enviar(String mensaje);
```

No tiene cuerpo y obliga a las subclases concretas a implementarlo.

## Herencia

```java
NotificacionEmail extends CanalNotificacion
NotificacionMovil extends CanalNotificacion
```

Ambas clases **son un tipo de** `CanalNotificacion`.

## Interfaz

```java
interface Auditable
```

Define el contrato:

```java
void registrarAuditoria(String evento);
```

## Implementación de interfaz

```java
implements Auditable
```

Cada canal proporciona su propia implementación pública.

## Sobrescritura

```java
@Override
public void enviar(String mensaje)
```

Cada subclase redefine el método abstracto heredado.

## Polimorfismo por superclase

```java
CanalNotificacion email = new NotificacionEmail(...);
CanalNotificacion movil = new NotificacionMovil(...);
```

La referencia es general; el objeto real es específico.

## Polimorfismo en colección

```java
for (CanalNotificacion canal : canales) {
    canal.enviar(mensaje);
}
```

La misma llamada produce comportamientos diferentes.

## Polimorfismo por interfaz

```java
public static void auditar(Auditable elemento, String evento)
```

El método acepta cualquier objeto que cumpla el contrato `Auditable`.

## `toString()`

```java
@Override
public String toString()
```

Devuelve una representación textual del objeto y se hereda originalmente de `Object`.

---

# 7. Clase abstracta vs. interfaz en este ejemplo

| Necesidad | Solución |
|---|---|
| Compartir `destinatario` | Clase abstracta |
| Compartir constructor | Clase abstracta |
| Compartir validación | Clase abstracta |
| Exigir `enviar()` | Método abstracto |
| Exigir auditoría a clases diferentes | Interfaz |
| Permitir varias capacidades | Varias interfaces |

---

# 8. Por qué no usamos solo una clase concreta

Sin abstracción/polimorfismo:

```java
if (tipo.equals("EMAIL")) {
    // enviar correo
} else if (tipo.equals("PUSH")) {
    // enviar push
}
```

Problemas:

- el código central conoce todos los canales;
- agregar un canal obliga a modificar condicionales;
- aumenta acoplamiento;
- se dificulta probar y extender.

Con polimorfismo:

```java
canal.enviar(mensaje);
```

El objeto concreto decide cómo responder.

---

# 9. Preguntas de comprensión

1. ¿Por qué no puede ejecutarse `new CanalNotificacion(...)`?
2. ¿Qué atributos y métodos comparte la clase abstracta?
3. ¿Por qué `enviar` es abstracto?
4. ¿Qué ocurriría si `NotificacionEmail` no implementara `enviar`?
5. ¿Por qué `Auditable` es una interfaz y no necesariamente otra superclase?
6. ¿Qué significa `implements`?
7. ¿Dónde ocurre la sobrescritura?
8. ¿Dónde ocurre el polimorfismo?
9. ¿Por qué `List<CanalNotificacion>` puede contener ambos canales?
10. ¿Qué devuelve `toString()`?

---

# 10. Ejercicio de modificación

Agregar:

```text
NotificacionSMS
```

Condiciones:

- extiende `CanalNotificacion`;
- implementa `Auditable`;
- sobrescribe `enviar`;
- se agrega a la lista sin modificar `notificarTodos`.

Resultado esperado:

```text
El algoritmo general no cambia.
Solo se incorpora una nueva clase concreta.
```

---

# 11. Ejercicio de interfaz adicional

Crear:

```java
interface Reintentable {
    void reintentar();
}
```

Hacer que solamente `NotificacionMovil` la implemente.

Pregunta:

> ¿Por qué una clase puede extender una sola superclase y, al mismo tiempo, implementar varias interfaces?

---

# 12. Errores frecuentes

| Error | Corrección |
|---|---|
| `new CanalNotificacion(...)` | No se instancia una abstracta |
| Método abstracto con `{}` | No tiene cuerpo |
| `extends Auditable` desde clase | Usar `implements` |
| Implementación de interfaz privada | Debe ser pública |
| Subclase concreta sin `enviar` | Implementar o hacerla abstracta |
| Polimorfismo = sobrecarga | No son equivalentes |
| `toString()` convierte un atributo | Representa textualmente al objeto |
| Referencia general pierde comportamiento | Ejecuta comportamiento del objeto real |

---

# 13. Defensa oral modelo

> `CanalNotificacion` es abstracta porque representa una base común que no tiene sentido instanciar directamente. Comparte estado, constructor y validación, y declara el método abstracto `enviar`. `NotificacionEmail` y `NotificacionMovil` lo sobrescriben. La interfaz `Auditable` define un contrato independiente que ambas clases implementan. El polimorfismo aparece cuando una referencia `CanalNotificacion` o `Auditable` apunta a objetos concretos y la misma llamada ejecuta la implementación correspondiente al objeto real.
