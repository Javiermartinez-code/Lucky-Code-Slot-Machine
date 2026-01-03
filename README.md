# LuckyCode Slot Machine 🎰

A robust, Object-Oriented Programming (OOP) simulation of a classic casino slot machine built with Java. This project focuses on clean architecture, object interaction, and terminal-based animations without using complex data structures like Arrays or Lists.

## 🚀 Overview

LuckyCode is a terminal game where players can test their luck. The game simulates the mechanical behavior of a slot machine, including randomized reel spins, "cascade" stopping effects, and an automated payout system based on symbol combinations.

## 🛠️ Tech Stack

* **Language:** Java (JDK 25+)
* **Paradigm:** Object-Oriented Programming (OOP)
* **Version Control:** Git (Gitflow workflow)

## 🏗️ Architecture & OOP Principles

This project serves as a deep dive into the core pillars of OOP:

* **Encapsulation:** Private attributes and public getters/setters protect the game's logic and the player's balance.
* **Composition:** The `Machine` class acts as a container for multiple `Reel` objects, which in turn hold `Symbol` objects.
* **Inheritance:** Different symbol types or specialized machines can extend base classes.
* **Abstraction:** Using methods like `spin()` and `checkPrize()` to hide complex randomized logic from the main execution.

### Class Diagram

## 🎮 Key Features

* **Cascade Effect:** Reels stop one by one (Left to Right) with timed delays to build tension.
* **ASCII Art Interface:** Visual representation of slot symbols directly in the terminal.
* **Wallet System:** Tracks player balance, stakes, and winnings across sessions.
* **Custom Probabilities:** Weighted randomization ensures some symbols (like "777") appear less frequently than others (like "Cherry").

## 📁 Project Structure

```text
src/
├── model/
│   ├── Symbol.java    # Represents icons (Cherry, Bell, 7, etc.)
│   ├── Reel.java      # Manages the spinning state and randomization
│   ├── Machine.java   # Core engine: manages reels and prize logic
│   └── Player.java    # Manages user balance and credentials
└── Main.java          # Entry point and game loop
