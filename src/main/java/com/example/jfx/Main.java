package com.example.jfx;

import javafx.application.Application;
import javafx.stage.Stage;
import mapping.Person;
import org.hibernate.Session;
import scenes.LoginClient;
import scenes.Register;
import scenes.StartScene;
import utils.HibernateUtil;

public class Main extends Application {
    public static void main(String[] args) {

        //insertPerson();
        launch(args);

        //HibernateUtil.getSessionFactory().close();
    }
/*
    private static void insertPerson() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Person person = new Person();

        session.close();
    }
*/
    @Override
    public void start(Stage stage) throws Exception {
        StartScene startScene = new StartScene();
        stage.setTitle("HANDYMAN");
        stage.setScene(startScene);
        stage.show();
    }


}