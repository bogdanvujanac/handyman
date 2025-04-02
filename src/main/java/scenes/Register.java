package scenes;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Register extends Scene {
    public Register() {
        super(createScene(), 500,500);
    }

    static VBox createScene() {
        VBox root = new VBox();

        root.setSpacing(20);
        root.setPadding(new Insets(20,0, 20,20));

        //First Name
        Label lblFirstName = new Label("First Name");
        TextField tfFirstName = new TextField();
        lblFirstName.setMaxHeight(20);
        lblFirstName.setMaxWidth(220);
        tfFirstName.setMaxHeight(20);
        tfFirstName.setMaxWidth(220);
        root.getChildren().addAll(lblFirstName, tfFirstName);

        //Last Name
        Label lblLastName = new Label("Last Name");
        TextField tfLastName = new TextField();
        lblLastName.setMaxHeight(20);
        lblLastName.setMaxWidth(220);
        tfLastName.setMaxHeight(20);
        tfLastName.setMaxWidth(220);
        root.getChildren().addAll(lblLastName, tfLastName);

        //username
        Label lblUsername = new Label("Username");
        TextField tfUsername = new TextField();
        lblUsername.setMaxHeight(20);
        lblUsername.setMaxWidth(220);
        tfUsername.setMaxHeight(20);
        tfUsername.setMaxWidth(220);
        root.getChildren().addAll(lblUsername, tfUsername);

        //email
        Label lblEmail = new Label("Email");
        TextField tfEmail = new TextField();
        lblEmail.setMaxHeight(20);
        lblEmail.setMaxWidth(220);
        tfEmail.setMaxHeight(20);
        tfEmail.setMaxWidth(220);
        root.getChildren().addAll(lblEmail, tfEmail);

        /*
        private boolean validEmail(String email){
            String emailRegular = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
            return email.matches(emailRegular);
        }
        */

        //password
        Label lblPassword = new Label("Password");
        PasswordField pwPassword = new PasswordField();
        lblPassword.setMaxHeight(20);
        lblPassword.setMaxWidth(220);
        pwPassword.setMaxHeight(20);
        pwPassword.setMaxWidth(220);
        root.getChildren().addAll(lblPassword, pwPassword);

        //confirm password
        Label lblConfirmPassword = new Label("Confirm Password");
        PasswordField pwConfirmPassword = new PasswordField();
        lblConfirmPassword.setMaxHeight(20);
        lblConfirmPassword.setMaxWidth(220);
        pwConfirmPassword.setMaxHeight(20);
        pwConfirmPassword.setMaxWidth(220);
        root.getChildren().addAll(lblConfirmPassword, pwConfirmPassword);

        Label lblRole = new Label("Choose your role:");
        RadioButton rbClient = new RadioButton("Client");
        RadioButton rbWorker = new RadioButton("Worker");

        ToggleGroup tgRole = new ToggleGroup();
        rbClient.setToggleGroup(tgRole);
        rbWorker.setToggleGroup(tgRole);
        rbClient.setSelected(true);

        root.getChildren().addAll(lblRole, rbClient, rbWorker);

        HBox btns = new HBox();
        Button btnCancel = new Button("Cancel");
        Button btnRegister = new Button("Register");
        btns.getChildren().addAll(btnCancel, btnRegister);
        root.getChildren().addAll(btns);

        btnCancel.setOnAction(e -> {
            Stage stage = (Stage) btnCancel.getScene().getWindow();
            StartScene startScene = new StartScene();
            stage.setScene(startScene);
        });

        btnRegister.setOnAction(e -> {
            Stage stage = (Stage) btnRegister.getScene().getWindow();
            Register register = new Register();
            stage.setScene(register);
            RadioButton rbSelected = (RadioButton) tgRole.getSelectedToggle();

            if(rbSelected.getText() == "Client"){
                LoginClient loginClient = new LoginClient();
                stage.setScene(loginClient);
            }



        });

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);

        return root;
    }
}
