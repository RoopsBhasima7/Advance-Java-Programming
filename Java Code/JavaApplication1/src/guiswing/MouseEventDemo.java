
package guiswing;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MouseEventDemo implements MouseListener{
    JFrame f;
    JButton loginbtn,cancelbtn;
    public MouseEventDemo() {
        f = new JFrame("Login Form");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        f.setSize(400,200);
        f.setLayout(null);    
        
        
        loginbtn = new JButton("Login");
        loginbtn.setBounds(100, 80, 100, 25);
        loginbtn.setToolTipText("Login");
        f.add(loginbtn);
        
        cancelbtn = new JButton("Cancel");
        cancelbtn.setBounds(210, 80, 100, 25);
        cancelbtn.setToolTipText("Login");
        f.add(cancelbtn);
        //register button to its respective Listener
        loginbtn.addMouseListener(this);      
        cancelbtn.addMouseListener(this); 
        
        
        f.setVisible(true);  
    }
    
    public static void main(String[] args) {
     new MouseEventDemo();
    }

    @Override
    public void mouseClicked(MouseEvent me) {
       
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        if(me.getSource()==loginbtn)
        {
         JOptionPane.showMessageDialog(null, "Entered into Login Button !!");
        }
        else if(me.getSource()==cancelbtn)
        {
         JOptionPane.showMessageDialog(null, "Entered into Cancel Button !!");  
        }
            
            
    }

    @Override
    public void mouseExited(MouseEvent me) {
      if(me.getSource()==loginbtn)
        {
         JOptionPane.showMessageDialog(null, "Exited from Login Button !!");
        }
        else if(me.getSource()==cancelbtn)
        {
         JOptionPane.showMessageDialog(null, "Exited from Cancel Button !!");  
        }  
    }
}
