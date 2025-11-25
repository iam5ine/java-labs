package lab5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько гор:");
        int count=scan.nextInt();
        scan.nextLine();

        Mountain[] mountains = new Mountain[count];

        for (int countmount = 0; countmount < count; countmount++) {
            System.out.println("\nГора "+ (countmount + 1) + ":");
            System.out.println("Название: "); String name = scan.nextLine();
            System.out.println("Место: "); String local = scan.nextLine();
            System.out.println("Высота (м): "); int height = scan.nextInt();
            scan.nextLine();
            mountains[countmount] = new Mountain(name, local, height);
        }
        while (true) {
            System.out.println("\n"+"=".repeat(40));
            System.out.println("1.Самая высокая");
            System.out.println("2.Гора выше 1000м");
            System.out.println("3.Отсортивать по высоте");
            System.out.println("4.Найти и изменить гору");
            System.out.println("5.Показаьть все");
            System.out.println("0.Выход");
            System.out.print("Выбор: ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1 -> System.out.println("Самая высокая: " + MountainInput.findTallest(mountains));
                case 2 -> MountainInput.printAbove1km(mountains);
                case 3 -> {
                    MountainInput.sortHeight(mountains);
                    System.out.println("Отсортировано");
                    MountainInput.printAllMountains(mountains);
                }
                case 4 -> MountainInput.searchAndEdit(scan, mountains);
                case 5 -> MountainInput.printAllMountains(mountains);
                case 0 -> {
                    return;
                }
            }
        }

    }
}