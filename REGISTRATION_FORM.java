package registration_form;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class REGISTRATION_FORM extends JFrame implements ActionListener

{
    JLabel lo, l1,l2,l3,l4,l5,l6,p1,p2,res,l7,l8;
    JTextField tf1,tf2,tf3,tf4,tf7;
    JPasswordField tf5,tf6;
    JTextArea ad;
     String a[] = {"Male","Female"};
     JComboBox c;
     JButton submit,reset;
     JTextArea tout,resadd;
     JCheckBox term;
     ImageIcon i1 ;
//      JRadioButton male;
//      JRadioButton female;
//     
     
    REGISTRATION_FORM()
    {
        
        disp();
        Setboundss();
        AddEvent();
        ActionEvent1();
       
       setTitle("Registration Form");
       setSize(1000, 720);
       setBounds(100,50,1100,600);
       setLayout(null);
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
      // getRootPane().setBorder(BorderFactory.createLineBorder(Color.yellow, 5, rootPaneCheckingEnabled));
    }
    
    public void disp()
    {
        lo= new JLabel("REGISTRATION FORM");
        l1 = new JLabel("First Name   : ");
        l2 = new JLabel("Middle Name  :");
        l3 = new JLabel("Last Name : ");
        l4 = new JLabel("Email       :");
        p1 = new JLabel("Password : ");
        p2 = new JLabel(" Confirm Password : ");
        l6 =  new JLabel("Mobile Number    :");
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5= new JPasswordField();
        tf6 = new JPasswordField();
        l5 = new JLabel("Gender : ");
        c = new JComboBox(a);
        l7 = new JLabel("Address : ");
        ad= new JTextArea();
        submit = new JButton("Submit");
        reset = new JButton("Clear");
        l8 = new JLabel();
      
       
      //  l8.setLayout(null);
        i1 = new ImageIcon(getClass().getResource("Registration_Form.jpg"));
        l8.setIcon(i1);
       
        
    }
    
    public void Setboundss()
    {
        lo.setBounds(250, 20, 900, 60);
        lo.setFont(new Font("Verdana", Font.BOLD, 50));
        //lo.setFont(new Font("Verdana",Font.ROMAN_BASELINE,30));
       
         l1.setFont(new Font("Arial", Font.BOLD, 19));
         l2.setFont(new Font("Arial", Font.BOLD, 19));
         l3.setFont(new Font("Verdana", Font.BOLD, 19));
         l4.setFont(new Font("Verdana", Font.BOLD, 19));
         
         p1.setFont(new Font("Arial", Font.BOLD, 19));
         p2.setFont(new Font("Arial", Font.BOLD, 19));
         l5.setFont(new Font("Verdana", Font.BOLD, 19));
         l7.setFont(new Font("Verdana", Font.BOLD, 19));
         
         
        lo.setForeground(Color.BLACK);
        lo.setBackground(Color.red);
    	l1.setBounds(58, 152, 200, 43);
    	l2.setBounds(58, 243, 200, 29);
    	l3.setBounds(58, 324, 200, 36);
    	l4.setBounds(58, 405, 200, 36);
        p1.setBounds(542, 159, 200, 29);
    	p2.setBounds(530, 245, 250, 29);
    	l5.setBounds(542, 331, 200, 29);
        l7.setBounds(542, 405, 200, 29);
    	tf1.setBounds(214, 151, 228, 50);
//        tf1.setBackground(Color.lightGray);
//        tf2.setBackground(Color.DARK_GRAY);
    	tf2.setBounds(214, 235, 228, 50);
    	tf3.setBounds(214, 320, 228, 50);
    	tf4.setBounds(214, 405, 228, 50);
    	tf5.setBounds(707, 151, 228, 50);
    	tf6.setBounds(710, 235, 228, 50);
       // tf7.setBounds(707, 320, 228, 50);
    	c.setBounds(707, 320, 228, 50);
        ad.setBounds(707, 405, 228, 50);
        c.setBackground(Color.white);
       // term.setBounds(707, 405, 228, 50);
    	submit.setBounds(378, 483, 124, 50);
        submit.setBackground(Color.BLACK);
        submit.setFont(new Font("", Font.BOLD,20));
         //help.setFont(new Font("Verdana", Font.BOLD, 20));
        submit.setForeground(Color.white);
    	reset.setBounds(550, 483 , 124, 50);
        reset.setBackground(Color.BLACK);
        reset.setForeground(Color.white);
        reset.setFont(new Font("Verdana", Font.BOLD, 20));
          l8.setBounds(0,0,1100,600);
      //    f.setBorder(BorderFactory.createLineBorder(Color.blue));
    	
 	
    }
    
    public void AddEvent()
    {
          add(lo);
          add(l1);
          add(l2);
          add(l3);
          add(l4);
          add(p1);
          add(p2);
          add(l5);
          add(l7);
          add(tf1);
          add(tf2);
          add(tf3);
          add(tf4);
          add(tf5);
          add(tf6);
          add(ad);
          add(c);
          add(submit);
          add(reset);
          add(l8);
        
  
       // getContentPane().setBackground(Color.red);
    }
    
    public void ActionEvent1()
    {
    	submit.addActionListener(this);
    	reset.addActionListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if(e.getSource()==submit)
       {
           try
           {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Registration", "root", "root");
               
                 //Preapared Statement
                PreparedStatement Pstatement=conn.prepareStatement("insert into Registration values(?,?,?,?,?,?,?,?)");
                //Specifying the values of it's parameter
              
                Pstatement.setString(1,tf1.getText());
                Pstatement.setString(2,tf2.getText());
                Pstatement.setString(3,tf3.getText());
                Pstatement.setString(4,tf4.getText());
                Pstatement.setString(5,tf5.getText());
                
                Pstatement.setString(6,tf6.getText());
                Pstatement.setString(7,c.getSelectedItem().toString());
                Pstatement.setString(8,ad.getText());
                //Checking for the Password match
                if(tf5.getText().equalsIgnoreCase(tf6.getText()))
                {
                    
                    Pstatement.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Data Registered Successfully");
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Password Did Not Match");
                }
           }
           
            catch(Exception ae)
           {
               ae.getStackTrace();
           }
       }
           
            if(e.getSource()==reset)
        {
            //Clearing Fields
            tf1.setText(" ");
            c.setSelectedItem("");
            c.setSelectedItem("");
            tf2.setText(" ");
            tf3.setText(" ");
            tf4.setText(" ");
            tf5.setText(" ");
            tf6.setText(" ");
            ad.setText(" ");
        }
           
            new LoginForm().setVisible(true);
            setVisible(false);
            
       }
    
       

    public static void main(String[] args) {
        
       new  REGISTRATION_FORM();
    }
    
}


    
    

