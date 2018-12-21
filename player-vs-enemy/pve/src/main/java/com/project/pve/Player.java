package com.project.pve;
import java.util.Scanner;
/*****************************************************************
  File Name :  Player.java
  Function   : This program creates player and enemy coordinates
 *****************************************************************/

public class Player{

    private String name;
    private int health;
    private int damage;
    private int defense;

    public Player(){
        name = "James Bond";
        health = 0;
        damage = 0;
        defense = 0;
    }

    public Player(String name, int health, int damage, int defense){
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.defense = defense;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return health;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public int getDamage(){
        return damage;
    }

    public void setDefense(int defense){
        this.defense = defense;
    }

    public int getDefense(){
        return defense;
    }


    protected void characterCreate(){
         Scanner sc = new Scanner(System.in);
        
        System.out.println("\nPlease enter your player\'s name:");
        setName(sc.nextLine());
        
        System.out.println("\nPlease enter your player\'s health:");
        setHealth(sc.nextInt());
        
        System.out.println("\nPlease enter your player\'s damage:");
        setDamage(sc.nextInt());
        
        System.out.println("\nPlease enter your player\'s defense:");
        setDefense(sc.nextInt());
        
        System.out.println("Your player has been saved with the following information:\n" +
        "Name:\t" + getName() + "\n" +
        "Health:\t" + getHealth() + "\n" +
        "Damage:\t" + getDamage() + "\n" +
        "Defense:\t" + getDefense()
         );
    }

}