/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning;

/**
 *
 * @author Vaibhav varma
 */
public class Bank{
    
        int money;
    
     Bank(int p){
         money=p;
    }
     void withdraw(int x){
         money = money - x;
         System.out.println(money);
     }
     void deposit(int y){
         money = money + y;
         System.out.println(money);
    }


}
