/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstandlastdigit;
import java.util.*;

import java.lang.*;
/**
 *
 * @author Vaibhav varma
 */
public class FirstAndLastDigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        int n;
        int count = 0;
        int fir=0,result;
        int last=0,temp,ten;
        while(t>=1 && t<=1000){
        n=scn.nextInt();
        if(n>=1 && n<=1000000){
            count=0;
            fir=0;
            last=n%10;
            temp=n;
        
        while(n != 0){
        count++;
        n=n/10;
        
        }
        ten=(int)Math.pow(10, count-1);
        fir=temp/ten;
               
        
        result=fir+last;
        System.out.println(result);
      
        }
        t--;
        }
    }
    
}
