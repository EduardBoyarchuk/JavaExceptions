package seminar2;

public class Exercise2 {
    public static void byZero(){
        System.out.println();
        System.out.println("Задание  2");
        int[] intArray = new int[10];
        try {
            /*int d = 0;*/ //Нельзя делить  ноль
            int d = 1;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
