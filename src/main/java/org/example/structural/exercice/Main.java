package org.example.structural.exercice;

import org.example.structural.exercice.decorator.Text;
import org.example.structural.exercice.decorator.TextBase;
import org.example.structural.exercice.decorator.TextToUpperCase;

public class Main {
    public static void main(String[] args) {
        Text textbase = new TextBase();
        Text textUpper = new TextToUpperCase(textbase);
        System.out.println(textUpper.getText());

    }
}
