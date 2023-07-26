package seminar2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1{
    public static void main(String[] args) throws Exception {
        float x = getFloat();
        System.out.println("Вы ввели число: " + x);

        Exercise2.byZero();

        Exercise3.exer3();

        Exercise4.emptyString();

    }
    public static float getFloat() {
        Scanner scanner = new Scanner(System.in);
        float flo = 0f;
        while (true) {
            try {
                System.out.println("Введите число с плавающей точкой: ");
                 flo = scanner.nextFloat();
                 break;
            } catch (InputMismatchException e){
                System.out.println("Не правильный формат числа. Попробуйте еще раз ");
                scanner.next();
            }
        }
    return flo;
    }

}
