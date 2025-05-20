package org.example.structural.exercice.decorator;

public class TextAddSufix extends TextDecorator{
    private String Sufix = "!";
    public TextAddSufix(Text text, String prefix) {
        super(text);
        this.Sufix = Sufix;
    }

    @Override
    public String getText() {
        return  super.getText() + this.Sufix;
    }
}
