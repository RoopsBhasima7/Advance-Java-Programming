
package guiswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ActionEventDemo {
    JFrame f;
    JButton loginbtn;
    public ActionEventDemo() {
        f = new JFrame("Login Form");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        f.setSize(400,200);
        f.setLayout(null);     
        
        
        loginbtn = new JButton("Login");
        loginbtn.setBounds(100, 80, 100, 25);
        loginbtn.setToolTipText("Login");
        f.add(loginbtn);
        
        //register button to its respective Listener
        
        loginbtn.addActionListener(new A());
        
        
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        ActionEventDemo actionEventDemo = new ActionEventDemo();
    }
}

class A implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent ae) {
        JOptionPane.showMessageDialog(null,"clicked Login form");
    }
    
}