/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sayı.tek.mi.çift.mi.olduğunu.anlama;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SayıTekMiÇiftMiOlduğunuAnlama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayınızı girin");
        int s = input.nextInt();
        if (s % 2 == 0) {
            System.out.println("sayınız çifttir");
        } else {
            System.out.println("sayınız tektir");
        }
    }

}
