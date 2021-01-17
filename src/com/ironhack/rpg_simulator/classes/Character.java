package com.ironhack.rpg_simulator.classes;

import com.ironhack.rpg_simulator.interfaces.Attacker;

public abstract class Character implements Attacker {

        //propiedades
        //El id es static, porque tiene que ser un idenficador único, independientemente del número de instancias
        private static int id = 0;
        private String name;
        private int hp;
        private boolean isAlive = true;

        public String getClassName() {
                return className;
        }

        public void setClassName(String className) {
                this.className = className;
        }

        private String className = null;

        public Character(String name, int hp, boolean isAlive) {
                id++;
                setName(name);
                setHp(hp);
                setAlive(isAlive);
        }


        //implementamos damage, no sera una clase abstracta porque todos las clases que heredan, lo reciben igual
        public void damage(int damage) {
                this.hp -= damage;
                if(this.hp <= 0) {
                        this.isAlive = false;
                }
        }


        public String toString(){
                return getName() + " " + getClassName() + " " + getHp();
        }

        //getters and setters

        public static int getId() {
                return id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getHp() {
                return hp;
        }

        public void setHp(int hp) {
                this.hp = hp;
        }

        public boolean isAlive() {
                return isAlive;
        }

        public void setAlive(boolean alive) {
                isAlive = alive;
        }
}

