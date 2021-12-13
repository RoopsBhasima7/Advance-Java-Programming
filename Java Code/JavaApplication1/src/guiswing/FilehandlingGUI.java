
package guiswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class FilehandlingGUI implements ActionListener{
    JFrame f;
    JTextArea txt;
    JButton savebtn ;
    public FilehandlingGUI()
    {
     f = new JFrame("File handling Example");
     f.setSize(500,500);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f.setLayout(null);
     
     txt =  new JTextArea();
     txt.setBounds(50, 10, 400, 300);
     f.add(txt);
     
     savebtn = new JButton("Save to File");
     savebtn.setBounds(100,320,200,50);
     f.add(savebtn);
     
     savebtn.addActionListener(this);
     
     f.setVisible(true);
    }
    public static void main(String[] args) {
    FilehandlingGUI obj =  new FilehandlingGUI();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String msg = txt.getText().trim();
       // JOptionPane.showMessageDialog(null, msg);
        //txt.setText("");
        
        //File handling code
        FileWriter fw  = null;
        try
        {
           fw  = new FileWriter("abc.txt");
           fw.write(msg);
            
        }
        catch(FileNotFoundException fne)
        {
            System.out.println(fne.getMessage()); 
        }
        catch(IOException ioe)
        {
            System.out.println(ioe);    
        }
        finally
        {
            try {
                fw.close();
            } catch (IOException ex) {
                System.out.println("Error occured !!!");
            }
        }
       JOptionPane.showMessageDialog(null, "Data successfully saved !!!");
        
    }
  
}


