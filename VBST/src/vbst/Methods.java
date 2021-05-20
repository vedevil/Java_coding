/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vbst;

/**
 *
 * @author Vaibhav varma
 */
public class Methods {
    public Node createNewNode(int k){
    Node a = new Node();
    a.data = k;
    a.right = null;
    a.left = null;
    return a;
    }
    public Node insert (Node n,int val){
    if(n == null){
        
        return createNewNode(val);}
    if(val < n.data){
    n.left = insert (n.left,val);
    }
    if(val > n.data){
    n.right = insert(n.right,val);
    }
    else
    {return n;}
    return n;
    }


public void traverseInOrder(Node node) {
    if (node == null)
{
return;
}
traverseInOrder(node.left);
System.out.print(" "+ node.data);
traverseInOrder(node.right);
}
}



