/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubbleshot;

/**
 *
 * @author Vaibhav varma
 */
public class BubbleShot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a={9,5,2,5,7,2};
        int [] b=new int[6];
        int n=6;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            if(a[j]>a[j+1])
            {int temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
            
            }
        System.out.println(a[5-i]);
        
         }
    }
    
}
