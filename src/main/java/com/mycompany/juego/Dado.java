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

    public Dado() {
    }
    
    //Metodo que regresa un valor entre 1 - 6.
    public int lanzar()
    {
        return random.nextInt(6) + 1 ;
    }
    
}
