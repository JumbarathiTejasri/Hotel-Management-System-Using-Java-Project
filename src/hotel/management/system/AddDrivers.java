
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AddDrivers extends JFrame implements ActionListener{
    
    JButton add,cancel;
    JTextField tfname,tfage,tfcompany,tfmodel,tflocation;
    JComboBox gendercombo,availablecombo;
    AddDrivers(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel  heading=new JLabel("Add Drivers");
        heading.setFont(new Font("Tahoma",Font.BOLD,18));
        heading.setBounds(150,10,200,20);
        add(heading);
        
        JLabel  lblname=new JLabel("Name");
        lblname.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblname.setBounds(60,70,120,30);
        add(lblname);
        
        tfname=new JTextField();
        tfname.setBounds(200,70,150,30);
        add(tfname);
        
        
        JLabel  lblage=new JLabel("Age");
        lblage.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblage.setBounds(60,110,120,30);
        add(lblage);
        
        tfage=new JTextField();
        tfage.setBounds(200,110,150,30);
        add(tfage);
        
        JLabel  lblgender=new JLabel("Gender");
        lblgender.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblgender.setBounds(60,150,120,30);
        add(lblgender);
        
        String cleanOptions[]={"Male","Female"};
        gendercombo=new JComboBox(cleanOptions);
        gendercombo.setBounds(200,150,150,30);
        gendercombo.setBackground(Color.WHITE);
        add(gendercombo);
        
        JLabel  lblcompany=new JLabel("Car Company");
        lblcompany.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblcompany.setBounds(60,190,120,30);
        add(lblcompany);
        
        tfcompany=new JTextField();
        tfcompany.setBounds(200,190,150,30);
        add(tfcompany);
        
        JLabel lblmodel=new JLabel("Car Model");
        lblmodel.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblmodel.setBounds(60,230,120,30);
        add(lblmodel);
        
        tfmodel=new JTextField();
        tfmodel.setBounds(200,230,150,30);
        add(tfmodel);
        
        JLabel lblavailable=new JLabel("Available");
        lblavailable.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblavailable.setBounds(60,270,120,30);
        add(lblavailable);
        
        String driverOptions[]={"Availale","Busy"};
        availablecombo=new JComboBox(driverOptions);
        availablecombo.setBounds(200,270,150,30);
        availablecombo.setBackground(Color.WHITE);
        add(availablecombo);
        
        JLabel lbllocation=new JLabel("Location");
        lbllocation.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbllocation.setBounds(60,310,120,30);
        add(lbllocation);
        
        tflocation=new JTextField();
        tflocation.setBounds(200,310,150,30);
        add(tflocation);
        
        add=new JButton("Add Drivers");
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.setBounds(60,370,130,30);
        add.addActionListener(this);
        add(add);
        
        cancel=new JButton("Cancel");
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(Color.BLACK);
        cancel.setBounds(220,370,130,30);
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/six.jpg"));
        Image i2=i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(400,50,500,300);
        add(image);
        
        setBounds(300,200,980,470);
        setVisible(true);
        
    }
    public void  actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){
            String name=tfname.getText();
            String age=tfage.getText();
            String gender=(String) gendercombo.getSelectedItem();
            String company=tfcompany.getText();
            String brand=tfmodel.getText();
            String available=(String) availablecombo.getSelectedItem();
            String location=tflocation.getText();
            
            try{
                conn c=new conn();
                String str="insert into driver values('"+name+"','"+age+"','"+gender+"','"+company+"','"+brand+"','"+available+"','"+location+"')";
                c.s.executeUpdate(str);
                
                JOptionPane.showMessageDialog(null,"New Driver Added successfully!");
                
            }catch(Exception e){
                e.printStackTrace();
            }
            
            
        }else{
           setVisible(false); 
        }
    }
    
    
    
    public static void main(String args[]){
        new AddDrivers();
    }
}
