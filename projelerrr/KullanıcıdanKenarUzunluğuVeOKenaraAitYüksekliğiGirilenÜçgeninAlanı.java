/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kullanıcıdan.kenar.uzunluğu.ve.o.kenara.ait.yüksekliği.girilen.üçgenin.alanı;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class KullanıcıdanKenarUzunluğuVeOKenaraAitYüksekliğiGirilenÜçgeninAlanı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen üçgene ait kenar uzunluğunu ve yüksekliğini giriniz:");
        int a = input.nextInt();
        int b = input.nextInt();
        int alan = a * b / 2;
        System.out.println("Alan:" + alan);
    }

}
