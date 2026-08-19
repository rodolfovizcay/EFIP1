# Ficha — Archivos y excepciones propias en Java

**Fecha:** 19/08/2026
**Materia:** Programación Orientada a Objetos
**Estado:** material preparado

---

# 1. ¿Por qué usar un archivo?

Las variables viven mientras el proceso está activo. Un archivo permite conservar datos fuera de la ejecución.

```text
objeto en memoria
→ serialización a un formato
→ bytes/caracteres en archivo
→ lectura
→ validación
→ reconstrucción del objeto
```

Para el ejercicio se utiliza texto delimitado porque permite observar todo el proceso. No reemplaza automáticamente a una base de datos.

---

# 2. Decisiones que deben ser explícitas

| Decisión | Ejemplo del Día 12 | Riesgo si se omite |
|---|---|---|
| ubicación | `build/dia12/trabajos.txt` | depender del directorio actual sin saberlo |
| codificación | UTF-8 | caracteres distintos según plataforma |
| formato | cinco campos separados por `|` | archivo ambiguo o ilegible |
| modo de escritura | reemplazar todo | duplicar o borrar datos por accidente |
| política de errores | excepción propia con causa | perder el diagnóstico original |
| cierre | `try-with-resources` | recursos abiertos o escritura incompleta |
| validación | al crear y al reconstruir | objetos inválidos desde archivos corruptos |

---

# 3. API utilizada

## `Path`

Representa una ruta sin abrir el archivo.

```java
Path archivo = Path.of("build", "dia12", "trabajos.txt");
```

Es preferible componer segmentos a escribir separadores propios de un sistema operativo.

## `Files`

Ofrece operaciones de archivos y directorios.

```java
Files.createDirectories(archivo.getParent());
Files.exists(archivo);
Files.newBufferedWriter(archivo, StandardCharsets.UTF_8);
Files.newBufferedReader(archivo, StandardCharsets.UTF_8);
```

## Lectura y escritura con búfer

`BufferedWriter` y `BufferedReader` evitan operar carácter por carácter sobre el almacenamiento y brindan `write()`, `newLine()` y `readLine()`.

---

# 4. `try-with-resources`

```java
try (BufferedReader lector = Files.newBufferedReader(archivo, UTF_8)) {
    String linea;
    while ((linea = lector.readLine()) != null) {
        // procesar
    }
}
```

El recurso declarado entre paréntesis se cierra automáticamente al terminar el bloque, tanto en el camino normal como ante una excepción.

No es lo mismo que un `finally` escrito manualmente, aunque ambos persiguen la liberación de recursos. Para objetos `AutoCloseable`, `try-with-resources` es la opción clara y segura.

---

# 5. Excepciones involucradas

## `IOException`

Checked: una operación de entrada/salida puede fallar por ruta, permisos, dispositivo, espacio, archivo inexistente u otras condiciones externas. El compilador obliga a capturarla o declararla.

## Excepción propia

Representa el error con vocabulario del problema.

```java
class PersistenciaException extends Exception {
    PersistenciaException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
```

Beneficios:

- comunica una abstracción estable al código llamador;
- evita exponer detalles innecesarios de la implementación;
- conserva la causa para diagnóstico;
- permite cambiar archivo por otra tecnología con un contrato semejante.

## No perder la causa

Incorrecto:

```java
catch (IOException e) {
    throw new PersistenciaException("Falló");
}
```

Correcto:

```java
catch (IOException e) {
    throw new PersistenciaException("No se pudo guardar", e);
}
```

---

# 6. Flujo completo

```text
Files.newBufferedWriter(...)
→ puede lanzar IOException
→ RepositorioArchivo la captura
→ throw new PersistenciaException(..., causa)
→ el método declara throws PersistenciaException
→ la aplicación captura con catch
→ informa o recupera sin ocultar el problema
→ try-with-resources cierra el recurso
```

## Palabras clave

| Elemento | Función |
|---|---|
| `throw` | crea/lanzar una excepción concreta en ese punto |
| `throws` | declara en la firma que el método puede propagarla |
| `try` | delimita el código vigilado |
| `catch` | trata una excepción compatible |
| `finally` | ejecuta acciones finales al salir del flujo normal o excepcional |

