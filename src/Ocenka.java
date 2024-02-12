import java.util.Scanner;

public class Ocenka {
    private  static  int result = 0;
    public static void main(String[] args) {


calculation();
    }
    public static void calculation() {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Введите первое число");
            int operand1 = scanner.nextInt();


            System.out.println("Введите действие: (+,-,/,*) или q для выхода");
            char deistvie = scanner.next().charAt(0);

            if (deistvie == 'q') {
                System.out.println("Программа завершена");
                break;
            } else if (deistvie == 'c') {
                result = 0;
                System.out.println("Результат обнулен.");
                continue;
            }


            System.out.println("Введите второе число");
            int operand2 = scanner.nextInt();





            int result = 0;

            switch (deistvie) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '/':
                    if (operand2 == 0) {
                        System.out.println("делить на ноль нельзя");
                        continue;
                    } else {
                        result = operand1 / operand2;
                    }
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;

                default:
                    System.out.println("Неверный знак");



            }

            System.out.println("Ваш результат: " + result);
        }
    }
}







