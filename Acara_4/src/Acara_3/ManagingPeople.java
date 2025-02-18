/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acara_3;

/**
 *
 * @author Muh Ferdian
 */

public class ManagingPeople {
    
        public static void main(String[] args) {
        // Membuat objek Person
        Person p1 = new Person("Arial", 37);
        Person p2 = new Person("Joseph", 15);

        // Membandingkan umur kedua objek
        if (p1.getAge() == p2.getAge()) {
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        } else {
            System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
        }
    }
}
   
        // Kelas Person
    class Person {
        // Deklarasi variabel
        private String name;  // Nama
        private int age;      // Umur

        // Constructor untuk menginisialisasi variabel
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method untuk mendapatkan nama
        public String getName() {
            return name;
        }

        // Method untuk mendapatkan umur
        public int getAge() {
            return age;
        }
    }



    

