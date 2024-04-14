package ru.gb.task01;

import ru.gb.task01.entities.Animal;
import ru.gb.task01.entities.Cat;
import ru.gb.task01.entities.Dog;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        List<Animal> animals = new ArrayList<>();

        Class<?> dogClass = Dog.class;
        Class<?> catClass = Cat.class;

        //Creating instances of Dog and Cat via reflection API
        Constructor[] dogConstructors = dogClass.getConstructors();
        Constructor[] catConstructors = catClass.getConstructors();

        animals.add((Animal) dogConstructors[0].newInstance("Sharick"));
        animals.add((Animal) catConstructors[0].newInstance("Dusya"));

        Class<?> animalClass = Animal.class;

        //Getting declared methods of base class for invocation
        Method[] animalMethods = animalClass.getDeclaredMethods();

        //Invoking base methods
        for (Animal animal : animals){

            for (Method method : animalMethods) method.invoke(animal);

            Method[] childClassMethods = animal.getClass().getDeclaredMethods();

            //Checking if childClass contains makeSound method
            for (Method method : childClassMethods){
                if (method.getName().equals("makeSound")) method.invoke(animal);
            }
        }
    }
}
