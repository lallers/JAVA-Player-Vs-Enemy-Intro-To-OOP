package com.project.pve;

/*****************************************************************
  File Name :  Driver.java
  Function   : This program creates player and enemy coordinates
 *****************************************************************/

public class Driver{

    public static void main(String[] args) {
        System.out.println("Player VS Enemy!");
       
        Player myPlayer = new Player();
        myPlayer.characterCreate();

        Enemy myEnemy = new Enemy();
        myEnemy.characterCreate();
    }

}