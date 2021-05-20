/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runner;

/**
 *
 * @author Vaibhav varma
 */
public class LL {
    Node headnode;
    
    public void insert(int x){
            Node node = new Node();
            node.data = x;
            node.next = null;
            
            if(headnode==null){
             headnode = node;
            }
            
            else
            {
            Node n;
            n = headnode;
            while(n.next != null){
            n=n.next;
             }
            n.next= node;
            }
    }
    public void InsertAtStart(int data){
            Node node = new Node();
            node.data = data;
            node.next = headnode;
            headnode = node;
    }
    
    public void InsertAt(int pos, int x)
    {
            Node node = new Node();
            node.data = x;
            
            Node n=new Node();
            n = headnode;
            for(int i=1;i < pos-1;i++)
            { n = n.next;}
            node.next=n.next;
            n.next = node;
            
    }
    
    public void delete(int pos){
        Node n= new Node();
        n = headnode;
    for(int i=1;i < pos-1;i++)
            { n = n.next;
            }
            n.next.data = 0;
            n.next = n.next.next;
    }
    public void deleteAtStart(){
    headnode = headnode.next;
    }
    
    
    
    public int Size(){
    Node n=new Node();
    int size=1;
    n= headnode;
    while(n.next!= null) 
    {size++;
    n=n.next;
    }
     return size;
    }
    
    public void Search (int data){
        Node n=new Node();
        n = headnode;
        int j =Size();
    for(int i=1; i<=j ; i++){
        if(n.data==data){System.out.println(i);
        }
        n=n.next;
    }
    }
    
    
    public void show(){
    Node n;
    n = headnode;
    while(n.next!= null){
    System.out.println(n.data);
    n = n.next;
    }
    System.out.println(n.data);
    
    }
    
}
