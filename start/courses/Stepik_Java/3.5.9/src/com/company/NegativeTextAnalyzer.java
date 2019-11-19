package com.company;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private String[] negativwords = {":(", ":|", "=("};

    @Override
    protected String[] getKeywords() {
        return negativwords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
