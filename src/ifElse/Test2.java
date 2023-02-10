package ifElse;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("A");
        double a = input.nextDouble();
        System.out.println("B");
        double b = input.nextDouble();
        System.out.println("C");
        double c = input.nextDouble();


        double Q = (Math.pow(a, 2) - (3 * b)) / 9;
        System.out.println("Q = " + Q);

        double R = ((2 * Math.pow(a, 3)) - (9 * a * b) + (27 * c)) / 54;
        System.out.println("R = " + R);

        double S = Math.pow(Q, 3) - Math.pow(R, 2);
        System.out.println("S = " + S);

        if (S > 0) {
            System.out.println("S < 0");
            double f, x1, x2, x3;
            f = (1.0 / 3.0) * Math.acos(R / Math.sqrt(Math.pow(-Q, 3)));
            System.out.println("Fi = " + f);
            x1 = (2 * Math.sqrt(-Q)) * Math.cos(f) - (a / 3);
            x2 = (2 * Math.sqrt(-Q)) * Math.cos((f + ((2.0 / 3.0) * Math.PI))) - (a / 3);
            x3 = (2 * Math.sqrt(-Q)) * Math.cos((f - ((2.0 / 3.0) * Math.PI))) - (a / 3);

            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2 + " x3 = " + x3);
        } else if (S < 0) {
            if (Q < 0) {
                double f, x1, real, imaginary;
                f = (1.0 / 3.0) * Math.acos((Math.abs(R) / Math.sqrt(Q * Q * Q)));
                x1 = ((-2 * Math.signum(R)) * (Math.sqrt(Q) * Math.cosh(f)) - (a / 3));
                real = Math.signum(R) * Math.sqrt(Q) * Math.cosh(f) - (a / 3);
                imaginary = Math.sqrt(3) * Math.sqrt(Q) * Math.sinh(f);
                String x2 = String.format("%s + %si", real, imaginary);
                String x3 = String.format("%s - %si", real, imaginary);
                System.out.println("Корни уравнения: х1 = " + x1 + ", x2 = " + x2 + " х3 = " + x3);
            }
            if (Q > 0) {
                double x1, real, imaginary, f;
                f = (1.0 / 3.0) * (1 / Math.cosh(Math.abs(R) / Math.sqrt(Math.pow(Math.abs(Q), 3))));
                x1 = -2 * Math.signum(R) * Math.sqrt(Math.abs(Math.pow(Q, 3)));
                real = Math.signum(R) * Math.sqrt(Math.abs(Q)) * Math.cosh(f) - (a / 3);
                imaginary = Math.sqrt(3) * Math.sqrt(Math.abs(Q) * Math.cosh(f));
                String x2 = String.format("%s + %si", real, imaginary);
                String x3 = String.format("%s - %si", real, imaginary);
                System.out.println("Корни уравнения: х1 = " + x1 + ", x2 = " + x2 + " х3 = " + x3);
            } else {
                double x1, imaginary, real;
                x1 = -Math.pow(Math.cbrt(c - ((Math.pow(a, 3)) / 27)), 3) - (a / 3);
                real = -(a + x1 / 2);
                imaginary = Math.sqrt(Math.abs((a - 3 * x1) * (a + x1) - 4 * b));
                String x2 = String.format("%s + %si", real, imaginary);
                String x3 = String.format("%s - %si", real, imaginary);
                // System.out.println("Корни уравнения: х1 = " + x1 + ", x2 = " + x2 + " х3 = " + x3);

            }
        } else {
            double x1, x2;
            x1 = -2 * Math.signum(R) * Math.sqrt(Q) - (a / 3);
            x2 = Math.signum(R) * Math.sqrt(Q) - (a / 3);
            System.out.println("Корни уравнения: х1 = " + x1 + ", x2 = " + x2);
        }
    }
}
