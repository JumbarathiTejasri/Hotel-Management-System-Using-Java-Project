package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HotelManagementSystem extends JFrame implements ActionListener{
    HotelManagementSystem(){
        setBounds(100,100,1366,600);//locationx locationy,length,breadth
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,1366,600);
        add(image);
        
        JLabel text=new  JLabel("HOTEL MANAGEMENT SYSTEM");
        text.setBounds(20,430,1000,90);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("serif",Font.PLAIN,50));
        image.add(text);
        
        JButton next=new JButton("NEXT");
        next.setBounds(1150,510,140,40);
        next.setBackground(Color.WHITE);
        next.setForeground(Color.MAGENTA);
        next.setFont(new Font("Serif",Font.PLAIN,18));
        image.add(next);
        next.addActionListener(this);
        
        setVisible(true);
        
        while(true){
            text.setVisible(false);
         try{
            Thread.sleep(500);
        }catch(Exception e){
            e.printStackTrace();
        }
         
          text.setVisible(true);
          try{
            Thread.sleep(500);
        }catch(Exception e){
            e.printStackTrace();
        }
    }    
 }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }    
    public static void main(String[] args) {
        new HotelManagementSystem(); 
    }
}