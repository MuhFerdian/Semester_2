/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pewarisan;

public class Demo {
    public static void main(String[] args){
        A superOb = new A();
        B subOb = new B();
        
        System.out.println("SuperClass");
        superOb.x = 10;
        superOb.y = 20;
        superOb.TampilkanNilaiXY();
        
        System.out.println("SubClass");
        superOb.x = 5;
        superOb.y = 4;
        superOb.TampilkanNilaiXY();
        
        subOb.z = 50;
        subOb.TampilkanJumlah();
    }
    
}
