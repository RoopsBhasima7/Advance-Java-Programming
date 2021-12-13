
package javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Firstjavafxexample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn1 = new Button("First Button");
         btn1.setLayoutX(50);
         btn1.setLayoutY(50);
         
         //ACtion Event
         btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("First button clicked!!!"); 
            }
        });
         
        Button btn2 = new Button("Second Button");
         btn2.setLayoutX(50);
         btn2.setLayoutY(100);
         
         btn2.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Second button clicked!!!"); 
            }
        });
         
         //Mouse Event
        // layout VBOX
        
        Group box = new Group();
        box.getChildren().addAll(btn1,btn2);
        
        Scene sc = new Scene(box,200,200);
             primaryStage.setScene(sc);
             primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
