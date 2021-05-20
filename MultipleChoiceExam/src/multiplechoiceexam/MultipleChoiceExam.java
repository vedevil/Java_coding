/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplechoiceexam;
import java.lang.*;
import java.util.*;
import java.io.*;
/**
 *
 * @author Vaibhav varma
 */
public class MultipleChoiceExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.lang.Exception {
        // TODO code application logic here
        
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int t = Integer.parseInt(br.readLine());
while(t!=0)
{
    int l=Integer.parseInt(br.readLine());
    String ca=br.readLine();
    if(l==ca.length()){
    String in=br.readLine();
    if(ca.length()==in.length()){
        int count=0;
    for(int i=0;i<ca.length();i++){
    if(ca.charAt(i)==in.charAt(i))
    {count++;
    continue;}
    else if (in.charAt(i)=='N')
            continue;
    else if(ca.charAt(i)!=in.charAt(i))
            i=i+1;
    
    
    
    
    }
    
    System.out.println(count);
    }
    else {t--;
    continue;
    }
    }
    
    else {
        t--;
        continue;
    }
    
    t--;
}
    }
    
}
