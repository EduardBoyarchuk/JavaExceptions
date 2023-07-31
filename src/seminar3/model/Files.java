package seminar3.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
Human human = new Human();
Service service = new Service();
    /*public void saveToFile() {
        BufferedWriter writer = null;
        try {
            String fileName = human.getImya() + ".txt";
            writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write(toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }*/



    public String toString() {
        return  "Фамилия: " + human.getFamiliya() +
                "Имя: " + human.getImya() +
                "Отчество: " + human.getOtchestvo() +
                "Дата рождения: " + human.getDataRogdeniya() +
                "Телефон : "  + human.getNomerTelefona() +
                "Пол : " + human.getPol();
    }
}
