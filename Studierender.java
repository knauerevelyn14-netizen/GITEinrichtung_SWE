public class Studierender {
    String name;
    int matrikelnummer;
    String studiengang;

    public String getName() { return name; }
    public int getMatrikelnummer() { return matrikelnummer; }
    public String getStudiengang() { return studiengang; }


    public void frageStellen (Dozierender dozent, String frage) {
        System.out.println(this.name + "fragt " + dozent.name + ": " + frage);
        dozent.frageBeantworten(this, "Ich schaue mir das an.");
    }

    public void sprechstundenAnfrageSenden(Dozierender dozent, String thema, String gewuenschterTermin, String nachricht) {
        dozent.sprechstundenAnfrageEmpfangen(this, thema, gewuenschterTermin, nachricht);
    }
}
    
