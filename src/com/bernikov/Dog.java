package com.bernikov;

public class Dog extends Animal {
    public static int counterDog = 0;

    public Dog(String name) {
        this.name = name;
        counterDog++;
    }

    @Override
    void run(int n) {
        if (n >= 500) {
            n = 500;
            System.out.println("Собака " + name + " пробежал " + n + " метров и устал");
        } else System.out.println("Собака " + name + " пробежал " + n + " метров");
    }

    @Override
    void sail(int n) {
        if (n >= 10) n = 10;
        System.out.println("Собака " + name + " проплыл " + n + " метров");
    }
}
