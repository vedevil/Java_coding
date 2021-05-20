/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime.no;

import javax.swing.JOptionPane;

/**
 *
 * @author Vaibhav varma
 */
public class PrimeNo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count=0;
        String I=JOptionPane.showInputDialog("Enter number");
        int i=Integer.parseInt(I);
        for(int j=2;j<i;j++){
        if(i%j==0)
        count++;
        
        }
        if(count!=0)
        JOptionPane.showMessageDialog(null,i+" is composite");
        else
        JOptionPane.showMessageDialog(null,i+" is prime");
    }
    
}
