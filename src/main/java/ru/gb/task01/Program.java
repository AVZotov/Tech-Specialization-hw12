package ru.gb.task01;

import ru.gb.task01.entities.Animal;
import ru.gb.task01.entities.Cat;
import ru.gb.task01.entities.Dog;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Dusya", "Myau"));
        animals.add(new Dog("Sharick", "Gav"));
    }
}
