# Ficha de estudio — Modelo relacional

## Estructura tabular

| Concepto | Definición |
|---|---|
| Relación | Representación bidimensional constituida por filas y columnas |
| Cabecera | Conjunto de atributos |
| Cuerpo | Conjunto de tuplas |
| Tupla | Fila que representa un hecho o una instancia |
| Atributo | Columna o propiedad |
| Dato | Valor indivisible almacenado en la intersección de una fila y una columna |
| Dominio | Conjunto de valores permitidos para un atributo |
| Grado | Cantidad de atributos/columnas |
| Cardinalidad | Cantidad de tuplas/filas |

## Claves

| Clave | Definición |
|---|---|
| Superclave | Conjunto de uno o más atributos que identifica unívocamente una tupla |
| Candidata | Superclave mínima: no contiene atributos innecesarios para identificar |
| Primaria | Clave candidata elegida como identificación principal |
| Foránea | Atributo o conjunto de atributos que referencia una clave de otra relación |

## Ejemplo

```text
ORDEN_TRABAJO(
    id_ot,
    descripcion,
    prioridad,
    estado,
    id_sector
)
```

Si contiene 250 filas:

```text
Relación:     ORDEN_TRABAJO
Cabecera:     id_ot, descripcion, prioridad, estado, id_sector
Grado:        5
Cardinalidad: 250
Primaria:     id_ot
Foránea:      id_sector → SECTOR
```

Dominios posibles:

```text
prioridad ∈ {BAJA, MEDIA, ALTA}
estado    ∈ conjunto de estados permitidos por el sistema
```

## Control

- [ ] No confundo grado con cardinalidad.
- [ ] Defino dominio como tipo más restricciones o valores permitidos.
- [ ] Digo que candidata es una superclave mínima.
- [ ] Indico qué relación es referenciada por la clave foránea.
- [ ] Puedo construir una tupla válida.
