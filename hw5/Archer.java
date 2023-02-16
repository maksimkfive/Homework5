package org.future.code.homework.hw5;

public class Archer extends Character {
    private int shootingSkill;

    public Archer(String name, int strength, int agility, int health, int shootingSkill) {
        super(name, strength, agility, health);
        this.shootingSkill = shootingSkill;
    }

    public int getShootingSkill() {
        return shootingSkill;
    }

    public void setShootingSkill(int shootingSkill) {
        this.shootingSkill = shootingSkill;
    }

    @Override
    public void sayHello() {
        System.out.println("Hey, I'm an archer named " + getName() + ".");
    }

    @Override
    public int calculatePower(){
        int basePower = super.calculatePower();
        int shootingPower = shootingSkill * 10;
        return basePower + shootingPower;
    }
}
