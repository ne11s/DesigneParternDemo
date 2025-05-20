package org.example.creational.demo.builder;

public class Dragon {
    private int age;
    private String name;
    private String maitre;

    private Dragon(Builder builder){
        age = builder.age;
        name = builder.name;
        maitre = builder.maitre;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", maitre='" + maitre + '\'' +
                '}';
    }
    public static class Builder{
        private int age;
        private String name;
        private String maitre;

        public Builder age(int age){
            this.age= age;
            return this;
        }
        public Builder name(String name){
            this.name= name;
            return this;
        }
        public Builder maitre(String maitre){
            this.maitre= maitre;
            return this;
        }
        public Dragon build(){
            return new Dragon(this);
        }

    }
}
