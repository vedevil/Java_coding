/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author Vaibhav varma
 */
public class Assignment_2 {
    public int intro()
    {JOptionPane.showMessageDialog(null,"WELCOME TO IIT BANK");
        String inputS;
        inputS=JOptionPane.showInputDialog("Press 1 to open an account OR Press 2 If u r existing user");
        int  input;
        input= Integer.parseInt(inputS);
        return input;            
    }
    public void newuser(){
            String newacc_name = JOptionPane.showInputDialog("ur name");
                String newacc_rollno = JOptionPane.showInputDialog("ur roll");
        int rollno = Integer.parseInt(newacc_rollno);
                int newaccno = 11840000 + rollno;
        JOptionPane.showMessageDialog(null,"CONGRATULATIONS...WELCOME TO IIT BANK");
        }
    int accno;
    public int existing(){
            String inputs3=JOptionPane.showInputDialog("ENTER UR ACC NO");
        int Input3=Integer.parseInt(inputs3);
        accno= Input3;
        String InputS2=JOptionPane.showInputDialog("PRESS 1 TO DEPOSIT /n PRESS 2 TO WITHDRAW /n PRESS 3 TO KNOW BALANCE");
        int Input2=Integer.parseInt(InputS2);
        return Input2;
        }
    int money;
    int mybal;
    public void accbal(){
    Random a=new Random();
        int c[] = new int[100];
    for(int b=1; b<=100; b++){
        Random moneyran1=new Random();
        int money1=moneyran1.nextInt(50);
         money=money1*100;
        c[b]=a.nextInt(money);
    }
    int j=1184200-accno;
    mybal= c[j];
    JOptionPane.showMessageDialog(null,"UR ACC BALANCE IS "+mybal);
            }
   public void error(){
   JOptionPane.showMessageDialog(null,"ENTER VALID OPTION");
   }
    public void deposit(){
        String InputD=JOptionPane.showInputDialog("ENTER AMOUNT TO WANT TO DEPOSIT");
        int dep=Integer.parseInt(InputD);
        money=money+dep;
        JOptionPane.showMessageDialog(null,"UR ACC BALANCE IS "+money);
    }
    public void withdraw(){
        String InputW=JOptionPane.showInputDialog("ENTER AMOUNT TO WANT TO withdraw");
        int wid=Integer.parseInt(InputW);
        if(wid>mybal) {System.out.println("sorry u have insufficient balance");}
        else{
    money=money-wid;
 JOptionPane.showMessageDialog(null,"UR ACC BALANCE IS "+money);
    }
    }
         int moneyu=money;
    public int balance(){
        return moneyu;
    }
    public void thanku(){JOptionPane.showMessageDialog(null,"THANK U FOR VISITING");
    }
}
        
    
