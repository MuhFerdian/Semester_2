/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkir;

import java.util.Scanner;

public class PiramidaKelereng {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris piramida: ");
        int n = scanner.nextInt();

        // Validasi input
        while (n <= 0) {
            System.out.println("Jumlah baris harus bilangan bulat positif.");
            System.out.print("Masukkan kembali jumlah baris: ");
            n = scanner.nextInt();
        }

        // Cetak jumlah kelereng di setiap baris
        System.out.println("Jumlah kelereng di setiap baris:");
        for (int i = 1; i <= n; i++) {
            System.out.println("Baris ke-" + i + ": " + i + " kelereng");
        }

        // Hitung total kelereng menggunakan fungsi rekursif
        int totalKelereng = hitungTotalKelereng(n);
        System.out.println("Total kelereng yang dibutuhkan: " + totalKelereng);
    }

    public static int hitungTotalKelereng(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + hitungTotalKelereng(n - 1);
        }
    }
}