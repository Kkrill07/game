package rcursion;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sum(scanner.nextInt(), 1,0));
    }
    public static int sum(int i,int j,int sum){
        if(j <= i){
            if (i % j == 0)
                sum = sum + j;
            return sum(i,++j,sum);
        }
        return sum;
    }
}
