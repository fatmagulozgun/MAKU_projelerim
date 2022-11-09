/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klavyeden.girilen.bir.sayının.yine.klavyeden.istenen.yüzdesini.hesaplama;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class KlavyedenGirilenBirSayınınYineKlavyedenIstenenYüzdesiniHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Yüzdesi hesaplanacak sayıyı giriniz:");
        int sayi = klavye.nextInt();

        System.out.println("Yüzde oranını giriniz:");
        double yuzde = klavye.nextDouble();
        double sonuc = sayi * (yuzde / 100);
        System.out.println(sonuc);
    }

}
