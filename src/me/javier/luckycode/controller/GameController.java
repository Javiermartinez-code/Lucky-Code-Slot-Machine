package me.javier.luckycode.controller;

import me.javier.luckycode.model.player.Player;
import me.javier.luckycode.model.slot_machine.SlotMachine;
import me.javier.luckycode.view.SlotView;

import java.util.Scanner;
import java.util.SequencedCollection;

public class GameController {
    private SlotMachine slotMachine;
    private Player player;
    private SlotView slotView;
    private Scanner sc;


    public GameController() {
        this.sc = new Scanner(System.in);
        int charMax = 10;

        String userName = "";
        String welcomeString = "BIENVENIDO A LUCKY CODE SLOT MACHINE\n--------------------------\n";

        System.out.print(welcomeString);
        System.out.print("Introduzca su nombre: ");
        userName = sc.nextLine();

        // comprobamos si el nombre tiene letras alfabeticas
        while (!userName.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            System.out.print("Por favor introduzca una cadena de texto: ");
            userName = sc.nextLine();
        }

        while (userName.isEmpty() || userName.length() > charMax) {
            System.out.print("Introduzca un rango correcto [1-10] de carácteres: ");
            userName = sc.nextLine();
        }

        this.player = new Player(userName);
        this.slotMachine = new SlotMachine();
        this.slotView = new SlotView();
    }

    public void start() {
        int amountUser = -1;
        int saldoUser = player.getSaldo();

        do {
            System.out.println("Tienes " + saldoUser + "€ de saldo actualmente.");
            System.out.print("Introduzca la cantidad de dinero que quieres apostar (0 - para salir): ");

            if (sc.hasNextInt()) {
                amountUser = sc.nextInt();
                sc.nextLine();

                if (amountUser > 0 && amountUser <= saldoUser) {
                    this.playTurn();
                } else if (amountUser < 0 || amountUser > saldoUser) {
                    System.out.print("Error! Debes introducir una cantidad válida");
                }
            } else {
                System.out.println("Error! Debes introducir un número entero.");
                sc.nextLine();
                amountUser = -1;
            }
        } while(amountUser != 0);

        if (amountUser == 0) {
            System.out.println("Saliendo...");
            System.exit(0);
        }
    }

    public void playTurn() {

    }
}
