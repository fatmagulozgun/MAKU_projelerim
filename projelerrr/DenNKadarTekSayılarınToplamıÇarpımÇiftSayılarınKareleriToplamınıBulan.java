/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.den.n.kadar.tek.sayıların.toplamı.çarpım.çift.sayıların.kareleri.toplamını.bulan;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class DenNKadarTekSayılarınToplamıÇarpımÇiftSayılarınKareleriToplamınıBulan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int toplam = 0;
        int carpım = 1;
        int ktop = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısını girin");
        int sayi = scan.nextInt();
        int i = 1;
        while (i <= sayi) {
            if (i % 2 != 0) {

                toplam = toplam + i;
                carpım *= i;
            } else {
                ktop = i * i;
                ktop += i;
            }

            i++;

        }

        System.out.println("tek:" + toplam);
        System.out.println("tek çarpımları:" + carpım);
        System.out.println("çiftlerin kareleri toplamı:" + ktop);
    }
}
