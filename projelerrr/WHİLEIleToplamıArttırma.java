/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile.ile.toplamı.arttırma;

/**
 *
 * @author user
 */
public class WHİLEIleToplamıArttırma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int toplam = 0;
        int sayı = 1;
        while (sayı <= 5) {
            toplam = toplam + sayı;
            sayı = sayı + 1;
        }
        System.out.println(toplam);

    }

}
