package seminar3.presenter;

import seminar3.model.Files;
import seminar3.model.Human;
import seminar3.model.Service;

public class Presenter {
    private Service service;
    private Files files;
    Human human = new Human();

    public Presenter(Service service, Files files) {
        this.service = new Service();
        this.files = new Files();
    }

    public Presenter() {
    }

    public void addHumanFile() throws Exception {
        try {
            service.addHuman();
            service.saveToFile();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Произошла ошибка: " + e.getMessage());

        }
    }
}