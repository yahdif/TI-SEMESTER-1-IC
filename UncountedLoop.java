/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkguncounted.pkgloop.project;

/**
 *
 * @author yahdi 
 */
public class UncountedLoopProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("====================== While =====================");
    int a=7;
    while (a>0){
    System.out.println("Countdown "+a);
    a--;}
    System.out.println("==================== Do While ====================");
    int f=1;
    do{
    System.out.println("Mata Kuliah "+f);
    f++;} 
    while(f<=6);
    }
}