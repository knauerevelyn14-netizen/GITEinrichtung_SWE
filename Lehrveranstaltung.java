import java.util.ArrayList;
import java.util.List;

public class Lehrveranstaltung {
    String titel;
    Dozierender dozent;
    List<Studierender> teilnehmer;
    List<Vorlesungsstunde> vorlesungen;
    List<Praktikumsstunde> praktika;

    public Lehrveranstaltung(String titel, Dozierender dozent) {
        this.titel = titel;
        this.dozent = dozent;
        this.teilnehmer = new ArrayList<>();
        this.vorlesungen = new ArrayList<>();
        this.praktika = new ArrayList<>();
    }

    public void anmelden(Studierender s) {
        teilnehmer.add(s);
        System.out.println("Student " + s.name + " wurde für " + titel + " angemeldet.");
    }

    public void vorlesungHinzufuegen(Vorlesungsstunde v) {
        vorlesungen.add(v);
    }

    public void praktikumHinzufuegen(Praktikumsstunde p) {
        praktika.add(p);
    }

    public void detailsAnzeigen() {
        System.out.println("--- Kursdetails: " + titel + " ---");
        System.out.println("Dozent: " + dozent.name);
        System.out.println("Anzahl Teilnehmer: " + teilnehmer.size());
        System.out.println("Termine:");
        for (Vorlesungsstunde v : vorlesungen) v.detailsAnzeigen();
        for (Praktikumsstunde p : praktika) p.detailsAnzeigen();
    }
}