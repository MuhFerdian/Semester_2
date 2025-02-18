
package acara_4;

/**
 *
 * @author hp
 */

import java.util.Scanner;
public class Initiating {

    public static void main(String[] args) {
        
        //membuat vaiable dan scanner
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);
        //mengambil input 
        System.out.print("Masukkan nilai: ");
        nilai = scan.nextInt();
        
        //hitung grade
        if (nilai >= 90) {
            grade = "A";
        } else if (nilai >= 80) {
            grade = "B+";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 60) {
            grade = "C+";
        } else if (nilai >= 50) {
            grade = "C";
        } else if (nilai >= 40) {
            grade = "D";
        } else {
            grade = "E";
        }
        
        System.out.println("Grade: " + grade);
        
        
        
    }
    
}
