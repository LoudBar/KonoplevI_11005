package com.company;
import java.util.Scanner;

public class Game {

    Scanner in = new Scanner(System.in);
    public Player first;
    public Player second;

    public Game(Player first, Player second) {
        this.first = first;
        this.second= second;
    }

    public void entersTheDungeon(Player first, Player second) {
        int a = 0;
        int b = 100;
        int hp1 = first.getHp();
        int hp2 = second.getHp();
        while ((hp1 > 0) & (hp2 > 0)) {
            System.out.print("Enter the power of spank, leatherman: ");
            int hitPower1 = in.nextInt();
            int rand1 = a + (int) (Math.random() * ((b - a) + 1));
            if (rand1 < 100 / hitPower1) {
                hp2 -= hitPower1;
                System.out.println("Boy that was hard, boba has only " + hp2 + " hitpoints left");
            } else {
                System.out.println("Close, but his ass is a lil' bit lower");
            }
            System.out.println("");


            System.out.print("Enter the power of spank, leatherman: ");
            int hitPower2 = in.nextInt();
            int rand2 = a + (int) (Math.random() * ((b - a) + 1));
            if (rand2 < 100 / hitPower2) {
                hp1 -= hitPower2;
                System.out.println("Boy that was hard, biba has only " + hp1 + " hitpoints left");
            } else {
                System.out.println("Close, but his ass is a lil' bit lower");
            }
            System.out.println("");
        }
        if ((hp1 | hp2) < 1) {
            System.out.println("Boy next door");
        }
    }

}
