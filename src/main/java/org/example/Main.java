package org.example;

interface IAnimal {
    void speak();
}

class Dog implements IAnimal {
    @Override
    public void speak() {
        System.out.println("woof");
    }
}

class Cat implements IAnimal {
    @Override
    public void speak() {
        System.out.println("meow");
    }
}

class AnimalFactory {
    public static IAnimal createAnimal(String animalType) {
        if (animalType.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (animalType.equalsIgnoreCase("cat")) {
            return new Cat();
        } else {
            throw new IllegalArgumentException("Invalid animal type: " + animalType);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        IAnimal dog = AnimalFactory.createAnimal("dog");
        IAnimal cat = AnimalFactory.createAnimal("cat");
        dog.speak();
        cat.speak();
    }
}