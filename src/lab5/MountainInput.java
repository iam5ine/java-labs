package lab5;

import java.util.Scanner;

public class MountainInput {

    // самая высокая гора
    public static Mountain findTallest(Mountain[] mountains) {
        Mountain tallest = mountains[0];
        for (Mountain mount : mountains) {
            if (mount.getHeight() > tallest.getHeight()) {
                tallest = mount;
            }
        }
        return tallest;
    }

    // горы выше 1км
    public static void printAbove1km(Mountain[] mountains) {
        System.out.println("\nГоры выше 1км: ");
        boolean found = false;
        for (Mountain mount : mountains) {
            if (mount.getHeight() > 1000) {
                System.out.println(mount);
                found = true;
            }
        }
        if (!found) System.out.println("Таких гор нет");
    }

    // сортировка по возрастанию высоты
    public static void sortHeight(Mountain[] mountains) {
        for (int passNum = 0; passNum < mountains.length - 1; passNum++) {
            for (int currPos = 0; currPos < mountains.length - passNum - 1; currPos++) {
                if (mountains[currPos].getHeight() > mountains[currPos + 1].getHeight()) {
                    Mountain temp = mountains[currPos];
                    mountains[currPos] = mountains[currPos + 1];
                    mountains[currPos + 1] = temp;
                }
            }
        }
    }

    // поиск и редактирование
    public static void searchAndEdit(Scanner scan, Mountain[] mountains) {
        System.out.print("\nВведите название горы для поиска: ");
        String search = scan.nextLine();

        for (Mountain mountain : mountains) {
            if (mountain.getName().equalsIgnoreCase(search)) {
                System.out.println("Найдено: " + mountain);
                System.out.println("Изменить: 1-Название, 2-Место, 3-Высота");
                int choice = scan.nextInt();
                scan.nextLine();

                switch (choice) {
                    case 1 -> {
                        System.out.println("Новое название: ");
                        mountain.setName(scan.nextLine());
                    }
                    case 2 -> {
                        System.out.println("Новое место: ");
                        mountain.setLocation(scan.nextLine());
                    }
                    case 3 -> {
                        System.out.println("Новая высота: ");
                        int newHeight = scan.nextInt();
                        scan.nextLine();
                        mountain.setHeight(newHeight);
                    }
                }
                System.out.println("После изменения: " + mountain);
                return;
            }
        }
        System.out.println("Гора не найдена");
    }

    public static void printAllMountains(Mountain[] mountains) {
        System.out.println("\nСписок гор:");
        for (Mountain mountain : mountains) {
            System.out.println(mountain);
        }
    }
}