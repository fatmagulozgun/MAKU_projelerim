/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kullanıcıdan.satır.ve.sutün.al.yıldız.yap;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class KullanıcıdanSatırVeSutünAlYıldızYap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("satır sayısı:");
        int row = input.nextInt();
        System.out.print("sütun sayısı:");
        int col = input.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
