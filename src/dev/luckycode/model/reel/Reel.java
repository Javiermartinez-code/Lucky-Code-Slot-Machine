package dev.luckycode.model.reel;

import dev.luckycode.model.symbols.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Reel {
    Random rd = new Random();
    private List<Symbol> possibleSymbol;

    public Reel() {
        possibleSymbol = new ArrayList<>();
        // Add symbols on reel
        for (int i = 0; i < 10; i++) {
            possibleSymbol.add(new Cherry());
        }
        for (int i = 0; i < 7; i++) {
            possibleSymbol.add(new Lemon());
        }
        for (int i = 0; i < 4; i++) {
            possibleSymbol.add(new Bell());
        }
        for (int i = 0; i < 2; i++) {
            possibleSymbol.add(new Seven());
        }
        possibleSymbol.add(new Diamond());

        Collections.shuffle(possibleSymbol);
    }

    public Symbol getRandomSymbol() {
        int randomIndex = rd.nextInt(possibleSymbol.size());
        return possibleSymbol.get(randomIndex);
    }
}
