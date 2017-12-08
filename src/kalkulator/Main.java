/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;
import java.util.Scanner;
/**
 *
 * @author rf
 */
public class Main {
    public static void main(String[] args) {
        while(true){
        Kalkulator berhitung = new Kalkulator ();
        Scanner input = new Scanner(System.in);
        Boolean lagi = true ;
        
            System.out.println("Ini Adalah Kalkulator");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            
            System.out.print("Apa Yang Anda Inginkan ? : ");
            int pilihan = input.nextInt();
            System.out.println("");
          
            System.out.print("Masukkan Bilangan : ");
            int bil1 = input.nextInt();
            berhitung.setBilangan1(bil1);
            System.out.println("");
          
            System.out.print("Masukkan Bilangan : ");
            int bil2 = input.nextInt();
            berhitung.setBilangan2(bil2);
            System.out.println("");
          
            
            if(pilihan==1){
                berhitung.penjumlahan();
                System.out.println("Hasil = "+berhitung.getHasil());
            }
            
            else if(pilihan==2){
                berhitung.pengurangan();
                System.out.println("Hasil = "+berhitung.getHasil());
            }
            
            else if(pilihan==3){
                berhitung.perkalian();
                System.out.println("Hasil = "+berhitung.getHasil());
            }
            
            else if(pilihan==4){
                berhitung.pembagian();
                System.out.println("Hasil = "+berhitung.getHasil());
            }
            
            else {
                System.out.println("Tidak Ada");
            }
        }
    }
}
