/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcm.gcd;
import java.util.*;
import java.lang.*;
import java.io.*;
/**
 *
 * @author Vaibhav varma
 */
public class LCMGCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.lang.Exception {
        // TODO code application logic here
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        long t=Integer.parseInt(br.readLine());
        while(t!=0){
            String num = br.readLine();
            StringTokenizer st=new StringTokenizer(num);
            long a=Integer.parseInt(st.nextToken());
            
            long b=Integer.parseInt(st.nextToken());
          
            long tb=b;
            long ta=a;
            if(a==0 || b==0){return;}
            else{
            while(a%b!=0){
            long temp=b;
            b=a%b;
            a=temp;
            }
            long gcd=b;
            long lcm=ta*tb/gcd;
            System.out.println(gcd+" "+lcm);}
        t--;
        }
    }
    
}
