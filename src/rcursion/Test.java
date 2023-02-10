package rcursion;

import java.util.Scanner;

public class Test {
    public static void menu() {
        Scanner sv = new Scanner(System.in);
        System.out.println("Введите ограничитель ");
        int b = sv.nextInt();
        metod(0,b);
    }
    /**
     * РЕКУРСИВНЫЙ МЕТОД от 0 до b
     */
    public static void metod(int a ,int b) {
        if (a <= b) {
            System.out.println(a);
            a++;
            metod( a ,b);
        }
    }
}
