import javax.lang.model.type.NullType;
import java.io.FileNotFoundException;

public class Task3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum("фвввф", 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }
    public static void printSum(Object a, Object b) {
        try{
            if (a.getClass() != Integer.class || b.getClass() != Integer.class) {
                throw new Exception("Числа должны быть целыми."); // Условно
            }
            else{
                System.out.println((int) a + (int) b);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
