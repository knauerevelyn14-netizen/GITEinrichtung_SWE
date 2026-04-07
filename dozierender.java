import java.util.List;
import java.util.ArrayList;

public class Dozierender {
    
    String name;         
    String fakultät;    
    String büronummer;        
    List<String> anfragen; // Liste für Sprechstundenanfragen
    List<String> feedbacks;  // Liste für Feedback von Studierenden

    public Dozierender() {
        this.anfragen = new ArrayList<>();
        this.feedbacks = new ArrayList<>();
    }

    public String getName() { return name; }
    public String getFakultät() { return fakultät; }
    public String getBüronummer() { return büronummer; }



    public void frageBeantworten(Studierender student, String antwort) {
        System.out.println("Hallo " + student.name + ", hier ist die Antwort: " + antwort);    

    }

    public void sprechstundenAnfrageEmpfangen(Studierender student, String thema, String gewuenschterTermin, String nachricht) {
        String anfrage = "Anfrage von " + student.name + ": " + thema + " am " + gewuenschterTermin + " - " + nachricht;
        anfragen.add(anfrage);
        System.out.println("Neue Sprechstundenanfrage erhalten: " + anfrage);
    }
        
    public void feedbackEmpfangen(Studierender student, String feedbackText) {
        String feedback = "Feedback von " + student.name + ": " + feedbackText;
        feedbacks.add(feedback);
        System.out.println("Feedback empfangen: " + feedback);
    }

    public void feedbackAnzeigen() {
        System.out.println("Feedback für " + name + ":");
        feedbacks.forEach(fb -> System.out.println("  - " + fb));
    }

}