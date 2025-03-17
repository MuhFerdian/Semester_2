/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main4;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayRandom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Meminta input dari pengguna untuk menentukan jumlah elemen array
        System.out.print("Masukkan jumlah deret angka: ");
        int n = scanner.nextInt();

        // Membuat array dengan angka acak
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt(100) + 1; // Angka acak antara 1 hingga 100
        }

        // Menampilkan array sebelum diurutkan
        System.out.println("Deret angka sebelum diurutkan: " + Arrays.toString(numbers));

        // Mengurutkan array
        Arrays.sort(numbers);

        // Menampilkan array setelah diurutkan
        System.out.println("Deret angka setelah diurutkan: " + Arrays.toString(numbers));

        scanner.close();
    }
}
