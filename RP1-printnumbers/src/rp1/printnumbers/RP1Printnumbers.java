/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rp1.printnumbers;
import java.util.*;
/**
 *
 * @author Vaibhav varma
 */
public class RP1Printnumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(sum(365));
    }
    public static void printnum(int n){
    if(n == 0){return;}
    else {
    System.out.println(n);
    printnum(n-2);}
    }
    public static int power(int a,int b){
        if (b == 0){
            return 1;}
        else{
            return a*power(a,b-1);
        }
    }
    public static int fac(int n){
    if (n==0){return 1;}
    else {return n*fac(n-1);}
    
    }
    public static int fibo(int n){
    if( n== 2)
    {return 1;}
    else if (n == 1){return 0;}
    else{return fibo (n-1)+fibo(n-2);}
    }
    public static int sum(int n){
        if(n==0)
            return 0;
        else return  n%10+sum(n/10);
    }
}
