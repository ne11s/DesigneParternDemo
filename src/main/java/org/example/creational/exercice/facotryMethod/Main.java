package org.example.creational.exercice.facotryMethod;

public class Main {
    public static void main(String[] args) {
        AnimalFactory catfactory = new CatFactory();
        Animal cat= catfactory.createAnimal();
        cat.sound();
        AnimalFactory dogfactory = new DogFactory();
        Animal dog= dogfactory.createAnimal();
        dog.sound();
    }
}
