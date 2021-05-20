/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;
import java.util.*;
/**
 *
 * @author Vaibhav varma
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int in,k,p=0,i,j;
        Scanner sc = new Scanner(System.in);
        in= sc.nextInt();
        for(i=1;i<=in;i++)
        {
            k=i/2;
            for(j=1;j<=k;j++)
            {
                if(i%j==0)
                {
                    p=p+j;
                }    
            }
            if(p==i)
            {
                System.out.println(i);
                
            }
            p=0;
            }
        
        
        
    }
    
}
