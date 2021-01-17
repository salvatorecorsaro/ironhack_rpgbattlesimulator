package com.ironhack.rpg_simulator.fight.classes;

import com.ironhack.rpg_simulator.classes.Character;

import java.util.ArrayList;
import java.util.List;

public class Graveyard {
    private List<Character> graveyard1;
    private List<Character> graveyard2;

    public Graveyard() {
        this.graveyard1 = new ArrayList<>();
        this.graveyard2 = new ArrayList<>();
    }

    public void addSoldier(int team, Character soldier) {
        if(team == 1) {
            this.graveyard1.add(soldier);
        } else if (team == 2) {
            this.graveyard2.add(soldier);
        }
    }

    public Character getSoldierByIndex(int team, int index) {
        if(team == 1) {
            return graveyard1.get(index);
        } else if (team == 2) {
            return graveyard2.get(index);
        } else {
            return null;
        }
    }

    public List<List<Character>> getAllSoldiers() {
        List<List<Character>> deadSoldiers = new ArrayList<>();
        deadSoldiers.add(graveyard1);
        deadSoldiers.add(graveyard2);
        return deadSoldiers;
    }

}