/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ristinolla.ristinolla.logiikka;

/**
 *
 * @author Sofia
 */
public class Ruutu {

    private RuudunTila tila;
    private int riveja;
    private int sarakkeita;
    
    public Ruutu(int riveja, int sarakkeita){
        this.riveja = riveja;
        this.sarakkeita = sarakkeita;
    }
    
    public void Tila(RuudunTila tila){
        this.tila = tila;
    }
    
}
