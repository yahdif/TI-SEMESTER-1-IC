/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.array;

/**
 *
 * @author yahdi
 */
public class ProjectArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("==================== Array Length ====================");
        String[] motor={"Honda", "Yamaha", "Suzuki", "Kawasaki",};
        for (int i = 0; i < motor.length; i++){
             
            System.out.println("Motor " + ": " + motor[i]);
            }
        System.out.println("Jumlah motor sebanyak:"+motor.length);
        
        
        System.out.println("==================== Array Dasar ====================");
        String[] fruit={"Nangka", "Durian", "Kelengkeng", "Nanas", "Salak",};
        System.out.println("Buah Pertama : "+fruit[0]);
        System.out.println("Buah Kedua   : "+fruit[1]);
        System.out.println("Buah Ketiga  : "+fruit[2]);
        System.out.println("Buah Keempat : "+fruit[3]);
        System.out.println("Buah Kelima  : "+fruit[4]);
        
        
        
        
        System.out.println("==================== Array 2D ====================");
        String[][]keluarga={{"Ayah","Rifai", "Wiraswasta"}, {"Ibu", "Mutiha", "Ibu Rumah Tangga"}, {"Anak Pertama", "Tohir", "Guru"}, {"Anak Kedua", "Ainun Najib", "Staf Puskesmas"}};
        for (int x=0;x<keluarga.length;x++){
         System.out.println("Nama      : "+ keluarga[x][1]);
         System.out.println("Status    : "+ keluarga[x][0]);
         System.out.println("Pekerjaan : "+ keluarga[x][2]);
        }
    }
    
}
