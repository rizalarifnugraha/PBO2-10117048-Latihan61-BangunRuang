/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan61.bangunruang;

/**
 *
 * @author 
 * Nama : Rizal Arif Nugraha 
 * Nim : 10117048 
 * Kelas : PBO2 
 * Deskripsi Program : Program ini berisi tentang menghitung volume pada bangun 
 *                     ruang.
 */
public class BolaBasket extends BangunRuang {
    
    private double jari;

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public double hitungVolume() {
        return 4 * jari * jari * jari * 3.14 / 3;

    }
    
}
