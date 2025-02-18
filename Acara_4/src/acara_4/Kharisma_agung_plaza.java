
package acara_4;

/**
 *
 * @author Muh Ferdian
 */
import java.util.Scanner;
public class Kharisma_agung_plaza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("==============================================");
        System.out.println("       Kharisma Agung Plaza ( KAP )          ");
        System.out.println("         Promo Belanja Berhadiah             ");
        System.out.println("    Khusus Pembelian 5 Barang Pertama        ");
        System.out.println("      Dengan harga minimum Rp 100000,00       ");
        System.out.println("==============================================");
        
        System.out.print("Masukkan nama pembeli : ");
        String nama = input.nextLine();
        System.out.println();
        
        int[] hargaBarang = new int[5];
        int totalHarga = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan harga barang ke-" + (i + 1) + ": ");
            hargaBarang[i] = input.nextInt();
            totalHarga += hargaBarang[i];
        }
        
        System.out.println("----------------------------------------------");
        System.out.println("Total harga pembelian atas nama " + nama + " adalah Rp " + totalHarga);
        System.out.println();
        
        if (totalHarga >= 1000000) {
            System.out.println("Selamat...");
            System.out.println("Anda mendapat hadiah 1 unit Pajero sport");
        } else {
            System.out.println("Maaf, Anda tidak memenuhi syarat untuk mendapatkan hadiah.");
        }
        
        System.out.println("----------------------------------------------");
        System.out.println("               Terima Kasih                  ");
        System.out.println(" Anda sudah belanja di Kharisma Agung Plaza  ");
        System.out.println("==============================================");
        
    }
}


