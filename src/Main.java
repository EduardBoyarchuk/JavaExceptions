import seminar2.Exercise2;
import seminar2.Exercise3;
import seminar2.Exercise4;
import seminar3.model.Human;
import seminar3.model.Service;
import seminar3.presenter.Presenter;
import seminar3.view.View;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
       Service service=new Service();
        Presenter presenter = new Presenter();
        Human human = new Human();

        service.addHuman();
        service.saveToFile();
       //presenter.addHumanFile();
        /*float x = getFloat();
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
        return flo;*/
    }

}
