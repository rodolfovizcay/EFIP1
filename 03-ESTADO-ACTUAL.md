# Estado actual — EFIP I

**Fecha académica registrada:** 10 de agosto de 2026  
**Jornada:** Día 5 — PUD + fundamentos de POO + modelo relacional — CERRADO  
**Modalidad evaluada:** escrita/integrada + defensa oral  
**Próxima acción:** preparar el Día 6 del 11/08/2026 con Requisitos + Pilas + recuperación OSI/TCP-IP.

## Resultado acumulado

| Materia | Diagnóstico Día 1 | Última evidencia | Estado actual |
|---|---:|---:|---|
| Análisis y Diseño | 4,75/10 | Día 5: evaluación integrada 9,0/10 + oral 9,0/10 | PUD aplicado y defendible en el núcleo trabajado |
| Programación Orientada a Objetos | 5,5/10 | Día 5: evaluación integrada 9,0/10 + oral 9,0/10 | Fundamentos aplicados y defendibles; Java básico en consolidación |
| Algoritmos y Estructuras | 7/10 | Día 3: 8,3/10 global; TDA recuperado en Día 5 | Aplicado en contenidos básicos; TDA comprendido con recuperación futura |
| Base de Datos | 6/10 | Día 5: evaluación integrada 9,0/10 + oral 9,0/10 | Modelo relacional y claves aplicados y defendibles |
| Comunicaciones | 4,75/10 | Día 4: 8,6/10 escrito + recuperaciones Día 5 | Comprendido; PDU, puerto y síncrona/asíncrona corregidos |

> Las notas del Día 5 corresponden a una evaluación integrada de Análisis y Diseño, POO y Base de Datos con recuperación transversal. No deben interpretarse como tres exámenes independientes de 9,0/10.

## Resultado del Día 5

- Evaluación escrita/integrada: **9,0/10**.
- Defensa oral: **9,0/10**.
- Resultado global: **9,0/10 — APROBADO**.
- Materias principales: **Análisis y Diseño + POO + Base de Datos**.
- Recuperación transversal: **TDA, sobrecarga/sobrescritura, PDU, puerto y síncrona/asíncrona**.

## Avances confirmados

### Análisis y Diseño

- Modelo y finalidad del modelado.
- Metodología, método, técnica y herramienta.
- PUD dirigido por casos de uso.
- PUD centrado en la arquitectura.
- PUD iterativo e incremental.
- Iteración frente a incremento.
- Inicio, Elaboración, Construcción y Transición.
- Aplicación del PUD al caso `Programar Orden de Trabajo`.
- Uso de riesgos para seleccionar contenido de una iteración.

### Programación Orientada a Objetos

- Clase frente a objeto.
- Estado, comportamiento e identidad.
- Identidad diferenciada de un simple ID.
- Encapsulamiento y atributos privados.
- Constructor y referencia `this`.
- Clase Java breve `OrdenTrabajo` con validación de prioridad y cambio de estado.
- Sobrecarga frente a sobrescritura recuperadas conceptualmente.

### Base de Datos

- Relación, tupla, atributo, cabecera y dominio.
- Grado frente a cardinalidad.
- Superclave.
- Clave candidata como superclave mínima.
- Clave primaria como candidata seleccionada.
- Clave foránea y repetición válida del lado N de una relación 1:N.
- Aplicación `SECTOR 1:N ORDEN_TRABAJO`.

### Recuperaciones transversales

- TDA: datos/objetos + operaciones mediante una interfaz independiente de implementación; requiere nueva recuperación espaciada.
- Sobrecarga/sobrescritura: recuperado con ejemplos.
- PDU: Unidad de Datos de Protocolo; se corrigió la confusión con PUD y queda pendiente comprobar retención espaciada.
- Puerto: identificador de proceso/servicio de transporte dentro de un host.
- Síncrona/asíncrona: `bloque + cabecera/terminación` frente a `carácter + start/stop`; corregido, pendiente de retención espaciada.

## Ajustes detectados durante el Día 5

1. Un constructor Java debe tener el mismo nombre de la clase y no declarar tipo de retorno.
2. `this.numero = numero`: `this.numero` es el atributo del objeto actual y `numero` el parámetro recibido.
3. Una superclave puede tener uno o más atributos; una clave candidata es una superclave mínima.
4. Elegir una clave primaria no hace que las demás claves candidatas dejen de ser candidatas.
5. Una clave foránea puede repetirse; es el comportamiento normal en relaciones 1:N.
6. Dominio significa conjunto de valores permitidos, no solo los valores actualmente observados.
7. Las fases del PUD no deben confundirse con los flujos de trabajo. Las fases son Inicio, Elaboración, Construcción y Transición; los flujos incluyen Requisitos, Análisis, Diseño, Implementación y Prueba.
8. Cada iteración produce un incremento; un ciclo completo del PUD concluye con una nueva versión del producto.
9. Arquitectura no es simplemente una colección de requisitos: los RNF condicionan decisiones arquitectónicas, pero RNF y arquitectura no son lo mismo.

## Pendientes abiertos prioritarios

1. Relaciones UML: asociación, agregación, composición y dependencia.
2. Precisión de sintaxis Java escrita, especialmente constructores.
3. TDA: volver a exigir explícitamente interfaz independiente de implementación sin ayuda.
4. PDU: recuperar nuevamente `PDU = datos + información de control del protocolo`.
5. Síncrona/asíncrona: comprobar retención en una jornada posterior.
6. TCP/IP como arquitectura/pila, funciones de capa frente a funciones de dispositivo y unidades de switch/router.
7. Continuar con los contenidos oficiales todavía no recorridos según el plan maestro.

## Criterio de cierre

El Día 5 se considera **CERRADO Y APROBADO**.

Los estados `Defendible oralmente` se aplican únicamente a los núcleos efectivamente defendidos durante esta jornada, no a la totalidad de cada asignatura.
