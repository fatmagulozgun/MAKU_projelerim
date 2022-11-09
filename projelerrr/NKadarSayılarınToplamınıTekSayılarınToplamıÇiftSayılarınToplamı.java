/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1den.n.kadar.sayıların.toplamını.tek.sayıların.toplamı.çift.sayıların.toplamı;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class NKadarSayılarınToplamınıTekSayılarınToplamıÇiftSayılarınToplamı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen sayı girin");
        int sayi = scan.nextInt();
        int toplam = 0;
        int cift_t = 0;
        int tek = 0;

        for (int i = 1; i <= sayi; i++) {

            toplam = toplam + i;

            if (i % 2 == 0) {
                cift_t += i;

            } else {

                tek += i;
            }

        }
        System.out.println("tam sayılar toplamı:" + toplam);
        System.out.println("tek sayılar toplamı:" + tek);
        System.out.println("çift sayılar toplamı:" + cift_t);

    }

}
