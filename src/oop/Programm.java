package oop;

import java.util.Scanner;

public class Programm {


    private static Animal animal;
    static Animal[] animals = new Animal[10];
    static int i = 0;


    public static void main(String[] args) {
        System.out.println("Нажмите 1 что бы добавить");
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        if (q == 1) {
            System.out.println("Вы добавили животное: " + addAnimal());
        }
    }

    private static Animal addAnimal() {
        Scanner scanner = new Scanner(System.in);
        if (i >= 10) {
            return null;
        }
        System.out.println("Введите имя животного");
        String name = scanner.next();
        System.out.println("Введите вес");
        double weight = scanner.nextDouble();
        System.out.println("Введите цвет");
        String color1 = scanner.next();
        System.out.println("Вид животного");
        String view = scanner.next();
        animal = new Animal(name, weight, color1, view);
        animals[i] = animal;
        i++;
        return animal;
    }
}

