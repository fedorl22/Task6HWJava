package hw6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Метод filter() работает следующим образом:
 * 1. Выбор критерия фильтрации.
 * 2. После выбора пользователя(в зависимости от выбора) запрашиваем минимальное
 * значение ОЗУ или объема ЖД; операционную систему или цвет; максимальную цену
 * покупки и выводим все ноутбуки из магазина подходящие по эти параметры.
 * 3. Если пользователь выбрал некорректный критерий, то выводим сообщение об
 * ошибке.
 * 
 * 
 */
public class Filters {
    private final static Set<NoteBook> notebooks = new HashSet();

    /**
     * Метод add() для добавления новых элементов.
     * 
     * 
     */
    public void add(NoteBook notebook) {
        notebooks.add(notebook);
    }

    /**
     * Метод print() для вывода массива.
     * 
     * 
     */
    public void print() {
        for (NoteBook notebook : notebooks) {
            System.out.println(notebook.getBrand() + " " + notebook.getModel() + " " + notebook.getRamSize() + "GB"
                    + notebook.getHddSize() + "GB " + notebook.getOs() + "GB" + " " + notebook.getColor() + " "
                    + notebook.getPrice() + "Руб.");
        }
    }

    /**
     * Метод filter() работает следующим образом:
     * 1. Выбор критерия фильтрации.
     * 2. После выбора пользователя(в зависимости от выбора) запрашиваем минимальное
     * значение ОЗУ или объема ЖД; операционную систему или цвет; максимальную цену
     * покупки и выводим все ноутбуки из магазина подходящие по эти параметры.
     * 3. Если пользователь выбрал некорректный критерий, то выводим сообщение об
     * ошибке.
     * 
     * 
     */
    public void filter() {
        try (Scanner scanner = new Scanner(System.in, "cp866")) {
            System.out.println("Наш магазин приветствует Вас.");
            while (true) {

                System.out.println(" Выберете параметр отбора ноутбука:");
                System.out.println("1 - ОЗУ");
                System.out.println("2 - Объем ЖД");
                System.out.println("3 - Операционная система");
                System.out.println("4 - Цвет");
                System.out.println("5 - Цена");
                System.out.println("Для выхода наберите любую букву");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Введите минимальный объем ОЗУ (в гигабайтах):");
                        int minRam = scanner.nextInt();
                        System.out.println("Введите максимальный объем ОЗУ (в гигабайтах):");
                        int maxRam = scanner.nextInt();
                        for (NoteBook notebook : notebooks) {
                            if (notebook.getRamSize() >= minRam && notebook.getRamSize() <= maxRam) {
                                System.out.println(notebook.getBrand() + "   " + notebook.getModel() + "   "
                                        + notebook.getRamSize() + " GB "
                                        + notebook.getHddSize() + " GB " + notebook.getOs() + "   "
                                        + notebook.getColor() + "   " + notebook.getPrice() + " Руб.");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Введите минимальный объем ЖД (в гигабайтах):");
                        int minHdd = scanner.nextInt();
                        System.out.println("Введите максимальный объем ЖД (в гигабайтах):");
                        int maxHdd = scanner.nextInt();
                        for (NoteBook notebook : notebooks) {
                            if (notebook.getHddSize() >= minHdd && notebook.getHddSize() <= maxHdd) {
                                System.out.println(notebook.getBrand() + "   " + notebook.getModel() + "   "
                                        + notebook.getRamSize() + " GB "
                                        + notebook.getHddSize() + " GB " + notebook.getOs() + "   "
                                        + notebook.getColor() + "   " + notebook.getPrice() + " Руб.");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Выберите операционную систему:");
                        String s = scanner.next();
                        for (NoteBook notebook : notebooks) {
                            if (notebook.getOs().equals(s)) {
                                System.out.println(notebook.getBrand() + "   " + notebook.getModel() + "   "
                                        + notebook.getRamSize() + " GB "
                                        + notebook.getHddSize() + " GB " + notebook.getOs() + "   "
                                        + notebook.getColor() + "   " + notebook.getPrice() + " Руб.");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Выберите цвет:");
                        String c = scanner.next();
                        for (NoteBook notebook : notebooks) {
                            if (notebook.getColor().equals(c)) {
                                System.out.println(notebook.getBrand() + "   " + notebook.getModel() + "   "
                                        + notebook.getRamSize() + " GB "
                                        + notebook.getHddSize() + " GB " + notebook.getOs() + "   "
                                        + notebook.getColor() + "   " + notebook.getPrice() + " Руб.");
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Введите максимальную цену в рублях:");
                        Double maxprice = scanner.nextDouble();
                        System.out.println("Введите минимальную цену в рублях:");
                        Double minprice = scanner.nextDouble();
                        for (NoteBook notebook : notebooks) {
                            if (notebook.getPrice() >= minprice && notebook.getPrice() <= maxprice) {
                                System.out.println(notebook.getBrand() + "   " + notebook.getModel() + "   "
                                        + notebook.getRamSize() + " GB "
                                        + notebook.getHddSize() + " GB " + notebook.getOs() + "   "
                                        + notebook.getColor() + "   " + notebook.getPrice() + " Руб.");
                            }
                        }
                        break;
                    default:
                        System.out.println("Некорректный выбор, повторите попытку выберите цифру от 1 до 5.");
                }
            }
        }
    }

}