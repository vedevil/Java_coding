/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puppyandsum;
import java.io.*;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Vaibhav varma
 */
public class PuppyandSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.lang.Exception {
        // TODO code application logic here
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        long t=Long.parseLong(br.readLine());
        while(t!=0){
        String in=br.readLine();
        StringTokenizer st=new StringTokenizer(in);
        int a=Integer.parseInt(st.nextToken());
         int b=Integer.parseInt(st.nextToken());
         System.out.println(puppysum(a,b));
        t--;}
    }
    public static int sumupto(int n){
    
    if(n==0){return 0;}
    else return n+sumupto(n-1);
    }
    public static int puppysum(int a,int b){
    if(a ==0){return b;}
    else {b=sumupto(b);
    return puppysum(a-1,b);}
    
    }
    
}
