package rcursion;

import java.util.Scanner;

public class
Test6 {
    public static void menu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число 1");
        int i = in.nextInt();
        System.out.println("Введите число 2");
        int j = in.nextInt();

        int center = (i + j) / 2;

        System.out.println(half1(i, center));
        System.out.println("Центер=   " + center);
        System.out.println(half2(j, center));
        Test5.menu();
    }

    public static String half1(int i, int center) {
        if (i <= center) {
            if ((i % 2) == 0) {
                System.out.println(i);
                return half1(i + 1, center);
            } else {
                return half1(i + 1, center);
            }
        }
        return "";
    }

    public static String half2(int j, int center) {
        if (center <= j) {
            if ((center % 2) != 0) {
                System.out.println(center);
                return half2(j, center + 1);
            } else {
                return half2(j, center + 1);
            }
        }
        return "";
    }
}
