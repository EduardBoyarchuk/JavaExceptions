package seminar2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise4 {

    public static void emptyString(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите текст: ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя!");
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}