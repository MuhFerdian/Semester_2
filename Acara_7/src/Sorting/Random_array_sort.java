/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;
/**
 *
 * @author Muh Ferdian
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Random_array_sort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Meminta pengguna menentukan jumlah elemen array
        System.out.print("Masukkan jumlah elemen dalam array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        // Mengisi array dengan angka acak
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100); // Angka acak antara 0 - 100
        }
        
        // Menampilkan array sebelum diurutkan
        System.out.println("Array sebelum di urutkan: " + Arrays.toString(array));
        
        // Mengurutkan array
        Arrays.sort(array);
        
        // Menampilkan array setelah diurutkan
        System.out.println("Array setelah di urutkan: " + Arrays.toString(array));
    }
}

    

