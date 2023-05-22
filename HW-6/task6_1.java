import java.util.*;

class Laptop {
    private String model;  // Модель ноутбука
    private int storageCapacity;  // Объем памяти ноутбука
    private String color;  // Цвет ноутбука
    private int price;  // Цена ноутбука

    public Laptop(String model, int storageCapacity, String color, int price) {
        this.model = model;
        this.storageCapacity = storageCapacity;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
}

public class task6_1 {
    public static void main(String[] args) {
        // Создаем множество ноутбуков
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Dell Inspiron", 256, "Чёрный", 50000));
        laptops.add(new Laptop("HP Pavilion", 512, "Серый", 60000));
        laptops.add(new Laptop("Lenovo ThinkPad", 512, "Чёрный", 55000));

        // Создаем объект Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Создаем Map критериев фильтрации
        Map<Integer, String> criteria = new HashMap<>();
        criteria.put(1, "Объем памяти");  // Объем памяти
        criteria.put(2, "Цена");  // Цена
        criteria.put(3, "Цвет");  // Цвет

        // Создаем Map параметров фильтрации
        Map<Integer, Object> filters = new HashMap<>();

        // Запрашиваем у пользователя критерии и минимальные значения фильтрации
        for (int i = 1; i <= criteria.size(); i++) {
            System.out.print("Введите минимальное значение для " + criteria.get(i) + ": ");
            filters.put(i, scanner.nextLine());
        }

        // Фильтруем ноутбуки и выводим результаты
        for (Laptop laptop : laptops) {
            boolean meetsCriteria = true;
            for (int i = 1; i <= criteria.size(); i++) {
                Object value = filters.get(i);
                if (i == 1 && laptop.getStorageCapacity() < Integer.parseInt((String) value)) {
                    meetsCriteria = false;
                    break;
                } else if (i == 2 && laptop.getPrice() > Integer.parseInt((String) value)) {
                    meetsCriteria = false;
                    break;
                } else if (i == 3 && !laptop.getColor().equalsIgnoreCase((String) value)) {
                    meetsCriteria = false;
                    break;
                }
            }
            if (meetsCriteria) {
                System.out.println(laptop.getModel());
            }
        }
    }
}