package rcursion;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите a");
        double a = in.nextDouble();
        System.out.println("Введите b");
        double b = in.nextDouble();
        System.out.println("Введите s");
        double s = in.nextDouble();
        double y = 0.618 * a + 0.382 * b;
        double z = 0.382 * a + 0.618 * b;
        double A = Math.pow(y, 2) - 5;
        double B = Math.pow(z, 2) - 5;
        gold(a, b, s, y, z, A, B);
    }

    public static double gold(double a, double b, double s, double y, double z, double A, double B) {
        if (A < B) {
            b = z;
            if ((b - a) < s) {
                double x = (a + b) / 2;
                System.out.println("X = " + x);
                return x;
            } else {
                z = y;
                B = A;
                y = 0.618 * a + 0.382 * b;
                A = Math.pow(y, 2) ;
                return gold(a, b, s, y, z, A, B);
            }
        } else {
            a = y;
            if ((b - a) < s) {
                double x = (a + b) / 2;
                System.out.println("X = " + x);
                return x;
            } else {
                y = z;
                A = B;
                z = 0.382 * a + 0.618 * b;
                B = Math.pow(z, 2);
                return gold(a, b, s, y, z, A, B);
            }
        }
    }
}
