public class Test {
    public static void main(String[] args) {
        // --- PART 1: People Setup (Old Tasks) ---
        Studierender student = new Studierender();
        student.name = "Max";
        
        Dozierender dozent = new Dozierender();
        dozent.name = "Prof. Schmidt";

        // Test interaction
        student.frageStellen(dozent, "Wann ist die nächste Prüfung?");
        dozent.feedbackEmpfangen(student, "Sehr gute Vorlesung!");

        // --- PART 2: Course System (Aufgabe 4) ---
        // Create the Course
        Lehrveranstaltung swe2 = new Lehrveranstaltung("Softwareentwicklung 2", dozent);
        
        // Register the student
        swe2.anmelden(student);

        // Add a Lecture (Vorlesung)
        Vorlesungsstunde v1 = new Vorlesungsstunde("Git & Java Integration", "14.04.2026", "10:00", "Raum A01");
        swe2.vorlesungHinzufuegen(v1);

        // Add a Lab (Praktikum)
        Praktikumsstunde p1 = new Praktikumsstunde("Coding Lab", "16.04.2026", "14:00", "Labor 2");
        p1.aufgabeHinzufuegen("Klassen-Hierarchie bauen");
        p1.aufgabeHinzufuegen("Test-Case schreiben");
        swe2.praktikumHinzufuegen(p1);

        // --- PART 3: Final Output ---
        System.out.println("\n--- FINAL SYSTEM CHECK ---");
        swe2.detailsAnzeigen();
        dozent.feedbackAnzeigen();
    }
}
