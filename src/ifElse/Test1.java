package ifElse;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int sum = 0;
        int help = 1;
        int choyce2;

        System.out.println("""
                какая из названных планет самая жаркая?
                1)юпитер
                2)марс
                3)земля
                4)венера
                                
                5)обратится к залу  """);
        int choice = scanner.nextInt();

        if (choice == 4) {
            sum = 10;
            System.out.println("правильный ответ ваш баланс   " + sum);

        } else if (choice == 5) {
            System.out.println("""   
                    "вы обратились к залу "              
                    1.юпитер 10%
                    2.марс 20%
                    3.земля 20%
                    4.венера 50%""");
            help--;
            System.out.println("ответ 4");



        } else {
            System.out.println("не правильный ответ ");
            return;
        }

        System.out.println("""
                Какая самая глубокая река в мире?
                1)конг
                2)янцзы
                3)дунай
                4)замбей
                                       
                5)обратится к залу  """);
        int choyce1 = scanner.nextInt();
        if (choyce1 == 1) {
            sum = 20;
            System.out.println("правильный ответ ваш баланс   " + sum);
        }  if (choyce1 == 5) {
            System.out.println("""   
                    "вы обратились к залу "              
                    1)конг 50%
                    2)янцзы 10%
                    3)дунай 20%
                    4)замбей 20%
                     """);
            help--;
            System.out.println("ответ 1");
        } else {

            System.out.println("не правильный ответ вы проиграли  ");
            return;
        }


        System.out.println("""
                Какая самая высокая горы в мире?
                1)чогори
                2)Эверест
                3)Канченджанга
                4)Лхоцзе
                                       
                5)обратится к залу  """);
        int choyce3 = scanner.nextInt();

        if (choyce3 == 1) {
            sum = 30;
            System.out.println("правильный ответ ваш баланс   " + sum);
        } else if (choice == 5) {
            System.out.println("""   
                    "вы обратились к залу "              
                    1)чогори 50%
                    2)Эверест 20%
                    3)Канченджанга 20%
                    4)Лхоцзе 10%
                     """);
            help--;
            System.out.println("ответ 1");
        } else {
            System.out.println("не правильный ответ вы проиграли  ");
            return;
        }
    }
}
