package com.bernikov;


/*    Создать классы Собака и Кот с наследованием от класса Животное.
            Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
            У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
            Добавить подсчет созданных котов, собак и животных.*/


abstract class Animal {
    protected String name;
    public static int counterAnimal = 0;

    public Animal() {
        counterAnimal++;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void run(int n);

    abstract void sail(int n);
}