Una excepción checked debe capturarse o declararse. Una unchecked no tiene esa obligación; no significa que falle siempre ni que deba ignorarse.

---

# 7. Formato del ejercicio

Cada línea representa un trabajo:

```text
id|descripcion|prioridad|estado|sector
```

Ejemplo:

```text
1|Revisar módem|2|PENDIENTE|1
```

Validaciones:

- cinco campos exactos;
- `id > 0`;
- descripción obligatoria y de hasta 120 caracteres;
- prioridad entre 1 y 5;
- estado obligatorio y de hasta 20 caracteres;
- sector positivo;
- texto sin `|`, `\n` ni `\r` para este formato simple.

Esta última regla es una limitación deliberada. En un formato real se debe definir escape, usar una biblioteca CSV o elegir JSON/otro formato.

---

# 8. Sobrescribir frente a agregar

## Reemplazar todo

```java
CREATE + TRUNCATE_EXISTING + WRITE
```

Útil cuando se reescribe el estado completo. Riesgo: una falla durante la escritura puede dejar contenido parcial.

## Agregar al final

```java
CREATE + APPEND
```

Útil para eventos o registros. Riesgo: duplicados y necesidad de reconstruir el estado.

La opción depende del modelo, no de una regla universal.

### Ampliación de robustez

Para datos críticos, se puede escribir primero en un archivo temporal, forzar validación y luego reemplazar el original. También deben diseñarse concurrencia, copias y recuperación. Esto es una ampliación; no forma parte del mínimo del ejercicio.

---

# 9. Dónde capturar

Regla práctica:

- capturar donde exista una acción útil;
- propagar cuando el método no pueda resolver el problema;
- traducir cuando se cruza un límite de abstracción;
- no usar `catch (Exception e) {}` vacío;
- no continuar como si se hubiera guardado cuando la escritura falló.

En el ejemplo, el repositorio traduce `IOException`; el borde de la aplicación decide qué mensaje mostrar.

---

# 10. Integración por capas

```text
presentación
→ servicio/aplicación
→ IRepositorioTrabajo
→ RepositorioArchivo
→ Path + Files
→ sistema de archivos
```

La clase de dominio no debería decidir la ruta ni abrir archivos. El repositorio no debería mostrar menús. Esta separación conserva SRP y DIP.

---

# 11. Pruebas mínimas

1. guardar una lista vacía;
2. guardar y recuperar dos trabajos;
3. leer cuando el archivo no existe;
4. detectar una línea con menos campos;
5. detectar prioridad fuera de rango;
6. detectar un entero inválido;
7. provocar una ruta no escribible y verificar la causa;
8. buscar un identificador inexistente;
9. comprobar UTF-8 con `módem`.

---

# 12. Errores frecuentes

1. Confundir archivo con objeto abierto.
2. Concatenar rutas con `"\\"` y perder portabilidad.
3. Omitir la codificación.
4. No cerrar lectores o escritores.
5. Capturar y silenciar una excepción.
6. lanzar una excepción nueva sin conservar la causa.
7. confiar en que cada línea externa es válida.
8. declarar `throws Exception` cuando se conoce un tipo más preciso.
9. mezclar menú, reglas del dominio y persistencia en la misma clase.
10. asumir que un formato separado por `|` admite ese carácter sin escape.

---

# 13. Preguntas de defensa oral

1. ¿Qué diferencia hay entre `Path` y `Files`?
2. ¿Qué problema resuelve `try-with-resources`?
3. ¿Por qué `IOException` es checked?
4. ¿Dónde se usa `throw` y dónde `throws`?
5. ¿Por qué crear `PersistenciaException` si ya existe `IOException`?
6. ¿Por qué debe conservarse la causa?
7. ¿Qué ocurre si una línea tiene prioridad 8?
8. ¿Qué cambia si el repositorio se implementa con SQLite?

---

# 14. Fuente y alcance

Excepciones propias y tratamiento con `try/catch`: material `INF382_Programacion_Orientada_a_Objetos.md`.
Manipulación con `Path`, `Files`, UTF-8, `try-with-resources`, formato y traducción de excepciones: ampliación complementaria del plan del Día 12.
