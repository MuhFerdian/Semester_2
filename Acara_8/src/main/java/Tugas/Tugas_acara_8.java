/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Muh Ferdian
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tugas_acara_8 {
   
    public static int[] generateSortedArray(int size, int minVal, int maxVal) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(maxVal - minVal + 1) + minVal;
        }
        Arrays.sort(array);
        return array;
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah deret angka: ");
        int size = scanner.nextInt();
        System.out.print("Masukkan angka yang ingin dicari: ");
        int target = scanner.nextInt();

        int[] array = generateSortedArray(size, 1, 100);
        System.out.println("Array yang dihasilkan: " + Arrays.toString(array));

        int result = binarySearch(array, target);
        if (result != -1) {
            System.out.println("Angka " + target + " ditemukan di indeks " + result + ".");
        } else {
            System.out.println("Angka " + target + " tidak ditemukan dalam array.");
        }
        scanner.close();
    }
}

    

