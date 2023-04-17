import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        System.out.print("Введите номер операции (1 - сложение; 2 - вычитание; 3 - умножение; 4 - деление): ");
        int с = scanner.nextInt();

        switch (с) {
            case 1:
                System.out.print("Ответ: " + (a+b));
                break;

            case 2:
                System.out.print("Ответ: " + (a-b));
                break;

            case 3:
                System.out.print("Ответ: " + (a*b));
                break;

            case 4:
                try {
                    System.out.printf("Ответ: " + (a/b));
                } catch (ArithmeticException e) {
                    System.out.println("На 0 делить нельзя!");
                }
                break;
        
            default:
                break;
        }
    }
}