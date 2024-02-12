import java.util.Scanner;

public class Imt {
    public static void main(String[] args) {
        indexMassBody();

    }
        public static void indexMassBody() {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                double m, h;
                System.out.println("Введите ваш вес в килограммах");
                if (scanner.hasNextDouble()) {
                     m = scanner.nextDouble();
                } else {
                    System.out.println("Некорректный формат веса");
                    return;
                }


                System.out.println("Введите ваш рост в метрах через запятую");
                if (scanner.hasNextDouble()) {
                    h = scanner.nextDouble();
                } else {
                    System.out.println("Некорректный формат роста");
                    return;
                }

                double result = m / (h * h);
                System.out.println("Ваш индекс ИМТ: " + result);
                System.out.println("Вы соответствуете группе");
                if (result >= 16 && result <= 18.5) {
                    System.out.println("Недостаточная масса тела ");
                } else if(result >=18.6 && result <= 24.99) {
                    System.out.println("Норма");
                } else if(result >= 25 && result <= 30) {
                    System.out.println("Избыточная масса");
                } else if(result >= 30 && result <= 35) {
                    System.out.println("Ожирение первой степени");
                } else if(result >= 35 && result <= 40) {
                    System.out.println("Ожирение второй степени");
                } else if(result >= 40) {
                    System.out.println("Ожирение третьей степени");
                }
                System.out.println("Хотите продолжить? yes/no");
                String choice = scanner.next();
                if (choice.equalsIgnoreCase("no")){
                    break;
                }

            }

        }

}






