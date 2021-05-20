/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Vaibhav varma
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.lang.Exception {
        // TODO code application logic here
         InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int t = Integer.parseInt(br.readLine());
while (t!=0){
            String in=br.readLine();
            
            StringTokenizer st=new StringTokenizer(in);
            int n=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());
            if(k<=n/2){
                String e=br.readLine();
             StringTokenizer stz=new StringTokenizer(e);
            char [] ek=new char[k];
            for(int i=0;i<k;i++){
                String s=stz.nextToken();
            ek[i]=s.charAt(0);
            }
            char [] enk=new char[n-k];
            for(int i=k;i<n;i++){
                String s=stz.nextToken();
            enk [i-k]=s.charAt(0);
            }
            
            char [] f=new char[n];
            for(int i=0;i<n;i++){
            f[i]=(char)-1;}
            
            for(int i=0;i<k;i++){
                f[2*i]=ek[i];
                
            }
            for(int i=0;i<n-k;i++){
            for(int j=1;j<n;j++)
            {
                if(f[j]==(char)-1 && enk[i]!=f[j-1])
            {
                f[j]=enk[i];
                break;}
            
            }
          
        }
           // System.out.println(f[n-2]);
            String ans=" ";
            for(int i =0;i<n;i++){
            ans=ans+f[i];}
            System.out.println("your Required String is"+ans); 
            } 
            else System.out.println("invalid input"); 
            
            t--;
        }
    }
    
}
