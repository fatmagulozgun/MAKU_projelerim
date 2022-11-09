/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgdo.pkgwhile.ile.girilen.sayı.pkg0.pkg100.arasında.olsun;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class DOWHİLEIleGirilenSayı0100ArasındaOlsun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        do {

            System.out.println("lütfen sayı girin");
            sayi = scan.nextInt();
        } while (sayi < 0 || sayi > 100);

        System.out.println("sayınız:" + sayi);

    }

}
