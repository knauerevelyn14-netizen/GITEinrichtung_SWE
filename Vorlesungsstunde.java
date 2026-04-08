public class Vorlesungsstunde {
    String thema;
    String datum;
    String uhrzeit;
    String raum;

    public Vorlesungsstunde(String thema, String datum, String uhrzeit, String raum) {
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
    }

    public void detailsAnzeigen() {
        System.out.println("Vorlesung: " + thema + " am " + datum + " um " + uhrzeit + " in Raum " + raum);
    }
}