// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook
// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
// Класс сделать в отдельном файле
// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих

package hw6;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        NoteBook notebook1 = new NoteBook("Honor", "MagicBook", 16, 512,
                "Windows", "Синий", 84999.99);
        NoteBook notebook2 = new NoteBook("Lenovo", "ThinkPad",  8, 256,
                "Windows", "Черный", 89999.99);
        NoteBook notebook3 = new NoteBook("Asus", "ZenBook",  16, 256, "Windows",
                "Золотой", 79999.99);
        NoteBook notebook4 = new NoteBook("Apple", "MacBook Pro",  16, 512, "macOS",
                        "Серый", 149999.99);
        NoteBook notebook5 = new NoteBook("Dell", "Inspiron",  32, 1024, "Windows",
                        "Красный", 219999.99);
        Filters notebooks = new Filters();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(new NoteBook("Honor ", "MagicBook ",  8, 256,
                "  Windows", "Зеленый", 64999.99));

        notebooks.print();     
        notebooks.filter();

    }
}



