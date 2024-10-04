import java.util.Scanner;

public class Lesson_2 {
    public static void first() {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            switch (n) {
                case 1, 2, 12:
                    System.out.println("Зима");
                    break;
                case 3, 4, 5:
                    System.out.println("Весна");
                    break;
                case 6, 7, 8:
                    System.out.println("Лето");
                    break;
                case 9, 10, 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Такого месяца нет");
                    break;
            }
        } else {
            System.out.println("Введите число");
            first(); // Замкнуло чёт)
        }
    }

    public static void second() {
        int num = 0;

        while (num <= 25) {
            System.out.printf("%d ", num);
            num++;
        }
    }

    public static void third() {
        for (int i = 10; i <= 20; i++) {
            if (i % 2 == 0 && i > 10) {
                System.out.println(i);
            }
        }
    }

    public static void fourth() {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println("Число чётное");
            } else {
                System.out.println("Число не чётное");
            }
        } else {
            System.out.println("Введите число");
            fourth();
        }
    }

    public static void fifth() {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            if (t > -5){
                System.out.println("Warm");
            } else if (-5 > t && t > -25) {
                System.out.println("Normal");
            } else {
                System.out.println("Cold");
            }
        } else {
            System.out.println("Введите число");
            fifth();
        }
    }

    public static void sixth() {
        for (int i = 10; i <= 20; i++) {
            System.out.printf("%.0f ",Math.pow(i, 2));
        }
    }

    public static void seventh() {
        int res = 0;
        int num = 7;

        do {
            res += num;
            System.out.println(res);
        } while (res + num < 100);
    }

    public static void zvezda() {
        System.out.println("Введите целое положительное число");
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int res = 0;
            if (n < 0) {
                zvezda();
            } else {
                for (int i = 1; i <= n; i++) {
                    res += i;
                }
                System.out.println(res);
            }
        } else {
            zvezda();
        }
    }
}
