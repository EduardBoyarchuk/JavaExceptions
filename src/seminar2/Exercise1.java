import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1{
    public static void main(String[] args) {
//        float x = getFloat();
//        System.out.println("Вы ввели число: " + x);

        byZero();

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
    public static void byZero(){
        int[] intArray = new int[10];
        try {
            /*int d = 0;*/ //Нельзя делить на ноль
            int d = 1;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
