/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author HALO YOGI
 */
public class Main {
    public static void main(String[] args) {

    BangunDatar bangunDatar = new BangunDatar ();
    Persegi persegi = new Persegi (4);
    Segitiga segitiga = new Segitiga (6, 3);
    Lingkaran lingkaran = new Lingkaran (50);

    //memanggil method luas dan keliling

    bangunDatar.luas();
    bangunDatar.keliling();

    System.out.println("luas perregis: " + persegi.luas());
    System.out.println("keliling pernogi: " + persegi.keliling());
    System.out.println("Luas segitiga: " + segitiga.luas());
    System.out.println("Luas lingkaran: " + lingkaran.luas());
    System.out.println("keliling lingkarant: " + lingkaran.keliling());
    }
}
