package mOOP;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StorageUi implements IStudentUI {

    private static final String WELCOME_TEXT = """
            Добро пожаловать в программу Хранилище Студентов.
            Версия: v1.01
            Автор: Попов Кирилл
            """;

    private static final String MENU_TEXT = """
            Выберите пункт меню:
            1. Вставить студента;
            2. Удалить;
            3. средняя оценка 
            4. показать студентов 
            5. поиск студента 
            6. поставить оценку 
            """;

    private final Scanner scanner = new Scanner(System.in);
    private final IStudentStorage storage;


    public StorageUi() {
        System.out.println(WELCOME_TEXT);
        System.out.println("Ведите на какое кол-во студентов вы хотите создать хранилище");
        int size = scanner.nextInt();
        storage = new StudentStorage(size);
        menu();
    }

    private void menu() {
        System.out.println(MENU_TEXT);
        int check = 0;
        try {
            check = scanner.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("Используйте исключительно цифры при вводе.");
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        switch (check) {
            case 1 -> put();
            case 2 -> remove();
            case 3 -> rate();
            case 4 -> showStudents();
            case 5 -> searchStudents();
            case 6 -> getrate();
            default -> {
                System.out.println("Выберите правильный пункт меню");
            }
        }
        menu();
    }

    @Override
    public void put() {
        System.out.println("Создание студента");
        System.out.println("Введите имя студента");
        String name = scanner.next();
        System.out.println("Введите возраст студента");
        int age = scanner.nextInt();
        Student student = new Student(name, age);
        storage.put(student);

    }


    @Override
    public void remove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("видите имя  студента для удаления");
        String name = scanner.next();
        System.out.println("видите возраст студента для удаления");
        int age = scanner.nextInt();
        var student = new Student(name, age);
        storage.remove(student);
        if (student != null) {
            System.out.println(student);
        }
    }

    @Override
    public void rate() {

    }

    @Override
    public void showStudents() {
        System.out.println(Arrays.toString(storage.allstudents()));
    }

    @Override
    public void searchStudents() {
        if (storage != null) {
            System.out.println(storage);
        }

    }

    @Override
    public void getrate() {


    }
}


