/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasena;
import java.util.*;
import java.lang.*;
import java.io.*;
/**
 *
 * @author Vaibhav varma
 */
public class Mahasena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.lang.Exception {
        // TODO code application logic here
        int weapon,lucky=0,unlucky=0;
        
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int n = Integer.parseInt(br.readLine());
        String w=br.readLine();
        StringTokenizer st = new StringTokenizer(w);
        int [] A=new int[n];
        for(int i=0;i<n;i++){
        weapon=Integer.parseInt(st.nextToken());
        if(weapon%2==0)
            lucky++;
        else unlucky++;
        }
        if(lucky>unlucky)
            System.out.println("READY FOR BATTLE");
            else 
        System.out.println("NOT READY");
    }}