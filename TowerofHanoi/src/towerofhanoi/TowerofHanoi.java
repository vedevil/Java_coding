/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerofhanoi;

/**
 *
 * @author Vaibhav varma
 */
public class TowerofHanoi {

    /**
     * @param args the command line arguments
     */
    public static void toh(int n,char from,char to,char using){
    if(n==0)
        return;
    else
    {
    toh(n-1,from,using,to);
    System.out.println("move disk "+ n  +" from "+from + " to " + to);
    toh(n-1,using,to,from);
            }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        toh(3,'a','c','b');
    }
    
}
