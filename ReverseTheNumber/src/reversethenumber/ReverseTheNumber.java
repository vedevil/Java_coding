/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversethenumber;
import java.util.*;
/**
 *
 * @author Vaibhav varma
 */
public class ReverseTheNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       String num,newnum="";
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t>=1 && t<=1000){
            num=scn.next();
            int n=Integer.parseInt(num);
            if(n>=1 && n<=100000){
                int l=num.length();
                int val;
                for(int i=0;i<l;i++){
                    val=l-i-1;
                newnum.charAt(i) = num.charAt(val);
                }
                int new=Integer.parseInt(newnum);
                System.out.println(new);
            }
            t--;
        }
        
    
}}
