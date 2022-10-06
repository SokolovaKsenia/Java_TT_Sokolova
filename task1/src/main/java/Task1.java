import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Введи любое число больше семи: ");
            float num = in.nextFloat();
            String string;
            if (num > 7) {
                string = "Привет!";
            } else if (num < 7) {
                string = "Хорошая попытка, но это число меньше семи";
            } else {
                string = "Хорошая попытка, но это число равно семи";
            }
            in.close();
            System.out.println(string);
        } catch (NullPointerException | InputMismatchException exception) {
            System.out.println("Введено некорректное значение!");
        }
    }
}
