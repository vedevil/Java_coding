/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayrunner;

import javax.swing.JOptionPane;

/**
 *
 * @author Vaibhav varma
 */
public class VArray {
    int size;
    int [] a;
    VArray(){
        String sizeS= JOptionPane.showInputDialog ("enter the size u want");
        size = Integer.parseInt(sizeS);
        //System.out.println(size);
        a = new int[size];
        int i=0;
        while(i<size)
        {
            String inputS = JOptionPane.showInputDialog ("enter number");
        int input= Integer.parseInt(inputS);
        a[i]= input;
                i++;
        }
        
    }
    
    public void show(){
        int i =0;
        String s;
            s = "[";
        while (i<size-1)
        {s += a[i]+",";
        i++;
        }
        s += a[i-1];
        s +="]";
        JOptionPane.showMessageDialog(null,"Your array is " + s);
    }
    
    int count;
    public int count(){
        int i =0;
        count=0;
        while(i<size){
            if(a[i] != 0){
                count+=1;
            }
        i++;
        }
        return count;
    }
    public void noofe(){
    JOptionPane.showMessageDialog(null,"No of Elements is "+count);
    }
    
    public void inserte(){
        int c;
    String inputS = JOptionPane.showInputDialog("enter element that u want to add");
    int input = Integer.parseInt(inputS);
    if(count()==size)
        JOptionPane.showMessageDialog(null,"Sorry array is FULL");
    if(count==0){
        a[0]=input;
        count++;}
    else 
    {c = count;
    a[c]=input;
    count++;}
    }
    
    public void insertp(){
    String position = JOptionPane.showInputDialog("enter position");
    int positioni = Integer.parseInt(position);
    String data = JOptionPane.showInputDialog("enter data");
    int datai = Integer.parseInt(data);
    if(positioni>size) JOptionPane.showMessageDialog(null,"Sorry array limit is "+size);
    if(a[positioni-1]!=0)
        JOptionPane.showMessageDialog(null,"Sorry place is already filled");
    else a[positioni-1]=datai;
}
   
    public void replace(int p, int e){
    a[p-1] = e;
    }
    
    public void deletep(){
    String ps = JOptionPane.showInputDialog("Enter position");
    int p=Integer.parseInt(ps);
    a[p-1]=0;
    }
    public void deletee(){
        String es = JOptionPane.showInputDialog("Enter element");
    int e=Integer.parseInt(es);
    int i = 0;
    while(i<size){
    a[i]=e;
    break;}
    a[i]=0;
    }
    
    public void querye(){
    String es = JOptionPane.showInputDialog("Enter element");
    int e=Integer.parseInt(es);
    int i = 0;
    while(i<size-1){
        if(a[i]==e) 
        JOptionPane.showMessageDialog(null,"Element is here");
        if(a[size-1]==e) JoptionPane.showMessageDialog(null,"Element is here");
        else JOptionPane.showMessageDialog(null,"Element is not here");
    }
    public void queryp(){
    String es = JOptionPane.showInputDialog("Enter element");
    int e=Integer.parseInt(es);
    }
    
    public void reverse(){
        int [] b=new int[size];
        int i= 0;
        while(i<size){
        b[i]=a[size -i];
        }
        int j =0;
        String s;
            s = "[";
        while (j<size-1)
        {s += b[i]+",";
        i++;
        }
        s += b[i-1];
        s +="]";
        JOptionPane.showMessageDialog(null,"Your array is " + s);
    }
    public void sort(){ for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            if(a[j]>a[j+1])
            {int temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
            
            }
            
        System.out.println(a[5-i]);}
    }
    public void reverse{
int [] b=new int[]}
    public void run(){
        String es = JOptionPane.showInputDialog("Press 1 to insert"+ "\nPress 2 to delete" +"\nPress 3 to sort"+"\nPress 4 to query"+"\nPress 5 to end program");
    int in =Integer.parseInt(es);
    if(in==1) {
        String is = JOptionPane.showInputDialog("Press 1 to enter at last"+"\nPress 2 to insert at any position");
   int i =Integer.parseInt(is);
           if(i==1) inserte();
           if(i==2) insertp();
           else JOptionPane.showMessageDialog(null, "Enter a valid key");
          }
    if(in==2){
        String is = JOptionPane.showInputDialog("Press 1 to delete element"+"\nPress 2 to delete at any position");
   int i =Integer.parseInt(is);
   if(i==1) deletee();
   if(i==2) deletep();    
    }
    if(in==3) sort();
    if(in==4) reverse();
    }
    }
}
    
            

        
    
    
    
    
    
