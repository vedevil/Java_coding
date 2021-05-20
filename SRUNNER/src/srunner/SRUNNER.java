/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srunner;

/**
 *
 * @author Vaibhav varma
 */
public class SRUNNER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        STK check = new STK();
        check.createstack(2);
        check.push(5);
         check.push(15); 
     
        check.show();
        check.pop();
        check.show();
        check.peek();
        
        
}
}

