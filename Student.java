// Student class represents a single student record
// It stores basic information such as roll number, name, and address
public class Student {

    private int rollno;
    private String name;
    private String address;

    // Default constructor
    // This is useful if we ever want to create a student without data
    public Student() {
        rollno = 0;
        name = "Unknown";
        address  = "Unknown";
    }

    // Parameterized constructor
    // This constructor is used when creating a student with actual values
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Getter for roll number
    public int getRollno() {
        return rollno;
    }

    // Getter for student name
    public String getName() {
        return name;
    }

    // Getter for student address
    public String getAddress() {
        return address;
    }

    // Formats student information when printed
    @Override
    public String toString() {
        return "Roll No: " + rollno +
               ", Name: " + name +
               ", Address: " + address;
    }
}
