/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimummaximum;
import java.util.*;
import java.io.*;
import java.lang.*;
/**
 *
 * @author Vaibhav varma
 */
public class MinimumMaximum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0)
        {
        int n=sc.nextInt();
        int sum=0;
        int height=0;
        int counter=0;
        while (sum<=n){
            System.out.println(sum);
        counter++;
            sum+=counter;
        
        height++;
        
        }
        System.out.println(height-1);
        t--;
        }        
    }
    
}
