package javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class FirstJavaFxdemo extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
       Button btn = new Button("Click me !!! for Action Event"); 
       btn.setLayoutX(20);
       btn.setLayoutY(50);
       
       Button btn2 = new Button("Click me !!! for Mouse Event"); 
       btn2.setLayoutX(20);
       btn2.setLayoutY(100);
       
       //Action Event
       btn.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               System.out.println("Action event example");
           }
       });
       //Mouse event
       btn2.setOnMouseEntered(new EventHandler<MouseEvent>() {
           @Override
           public void handle(MouseEvent event) {
               System.out.println("Mouse event example");
               
              
           }
       });
        Group g = new Group();
        g.getChildren().addAll(btn,btn2);        
        Scene ss = new Scene(g, 200, 200);
        primaryStage.setScene(ss);
        primaryStage.show();
    }
}
