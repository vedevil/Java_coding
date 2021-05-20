/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cielandrecipt;
import java.util.*;
/**
 *
 * @author Vaibhav varma
 */
public class CielandRecipt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        while(t !=0 ){
            
        int in=scn.nextInt();
        int count=0;
        int temp=in;
        while(in>2048)
        {in=in-2048;
        count++;}
        for(int i=2048;i>=1;i=i/2){
            
        if(in>=i){
        in=in-i;
        count++;
        }
        else{continue;}}
        System.out.println(count);
        t--;
        }}
    
}
