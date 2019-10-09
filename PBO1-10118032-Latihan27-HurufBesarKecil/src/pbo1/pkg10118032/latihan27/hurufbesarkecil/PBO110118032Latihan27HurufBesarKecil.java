/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118032.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author Guntur Maulana I
 * NAMA			: Guntur Maulana Ibrahim
 * KELAS		: IF-1
 * NIM			: 10118032
 * Deskripsi Program	: mengubah Format Huruf Kecil Besar
 */
public class PBO110118032Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan Kalimat : ");
	Scanner sc = new Scanner(System.in);
	String kalimat = sc.nextLine();
	System.out.println("****Hasil Formatting****");
	System.out.println("Huruf Besar : " + kalimat.toUpperCase() );
	System.out.println("Huruf Kecil : " + kalimat.toLowerCase() );
    }
    
}
