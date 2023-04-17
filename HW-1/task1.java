import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int n = scanner.nextInt();
        int tn = n * (n+1) / 2;
        System.out.println("Треугольное число: " + tn);

    }
}