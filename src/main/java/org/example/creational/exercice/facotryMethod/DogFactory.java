package org.example.creational.exercice.facotryMethod;

public class DogFactory extends AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}