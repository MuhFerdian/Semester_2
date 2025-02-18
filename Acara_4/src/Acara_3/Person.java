/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acara_3;

/**
 *
 * @author Muh Ferdian
 */
public class Person {
    
    // Deklarasi variabel
    private String fName;  // Nama depan
    private String lName;  // Nama belakang
    private String stuId;  // ID mahasiswa
    private String stuStatus; // Status mahasiswa

    // Constructor untuk menginisialisasi variabel
    public Person(String fName, String lName, String stuId, String stuStatus) {
        this.fName = fName;
        this.lName = lName;
        this.stuId = stuId;
        this.stuStatus = stuStatus;
    }

    // Method untuk mengambil nama lengkap
    public String getFullName() {
        return fName + " " + lName;
    }

    // Method untuk mengambil ID mahasiswa
    public String getStuId() {
        return stuId;
    }

    // Method untuk mengambil status mahasiswa
    public String getStuStatus() {
        return stuStatus;
    }

    // Main method untuk menampilkan output
    public static void main(String[] args) {
        // Membuat objek Person
        Person student = new Person("Lisa", "Palombo", "123456789", "Active");

        // Menampilkan informasi mahasiswa
        System.out.println("Student Name: " + student.getFullName());
        System.out.println("Student ID: " + student.getStuId());
        System.out.println("Student Status: " + student.getStuStatus());
    }
}

    

