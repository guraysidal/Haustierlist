/**
 * Klasse Main enthält main Method.
 * @author  Sıdal Güray
 */
public class Main {
    /**
     * Method main enthält Aufruf von aller Methoden und hergestellt 8 Objekte.
     * @param args Es ist für main Method.
     */
    public static void main(String[]args){
        Haustierverwaltung haustierverwaltung = new Haustierverwaltung();

        haustierverwaltung.addHaustier(new Schwein());
        haustierverwaltung.addHaustier(new Schwein("Chicharito"));

        haustierverwaltung.addHaustier(new Hunde("Kangal", 324812));
        haustierverwaltung.addHaustier(new Hunde("Saribas", 642452));
        haustierverwaltung.addHaustier(new Katze("Maya", 23141234));
        haustierverwaltung.addHaustier(new Katze("Prenses", 745723));
        haustierverwaltung.addHaustier(new Esel("Hacivat", true));
        haustierverwaltung.addHaustier(new Esel("Karagöz"));
        haustierverwaltung.alleWerdenGestreichelt();
        haustierverwaltung.alleGebenLaut();
        Haustierverwaltung.saveHaustierliste("C:/Users/ibrah/OneDrive/Desktop/Hausarbeit2/haustierliste.txt");
    }
}
