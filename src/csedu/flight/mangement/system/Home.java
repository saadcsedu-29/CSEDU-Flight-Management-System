package csedu.flight.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{
    
    public Home() {
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("csedu/flight/mangement/system/icons/flight2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 800);
        add(image);
        
        //dsfsdgsdgsdgsd
        /*ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("csedu/flight/mangement/system/icons/flight2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(i2);
        JLabel lblimage = new JLabel(image);
        lblimage.setBounds(600, 50, 300, 300);
        add(lblimage);*/
        //sdgfsdgsdgsdgsgd
        
        
        
        JLabel heading = new JLabel("WELCOME TO AIR CSEDU");
        heading.setBounds(450, 20, 1000000, 100);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 60));
        image.add(heading);
        
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);
        
        JMenu details = new JMenu("Details");
        menubar.add(details);
        
        JMenuItem flightDetails = new JMenuItem("Flight Details");
        flightDetails.addActionListener(this);
        details.add(flightDetails);
        
        JMenuItem customerDetails = new JMenuItem("Add Customer Details");
        customerDetails.addActionListener(this);
        details.add(customerDetails);
        
        JMenuItem bookFlight = new JMenuItem("Book Flight");
        bookFlight.addActionListener(this);
        details.add(bookFlight);
        
        JMenuItem journeyDetails = new JMenuItem("Journey Details");
        journeyDetails.addActionListener(this);
        details.add(journeyDetails);
        
        JMenuItem ticketCancellation = new JMenuItem("Cancel Ticket");
        ticketCancellation.addActionListener(this);
        details.add(ticketCancellation);
        
        JMenu ticket = new JMenu("Ticket");
        menubar.add(ticket);
        
        JMenuItem boardingPass = new JMenuItem("Boarding Pass");
        boardingPass.addActionListener(this);
        ticket.add(boardingPass);

        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String text = ae.getActionCommand();
        
        if (text.equals("Add Customer Details")) {
            new AddCustomer();
        }
        else if (text.equals("Flight Details")) {
            new FlightInfo();
        }
        else if (text.equals("Book Flight")) {
            new BookFlight();
        } 
        else if (text.equals("Journey Details")) {
            new JourneyDetails();
        } 
        else if (text.equals("Cancel Ticket")) {
            new Cancel();
        }
        else if (text.equals("Boarding Pass")) {
            new BoardingPass();
        }
    }
    
    public static void main(String[] args) {
        new Home();
    }
}