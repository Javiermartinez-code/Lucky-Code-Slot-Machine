package dev.luckycode.view;

import dev.luckycode.model.reel.Reel;
import dev.luckycode.model.symbols.Symbol;

public class SlotView {
    public void drawCascade(Reel reel, Symbol finalSymbol) throws InterruptedException {
        int spins = 15; // Simbolos que aparecen antes de frenarse.

        for (int i = 0; i < spins; i++) {
            System.out.println("\n".repeat(30));

            Symbol showing = (i == spins - 1) ? finalSymbol : reel.getRandomSymbol();
            System.out.println("      [ RODILLO ]");
            System.out.println("-------------------------");
            System.out.println(showing.getAsciiPresentation());
            System.out.println("-------------------------");

            Thread.sleep(100 + (i * 20));
        }
    }
}
