package edu.neu.mgen.Lab3;

public class Main {
    public static void main(String[] args) {
        Bird eagle = new Bird("Eagle", "Medium", "4kg", "Predator", "2m");
        LandAnimal cat = new LandAnimal("Cat", "Small", "5kg", "Predator", 4);
        Fish salmon = new Fish("Salmon", "Medium", "15kg", "Vegetarian", 2);

        eagle.displayInfo();
        cat.displayInfo();
        salmon.displayInfo();
    }
}

