/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sayının.pozitif.negatif.veya.sıfır.olduğunu;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SayınınPozitifNegatifVeyaSıfırOlduğunu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("lütfen sayı giriniz");
            int sayi = scan.nextInt();
            if (sayi > 0) {
                System.out.println("sayınız pozitiftir");
            } else if (sayi < 0) {
                System.out.println("sayınız negatiftir");
            } else {
                System.out.println("sayınız sıfır");
            }
        }}}
