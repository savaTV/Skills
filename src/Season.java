import java.sql.SQLOutput;
import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner speed = new Scanner(System.in);
        System.out.println("введите скорость");
        int a = speed.nextInt();
        if (a >= 150) {
            System.out.println("сбавь скорость");
        }
        else if (a <= 20) {
            System.out.println("прибавь скорости");
        }
        else {
            System.out.println("хорошо едем");
        }
    }
}
