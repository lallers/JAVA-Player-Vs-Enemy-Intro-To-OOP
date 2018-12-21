package com.project.pve;

import java.util.Scanner;
import java.awt.Window.Type;
import java.util.Random;

/*****************************************************************
 * Enemy.java Function : This program creates player and enemy coordinates
 *****************************************************************/

public class Enemy extends Player {

    private String type;
    private String spcatk;

    public Enemy() {
        super();
        this.type = "Star Boy";
        this.spcatk = "Super cool attack move";
    }

    public Enemy(String name, int health, int damage, int defense, String type) {
        super(name, health, damage, defense);
        this.type = type;
        this.spcatk = spcatk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getSpcAtk() {
        return spcatk;
    }

    public void setSpcAtk(String type) {
        this.spcatk = spcatk;
    }

    private String[] TypeOptions() {
        String[] typeOptions = new String[3];

        typeOptions[0] = "Star Boy,100,8,5";
        typeOptions[1] = "Bear,80,3,1";
        typeOptions[2] = "Unicorn,9000,69,69";
        return typeOptions;
    }

    private String getTypeName(String type) {
        return type.split(",")[0];
    }

    public int randVal(int val) {
        Random rand = new Random();
        switch (val) {
        case 1:
            return rand.nextInt(50) + 1;
        case 2:
            return rand.nextInt(8) + 1;
        default:
            return rand.nextInt(20) + 1;
        }
    }

    public void characterCreate() {
        Scanner sc = new Scanner(System.in);
        String[] SelectType = TypeOptions();

        System.out.println("Please enter your enemy\'s name:\n");
        setName(sc.nextLine());

        System.out.println("Please select your enemy\'s type:\n");
        for (int i = 0; i < SelectType.length; i++) {
            System.out.println((i + 1) + ": " + getTypeName(SelectType[i]));
        }

        String[] TypeSelected = SelectType[sc.nextInt()-1].split(",");

        setType(TypeSelected[0]);
        setHealth(Integer.parseInt(TypeSelected[1]));
        setDamage(Integer.parseInt(TypeSelected[2]));
        setDefense(Integer.parseInt(TypeSelected[3]));

        System.out.println("Your Enemy has been saved with the following information:\n" + "Name:\t" + getName() + "\n"
                + "Health:\t" + getHealth() + "\n" + "Damage:\t" + getDamage() + "\n" + "Defense:\t" + getDefense()
                + "\n" + "Type:\t" + getType() + "\n" + "Special Attack:\t" + getSpcAtk());

    }
}