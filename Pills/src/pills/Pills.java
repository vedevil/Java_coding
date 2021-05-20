import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
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