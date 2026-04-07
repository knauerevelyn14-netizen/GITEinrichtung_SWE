public class StudierenderAufgabe3 {
    String name;
    int matrikelnummer;
    String studiengang;
    String email;

    public void frageStellen (Dozierender dozent, String frage) {
        System.out.println(this.name + "fragt " + dozent.name + ": " + frage);
        dozent.frageBeantworten(this, "Ich schaue mir das an.");
    }

    //Sprechstundenanfrage senden
    public void sprechstundenAnfrageSenden(Dozierender dozent, String thema, String gewuenschterTermin, String nachricht) {
        dozent.sprechstundenAnfrageEmpfangen(this, thema, gewuenschterTermin, nachricht);
    }
}
    