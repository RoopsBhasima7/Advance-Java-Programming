
package guiswing;

import javax.swing.JFrame;
import javax.swing.JProgressBar;


public class ProgressbarDemo {
     JFrame f ;
     JProgressBar bar;
    public ProgressbarDemo()  {
        f =new JFrame("Progress Bar Example");
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        bar = new JProgressBar();
        bar.setValue(0);
        bar.setStringPainted(true);
        
        
        
        f.setLayout(null);
        bar.setBounds(20, 120, 300, 25);
        f.add(bar);
        
        f.setVisible(true);
        fill();
    }
    public static void main(String[] args) {
        new ProgressbarDemo();
    }
    public void fill()
    {
        int i =0;
        while(i<=100)
        {
        bar.setValue(i+1);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
         i++;
        }
        
    }
    
}
