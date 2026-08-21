# Guía de respuestas — Defensa del cierre intensivo

**No atribuir al estudiante.**

1. El requisito guía el diseño; clases/interfaces lo implementan; componentes se empaquetan en artefactos; artefactos se ejecutan en nodos; pruebas verifican el requisito.
2. Componente: módulo reemplazable; artefacto: archivo desplegable; nodo: entorno de ejecución.
3. Consecuencia segura ocurre por la decisión; riesgo es incierto. Ejemplo: pago mensual seguro y caída del proveedor posible.
4. SRP separa validar, persistir, sincronizar y mostrar; DIP hace depender la lógica de `IRepositorioTrabajo`.
5. `parseInt` puede lanzar `NumberFormatException`; el `catch` conserva `e` y lanza una excepción de formato con significado de dominio.
6. Porque mezcla razones de cambio y acopla presentación, dominio e infraestructura.
7. Mergesort estable habitual; Quicksort habitual no garantiza estabilidad.
8. Particiones desequilibradas elevan profundidad y pueden producir `O(n²)`.
9. Lista organiza nodos; pila LIFO; cola FIFO; iterador recorre sin exponer la representación y permite eliminación coordinada.
10. Asociativa representa una relación y suele contener FKs; débil depende de su propietaria para identificación.
11. `WHERE` filtra filas, `GROUP BY` forma grupos, `HAVING` filtra grupos.
12. El procedimiento inicia la operación; el trigger registra historial; ambos participan de la transacción; atomicidad exige todo o nada.
13. El paquete conserva IP origen/destino; cada enlace crea una trama con MAC locales. La primera MAC destino es la puerta de enlace.
14. `/26`: 64 direcciones y 62 hosts utilizables tradicionales.
15. Teléfono por HTTPS/VPN; firewall perimetral; API/reverse proxy en DMZ; aplicación y base en redes internas; la base no se publica.

Una respuesta alternativa es válida si mantiene precisión y justifica.
