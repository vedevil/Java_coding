/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uea.champions.league;
import java.io.*;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Vaibhav varma
 */
class Team{
String name;
int pts;
int gs,gf,gd;
}
class League{
    
public Team createNewTeam(String x){
Team t=new Team();
t.name=x;
t.gs=0;
t.gf=0;
t.gd=0;
t.pts=0;
return t;
}

}
public class UEAChampionsLeague {

    /**
     * @param args the command line arguments
     */
   
   
    public static void main(String[] args) throws java.lang.Exception {
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    int count=0;
    int t=Integer.parseInt(br.readLine());
    while(t!=0){
    for(int i=1;i<=12;i++){
    String in=br.readLine();
    StringTokenizer st=new StringTokenizer(in);
    String t1=st.nextToken();
    int t1score=Integer.parseInt(st.nextToken());
    String waste=st.nextToken();
    String t2=st.nextToken();
    int t2score=Integer.parseInt(st.nextToken());
    if(count==0){
    }
    
    
    }
    
    t--;
    }
    
    }
    
}
