# Evidencia de respuestas del estudiante — Día 12

**Fecha:** 19/08/2026<br>
**Finalidad:** preservar la evidencia real utilizada para la corrección.<br>
**Nota:** las respuestas modelo permanecen separadas y no se atribuyen al estudiante.

---

# 1. Recuperación inicial

**Resultado:** `10,5/12`

El estudiante diferenció implementación y despliegue, clasificó `aplicacion-movil.apk`, `IRepositorioTrabajo`, teléfono y servidor, explicó componente y nodo, recuperó excepciones checked/unchecked y respondió sobre switch, flooding y STP.

Error principal observado: una excepción unchecked fue presentada inicialmente como fallo asociado a una variable faltante, en lugar de señalar que solo falla si efectivamente ocurre y no es capturada.

---

# 2. Diseño, implementación y despliegue

Evidencia producida:

- `IRepositorioTrabajo` fue reconocido como interfaz de diseño;
- `.java`, `.jar` y `.apk` fueron relacionados con implementación;
- teléfono y servidores fueron reconocidos como nodos de despliegue;
- se construyó una trazabilidad desde diseño hacia código, artefacto y nodo;
- se compararon servidor propio e infraestructura contratada;
- se aplicaron DIP y OCP al cambio de repositorio local.

Correcciones necesarias:

- `TrabajoPendiente.java` es un artefacto fuente que materializa una clase, no un componente aislado;
- un paquete no es automáticamente un componente;
- el teléfono pertenece al despliegue, no al diseño.

---

# 3. Java, archivos y excepciones

Evidencia producida:

- significado de `Path`, `Files` y UTF-8;
- cierre de recursos con `try-with-resources`;
- `IOException` como checked;
- excepción propia para errores de formato;
- uso de `CREATE`, `TRUNCATE_EXISTING` y `APPEND`;
- necesidad de validar otra vez la información leída desde una fuente externa;
- conservación de la excepción original como causa.

Flujo recuperado:

```text
Integer.parseInt("ocho")
→ NumberFormatException
→ catch
→ throw new FormatoArchivoException("Prioridad inválida", e)
→ catch de la aplicación
```

La respuesta intermedia intentó volver a lanzar `NumberFormatException`; se corrigió para traducirla a la excepción propia de formato.

---

# 4. Enlace de datos

Evidencia producida:

- HDLC como referencia de control de enlace;
- PPP para enlaces punto a punto;
- Ethernet como tecnología principal de LAN;
- trama, LLC, MAC y FCS;
- switch como dispositivo de capa 2;
- simulación de aprendizaje y reenvío;
- STP como prevención lógica de ciclos;
- diferencia general entre tabla MAC, caché ARP y tabla de enrutamiento.

Recuperación de switch completada:

```text
A→C: aprende A→P1; C desconocida; flooding P2,P3,P4
C→A: aprende C→P3; A conocida; salida P1
A→C: actualiza A→P1; C conocida; salida P3
```

En la evaluación final quedaron incompletas la comparación HDLC/PPP/Ethernet y la diferencia entre bucle de capa 2 y bucle de enrutamiento.

---

# 5. Defensa integradora

Respuesta defendida:

> Una clase UML de SIGO se implementa como código, por ejemplo `TrabajoPendiente.java`, que integra un componente de la aplicación móvil. Ese componente se despliega y ejecuta en el nodo teléfono, donde puede utilizar almacenamiento local. Al sincronizar, los datos se encapsulan; en capa 2 viajan en una trama con direcciones MAC. El switch consulta su tabla MAC para decidir el puerto de salida. Cuando los datos deben pasar a otra red, el router utiliza la dirección IP de destino y su tabla de enrutamiento. La implementación describe qué piezas de software existen; el despliegue indica en qué nodos se ejecutan. El switch trabaja principalmente con MAC en capa 2 y el router con IP en capa 3.

La defensa fue considerada completa para el alcance solicitado.
