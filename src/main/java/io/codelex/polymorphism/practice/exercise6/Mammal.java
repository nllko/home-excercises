package io.codelex.polymorphism.practice.exercise6;

public abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }
}
