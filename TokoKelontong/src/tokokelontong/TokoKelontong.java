/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tokokelontong;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author HALO YOGI
 */
public class TokoKelontong {

    private String namaToko;
    private String pemilik;
    private String lokasi;
    private HashMap<String, Integer> stokBarang;

    public TokoKelontong(String namaToko, String pemilik, String lokasi) {
        this.namaToko = namaToko;
        this.pemilik = pemilik;
        this.lokasi = lokasi;
        this.stokBarang = new HashMap<>();
    }

    // Getter Methods
    public String getNamaToko() {
        return namaToko;
    }

    public String getPemilik() {
        return pemilik;
    }

    public String getLokasi() {
        return lokasi;
    }

    public HashMap<String, Integer> getStokBarang() {
        return stokBarang;
    }

    // Setter Methods
    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public void tambahBarang(String namaBarang, int jumlah) {
        stokBarang.put(namaBarang, stokBarang.getOrDefault(namaBarang, 0) + jumlah);
    }

    public void kurangiBarang(String namaBarang, int jumlah) {
        if (stokBarang.containsKey(namaBarang) && stokBarang.get(namaBarang) >= jumlah) {
            stokBarang.put(namaBarang, stokBarang.get(namaBarang) - jumlah);
            if (stokBarang.get(namaBarang) == 0) {
                stokBarang.remove(namaBarang);
            }
        } else {
            System.out.println("Stok tidak mencukupi atau barang tidak tersedia.");
        }
    }

    public void tampilkanInfo() {
        System.out.println("Nama Toko: " + namaToko);
        System.out.println("Pemilik: " + pemilik);
        System.out.println("Lokasi: " + lokasi);
        System.out.println("Stok Barang: ");
        for (Map.Entry<String, Integer> entry : stokBarang.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue());
        }
    }

//    public static void main(String[] args) {
//        TokoKelontong toko = new TokoKelontong("Toko Baskoro", "Bagas", "Pace");
//        toko.tambahBarang("Beras", 20);
//        toko.tambahBarang("Gula", 15);
//        toko.kurangiBarang("Beras", 5);
//        toko.tampilkanInfo();
//    }
}