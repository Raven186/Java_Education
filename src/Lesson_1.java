public class Lesson_1 {
    public static void first() {
        int b = 21;
        int c = 1;
        int a = 4 * (b + c - 1) / 2;

        System.out.println("a = " + a);
    }

    public static void second() {
        int n = 26;
        int m = n / 10;
        int v = n - m * 10;
        int sum = m + v;
        System.out.println("sum = " + sum);
    }

    public static void third() {
        int n = 777;
        int sum = String.valueOf(n).chars().map(Character::getNumericValue).sum();
        System.out.println("sum = " + sum);
    }

    public static void fourth() {
        float n = 21.5f;
        System.out.println("n = " + Math.round(n));
    }

    public static void fifth() {
        int q = 21;
        int w = 8;

        int dR = q % w;
        double dQ = Math.floorDiv(q, w);

        System.out.println("dR = " + dR);
        System.out.printf("dQ = %.0f",  dQ);
    }

    public static void star() {
        int a = 1;
        int b = 2;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
