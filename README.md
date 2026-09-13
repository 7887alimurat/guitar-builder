# Guitar Builder

## Product
A guitar is a complex object with mandatory (body type, number of strings, neck and body wood) and optional (color, presence of a pickguard, case) characteristics. A guitar is well‑suited to the Builder role because:
- the actual assembly of a guitar proceeds step by step (body → neck → hardware → finish);
- different body types (solid / hollow / acoustic) provide qualitatively different representations of the same assembly process — for example, acoustics, in principle,  cannot have electric pickups.

## Pattern Components
- `Guitar` — Product
- `GuitarBuilder` — Builder (fluent API, validate inbuild())
- `GuitarDirector` — Director (ready-made presets: Stratocaster-style, Acoustic
  Dreadnought, Metal guitar)
- `Main` — Client

## Clean Code
No magic numbers / strings
Will be: if (strings != 4 && strings != 6 && strings != 7 ...)
has become: ALLOWED_STRING_COUNTS.contains(numberOfStrings) with one constant.
The number of options and the values themselves are stored in one place, making it easy to change.
