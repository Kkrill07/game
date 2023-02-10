package rcursion;

import java.util.Scanner;

public class Test1 {
    public static void menu() {
        Scanner sv = new Scanner(System.in);
        System.out.println("введите число ");
        int i = sv.nextInt();
        System.out.println(sum2(i));



    }

    /**
     * Метод вывода чисел по убыванию
     * (от числа i до 0
     */
    public static int sum2(int i) {
        if ( i > 0) {
            System.out.println(i);
            return sum2(i-1);
        }
        return 0;
    }

}
