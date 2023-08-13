/**
 * Abstrakte Klasse Jagdtier enthält eine Konstruktor.
 * Diese Klasse implementiert direkt Interface "Jagbar".
 * Diese Klasse extends Haustier deswegen implementiert auch Interfaces "Streichbar","Laut".
 * @author  Sıdal Güray
 */
public abstract class Jagdtier extends Haustier implements Jagbar {
    /**
     * Konstruktor "Jagdtier" enthält die Variablen und Informationen, die in beiden Klassen (Katze und Hunde) steht.
     * Das benutzt funktion "super()" für die Abholung der Information (name) von Klasse Haustier.
     * @param name Das ist Name von Jagdtiere.
     */
    public Jagdtier(String name) {
        super(name);
    }
}
