/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ortalama.hesaplama;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class OrtalamaHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("birinci sayı değer giriniz");
        double birinci = input.nextDouble();
        System.out.println("ikinci sayı değer giriniz");
        double ikinci = input.nextDouble();
        System.out.println("üçüncü sayı değer giriniz");
        double üçüncü = input.nextDouble();
        double toplama = birinci + ikinci + üçüncü;
        double çarpma = birinci * ikinci * üçüncü;
        double ort = (double) toplama / 3;
        System.out.println(" ortalama:" + ort);

    }

}
