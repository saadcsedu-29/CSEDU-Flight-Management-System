
package csedu.flight.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddCustomer extends JFrame implements ActionListener{
    
    JTextField tfname, tfphone, tfid, tfnationality, tfaddress;
    JRadioButton rbmale, rbfemale;
    
    public AddCustomer() {
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        JLabel heading = new JLabel("ADD CUSTOMER DETAILS");
        heading.setBounds(240, 20, 800, 35);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 32));
        heading.setForeground(Color.YELLOW);
        add(heading);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(60, 80, 150, 25);
        lblname.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblname.setForeground(Color.YELLOW);
        add(lblname);
        
        tfname=new JTextField();
        tfname.setBounds(220,80,250,25);
        add(tfname);
        
        JLabel lblnationality = new JLabel("Nationality");
        lblnationality.setBounds(60, 130, 150, 25);
        lblnationality.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblnationality.setForeground(Color.YELLOW);
        add(lblnationality);
        
        tfnationality=new JTextField();
        tfnationality.setBounds(220,130,250,25);
        add(tfnationality);
        
        JLabel lblid = new JLabel("National ID");
        lblid.setBounds(60, 180, 150, 25);
        lblid.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblid.setForeground(Color.YELLOW);
        add(lblid);
        
        tfid=new JTextField();
        tfid.setBounds(220,180,250,25);
        add(tfid);
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(60, 230, 150, 25);
        lbladdress.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lbladdress.setForeground(Color.YELLOW);
        add(lbladdress);
        
        tfaddress=new JTextField();
        tfaddress.setBounds(220,230,250,25);
        add(tfaddress);
        
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(60, 295, 150, 25);
        lblgender.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblgender.setForeground(Color.YELLOW);
        add(lblgender);
        
        ButtonGroup gendergroup = new ButtonGroup();
        
        rbmale = new JRadioButton("Male");
        rbmale.setBounds(220, 295, 70, 25);
        rbmale.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rbmale.setForeground(Color.YELLOW);
        rbmale.setBackground(Color.BLACK);
        add(rbmale);
        
        rbfemale = new JRadioButton("Female");
        rbfemale.setBounds(330, 295, 100, 25);
        rbfemale.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rbfemale.setForeground(Color.YELLOW);
        rbfemale.setBackground(Color.BLACK);
        add(rbfemale);
        
        gendergroup.add(rbmale);
        gendergroup.add(rbfemale);
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(60, 355, 150, 25);
        lblphone.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblphone.setForeground(Color.YELLOW);
        add(lblphone);
        
        tfphone=new JTextField();
        tfphone.setBounds(220,355,250,25);
        add(tfphone);
       
        JButton save = new JButton("SAVE");
        save.setBackground(Color.GRAY);
        save.setForeground(Color.WHITE);
        save.setBounds(380, 450, 150, 30);
        lblphone.setFont(new Font("Tahoma", Font.PLAIN, 25));
        save.addActionListener(this);
        add(save);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("csedu/flight/mangement/system/icons/p3.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(i2);
        JLabel lblimage = new JLabel(image);
        lblimage.setBounds(550, 30, 280, 400);
        add(lblimage);
        
        
        /*ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("csedu/flight/mangement/system/icons/csedu.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(i2);
        JLabel lblimage = new JLabel(image);
        lblimage.setBounds(600, 50, 300, 300);
        add(lblimage);*/
        
        
        
        
        setSize(900, 600);
        setLocation(300, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String name = tfname.getText();
        String nationality = tfnationality.getText();
        String phone = tfphone.getText();
        String address = tfaddress.getText();
        String id = tfid.getText();
        String gender = null;
        if (rbmale.isSelected()) {
            gender = "Male";
        } else {
            gender = "Female";
        }
        
        try {
            Conn conn = new Conn();
            
            String query = "insert into passenger values('"+name+"', '"+nationality+"', '"+phone+"', '"+address+"', '"+id+"', '"+gender+"')";
        
            conn.s.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");
        
            setVisible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     public static void main(String[] args) {
        new AddCustomer();
    }
}
