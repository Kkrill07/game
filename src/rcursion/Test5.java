package rcursion;

import java.util.Scanner;

public class Test5 {
    public static void menu() {
        Scanner sv = new Scanner(System.in);
        System.out.println("Введите число ");
        int num = sv.nextInt();

        System.out.println(sum3(num));

    }

    /**
     * Метод вывода чисел из десятич В ДВОИЧНЫЕ !
     */

    public static String sum3(int sum) {
        return sum > 0 ? sum3(sum / 2) + (sum % 2) : "";
    }
}
