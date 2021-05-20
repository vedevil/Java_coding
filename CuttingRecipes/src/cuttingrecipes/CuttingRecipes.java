/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuttingrecipes;
import java.io.*;
import java.lang.*;
import java.util.*;
/**
 *
 * @author Vaibhav varma
 */
public class CuttingRecipes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.lang.Exception {
        // TODO code application logic here
     InputStreamReader isr=new InputStreamReader(System.in);
     BufferedReader br =new BufferedReader(isr);
     int t=Integer.parseInt(br.readLine());
     while(t!=0){
         String in=br.readLine();
         StringTokenizer st=new StringTokenizer(in);
         int num=Integer.parseInt(st.nextToken());
         int [] A=new int[num];
        A[0]=Integer.parseInt(st.nextToken());
        int min=A[0];
         for(int i=1;i<num;i++){
         A[i]=Integer.parseInt(st.nextToken());
         if(A[i]<A[i-1]){
        min=A[i];
         }}
        
         
         for(int k=min;k>=2;k--){
         int count=0;
         for(int i=0;i<num;i++){
             if(A[i]%k==0)
                 count++;
             else 
              continue;
         
         }
         if(count==num){
             for(int i=0;i<num;i++){
         A[i]=A[i]/k;}
         }
         else continue;
         }
         for(int i=0;i<num-1;i++)
         {System.out.print(A[i]+" ");}
         System.out.println(A[num-1]);
         
         t--;}
    }
    
}
