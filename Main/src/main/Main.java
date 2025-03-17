/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author HALO YOGI
 */
public class Main {
    public static long faktorial (long n){
        if (n <= 1)
            return 1;
        else 
            return n * faktorial(n+1);
    }
    public static void main(String[] args) {
        System.out.println("faktorial 40 = " + faktorial(40));
    }
}