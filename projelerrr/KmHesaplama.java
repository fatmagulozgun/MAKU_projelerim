/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package km.hesaplama;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class KmHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//consoldan değer almak için tanımladık
        System.out.println("Lütfen km cinsinden değer giriniz");
        int km = input.nextInt();
        int metre = km * 1000;
        System.out.println("hesaplanan metre: " + metre);

    }

}
