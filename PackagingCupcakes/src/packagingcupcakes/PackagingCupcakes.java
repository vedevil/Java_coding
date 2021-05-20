/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagingcupcakes;
import java.util.*;

/**
 *
 * @author Vaibhav varma
 */
public class PackagingCupcakes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn =  new Scanner(System.in);
        int t=0;
        int n=0;
        t=scn.nextInt();
        int dig;
        while(t>=1 && t<=1000){
            dig =0;
             n=scn.nextInt();
        if(n>=2 && n<=100000000){
           dig=n/2;
           dig=dig+1;
        }
        else{return;}
        System.out.println(dig);}
       
    }
    
}
