/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copsandthetheifdevu;
import java.util.*;
import java.io.*;
import java.lang.*;
/**
 *
 * @author Vaibhav varma
 */
public class CopsandtheTheifDevu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.lang.Exception {
        // TODO code application logic here
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int t=Integer.parseInt(br.readLine());
        while (t!=0){
         String in=br.readLine();
         StringTokenizer st=new StringTokenizer(in);
         int m=Integer.parseInt(st.nextToken());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            int range=x*y;
            String houses =br.readLine();
            StringTokenizer stz=new StringTokenizer(houses);
            
            String [] status=new String [100];
            for(int i=0;i<m;i++){
                
            int houseno=Integer.parseInt(stz.nextToken());
            int minr=houseno-range;
            int maxr=houseno+range;
            if(minr<1){minr=1;}
            if(maxr>100){maxr=100;}
            for(int j=minr;j<=maxr;j++){
            status[j-1]="danger";}
            }
            int count=0;
            for(int k=0;k<100;k++){
            if(status[k]=="danger"){
            count++;}}
            System.out.println(100-count);
            
            
            
            
            t--;
        }
        }
    }
