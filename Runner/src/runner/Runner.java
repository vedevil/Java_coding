/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runner;

/**
 *
 * @author Vaibhav varma
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LL check = new LL();
        check.insert(5);
        check.InsertAtStart(88);
        check.InsertAt(2, 14);
        check.InsertAt(1, 44);
   
        check.show();
        check.Search(5);
        check.Size();
    }
    
}
