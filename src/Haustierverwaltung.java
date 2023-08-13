import java.io.*;
import java.util.ArrayList;

/**
 * Klasse Haustierverwaltung enthält eine Arraylist und Methoden.
 * @author  Sıdal Güray
 */
public class Haustierverwaltung {
    /**
     * Das ist die Arraylist für Objekte aller Subklassen von Haustier.
     */
    static ArrayList<Haustier>Haustier1=new ArrayList<>();

    /**
     * Methode alleGebenLaut ruft gibLaut Methode für alle Objekte, die in alle Subklassen von Haustier steht.
     */
    public void alleGebenLaut(){
        for (int i = 0; i< Haustier1.size(); i++){
            Haustier1.get(i).gibLaut();
            }
    }

    /**
     * Methode addHaustier fügt neue Objekte in Arraylist Haustier1 hin.
     * @param tier Das ist für alle Objekte, die in alle Subklassen von Haustier steht.
     */
    public  void addHaustier(Haustier tier){
            Haustier1.add(tier);
        }

    /**
     * Methode alleWerdenGestreichelt ruft streicheln Methode für alle Objekte, die in alle Subklassen von Haustier steht.
      */
    public void alleWerdenGestreichelt(){
        for(int i=0; i<Haustier1.size();i++){
            Haustier1.get(i).streicheln();
        }
    }

    /**
     * Methode saveHaustierliste speichert Informationen von Arraylist Haustier1 (durch toString) in einen .txt Datei.
     * @param fileName Das ist für unseren Dateipfad.
     */
    public static void  saveHaustierliste(String fileName) {
        BufferedWriter writer1;

        try {
            FileWriter fileWriter = new FileWriter("C:/Users/ibrah/OneDrive/Desktop/Hausarbeit2/haustierliste.txt");
            writer1 = new BufferedWriter(fileWriter);
            for(int i=0; i<Haustier1.size();i++){
                writer1.write(Haustier1.get(i).toString() +"\n");
            }

            writer1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
