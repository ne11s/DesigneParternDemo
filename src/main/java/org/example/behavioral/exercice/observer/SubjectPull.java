package org.example.behavioral.exercice.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectPull {


    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyObserver(String message){
        for (Observer observer:observers){
            observer.update(message);
        }
    }
}
