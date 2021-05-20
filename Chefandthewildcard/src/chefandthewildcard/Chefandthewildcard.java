/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chefandthewildcard;
import java.util.*;
/**
 *
 * @author Vaibhav varma
 */
public class Chefandthewildcard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        
        int t=sc.nextInt();
        while (t!=0){
        String s1=sc.next();
        String s2=sc.next();
        int count=0;
        if(s1.length()==s2.length()){
        for(int i=0;i<s1.length();i++){
        if(s1.charAt(i)=='?' || s2.charAt(i)=='?' || s1.charAt(i) == s2.charAt(i)){
        count++;
        
        
        
        }
        
        
        else {
      
        break;}
        
        
        
        
        }}
        else return;
        
       if(count==s1.length())
           System.out.println("Yes");
       else
           System.out.println("No");
       t--;
        }
        
    }
    
}
