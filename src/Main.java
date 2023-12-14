import javafx.application.Application;
import javafx.stage.Stage;
import view.LoginScreen;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("StoreCS24");
        stage.setHeight(600);
        stage.setWidth(600);
        LoginScreen loginScreen = new LoginScreen();
        stage.setScene(loginScreen.getScene());
        stage.show();
    }
}