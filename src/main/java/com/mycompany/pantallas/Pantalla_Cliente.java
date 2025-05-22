package com.mycompany.pantallas;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import com.mycompany.loguear.Login;
import com.mycompany.vistas_cliente.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JPanel;

public class Pantalla_Cliente extends javax.swing.JFrame {

    public Pantalla_Cliente() {
        initComponents();
        initStyles();
        SetDate();
        InitContent();
    }
    
    private void initStyles() {
        lb_titulo.putClientProperty("FlatLaf.style", "font: bold $h3.regular.font");
        lb_titulo.setForeground(Color.white);
        lb_date.putClientProperty("FlatLaf.style", "font: 24 $light.font");
        lb_date.setForeground(Color.white);
        appname.putClientProperty("FlatLaf.style", "font: bold $h1.regular.font");
        appname.setForeground(Color.white);
    }
    
    private void SetDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        lb_date.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }
    
    private void InitContent() {
        ShowJPanel(new V_Inicio_Cliente());
    }
    
    public static void ShowJPanel(JPanel p) {
        content.removeAll();
        content.setLayout(new BorderLayout());

        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        appname = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btn_inicio = new javax.swing.JButton();
        btn_videojuegos = new javax.swing.JButton();
        btn_rentas = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        lb_titulo = new javax.swing.JLabel();
        lb_date = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1523, 777));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBackground(new java.awt.Color(13, 71, 161));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        appname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appname.setText("GAMERENT");

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        btn_inicio.setBackground(new java.awt.Color(41, 56, 64));
        btn_inicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_inicio.setForeground(new java.awt.Color(255, 255, 255));
        btn_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home-outline.png"))); // NOI18N
        btn_inicio.setText("Inicio");
        btn_inicio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 11, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_inicio.setBorderPainted(false);
        btn_inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_inicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_inicio.setIconTextGap(12);
        btn_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicioActionPerformed(evt);
            }
        });

        btn_videojuegos.setBackground(new java.awt.Color(41, 56, 64));
        btn_videojuegos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_videojuegos.setForeground(new java.awt.Color(255, 255, 255));
        btn_videojuegos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/juego.png"))); // NOI18N
        btn_videojuegos.setText("Videojuegos");
        btn_videojuegos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 11, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_videojuegos.setBorderPainted(false);
        btn_videojuegos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_videojuegos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_videojuegos.setIconTextGap(12);
        btn_videojuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_videojuegosActionPerformed(evt);
            }
        });

        btn_rentas.setBackground(new java.awt.Color(41, 56, 64));
        btn_rentas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_rentas.setForeground(new java.awt.Color(255, 255, 255));
        btn_rentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/renta.png"))); // NOI18N
        btn_rentas.setText("Tus Rentas");
        btn_rentas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 11, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_rentas.setBorderPainted(false);
        btn_rentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_rentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_rentas.setIconTextGap(12);
        btn_rentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rentasActionPerformed(evt);
            }
        });

        btn_cerrar.setBackground(new java.awt.Color(41, 56, 64));
        btn_cerrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cerrar-sesion.png"))); // NOI18N
        btn_cerrar.setText("Cerrar Sesión");
        btn_cerrar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 11, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_cerrar.setBorderPainted(false);
        btn_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cerrar.setIconTextGap(12);
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(appname, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_rentas, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_videojuegos, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(appname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btn_rentas, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btn_videojuegos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        header.setBackground(new java.awt.Color(25, 118, 210));

        lb_titulo.setText("SISTEMA DE RENTA DE VIDEOJUEGOS <MODO CLIENTE>");

        lb_date.setText("Hoy es {dayname} {day} de {month} de {year}");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 1142, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lb_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_date, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioActionPerformed
        ShowJPanel(new V_Inicio_Cliente());
    }//GEN-LAST:event_btn_inicioActionPerformed

    private void btn_videojuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_videojuegosActionPerformed
        ShowJPanel(new V_RenJuegos());
    }//GEN-LAST:event_btn_videojuegosActionPerformed

    private void btn_rentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_rentasActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        dispose();
        Login lg=new Login();
        lg.setVisible(true);
    }//GEN-LAST:event_btn_cerrarActionPerformed

    public static void main(String args[]) {
        FlatMaterialLighterIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appname;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_inicio;
    private javax.swing.JButton btn_rentas;
    private javax.swing.JButton btn_videojuegos;
    private static javax.swing.JPanel content;
    private javax.swing.JPanel header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lb_date;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}
