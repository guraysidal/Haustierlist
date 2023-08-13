/**
 * Klasse Esel enthält eine Variable, zwei Konstruktor, methoden und ein toString.
 * Diese Klasse extends Lasttier deswegen implementiert es Interface "tragbar".
 * Klasse Lasttier extends Haustier deswegen implementiert es Interfaces "Streichbar","Laut".
 * @author  Sıdal Güray
 */
public class Esel extends Lasttier{
    /**
     * Variable "isteinMuli" enthält die Information, ob es ein Muli ist.
     */
    private boolean istEinMuli;

    /**
     * Konstruktor "Esel" enthält die Variablen und Informationen, die in Klasse Esel steht.
     * Das benutzt funktion "super()" für die Abholung der Information (name) von Klasse Haustier.
     * Diese Konstruktor macht istEinMuli falsch, wenn es darüber keine Informationen steht.
     * @param name Es ist für Name der Esel.
     */
    public Esel(String name) {
        super(name);
        this.istEinMuli = false;
    }

    /**
     * Konstruktor "Esel" enthält die Variablen und Informationen, die in Klasse Esel steht.
     * Das benutzt funktion "super()" für die Abholung der Information (name) von Klasse Haustier.
     * Diese Konstruktor wird benutzt, wenn es über isteinMuli Information steht.
     * @param name Es ist für Name der Esel.
     * @param istEinMuli Das enthält die Information, ob es ein Muli ist.
     */
    public Esel(String name, boolean istEinMuli) {
        super(name);
        this.istEinMuli = istEinMuli;
    }

    /**
     * Das ist die tragen Method für Klasse Esel.
     * Es gibt eine Ausgabe mit Name von Esel und gegebener Last aus.
     * Das implementiert aus Interface tragbar.
     * @param last Last ist Art der last.
     */
    public void tragen(String last) {
        System.out.println("Esel"+super.getName()+" tragt "+last);
    }

    /**
     * Das ist die gibLaut Method für Klasse Esel.
     * Es gibt name und laut von Esel in Ausgabe aus.
     * Das implementiert aus Interface Laut.
     */
    public void gibLaut(){
        System.out.println("Esel "+super.getName()+": I-Aaaah!");
    }

    /**
     * Das ist die streicheln Method für Klasse Esel.
     * Es gibt eine Ausgabe mit Name von Esel und "wurde gestreichelt."
     * Das implementiert aus Interface "Streichbar".
     */
    public  void streicheln() {
        System.out.println("Esel "+super.getName()+" wurde gestreichelt.");
    }


    /**
     *Das ist die Method toString für die Informationen, die in Klasse Esel steht. Das return alle Variablen, die in Konstruktor Esel steht, als String.
     */

    public String toString() {
        return "Esel [" +
                "istEinMuli=" + istEinMuli +", name="+super.getName()+
                "] "  ;
    }
}
