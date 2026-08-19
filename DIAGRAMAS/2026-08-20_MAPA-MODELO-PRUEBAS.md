# Mapa — Del requisito al resultado de prueba

**Fecha:** 20/08/2026

---

# 1. Trazabilidad principal

```text
NECESIDAD DEL OPERARIO
"registrar trabajos sin conexión"
            │
            ▼
REQUISITO / CASO DE USO
precondiciones + flujo + resultado esperado
            │
            ▼
DISEÑO
ServicioRegistro + IRepositorioTrabajo
            │
            ▼
IMPLEMENTACIÓN
ServicioRegistro.java + RepositorioSQLite.java
            │
            ▼
CONSTRUCCIÓN EJECUTABLE
aplicacion-movil.apk
            │
            ▼
MODELO DE PRUEBAS
plan + casos + procedimientos + componentes
            │
            ▼
EJECUCIÓN
resultado obtenido ↔ resultado esperado
      │                         │
      │ coincide                │ no coincide
      ▼                         ▼
  APROBADO                   DEFECTO
                                │
                                ▼
                       corregir + confirmar
                                │
                                ▼
                         prueba de regresión
```

---

# 2. Qué, cómo y automatización

```text
CASO DE PRUEBA
qué condición comprobar
qué datos usar
qué resultado esperar
        │
        ▼
PROCEDIMIENTO DE PRUEBA
cómo preparar el entorno
cómo introducir los datos
qué pasos ejecutar
qué observar
        │
        ▼
COMPONENTE DE PRUEBA
código/herramienta que automatiza
uno o más pasos o procedimientos
```

---

# 3. Niveles encadenados

```text
UNIDAD
método/clase aislada
        ↓
INTEGRACIÓN
colaboración entre unidades
        ↓
SISTEMA
producto completo y entorno
        ↓
ACEPTACIÓN
necesidad del cliente/usuario
```

Una prueba de nivel superior no elimina la necesidad de las anteriores: responde una pregunta diferente.

---

# 4. Caso SIGO resumido

| Nivel | Entrada/acción | Resultado esperado |
|---|---|---|
| unidad | prioridad `6` | rechazo mediante validación |
| integración | servicio guarda usando repositorio | repositorio recibe trabajo válido |
| sistema | registrar sin red y reiniciar | trabajo continúa disponible localmente |
| aceptación | operario completa recorrido real | puede continuar trabajando sin conexión |
