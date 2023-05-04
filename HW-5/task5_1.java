import java.util.HashMap;
import java.util.Scanner;

public class task5_1 {
    private HashMap<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addEntry(String name, String phoneNumber) {
        phoneBook.put(name, phoneNumber);
    }

    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите фамилию: ");
        String name = scanner.nextLine();
        if (phoneBook.containsKey(name)) {
            System.out.println(name + ": " + phoneBook.get(name));
        } else {
            System.out.println("Запись не найдена");
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addEntry("Либовски", "123, 236");
        phoneBook.addEntry("Трамп", "456");
        phoneBook.addEntry("Круз", "789, 256");
        phoneBook.search();
    }
}
