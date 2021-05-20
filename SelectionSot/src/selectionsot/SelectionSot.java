/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsot;

/**
 *
 * @author Vaibhav varma
 */
public class SelectionSot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a={2,5,1,3,9,7};
        int n=6;
        int minval,minind,i,j;
        for(i=0;i<n;i++)
        {
        minval=a[i];
        minind=i;
        for(j=i;j<n;j++)
        {if(minval>a[j])
        {
        minval=a[j];
        minind=j;
        }
        if(minval<a[i])
        {
            int temp=a[i];
            a[i]=minval;
            a[j]=temp;
        }
            
        }
        System.out.println(a[i]);
        }
        
        }
    }
    

