/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan28.ganti.kata;

import java.util.Scanner;

/**
 *
 * @author
 * Nama :Muhamad Syifa Amruloh 
 * Kelas:IF11K 
 * NIM  :10118910
 *
 * Description : Program Mengganti Kata
 */
public class PBO11K10118910Latihan28GantiKata {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String klmt,ganti,jdi,rvs;
        System.out.println("========== Program Menganti Kata ==========\n");
        System.out.print("Masukan kalimat\t: ");
        klmt = scan.nextLine();
        System.out.print("Ganti kata\t: ");
        ganti = scan.nextLine();
        System.out.print("Menjadi Kata\t: ");
        jdi = scan.next();
        rvs = klmt.replaceAll(ganti, jdi);
        System.out.println("\n========== Hasil Formatting ==========");
        System.out.println("Kalimat awal : " + klmt);
        System.out.println("Kalimat baru : " + rvs);
    }
    
}
