# Caso integrador — Implementación, archivos y Ethernet

**Fecha:** 19/08/2026
**Caso:** SIGO — gestión móvil de trabajos
**Estado:** actividad preparada

---

# 1. Escenario

Una empresa de mantenimiento utiliza SIGO. Cada operario recibe trabajos en un teléfono y debe poder registrar cambios aunque no tenga conexión.

La solución propuesta posee:

- aplicación móvil;
- modelo `TrabajoPendiente`;
- contrato `IRepositorioTrabajo`;
- repositorio local basado en un archivo de texto UTF-8;
- subsistema de sincronización;
- servicio backend;
- base de datos central;
- tres switches con enlaces redundantes en la oficina;
- un router que comunica la LAN con la red del proveedor.

El archivo local usa:

```text
id|descripcion|prioridad|estado|sector
```

Ejemplo:

```text
104|Revisar módem|2|PENDIENTE|1
```

La organización todavía debe decidir si alojará el backend en un servidor propio o en infraestructura contratada.

---

# 2. Parte A — Modelo de implementación

## A1. Clasificación

Clasificá cada elemento como clase/interfaz, subsistema, componente/artefacto, nodo o conexión:

```text
TrabajoPendiente
IRepositorioTrabajo
RepositorioArchivo
paquete sigo.persistencia
persistencia-local.jar
aplicacion-movil.apk
telefono-operario-07
backend-api.jar
servidor-aplicaciones
servidor-base-datos
trabajos.txt
LAN Ethernet
```

## A2. Trazabilidad

Completá:

| Requisito/caso | Diseño | Código | Componente/artefacto | Nodo |
|---|---|---|---|---|
| registrar sin conexión | | | | |
| guardar localmente | | | | |
| sincronizar al recuperar red | | | | |

## A3. Diagramas

Dibujá:

1. un diagrama de componentes con interfaces y dependencias;
2. un diagrama de despliegue con artefactos dentro de nodos;
3. una conexión rotulada entre teléfono y backend;
4. una conexión rotulada entre backend y base.

## A4. Cambio

Se reemplaza `RepositorioArchivo` por `RepositorioSQLite` sin modificar `AgendaTrabajos`.

Explicá:

- qué pieza cambia;
- qué contrato permanece;
- qué vista se modifica;
- qué principios o propiedades se aprovechan;
- si necesariamente cambia el nodo.

---

# 3. Parte B — Decisión de infraestructura

## Contexto

SIGO necesita disponibilidad fuera del horario de oficina, acceso de operarios móviles, copias verificables y recuperación frente a fallas. La empresa posee un técnico generalista, pero no guardia permanente de infraestructura.

## Actividad

Redactá una decisión con:

```text
problema
RNF
alternativa servidor propio
alternativa infraestructura contratada
opción elegida
justificación por criterios
dos consecuencias positivas
dos costos o consecuencias negativas seguras
dos riesgos posibles
una mitigación por riesgo
artefactos afectados
```

No se califica qué opción elegís, sino la coherencia entre contexto, criterios, consecuencias y riesgos.

---

# 4. Parte C — Archivo y excepciones

## C1. Contrato

Escribí una interfaz mínima:

```java
interface IRepositorioTrabajo {
    // guardar todos
    // leer todos
}
```

Usá excepciones con nombres del dominio de persistencia.

## C2. Validaciones

Indicá qué validarías en Java al construir un trabajo y qué volverías a validar al leer una línea externa.

## C3. Flujo exitoso

Ordená:

```text
abrir lector
reconstruir objeto
validar
leer línea
cerrar recurso
separar campos
agregar a la lista
```

## C4. Flujo excepcional

La línea es:

```text
104|Revisar módem|ocho|PENDIENTE|1
```

Explicá:

1. qué operación falla primero;
2. qué excepción de Java puede aparecer;
3. qué excepción propia debería salir del conversor;
4. dónde conviene capturarla;
5. si debe conservarse la causa.

