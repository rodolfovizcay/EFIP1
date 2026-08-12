# Ficha de estudio — Herencia en Java

**Fecha:** 12/08/2026  
**Materia:** Programación Orientada a Objetos

---

## Definición

La herencia permite definir una clase a partir de otra ya existente.

```text
Superclase / clase padre
→ aporta atributos y métodos comunes.

Subclase / clase hija
→ hereda y puede agregar o redefinir comportamiento.
```

Relación conceptual:

```text
Operario ES UN UsuarioSistema
```

No usar herencia si la relación no puede expresarse razonablemente como “es un”.

---

## Terminología

| Término | Significado |
|---|---|
| Superclase | Clase cuyas características se heredan |
| Subclase | Clase derivada que hereda y especializa |
| Especialización | Crear una versión más específica |
| Reutilización | Aprovechar atributos y métodos existentes |
| Jerarquía | Organización padre–hijos |

---

## `extends`

```java
public class Operario extends UsuarioSistema {
}
```

`Operario` hereda de `UsuarioSistema`.

Java utiliza herencia simple de clases: una clase extiende directamente una sola superclase.

---

## Constructor de superclase

```java
public class UsuarioSistema {
    private final int id;
    private final String nombre;

    public UsuarioSistema(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}
```

### Recuperación obligatoria

```text
Constructor Java:
- mismo nombre que la clase;
- no declara tipo de retorno;
- ni siquiera void.
```

---

## Constructor de subclase y `super`

```java
public class Operario extends UsuarioSistema {
    private final String especialidad;

    public Operario(int id, String nombre, String especialidad) {
        super(id, nombre);
        this.especialidad = especialidad;
    }
}
```

### Regla

La llamada explícita a `super(...)` debe aparecer como primera sentencia del constructor de la subclase.

Si no se escribe, Java intenta usar `super()`; eso exige un constructor sin parámetros accesible en la superclase.

---

## `this` frente a `super`

| Palabra | Uso |
|---|---|
| `this` | Objeto actual; atributo/método de la instancia actual |
| `super` | Constructor o miembro heredado de la superclase |

```java
super(id, nombre);
this.especialidad = especialidad;
```

---

## Sobrescritura

Una subclase redefine un método heredado conservando una signatura compatible.

```java
@Override
public String getRol() {
    return "OPERARIO";
}
```

```text
Sobrescritura
= método heredado
+ misma signatura
+ nueva implementación
```

`@Override` permite que el compilador ayude a detectar errores.

---

## Sobrecarga

Métodos con el mismo nombre y distinta lista de parámetros.

```java
public void buscarOT(int numero) { }
public void buscarOT(String texto) { }
```

```text
Sobrecarga
= mismo nombre
+ distinta cantidad o tipos de parámetros
```

No requiere herencia.

---

## Comparación

| Sobrecarga | Sobrescritura |
|---|---|
| Parámetros diferentes | Método heredado |
| Puede ocurrir en una clase | Ocurre en una subclase |
| Mismo nombre | Misma signatura compatible |
| Selección según argumentos | Nueva implementación heredada |

---

## Miembros estáticos

Un miembro `static` pertenece a la clase, no a cada objeto individual.

```java
private static int cantidadUsuarios = 0;

public static int getCantidadUsuarios() {
    return cantidadUsuarios;
}
```

Uso:

```java
UsuarioSistema.getCantidadUsuarios();
```

### Criterio

```text
nombre de usuario
→ estado de una instancia.

cantidad total de usuarios
→ dato compartido de clase/static.
```

No usar `static` para evitar diseñar correctamente objetos.

---

## Clase `Object`

Todas las clases Java derivan directa o indirectamente de `Object`.

Métodos relevantes del material:

| Método | Propósito general |
|---|---|
| `toString()` | Representación textual |
| `equals(Object obj)` | Comparación lógica según implementación |
| `hashCode()` | Código hash |
| `getClass()` | Clase en tiempo de ejecución |
| `clone()` | Clonación según condiciones |

Ejemplo de sobrescritura:

```java
@Override
public String toString() {
    return getRol() + " - " + getNombre();
}
```

---

## Ejemplo completo

```java
public class UsuarioSistema {
    private final int id;
    private final String nombre;
    private static int cantidadUsuarios = 0;

    public UsuarioSistema(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        cantidadUsuarios++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRol() {
        return "USUARIO";
    }

    public static int getCantidadUsuarios() {
        return cantidadUsuarios;
    }

    @Override
    public String toString() {
        return getRol() + " - " + nombre;
    }
}
```

```java
public class Encargado extends UsuarioSistema {

    public Encargado(int id, String nombre) {
        super(id, nombre);
    }

    @Override
    public String getRol() {
        return "ENCARGADO";
    }

    public void programarOT(int numeroOT) {
        // comportamiento específico
    }
}
```

```java
public class Operario extends UsuarioSistema {
    private final String especialidad;

    public Operario(int id, String nombre, String especialidad) {
        super(id, nombre);
        this.especialidad = especialidad;
    }

    @Override
    public String getRol() {
        return "OPERARIO";
    }

    public void ejecutarOT(int numeroOT) {
        // comportamiento específico
    }
}
```

---

## Secuencia de construcción

Al crear una subclase:

```text
1. Se ejecuta el constructor de la superclase.
2. Se inicializa la parte heredada.
3. Se inicializan los atributos específicos.
4. Se ejecuta el resto del constructor de la subclase.
```

La cadena continúa hasta `Object`.

---

## Errores frecuentes

| Error | Corrección |
|---|---|
| `public void Operario(...)` | Constructor sin retorno |
| `super(...)` después de `this.especialidad` | `super(...)` primero |
| Subclase solo porque comparte un atributo | Debe existir “es un” |
| Sobrecarga = más parámetros | Pueden cambiar cantidad o tipos |
| Sobrescritura sin método heredado | Requiere herencia |
| `static nombre` | El nombre pertenece a cada instancia |
| Acceso directo a `private` heredado | Usar interfaz accesible |
| `this` y `super` iguales | Actual vs. parte heredada |

---

## Respuesta oral modelo

> La herencia permite crear una subclase a partir de una superclase y reutilizar sus atributos y métodos. En Java se declara con `extends`. El constructor de la subclase llama primero a `super(...)` para inicializar la parte heredada y usa `this` para la instancia actual. La sobrescritura redefine un método heredado con la misma signatura, mientras que la sobrecarga conserva el nombre y cambia los parámetros. Los miembros estáticos pertenecen a la clase y todas las clases derivan de `Object`.

---

## Control

- [ ] Puedo definir herencia.
- [ ] Puedo reconocer una relación “es un”.
- [ ] Puedo diferenciar superclase y subclase.
- [ ] Puedo escribir `extends`.
- [ ] Puedo escribir un constructor correcto.
- [ ] Puedo llamar `super(...)` primero.
- [ ] Puedo diferenciar `this` y `super`.
- [ ] Puedo justificar un miembro `static`.
- [ ] Puedo sobrescribir un método.
- [ ] Puedo diferenciar sobrecarga y sobrescritura.
- [ ] Puedo explicar la clase `Object`.
