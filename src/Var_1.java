/* Вариант 1
В программе, вычисляющей среднее значение среди положительных элементов
одномерного массива (тип элементов int), вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
– ввод строки вместо числа;
– несоответствие числового типа данных;
– положительные элементы отсутствуют. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Var_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите размер массива");
            int size = sc.nextInt();
            int [] arr = new int [size];
            for (int i = 0; i < size; i++) {
                System.out.println("Введите элемент массива arr[ " + i + "]");
                arr[i] = sc.nextInt();
            }
            int countPositiveNumbers = 0;
            int max = -1;
            for (int i = 0; i < size; i++) {
                if (arr[i] > 0) {
                    countPositiveNumbers++;
                    max = arr[i];
                }
            }
            if (countPositiveNumbers == 0)
                throw new ArithmeticException("Нет положительных элементов");
            else {
                for (int i = 0; i < size; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }
            }
            System.out.println("Max = " + max);
        }
        catch (InputMismatchException ie) {
            System.out.println("Ввод строки вместо числа");
        }
        catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }
}
