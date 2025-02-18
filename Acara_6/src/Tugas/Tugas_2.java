/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Muh Ferdian
 */
import java.util.Random;
import java.util.Scanner;

public class Tugas_2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Meminta pengguna menentukan jumlah elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = scanner.nextInt();

        // Membuat array dengan ukuran sesuai input pengguna
        int[] arrayAcak = new int[jumlah];

        // Mengisi array dengan angka acak antara 1-100
        for (int i = 0; i < jumlah; i++) {
            arrayAcak[i] = random.nextInt(100) + 1; // Bilangan acak 1-100
        }

        // Menampilkan array yang telah diisi secara acak
        System.out.print("Array acak: ");
        for (int num : arrayAcak) {
            System.out.print(num + " ");
        }
    }
}

    

