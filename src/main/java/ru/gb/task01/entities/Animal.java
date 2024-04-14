package ru.gb.task01.entities;

public abstract class Animal {
    private final String name;
    protected String sound;

    public Animal(String name) {
        this.name = name;
        this.sound = "";
    }

    public void showInfo(){
        System.out.printf("Name: %s, sound: %s\n", name, sound);
    }
}
