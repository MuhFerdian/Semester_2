/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Muh Ferdian
 */
import java.util.Scanner;
public class Tugas_A {
       
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan batas awal: ");
        int awal = input.nextInt();
        
        System.out.print("Masukkan batas akhir: ");
        int akhir = input.nextInt();
        
        System.out.print("Bilangan genap dari " + awal + " hingga " + akhir + ": ");
        for (int i = awal; i <= akhir; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    
}
    

