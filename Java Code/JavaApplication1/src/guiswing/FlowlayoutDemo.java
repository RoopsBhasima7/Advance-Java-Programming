
package guiswing;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class FlowlayoutDemo {
    JFrame f;
    JButton b1,b2,b3,b4;
   public FlowlayoutDemo()
   {
        f = new JFrame("FlowLayoutExample");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        f.setSize(400,200);
        
        //layout manager        
        FlowLayout  fw = new FlowLayout();
         f.setLayout(fw);
        
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
        new FlowlayoutDemo();
    }
}
