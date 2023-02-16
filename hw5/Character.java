package org.future.code.homework.hw5;

public abstract class Character {
    private String name;
    private int strength;
    private int agility;
    private int health;

    public Character(String name, int strength, int agility, int health) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name + ".");
    }

    public int calculatePower() {
        return (strength * agility + health) / 2;
    }
}

