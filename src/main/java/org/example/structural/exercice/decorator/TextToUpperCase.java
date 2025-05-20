package org.example.structural.exercice.decorator;

public class TextToUpperCase extends TextDecorator{



    public TextToUpperCase(Text text) {
        super(text);
    }

    @Override
    public String getText() {
        return super.getText().toUpperCase();
    }
}
