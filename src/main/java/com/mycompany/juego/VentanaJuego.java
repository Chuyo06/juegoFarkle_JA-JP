/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.juego;

import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author jalex
 */
public class VentanaJuego extends javax.swing.JFrame {

    private Farkle juego;
    private VentanaInicio ventanaInicio ;
    
    //Constructor recibe la 
    public VentanaJuego(VentanaInicio ventanaInicio) {
        initComponents();
        System.out.println("VentanaJuego se ha inicializado");  // Debugging line
         this.ventanaInicio = ventanaInicio;  // Asignar la instancia recibida
         
        juego = new Farkle(ventanaInicio.getJugadores());
        
        redimensionarImgPuntos();
        redimensionarImgDados();
       
         setVisible(true);

    }

  private void redimensionarImgPuntos()
  {
       // Asignar un tamaño fijo al JLabel si no se usa diseño automático
             puntos.setSize(300, 400); // o el tamaño que quieras

        // Cargar y escalar la imagen
        ImageIcon originalIcon = new ImageIcon(getClass().getResource("/logo/puntos.png"));
        Image imagenEscalada = originalIcon.getImage().getScaledInstance(
            puntos.getWidth(), puntos.getHeight(), Image.SCALE_SMOOTH);

        puntos.setIcon(new ImageIcon(imagenEscalada));
  }
  
  private void actualizarImagenesDados() {
    List<Integer> valores = juego.getValoresDados(); //Un vector con los valores de los dados que salieron
    JLabel[] dadosLabels = {dado1, dado2, dado3, dado4, dado5, dado6}; //Vector de los JLabels de los dados
    
    //Ciclo for que realiza los cambios en las imagene dependiendo el valor que toco con el metodo
    for (int i = 0; i < valores.size(); i++) {
        int valor = valores.get(i);//Se guarda en la varibale valor el numero que toco en el dado correspondiente.
        String rutaImagen = "/dados/dice_" + valor + ".png";
        ImageIcon icono = new ImageIcon(getClass().getResource(rutaImagen));
        
       //Utilizando el tamanio del JLabel apra poner la imagen
        Image imagenEscalada = icono.getImage()
            .getScaledInstance(dadosLabels[i].getWidth(), dadosLabels[i].getHeight(), Image.SCALE_SMOOTH);
        
        dadosLabels[i].setIcon(new ImageIcon(imagenEscalada)); //Dependiendo el valor en el que vaya i, se pondra la imagen respectiva.
    }
}
  
  private void redimensionarImgDados()
  {
          ImageIcon dado1Icon = new ImageIcon(getClass().getResource("/dados/dice_1.png"));
          dado1.setSize(80, 80); //  tamaño que quieras
          Image imagenEscalada1 = dado1Icon.getImage().getScaledInstance(
          dado1.getWidth(), dado1.getHeight(), Image.SCALE_SMOOTH);
          dado1.setIcon(new ImageIcon(imagenEscalada1));

          ImageIcon dado2Icon = new ImageIcon(getClass().getResource("/dados/dice_2.png"));
          dado2.setSize(80, 80); //  tamaño que quieras
          Image imagenEscalada2 = dado2Icon.getImage().getScaledInstance(
          dado2.getWidth(), dado2.getHeight(), Image.SCALE_SMOOTH);
          dado2.setIcon(new ImageIcon(imagenEscalada2));
          
          ImageIcon dado3Icon = new ImageIcon(getClass().getResource("/dados/dice_3.png"));
          dado3.setSize(80, 80); //  tamaño que quieras
          Image imagenEscalada3 = dado3Icon.getImage().getScaledInstance(
          dado3.getWidth(), dado3.getHeight(), Image.SCALE_SMOOTH);
          dado3.setIcon(new ImageIcon(imagenEscalada3));
          
          ImageIcon dado4Icon = new ImageIcon(getClass().getResource("/dados/dice_4.png"));
          dado4.setSize(80, 80); //  tamaño que quieras
          Image imagenEscalada4 = dado4Icon.getImage().getScaledInstance(
          dado4.getWidth(), dado4.getHeight(), Image.SCALE_SMOOTH);
          dado4.setIcon(new ImageIcon(imagenEscalada4));
          
          ImageIcon dado5Icon = new ImageIcon(getClass().getResource("/dados/dice_5.png"));
          dado5.setSize(80, 80); //  tamaño que quieras
          Image imagenEscalada5 = dado4Icon.getImage().getScaledInstance(
          dado5.getWidth(), dado5.getHeight(), Image.SCALE_SMOOTH);
          dado5.setIcon(new ImageIcon(imagenEscalada5));
          
          ImageIcon dado6Icon = new ImageIcon(getClass().getResource("/dados/dice_6.png"));
          dado6.setSize(80, 80); //  tamaño que quieras
          Image imagenEscalada6 = dado6Icon.getImage().getScaledInstance(
          dado6.getWidth(), dado6.getHeight(), Image.SCALE_SMOOTH);
          dado6.setIcon(new ImageIcon(imagenEscalada6));
          

  }
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dado1 = new javax.swing.JLabel();
        dado2 = new javax.swing.JLabel();
        dado3 = new javax.swing.JLabel();
        dado4 = new javax.swing.JLabel();
        dado5 = new javax.swing.JLabel();
        dado6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        puntos = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 510));

        dado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dados/dice_1.png"))); // NOI18N
        dado1.setPreferredSize(new java.awt.Dimension(70, 70));
        dado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickDado1(evt);
            }
        });

        dado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dados/dice_2.png"))); // NOI18N
        dado2.setText("jLabel2");
        dado2.setPreferredSize(new java.awt.Dimension(70, 70));

        dado3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dados/dice_3.png"))); // NOI18N
        dado3.setText("jLabel3");
        dado3.setPreferredSize(new java.awt.Dimension(70, 70));

        dado4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dados/dice_4.png"))); // NOI18N
        dado4.setText("jLabel4");
        dado4.setPreferredSize(new java.awt.Dimension(70, 70));

        dado5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dados/dice_5.png"))); // NOI18N
        dado5.setText("jLabel5");
        dado5.setPreferredSize(new java.awt.Dimension(70, 70));

        dado6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dados/dice_6.png"))); // NOI18N
        dado6.setText("jLabel6");
        dado6.setPreferredSize(new java.awt.Dimension(70, 70));

        jLabel7.setText("jLabel7");

        puntos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/puntos.png"))); // NOI18N
        puntos.setPreferredSize(new java.awt.Dimension(300, 400));

        jButton1.setText("Lanzar dados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(dado4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108)
                                .addComponent(dado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dado5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(dado6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(puntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel7)
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dado6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dado4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dado5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(puntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clickDado1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickDado1
        
    }//GEN-LAST:event_clickDado1

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    
        juego.lanzarDados();//Se lanzan los dados y en el metodo lanzarDados() se guardan los valores.
        actualizarImagenesDados(); //Aqui las imagenes cambian cuando se presiona el boton
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dado1;
    private javax.swing.JLabel dado2;
    private javax.swing.JLabel dado3;
    private javax.swing.JLabel dado4;
    private javax.swing.JLabel dado5;
    private javax.swing.JLabel dado6;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel puntos;
    // End of variables declaration//GEN-END:variables
}
