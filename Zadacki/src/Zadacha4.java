import java.util.Scanner;

public class Zadacha4 {
    public static void main(String[] arqs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число ");
        int num1 = scanner.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("Число четное");
        }else {
            System.out.println("Число нечетное");
        }
    }
}
