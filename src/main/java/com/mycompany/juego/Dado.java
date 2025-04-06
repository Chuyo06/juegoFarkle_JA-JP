/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego;

import java.util.Random;

/**
 *
 * @author jalex
 */
public class Dado {
    
    private Random random = new Random(); 
    private int valor ;
    
    
    public Dado() {
    }
    
    //Metodo que te da  un valor entre 1 - 6.
    public void lanzar()
    {
         valor = random.nextInt(6) + 1 ;
    }
    
    public int getValor()
    {
        return valor ;
    }
}
