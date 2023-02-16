package org.future.code.homework.hw5;

public class Tester extends Character {
    public static final String requiredTesterName = "Test";

    public Tester(String name) {
        super(name, 10, 10, 10);
        if (!name.equals(requiredTesterName)) {
            throw new IllegalTesterNameException("Invalid tester name.");
        }
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I am a tester named " + getName() + ".");
    }

    @Override
    public int calculatePower() {
        return 0;
    }
}
