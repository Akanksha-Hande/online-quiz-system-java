
package registration_form;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginForm extends JFrame implements ActionListener
{
    
    JLabel user,pass,label,img,i;
    JTextField  tf1;
    JPasswordField tf2;
    JButton resetButton,loginButton,nextButton;
    JCheckBox showPassword;
    ImageIcon image,remove1;
    
   public  LoginForm()
    {
        setTitle("Login Form");
        setSize(700, 400);
        setBounds(350,180,600,500);
        setLayout(null);
        setVisible(true);
       // setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
        
        Addinfo();
        SetBoundss();
        AddEvent();
        addActionEvent();
    }
   
     public void Addinfo()
     {
          label= new JLabel("LOGIN FORM");
          user = new JLabel("Username :");
          pass = new JLabel("Password :");
          tf1 = new JTextField();
          tf2 = new JPasswordField();
          loginButton=new JButton("LOGIN");
          resetButton=new JButton("RESET");
          nextButton =new JButton("NEXT");
          showPassword=new JCheckBox("Show Password");
           img= new JLabel();
           i = new JLabel();
 
          
     }
     
     public void SetBoundss()
     {
         user.setBounds(58, 120, 200, 43);
         user.setFont(new Font("Verdana", Font.BOLD, 19));
       
         pass.setBounds(58, 220, 200, 43);
         pass.setFont(new Font("Verdana", Font.BOLD, 19));
         label.setBounds(130, 20, 900, 60);
         label.setFont(new Font("Verdana", Font.BOLD, 50));
        
         showPassword.setFont(new Font("Verdana", Font.BOLD, 19));
         tf1.setBounds(214, 120, 228, 50);
         tf2.setBounds(214, 220, 228, 50);
         
         showPassword.setBounds(214,300,230,32);
         loginButton.setBounds(40,360,150,50);
         loginButton.setBackground(Color.black);
        
         showPassword.setBackground(Color.white);
         loginButton.setForeground(Color.white);
         loginButton.setFont(new Font("Verdana", Font.BOLD, 16));
        //  showPassword.setFont(new Font("Verdana", Font.BOLD, 10));
         
         resetButton.setBounds(210,360,150,50);
         resetButton.setBackground(Color.black);
         resetButton.setForeground(Color.white);
         resetButton.setFont(new Font("Verdana", Font.BOLD, 19));
         
         nextButton.setBounds(380,360,150,50);
         nextButton.setBackground(Color.black);
         nextButton.setForeground(Color.white);
         nextButton.setFont(new Font("Verdana", Font.BOLD, 19));
         img.setBounds(450,90,500,300);
         
      
        getContentPane().setBackground(Color.white);
//       // showPassword .setLayout(null);
//        image = new ImageIcon(getClass().getResource("login.jpg"));
//        img.setIcon(image);
          remove1 = new ImageIcon(getClass().getResource("Rem2.png"));
         i.setIcon(remove1);
         i.setBounds(0,0,800,600);
     
     }
     
     public void AddEvent()
     {
         add(label);
         add(user);
         add(pass);
         add(tf1);
         add(tf2);
         add(showPassword);
         add(loginButton);
         add(resetButton);
         add(nextButton);
        // add(img);
         add(i);
     }
     
     public void addActionEvent()
   {
      //adding Action listener to components
       loginButton.addActionListener(this);
       resetButton.addActionListener(this);
       nextButton.addActionListener(this);
       showPassword.addActionListener(this);
   }
 
   
      
   
    public void actionPerformed(ActionEvent e) 
    {
         if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = tf1.getText();
            pwdText = tf1.getText();
            if (userText.equalsIgnoreCase("Admin") && pwdText.equalsIgnoreCase("Admin")) 
            {
                 JOptionPane.showMessageDialog(this, "Login Successful");
            } else 
            {
                 JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
 
        }
        //Coding Part of RESET button
        if (e.getSource() == resetButton) {
            tf1.setText("");
            tf2.setText("");
        }
       //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                tf2.setEchoChar((char) 0);
            } else {
                tf2.setEchoChar('*');
            }
 
 
        }
          if(e.getSource()==nextButton)
          {
               new Instructions().setVisible(true);
             setVisible(false);
          }
    }
 

     public static void main(String[] args) 
     {
        LoginForm frame = new LoginForm(); 
       
     }

}
