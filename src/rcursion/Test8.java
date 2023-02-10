package rcursion;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("первое ");
        int a = scanner.nextInt();
        System.out.println("второе ");
        int b = scanner.nextInt();

        if (a < b)
            showSimples(a, b);
        else
            showSimples(b, a);

    }

    public static void showSimples(int start, int end) {
        if (start > end)
            return;

        if (isPrime(start))
            System.out.println("Number = " + start + " is simple");

        showSimples(start + 1, end);
    }

    public static boolean isPrime(int number) {
        if (number < 2)
            return false;

        boolean hasDivider = hasDivider(number, number - 1);
        return !hasDivider;
    }

    private static boolean hasDivider(int number, int previous) {
        if (previous <= 1)
            return false;

        if (number % previous == 0)
            return true;

        return hasDivider(number, previous - 1);
    }
}

