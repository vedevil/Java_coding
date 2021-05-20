/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chefanddistinctno;
import java.lang.*;
import java.util.*;
import java.io.*;
/**
 *
 * @author Vaibhav varma
 */
public class ChefandDistinctno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.lang.Exception {
        // TODO code application logic here
        
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
        int t=Integer.parseInt(br.readLine());
        while (t !=0 ){
            int l=Integer.parseInt(br.readLine());
            int [] data=new int[l];
            String in=br.readLine();
           String ans=null;
            StringTokenizer st=new StringTokenizer(in);
            for(int i=0;i<l;i++){
            data[i]=Integer.parseInt(st.nextToken());
            for(int j=0;j<=i-1;j++)
                if(data[i] == data[j]){
                    ans="Yes";
                System.out.println(ans);
                break;}
            if(ans== "Yes") break;
            }
            if(ans != "Yes")System.out.println("No");
            
            
            t--;
        }
        
    }
    
}
