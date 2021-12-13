
package swinggui;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginDemo {
    JFrame f;
    JPanel p1,p2;
    JLabel usernamelbl , passwordlbl;
    JTextField usernametxt;
    JPasswordField passwordtxt;
    JButton loginbtn , resetbtn ,cancelbtn;
    public LoginDemo() {
        f = new JFrame();
        f.setSize(400,200);
        f.setTitle("Login");
        f.setLocation(200, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        //panel
        p1 =  new JPanel();
        p1.setBackground(Color.GRAY);
        p1.setBounds(0,0,400,125);
        f.add(p1);
        
        p2 =  new JPanel();
        p2.setBackground(Color.DARK_GRAY);
        p2.setBounds(0,130,400,75);
        f.add(p2);
        
        
        p1.setLayout(null);
        
        usernamelbl = new JLabel("User Name");
        usernamelbl.setBounds(10, 20, 100, 50);
        p1.add(usernamelbl);
        
        
        usernametxt = new JTextField();
        usernametxt.setBounds(120,20,100,50);
        p1.add(usernametxt);     
        
        
        passwordlbl = new JLabel("Password");
        passwordlbl.setBounds(10, 80, 100, 50);
        p1.add(passwordlbl);
        
        passwordtxt = new JPasswordField();
        passwordtxt.setBounds(120,80 ,100,50);
        p1.add(passwordtxt);
        
        
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new LoginDemo();
    }
}
