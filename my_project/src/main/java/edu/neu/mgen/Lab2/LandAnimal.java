package edu.neu.mgen.Lab3;

public class LandAnimal extends Animal {
    private int numberOfLegs;

    public LandAnimal(String name, String typicalSize, String typicalWeight, String dietType, int numberOfLegs) {
        super(name, typicalSize, typicalWeight, dietType);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Legs: " + numberOfLegs);
    }
}

