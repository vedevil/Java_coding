/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leadgame;
import java.util.*;
import java.lang.*;
import java.io.*;
/**
 *
 * @author Vaibhav varma
 */
public class LeadGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.lang.Exception {
        // TODO code application logic here
        int player1=0,player2=0,maxlead=0,leadby=0;
        InputStreamReader isr =new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int rounds=Integer.parseInt(br.readLine());
        while(rounds!=0)
        {String scores=br.readLine();
        StringTokenizer st=new StringTokenizer(scores);
        player1+=Integer.parseInt(st.nextToken());
        player2+=Integer.parseInt(st.nextToken());
       if(maxlead==0){maxlead=Math.abs(player1-player2);
        if(player1>player2)
                   leadby=1;
           else if(player2>player1) leadby=2;
           else return;}
       if(Math.abs(player1-player2)>maxlead){
           maxlead=Math.abs(player1-player2);
           if(player1>player2)
                   leadby=1;
           else if(player2>player1) leadby=2;
           else return;
       }
       
            rounds--;
        }
       if(leadby!=0)
           System.out.print(leadby+" "+maxlead);
       else return;
        
        }
        }
        
    
    

