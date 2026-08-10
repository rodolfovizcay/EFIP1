# Mini caso integrador — Semana 1
## Sistema web y móvil de Órdenes de Trabajo

Una cooperativa necesita un módulo para gestionar órdenes de trabajo.

- El Encargado crea y asigna una OT.
- El Operario consulta las OT asignadas desde un teléfono.
- El Operario puede iniciar y finalizar una OT.
- El servidor almacena la información en una base relacional.
- Los usuarios se conectan por LAN, Wi-Fi o red móvil.
- El equipo ya relevó los requisitos principales y está detallando casos de uso y definiendo una arquitectura estable antes de implementar el producto completo.

## Consignas

### 1. Análisis y Diseño

- Identificá la fase principal del PUD y justificá.
- Definí dos actores.
- Definí cuatro casos de uso.
- Escribí dos RF y dos RNF.

### 2. POO

Definí dos clases con:

- nombre;
- tres atributos;
- dos métodos.

Explicá estado, comportamiento, identidad y encapsulamiento en una de ellas.

### 3. Algoritmos y Estructuras

Elegí una estructura para organizar temporalmente las OT consultadas.

Usá:

```text
Requisito:
Estructura:
Justificación:
Alternativa descartada:
```

### 4. Base de Datos

Proponé dos relaciones bajo el supuesto de que una OT tiene un solo operario asignado actualmente.

Indicá:

- cabecera;
- clave primaria;
- clave foránea;
- grado;
- dominio de prioridad;
- dominio de estado.

Después explicá qué cambiaría si una OT pudiera tener varios operarios o historial de asignaciones.

### 5. Comunicaciones

Explicá el recorrido de “Consultar OT” desde el móvil al servidor usando:

- aplicación;
- transporte;
- red/Internet;
- enlace/acceso;
- física;
- encapsulamiento y desencapsulamiento;
- MAC, IP y puerto;
- switch y router.

## Producto esperado

Una respuesta integrada de 20 a 30 líneas más los esquemas necesarios.
