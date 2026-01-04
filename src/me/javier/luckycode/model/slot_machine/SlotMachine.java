package me.javier.luckycode.model.slot_machine;

import me.javier.luckycode.model.reel.Reel;
import me.javier.luckycode.model.symbols.Symbol;

import java.util.ArrayList;
import java.util.List;

public class SlotMachine {
    private List<Reel> reels;

    public SlotMachine() {
        this.reels = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            this.reels.add(new Reel());
        }
    }

    public List<Symbol> spin() {
        List<Symbol> results = new ArrayList<>();

        // Recorremos el array
        for (Reel reel : reels) {
            results.add(reel.getRandomSymbol());
        }
        return results;
    }

    private boolean checkWin(List<Symbol> results) {
        String first = results.getFirst().getName();
        String second = results.get(1).getName();
        String third = results.get(2).getName();

        return first.equals(second) && second.equals(third);
    }

    public int calculatePrize(List<Symbol> results, int amount) {
        String first = results.getFirst().getName();
        String second = results.get(1).getName();
        String third = results.get(2).getName();

        if (checkWin(results)) {
            int multiplier = results.getFirst().getScoreValue();
            return amount * multiplier;
        } else if (first.equals(second) || second.equals(third)) {
            int multiplier = results.getFirst().getScoreValue();
            return amount * multiplier / 2;
        }

        return 0;
    }

    public List<Reel> getReels() {
        return reels;
    }
}
