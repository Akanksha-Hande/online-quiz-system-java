
package registration_form;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class WelcomePage extends JFrame implements ActionListener
{
    JButton next,help;
    ImageIcon image;
    JLabel label1,label2;
    
    public  WelcomePage()
     {
         info();
         setBoundss();
         Colors();
         addEvent();
         actionListenerEvent();
         
     }
    
     public void info()
     {
         
         next = new JButton("Next ---->");
         help = new JButton("<----Help ");
         image = new ImageIcon(getClass().getResource("image.jpg"));
         Image dabimage = image.getImage();
         Image modifiedImage = dabimage.getScaledInstance(1300, 900, java.awt.Image.SCALE_SMOOTH);
         image = new ImageIcon(modifiedImage);
         label1 = new JLabel(image);
       //  getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLUE,5));
       //  label2= new JLabel("ONLINE QUIZ SYSTEM");
         
         
     }
     
     public void setBoundss()
     {
         next.setBounds(1100,600 ,150, 50);
         help.setBounds(10,600 ,150, 50);
         label1.setBounds(0, 0, 1300,800);
        // label2.setBounds(100, 60, 500, 30);
         
         
     }
     
     public void Colors()
     {
         next.setBackground(Color.white);
         next.setForeground(Color.black);
         next.setFont(new Font("Verdana", Font.BOLD, 20));
         
         help.setBackground(Color.white);
         help.setForeground(Color.black);
         help.setFont(new Font("Verdana", Font.BOLD, 20));
     }
     
     public void addEvent()
     {
         add(next);
         add(help);
         add(label1);
        // add(label2);
     }
     
    public void actionListenerEvent()
    {
        next.addActionListener(this);
        help.addActionListener(this);
        
        
    }
    
     
      
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==next)
        {
             
                new REGISTRATION_FORM().setVisible(true);
                this.setVisible(false);
               
        }
        
        else if(e.getSource()==help)
        {
         
           // new REGISTRATION_FORM();
        }
      
     
    }
     
   
    public static void main(String[] args) 
    {
       WelcomePage f = new WelcomePage();
       f.setTitle("WELCOME PAGE");
       f.setSize(1300, 720);
       f.setLayout(null);
       f.setVisible(true);
       f.setBounds(30,5,1300,720);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }

    

   
   
    
}
