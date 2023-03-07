package oop;

import java.util.Scanner;

public class Masiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();

        int[] a = new int[n];


        for (int i = 0; i < a.length; i++) {

            a[i] = b;
        }


        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }


    }
}

