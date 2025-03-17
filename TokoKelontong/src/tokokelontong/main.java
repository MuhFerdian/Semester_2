/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokokelontong;

/**
 *
 * @author HALO YOGI
 */
public class main {
    public static void main(String[] args) {
        TokoKelontong toko = new TokoKelontong("Toko Baskoro", "Bagas", "Pace");
        
        toko.tambahBarang("Beras", 20);
        toko.tambahBarang("Gula", 15);
        toko.kurangiBarang("Beras", 5);
        
        toko.tampilkanInfo();
    }
}


