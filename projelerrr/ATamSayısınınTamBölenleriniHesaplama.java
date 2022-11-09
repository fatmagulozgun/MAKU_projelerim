/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.tam.sayısının.tam.bölenlerini.hesaplama;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ATamSayısınınTamBölenleriniHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen bölenlerini bulmak istediğiniz sayıları yazın");
        int sayi = klavye.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                System.out.print(i + " ");
            }

        }

    }

}
