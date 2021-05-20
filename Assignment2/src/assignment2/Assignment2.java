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
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        
        Assignment_2 user=new Assignment_2();
        {
            if(user.intro()==1){
            user.newuser();
        }
        
        if(user.intro()==2){
            int i=user.existing();
            if(i==1){user.deposit();}
            if(i==2){user.withdraw();}
            if(i==3){user.balance();}
            else {user.error();}
        }
        
        else user.error();
    }
        user.thanku();
    }

    
    
}
