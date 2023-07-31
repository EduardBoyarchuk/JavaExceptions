package seminar3.view;

import seminar3.model.Human;

import java.util.Scanner;

public class View {
    Human human = new Human();
    Scanner scanner = new Scanner(System.in);
    public View(){

    }


    public String createFamiliya() throws Exception{
        String familiya;
        while (true) {
            try {
                System.out.println("Введите фамилию :");
                familiya = scanner.nextLine();
                if (familiya.isEmpty()) {
                    throw new Exception("Поле не может быть пустым");
                }
                break;
            } catch (Exception e) {
                System.out.println("Не правильнo. Попробуйте еще раз ");
            }
        }
        return familiya;
    }

    public String createImya() throws Exception{
        String imya;
        while (true) {
            try {
                System.out.println("Введите имя :");
                imya = scanner.nextLine();
                if (imya.isEmpty()) {
                    throw new Exception("Поле не может быть пустым");
                }
                break;
            } catch (Exception e) {
                System.out.println("Не правильнo. Попробуйте еще раз ");
            }
        }
        return imya;
    }

    public String createOtchestvo() throws Exception{
        String otchestvo;
        while (true) {
            try {
                System.out.println("Введите отчество :");
                otchestvo = scanner.nextLine();
                if (otchestvo.isEmpty()) {
                    throw new Exception("Поле не может быть пустым");
                }
                break;
            } catch (Exception e) {
                System.out.println("Не правильнo. Попробуйте еще раз ");
            }
        }
        return otchestvo;
    }

    public String createDataRogdeniya() throws Exception{
        String dataRogdeniya;
        while (true) {
            try {
                System.out.println("Введите дату рождения в формате dd.mm.yyyy :");
                dataRogdeniya = scanner.nextLine();
                if (dataRogdeniya.isEmpty()) {
                    throw new Exception("Поле не может быть пустым");
                }
                break;
            } catch (Exception e) {
                System.out.println("Не правильнo. Попробуйте еще раз ");
            }
        }
        return dataRogdeniya;
    }

    public String createNomerTelefona() throws Exception{
        String nomerTelefona;
        while (true) {
            try {
                System.out.println("Введите номер телефона :");
                nomerTelefona = scanner.nextLine();
                if (nomerTelefona.isEmpty()) {
                    throw new Exception("Поле не может быть пустым");
                }
                break;
            } catch (Exception e) {
                System.out.println("Не правильнo. Попробуйте еще раз ");
            }
        }
        return nomerTelefona;
    }


    public String createPol() throws Exception{
        String pol;
        while (true) {
            try {
                System.out.println("Введите пол в формате f или m  :");
                pol = scanner.nextLine();
                if (pol.isEmpty()&& (pol == "f" || pol == "m")) {
                    throw new Exception("Неправильно");
                }
                break;
            } catch (Exception e) {
                System.out.println("Не правильнo. Попробуйте еще раз ");
            }
        }
        return pol;
    }
}
