import java.util.Scanner;

public class Zadacha5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое слово");
        String words1 = scanner.nextLine();

        System.out.println("Введите второе слово");
        String words2 = scanner.nextLine();

        char srav1 = words1.charAt(0);
        char srav2 = words2.charAt(0);

        if (srav1 == srav2) {
            System.out.println("первые буквы совпадают");

        }else {
            System.out.println("первые буквы не совпадают");
        }
    }
}
