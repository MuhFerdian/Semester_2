/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Tugas;

/**
 *
 * @author POLIJE
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Acara_8 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // Meminta pengguna menentukan jumlah elemen dalam array
        System.out.print("Masukkan jumlah elemen dalam array: ");
        int n = scanner.nextInt();       
        int[] array = new int[n];
        // Mengisi array dengan angka acak
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100); // Angka acak antara 0 - 99
        }
        // Mengurutkan array agar dapat digunakan dalam binary search
        Arrays.sort(array);       
        // Menampilkan array yang telah diurutkan
        System.out.println("Array yang diurutkan: " + Arrays.toString(array));
        // Meminta pengguna memasukkan angka yang ingin dicari
        System.out.print("Masukkan angka yang ingin dicari: ");
        int key = scanner.nextInt();        
        // Melakukan pencarian dengan binary search
        int result = binarySearch(array, key);        
        // Menampilkan hasil pencarian
        if (result != -1) {
            System.out.println("Angka " + key + " ditemukan pada indeks " + result);
        } else {
            System.out.println("Angka " + key + " tidak ditemukan dalam array.");
        }
    }
    // Implementasi Binary Search secara rekursif
    public static int binarySearch(int[] array, int key) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;       
            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

