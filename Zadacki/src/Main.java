import java.util.Scanner;

public class Main {
    public static void main(String[] arqs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение");
        int num1 = scanner.nextInt();

        if (num1 > 0) {
            System.out.print("Число положительное");
        }else {
            System.out.print("число отрицательное");
        }



    }
}

