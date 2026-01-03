package me.javier.luckycode.model;

public class Symbol {
    private String name;
    private int scoreValue;
    private String asciiPresentation;

    public Symbol(String name, int scoreValue, String asciiPresentation) {
        this.name = name;
        this.scoreValue = scoreValue;
        this.asciiPresentation = asciiPresentation;
    }

    public String getName() {
        return this.name;
    }

    public int getScoreValue() {
        return this.scoreValue;
    }

    public String getAsciiPresentation() {
        return this.asciiPresentation;
    }

    public boolean sameSymbol(Symbol symbol) {
        if(symbol == null) return false;
        return this.name.equals(symbol.getName());
    }
}