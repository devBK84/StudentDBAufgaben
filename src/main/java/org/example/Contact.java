package org.example;
/*
Erstelle eine Klasse Frienddie von der KlasseContact` erbt.
Zusätzlich soll die Klasse das Attribut:
Telefonnummer und die Methoden:
einen leeren/default Konstruktor und einen Konstruktor mit dem Namen und der Telefonnummer haben.
die toString() Methode soll den Namen und die Telefonnummer zurückgeben.
 */


public abstract class Contact {
    /*
    Erstelle ein Interface Radio mit den Funktionen:

    - startRadio()`
    - stopRadio()`
    Erstelle ein Interface GPS mit der Funktion:

    getPosition()`
     */
    private String name;

    public Contact() {}

    public Contact(String name) {this.name = name;}

    public String getName() {
        return name;
    }
}
