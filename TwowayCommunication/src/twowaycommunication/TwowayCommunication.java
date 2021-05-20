/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twowaycommunication;
import java.util.*;
import java.lang.*;
import java.io.*;
/**
 *
 * @author Vaibhav varma
 */
public class TwowayCommunication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.lang.Exception {
        // TODO code application logic here
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int t=Integer.parseInt(br.readLine());
        int [][] x=new int[5][2];
        while(t!=0){
            int count=0;
            int range=Integer.parseInt(br.readLine());
            for(int i=0;i<3;i++){
                
             String sc =br.readLine();
             StringTokenizer stc=new StringTokenizer(sc);
             x[i][0]=Integer.parseInt(stc.nextToken());
             x[i][1]=Integer.parseInt(stc.nextToken());
             
            }
            
            for(int i=0;i<2;i++){
                for(int j=i+1;j<3;j++){
            double ans= Math.pow(x[i][0]-x[j][0], 2)+ Math.pow(x[i][1]-x[j][1], 2);
            //System.out.println(ans);
            if(Math.sqrt(ans)<=range){
                count++;
            }}
            
            }
            if(count>=2)
                System.out.println("yes");
            else
                System.out.println("no");
        t--;
        }
    }
    
}
