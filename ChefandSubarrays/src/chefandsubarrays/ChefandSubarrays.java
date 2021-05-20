/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chefandsubarrays;
import java.lang.*;
import java.util.*;
import java.io.*;
/**
 *
 * @author Vaibhav varma
 */
public class ChefandSubarrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.lang.Exception {
        // TODO code application logic here
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int t=Integer.parseInt(br.readLine());
        while(t!=0){
            int count=0;
        int size =Integer.parseInt(br.readLine());
        int [] data=new int[size];
        String datas=br.readLine();
        StringTokenizer st=new StringTokenizer(datas);
        for(int i=0;i<size;i++)
        {
        data[i]=Integer.parseInt(st.nextToken());}
        int s=0;
        
        for(int i=0;i<=data.length-s;i++){
            if(i==data.length-s){s++;
        i=-1;
            }
            else{
            int sum=0;
        int product=1;
        for(int j=i;j<=s+i;j++){sum+=data[j];
        product*=data[j];}
        if(sum==product)count++;}
        
        }
        
        
        System.out.println(count);
        t--;
        }
    }
    
}
