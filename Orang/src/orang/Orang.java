/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orang;

public class Orang {
private String nama;
private double tinggi;
private double berat;
    
    public Orang (String nama, double tinggi, double berat){
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
    }
    
    public String toString(){
        return ("Nama : "+nama+"\nTinggi :" + tinggi + "\nBerat : "+berat);
    }  
}
