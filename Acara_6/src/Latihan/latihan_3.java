/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Muh Ferdian
 */
public class latihan_3 {
    
    public static void main(String[] args) {
        int [][] angka = {{5,4,2,1,5}, {9,6,5,7,8}, {5,2,1,5,10}}; 
        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 5; kolom++) {
                System.out.print(angka [baris] [kolom]+"  ");
            }
            System.out.println("");

        }
    }
}