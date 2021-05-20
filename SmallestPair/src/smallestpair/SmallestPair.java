/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smallestpair;
import java.util.*;
import java.io.*;
import java.lang.*;

/**
 *
 * @author Vaibhav varma
 */
public class SmallestPair {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.lang.Exception {
        // TODO code application logic here
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int t=Integer.parseInt(br.readLine());
        while(t!=0){
         int l=Integer.parseInt(br.readLine());
         String in=br.readLine();
         StringTokenizer st=new StringTokenizer(in);
         int mino=Integer.parseInt(st.nextToken());
         int mint=Integer.parseInt(st.nextToken());
         if(mino>mint){
         int temp=mint;
         mint=mino;
         mino=temp;}
     
         int ne;
         for(int i=0; i<l-2;i++){
         
                 ne=Integer.parseInt(st.nextToken());
         if(ne>=mint){continue;}
         else 
         {mint=ne;}
         
         }
        System.out.println(mino+mint);
        
        t--;
    }
    
    }
    
}
