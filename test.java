
public static void main(String[] args) {
    StudierenderAufgabe3 student = new StudierenderAufgabe3();
    student.name = "Max";
    student.email = "max@uni.de";
    
    DozierenderAufgabe3 dozent = new DozierenderAufgabe3();
    dozent.name = "Prof. Schmidt";
    
    // Test Sprechstunde
    student.sprechstundenAnfrageSenden(dozent, "Algorithmen", "Montag 14:00", "Frage zur Laufzeit");
    
    // Test Feedback
    dozent.feedbackEmpfangen(student, "Sehr gute Vorlesung!");
}