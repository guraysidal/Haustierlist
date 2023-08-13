/**
 * Klasse Schwein enthält eine Variable, zwei Konstruktor, methoden und ein toString.
 * Diese Klasse extends Haustier deswegen implementiert es Interfaces "Streichbar","Laut".
 * @author  Sıdal Güray
 */
public class Schwein extends Haustier {

    /**
     * Konstruktor "Schwein" enthält die Variablen und Informationen, die in Klasse Schwein steht.
     * Das benutzt funktion "super()" für die Abholung der Information (name) von Klasse Haustier.
     * Diese Konstruktor wird benutzt, wenn es über name Information steht.
     * @param name Es ist Name des Schweines.
     */
    public Schwein(String name) {
        super(name);
    }

    /**
     * Das ist zweite Konstruktor für Schwein.
     * Diese Konstruktor macht Name der Schwein "unbenannt", wenn es keine Information darüber steht.
     */
    public Schwein() {
        super("unbenannt");
    }
    /**
     * Das ist die gibLaut Method für Klasse Schwein.
     * Es gibt name und laut von Schwein in Ausgabe aus.
     * Das implementiert aus Interface Laut.
     */
    public void gibLaut(){
        System.out.println("Schwein "+super.getName()+": Grunzz Grunzz");
    }
    /**
     * Das ist die streicheln Method für Klasse Schwein.
     * Es gibt eine Ausgabe mit Name von Schwein und "wurde gestreichelt."
     * Das implementiert aus Interface "Streichbar".
     */
    public void streicheln() {
        System.out.println("Schwein "+super.getName()+" wurde gestreichelt.");
    }
    /**
     *Das ist die Method toString für die Informationen, die in Klasse Schwein steht. Das return alle Variablen, die in Konstruktor Schwein steht, als String.
     */

    public String toString() {
        return "Schwein [name="+super.getName()+"] " ;
        }
}
