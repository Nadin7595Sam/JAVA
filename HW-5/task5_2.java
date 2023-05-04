import java.util.*;

public class task5_2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова", 
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", 
                "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", 
                "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", 
                "Петр Петин", "Иван Ежов");

        Map<String, Integer> map = new TreeMap<>(Collections.reverseOrder());

        for (String name : names) {
            if (map.containsKey(name)) {
                map.put(name, map.get(name) + 1);
            } else {
                map.put(name, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}

