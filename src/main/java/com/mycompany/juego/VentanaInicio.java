package com.mycompany.juego;

import java.awt.Color;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jalex
 */
public class VentanaInicio extends javax.swing.JFrame {

    private Jugador[] jugadores;
    
    public VentanaInicio() {
        initComponents();
         getContentPane().setBackground(new Color(232, 248, 245)); // color blanco de fondo
         
         // Asignar un tamaño fijo al JLabel si no se usa diseño automático
    jLabel1.setSize(300, 150); // o el tamaño que quieras

    // Cargar y escalar la imagen
    ImageIcon originalIcon = new ImageIcon(getClass().getResource("/logo/logo_Farkle.png"));
    Image imagenEscalada = originalIcon.getImage().getScaledInstance(
        jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);

    jLabel1.setIcon(new ImageIcon(imagenEscalada));
    
        setVisible(true);
    }

   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton2J = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        boton4J = new javax.swing.JToggleButton();
        boton3J = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INICIO");
        setBackground(new java.awt.Color(153, 255, 153));
        setPreferredSize(new java.awt.Dimension(550, 450));
        setResizable(false);

        boton2J.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton2J.setText("2 JUGADORES");
        boton2J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presionar2Jugadores(evt);
            }
        });

        boton4J.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton4J.setText("4 JUGADORES");
        boton4J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presionar4Jugadores(evt);
            }
        });

        boton3J.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton3J.setText("3 JUGADORES");
        boton3J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presionar3Jugadores(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/logo_Farkle.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(324, 177));
        jLabel1.setMinimumSize(new java.awt.Dimension(324, 177));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton2J)
                                .addGap(18, 18, 18)
                                .addComponent(boton3J)
                                .addGap(18, 18, 18)
                                .addComponent(boton4J))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(176, 176, 176))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton3J, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton4J, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton2J, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void presionar4Jugadores(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presionar4Jugadores

        pedirJugadores(4); 
        cambiarVentana();
    }//GEN-LAST:event_presionar4Jugadores

    private void presionar2Jugadores(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presionar2Jugadores

        pedirJugadores(2);
        cambiarVentana();
    }//GEN-LAST:event_presionar2Jugadores

    private void presionar3Jugadores(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presionar3Jugadores

        pedirJugadores(3);
        cambiarVentana();
    }//GEN-LAST:event_presionar3Jugadores

    private void cambiarVentana()
    {
        this.dispose(); //cierra la ventana actual
        
        VentanaJuego ventanaJuego = new VentanaJuego(this); //Referencia a la instancia actual del objeto
        ventanaJuego.setSize(500, 600);
        ventanaJuego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaJuego.setVisible(true);
        
    }
    
   private void pedirJugadores(int numeroJugadores) {
       //Se crea un vector con el numero de jugadores elegido.
        jugadores = new Jugador[numeroJugadores]; 
        for (int i = 0; i < numeroJugadores; i++) {
            //Muestra un panel en el cual se ingresaran los nombres de los jugadores.
            String nombre = JOptionPane.showInputDialog("Nombre del jugador " + (i + 1) + ":");
            jugadores[i] = new Jugador(nombre);
        }
        
    }
  
   public Jugador[] getJugadores()
   {
       return jugadores;
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton boton2J;
    private javax.swing.JToggleButton boton3J;
    private javax.swing.JToggleButton boton4J;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
