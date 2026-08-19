# Resultados — Evaluación Día 12

## Implementación + Archivos Java + Enlace de datos

**Fecha:** 19/08/2026<br>
**Estado:** **APROBADO**<br>
**Puntaje:** **8,05/10**<br>
**Tiempo real:** no cronometrado

---

# 1. Resultado por parte

| Parte | Máximo | Obtenido |
|---|---:|---:|
| A — Implementación y despliegue | 3,00 | **2,30** |
| B — Java, archivos y excepciones | 3,00 | **2,50** |
| C — Enlace de datos | 3,00 | **2,25** |
| D — Defensa integradora | 1,00 | **1,00** |
| **Total** | **10,00** | **8,05** |

Se cumple el criterio de aprobación: total mayor o igual a `6,0/10` y ninguna de las partes A, B o C quedó en cero.

---

# 2. Parte A — Implementación y despliegue

**Resultado:** `2,30/3,00`

## Evidencia lograda

- diferencia entre vista de implementación y vista de despliegue;
- reconocimiento de interfaces, fuentes, artefactos y nodos;
- relación general diseño → código → componente/artefacto → nodo;
- decisión de infraestructura mediante alternativas, criterios, costo, riesgo y mitigación;
- aplicación de DIP y OCP al reemplazo de `RepositorioArchivo` por `RepositorioSQLite`.

## Precisión pendiente

- diferenciar con mayor rigor componente, subsistema y artefacto;
- clasificar cada elemento por tipo, además de indicar la vista correspondiente;
- expresar la cadena de trazabilidad con nombres concretos.

---

# 3. Parte B — Java, archivos y excepciones

**Resultado:** `2,50/3,00`

## Evidencia lograda

- `Path` representa una ruta y `Files` ofrece operaciones sobre archivos;
- lectura con `BufferedReader`, `readLine()` y control de `null`;
- UTF-8 explícito para interpretar caracteres de forma repetible;
- cierre automático mediante `try-with-resources`;
- excepción checked propia con constructores de mensaje y causa;
- distinción entre `throw` y `throws`;
- traducción de `NumberFormatException` a `FormatoArchivoException` conservando la causa;
- separación de responsabilidades entre dominio, persistencia y presentación.

## Precisión pendiente

- recordar la forma exacta `Files.newBufferedReader(archivo, StandardCharsets.UTF_8)`;
- escribir de manera autónoma un programa completo con archivos separados;
- evitar decir “implementar una excepción” cuando corresponde “capturarla o declararla”.

---

# 4. Parte C — Enlace de datos

**Resultado:** `2,25/3,00`

## Evidencia lograda

- estructura general `encabezado | datos | tráiler/FCS`;
- FCS como detección de errores mediante CRC;
- LLC como enlace hacia capa 3 y MAC como subcapa próxima a la capa física;
- Ethernet con direcciones MAC;
- aprendizaje del switch mediante MAC origen;
- consulta del destino, flooding y reenvío selectivo;
- tabla final `AA→P1`, `BB→P2`, `CC→P3`;
- función general de STP frente a enlaces redundantes.

## Precisión pendiente

- diferenciar HDLC, PPP y Ethernet sin apoyo;
- no llamar “enrutamiento físico” a la función de MAC;
- explicar que una trama Ethernet no posee TTL;
- diferenciar bucle de capa 2 y bucle de enrutamiento.

---

# 5. Parte D — Defensa integradora

**Resultado:** `1,00/1,00`

La defensa relacionó correctamente:

```text
clase UML
→ TrabajoPendiente.java
→ componente/artefacto móvil
→ teléfono
→ almacenamiento local
→ trama Ethernet y direcciones MAC
→ tabla MAC y puerto del switch
→ dirección IP y tabla de enrutamiento del router
```

También diferenció explícitamente:

- implementación = piezas y organización del software;
- despliegue = nodos donde se ejecuta;
- switch = capa 2, trama y MAC;
- router = capa 3, paquete e IP.

---

# 6. Decisión

```text
Nota final = 8,05/10
Estado = CERRADO Y APROBADO
Refuerzo selectivo = requerido, sin repetir la jornada completa
```

Los refuerzos inmediatos son HDLC/PPP/Ethernet, bucle L2 frente a bucle de routing y clasificación componente/subsistema/artefacto.
