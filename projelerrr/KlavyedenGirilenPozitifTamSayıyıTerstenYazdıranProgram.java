/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klavyeden.girilen.pozitif.tam.sayıyı.tersten.yazdıran.program;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class KlavyedenGirilenPozitifTamSayıyıTerstenYazdıranProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int a = input.nextInt();
        System.out.println("Girilen sayının tersten yazılışı:");
        while(a>0){
            System.out.print(a%10);
            a/=10;
    }
    
}
}
