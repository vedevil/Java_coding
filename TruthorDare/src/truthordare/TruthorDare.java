/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truthordare;
import java.util.*;
import java.io.*;
import java.lang.*;
/**
 *
 * @author Vaibhav varma
 */
public class TruthorDare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.lang.Exception {
        // TODO code application logic here
        InputStreamReader isr =new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int t = Integer.parseInt(br.readLine());
while(t!=0){
int temp=0;
int trk=Integer.parseInt(br.readLine());
int [] trkarr=new int [trk];
String trkString=br.readLine();
StringTokenizer STtrk=new StringTokenizer(trkString);
for(int i=0;i<trk;i++){
trkarr[i]=Integer.parseInt(STtrk.nextToken());
}
int drk=Integer.parseInt(br.readLine());
int [] drkarr=new int [drk];
String drkString=br.readLine();
StringTokenizer STdrk=new StringTokenizer(drkString);
for(int i=0;i<drk;i++){
drkarr[i]=Integer.parseInt(STdrk.nextToken());
}
int truth=0,dare=0;
int tsa=Integer.parseInt(br.readLine());
String tsaString =br.readLine();
StringTokenizer STtsa=new StringTokenizer(tsaString);
int dsa=Integer.parseInt(br.readLine());
String dsaString =br.readLine();
StringTokenizer STdsa=new StringTokenizer(dsaString);
for(int i=0;i<tsa;i++){
temp=Integer.parseInt(STtsa.nextToken());
for(int j=0;j<trk;j++){
if(temp==trkarr[j]){truth++;
}}}
for(int i=0;i<dsa;i++){
temp=Integer.parseInt(STdsa.nextToken());
for(int j=0;j<drk;j++){
if(temp==drkarr[j]){dare++;
}}}
if(truth==tsa && dare==dsa)
{System.out.println("yes");}
else System.out.println("no");
t--;}

    }
    
}
