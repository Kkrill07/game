package rcursion;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите step");
        double step = in.nextDouble();
        System.out.println("Введите start ");
        double start = in.nextDouble();
        System.out.println("Введите end");
        double end = in.nextDouble();

        step = (start - end) / 2;
        double x = start + step;
        double sum = 0;
        double i = 1;
        trapeciy(start, end, step, x, i, sum,end);
    }

    public static double trapeciy(double start, double end, double step, double n, double x, double i, double sum) {

        double f=(x) = x * 2;
        if (i <= (n - 1)) {
            sum = sum + f / (x);
            x = start + step;
            i = i + 1;
            return trapeciy(start, end, step, x, i, sum, h(x));
        } else return sum * step;

    }

    public static double h(double x) {
        return x * 3 / 2;
    }

    public static double f1(double start, double end, double step, double sum1) {
        qwe1(start, start + step, step, sum1);
        return sum1;
    }

    public static double qwe1(double left, double right, double step, double sum) {
        double x = (left + right) / 2;
        return x;
    }

}
