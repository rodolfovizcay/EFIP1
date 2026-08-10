# Lunes 10/8 — Día 5
## PUD + fundamentos de POO + modelo relacional

**Etapa:** primera jornada intensiva de vacaciones  
**Duración indicada por el plan:** 5,5 horas núcleo  
**Materias:** Análisis y Diseño + POO + Base de Datos  
**Modalidad:** teoría, recuperación activa, aplicación, Java breve y defensa oral

> Nota de planificación: los bloques detallados en el plan maestro suman 6 horas de actividad efectiva —90 + 90 + 30 + 90 + 60 minutos— aunque el encabezado los denomina “5,5 horas núcleo”. Para no alterar silenciosamente la fuente, esta guía conserva todos los bloques y considera los últimos 30 minutos como cierre/documentación ajustable según energía.

---

# 1. Resultado esperado

Al terminar la jornada deben existir las siguientes evidencias:

- explicación oral de modelo, metodología y PUD;
- explicación de clase, objeto, estado, comportamiento e identidad;
- clase Java breve con atributos privados, constructor y métodos públicos;
- descripción formal de una relación del modelo relacional;
- diferenciación de claves;
- tres fichas de una página;
- evaluación escrita;
- defensa oral;
- registro de errores;
- cierre diario.

---

# 2. Archivos del día

1. `RESUMENES/2026-08-10_RESUMEN-GUIADO-DIA-05.md`
2. `FICHAS/2026-08-10_FICHA-PUD.md`
3. `FICHAS/2026-08-10_FICHA-POO.md`
4. `FICHAS/2026-08-10_FICHA-MODELO-RELACIONAL.md`
5. `EVALUACIONES/2026-08-10_EVALUACION-DIA-05.md`
6. `EVALUACIONES/2026-08-10_RESPUESTAS-DIA-05.md`
7. `RESUMENES/2026-08-10_CIERRE-DIA-05.md`

---

# 3. Cronograma operativo

## Mañana

| Bloque | Duración | Actividad |
|---|---:|---|
| M1 — Análisis y Diseño | 90 min | 15 min de recuperación de Análisis y Diseño + 75 min de modelos, metodología y PUD |
| Pausa | 15 min | Descanso real |
| M2 — POO | 90 min | Objetos, clases, constructores y encapsulamiento |
| Cierre de mañana | 30 min | Explicar PUD y POO sin mirar |

## Tarde

| Bloque | Duración | Actividad |
|---|---:|---|
| T1 — Base de Datos | 90 min | Estructura tabular, reglas y claves |
| Pausa | 15 min | Descanso |
| T2.1 — Java | 15 min | Escribir y corregir una clase |
| T2.2 — Recuperación | 20 min | Veinte preguntas breves |
| T2.3 — Síntesis | 25 min | Fichas, evaluación o resumen diario |

---

# 4. Recuperación inicial de Análisis y Diseño — sin apuntes

Usar los primeros 15 minutos del bloque M1. Responder en una o dos oraciones:

1. ¿Qué es un modelo y para qué se utiliza?
2. ¿Qué diferencia existe entre arquitectura y documentación?
3. ¿Qué diferencia existe entre Construcción y Transición?
4. ¿Qué diferencia existe entre iteración e incremento?

Después verificar las fórmulas del resumen guiado. No estudiar todavía la respuesta extensa: primero intentar recordarla.

Las recuperaciones de POO, Base de Datos, Estructuras y Comunicaciones se realizan dentro de sus bloques o en las veinte preguntas del T2.

---

# 5. Bloque M1 — Análisis y Diseño

## 5.1 Estudio

Leer y explicar:

- definición y finalidad de un modelo;
- cuatro principios básicos del modelado;
- metodología, método, técnica y herramienta;
- comparación breve entre cascada, incremental, prototipado y espiral;
- definición del PUD;
- PUD dirigido por casos de uso;
- PUD centrado en la arquitectura;
- PUD iterativo e incremental;
- iteración frente a incremento;
- fases de Inicio, Elaboración, Construcción y Transición.

## 5.2 Aplicación

Tomar el proyecto SIGO u otro proyecto real y completar:

```text
Modelo utilizado:
Qué aspecto representa:
Nivel de detalle:
Decisión que documenta:

Caso de uso significativo:
Decisión arquitectónica relacionada:

Iteración elegida:
Incremento producido:
Riesgo tratado:
```

## 5.3 Control de salida

No pasar al siguiente bloque hasta poder responder:

- ¿Qué es un modelo?
- ¿Por qué un solo modelo no alcanza?
- ¿Qué organiza una metodología?
- ¿Por qué los casos de uso son el hilo conductor del PUD?
- ¿Qué significa que la arquitectura representa la forma?
- ¿Cuál es la diferencia entre repetir trabajo e incrementar el producto?

---

# 6. Bloque M2 — Programación Orientada a Objetos

## 6.1 Estudio

Dominar:

- paradigma orientado a objetos;
- objeto real o abstracto dentro del dominio;
- clase como plantilla o definición de un tipo;
- estado, comportamiento e identidad;
- atributos y métodos;
- constructor;
- instanciación mediante `new`;
- referencia `this`;
- encapsulamiento;
- modificadores `public`, `private`, `protected` y acceso por defecto.

