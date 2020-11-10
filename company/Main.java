package com.company;

public class Main {

    public static void main(String[] args) {

        Player first = new Player("biba", 5);
        Player second = new Player("boba", 100);

        Game bossOfTheGym = new Game(first, second);

        bossOfTheGym.entersTheDungeon(first, second);
    }
}