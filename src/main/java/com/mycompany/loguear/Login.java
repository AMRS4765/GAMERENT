package com.mycompany.loguear;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import com.mycompany.db.DBConnection;
import com.mycompany.pantallas.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        initCenter();
        initNoStyleLogin();
        getRootPane().setDefaultButton(btn_entrar);
    }
    
    private void initCenter(){
        pack();
        setLocationRelativeTo(null);
    }
    
    private void initNoStyleLogin(){
        lb_iniciarsesion.setForeground(Color.BLACK);
        lb_usuario.setForeground(new Color(153, 153, 153));
        txt_usuario.setBackground(Color.WHITE);
        lb_contraseña.setForeground(new Color(153, 153, 153));
        txt_contraseña.setBackground(Color.WHITE);
        btn_entrar.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        form = new javax.swing.JPanel();
        lb_iniciarsesion = new javax.swing.JLabel();
        lb_usuario = new javax.swing.JLabel();
        icon_user = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        separador1 = new javax.swing.JSeparator();
        lb_contraseña = new javax.swing.JLabel();
        txt_contraseña = new javax.swing.JPasswordField();
        separador2 = new javax.swing.JSeparator();
        icon_password = new javax.swing.JLabel();
        btn_entrar = new javax.swing.JButton();
        img = new javax.swing.JPanel();
        imgLogo = new javax.swing.JLabel();
        lb_gamerent = new javax.swing.JLabel();
        imgCitybg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 560));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        form.setBackground(new java.awt.Color(255, 255, 255));

        lb_iniciarsesion.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        lb_iniciarsesion.setText("INICIAR SESIÓN");

        lb_usuario.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lb_usuario.setForeground(new java.awt.Color(153, 153, 153));
        lb_usuario.setText("USUARIO");

        icon_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/avatar.png"))); // NOI18N

        txt_usuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(204, 204, 204));
        txt_usuario.setText("Ingrese su nombre de usuario");
        txt_usuario.setBorder(null);
        txt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_usuarioMousePressed(evt);
            }
        });

        lb_contraseña.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lb_contraseña.setForeground(new java.awt.Color(153, 153, 153));
        lb_contraseña.setText("CONTRASEÑA");

        txt_contraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_contraseña.setForeground(new java.awt.Color(204, 204, 204));
        txt_contraseña.setText("********");
        txt_contraseña.setBorder(null);
        txt_contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_contraseñaMousePressed(evt);
            }
        });

        icon_password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bloquear.png"))); // NOI18N

        btn_entrar.setBackground(new java.awt.Color(0, 134, 190));
        btn_entrar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_entrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_entrar.setText("ENTRAR");
        btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(btn_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(formLayout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lb_iniciarsesion)
                        .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_usuario)
                        .addComponent(lb_contraseña)
                        .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(formLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(formLayout.createSequentialGroup()
                                    .addComponent(icon_user)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(formLayout.createSequentialGroup()
                                    .addComponent(icon_password)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(53, Short.MAX_VALUE)))
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                .addContainerGap(441, Short.MAX_VALUE)
                .addComponent(btn_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(formLayout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(lb_iniciarsesion)
                    .addGap(44, 44, 44)
                    .addComponent(lb_usuario)
                    .addGap(18, 18, 18)
                    .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(icon_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_contraseña)
                    .addGap(18, 18, 18)
                    .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(icon_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(175, 175, 175)))
        );

        img.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoprueba.png"))); // NOI18N
        img.add(imgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 360, 140));

        lb_gamerent.setBackground(new java.awt.Color(255, 255, 255));
        lb_gamerent.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        lb_gamerent.setForeground(new java.awt.Color(255, 255, 255));
        lb_gamerent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_gamerent.setText("GAMERENT");
        img.add(lb_gamerent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 360, 60));

        imgCitybg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCitybg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/City at night.jpeg"))); // NOI18N
        img.add(imgCitybg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 359, 560));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMousePressed
        if (txt_usuario.getText().equals("Ingrese su nombre de usuario")){
            txt_usuario.setText("");
            txt_usuario.setForeground(Color.black);
        }
        if(String.valueOf(txt_contraseña.getPassword()).isEmpty()){
            txt_contraseña.setText("********");
            txt_contraseña.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txt_usuarioMousePressed

    private void txt_contraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_contraseñaMousePressed
        if(String.valueOf(txt_contraseña.getPassword()).equals("********")){
            txt_contraseña.setText("");
            txt_contraseña.setForeground(Color.black);
        }
        if (txt_usuario.getText().isEmpty()){
            txt_usuario.setText("Ingrese su nombre de usuario");
            txt_usuario.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txt_contraseñaMousePressed

    private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed
        String user = txt_usuario.getText().trim();
        String password = String.valueOf(txt_contraseña.getPassword()).trim();

        try {
            DBConnection dbConnection = DBConnection.getInstance();
            Connection connection = dbConnection.getConnection();
            

            // 1. Buscar en empleados
            PreparedStatement stmtEmpleado = connection.prepareStatement("""
                SELECT user, pass FROM empleados
                WHERE user = ? AND pass = ?
            """);
            stmtEmpleado.setString(1, user);
            stmtEmpleado.setString(2, password);
            ResultSet rsEmpleado = stmtEmpleado.executeQuery();

            if (rsEmpleado.next()) {
                dispose(); // Cierra pantalla logindispose();
                Pantalla_Empleado pe = new Pantalla_Empleado();
                pe.setVisible(true);
                pe.setLocationRelativeTo(null);

            } else {
                // 2. Si no es empleado, buscar en clientes
                PreparedStatement stmtCliente = connection.prepareStatement("""
                    SELECT user, pass FROM clientes
                    WHERE user = ? AND pass = ?
                """);
                stmtCliente.setString(1, user);
                stmtCliente.setString(2, password);
                ResultSet rsCliente = stmtCliente.executeQuery();

                if (rsCliente.next()) {
                    dispose(); // Cierra pantalla logindispose();
                    Pantalla_Cliente pc = new Pantalla_Cliente();
                    pc.setVisible(true);
                    pc.setLocationRelativeTo(null);

                } else {
                    JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.");
                }

                rsCliente.close();
                stmtCliente.close();
            }

            rsEmpleado.close();
            stmtEmpleado.close();

        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la Base de Datos\n" + e);
        }
    }//GEN-LAST:event_btn_entrarActionPerformed

    
    public static void main(String args[]) {
        FlatMaterialLighterIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btn_entrar;
    private javax.swing.JPanel form;
    private javax.swing.JLabel icon_password;
    private javax.swing.JLabel icon_user;
    private javax.swing.JPanel img;
    private javax.swing.JLabel imgCitybg;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel lb_contraseña;
    private javax.swing.JLabel lb_gamerent;
    private javax.swing.JLabel lb_iniciarsesion;
    private javax.swing.JLabel lb_usuario;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JPasswordField txt_contraseña;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
