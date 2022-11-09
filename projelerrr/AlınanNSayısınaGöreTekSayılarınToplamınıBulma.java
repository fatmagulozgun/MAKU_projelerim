/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alınan.n.sayısına.göre.tek.sayıların.toplamını.bulma;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AlınanNSayısınaGöreTekSayılarınToplamınıBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayı gir");
        int say = scan.nextInt();
        int i = 1;
        int toplam = 0;
        while (i <= say) {
            if (i % 2 == 0) {
                toplam = toplam + i;
            }
            i++;
        }
        System.out.println(toplam);

    }

}
