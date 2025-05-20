package org.example.structural.exercice.decorator;

public abstract class TextDecorator implements  Text{
    protected  Text text;

    public TextDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return this.text.getText();
    }
}
