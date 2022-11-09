/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package girilen.ismi.klavyeden.istenen.sayı.kadar.alt.alta.yazdırma;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class GirilenIsmiKlavyedenIstenenSayıKadarAltAltaYazdırma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String isim;
        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi girin");
        isim = scan.nextLine();
        System.out.println("İsminizi kaç defa yazdırmak istersiniz");
        int sayi = scan.nextInt();
        
        for(int i =0; i<sayi;i++){
        System.out.println(isim);
        }
        
        
        
    }

}
