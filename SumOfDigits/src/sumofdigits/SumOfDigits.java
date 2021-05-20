/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofdigits;
import java.util.*;

/**
 *
 * @author Vaibhav varma
 */
public class SumOfDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        int tc=scn.nextInt();
        int in=scn.nextInt();
        
        int dig=0;
        while(tc>=1 && tc<=1000){
            int result=0;
        while(in !=0 && in>=1 && in<=1000000){
      
        dig=in%10;
        in=in/10;
        result=result+dig;}
       
     System.out.println(result);
     tc--;
      if(tc>=1)
        {in=scn.nextInt();}}
    }
    
}
