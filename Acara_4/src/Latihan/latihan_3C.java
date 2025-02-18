/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Muh Ferdian
 */
class Book {
    int price;
    int pages;

    // Metode untuk mengatur nilai price dan pages
    public void set(int price, int pages) {
        this.price = price;
        this.pages = pages;
    }

    // Metode untuk menampilkan informasi buku
    public void show() {
        System.out.println("Books Information");
        System.out.println("Book Price: " + price);
        System.out.println("Number of Pages: " + pages);
    }
}

public class latihan_3C {
    public static void main(String[] args) { // Perbaikan: String[] args
        Book javabook = new Book(); // Perbaikan: Nama kelas diawali huruf besar (Book)
        javabook.set(6000, 100); // Memanggil metode set untuk mengisi nilai
        javabook.show(); // Memanggil metode show untuk menampilkan output
    }
}
