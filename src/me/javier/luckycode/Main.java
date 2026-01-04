package me.javier.luckycode;

import me.javier.luckycode.controller.GameController;
import me.javier.luckycode.model.reel.Reel;
import me.javier.luckycode.model.symbols.Symbol;
import me.javier.luckycode.view.SlotView;

public class Main {
    public static void main(String[] args) {
        GameController gm = new GameController();
        gm.start();
    }
}
