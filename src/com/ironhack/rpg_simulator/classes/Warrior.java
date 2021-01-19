package com.ironhack.rpg_simulator.classes;

public class Warrior extends Character {

    //propieties
    private int stamina;
    private int strength;

    //Constructor
    public Warrior(String name, int hp, int stamina, int strength) {
        super(name, hp);
        this.stamina = stamina;
        this.strength = strength;
        setClassName("Warrior");
    }

    //Implement attack into warrior. we can get between a heavy attack and a weak attack
    public int[] attack() {
        //We insert the damage into an int
        int[] damage = new int[2];
        //This is a heavy attack
        if( getStamina()>= 5 ) {
            damage[0] = getStrength();
            setStamina(getStamina() - 5);
            damage[1] = 1;
        }
        //This is a Weak attack
        else {
            damage[0] = (int)(getStrength()/2);
            setStamina(getStamina() - 5);
            damage[1] = 2;
        }
        return damage;
    }

    //we use this method to show a warrior in console
    public String toString(){
        return "Name: " +getName()  + "\n Type: Warrior\nHP: " +
                getHp() + "\nStamina: " + getStamina() +"\nStrength: " + getStrength() + "\n";
    }

    //getters and setters
    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


}



