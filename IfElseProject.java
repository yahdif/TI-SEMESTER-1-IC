/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkgelse.project;

/**
 *
 * @author yahdi
 */
public class IfElseProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("==================== If ====================");
    int x=24;
    int y=8;
    if (x>y) {
        System.out.println("x lebih besar daripada y");
    }
    System.out.println("==================== If Else ====================");
    int time=17;
    if (time>=17) {
        System.out.println("Waktunya kuliah");}
    else {
        System.out.println("Waktunya kerja");}
    System.out.println("==================== Else If ====================");
    int nilai=85;
    if (nilai<40) {
        System.out.println("anda kurang belajar");}
    else if (nilai<60){
        System.out.println("belajar yang giat lagi");}
    else if (nilai<80){
        System.out.println("pertahankan nilaimu");}
    else {
        System.out.println("lanjutkan");
    }
    }
    
}