## 6.2 Aplicación Java

Escribir sin copiar una clase `OrdenTrabajo` que tenga:

- `numero`;
- `descripcion`;
- `estado`;
- atributos privados;
- constructor con parámetros;
- uso de `this`;
- método de consulta;
- método que cambie el estado.

Luego comparar con el ejemplo del resumen guiado.

## 6.3 Explicación obligatoria

Responder oralmente:

> Una clase define la estructura y el comportamiento común; un objeto es una instancia concreta. Su estado está formado por los valores actuales de sus atributos, su comportamiento por los métodos y su identidad permite distinguirlo de otros objetos aun cuando tengan valores semejantes.

No memorizar solo la frase. Dar un ejemplo propio.

---

# 7. Cierre de mañana — 30 minutos

## Primera ronda — PUD, 5 minutos

Explicar sin mirar:

1. definición;
2. tres características;
3. iteración e incremento;
4. cuatro fases;
5. ejemplo del proyecto.

## Segunda ronda — POO, 5 minutos

Explicar sin mirar:

1. clase y objeto;
2. estado, comportamiento e identidad;
3. constructor;
4. encapsulamiento;
5. ejemplo Java.

## Corrección — 10 minutos

Marcar:

- concepto omitido;
- palabra académica imprecisa;
- ejemplo que no demuestra la definición;
- mezcla entre dos conceptos.

## Repetición — 10 minutos

Rehacer solamente los puntos fallados.

---

# 8. Bloque T1 — Base de Datos

## 8.1 Estudio

Dominar:

- relación;
- cabecera;
- cuerpo;
- tupla;
- atributo;
- dato;
- dominio;
- grado;
- cardinalidad;
- superclave;
- clave candidata;
- clave primaria;
- clave foránea.

## 8.2 Ejercicio principal

Usar:

```text
ORDEN_TRABAJO(
    id_ot,
    descripcion,
    prioridad,
    estado,
    id_sector
)
```

Suponer 250 filas y responder:

1. nombre de la relación;
2. cabecera;
3. cuerpo;
4. grado;
5. cardinalidad;
6. clave primaria probable;
7. clave foránea probable;
8. dominio de `prioridad`;
9. dominio de `estado`;
10. una tupla válida.

## 8.3 Regla de precisión

```text
Grado        = cantidad de atributos/columnas
Cardinalidad = cantidad de tuplas/filas
Dominio      = conjunto de valores permitidos
Candidata    = superclave mínima
Primaria     = candidata seleccionada
Foránea      = atributo/s que referencia/n una clave de otra relación
```

---

# 9. Bloque T2 — Sintaxis, recuperación y resumen

## 9.1 Java — 15 minutos

Reescribir la clase sin mirar y revisar:

- nombre de la clase con mayúscula inicial;
- tipos correctos;
- `String` con comillas dobles;
- constructor con el mismo nombre de la clase;
- `this` en minúsculas;
- punto y coma;
- llaves;
- método con tipo de retorno;
- comparación de cadenas con `.equals(...)` cuando corresponda.

## 9.2 Veinte preguntas — 20 minutos

Responder en una oración. Están incluidas en el resumen guiado.

Regla:

- máximo un minuto por pregunta;
- marcar `S` si se respondió seguro;
- marcar `D` si hubo duda;
- marcar `N` si no se respondió.

## 9.3 Síntesis — 25 minutos

Prioridad:

1. completar las tres fichas;
2. resolver la evaluación;
3. iniciar el cierre diario.

Si la energía no permite terminar todo, no dar el día por cerrado: dejar registrada la evidencia faltante.

---

# 10. Evaluación

Resolver:

`EVALUACIONES/2026-08-10_EVALUACION-DIA-05.md`

Condiciones:

- sin apuntes;
- tiempo máximo escrito: 45 minutos;
- no corregir durante la resolución;
- defensa oral de 8 a 10 minutos después del escrito;
- utilizar la rúbrica general del repositorio.

---

# 11. Criterio de aprobación

## Escrito

- 7/10 o más sobre los 8 puntos escritos equivalentes.
- Ningún bloque central completamente omitido.

## Oral

- 7/10 o más sobre los 2 puntos orales.
- Debe definir, aplicar y justificar.
- Debe diferenciar al menos tres pares de conceptos cercanos.

## Consolidación

Para considerar un tema `Aplicado`, no alcanza con reconocer la definición: debe utilizarse correctamente en el ejercicio.

---

# 12. Fuentes de la jornada

- `Analisis_y_Diseno_de_Software.md`
- `INF382_Programacion_Orientada_a_Objetos.md`
- `INF387_Base_de_Datos_I_RESUMEN.md`
- `02-PLAN-MAESTRO-HASTA-03-09.md`
- estado, matrices, resultados y errores de los Días 1 a 4.

No se incorporan contenidos externos como sustitución de las fuentes.

---

# 13. Comando de inicio

> **Iniciar EFIP — 2026-08-10 — Día 5**
