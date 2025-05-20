package org.example.structural.exercice.decorator;

public class TextTolowerCase extends TextDecorator{

    public TextTolowerCase(Text text) {
        super(text);
    }

    @Override
    public String getText() {
        return super.getText().toLowerCase();
    }
}
