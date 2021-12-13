
package guiswing;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUIDemo {

    JFrame f;
    JPanel p1 ,p2;
    JLabel usernamelbl,passwordlbl;
    JTextField usernametxt;
    JPasswordField passwordtxt;
    JButton loginbtn,resetbtn,cancelbtn;
    
    public GUIDemo() {
        f = new JFrame("Login Form");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        f.setSize(400,200);
        f.setLayout(null);
        
        p1 = new JPanel();
        p1.setBounds(0,0,400,80);
        p1.setBackground(Color.GRAY);
        f.add(p1);
        p1.setLayout(null);
        
        p2 = new JPanel();
        p2.setBounds(0,80,400,60);
        p2.setBackground(Color.DARK_GRAY);
        f.add(p2);
        p2.setLayout(null);
        
        usernamelbl = new JLabel("User Name");
        usernamelbl.setBounds(0, 10, 100,25);
        p1.add(usernamelbl);
        
        passwordlbl = new JLabel("Password");
        passwordlbl.setBounds(0, 45, 100,25);
        p1.add(passwordlbl);
        
        usernametxt  = new JTextField();
        usernametxt.setBounds(110, 10, 250, 25);
        usernametxt.setBackground(Color.BLACK);
        usernametxt.setForeground(Color.yellow);
        usernametxt.setCaretColor(Color.RED);
        usernametxt.setToolTipText("Enter User Name Here");
        p1.add(usernametxt);
        
        passwordtxt = new JPasswordField();
        passwordtxt.setBounds(110,45, 250, 25);
        passwordtxt.setBackground(Color.BLACK);
        passwordtxt.setCaretColor(Color.RED);
        passwordtxt.setForeground(Color.yellow);
        passwordtxt.setEchoChar('8');
        p1.add(passwordtxt);
        
        
        loginbtn = new JButton("Login");
        loginbtn.setBounds(40, 20, 100, 25);
        //loginbtn.setToolTipText("Login");
        p2.add(loginbtn);
        
        resetbtn = new JButton("Reset");
        resetbtn.setBounds(150, 20, 100, 25);
        p2.add(resetbtn);
        
        cancelbtn = new JButton("Cancel");
        cancelbtn.setBounds(260, 20, 100, 25);
        p2.add(cancelbtn);
        
        
        f.setVisible(true);
    }
    public static void main(String[] args) {
     new GUIDemo();
    }
    
}
