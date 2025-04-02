package scenes;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class LoginClient extends Scene {
    public LoginClient() {
        super(createScene(), 500,500);
    }

    public static VBox createScene(){
        VBox root = new VBox();

        return root;
    }


}
