/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srunner;

/**
 *
 * @author Vaibhav varma
 */
public class STK {
    int top;
    int element[];

    public void createstack(int size){
    element = new int[size+1];
    top =0;
    }
    public boolean isfull(){
    if(top==element.length-1)
        return true;
    else 
        return false;
    }
    public boolean isempty(){
    if(top==0)
        return true;
    else 
        return false;
    }
    public void push(int data){
        if(isfull()){
        System.out.println("Sorry it is full");}
        else{
    for(int i=element.length-1; i>0;i--)
    {element[i]=element[i-1];}
        element[top] = data;
        top++;
        }
    }
    public void pop(){
    if(isempty())
            {System.out.println("sorry ur stack is empty");
                    }
    else
        element[0]=0;
    for(int i=0; i<element.length-1;i++)
    {element[i]=element[i+1];}
    top--;
        }
    public void peek(){System.out.println(element[0]);}
    public void show(){
    for(int i=0;i<top;i++)
        System.out.println(element[i]);
    }
}