## C5. Entrada/salida

`Files.newBufferedWriter(...)` lanza `IOException`.

Completá el recorrido:

```text
IOException
→ catch en __________________
→ throw new __________________(mensaje, causa)
→ throws en __________________
→ catch final en __________________
```

## C6. Recursos

¿Por qué usarías `try-with-resources` y UTF-8 explícito?

---

# 5. Parte D — Protocolos y trama

## D1. Comparación

Completá:

| Elemento | Capa/ámbito | Uso principal | Concepto distintivo |
|---|---|---|---|
| HDLC | | | |
| PPP | | | |
| Ethernet | | | |

## D2. Trama

Representá una trama general y una Ethernet ampliada. Indicá:

- dónde está la MAC origen;
- dónde está la MAC destino;
- qué se encapsula en datos;
- qué función cumple FCS;
- qué se transmite físicamente por el cable.

## D3. Subcapas

Diferenciá LLC y MAC en no más de cuatro líneas cada una.

---

# 6. Parte E — Switch y tabla MAC

Topología:

```text
P1 — Teléfono A / MAC AA
P2 — PC B       / MAC BB
P3 — Servidor C / MAC CC
P4 — Switch 2
```

La tabla comienza vacía. Procesá:

1. A envía una trama a B;
2. B responde a A;
3. C envía a A;
4. A envía nuevamente a B;
5. B emite un broadcast.

Completá una fila por paso:

| Paso | Entrada | Aprendizaje | Consulta destino | Acción | Salida(s) |
|---:|---|---|---|---|---|
| 1 | | | | | |
| 2 | | | | | |
| 3 | | | | | |
| 4 | | | | | |
| 5 | | | | | |

Después explicá:

- por qué el switch no aprende usando la MAC destino;
- qué ocurre si una entrada dinámica envejece;
- qué diferencia existe entre tabla MAC, ARP y routing.

---

# 7. Parte F — Redundancia y STP

Tres switches forman un triángulo físico.

1. ¿Qué ventaja buscaba la redundancia?
2. ¿Qué problema aparece si los tres enlaces reenvían sin control?
3. ¿Por qué una trama puede seguir circulando?
4. Nombrá tres consecuencias observables.
5. ¿Qué hace STP conceptualmente?
6. ¿STP elimina el enlace redundante?
7. ¿Qué ocurre después de una falla del camino activo?
8. Diferenciá este problema de un bucle de enrutamiento.

---

# 8. Parte G — Defensa integradora

Prepará una explicación oral de tres minutos:

```text
caso de uso sin conexión
→ clase e interfaz de diseño
→ repositorio y componente
→ archivo local y excepción
→ artefacto móvil en teléfono
→ trama Ethernet
→ aprendizaje MAC del switch
→ salida hacia router/backend
→ redundancia controlada por STP
```

Debe aparecer al menos una decisión de diseño, una de implementación, una de despliegue y una de comunicaciones.

---

# 9. Lista de autocontrol

- [ ] No confundí clase con componente.
- [ ] No confundí artefacto con nodo.
- [ ] Comparé al menos dos alternativas de infraestructura.
- [ ] Conservé la causa de la excepción.
- [ ] Distinguí `throw` de `throws`.
- [ ] Expliqué qué cierra `try-with-resources`.
- [ ] No dije que el cable transporta objetos o paquetes literalmente.
- [ ] El switch aprendió por origen.
- [ ] La decisión usó destino.
- [ ] La inundación excluyó el puerto de entrada.
- [ ] Expliqué el problema que STP resuelve.
- [ ] Diferencié tabla MAC y tabla de routing.

---

# 10. Criterios de revisión

Una solución sólida debe ser coherente de extremo a extremo. No alcanza con nombrar tecnologías: cada una debe estar asociada a una responsabilidad, un artefacto, un nodo o una decisión concreta.
