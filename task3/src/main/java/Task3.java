import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите желаемый размер массива:");
        int n = 0;
        while (n <= 1) {
            if(sc.hasNextInt()){
                n = sc.nextInt();
                if(n <= 1){
                    System.out.println("В массиве должно быть больше 1 элемента. Повторите ввод:");
                }
            } else {
                System.out.println("Вы ввели не число. Попробуйте еще раз:");
                sc.next();
            }
        }
        int [] array = new int[n];
        int num  = 0;

        for (int i = 0; i < n; i++) {
            array[i] = (int)(Math.random()*(n+1));
            if(array[i] % 3 == 0){
                num++;
            }
        }

        System.out.println("Произвольный массив по заданому размеру:" + Arrays.toString(array));
        int [] newArray = new int[num];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if(array[i] % 3 == 0){
                newArray[index] = array[i];
                index++;
            }
        }
        System.out.println("Массив чисел, кратных трем: " + Arrays.toString(newArray));
    }
}