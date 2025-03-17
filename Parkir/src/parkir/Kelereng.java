package parkir;
import java.util.Scanner;
public class Kelereng {
    // Fungsi rekursif untuk menghitung total kelereng
    public static int hitungKelereng(int n) {
        if (n == 1) {
            return 1; // Basis rekursi
        } else {
            return n + hitungKelereng(n - 1); // Rekursi untuk jumlah kelereng
        }
    }

    // Fungsi untuk mencetak piramida bintang
    public static void cetakPiramida(int n) {
        for (int i = 1; i <= n; i++) {
            // Mencetak spasi untuk membuat piramida
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Mencetak bintang sesuai jumlah kelereng di baris
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = 0;
        // Validasi input untuk memastikan hanya nilai positif yang diterima
        while (true) {
            try {
                System.out.print("Masukkan jumlah baris piramida kelereng (positif): ");
                n = scanner.nextInt();
                
                if (n <= 0) {
                    System.out.println("Jumlah baris harus lebih besar dari 0. Silakan coba lagi.");
                } else {
                    break; // Keluar dari perulangan jika input valid
                }
            } catch (Exception e) {
                System.out.println("Input tidak valid. Harap masukkan angka positif.");
                scanner.next(); // Menangkap input yang salah
            }
        }
        
        // Mencetak piramida bintang
        System.out.println("\nPiramida Bintang:");
        cetakPiramida(n);
        
        // Menghitung total kelereng menggunakan fungsi rekursif
        int totalKelereng = hitungKelereng(n);
        System.out.println("\nTotal kelereng yang diperlukan untuk " + n + " baris piramida adalah: " + totalKelereng);
    }
}
