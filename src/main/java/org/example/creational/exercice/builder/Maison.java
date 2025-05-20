package org.example.creational.exercice.builder;



public class Maison {

    private int nbrEtage;
    private boolean avecPiscine;
    private String type;
    private String couleur;

    private Maison(Builder builder) {
        nbrEtage= builder.nbrEtage;
        avecPiscine= builder.avecPiscine;
        type= builder.type;
        couleur= builder.couleur;
    }

    @Override
    public String toString() {
        return "Maison{" +
                "nbrEtage=" + nbrEtage +
                ", avecPiscine=" + avecPiscine +
                ", type='" + type + '\'' +
                ", couleur='" + couleur + '\'' +
                '}';
    }

    public static class Builder{
        private int nbrEtage;
        private boolean avecPiscine;
        private String type;
        private String couleur;

        public Builder nbrEtage(int nbrEtage){
            this.nbrEtage= nbrEtage;
            return this;
        }public Builder couleur(String couleur){
            this.couleur= couleur;
            return this;
        }
        public Builder avecPiscine(boolean avecPiscine){
            this.avecPiscine= avecPiscine;
            return this;
        }
        public Builder type(String type){
            this.type= type;
            return this;
        }
        public Maison build(){
            return new Maison(this);
        }

    }
}
