/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accbal;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Vaibhav varma
 */
public class Accbal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  int money;
    int mybal;
    int money;
    String acn=JOptionPane.showInputDialog("enter ur acc no");
    int accno=Integer.parseInt(acn);
    Random a=new Random();
        Random moneyran1=new Random();
        money=moneyran1.nextInt(50);
      
        int j=money*100;
    mybal=j;
    JOptionPane.showMessageDialog(null,mybal);
    
    }

}

