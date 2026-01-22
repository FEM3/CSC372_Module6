import java.util.Comparator;

// Comparator class used to sort students by name
public class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        // Compare names without considering uppercase/lowercase
        return s1.getName().compareToIgnoreCase(s2.getName());
    }
}

RollnoComparator.java

import java.util.Comparator;

// Comparator class used to sort students by roll number
public class RollnoComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        // Compare roll numbers
        return Integer.compare(s1.getRollno(), s2.getRollno());
    }
}
