

package guiswing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;



public class TableDemo {
        JFrame f ;
    public TableDemo() {
        f =new JFrame("Table Example");
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String data[][] = {{"ram","kathmandu","ram@gmail.com"},{"Sita","Pokhara","sita@gmail.com"},{"shyam","butwal","shyam@gmail.com"}};
        String heading [] = {"Name" , "Address","Email Address"};
        JTable table = new JTable(data, heading);     
        
        JScrollPane js = new JScrollPane(table);
        
        f.setLayout(null);
        js.setBounds(20, 120, 300, 50);
        f.add(js);
        
        
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new TableDemo();
    }
    
}
