package org.example.creational.exercice;

import org.example.creational.exercice.builder.Maison;

public class Main {
    public static void main(String[] args) {
        Maison maison = new Maison.Builder().avecPiscine(false).type("chalet").nbrEtage(4).couleur("bleu").build();
        System.out.println(maison);
    }

}
