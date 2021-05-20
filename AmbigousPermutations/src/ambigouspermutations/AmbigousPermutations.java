/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ambigouspermutations;
import java.io.*;
import java.lang.*;
import java.util.*;
/**
 *
 * @author Vaibhav varma
 */
public class AmbigousPermutations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.lang.Exception {
        // TODO code application logic here

        InputStreamReader is=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(is);
        int l=Integer.parseInt(br.readLine());
        while(l!=0){
            String in =br.readLine();
            StringTokenizer st =new StringTokenizer(in);
            int [] ele=new int [l];
            
        for(int i=0;i<l;i++){
            int count=0;
        int a=Integer.parseInt(st.nextToken());
        for(int j=i-1;j>=0;j--){
            if(a!=ele[j]){count++;}
        }
        if(count==i){ele[i]=a;}
        else return ;
        }
        int [] ans=new int [l];
        for(int i=0;i<l;i++){
        ans[ele[i]-1]=i+1;
        }
        
        
        
        int c=0;
        for(int i=0;i<l;i++){
        if(ele[i]==ans[i])c++;}
        if(c==l) System.out.println("ambiguous");
        else System.out.println("not ambiguous");
        l=Integer.parseInt(br.readLine());
        }
        return;
    }
    
}
