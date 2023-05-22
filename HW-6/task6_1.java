import java.util.*;

class Laptop {
    String model;
    int storageCapacity;
    String color;
    int price;

    public Laptop(String model, int storageCapacity, String color, int price) {
        this.model = model;
        this.storageCapacity = storageCapacity;
        this.color = color;
        this.price = price;
    }
}

public class task6_1 {
    public static void main(String[] args) {
        // Создаем множество ноутбуков
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Huawei", 256, "Черный", 50000));
        laptops.add(new Laptop("HP", 512, "Серый", 60000));
        laptops.add(new Laptop("Lenovo", 512, "Черный", 55000));

        // Запрашиваем у пользователя критерии фильтрации
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру критерия:");
        System.out.println("1 - Объем ЖД");
        System.out.println("2 - Цена");
        System.out.println("3 - Цвет");
        int criteria = scanner.nextInt();

        // Запрашиваем минимальное значение выбранного критерия
        System.out.print("Введите минимальное значение этого критерия: ");
        int minValue = scanner.nextInt();

        // Инициализируем переменную для отфильтрованного ноутбука
        Laptop filteredLaptop = null;

        // Фильтруем ноутбуки и сохраняем прошедший фильтр
        for (Laptop laptop : laptops) {
            boolean passFilter = false;

            // Фильтруем по выбранному критерию
            switch (criteria) {
                case 1:
                    if (laptop.storageCapacity >= minValue) {
                        passFilter = true;
                    }
                    break;
                case 2:
                    if (laptop.price >= minValue) {
                        passFilter = true;
                    }
                    break;
                case 3:
                    if (laptop.color.equalsIgnoreCase(String.valueOf(minValue))) {
                        passFilter = true;
                    }
                    break;
                default:
                    System.out.println("Некорректный критерий!");
            }

            // Сохраняем прошедший фильтр ноутбук
            if (passFilter) {
                filteredLaptop = laptop;
                break;
            }
        }

        // Выводим информацию о подходящем ноутбуке
        if (filteredLaptop != null) {
            System.out.println("Модель: " + filteredLaptop.model);
            System.out.println("Объем ЖД: " + filteredLaptop.storageCapacity);
            System.out.println("Цвет: " + filteredLaptop.color);
            System.out.println("Цена: " + filteredLaptop.price);
        } else {
            System.out.println("Такой ноутбук не найден.");
        }
    }
}
