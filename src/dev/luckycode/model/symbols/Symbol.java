package dev.luckycode.model.symbols;

public class Symbol {
    private String name;
    private int scoreValue;

    public Symbol(String name, int scoreValue) {
        this.name = name;
        this.scoreValue = scoreValue;
    }

    public String getName() {
        return this.name;
    }

    public int getScoreValue() {
        return this.scoreValue;
    }

    public boolean sameSymbol(Symbol symbol) {
        if(symbol == null) return false;
        return this.name.equals(symbol.getName());
    }
}