/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chefandhissequence;
import java.lang.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author Vaibhav varma
 */
public class Chefandhissequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.lang.Exception
{
        // TODO code application logic here
    InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
    int t=Integer.parseInt(br.readLine());
    while(t!=0){
     
    int l=Integer.parseInt(br.readLine());
    String seq=br.readLine();
    StringTokenizer st =new StringTokenizer(seq);
    int [] sarr=new int [l];
    for(int i=0;i<l;i++){
    sarr[i]=Integer.parseInt(st.nextToken());
    }
    int fl=Integer.parseInt(br.readLine());
    String fseq = br.readLine();
    StringTokenizer fst=new StringTokenizer(fseq);
    int[] farr=new int [fl];
    for(int i=0;i<fl;i++){
        farr[i]=Integer.parseInt(fst.nextToken());
    }
    int count=0;
    for(int i=0;i<l;i++){
    if(sarr[i]==farr[count]){
    }}
    t--;}
    }
    }
    

