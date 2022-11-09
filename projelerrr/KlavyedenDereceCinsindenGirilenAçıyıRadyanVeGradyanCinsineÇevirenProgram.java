/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klavyeden.derece.cinsinden.girilen.açıyı.radyan.ve.gradyan.cinsine.çeviren.program;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class KlavyedenDereceCinsindenGirilenAçıyıRadyanVeGradyanCinsineÇevirenProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("LÜtfen derece cinsinden açıyı giriniz:");
        double a = input.nextDouble();
        double rad = a * Math.PI / 180;
        double grad = a * Math.PI / 200;
        System.out.println("Radyan=" + rad + "Gradyan=" + grad);
    }

}
