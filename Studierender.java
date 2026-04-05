public class Studierender {
    String name;
    int matrikelnummer;
    String studiengang;

public void frageStellen (Dozierender dozent, String frage) {
    System.out.println(this.name + "fragt" + dozent.name + ":" + frage);
    dozent.frageBeantworten(this, "Ich schaue mir das an.");
}
}