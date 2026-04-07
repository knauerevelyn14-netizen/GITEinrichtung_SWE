public class Dozierender {
    
    String name;         // The name of the lecturer 
    String fakultaet;    // The faculty they belong to 
    String buronummer;  // Their office number 

    
    public void frageBeantworten(Studierender student, String antwort) {
        System.out.println("Hallo " + student.name + ", hier ist die Antwort: " + antwort);
    }
}