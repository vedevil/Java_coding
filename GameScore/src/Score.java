
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vaibhav varma
 */
public class Score {
    int score;
    String name;
    Score(String n,int s){
    name = n;
    score = s;}
    public int getScore(){
        return score;
                };
    public String getName(){return name;};
    public void Store(int size){
        int exsc[] = new int[size];
        int i=size-1;
        for(;i>-1;i--){
        
        String scoreS=JOptionPane.showInputDialog("ENTER NAME");
        =Integer.parseInt(scoreS);
        exsc[nameS][scoreI];
        }
        
    }
    
}