package com.mycompany.vistas_empleado;

import com.mycompany.dao_implement.DAOclientesImpl;
import com.mycompany.interfaces.DAOclientes;
import com.mycompany.models.clientes;
import com.mycompany.pantallas.Pantalla_Empleado;
import java.awt.Color;

public class V_UpCliente extends javax.swing.JPanel {
    
    boolean isEdition = false;
    clientes cliEdition;
    
    public V_UpCliente() {
        initComponents();
        InitStyles();
    }
    
    public V_UpCliente(clientes cliente) {
        initComponents();
        isEdition = true;
        cliEdition = cliente;
        InitStyles();
    }
    
    private void InitStyles() {
        title.putClientProperty("FlatLaf.styleClass", "h1");
        title.setForeground(Color.black);
        txt_user.putClientProperty("JTextField.placeholderText", "Ingrese el usuario para poder ingresar sesión.");
        txt_pass.putClientProperty("JTextField.placeholderText", "Ingrese la contraseña para poder ingresar sesión.");
        txt_nombre.putClientProperty("JTextField.placeholderText", "Ingrese el nombre del nuevo cliente.");
        txt_ap.putClientProperty("JTextField.placeholderText", "Ingrese el apellido paterno del nuevo cliente.");
        txt_am.putClientProperty("JTextField.placeholderText", "Ingrese el apellido materno del nuevo cliente.");
        txt_calle.putClientProperty("JTextField.placeholderText", "Ingrese la calle del nuevo cliente.");
        txt_num.putClientProperty("JTextField.placeholderText", "Ingrese el número de casa del nuevo cliente.");
        txt_tel.putClientProperty("JTextField.placeholderText", "Ingrese el teléfono del nuevo cliente.");
        
        if(isEdition){
            title.setText("Editar Cliente");
            btn_registrar.setText("GUARDAR");
            
            if(cliEdition != null){
                txt_user.setText(cliEdition.getUser());
                txt_pass.setText(cliEdition.getPass());
                txt_nombre.setText(cliEdition.getNombres());
                txt_ap.setText(cliEdition.getApellido_p());
                txt_am.setText(cliEdition.getApellido_m());
                txt_calle.setText(cliEdition.getCalle());
                txt_num.setText(String.valueOf(cliEdition.getNum_casa()));
                txt_tel.setText(cliEdition.getTel());
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        lb_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        lb_ap = new javax.swing.JLabel();
        txt_ap = new javax.swing.JTextField();
        lb_am = new javax.swing.JLabel();
        txt_am = new javax.swing.JTextField();
        lb_calle = new javax.swing.JLabel();
        txt_calle = new javax.swing.JTextField();
        lb_num = new javax.swing.JLabel();
        txt_num = new javax.swing.JTextField();
        lb_tel = new javax.swing.JLabel();
        txt_tel = new javax.swing.JTextField();
        btn_regresar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        lb_user = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        lb_pass = new javax.swing.JLabel();
        txt_pass = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setMinimumSize(new java.awt.Dimension(1102, 606));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        title.setText("Registrar Nuevo Cliente");

        lb_nombre.setText("Nombre");

        lb_ap.setText("Apellido Paterno");

        lb_am.setText("Apellido Materno");

        lb_calle.setText("Calle");

        lb_num.setText("Número de Casa");

        lb_tel.setText("Telefono");

        btn_regresar.setBackground(new java.awt.Color(255, 51, 51));
        btn_regresar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_regresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_regresar.setText("REGRESAR");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        btn_registrar.setBackground(new java.awt.Color(0, 153, 204));
        btn_registrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("REGISTRAR");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        lb_user.setText("Usuario");

        lb_pass.setText("Contraseña");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                        .addGap(289, 289, 289))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(btn_regresar, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                        .addGap(150, 150, 150)
                        .addComponent(btn_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombre)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(lb_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(381, 381, 381))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(lb_ap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(340, 340, 340))
                            .addComponent(txt_ap)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(lb_pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(370, 370, 370))
                            .addComponent(txt_pass)
                            .addComponent(txt_user)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(lb_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(390, 390, 390)))
                        .addGap(70, 70, 70)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(68, 68, 68)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(lb_calle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(404, 404, 404))
                            .addComponent(txt_calle)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(lb_num, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(285, 285, 285))
                            .addComponent(txt_num)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(lb_tel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(340, 340, 340))
                            .addComponent(txt_am)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(lb_am, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(338, 338, 338))
                            .addComponent(txt_tel))))
                .addGap(52, 52, 52))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(47, 47, 47)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(lb_am, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                                .addGap(3, 3, 3)
                                .addComponent(txt_am, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                .addGap(30, 30, 30)
                                .addComponent(lb_calle, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                                .addGap(6, 6, 6)
                                .addComponent(txt_calle, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(lb_user, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                                .addGap(3, 3, 3)
                                .addComponent(txt_user, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                .addGap(30, 30, 30)
                                .addComponent(lb_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                                .addGap(6, 6, 6)
                                .addComponent(txt_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
                        .addGap(34, 34, 34)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(lb_num, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6)
                                .addComponent(txt_num, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                .addGap(29, 29, 29)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(lb_ap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(6, 6, 6)
                                        .addComponent(txt_ap, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                        .addGap(60, 60, 60))
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(lb_tel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_tel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                        .addGap(58, 58, 58)))
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_regresar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(btn_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(lb_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                .addGap(211, 211, 211))))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(90, 90, 90)))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        Pantalla_Empleado.ShowJPanel(new V_Clientes());
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        String user = txt_user.getText();
        String pass = txt_pass.getText();
        String name = txt_nombre.getText();
        String ap = txt_ap.getText();
        String am = txt_am.getText();
        String calle = txt_calle.getText();
        String num = txt_num.getText();
        String tel = txt_tel.getText();
        
        // Validaciones para los campos
        if (user.isEmpty() || pass.isEmpty() || name.isEmpty() || ap.isEmpty() || am.isEmpty() || calle.isEmpty() || num.isEmpty() || tel.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            txt_user.requestFocus();
            return;
        }
        
        clientes cliente = isEdition ? cliEdition : new clientes();
        cliente.setUser(user);
        cliente.setPass(pass);
        cliente.setNombres(name);
        cliente.setApellido_p(ap);
        cliente.setApellido_m(am);
        cliente.setCalle(calle);
        cliente.setNum_casa(Integer.parseInt(num));
        cliente.setTel(tel);
        

        try {
            DAOclientes dao = new DAOclientesImpl();
            
            if (!isEdition){
                dao.registrar(cliente); // Registra los datos de los TextFields en la BD
            } else {
                dao.modificar(cliente);
            }
            
            String successMsg = isEdition ? "modificado" : "registrado";
            javax.swing.JOptionPane.showMessageDialog(this, "Cliente " + successMsg + " exitosamente. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE); // Mensaje de confirmación
            
            if (!isEdition){
                // Luego borra los datos de los TextFields
                txt_user.setText("");
                txt_pass.setText("");
                txt_nombre.setText("");
                txt_ap.setText("");
                txt_am.setText("");
                txt_calle.setText("");
                txt_num.setText("");
                txt_tel.setText("");
            }
            
        } catch (Exception e){
            String errorMsg = isEdition ? "modificar" : "registrar";
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al " + errorMsg + " al cliente. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_registrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_am;
    private javax.swing.JLabel lb_ap;
    private javax.swing.JLabel lb_calle;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_num;
    private javax.swing.JLabel lb_pass;
    private javax.swing.JLabel lb_tel;
    private javax.swing.JLabel lb_user;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txt_am;
    private javax.swing.JTextField txt_ap;
    private javax.swing.JTextField txt_calle;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_num;
    private javax.swing.JTextField txt_pass;
    private javax.swing.JTextField txt_tel;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
