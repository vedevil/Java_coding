/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theblockgame;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Vaibhav varma
 */
public class TheBlockGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t >=1 && t<=20){
            
            boolean pal=true;
             String no=scn.next();
             int n= Integer.parseInt(no);
             if(no.charAt(0)=='0'){
             System.out.println("wins");}
             else if (n>=1 && n<= 10000){
           int l=no.length();
            
           
            for(int i=0;i<l/2;i++){
            if(no.charAt(i)!=no.charAt((l-1)-i)){
              //System.out.println(no.charAt((l);
              //System.out.println(no.charAt((l-i)-1);
             pal=false;
            break;}}
            if(pal)
            System.out.println("wins");
            else
            System.out.println("losses");
            
    }
     t--;
}
}
}