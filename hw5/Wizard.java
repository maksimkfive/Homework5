package org.future.code.homework.hw5;

public class Wizard extends Character {
    private int mana;

    public Wizard(String name, int strength, int agility, int health, int mana) {
        super(name, strength, agility, health);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public void sayHello() {
        System.out.println("Wassup, I am a wizard named " + getName() + ".");
    }

    @Override
    public int calculatePower() {
        int basePower = super.calculatePower();
        int manaPower = mana * 10;
        return basePower + manaPower;
    }
}