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
    // ... [rest of the getters and setters]

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

// Define the Main class with the main method
public class Main {
    public static void main(String[] args) {
        // Create instances of hw9_Student
        hw9_Student student1 = new hw9_Student("001", "John", "Doe");
        hw9_Student student2 = new hw9_Student("002", "Jane", "Smith");
        hw9_Student student3 = new hw9_Student("003", "Alice", "Johnson");

        // Create an instance of EngClass
        EngClass engClass = new EngClass();

        // Add students to the EngClass
        engClass.addStudent(student1);
        engClass.addStudent(student2);
        engClass.addStudent(student3);

        // Display the list of students
        System.out.println("Students in the engineering class:");
        engClass.displayStudents();

        // Remove a student from the EngClass
        engClass.deleteStudent("002");

        // Display the list of students after deletion
        System.out.println("\nStudents in the engineering class after deleting Jane Smith:");
        engClass.displayStudents();
    }
}
