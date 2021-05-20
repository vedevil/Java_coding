/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gudduonadate;
import java.lang.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author Vaibhav varma
 */
public class GudduonaDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws java.lang.Exception {
        // TODO code application logic here
        
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
long t = Integer.parseInt(br.readLine());
while(t!=0){
    long in=Integer.parseInt(br.readLine());
    long n=11L;
    long no=n;
    long sum=0L;
    long count=0L;
    long ans=0L;
    while(no != 0){
    sum=sum+(no%10);
    no=no/10;
    if(no ==0 && sum%10 == 0) count++;
    if(count == in){ans=n;
    break;}
    if(no == 0){sum=0;
    n++;
    no=n;
    continue;}
    
    
    }
    System.out.println(ans);
t--;
}
    }
    
}
