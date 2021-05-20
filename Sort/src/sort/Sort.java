/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author Vaibhav varma
 */
public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Sortmethods abc =new Sortmethods();
       int nums[] = {1,5,8,11};
       int nums2[] = {3,7,10,15,18};
       int nums3[] = new int[9];
       // abc.Show(nums);
       //abc.BubbleSort(nums);
       //abc.Show(nums);
       abc.MeregeSort(nums, nums2, nums3);
       abc.Show(nums3);
       
       
    }
    
}
