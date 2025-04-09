/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego;

import java.util.*;

/**
 *
 * @author jalex
 */
public class Farkle {
    
    private Dado[] dados;
    private Jugador[] jugadores;
    private int turno;
    private int puntosRonda;
    private List<Integer> ultimosValores;

    //Constructor que recibe jugadores y se crean 6 dados
    public Farkle(Jugador[] jugadores) {
        this.jugadores = jugadores;
        this.turno = 0;
        dados = new Dado[6];
        for (int i = 0; i < 6; i++) {
            dados[i] = new Dado();
        }
    }

    public void lanzarDados() {
        ultimosValores = new ArrayList<>();
    for (Dado dado : dados) {
        dado.lanzar();
        ultimosValores.add(dado.getValor());
    }
    }

    public List<Integer> getValoresDados() {
        return ultimosValores;
    }

    public String getJugadorActual() {
        return jugadores[turno].getNombre();
    }


    public int calcularPuntaje(List<Integer> valores) {
        int[] conteo = new int[7];
        for (int val : valores) {
            conteo[val]++;
        }

        int puntaje = 0;

        // Escalera
        boolean escalera = true;
        for (int i = 1; i <= 6; i++) {
            if (conteo[i] != 1) {
                escalera = false;
                break;
            }
        }
        if (escalera) return 2500;

        // Tres pares
        int pares = 0;
        for (int i = 1; i <= 6; i++) {
            if (conteo[i] == 2) pares++;
        }
        if (pares == 3) return 1500;

        for (int i = 1; i <= 6; i++) {
            switch (conteo[i]) {
                case 6: puntaje += 3000; break;
                case 5: puntaje += 2000; break;
                case 4: puntaje += 1000; break;
                case 3:
                    if (i == 1) puntaje += 1000;
                    else puntaje += i * 100;
                    break;
            }
        }

        // Unos y cincos individuales
        if (conteo[1] < 3) puntaje += conteo[1] * 100;
        if (conteo[5] < 3) puntaje += conteo[5] * 50;

        return puntaje;
    }

    public boolean esFarkle(List<Integer> valores) {
        return calcularPuntaje(valores) == 0;
    }

    public void guardarPuntos() {
        jugadores[turno].agregarPuntos(puntosRonda);
        puntosRonda = 0;
    }

    public int getPuntosRonda() {
        return puntosRonda;
    }

    public boolean jugarTurno(List<Integer> seleccionados) {
        int puntos = calcularPuntaje(seleccionados);
        if (puntos == 0) {
            puntosRonda = 0;
            return false; // Farkle
        } else {
            puntosRonda += puntos;
            return true;
        }
    }

    public boolean haGanado() {
        return jugadores[turno].getPuntos() >= 10000;
    }

    public Jugador getGanador() {
        return jugadores[turno];
    }

    public void avanzarTurno() {
        turno = (turno + 1) % jugadores.length;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

}
