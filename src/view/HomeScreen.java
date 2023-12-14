package view;

import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomeScreen {
    private Scene scene;
    public HomeScreen(Stage stage){
        initComponents(stage);
    }

    public void initComponents(Stage stage){
        TableView table = new TableView();

        //table.setItems();

        TableColumn productName = new TableColumn<>("Name");
        productName.setPrefWidth(150);
        productName.setCellFactory(new PropertyValueFactory<>("Name"));

        TableColumn productImage = new TableColumn<>("Image");
        productImage.setPrefWidth(150);
        productImage.setCellFactory(new PropertyValueFactory<>("Image"));

        TableColumn productPrice = new TableColumn<>("Price");
        productPrice.setPrefWidth(150);
        productPrice.setCellFactory(new PropertyValueFactory<>("Price"));

        TableColumn productQuantity = new TableColumn<>("Quantity");
        productQuantity.setPrefWidth(150);
        productQuantity.setCellFactory(new PropertyValueFactory<>("Quantity"));

        table.getColumns().setAll(productName, productImage, productPrice, productQuantity);

        VBox mainBox = new VBox();
        mainBox.getChildren().addAll(table);

        scene = new Scene(mainBox);
    }

    public Scene getScene() {
        return scene;
    }
}
