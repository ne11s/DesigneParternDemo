package org.example.behavioral.exercice;


import org.example.behavioral.exercice.observer.MyObserver;
import org.example.behavioral.exercice.observer.Observer;
import org.example.behavioral.exercice.observer.SubjectPull;
import org.example.behavioral.exercice.observer.SubjectPush;

public class Main {
    public static void main(String[] args) {
        SubjectPush subjectPush = new SubjectPush();
        SubjectPull subjectPull = new SubjectPull();

        Observer observer1 = new MyObserver("observer 1");
        Observer observer2 = new MyObserver("observer 2");

        subjectPush.addObserver(observer1);
        subjectPull.addObserver(observer2);

        subjectPush.notifyObserver("envoie !!!");
        subjectPull.notifyObserver("recuperation ");
    }
}
