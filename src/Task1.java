import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number = getFloat(scanner);
        System.out.println("Вы ввели число: "+ number);
    }
    public static float getFloat(Scanner scanner) {
        System.out.println("Введите дробное число: ");
        while (true){
            try {
                String input = scanner.nextLine();
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели неправильное число. Попробуйте ещё раз.");
            }
        }
    }
}
