/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main4;

/**
 *
 * @author HALO YOGI
 */
public class Main4 {
    static void bubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for (int i=0; i < n; i++)
        {
            for (int j=1; j < (n-i); j++)
            {
                if(arr[j-1] > arr[j])
                {
                    //swap elemente
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] =temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,60,35,2,45,320,5};
        
        System.out.println("Array Before Bubble Sort");
        for (int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
            System.out.println();
            
            bubbleSort(arr);
            
            System.out.println("Array After Bubble Sort");
            
            for(int i=0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
    }
    
}
