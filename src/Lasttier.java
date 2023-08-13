/**
 * Abstrakte Klasse Lasttier enthält eine Konstruktor.
 * Diese Klasse implementiert direkt Interface "tragbar".
 * Diese Klasse extends Haustier deswegen implementiert auch Interfaces "Streichbar","Laut".
 * @author  Sıdal Güray
 */
public abstract class Lasttier extends  Haustier implements  tragbar{
    /**
     * Konstruktor "Lasttier" enthält die Variablen und Informationen, die in Subklassen von Lasttier steht.
     * Das benutzt funktion "super()" für die Abholung der Information (name) von Klasse Haustier.
     * @param name Das ist Name von Lasttier.
     */
    public Lasttier(String name) {
        super(name);
    }

}
