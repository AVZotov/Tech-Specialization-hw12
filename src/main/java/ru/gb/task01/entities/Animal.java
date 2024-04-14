package ru.gb.task01.entities;

public abstract class Animal {
    private final String name;
    private final String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void makeSound(){
        System.out.printf("%s, said: %s", name, sound);
    }
}
