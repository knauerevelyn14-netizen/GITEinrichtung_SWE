import java.util.ArrayList;
import java.util.List;

public class Praktikumsstunde {
    String thema;
    String datum;
    String uhrzeit;
    String raum;
    List<String> aufgaben;

    public Praktikumsstunde(String thema, String datum, String uhrzeit, String raum) {
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
        this.aufgaben = new ArrayList<>();
    }

    public void aufgabeHinzufuegen(String aufgabe) {
        this.aufgaben.add(aufgabe);
    }

    public void detailsAnzeigen() {
        System.out.println("Praktikum: " + thema + " (" + datum + ")");
        System.out.println("Aufgaben: " + aufgaben);
    }
}