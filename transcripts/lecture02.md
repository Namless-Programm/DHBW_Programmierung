# Vorlesung 2, 03.02

---

## Namenskonventionen
__Klassen__ : Pascal Case (z.B. MainClass, FirstNameAndLastName)
__Datenobjektive__  und  __Methoden__ : Camel Case (firstName, getFirstName())
__Konstanten__ : Snake Case (z.B. FIRST_NAME_AND_LAST_NAME)
JavaFX: CSS-Eigenschaften (font family) : Kebab Case (nicht relevant für WI)

Sprechende Bezeichner benutzen.

---

## Kommentare
// für ganze Zeile
/* ... */ für Mehrzeilige Kommentare

<ins>Guter Code braucht keine Kommentare!</ins>

---

## Dokumentation
Methoden sollten Dukumentiert werden, hier zu beachten. Was macht die Methode? __NICHT__ __Wie__ __!__

---

## Statische Methoden
__Void__ = Methode gibt keinen Wert zurück
__Import__ __Parameter__ = In Klammer nach namen, Mit Typ angabe für Import Parameter

---

## Parameter und Rückgabewerte bei Methoden
Für Rückgabewerte statt void Datentyp des Rückgabewertes angeben.
was zurückgegeben wird wird im Code mit " __return__ x; " angegeben.

Parameter können angeben werden, Methode kann aber auch nur Returning Parameter haben ohne Input.

Klassen die ich verwenden möchte, muss ich importieren. Passiert in den Meisten umgebungen automatisch, nach dem . oder über Quickfix.
__Für__ __Klausur__ : Keine Imports müssen gelernt sein.

Es gibt ausnahmen, welche nicht direkt importiert werden müssen, z.B: Java.lang 

---

## Gestaltungsprinzipien
__DRY__ : Don't repeat yourself

---

## Datenobjekte
Kontainer in dem ein Objekt gespeichert werden kann.

| Datentyp  | Größe  | Datentypklasse |
| ----------| ------ | -------------- |
| byte      | 1 byte | GZ             |
| short     | 2 Byte | GZ             |
| INT       | 4 byte | GZ             |
| long      | 8 Byte | GZ             |
| float     | 4 Byte | GKZ            |
| double    | 8 Byte | GZ             |
| char      | 2 byte | Z              |
| boolean   | -      | true           |

---

## Negative Binärzahlen
In der Regel wird in der Programmierung das MSB geopfert um es zu einem Vorzeichenbit zu machen.

---

## UNterschied Deklaration Initialisierung
__Deklaration__ : Bekanntgabe von Datentyp und Bezwichner im Programm
__Initialisierung__ : Erstmalige Wertzuweisung

---
