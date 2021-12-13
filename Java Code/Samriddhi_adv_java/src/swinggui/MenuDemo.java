package swinggui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

public class MenuDemo implements ActionListener{
    JFrame f ;
    JMenuBar bar;
    JMenu file,Edit,view;
    JMenuItem save,saveas,open;
    JTextArea txt;
    public MenuDemo() {
        f =new JFrame("Menu Example");
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        //menubar
        bar = new JMenuBar();
        f.setJMenuBar(bar);
        
        
        //menu
        file = new JMenu("File");
        Edit=  new JMenu("Edit");
        view = new JMenu("View");
        JSeparator s = new JSeparator();
        
        //menu items
        
        save = new JMenuItem("Save");
        save.addActionListener(this);
        
        saveas = new JMenuItem("Save as");
        open = new JMenuItem("Open");
        
        file.add(save);
        file.add(saveas);
        file.add(s);
        file.add(open);
                
        
        
        bar.add(file);
        bar.add(Edit);
        bar.add(view);
        
        //text area
        f.setLayout(null);
        
        txt = new JTextArea();
        
        JScrollPane sc = new JScrollPane(txt);
        sc.setBounds(100,100,200,100);
        f.add(sc);
        
        
        
        
        f.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
     if(ae.getSource()==save)
     {
         FileWriter fw  =null;
         try{
         fw = new FileWriter("abc.txt",true);
         fw.write(txt.getText().trim());
         }
         catch(FileNotFoundException fn)
         {
             System.out.println(fn.getMessage()); 
         }
         catch(IOException io)
         {
             System.out.println(io);   
         }
         finally
         {
             try {           
                 fw.close();
             } catch (IOException ex) {
                 Logger.getLogger(MenuDemo.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
         JOptionPane.showMessageDialog(null, "Data Save successfully !!");
         txt.setText("");
     }
    }
    
    public static void main(String[] args) {
        new MenuDemo();
    }
    
}
