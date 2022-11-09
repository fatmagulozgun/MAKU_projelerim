/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klavyeden.bir.iletkenin.direnci.ile.akımı.girildiğinde.uçlarındaki.gerilimi.hesaplayan.program.ohm.kanunu;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class KlavyedenBirIletkeninDirenciIleAkımıGirildiğindeUçlarındakiGerilimiHesaplayanProgramOhmKanunu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iletkenin direncini ve akımını giriniz:");
        double d = input.nextDouble();
        double akım = input.nextDouble();
        double gerilim = d*akım;
        System.out.println("Gerilim=" +gerilim);
    }

}
