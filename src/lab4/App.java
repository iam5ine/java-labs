//вариант 9
package lab4;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.getDefault());
        System.out.print("Na ="); int na = sc.nextInt();
        System.out.print("Nb ="); int nb = sc.nextInt();
        System.out.print("Nc ="); int nc = sc.nextInt();

        double[] a = new double[na];
        double[] b = new double[nb];
        double[] c = new double[nc];

        System.out.println("\n Ввод А:");
        Array.input(sc, a);
        System.out.println("\n Ввод B:");
        Array.input(sc, b);
        System.out.println("\n Ввод C:");
        Array.input(sc, c);

        System.out.println("\n До сортировки:");
        Array.print("A", a);
        Array.print("B", b);
        Array.print("C", c);

        Array.sort(a);
        Array.sort(b);
        Array.sort(c);

        System.out.println("\nПосле сортировки:");
        Array.print("A", a);
        Array.print("B", b);
        Array.print("C", c);

        sc.close();
    }
}