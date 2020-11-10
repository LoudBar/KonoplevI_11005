package com.company;

public class Player {

    private String name;
    private int hp;

    public Player(String name, int hp) {
        this.hp = hp;
        this.name = name;
    }
    public int getHp() {
        return this.hp;
    }
}
