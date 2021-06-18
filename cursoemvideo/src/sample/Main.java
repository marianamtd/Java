package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Academia dos Dev");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        Button btn = new Button("Clique aqui");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Clicou no botão");
            }
        });

        StackPane roots = new StackPane();
        roots.getChildren().addAll(btn);
        primaryStage.setScene(new Scene(roots, 300,250));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
