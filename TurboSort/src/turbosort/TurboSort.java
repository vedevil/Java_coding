/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package turbosort;
import java.util.*;
import java.io.*;
import java.lang.*;
/**
 *
 * @author Vaibhav varma
 */
public class TurboSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.lang.Exception {
        // TODO code application logic here
        int t;
       Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        int [] ele=new int[t];
        for(int i=0;i<t;i++){
        ele[i]=sc.nextInt();
        
        }
        for(int i=1;i<t;i++){
        int j=i-1;
        while(j>=0 && ele[j]>ele[j+1]){
        int temp=ele[j];
        ele[j]=ele[j+1];
        ele[j+1]=temp;
        j--;
        }}
        for(int i=0;i<t;i++){
        System.out.println(ele[i]);}
}
}
