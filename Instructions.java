/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration_form;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
 public class Instructions extends JFrame implements ActionListener
{
 JLabel l1,l2,l3,l4,l5,l0,i;
 JFrame f;
 JButton b;
  ImageIcon remove1;
 Instructions()
  {
         Addinfo();
         Labels();
          SetBoundss();
          addEvent();
          ActionListenerEvent();
          setSize(600, 500);
          setBounds(350,180,600,500);
          
  }
 
   public void Addinfo()
   {
       
           l0= new JLabel("INSTRUCTIONS");
            b=new JButton("START");
            setTitle("Instruction");
            setSize(500, 200);
            setBounds(100,50,600,500);
            setLayout(null);
            setVisible(true);
            //setResizable(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            getRootPane().setBorder(BorderFactory.createLineBorder(Color.red,5));
   }

   public void Labels()
   {
           l1= new JLabel(" 1) Welcome to Online Quize Exam for General Aptitude exam");
           l2= new JLabel(" 2) Exam has Total 15 Questions");
           l3= new JLabel(" 3) Total Time for Exam is 30 Minutes");
           l4= new JLabel(" 4) Negative Marking Exam: NO");
           l5= new JLabel("  BEST OF LUCK FOR YOUR EXAM");
           i = new JLabel();
   }

        public void SetBoundss()
        {
            
        l0.setBounds(150, 20, 900, 60);
        l0.setFont(new Font("Verdana", Font.BOLD, 40));
        l5.setFont(new Font("Verdana", Font.ITALIC, 23));
        l0.setForeground(Color.red);
        l5.setForeground(Color.red);
        l1.setBounds(130,110,400,20);
        l2.setBounds(130,150,400,20);
        l3.setBounds(130,200,400,20);
        l4.setBounds(130,250,400,20);
        l5.setBounds(110,300,400,20);
         b.setBounds(210,360,150,50);
         b.setBackground(Color.black);
         b.setForeground(Color.white);
         b.setFont(new Font("Verdana", Font.BOLD, 19));
         remove1 = new ImageIcon(getClass().getResource("remove.png"));
         i.setIcon(remove1);
         i.setBounds(0,0,600,500);
         
         
        }
        
        public void addEvent()
        {
           add(l0); 
           add(l1);
           add(l2);
           add(l3);
           add(l4);
           add(l5);
           add(b);
           add(i);
        }
        
        public void ActionListenerEvent()
        {
            
             b.addActionListener(this);
        }
      @Override
    public void actionPerformed(ActionEvent e) 
     {
	 if(e.getSource()==b)
	 {

             new QuizPage("Pradnya").setVisible(true);
		 setVisible(false);
          }
     }
 public static void main(String[] args)
 {
	 Instructions i=new Instructions();
  }
}