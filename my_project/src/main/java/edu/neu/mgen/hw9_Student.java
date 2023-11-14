package edu.neu.mgen;
import java.util.ArrayList;
import java.util.List;

// Define the Student class
public class hw9_Student {
    // Attributes of the Student class
    private String studentId; // Unique identifier for a student
    private String firstName; // Student's first name
    private String lastName;  // Student's last name

    // Constructor to initialize a new Student object
    public hw9_Student(String studentId, String firstName, String lastName) {
        this.studentId = studentId;   // Set the student ID
        this.firstName = firstName;   // Set the first name
        this.lastName = lastName;     // Set the last name
    }

    // Getters and Setters for the Student class
    public String getStudentId() {
        return studentId; // Return student's ID
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId; // Set a new student ID
    }

    public String getFirstName() {
        return firstName; // Return student's first name
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName; // Set a new first name
    }

    public String getLastName() {
        return lastName; // Return student's last name
    }

    public void setLastName(String lastName) {
        this.lastName = lastName; // Set a new last name
    }

    // Method to return a string representation of a Student object
    
    @Override
    public String toString() {
        return "hw9_Student{" +
                "studentId='" + studentId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}

// Define the EngClass class
class EngClass {
    private List<hw9_Student> students; // List to store Student objects

    // Constructor to initialize the EngClass object
    public EngClass() {
        students = new ArrayList<>(); // Initialize the list of students
    }

    // Method to add a student to the EngClass
    public void addStudent(hw9_Student student) {
        students.add(student); // Add a Student object to the list
    }

    // Method to delete a student from the EngClass based on studentId
    public boolean deleteStudent(String studentId) {
        // Remove a student from the list if their ID matches
        return students.removeIf(student -> student.getStudentId().equals(studentId));
    }

    // Method to get the list of students
    public List<hw9_Student> getStudents() {
        return students; // Return the list of students
    }

    // Method to display all students in the EngClass
    public void displayStudents() {
        for (hw9_Student student : students) {
            System.out.println(student); // Print the details of each student
        }
    }
}
