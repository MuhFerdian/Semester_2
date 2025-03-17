package parkir;
import java.util.Scanner;
public class Parkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahKendaraan, jamParkir;
        int totalBiaya = 0;

        System.out.print("Masukkan jumlah kendaraan: ");
        jumlahKendaraan = scanner.nextInt();

        for (int i = 1; i <= jumlahKendaraan; i++) {
            System.out.print("Masukkan jumlah jam parkir kendaraan ke-" + i + ": ");
            jamParkir = scanner.nextInt();

            int biaya = hitungBiayaParkirRekursif(jamParkir);
            totalBiaya += biaya;

            System.out.println("Biaya parkir kendaraan ke-" + i + ": Rp" + biaya);
        }

        System.out.println("Total biaya parkir semua kendaraan: Rp" + totalBiaya);
    }

    public static int hitungBiayaParkirRekursif(int jamParkir) {
        if (jamParkir <= 0) {
            return 0;
        } else if (jamParkir == 1) {
            return 5000;
        } else {
            return 5000 + hitungBiayaParkirRekursif(jamParkir - 1);
        }
    }
}