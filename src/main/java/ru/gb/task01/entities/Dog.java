package ru.gb.task01.entities;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
        sound = "Gav";
    }

    public void makeSound(){
        System.out.printf("sound: %s\n", sound);
    }
}
