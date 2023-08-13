/**
 * Klasse Katze enthält eine Variable, Konstruktor, Methoden und ein toString.
 * Diese Klasse extends Jagdtier deswegen implements Interface "Jagbar".
 * Klasse Jagdtier extends Haustier deswegen implementiert es Interfaces "Streichbar","Laut".
 * @author  Sıdal Güray
 */
public class Katze extends Jagdtier {

    /**
     * Das ist die Variable für die Chipnummer der Katze.
     */
    private int k_chip;

    /**
     * Konstruktor "Katze" enthält die Variablen und Informationen, die in Klasse Katze steht.
     * Das benutzt funktion "super()" für die Abholung der Information (name) von Klasse Haustier.
     * @param name Es ist name für Katze.
     * @param k_chip Es ist Chipnummer der Katze.
     */
    public Katze(String name, int k_chip) {
        super(name);
        this.k_chip = k_chip;
    }
    /**
     * Das ist die streicheln Method für Klasse Katze.
     * Es gibt eine Ausgabe mit Name von Katze und "wurde gestreichelt."
     * Das implementiert aus Interface "Streichbar".
     */
    public void  streicheln() {
        System.out.println("Katze "+super.getName()+" wurde gestreichelt");
    }
    /**
     * Das ist die jagen Method für Klasse Katze.
     * Es gibt eine Ausgabe mit Name von Katze und gegebener Beute aus.
     * Das implementiert aus Interface Jagbar.
     * @param beute Es ist Art der Beute.
     */
    public void jagen(String beute){
        System.out.println("Katze "+super.getName()+" jagt "+beute);
    }
    /**
     * Das ist die gibLaut Method für Klasse Katze.
     * Es gibt name und laut von Katze in Ausgabe aus.
     * Das implementiert aus Interface Laut.
     */
    public void gibLaut(){
        System.out.println("Katze "+super.getName()+": Miauuu.");
    }

    /**
     *Das ist die Method toString für die Informationen, die in Klasse Katze steht. Das return alle Variablen, die in Konstruktor Katze steht, als String.
     */

    public String toString() {
        return "Katze [chipID=" + k_chip +", name= " +super.getName()+
                "] ";
    }
}
