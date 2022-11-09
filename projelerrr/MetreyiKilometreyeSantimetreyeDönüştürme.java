/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metreyi.kilometreye.santimetreye.dönüştürme;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MetreyiKilometreyeSantimetreyeDönüştürme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int kmcevir, cmcevirme;
        Scanner scan = new Scanner(System.in);
        System.out.println("çevirmek istediğiniz uzunluğu m cinsinden yazınız");
        int m = scan.nextInt();

        kmcevir = m / 1000;
        cmcevirme = m * 1000;

        System.out.println("km cinsinden:" + "" + kmcevir);
        System.out.println("cm cinsinden:" + "" + cmcevirme);

    }

}
