package rcursion;

import java.util.Scanner;

public class Test4 {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int i = scanner.nextInt();
        System.out.println(factorial(i));


    }

    /**
     * Метод вычисляющий факториал числа i
     */
    public static int factorial(int i) {
        if (i != 0) {
            return i * factorial(i - 1);
        }
        return 1;
    }
}
