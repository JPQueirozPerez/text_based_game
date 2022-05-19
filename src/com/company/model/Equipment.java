package com.company.model;

public class Equipment {
    private int strength;
    private int speed ;
    private int defense;

    public Equipment(int strength, int speed, int defense){
        this.strength = strength;
        this.speed = speed;
        this.defense = defense;

    }

    public int getStrength() {
        return strength;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDefense() {
        return defense;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "strength=" + strength +
                ", speed=" + speed +
                ", defense=" + defense +
                '}';
    }
}
