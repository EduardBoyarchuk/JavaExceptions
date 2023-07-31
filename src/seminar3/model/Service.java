package seminar3.model;

import seminar3.view.View;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
    //Scanner scanner = new Scanner(System.in);
    Human human = new Human();
    StringBuilder sb;
    View view = new View();



    public Service() {
    }
    /*private List<Human> humans;

    public Service() {
        humans = new ArrayList<>();
    }*/

public void addHuman()throws Exception{
    String familiya = view.createFamiliya();
     human.setFamiliya(familiya);
     sb=new StringBuilder(human.getFamiliya());
    sb.append(" ");

    String imya = view.createImya();
     human.setImya(imya);
     sb.append(human.getImya());
    sb.append(" ");

    String otchestvo = view.createOtchestvo();
    human.setOtchestvo(otchestvo);
    sb.append(human.getOtchestvo());
    sb.append(" ");

    String dataRogdeniya = view.createDataRogdeniya();
    human.setDataRogdeniya(dataRogdeniya);
    sb.append(human.getDataRogdeniya());
    sb.append(" ");

    String nomerTelefona = view.createNomerTelefona();
    human.setNomerTelefona(nomerTelefona);
    sb.append(human.getNomerTelefona());
    sb.append(" ");

    String pol = view.createPol();
    human.setPol(pol);
    sb.append(human.getPol());
    sb.append(" ");

    System.out.println(sb.toString());
}

    public void saveToFile(){
        if (sb == null || sb.length() == 0) {
            System.out.println("Не удалось сохранить информацию в файл. Нет данных для сохранения.");
            return;
        }

        String filename = human.getFamiliya() + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(sb.toString() + "\n");
            System.out.println("Информация сохранена в файл: " + filename);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + filename);
            e.printStackTrace();
        }
    }



}
