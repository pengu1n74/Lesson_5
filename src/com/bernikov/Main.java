package com.bernikov;

public class Main {

    public static void main(String[] args) {
        Cat catMarkiz = new Cat("Markiz");
        Cat catPushok = new Cat("Pushok");
        Dog dogRex = new Dog("Rex");
        Dog dogDolly = new Dog("Dolly");
        System.out.println("Котов: " + Cat.counterCat);
        System.out.println("Собак: " + Dog.counterDog);
        System.out.println("Всего животных: " + Animal.counterAnimal);
        catMarkiz.run(100);
        catPushok.run(300);
        catMarkiz.sail(10);
        dogRex.run(100);
        dogDolly.run(600);
        dogRex.sail(15);
        dogDolly.sail(8);

    }
}
