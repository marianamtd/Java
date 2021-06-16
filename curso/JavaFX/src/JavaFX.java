package JavaFX.src;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFX extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }
    
    @Override
    public void start(Stage arg0) throws Exception {
        primaryStage.setTittle("Academia dos Devs");
        Button btn = new Button("Clique aqui");
        btn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent arg0) {
                System.out.println("Clicou no botão");
                
            }
            
        });

        StackPane root = new StackPane();
        root.getChildren().addAll(btn);
        primaryStage.setScene(new Scene(root, 300,255));
        primaryStage.show();
    }
}