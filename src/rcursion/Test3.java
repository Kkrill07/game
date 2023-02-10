package rcursion;

import java.util.Scanner;

public class Test3 {
    public static void menu (){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите число ");
        int  i = scanner.nextInt();
        System.out.println("Сумма =" + sum(i,0,0));

    }
    /**
     * Метод который вычисляет сумму всех чисел
     * (от 0 до числа i)
     */
    public static int sum(int i,int j,int sum){
        if(j <= i){
            sum = sum + j;
            return sum(i,++j,sum);
        }
        return sum;





    }
}
