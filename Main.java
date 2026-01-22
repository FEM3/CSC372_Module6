import java.util.ArrayList;


// Main class used for sorting student objects
public class Main {

    public static void main(String[] args) {

        // Create an ArrayList to store Student objects
        ArrayList<Student> students = new ArrayList<>();

        // Add student data to the list
        addStudents(students);

        // Display the original list
        System.out.println("First student list:");
        displayStudents(students);

        // Sort students alphabetically by name
        SelectionSorter.selectionSort(students, new NameComparator());
        System.out.println("\nAfter sorting by name:");
        displayStudents(students);

        // Sort students by roll number
        SelectionSorter.selectionSort(students, new RollnoComparator());
        System.out.println("\nAfter sorting by roll number:");
        displayStudents(students);
    }

    // Adds students to the ArrayList
    private static void addStudents(ArrayList<Student> students) {
        students.add(new Student(5, "Frank", "Chicago"));
        students.add(new Student(2, "London", "Lake Forest"));
        students.add(new Student(9, "Cheryl", "Roseland"));
        students.add(new Student(1, "Paul", "Milwaukee"));
        students.add(new Student(7, "Nancy", "West Allis"));
        students.add(new Student(3, "Roger", "St. Paul"));
        students.add(new Student(10, "Ari", "Englewood"));
        students.add(new Student(4, "Timothy", "Shaumberg"));
        students.add(new Student(8, "Camden", "Urbana"));
        students.add(new Student(6, "Remy", "Dolton"));
    }

    // Helper method
    private static void displayStudents(ArrayList<Student> students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
