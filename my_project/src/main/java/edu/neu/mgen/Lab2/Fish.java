package edu.neu.mgen.Lab3;

public class Fish extends Animal {
    private int numberOfFins;

    public Fish(String name, String typicalSize, String typicalWeight, String dietType, int numberOfFins) {
        super(name, typicalSize, typicalWeight, dietType);
        this.numberOfFins = numberOfFins;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Fins: " + numberOfFins);
    }
}
