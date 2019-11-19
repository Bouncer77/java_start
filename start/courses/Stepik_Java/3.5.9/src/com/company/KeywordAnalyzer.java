package com.company;

public abstract class KeywordAnalyzer implements TextAnalyzer{
    abstract protected String[] getKeywords();
    abstract protected Label getLabel();
    public Label processText(String text) {
        for (String key : getKeywords()) {
            if (text.contains(" " + key) || text.contains(key + " ")) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
