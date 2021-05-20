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
public class Sortmethods {
int array[];
public void Definesize(int size){
array = new int[size];
}
public void Show(int[] arr){
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
}
public void Swap(int[] array,int i,int j){
    int temp = array[i];
    array [i] = array[j];
    array[j] = temp;
}


public void BubbleSort(int []array){
for(int i=0;i<array.length-1;i++){
    for(int j=0;j<array.length-1;j++)
    {
        if(array[j]>array[j+1]){
    Swap(array,j,j+1);
            }
    
    }
}}


public void SelectionSort(int[] arr)
{
    for(int i=0;i<arr.length-1;i++){
int min = i;
for(int j=i+1;j<arr.length;j++){
    if(arr[min]>arr[j])
    {min = j;}
}
Swap(arr,min,i);
}
}

public void MeregeSort(int[] a,int[] b,int[] c){
int i=0,j=0,l=0,k;
int size;
if(a.length>b.length){
size=2*b.length;}
else{
    size= 2*a.length;}

for(k=0; k < size ;k++)
{if(a[i]<b[j]){
c[l]=a[i];
i++;
l++;
}
else
{
    c[l]=b[j];
j++;
l++;
}

}
if(a.length>b.length){c[l]=a[i];
l++;
i++;
}
else
{  c[l]=b[j];
j++;
l++;}

}

}
