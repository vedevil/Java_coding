/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vbst;

/**
 *
 * @author Vaibhav varma
 */
public class VBST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Methods usr=new Methods();
  Node root = null;
  root = usr.insert(root, 8);  
  root = usr.insert(root, 3); 
  root = usr.insert(root, 6);  
  root = usr.insert(root, 10);  
  root = usr.insert(root, 4);  
  root = usr.insert(root, 7);  
  root = usr.insert(root, 1);  
  root = usr.insert(root, 14); 
  root = usr.insert(root, 13);
  System.out.println(root.data);
  
    }
    
}
