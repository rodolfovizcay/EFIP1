# Matriz de progreso parcial — Día 9

**Fecha:** 14/08/2026  
**Estado:** jornada pausada; evaluación pendiente

Estados utilizados:

- `NI` = No iniciado
- `EA` = En aprendizaje
- `C` = Comprendido
- `A` = Aplicado
- `DO` = Defendible oralmente

> Esta matriz es provisional. No sustituye `04-MATRIZ-DE-PROGRESO.md` hasta completar la evaluación del Día 9.

---

# 1. Análisis y Diseño

| Tema | Estado previo | Evidencia del Día 9 | Estado parcial propuesto |
|---|---|---|---|
| Propósito del diseño | NI | explicó diseño como plano próximo a implementación | A parcial |
| Análisis vs. diseño | NI/EA | diferenciación correcta | A parcial |
| Diseño vs. implementación | NI/EA | cadena requisitos→análisis→diseño→implementación | C/A |
| Clase de diseño | NI | reconoció servicios/repositorios como elementos de diseño | C/A |
| Realización de caso de uso–diseño | NI | secuencia normal aplicada | C/A |
| Participante | NI | actor, servicio, repositorio o subsistema | C |
| Línea de vida | NI | definición inicial imprecisa, luego corregida | C |
| Mensaje | NI | solicitudes/respuestas entre participantes | A parcial |
| Foco de control | NI | “trabajo activo”, ajustado a intervalo de ejecución | C |
| Orden temporal | NI | secuencia resuelta correctamente | A |
| Alternativo sin conexión | A con error activo | formulado; faltó explicitar inicialmente `Sincronizador` | C/A |
| Cola como decisión de diseño | NI | FIFO necesidad; Cola solución | A parcial |
| Diagrama de estados | NI | no realizado por el estudiante | NI |
| Estado/evento/transición | NI/EA | introducido, sin control propio | EA |
| Subsistema de diseño | NI | reconocido, falta aplicación | C |
| Interfaz de diseño | NI/EA | contrato vs. implementación introducido | C |
| Arquitectura del diseño | NI/EA | no evaluada todavía | EA |

---

# 2. POO / Java

| Tema | Estado previo | Evidencia del Día 9 | Estado parcial propuesto |
|---|---|---|---|
| Abstracción | NI | definición y ejemplo `CanalNotificacion` | A parcial |
| Abstracción vs. encapsulamiento | NI/EA | diferenciación correcta | A |
| Clase abstracta | C diagnóstico | escrita y explicada | A parcial |
| Método abstracto | C diagnóstico | `enviar()` clasificado y escrito | A |
| Constructor de abstracta | NI | comprendió inicialización común | C/A |
| Método concreto heredado | NI/EA | `getTipo()` correctamente clasificado | A |
| Interfaz | C | `Auditable` escrita | A parcial |
| `extends` | A | aplicado | A |
| `implements` | NI | aplicado | A parcial |
| Abstracta vs. interfaz | NI/EA | estado/constructor/contrato diferenciados con ajustes | C/A |
| Polimorfismo | EA | referencia común y objetos concretos explicados | A parcial |
| Referencia general/objeto real | NI/EA | `CanalNotificacion` vs. Email/Móvil | A |
| Sobrescritura | A | comportamiento por canal | A |
| `toString()` | EA/error activo | concepto corregido; omitido en código entregado | EA/A parcial |
| Comparación de `String` | NI | error `== ""` detectado | EA |
| Validación | NI/EA | método no detiene envío | EA |
| `@Override` | EA | omitido en código | EA |
| Organización de archivos Java | EA | varias clases públicas en un archivo | EA |
| Prueba polimórfica | NI/EA | explicada, no incluida en código propio | C |
| Código Java breve | A | estructura general correcta con errores específicos | A parcial |

---

# 3. Base de Datos

| Tema | Estado previo | Evidencia del Día 9 | Estado parcial propuesto |
|---|---|---|---|
| Propósito de normalización | EA | reducción de redundancia y anomalías | A |
| Anomalía de inserción | NI/EA | clasificada correctamente | A |
| Anomalía de modificación | NI/EA | clasificada correctamente | A |
| Anomalía de borrado | NI/EA | clasificada correctamente | A |
| Dependencia funcional | NI/EA | aplicada en ejercicio | C/A |
| 1FN | EA | teléfonos multivaluados separados | A |
| Valores atómicos | A parcial | correctos | A |
| Grupos repetitivos | EA | identificados | A |
| Tabla de teléfonos | NI/EA | PK compuesta y FK correctas | A |
| 2FN | EA | primer intento incorrecto, recuperación posterior | C/A |
| Dependencia parcial | NI/EA | datos de OT/Operario corregidos | C/A |
| Clave completa de asignación | NI/EA | `estado_asignacion` identificado después de corrección | C |
| 3FN | EA | dependencia transitiva correcta | A |
| Dependencia transitiva | NI/EA | `id_ot→id_sector→nombre_sector` | A |
| Descomposición final | NI/EA | cinco relaciones propuestas | A parcial |
| PK/FK | A/C | correctamente ubicadas | A |
| `UNIQUE` | C | agregado en corrección | C/A |
| ID artificial | NI | conclusión correcta, razón inicial incorrecta | C |
| Reconstrucción mediante JOIN | NI | no practicada durante la jornada | NI/EA |

---

# 4. Recuperaciones activas

| Código canónico | Tema | Evidencia Día 9 | Estado provisional |
|---|---|---|---|
| E-038 | línea doble DER | respuesta correcta | candidato a corregido/consolidado según evaluación |
| E-040 | alternativo/caso exacto | comprendido con vocabulario pendiente | parcial |
| E-041 | contrato TDA | correcto | candidato a corregido |
| E-042 | Pila/Cola/trazabilidad | Pila/Cola correctas; trazabilidad ajustada | parcial |
| E-043 | información/fórmula | relación correcta; fórmula volvió a fallar | abierto |
| E-044 | señales/fórmulas | fórmulas correctas; unidad omitida | parcial |
| E-045 | transmisión/política | comprendido; supuesto ajustado | parcial |
| E-036 | generalización UML | dirección correcta; “triángulo vacío” no automatizado | corregido parcial |
| E-037 | instancia | correcta | candidato a consolidado |
| E-039 | asociativa/débil | diferencia comprendida con precisión pendiente | parcial |
| E-016 | `toString()`/Java | concepto parcial; código incompleto | abierto |

---

# 5. Productos

| Producto | Archivo preparado | Evidencia del estudiante | Estado parcial |
|---|:---:|---|---|
| Diagrama de secuencia | sí | orden temporal y alternativo parcial | incompleto |
| Ejemplo polimórfico | sí | código propio parcial | incompleto |
| Normalización | sí | 1FN–3FN aplicadas | avanzado |
| Caso integrador | sí | no resuelto | pendiente |
| Evaluación | sí | no respondida | pendiente |
| Defensa | preparada | no realizada | pendiente |

---

# 6. Decisión

No actualizar la matriz canónica hasta completar:

```text
caso integrador
+ evaluación escrita
+ defensa oral
+ corrección final
```
