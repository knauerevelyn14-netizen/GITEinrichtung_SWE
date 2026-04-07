class Test {
    
public static void main(String[] args) {
    Studierender student = new Studierender();
    student.name = "Max";
    
    Dozierender dozent = new Dozierender();
    dozent.name = "Prof. Schmidt";
    
    student.frageStellen(dozent, "Wann ist die nächste Prüfung?");
    
    // Test Sprechstunde
    student.sprechstundenAnfrageSenden(dozent, "Algorithmen", "Montag 14:00", "Frage zur Laufzeit");
    
    // Test Feedback
    dozent.feedbackEmpfangen(student, "Sehr gute Vorlesung!");

    dozent.feedbackAnzeigen();

    } 

}
