package edu.neu.mgen.Lab3;

public class Animal {
    private String name;
    private String typicalSize;
    private String typicalWeight;
    private String dietType;

    public Animal(String name, String typicalSize, String typicalWeight, String dietType) {
        this.name = name;
        this.typicalSize = typicalSize;
        this.typicalWeight = typicalWeight;
        this.dietType = dietType;
    }

    // Common method to display info, can be overridden in derived classes
    public void displayInfo() {
        System.out.println("Name: " + name + ", Size: " + typicalSize + ", Weight: " + typicalWeight + ", Diet: " + dietType);
    }
}

