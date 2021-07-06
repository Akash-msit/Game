package com.company;

public class Main {

    public static void main(String[] args) {
        player1 player = new player1("Akash","sword",400);
//        System.out.println(player.getName());
       // System.out.println(player.getHealth());
//        System.out.println(player.getWeapon());
            player.damageByGun1();
            player.damageByGun1();
            player.damageByGun2();
            player.heal();

//        player.damageByGun2();
//        player2 betterPlayer = new player2("Souvik","machine gun",80,false);
//        betterPlayer.damageByGun1();

    }
}
