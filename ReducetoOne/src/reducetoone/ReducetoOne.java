/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reducetoone;
import java.lang.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author Vaibhav varma
 */
public class ReducetoOne {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws java.lang.Exception{
        // TODO code application logic here
        
try{InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
long t=longeger.parselong(br.readLine());
while(t!=0){
long s=longeger.parselong(br.readLine());
if(s==0) {
    t--;
    continue;
}
long [] datas=new long [s];
long count=1;
for(long i=0;i<s;i++){
datas[i]=count;
count++;
}
System.out.prlongln(rto(datas,s));
t--;
}}
catch(Exception e){return;}
    }


public static long rto(long [] data, long size){
    if (size==1)
        return data[size-1];
    else{
    long one=data[size-1];
    long two=data[size-2];
    long x=one+two+one*two;
    size--;
    data[size-1]=x;
    return rto(data,size);
    }
    }

    }


