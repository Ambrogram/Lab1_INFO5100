package edu.neu.mgen.Lab3;

public class Bird extends Animal {
    private String wingspan;

    public Bird(String name, String typicalSize, String typicalWeight, String dietType, String wingspan) {
        super(name, typicalSize, typicalWeight, dietType);
        this.wingspan = wingspan;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Wingspan: " + wingspan);
    }
}

