/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author rf
 */
public class Kalkulator {
    private int bilangan1;
    private int bilangan2;
    private int hasil;
    
    public void setBilangan1 ( int bilangan1) {
        this.bilangan1 = bilangan1 ;
    }
    
    public int getBilangan1 () {
        return bilangan1 ;
    }
    
    public int getHasil () {
        return hasil;
    }
    
    public void setBilangan2 (int bilangan2) {
        this.bilangan2 = bilangan2 ;
    }
    
    public void penjumlahan () {
        hasil = bilangan1 + bilangan2 ;
    }
    
    public void pengurangan () {
        hasil = bilangan1 - bilangan2 ;
    }
    
    public void perkalian () {
        hasil = bilangan1 * bilangan2 ;
    }
    
    public void pembagian () {
        hasil = bilangan1 / bilangan2 ;
    }
}
