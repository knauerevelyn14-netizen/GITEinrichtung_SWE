import java.util.List;
import java.util.ArrayList;

public class Dozierender {
    
    String name;         // The name of the lecturer 
    String fakultaet;    // The faculty they belong to 
    String buronummer;  // Their office number 
    String email;       // Their email address
    List<String> anfragen; // Liste für Sprechstundenanfragen
    List<String> feedbacks;  // Liste für Feedback von Studierenden

    public Dozierender() {
        this.anfragen = new ArrayList<>();
        this.feedbacks = new ArrayList<>();
    }

    public void frageBeantworten(Studierender student, String antwort) {
        System.out.println("Hallo " + student.name + ", hier ist die Antwort: " + antwort);    

    }

    public void sprechstundenAnfrageEmpfangen(Studierender student, String thema, String gewuenschter Termin, String nachricht) {
        String anfrage = "Anfrage von " + student.name + ": " + thema + " am " + gewuenschterTermin + " - " + nachricht;
        anfragen.add(anfrage);
        System.out.println("Neue Sprechstundenanfrage erhalten: " + anfrage);
    }
        
    public void feedbackEmpfangen(Studierender student, String feedbackText) {
        String feedback = "Feedback von " + student.name + ": " + feedbackText;
        feedbacks.add(feedback);
        System.out.println("Feedback empfangen: " + feedback);
    }
}