/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Muh Ferdian
 */
import java.util.Arrays;
public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {20, 30, 40, 50, 60, 70};
        int n = arr.length;
        int index = -1; // Jika tidak ditemukan, tetap -1
        int find = 40;

        int low = 0, high = n - 1, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (find < arr[mid]) {
                high = mid - 1;
            } else if (find == arr[mid]) {
                index = mid;
                break;
            } else {
                low = mid + 1;
            }
        }
        if (index == -1) {
            System.out.println("Data tidak ditemukan");
        } else {
            System.out.println("Data berada pada index ke-" + index);
        }
    }
}

    

