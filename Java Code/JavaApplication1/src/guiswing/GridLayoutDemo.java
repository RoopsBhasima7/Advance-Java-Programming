
package guiswing;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class GridLayoutDemo {
    JFrame f;
    JButton b1,b2,b3,b4;
   public GridLayoutDemo()
   {
        f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        f.setSize(400,200);
        f.setTitle("GridLayoutExample");
        
        //layout manager        
        GridLayout  gw = new GridLayout(4,3,20,20);
         f.setLayout(gw);
        
        //Button
        b1 = new JButton("One");
        b1.setSize(200,50);
        f.add(b1);
        
        b2 = new JButton("Two");
        b2.setSize(200,50);
        f.add(b2);
        
        b3 = new JButton("Three");
        b3.setSize(200,50);
        f.add(b3);
        
        b4 = new JButton("Four");
        b4.setSize(200,50);
        f.add(b4);   
        
        for (int i = 0; i < 7; i++) {
          f.add(new JButton("A"));           
       }
        
        
        f.setVisible(true);
   }
    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}  

