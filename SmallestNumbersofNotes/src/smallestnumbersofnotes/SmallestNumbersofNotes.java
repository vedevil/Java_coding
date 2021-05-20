/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smallestnumbersofnotes;
import java.util.*;
/**
 *
 * @author Vaibhav varma
 */
public class SmallestNumbersofNotes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        int A[] ={1,2,5,10,50,100};
        int count,ans;
        int t=scn.nextInt();      
            while(t!=0){
            int n=scn.nextInt();
            count =0;
            for(int i=5;i>=0;i--){
            if(n>=A[i]){
            ans=n/A[i];
            n=n%A[i];
            count += ans;
            }
                }
            System.out.println(count);
            t--;}
    }
    
}
