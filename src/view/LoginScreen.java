package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class LoginScreen {
    private Scene scene;

    public LoginScreen(){
        initComponents();
    }

    public void initComponents(){
        Label title = new Label("Welcome to StoreCS24");

        TextField userTxt = new TextField();
        userTxt.setMaxWidth(200);
        PasswordField pswTxt = new PasswordField();
        pswTxt.setMaxWidth(200);
        Button signInBtn = new Button("SignIn");
        Button signUpBtn = new Button("SignUp");

        VBox mainBox = new VBox(10);
        mainBox.setAlignment(Pos.CENTER);

        HBox buttonsBox = new HBox(10);
        buttonsBox.getChildren().addAll(signInBtn, signUpBtn);
        buttonsBox.setAlignment(Pos.CENTER);

        mainBox.getChildren().addAll(title, userTxt, pswTxt, buttonsBox);
        scene = new Scene(mainBox);
    }

    public Scene getScene() {
        return scene;
    }
}
