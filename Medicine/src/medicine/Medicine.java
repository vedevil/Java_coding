/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicine;
import java.util.*;


/**
 *
 * @author Vaibhav varma
 */
public class Medicine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int tc = 0;
        String format;
        Scanner scn=new Scanner(System.in);
        if(scn.hasNextLine())
        tc = Integer.parseInt(scn.nextLine());
       
        if(tc<1 || tc>1000)
        {return;}
        else{
            while(tc != 0 ){
                tc--;
        if(scn.hasNextLine());
        format = scn.nextLine();
        int year,month,date,count=1;
        StringTokenizer stk=new StringTokenizer(format, ":");
        year = Integer.parseInt(stk.nextToken());
        month = Integer.parseInt(stk.nextToken()); 
        date = Integer.parseInt(stk.nextToken());
        int x;
        if(year%4==0)
            x=29;
        else
            x=28;
        int maxdays[] = {31,x,31,30,31,30,31,31,30,31,30,31};
        if(year >=1900 && year <=2038 && month >= 1 && month <=12 && date>=1 && date <= maxdays[month-1]){
            date = date +2;
            while(date < maxdays[month-1]){
            date = date +2;
            count++;
            }
            System.out.println(count);
            
            
        }
    
        else
        {  return;}
       
               }}
    }
    
}
