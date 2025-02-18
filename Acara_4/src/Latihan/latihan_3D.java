/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Muh Ferdian
 */
import java.util.Scanner;
    public class latihan_3D {

        public static void main(String[] args) {
        // Buat scanner
            Scanner sl = new Scanner(System.in);
            
            // Ambil nilai dari keyboard
            System.out.print("Masukkan nilai l = ");
            int nilail = sl.nextInt();
            System.out.print("Masukkan nilai 2 = ");
            int nilai2 = sl.nextInt();
            
            // Hitung dan Print
            int jumlah = nilail + nilai2;
            System.out.println("Jumlah = " + jumlah);
  }
    
}
