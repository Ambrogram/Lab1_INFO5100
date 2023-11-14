package edu.neu.mgen.hw9Student;


public class hw9Student {
    private String studentId;
    private String firstName;
    private String lastName;

    public hw9Student(String studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and setters
    public String getStudentId() {
        return studentId;
    }

    // ... [Other getters and setters]

    @Override
    public String toString() {
        return "hw9Student{" +
               "studentId='" + studentId + '\'' +
               ", firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               '}';
    }
}

