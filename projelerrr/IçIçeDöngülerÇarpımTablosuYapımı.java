/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iç.içe.döngüler.çarpım.tablosu.yapımı;

/**
 *
 * @author user
 */
public class IçIçeDöngülerÇarpımTablosuYapımı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       for(int i=1;i<10;i++){
    System.out.println(i+"ler çarpımı:");
    for(int j=1;j<=10;j++){
    int sonuc=j*i;
    System.out.println(i+"*"+j+"="+sonuc);
    }
    }
  
          
    }
    
}
