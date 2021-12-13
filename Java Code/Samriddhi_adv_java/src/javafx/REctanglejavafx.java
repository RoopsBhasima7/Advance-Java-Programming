
package javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class REctanglejavafx extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
      Rectangle rec = new Rectangle();
      rec.setX(50);
      rec.setY(50);
      rec.setWidth(100);
      rec.setHeight(75);
      rec.setFill(Color.BLUEVIOLET);
      Group root = new Group();
      root.getChildren().add(rec);      
      Scene sc = new Scene(root,300,300);
      primaryStage.setScene(sc);
      primaryStage.show(); 
      
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
