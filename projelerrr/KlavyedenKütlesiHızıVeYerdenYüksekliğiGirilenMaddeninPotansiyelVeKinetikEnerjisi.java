/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klavyeden.kütlesi.hızı.ve.yerden.yüksekliği.girilen.maddenin.potansiyel.ve.kinetik.enerjisi;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class KlavyedenKütlesiHızıVeYerdenYüksekliğiGirilenMaddeninPotansiyelVeKinetikEnerjisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen maddenin kütlesini, hızını ve yerden yüksekliğini giriniz:");
        double kütle = input.nextDouble();
        double hız = input.nextDouble();
        double h = input.nextDouble();
        System.out.println("Lütfen maddenin yerçekimi ivmesini giriniz:");
        double g = input.nextDouble();
        double potansiyel_enerji = kütle*g*h;
        double kinetik_enerji = 1/2*kütle*hız*hız;
        System.out.println("Kinetik Enerji=" +kinetik_enerji+ "Potansiyel Enerji=" +potansiyel_enerji);
    }
    
}
