package lab4;

import java.util.Scanner;


public class Array {
    public static void input(Scanner sc, double[] a) {
        for (int i = 0; i < a.length; i++) {
        System.out.print("a[" + i + "]= ");
        a[i] = sc.nextDouble();
    }
}
public static void sort(double[]a) {
    for (int i = 0; i < a.length - 1; i++) {
        for (int j = 0; j < a.length - i - 1; j++) {
            if (a[j] > a[j + 1]) {
                double t = a[j];
                a[j] = a[j + 1];
                a[j + 1] = t;
            }
        }
    }
}
public static void print(String name, double[] a) {
        System.out.print(name + ": [ ");
        for (double x : a) {
            System.out.printf("%.2f ", x);
        }
        System.out.println("]");
    }
}
