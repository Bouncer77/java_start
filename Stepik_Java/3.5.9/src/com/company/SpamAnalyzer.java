package com.company;

public class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;
    SpamAnalyzer(String[] keywords) {
        this.keywords = new String[keywords.length];
        for (int i = 0; i < keywords.length; ++i) {
            this.keywords[i] = new String(keywords[i]);
        }
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}
