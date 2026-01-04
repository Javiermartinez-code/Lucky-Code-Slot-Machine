package dev.luckycode;

public class Main {
    public static void main(String[] args) {

public class Main {
    public static void main(String[] args) {

import dev.luckycode.model.reel.Reel;
import dev.luckycode.model.symbols.Symbol;
import dev.luckycode.view.SlotView;

public class Main {
    public static void main(String[] args) {
        Reel testReel = new Reel();
        SlotView view = new SlotView();
        // 1. El rodillo decide el símbolo ganador de forma aleatoria
        Symbol randomResult = testReel.getRandomSymbol();

        System.out.println("Sorteando premio...");

        try {
            // 2. Ejecutamos la cascada pasándole ese resultado aleatorio
            view.drawCascade(testReel, randomResult);

            System.out.println("\n--- RESULTADO FINAL ---");
            System.out.println("Símbolo obtenido: " + randomResult.getName());

        } catch (InterruptedException e) {
                    System.out.println("Error en la animación.");
        }
import dev.luckycode.controller.GameController;

public class Main {
    public static void main(String[] args) {
        GameController gm = new GameController();
        gm.start();
    }
}
