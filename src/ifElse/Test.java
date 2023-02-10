package ifElse;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int sum = 0;
        int help = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                какая из названных планет самая жаркая?
                1)юпитер
                2)марс
                3)земля
                4)венера
                                zalupa     
                5)обратится к залу  """);
        int choyce = scanner.nextInt();

        if (choyce == 4) {
            sum = 10;
            System.out.println("правильный ответ ваш баланс   " + sum);
        } else if (choyce == 5) {
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
        }
        choyce = scanner.nextInt();
        System.out.println("""
                Какая самая глубокая река в мире?
                1)конг
                2)янцзы
                3)дунай
                4)замбей
                                       
                5)обратится к залу  """);
        int choyce1 = scanner.nextInt();
        if (choyce1 == 4) {
            sum = 10;
            System.out.println("правильный ответ ваш баланс   " + sum);
        } else if (choyce == 5) {
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
            System.out.println("не правильный ответ ");
        }
        choyce = scanner.nextInt();
        System.out.println("""
                Какая самая высокая горы в мире?
                1)чогори
                2)Эверест
                3)Канченджанга
                4)Лхоцзе
                                       
                5)обратится к залу  """);
        int choyce2 = scanner.nextInt();
        if (choyce2 == 4) {
            sum = 10;
            System.out.println("правильный ответ ваш баланс   " + sum);
        } else if (choyce == 5) {
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
            System.out.println("не правильный ответ ");
        }
    }

}
