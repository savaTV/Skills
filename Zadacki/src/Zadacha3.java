import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadacha3 {
  public static void main(String[] arqs) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Введите слово");
      String words = scanner.nextLine();

      char words1 = words.charAt(words.length() -1);
      System.out.print("последний символ "+ words1);




  }
}
