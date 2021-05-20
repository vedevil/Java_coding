/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayequal;
import java.util.*;

/**
 *
 * @author Vaibhav varma
 */
public class Arrayequal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        int[] A = new int[n];
        
        Scanner abc = new Scanner(System.in);
        String datas;
        datas = abc.nextLine();
        boolean ans = false;
        StringTokenizer stz = new StringTokenizer(datas);
     
        for(int i=0;i<n;i++){
            A[i]=Integer.parseInt(stz.nextToken());
            
        }
        for(int j=0;j<n;j++)
        {for(int k =0;k<n;k++){
        if(A[j]==A[k] && j != k){
        ans = true;
        break;
        }
        }
        }
        if(ans){System.out.println("Yes");}
        else {System.out.println("No");}
    }
}
