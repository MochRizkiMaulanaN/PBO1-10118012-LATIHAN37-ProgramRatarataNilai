/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rata2nilai;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Rata {
    Scanner input = new Scanner(System.in);
          
        int Bm;
        int[] Na;
        
        public void cetak(){
            System.out.print("Masukkan Banyaknya Mahasiswa : ");
            Bm = input.nextInt();
            double Rata = 0;
            int[] Na = new int[10];
            for(int i =0; i< Bm; i++){
            System.out.print("Nilai Mahasiswa Ke-"+(i+1)+" = ");
            Na[i] =input.nextInt();
            Rata += Na[i];
            }
        System.out.println("Maka ,Rata-Rata Nilainya Adalah : "+(Rata/Bm));
        System.out.println("( Develoved By : Moch Rizki Maulana N )");
    }
        
        
        
}
