/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fac;
import java.util.*;
import java.math.*;

/**
 *
 * @author Vaibhav varma
 */
public class Fac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BigInteger fact ;
        int tc,no;
        Scanner scn=new Scanner(System.in);
        tc= scn.nextInt();
        no=scn.nextInt();
        while(tc>=1 && tc<=100){
        if(no>=1 && no<=100){
        fact = BigInteger.valueOf(1);
        for(int i =1;i<=no;i++)
        {
            fact=fact.multiply(BigInteger.valueOf(i));
        }}
        else{break;}
        tc--;
        System.out.println(fact);
        if(tc>=1){no=scn.nextInt();}}
    }
    
}
