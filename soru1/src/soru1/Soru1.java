/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Soru1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sayi;
        Scanner in =new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        sayi=in.nextInt();
        System.out.println("Girdiğiniz Sayının Basmakları Toplamı: "+ degerDondur(sayi) );
    }
    public static int degerDondur(int sayi)
    {
    int dondur = 0;
        while(sayi>0)
        {
        dondur+=(sayi%10);
        sayi=sayi/10;
        }
        return dondur;  
    }
    
}
