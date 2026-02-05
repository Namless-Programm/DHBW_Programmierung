# Vorlesung 3, 05.02

---
## Datenobjekte Sichtbarkeit
Datenobjekte sind nur sichtbar innerhalb der Methoden, müssen in der Klasse definiert werden für  übergreifende Sichtbarkeit.

- [D04_DataObjects](src/main/java/D04_DataObjects.java)

---
## Wertigkeit von Datentypen

- sehr gorße Long Werte, entsehen bei der Umwandlung in einen Float größere Error durch die Umwandlung. Da: long 8 byte und float 4 byte
- umgekehrte richtung keine Impliziete Umwandlung möglich. Muss bewusst gemacht werden, es gibt allerdings ggf. einen Informationsverlust

```mermaid
flowchart LR
    byte{{byte}}
    short{{short}}
    int{{int}}
    long{{long}}
    float[float|
    double[double]
    char(char)
    boolean[/boolean/]
    
    byte --> short
    short --> int
    char --> int
    int --> long
    long --> float
    float --> double
    boolean
```

- [D05_TypeCasting](src/main/java/D05_TypeCasting.java)

---
## Zeichenketten
- [D06_Strings](src/main/java/D06_Strings.java)

---

## Arithmetic Operators
**Grundrechenarten**
- Addition
- Subtraktion
- Multiplikation
- Ganzzahlige Division (Quotient) 
- Ganzzahlige Division (Divisionsrest)
- Division mit Casting zu Double
- Division mit Casting zu Float

**Inkrementieren**
**Dekrementieren**
**Postinkrement** **vs** **Preinkrement**
**Teilen** **durch** **Null**

- [D07_ArithmeticOperators](src/main/java/D07_ArithmeticOperators.java)

## Kalkulationen und Pseudo Zufallszahlen

- [D08_CalculationsAndPseudoRandomNumbers](src/main/java/D08_CalculationsAndPseudoRandomNumbers.java)

## Konsolen Eingaben
**Token**: ein zusammenhängender Bytestrom, welcher von einer Methode umgewandelt wird.

- [D09_ConsoleInput](src/main/java/D09_ConsoleInput.java)

## Konsolen Ausgaben
- **printf** nicht Klausurrelevant, aber extrapunkte durch schöne Benutzung möglich

- [D10_ConsoleOutputs](src/main/java/D10_ConsoleOutputs.java)

