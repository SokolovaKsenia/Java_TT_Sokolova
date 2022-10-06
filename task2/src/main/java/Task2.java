import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Пожалуйста, введите Ваше имя: ");
            printValidValue(sc);
        }
    }
    static void printValidValue(Scanner sc) {
        while (sc.hasNextLine()) {
            try {
                String name = sc.next("[а-яА-Я]+").toUpperCase();
                if (name.equals("ВЯЧЕСЛАВ")) {
                    name = "Привет, Вячеслав";
                } else {
                    name = "Нет такого имени";
                }
                System.out.println(name);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Для ввода имени используйте кириллицу");
                sc.nextLine();
            }
        }
    }
}