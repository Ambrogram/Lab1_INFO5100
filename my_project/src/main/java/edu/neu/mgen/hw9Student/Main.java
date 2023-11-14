package edu.neu.mgen.hw9Student;


public class Main {
    public static void main(String[] args) {
        EngClass engClass = new EngClass();

        engClass.addStudent(new hw9Student("001", "John", "Doe"));
        engClass.addStudent(new hw9Student("002", "Jane", "Smith"));
        engClass.addStudent(new hw9Student("003", "Alice", "Johnson"));

        System.out.println("Students in the engineering class:");
        engClass.displayStudents();

        engClass.deleteStudent("002");

        System.out.println("\nStudents in the engineering class after deleting Jane Smith:");
        engClass.displayStudents();
    }
}

