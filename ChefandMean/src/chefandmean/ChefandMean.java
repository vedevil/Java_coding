/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chefandmean;
import java.lang.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author Vaibhav varma
 */
public class ChefandMean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.lang.Exception {
        // TODO code application logic here
        InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int t=Integer.parseInt(br.readLine());
while (t!=0){
int l= Integer.parseInt(br.readLine());
double [] data=new double [l];
String in=br.readLine();
StringTokenizer st=new StringTokenizer(in);
int ans=0;
double sum=0;
int i;
for (i=0;i<l;i++){
data[i]= Double.parseDouble(st.nextToken());
if(data[i]==0) {ans=i+1;
break;}

sum+=data[i];

}
if(i==l){
double mean=sum/l;


for(int j=0;j<l;j++){
  if(data[j]==mean){
ans=j+1;
break;}
else ans=-1;
}}
if(ans==-1)
    System.out.println("impossible");
else
    System.out.println(ans);

t--;
}
    }
    
}
