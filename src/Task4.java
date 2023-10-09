import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Введите строку: ");
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    throw new Exception("Пустые строки вводить нельзя");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }