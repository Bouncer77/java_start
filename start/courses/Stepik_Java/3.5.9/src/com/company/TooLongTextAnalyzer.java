package com.company;

public class TooLongTextAnalyzer implements TextAnalyzer{
    private int maxLength;
    public TooLongTextAnalyzer(int max) {
        maxLength = max;
    }

    @Override
    public Label processText(String text) {
        if (maxLength < text.length())
            return Label.TOO_LONG;
        return Label.OK;
    }
}
