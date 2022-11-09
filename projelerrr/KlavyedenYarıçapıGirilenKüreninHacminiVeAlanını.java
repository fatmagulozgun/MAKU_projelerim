/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klavyeden.yarıçapı.girilen.kürenin.hacmini.ve.alanını;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class KlavyedenYarıçapıGirilenKüreninHacminiVeAlanını {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kürenin yarıçapını giriniz:");
        double yarıc = input.nextDouble();
        double hacim = 4 / 3 * Math.PI * Math.pow(yarıc, 3);
        double alan = 4 * Math.PI * Math.pow(yarıc, 2);
        System.out.println("Hacim=" + hacim + "Alan=" + alan);
    }

}
