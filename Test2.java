public class Test2 {
    
}public static void main(String[] args) {
    Studierender student = new Studierender();
    student.name = "Max";
    student.email = "max@uni.de";
    
    Dozierender dozent = new Dozierender();
    dozent.name = "Prof. Schmidt";
    
    // Test Sprechstunde
    student.sprechstundenAnfrageSenden(dozent, "Algorithmen", "Montag 14:00", "Frage zur Laufzeit");
    
    // Test Feedback
    dozent.feedbackEmpfangen(student, "Sehr gute Vorlesung!");
}
