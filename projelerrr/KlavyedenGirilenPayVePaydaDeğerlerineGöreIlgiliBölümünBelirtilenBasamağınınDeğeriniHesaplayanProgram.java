/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klavyeden.girilen.pay.ve.payda.değerlerine.göre.ilgili.bölümün.belirtilen.basamağının.değerini.hesaplayan.program;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class KlavyedenGirilenPayVePaydaDeğerlerineGöreIlgiliBölümünBelirtilenBasamağınınDeğeriniHesaplayanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("payı girin:");
        int pay = input.nextInt();
        System.out.println("paydayı girin:");
        int payda = input.nextInt();
        System.out.println("Hangi basamak istediğinizi girini:");
        int bas = 0;
        int n = input.nextInt();
        
        for(int i=1; i<=n; i++){
            pay = payda*10;
            bas = pay/payda;
            pay = pay%payda;
        }
        System.out.println("Basamak değeri" +bas);
    }
    }
    
