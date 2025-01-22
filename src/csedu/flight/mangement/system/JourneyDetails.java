
package csedu.flight.mangement.system;


import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import net.proteanit.sql.DbUtils;

public class JourneyDetails extends JFrame implements ActionListener{
    JTable table;
    JTextField id;
    JButton show;
    
    public JourneyDetails() {
        
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null);
        
        JLabel lblpnr = new JLabel("National ID");
        lblpnr.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblpnr.setForeground(Color.YELLOW);
        lblpnr.setBounds(50, 50, 100, 25);
        add(lblpnr);
        
        id = new JTextField();
        id.setBounds(160, 50, 200, 30);
        add(id);
        
        show = new JButton("Show Details");
        show.setBackground(Color.GRAY);
        show.setForeground(Color.WHITE);
        show.setBounds(370, 50, 120, 30);
        show.addActionListener(this);
        add(show);
        
        table = new JTable();
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 800, 150);
        jsp.setBackground(Color.BLACK);
        add(jsp);
        
        setSize(800, 600);
        setLocation(400, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        try {
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from reservation where id = '"+id.getText()+"'");
            
            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "No Information Found");
                return;
            }
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new JourneyDetails();
    }
}