# Ficha — Java complementario

**Día:** 11 — 18/08/2026

---

# 1. Arreglo frente a ArrayList

| Criterio | Arreglo | `ArrayList<E>` |
|---|---|---|
| Tamaño | se fija al crear | crece o disminuye |
| Acceso | índice, `arr[i]` | índice, `lista.get(i)` |
| Longitud | `arr.length` | `lista.size()` |
| Agregar | controlar posición/capacidad | `add(elemento)` |
| Eliminar | desplazar manualmente | `remove(...)` |
| Tipos primitivos | sí | usa objetos/wrappers |

Ambos ofrecen acceso por índice normalmente `O(1)`. Insertar o eliminar en el medio puede ser `O(n)` por desplazamientos.

---

# 2. String y comparación

`String` es un objeto e inmutable: una operación produce otra cadena; no modifica la original.

```java
String a = new String("SIGO");
String b = new String("SIGO");

a == b;       // false: referencias distintas
a.equals(b);  // true: contenido igual
```

Para evitar `NullPointerException` cuando una constante es conocida:

```java
"PENDIENTE".equals(estado)
```

---

# 3. equals y hashCode

Si se redefine `equals`, debe redefinirse `hashCode` de forma coherente.

```text
si a.equals(b) es true
→ a.hashCode() debe ser igual a b.hashCode()
```

El hash igual no garantiza igualdad; puede haber colisiones.

---

# 4. Excepciones

Una excepción altera el flujo normal ante una situación anormal.

| Concepto | Función |
|---|---|
| checked | el compilador exige capturar o declarar |
| unchecked | deriva de `RuntimeException`; no exige captura/declaración |
| `try` | contiene código que puede fallar |
| `catch` | captura un tipo de excepción |
| `finally` | se ejecuta al salir del bloque, salvo terminaciones excepcionales de la JVM |
| `throw` | lanza una instancia concreta |
| `throws` | declara en la firma que el método puede propagarla |

Ejemplos:

```java
throw new IllegalArgumentException("Id inválido");

Trabajo buscar(int id) throws TrabajoNoEncontradoException {
    // ...
}
```

`IllegalArgumentException` es unchecked. Una clase que extiende directamente `Exception` es checked, salvo que derive de `RuntimeException`.

---

# 5. JVM y portabilidad — complemento

```text
código .java
→ compilación
→ bytecode .class
→ JVM de la plataforma
→ ejecución
```

La JVM favorece la portabilidad porque el mismo bytecode puede ejecutarse en plataformas con una JVM compatible. No significa que todo programa Java sea automáticamente portable: bibliotecas nativas, archivos, permisos y dependencias pueden variar.

---

# 6. SOLID — reconocimiento conceptual

| Principio | Idea breve | Ejemplo |
|---|---|---|
| SRP | una razón principal de cambio | separar menú de persistencia |
| OCP | extender sin modificar el núcleo estable | nueva estrategia implementando interfaz |
| LSP | un subtipo debe poder sustituir al padre | no romper contratos heredados |
| ISP | interfaces pequeñas y específicas | no obligar a implementar métodos inútiles |
| DIP | depender de abstracciones | servicio depende de `IRepositorio` |

SOLID es complementario y se estudia para definir y reconocer, no para rediseñar todo el sistema.

---

# 7. Errores frecuentes

- usar `==` para igualdad lógica;
- redefinir `equals` sin `hashCode`;
- capturar `Exception` sin necesidad;
- confundir `throw` con `throws`;
- usar excepciones como flujo normal;
- creer que `finally` reemplaza el manejo del error;
- afirmar que `ArrayList` siempre es mejor que un arreglo.
