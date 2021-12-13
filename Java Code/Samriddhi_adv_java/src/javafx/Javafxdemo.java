
package javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Javafxdemo extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        
        Menu file = new Menu("File");
        MenuItem item1 = new MenuItem("open");
         item1.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               System.out.println("file opening");
           }
       });
        MenuItem item2 = new MenuItem("save");        
        file.getItems().add(item1);
        file.getItems().add(item2);
        
        MenuBar bar = new MenuBar();
        bar.getMenus().add(file);
        
        VBox vb = new VBox(bar);
        Scene main1 = new Scene(vb, 200 , 200);
        primaryStage.setScene(main1);
 
       primaryStage.show();
       
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
