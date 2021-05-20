/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpthelostrobot;
import java.lang.*;
import java.util.*;
import java.io.*;
/**
 *
 * @author Vaibhav varma
 */
public class HelpthelostRobot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws  java.lang.Exception {
        // TODO code application logic here
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int t = Integer.parseInt(br.readLine());
        while (t!=0){
            String in=br.readLine();
            StringTokenizer st=new StringTokenizer(in);
            int x1= Integer.parseInt(st.nextToken());
            int y1= Integer.parseInt(st.nextToken());
            int x2= Integer.parseInt(st.nextToken());
            int y2= Integer.parseInt(st.nextToken());
            String direction=null;
            if(x1==x2 && y1==y2)
                return;
            else if(x1==x2 ){
            if(y1>y2)
                direction="down";
            else if(y2>y1)
                direction="up";
            }
            else if(y1==y2){
            if(x1>x2)
                direction="left";
            else if(x2>x1)
            direction="right";
            
            }
            else
                direction="sad";
            System.out.println(direction);
                
            
            t--;
        }
    }
    
}
