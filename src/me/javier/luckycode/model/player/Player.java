package me.javier.luckycode.model.player;

public class Player {
    private String name;
    private int saldo;

    public Player(String name) {
        this.name = name;
        this.saldo = 100;
    }

    public void addBalance(int amount) {
        if (amount > 0) {
            this.saldo += amount;
        }
    }

    public boolean substractBalance(int amount) {
        if (amount > this.saldo) {
            return false;
        } else {
            this.saldo -= amount;
            return true;
        }
    }

    public int getSaldo() {
        return this.saldo;
    }
}
