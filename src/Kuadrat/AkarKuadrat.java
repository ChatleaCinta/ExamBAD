/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuadrat;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;

public class AkarKuadrat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan: ");
        int jmlbil = in.nextInt();

        for (int x = 1; x <= jmlbil; x++) {
            try {
                System.out.println("");
                System.out.print("Masukkan bilangan ke-" + x + ": ");
                double bil = in.nextDouble();
                
                if (bil < 0) {
                    throw new IllegalArgumentException("Bilangan tidak boleh negatif!");
                }
                double akarkuadrat = Math.sqrt(bil);
                System.out.println("Akar kuadrat dari " + bil + " adalah: " + akarkuadrat);
                System.out.println("");
                
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Masukkan bukan bilangan valid.");
                in.nextLine(); 
                x--; 
            }
        }

        in.close();
    }
}

