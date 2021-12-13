
package guiswing;

import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class InternalFrameDemo {
       JFrame f;
       JInternalFrame f1,f2 ;
    public InternalFrameDemo() {
        f =new JFrame("Internal frame Example");
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JDesktopPane pane  = new JDesktopPane();
        pane.setBackground(Color.BLACK);
        f.add(pane);
        
        //internale frame
        
        f1 = new JInternalFrame("Frame 1");
        f1.setBounds(100,200,300,200);
        pane.add(f1);
        f1.setVisible(true);
        
        f2 = new JInternalFrame("Frame 2");
        f2.setBounds(100,500,300,200);
        pane.add(f2);
        f2.setVisible(true);
        
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new InternalFrameDemo();
    }
    
}
