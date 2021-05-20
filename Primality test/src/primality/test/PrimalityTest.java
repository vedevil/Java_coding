/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primality.test;
import java.util.*;
/**
 *
 * @author Vaibhav varma
 */
public class PrimalityTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
         boolean prime;
        while(t!=0){
        num=scn.nextInt();
        prime=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
        prime=prime&&false;}
        }
        if(prime)
        {System.out.println("yes");}
        else {System.out.println("no");}
        t--;
        }
        
    }
    
}
