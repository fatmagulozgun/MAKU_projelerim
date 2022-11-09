/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klavyeden.girilen.b.tamsayısına.göre.şartı.sağlayan.pkg0.pkg100.arasında.a.sayısını.bulma;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class KlavyedenGirilenBTamsayısınaGöreŞartıSağlayan0100ArasındaASayısınıBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Klavyeden girilen b tamsayısına göre a^3-a^2=b şartını sağlayan 0<a<100 sayısını bulma
     Scanner input = new Scanner(System.in);
        System.out.print("Lütfen b sayısını giriniz:");
        int b= input.nextInt();
        
        for (int a = 1; a<=99; a++){
            if(a*a*a-a*a==b){
                System.out.println("a:"+a);
            }
        }
                
    }
    

    

}
