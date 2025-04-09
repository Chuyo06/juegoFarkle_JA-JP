/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.juego;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;
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
    private VentanaInicio ventanaInicio;
    private boolean[] dadosSeleccionados = new boolean[6]; //Para concer cual dado se esta seleccionando
    private JLabel[] etiquetasPuntaje;
    //private List<Integer> valoresDadosSeleccionados = new ArrayList<>(); //Aqui se guardan los valores de los dados que se seleccionaron.

    //Constructor que recibe la ventana de Inicio para que siga de esa
    public VentanaJuego(VentanaInicio ventanaInicio) {
        initComponents();

        this.ventanaInicio = ventanaInicio; // Asignar la instancia recibida
        juego = new Farkle(ventanaInicio.getJugadores());
        Jugador[] jugadores = juego.getJugadores();

        etiquetasPuntaje = new JLabel[jugadores.length];
        JLabel[] jlabels = {jLabel1, jLabel2, jLabel3, jLabel4};

        for (int i = 0; i < jugadores.length; i++) {
            etiquetasPuntaje[i] = jlabels[i];
            etiquetasPuntaje[i].setText(jugadores[i].getNombre() + ": 0 pts");
        }

        getContentPane().setBackground(new Color(232, 248, 245)); // color de fondo
        juego = new Farkle(ventanaInicio.getJugadores());

        redimensionarImgPuntos();
        redimensionarImgDados();

        setVisible(true);

    }

    private void redimensionarImgPuntos() {
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

        int tamanoImagen = 70;//tamanio de la imagen del dado mas pequenia que el dado

        //Ciclo for que realiza los cambios en las imagene dependiendo el valor que toco con el metodo
        for (int i = 0; i < valores.size(); i++) {
            int valor = valores.get(i);//Se guarda en la varibale valor el numero que toco en el dado correspondiente.
            String rutaImagen = "/dados/dice_" + valor + ".png";
            ImageIcon icono = new ImageIcon(getClass().getResource(rutaImagen));

            //Utilizando el tamanio del JLabel apra poner la imagen
            Image imagenEscalada = icono.getImage()
                    .getScaledInstance(tamanoImagen, tamanoImagen, Image.SCALE_SMOOTH);

            dadosLabels[i].setIcon(new ImageIcon(imagenEscalada)); //Dependiendo el valor en el que vaya i, se pondra la imagen respectiva.
        }
    }

    private void redimensionarImgDados() {
        int tamanioLabel = 90;
        int tamanioImg = 70;

        JLabel[] dadosLabels = {dado1, dado2, dado3, dado4, dado5, dado6};


        for (JLabel dadoLabel : dadosLabels) {
            dadoLabel.setText(null);//Eliminar el nombre del Label
            dadoLabel.setSize(tamanioLabel, tamanioLabel);//Tamanio que queremos en el Label
            dadoLabel.setPreferredSize(new Dimension(tamanioLabel, tamanioLabel));//Tamanio preferido del Label que es el mismo

            // Cargar y escala en el tamanio que dijimos la imagen del signo
            ImageIcon originalIcon = new ImageIcon(getClass().getResource("/logo/signo.png"));
            Image imagenEscalada = originalIcon.getImage().getScaledInstance(
                    tamanioImg, tamanioImg, Image.SCALE_SMOOTH);

            // Centrar la imagen en el JLabel
            dadoLabel.setHorizontalAlignment(JLabel.CENTER);
            dadoLabel.setVerticalAlignment(JLabel.CENTER);
            //
            //Poner la imagen en el Label
            dadoLabel.setIcon(new ImageIcon(imagenEscalada));
        }
    }

    //Metodo que va ayudarnos a identificar que dado esta seleccionado
    private void seleccionarDado(int numDado, JLabel dadoLabel) {

        // con esta comparacion cambias el estado de la seleccion
        dadosSeleccionados[numDado] = !dadosSeleccionados[numDado];

        if (dadosSeleccionados[numDado]) {
            dadoLabel.setBorder(javax.swing.BorderFactory.createLineBorder(Color.RED, 4));//Borde cuando se selecciona
        } else {
            dadoLabel.setBorder(null);//Se quita el borde cuando no se utiliza
        }
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
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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
        dado2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickDado2(evt);
            }
        });

        dado3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dados/dice_3.png"))); // NOI18N
        dado3.setText("jLabel3");
        dado3.setPreferredSize(new java.awt.Dimension(70, 70));
        dado3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickDado3(evt);
            }
        });

        dado4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dados/dice_4.png"))); // NOI18N
        dado4.setText("jLabel4");
        dado4.setPreferredSize(new java.awt.Dimension(70, 70));
        dado4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickDado4(evt);
            }
        });

        dado5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dados/dice_5.png"))); // NOI18N
        dado5.setText("jLabel5");
        dado5.setPreferredSize(new java.awt.Dimension(70, 70));
        dado5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickDado5(evt);
            }
        });

        dado6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dados/dice_6.png"))); // NOI18N
        dado6.setText("jLabel6");
        dado6.setPreferredSize(new java.awt.Dimension(70, 70));
        dado6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickDado6(evt);
            }
        });

        jLabel7.setText("jLabel7");

        puntos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/puntos.png"))); // NOI18N
        puntos.setPreferredSize(new java.awt.Dimension(300, 400));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Lanzar dados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("Sumar Puntos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

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
                                                                                .addComponent(dado6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(38, 38, 38)
                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                                .addComponent(puntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(74, 74, 74))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(64, 64, 64)
                                                .addComponent(jLabel2)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(133, 133, 133)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                .addGap(130, 130, 130))
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
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(31, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel4))
                                                .addGap(22, 22, 22))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        juego.lanzarDados();//Se lanzan los dados y en el metodo lanzarDados() se guardan los valores.
        actualizarImagenesDados(); //Aqui las imagenes cambian cuando se presiona el boton
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        List<Integer> valores = juego.getValoresDados();
        List<Integer> seleccionados = new ArrayList<>();

        for (int i = 0; i < dadosSeleccionados.length; i++) {
            if (dadosSeleccionados[i]) {
                seleccionados.add(valores.get(i));
            }
        }

        if (seleccionados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "selecciona al menos un dado");
            return;
        }

        boolean turnoValido = juego.jugarTurno(seleccionados);
        if (!turnoValido) {
            JOptionPane.showMessageDialog(this, "farkle, perdiste los puntos de esta ronda");
            for (int i = 0; i < dadosSeleccionados.length; i++) {
                dadosSeleccionados[i] = false;
            }
            redimensionarImgDados();
            juego.avanzarTurno();
        } else {
            JOptionPane.showMessageDialog(this, "puntos actuales de esta ronda: " + juego.getPuntosRonda());
            juego.guardarPuntos();
            Jugador[] jugadores = juego.getJugadores();
            for (int i = 0; i < jugadores.length; i++) {
                etiquetasPuntaje[i].setText(jugadores[i].getNombre() + ": " + jugadores[i].getPuntos() + " pts");
            }
            juego.avanzarTurno();
        }
        //verifica el ganador
        if (juego.haGanado()){
            JOptionPane.showMessageDialog(this, "!" + juego.getGanador().getNombre() + " ha ganado " + juego.getGanador().getPuntos() + " puntos");
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(this, "Turno de: " + juego.getJugadorActual());
        }

        for (JLabel dado : new JLabel[]{dado1, dado2, dado3, dado4, dado5, dado6}) {
            dado.setBorder(null);
        }
    }

    private void clickDado1(java.awt.event.MouseEvent evt) {
        seleccionarDado(0, dado1);
    }

    private void clickDado2(java.awt.event.MouseEvent evt) {
        seleccionarDado(1, dado2);
    }

    private void clickDado3(java.awt.event.MouseEvent evt) {
        seleccionarDado(2, dado3);
    }

    private void clickDado4(java.awt.event.MouseEvent evt) {
        seleccionarDado(3, dado4);
    }

    private void clickDado5(java.awt.event.MouseEvent evt) {
        seleccionarDado(4, dado5);
    }

    private void clickDado6(java.awt.event.MouseEvent evt) {
        seleccionarDado(5, dado6);
    }

    // Variables declaration
    private javax.swing.JLabel dado1;
    private javax.swing.JLabel dado2;
    private javax.swing.JLabel dado3;
    private javax.swing.JLabel dado4;
    private javax.swing.JLabel dado5;
    private javax.swing.JLabel dado6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel puntos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;

}

