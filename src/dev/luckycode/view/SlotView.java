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
import java.util.List;


public class SlotView {
    public void drawHorizontalSpin(List<Reel> reels, List<Symbol> finalSymbols) throws InterruptedException {
        int iterations = 20;

        for (int i = 0; i < iterations; i++) {
            for (int j = 0; j < 50; j++) System.out.println();

            Symbol s1 = reels.get(0).getRandomSymbol();
            Symbol s2 = reels.get(1).getRandomSymbol();
            Symbol s3 = reels.get(2).getRandomSymbol();

            System.out.println("\t [ " + s1.getName() + " ]   [ " + s2.getName() + " ]   [ " + s3.getName() + " ]");

            Thread.sleep(100); // Pausa para que el ojo humano lo vea
        }

        System.out.println("\n".repeat(50));

        // Resutlado final
        for(int j = 0; j < 50; j++) System.out.println();
        System.out.println("\t [ " + finalSymbols.get(0).getName() + " ]   " +
                "[ " + finalSymbols.get(1).getName() + " ]   " +
                "[ " + finalSymbols.get(2).getName() + " ]\n");
    }
}
