package com.bernikov;

public class Cat extends Animal {
    public static int counterCat = 0;

    public Cat(String name) {
        this.name = name;
        counterCat++;
    }

    @Override
    void run(int n) {
        if (n >= 200) {
            n = 200;
            System.out.println("Кот " + name + " пробежал " + n + " метров и устал");
        } else System.out.println("Кот " + name + " пробежал " + n + " метров");
    }

    @Override
    void sail(int n) {
        System.out.println("Семейство кошачих не умеют плавать!");
    }
}
