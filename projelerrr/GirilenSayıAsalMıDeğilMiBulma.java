/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package girilen.sayı.asal.mı.değil.mi.bulma;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class GirilenSayıAsalMıDeğilMiBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.print("kontrol edilecek sayıyı giriniz: ");
        int sayi = k.nextInt();
        int sayac = 0;

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                sayac++;
            }
        }

        if (sayac == 2) {
            System.out.println("asaldır");
        } else if (sayac != 2) {
            System.out.println("asal değildir");
        }
    }

}
