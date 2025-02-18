
package acara_4;

/**
 *
 * @author hp
 */
import java.util.Scanner;
public class Integration {
    
    public static void main(String[] arg) {
        
        //membuat variable dan scanner
        String Lampu;
        Scanner scan = new Scanner(System.in);
      
        //mengambil input
        System.out.print("Masukkan nama warna: ");
        Lampu = scan.nextLine();
         
        switch (Lampu) {
            case "merah":
                System.out.println("Lampu merah, berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu Hijau, silahkan jalan!");
                break;
            default:
                System.out.println("warna lampu salah");
                
            
        }
                
    }
   
    
}
