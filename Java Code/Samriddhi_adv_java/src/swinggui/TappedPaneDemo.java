
package swinggui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TappedPaneDemo {
     public TappedPaneDemo() {
         JFrame f  = new JFrame();
         f.setSize(500,500);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JTabbedPane pane = new JTabbedPane();
         pane.addTab("First", new A());
         pane.addTab("Second", new B());
         f.add(pane);
         f.setVisible(true);
    }
    public static void main(String[] args) {
        new TappedPaneDemo();
    }
    class A extends JPanel{
        public A(){
       JButton btn1  = new JButton("1");
        JButton btn2  = new JButton("2");
        JButton btn3  = new JButton("3");
        JButton btn4  = new JButton("4");
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        }
    }
     class B extends JPanel{
        public B(){
       JButton btn1  = new JButton("one");
        JButton btn2  = new JButton("two");
        JButton btn3  = new JButton("three");
        JButton btn4  = new JButton("four");
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        
        }
    }
    
}
