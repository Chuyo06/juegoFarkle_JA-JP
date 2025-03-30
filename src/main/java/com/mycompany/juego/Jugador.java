/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego;

/**
 *
 * @author jalex
 */
public class Jugador {
    
    private String nombre; 
    private int puntajeTotal;

    //Constructor que recibe el nombre del jugador
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntajeTotal = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
