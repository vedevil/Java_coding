/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarray;

import javax.swing.JOptionPane;

/**
 *
 * @author Vaibhav varma
 */
public class arrayMethods{
    
    public void show(int [] y){
        String s="[";
        int i=0;
        int n=y.length;
        while(i<(n-1)){
            s=s+y[i]+",";
            i++;
        }
        s=s+y[size-1]+"]";
        JOptionPane.showMessageDialog(null,s);
      }
    int size;
    int [] a;
    String sh="You entered = ";
    arrayMethods(){
        String sizeS=JOptionPane.showInputDialog("Enter size u want");
        size=Integer.parseInt(sizeS);
        int i=0;
        a=new int [size];
        while(i<size)
        {String eS=JOptionPane.showInputDialog("Enter "+(i+1)+" element");
        int eI=Integer.parseInt(eS);
        a[i]=eI;
        i++;
        }
        show(a);
    }
   
    public int noofe(){
    int count=0;
    int i=0;
    while(i<size){
        if(a[i]!=0)
        {count+=1;}
        i++;
    }
    return count;
    }
    
    public boolean isfull(){
     if(noofe()==size)
        return true;
        else
         return false;
    }
    public void inserte(){
        String eS=JOptionPane.showInputDialog("Enter elment that u want");
        int e=Integer.parseInt(eS);
    int pos=0;
    while(pos<size)
    {if(a[pos]!=0)pos++;
    else break;
    }
    a[pos]=e;
    }
    public void insertp(){
    String positionS = JOptionPane.showInputDialog("Enter position");
    int position = Integer.parseInt(positionS);
    String dataS = JOptionPane.showInputDialog("Enter data");
    int data= Integer.parseInt(dataS);
    if(position>size) JOptionPane.showMessageDialog(null,"Sorry array limit is "+size);
    if(a[position-1]!=0)
    {JOptionPane.showMessageDialog(null,"Sorry place is already filled");
     String rS=JOptionPane.showInputDialog("Do u want to replace it"+"\nY for yes...N for no");
        if(rS=="y" || rS=="Y") a[position-1]=data;
        if(rS=="n" || rS=="N") return;
        else JOptionPane.showMessageDialog(null,"Enter valid option");
    }
    else 
            a[position-1]=data;
    }
    
    public boolean isempty(){
    if(noofe()==0)
        return true;
    else
        return false;
    }
    public void deletep(){
        String positionS = JOptionPane.showInputDialog("Enter position");
    int position = Integer.parseInt(positionS);
    a[position-1]=0;
    }
    public void deletee(){
        String eS = JOptionPane.showInputDialog("Enter element");
    int e = Integer.parseInt(eS);
    for(int i=0;i<size;i++)
    {
    if(a[i]==e)
    a[i]=0;}
    }
    
     public void sort(int [] x){ 
        int n=x.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            if(x[j]>x[j+1])
            {
                int temp=x[j];
            x[j]=x[j+1];
            x[j+1]=temp;
            
            }
        
        
         }
        
     }
     int [] c=new int[size];
    public void reverse(int [] z){
       
        int n=z.length-1;
                for
                        (int i=0;i<=n;i++){
                 
    
    c[n-i]=z[i]; 
            }
    }
    
    
    public void querye(){
         String eS = JOptionPane.showInputDialog("Enter element");
    int e = Integer.parseInt(eS);
    for(int i=0;i<size;i++)
    {
    if(a[i]==e)
    JOptionPane.showMessageDialog(null,"Element is at "+(i+1)+" position");}
    }
    public void queryp(){
    String positionS = JOptionPane.showInputDialog("Enter position");
    int position = Integer.parseInt(positionS);
    JOptionPane.showMessageDialog(null,"Element is at " +position +" position is "+(a[position-1]));
    }
    
    
    
     public void run(){
         
        String es = JOptionPane.showInputDialog("Press 1 to insert"+ "\nPress 2 to delete" +"\nPress 3 to sort"+"\nPress 4 to query"+"\nPress 5 to end program");
    int in =Integer.parseInt(es);
    if(in==1) {
        String is = JOptionPane.showInputDialog("Press 1 to inset at last"+"\nPress 2 to insert at any position");
   int i =Integer.parseInt(is);
           if(i==1) {
               if(isfull())
                   JOptionPane.showMessageDialog(null,"Sorry ur array is full");
               else inserte();
           }
           if(i==2) insertp();
           else JOptionPane.showMessageDialog(null, "Enter a valid key");
            sh="modified array is ";
            show(a);
          }
    if(in==2){
        String is = JOptionPane.showInputDialog("Press 1 to delete element"+"\nPress 2 to delete at any position");
   int i =Integer.parseInt(is);
   if(i==1) {
               if(isempty())
                   JOptionPane.showMessageDialog(null,"Sorry ur array is empty");
               else deletee();
           }
   if(i==2) deletep();    
   else JOptionPane.showMessageDialog(null, "Enter a valid key");
   sh="modified array is ";
   show(a);
    }
    if(in==3){
        String is = JOptionPane.showInputDialog("Press 1 to sort ur array in ascending order"+"\nPress 2 to sort ur array in decending order"+"\nPress 3 to reverse ur array");
   int i =Integer.parseInt(is);
    if(i==1){
        sort(a);
    show(a);
    }
    if(i==2){sort(a);
    reverse(a);
    show(c);
    }
    if(i==3) {reverse(a);
    show(c);}
    else {JOptionPane.showMessageDialog(null, "Enter a valid key");
    }
    }
    
    if(in==4){
   String is = JOptionPane.showInputDialog("Press 1 to query position of a element"+"\nPress 2 to query element  at any position");
   int i =Integer.parseInt(is);
   if(i==1) queryp();
   if(i==2) querye();
    else JOptionPane.showMessageDialog(null, "Enter a valid key");
    
}
if(in==5) return;
else {JOptionPane.showMessageDialog(null, "Enter a valid key");
}     }
}