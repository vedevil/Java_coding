/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squaresfitintotriangle;
import java.util.*;
import java.lang.*;
import java.io.*;
/**
 *
 * @author Vaibhav varma
 */
public class SquaresfitintoTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.lang.Exception {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        int t =scn.nextInt();
        int b,count;
        while(t!=0){
        b=scn.nextInt();
        if(b==0 || b==1|| b==2){
        count=0;}
        else{ int a=b/2-1;
        count=0;
        for(int i=1;i<=a;i++){
        count+=i;
        }}
        System.out.println(count);
        t--;
        }
        
        
    }
    
}
