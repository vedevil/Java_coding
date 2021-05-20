/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;
import java.util.*;
/**
 *
 * @author Vaibhav varma
 */
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       try{ double w,bal,aw;
        Scanner scn = new Scanner(System.in);
        w = scn.nextInt();
        bal = scn.nextDouble();
        aw = w+0.50;
        if(w>=0 && w<=2000 && bal >=0 && bal<=2000){
        if(w%5 != 0){System.out.println(bal);}
        else if(aw>bal){System.out.println(bal);}
        else{
        bal=bal-aw;
        System.out.println(bal);
        }
        }
        else{return;}}
        catch(Exception e){return;}}
       
}
    
    

