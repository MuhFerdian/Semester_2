/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Meminta input jumlah elemen array
        System.out.print("Masukkan jumlah elemen dalam array: ");
        int n = scanner.nextInt();
        
         // Membuat array dengan angka acak
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100); // Angka acak dari 0-99
        }

        
        System.out.println("Array setelah diurutkan: " + Arrays.toString(array));

        System.out.print("Masukkan angka yang ingin dicari: ");
        int target = scanner.nextInt();

        int hasil = binarySearch(array, target);

        if (hasil != -1) {
            System.out.println("Angka " + target + " ditemukan pada indeks: " + hasil);
        } else {
            System.out.println("Angka " + target + " tidak ditemukan dalam array.");
        }

        scanner.close();
    }

    public static int binarySearch(int[] array, int target) {
        int kiri = 0, kanan = array.length - 1;
        while (kiri <= kanan) {
            int tengah = kiri + (kanan - kiri) / 2;

            if (array[tengah] == target) {
                return tengah;
            }
            if (array[tengah] > target) {
                kanan = tengah - 1;
            } 
            else {
                kiri = tengah + 1;
            }
        }
        return -1; 
    }
}
