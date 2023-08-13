/**
 * Abstrakte Klasse Haustier enthält eine Konstruktor, eine Variable und eine Getter.
 * Diese Klasse implementiert Interfaces "Lautbar" und "Streichbar".
 * @author  Sıdal Güray
 */
public abstract class Haustier implements Laut,Streichbar {
    /**
     * Das ist Variable "name" für alle Subklassen von Haustier.
     */
    private String name;

    /**
     * Konstruktor "Haustier" enthält name Informationen für alle Subklassen von Haustier.
     * @param name Das ist Name für alle Subklassen von Haustier.
     */
    public Haustier(String name) {
        this.name=name;
    }

    /**
     * Das ist getter Method für Variable name.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
