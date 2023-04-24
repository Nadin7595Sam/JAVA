import java.util.Scanner;

public class task2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = in.nextLine();
        
        String r = new StringBuffer(s).reverse().toString();
        System.out.println("Было: " + s);
        System.out.println("Стало: " + r);
    }
}