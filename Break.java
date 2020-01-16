/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgbreak;

/**
 *
 * @author yahdi
 */
public class Break {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       for (int nilai = 80; nilai > 70; nilai --) {
      if (nilai == 75) {
          break;
      } 
       System.out.println(nilai) ;
        }
        }


}