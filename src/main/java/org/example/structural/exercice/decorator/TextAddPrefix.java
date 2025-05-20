package org.example.structural.exercice.decorator;

public class TextAddPrefix extends TextDecorator{
    private String prefix = "!";
    public TextAddPrefix(Text text, String prefix) {
        super(text);
        this.prefix = prefix;
    }

    @Override
    public String getText() {
        return this.prefix + super.getText();
    }
}
