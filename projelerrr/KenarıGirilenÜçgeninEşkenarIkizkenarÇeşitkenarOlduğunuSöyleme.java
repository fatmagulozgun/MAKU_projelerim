/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.kenarı.girilen.üçgenin.eşkenar.ikizkenar.çeşitkenar.olduğunu.söyleme;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class KenarıGirilenÜçgeninEşkenarIkizkenarÇeşitkenarOlduğunuSöyleme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     Scanner scan =new Scanner (System.in); 
     System.out.println("1.kenarın uzunluğunu girin");
     int say1=scan.nextInt();
     System.out.println("2.kenarın uzunluğunu girin");
     int say2=scan.nextInt();
     System.out.println("3.kenarın uzunluğunu girin");
     int say3=scan.nextInt();
     if ((say1==say2) && (say2==say3) && (say1==say3)){ 
     System.out.println("Eşkenar üçgen");  
     }
     if ((say1!=say2) && (say2!=say3) && (say1!=say3)){ 
     System.out.println("Çeşitkenar üçgen");  
     }  
     if ((say1==say2) && (say2!=say3) || (say1==say3)&& (say3!=say2) || (say2==say3)&& (say3!=say1)){ 
     System.out.println("İkizkenar Üçgen");  
     }
     
    }
    
}
