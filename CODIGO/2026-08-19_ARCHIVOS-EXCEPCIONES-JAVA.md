# Código guiado — Archivos y excepciones propias

**Fecha:** 19/08/2026
**Archivo ejecutable:** `CODIGO/DemoDia12.java`

---

# 1. Propósito

El ejemplo integra:

- objeto de dominio validado;
- colección `List<TrabajoPendiente>`;
- repositorio de archivo de texto;
- `Path`, `Files`, UTF-8 y búferes;
- `try-with-resources`;
- excepciones checked propias;
- traducción de `IOException` sin perder la causa;
- búsqueda que lanza `TrabajoNoEncontradoException`;
- tratamiento en el borde de la aplicación.

---

# 2. Compilar y ejecutar

Desde la raíz del repositorio:

```bash
java CODIGO/DemoDia12.java
```

Este modo compila el archivo fuente en memoria y lo ejecuta. Alternativamente, con un JDK que incluya `javac`:

```bash
javac -d /tmp/efip1-dia12 CODIGO/DemoDia12.java
java -cp /tmp/efip1-dia12 DemoDia12
```

El programa crea:

```text
build/dia12/trabajos.txt
```

Salida esperada:

```text
Recuperados: 2
1 | Revisar módem | prioridad 2 | PENDIENTE | sector 1
2 | Cambiar conector | prioridad 1 | ASIGNADO | sector 1
Error controlado: No existe el trabajo 99
Fin de la demostración.
```

---

# 3. Recorrido de una escritura correcta

```text
main crea objetos válidos
→ RepositorioArchivo.guardarTodos
→ crea el directorio si no existe
→ abre BufferedWriter en UTF-8
→ convierte cada objeto con aLinea()
→ escribe y agrega salto de línea
→ cierra el escritor automáticamente
```

---

# 4. Recorrido de una lectura correcta

```text
leerTodos
→ verifica existencia
→ abre BufferedReader en UTF-8
→ lee una línea
→ separa cinco campos
→ convierte enteros
→ vuelve a validar el dominio
→ agrega el objeto reconstruido
→ cierra el lector automáticamente
```

---

# 5. Recorridos excepcionales

## Formato inválido

```text
texto externo inválido
→ NumberFormatException o TrabajoInvalidoException
→ FormatoArchivoException con causa
→ se propaga hasta main
→ catch informa el problema
```

## Error físico de entrada/salida

```text
Files lanza IOException
→ repositorio captura
→ throw new PersistenciaException(mensaje, e)
→ main captura PersistenciaException
→ la causa original sigue disponible
```

## Búsqueda sin coincidencia

```text
buscarPorId recorre toda la lista
→ no encuentra id 99
→ throw new TrabajoNoEncontradoException(...)
→ catch específico muestra un resultado controlado
```

---

# 6. Actividad guiada

Antes de modificar el código, responder:

1. ¿Qué excepciones debe declarar el constructor?
2. ¿Qué método traduce `IOException`?
3. ¿Qué recurso cierra `try-with-resources`?
4. ¿Por qué `leerTodos()` devuelve una lista vacía si el archivo no existe?
5. ¿Por qué la prioridad vuelve a validarse al leer?
6. ¿Qué sucede después de capturar `TrabajoNoEncontradoException`?
7. ¿Se ejecuta el `finally`?

---

# 7. Experimentos

## Experimento A — Línea corrupta

Después de la primera ejecución, cambiar manualmente:

```text
1|Revisar módem|2|PENDIENTE|1
```

por:

```text
1|Revisar módem|8|PENDIENTE|1
```

Comentar temporalmente `guardarTodos(originales)` y ejecutar. Explicar por qué aparece `FormatoArchivoException` y cuál es su causa.

## Experimento B — Campo no numérico

```text
abc|Revisar módem|2|PENDIENTE|1
```

Identificar:

- excepción inicial;
- excepción de traducción;
- lugar de captura.

## Experimento C — Identificador existente

Cambiar:

```java
buscarPorId(recuperados, 99);
```

por:

```java
System.out.println(buscarPorId(recuperados, 1));
```

Predecir la salida y verificarla.

## Experimento D — Agregado al final

Investigar qué diferencia produce reemplazar `TRUNCATE_EXISTING` por `APPEND`. Explicar por qué repetir la ejecución generaría duplicados.

---

# 8. Preguntas de integración

1. ¿Qué clase cumple la responsabilidad de persistencia?
2. ¿Por qué `TrabajoPendiente` no conoce `Path`?
3. ¿Qué interfaz se podría extraer para aplicar DIP?
4. ¿Qué implementación alternativa podría realizarla?
5. ¿Qué componente contendría el repositorio?
6. ¿En qué nodo se desplegaría este código en la aplicación móvil?

Interfaz sugerida:

```java
interface IRepositorioTrabajo {
    void guardarTodos(List<TrabajoPendiente> trabajos)
            throws PersistenciaException;

    List<TrabajoPendiente> leerTodos()
            throws PersistenciaException, FormatoArchivoException;
}
```

---

# 9. Límite del ejemplo

Es deliberadamente didáctico. No resuelve todavía:

- acceso concurrente;
- escritura atómica;
- bloqueo del archivo;
- cifrado;
- migración de versiones del formato;
- duplicados por identificador;
- grandes volúmenes;
- sincronización con el servidor.

Esos límites deben reconocerse; no invalidan el objetivo de practicar archivos, validación y excepciones.
