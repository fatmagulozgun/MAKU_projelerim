/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenat.hesaplama;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class FahrenatHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen fahrenheit değer giriniz");
        double fahr = input.nextDouble();
        double celcius = (fahr - 32) / 1.8;
        System.out.println(" değer:" + celcius);
    }

}
