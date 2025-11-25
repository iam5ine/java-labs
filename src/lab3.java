import java.text.DecimalFormat;

public class lab3 {

    private static final DecimalFormat df = new DecimalFormat("0.000");

    public static void main(String[] args) {

        // Задача 1
        double x1 = 0.5;
        double sum1 = 0;
        for (int n = 1; n <= 10; n++) {
            double chislitel = Math.pow(-1, n) * (2 * n) * Math.pow(x1, 2 * n + 1);
            double znamenatel = fact(2 * n + 1);
            sum1 += chislitel / znamenatel;
        }
        System.out.println("Задача 1: " + String.format("%.3f", sum1));

        //Задача 2
        double x2 = 1;
        double sum2 = 0;
        for (int n = 0; n < 10; n++) {
            sum2 += Math.pow(x2, 2 * n +1) / (2 * n +1);
        }
        System.out.println("Задача 2: " + String.format("%.3f", sum2));

        //Задача 3
        double x3 = 2;
        double sum3 = 0;
        for (int n = 0; n < 10; n++) {
            sum3 += Math.pow(x3, 4 * n + 1) / (4 * n +1);
        }
        System.out.println("Задача 3: " + String.format("%.3f", sum3));

        //Задача 14
        double x4 = 3.4;
        double sum4 = 0;
        for (int n = 0; n < 10; n++) {
            double slagaemoe = Math.pow(-1, n) * Math.pow(x4, 2 * n + 1) * (1 + x4 * x4) / (2 * n +1);
            sum4 += slagaemoe;
        }
        System.out.println("Задача 14: " + String.format("%.3f", sum4));

        //Задача 15
        double x5 = 1.2;
        double sum5 = 0;
        for (int n = 1; n <= 10; n++) {
            double slagaemoe = Math.pow(-1, n - 1) * Math.pow(x5, n) * (1 + x5) /  n;
            sum5 += slagaemoe;
        }
        System.out.println("Задача 15: " + String.format("%.3f", sum5));

        //Задача 16
        double x6 = 2.2;
        double sum6 = x6;
        for (int n = 1; n <= 10; n++) {
            double slagaemoe = Math.pow(-1, n + 1) * Math.pow(x6, 2 * n + 1) / (4 * n * n - 1);
            sum4 += 2 * slagaemoe;
        }
        System.out.println("Задача 16: " + String.format("%.3f", sum6));
    }

    public static long fact(int n) {
        long result=1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
