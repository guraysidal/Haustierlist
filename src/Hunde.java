/**
 * Klasse Hunde enthält eine Variable, Konstruktor, Methoden und ein toString.
 * Diese Klasse extends Jagdtier deswegen implements Interface "Jagbar".
 * Klasse Jagdtier extends Haustier deswegen implementiert es Interfaces "Streichbar","Laut".
 * @author  Sıdal Güray
 */
public class Hunde extends Jagdtier {
    /**
     * Das ist die Variable für die Hundesteuernummer.
     */
    private int h_steuernummer;

    /**
     * Konstruktor "Hunde" enthält die Variablen und Informationen, die in Klasse Hunde steht.
     * Das benutzt funktion "super()" für die Abholung der Information (name) von Klasse Haustier.
     * @param name Das ist Name der Hunde.
     * @param h_steuernummer Das ist die Steuernummer von Hunde.
     */
    public Hunde(String name, int h_steuernummer) {
        super(name);
        this.h_steuernummer = h_steuernummer;
    }

    /**
     * Das ist die jagen Method für Klasse Hunde.
     * Es gibt eine Ausgabe mit Name von Hunde und gegebener Beute aus.
     * Das implementiert aus Interface Jagbar.
     * @param beute Das ist Art von Beute.
     */
    public void jagen(String beute){
        System.out.println("Hund "+super.getName()+" jagt "+beute);
    }
    /**
     * Das ist die gibLaut Method für Klasse Hunde.
     * Es gibt name und laut von Hunde in Ausgabe aus.
     * Das implementiert aus Interface Laut.
     */
    public void gibLaut(){
        System.out.println("Hunde "+super.getName()+": Wufff Wufff");
    }
    /**
     * Das ist die streicheln Method für Klasse Hunde.
     * Es gibt eine Ausgabe mit Name von Hunde und "wurde gestreichelt."
     * Das implementiert aus Interface "Streichbar".
     */
    public void streicheln() {
        System.out.println("Hunde "+ super.getName()+" wurde gestreichelt");
    }
    /**
     *Das ist die Method toString für die Informationen, die in Klasse Hunde steht. Das return alle Variablen, die in Konstruktor Hunde steht, als String.
     */

    public String toString() {
        return "Hunde [" +
                "hundesteuernummer=" + h_steuernummer +", name="+super.getName()+
                "] " ;
    }
}
