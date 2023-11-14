package edu.neu.mgen.hw9Student;


import java.util.ArrayList;
import java.util.List;

class EngClass {
    private List<hw9Student> students;

    public EngClass() {
        students = new ArrayList<>();
    }

    public void addStudent(hw9Student student) {
        students.add(student);
    }

    public boolean deleteStudent(String studentId) {
        return students.removeIf(student -> student.getStudentId().equals(studentId));
    }

    public void displayStudents() {
        for (hw9Student student : students) {
            System.out.println(student);
        }
    }
}

