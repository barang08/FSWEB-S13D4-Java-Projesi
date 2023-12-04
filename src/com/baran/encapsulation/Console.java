package com.baran.encapsulation;

public class Console {
    public static void main(String[] args) {
        Player player1 = new Player("Player1", 1100, Weapon.SWORD);
        Player player2 = new Player("Player2", 100, Weapon.AXE);

        System.out.println(player1);


    }
}
