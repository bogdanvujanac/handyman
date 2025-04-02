package scenes;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class StartScene extends Scene {
    public StartScene() {
        super(createScene(),2*275,2*183);
    }

    static VBox createScene() {
        VBox root = new VBox();
        root.setSpacing(20);
        root.setPadding(new Insets(20));


        //background image
        //kad se rasiri ne bude lepo, RESITI!!!!!!!!!!!!!!!!!!!!false
        BackgroundSize bgSize = new BackgroundSize(100, 100, true, true, true, true);
        root.setBackground(new Background(new BackgroundImage(
                new Image("startt.jpeg"),
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                bgSize
        ))); // TODO

        //ImageView imgv =


        /*Image imgg = new Image("startt.jpeg");
        if (imgg.isError()) {
            System.out.println("Greška pri učitavanju slike!");
        }*/

        //username
        Label lblUsername = new Label("Username");
        lblUsername.setStyle("-fx-text-fill: white; -fx-font-size: 15px; -fx-font-weight: bold;");
        TextField tfUsername = new TextField();
        lblUsername.setPrefHeight(20);
        lblUsername.setMaxWidth(220);
        tfUsername.setPrefHeight(20);
        tfUsername.setMaxWidth(220);
        VBox.setMargin(tfUsername, new Insets(0, 0, 0, 0));
        root.getChildren().addAll(lblUsername, tfUsername);

        //password
        Label lblPassword = new Label("Password");
        lblPassword.setStyle("-fx-text-fill: white; -fx-font-size: 15px; -fx-font-weight: bold;");
        PasswordField pwPassword = new PasswordField();
        lblPassword.setPrefHeight(20);
        lblPassword.setMaxWidth(220);
        pwPassword.setPrefHeight(20);
        pwPassword.setMaxWidth(220);
        VBox.setMargin(lblPassword, new Insets(10, 0, 0, 0));
        VBox.setMargin(pwPassword, new Insets(0, 0, 0, 0));
        //pwPassword.setPadding(new Insets(0));
        root.getChildren().addAll(lblPassword, pwPassword);

        //login
        Button btnLogin = new Button("Login");
        btnLogin.setPrefSize(100,30);
        VBox.setMargin(btnLogin, new Insets(20, 0, 0, 0));
        root.getChildren().add(btnLogin);

        Hyperlink hlSignup = new Hyperlink("Don't Have An Account? Sign Up!");
        hlSignup.setStyle("-fx-text-fill: #0000fa; -fx-font-size: 12px;-fx-font-style: italic; -fx-font-weight: bold;");
        hlSignup.setOnAction(e -> {
            Stage stage = (Stage) hlSignup.getScene().getWindow();
            Register register = new Register();
            stage.setScene(register);
        });
        root.getChildren().addAll(hlSignup);

        /*
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        */

        return root;
    }


}