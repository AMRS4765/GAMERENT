package com.mycompany.vistas_empleado;

import com.mycompany.dao_implement.DAOempleadosImpl;
import com.mycompany.interfaces.DAOempleados;
import com.mycompany.models.empleados;
import com.mycompany.pantallas.Pantalla_Empleado;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.math.BigDecimal;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.KeyStroke;


public class V_UpEmpleado extends javax.swing.JPanel {
    
    boolean isEdition = false;
    empleados empEdition;
    
    public V_UpEmpleado() {
        initComponents();
        InitStyles(); 
    }
    
    public V_UpEmpleado(empleados empleado) {
        initComponents();
        isEdition = true;
        empEdition = empleado;
        InitStyles();
    }
    
    private void InitStyles() {
        title.putClientProperty("FlatLaf.styleClass", "h1");
        title.setForeground(Color.black);
        txt_user.putClientProperty("JTextField.placeholderText", "Ingrese el usuario para poder ingresar sesión.");
        txt_pass.putClientProperty("JTextField.placeholderText", "Ingrese la contraseña para poder ingresar sesión.");
        txt_nombre.putClientProperty("JTextField.placeholderText", "Ingrese el nombre del nuevo empleado.");
        txt_ap.putClientProperty("JTextField.placeholderText", "Ingrese el apellido paterno del nuevo empleado.");
        txt_am.putClientProperty("JTextField.placeholderText", "Ingrese el apellido materno del nuevo empleado.");
        txt_tel.putClientProperty("JTextField.placeholderText", "Ingrese el teléfono del nuevo empleado.");
        txt_salario.putClientProperty("JTextField.placeholderText", "Ingrese el salario del nuevo empleado.");
        txt_calle.putClientProperty("JTextField.placeholderText", "Ingrese la calle del nuevo empleado.");
        txt_num.putClientProperty("JTextField.placeholderText", "Ingrese el número de casa del nuevo empleado.");
                
        if(isEdition){
            title.setText("Editar Empleado");
            btn_registrar.setText("GUARDAR");
            
            if(empEdition != null){
                txt_user.setText(empEdition.getUser());
                txt_pass.setText(empEdition.getPass());
                txt_nombre.setText(empEdition.getNombres());
                txt_ap.setText(empEdition.getApellido_p());
                txt_am.setText(empEdition.getApellido_m());
                txt_tel.setText(empEdition.getTel());
                txt_salario.setText(empEdition.getSalario().toString());
                txt_calle.setText(empEdition.getCalle());
                txt_num.setText(String.valueOf(empEdition.getNum_casa()));
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        lb_user = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        lb_pass = new javax.swing.JLabel();
        txt_pass = new javax.swing.JTextField();
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
        btn_registrar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        txt_salario = new javax.swing.JTextField();
        lb_salario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setMinimumSize(new java.awt.Dimension(1102, 606));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        title.setText("Registrar Nuevo Empleado");

        lb_user.setText("Usuario");

        lb_pass.setText("Contraseña");

        lb_nombre.setText("Nombre (s)");

        lb_ap.setText("Primer Apellido");

        lb_am.setText("Segundo Apellido");

        lb_calle.setText("Calle");

        lb_num.setText("Número de Casa");

        lb_tel.setText("Telefono");

        btn_registrar.setBackground(new java.awt.Color(0, 153, 204));
        btn_registrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("REGISTRAR");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_regresar.setBackground(new java.awt.Color(255, 51, 51));
        btn_regresar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_regresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_regresar.setText("REGRESAR");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        lb_salario.setText("Salario");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(343, 343, 343))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(lb_user, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                .addGap(390, 390, 390))
                            .addComponent(txt_user)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(lb_pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(370, 370, 370))
                            .addComponent(txt_pass)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lb_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(350, 350, 350))
                            .addComponent(txt_nombre)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(lb_ap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(340, 340, 340))
                            .addComponent(txt_ap))
                        .addGap(77, 77, 77)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
                        .addGap(53, 53, 53)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(lb_am, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(340, 340, 340))
                            .addComponent(txt_am)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(lb_calle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(390, 390, 390))
                            .addComponent(txt_calle)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(lb_num, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(312, 312, 312))
                            .addComponent(txt_num)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(lb_tel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(381, 381, 381))
                            .addComponent(txt_tel))
                        .addGap(54, 54, 54))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(lb_salario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(970, 970, 970))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(btn_regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(140, 140, 140)
                                .addComponent(btn_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txt_salario))
                        .addGap(54, 54, 54))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lb_user, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addGap(3, 3, 3)
                        .addComponent(txt_user, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(txt_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addGap(3, 3, 3)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_ap, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(txt_ap, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addGap(33, 33, 33))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(lb_am, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(txt_am)
                        .addGap(18, 18, 18)
                        .addComponent(lb_calle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)
                        .addComponent(txt_calle)
                        .addGap(18, 18, 18)
                        .addComponent(lb_num, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(txt_num)
                        .addGap(18, 18, 18)
                        .addComponent(lb_tel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(txt_tel)
                        .addGap(41, 41, 41))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(lb_salario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(txt_salario, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(btn_regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(btn_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
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
        Pantalla_Empleado.ShowJPanel(new V_Empleados());
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        String user = txt_user.getText();
        String pass = txt_pass.getText();
        String name = txt_nombre.getText();
        String ap = txt_ap.getText();
        String am = txt_am.getText();
        String tel = txt_tel.getText();
        String sal = txt_salario.getText();
        String calle = txt_calle.getText();
        String num = txt_num.getText();
        
        // Validaciones para los campos
        if (user.isEmpty() || pass.isEmpty() || name.isEmpty() || ap.isEmpty() || am.isEmpty() || tel.isEmpty() || sal.isEmpty() || calle.isEmpty() || num.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            txt_user.requestFocus();
            return;
        }
        
        empleados empleado = isEdition ? empEdition : new empleados();
        empleado.setUser(user);
        empleado.setPass(pass);
        empleado.setNombres(name);
        empleado.setApellido_p(ap);
        empleado.setApellido_m(am);
        empleado.setTel(tel);
        empleado.setSalario(new BigDecimal(sal));
        empleado.setCalle(calle);
        empleado.setNum_casa(Integer.parseInt(num));

        try {
            DAOempleados dao = new DAOempleadosImpl();
            
            if (!isEdition){
                dao.registrar(empleado); // Registra los datos de los TextFields en la BD
            } else {
                dao.modificar(empleado);
            }
            
            String successMsg = isEdition ? "modificado" : "registrado";
            javax.swing.JOptionPane.showMessageDialog(this, "Empleado " + successMsg + " exitosamente. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE); // Mensaje de confirmación
            
            if (!isEdition){
                // Luego borra los datos de los TextFields
                txt_user.setText("");
                txt_pass.setText("");
                txt_nombre.setText("");
                txt_ap.setText("");
                txt_am.setText("");
                txt_tel.setText("");
                txt_salario.setText("");
                txt_calle.setText("");
                txt_num.setText("");
            }
            
        } catch (Exception e){
            String errorMsg = isEdition ? "modificar" : "registrar";
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al " + errorMsg + " al empleado. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JLabel lb_salario;
    private javax.swing.JLabel lb_tel;
    private javax.swing.JLabel lb_user;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txt_am;
    private javax.swing.JTextField txt_ap;
    private javax.swing.JTextField txt_calle;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_num;
    private javax.swing.JTextField txt_pass;
    private javax.swing.JTextField txt_salario;
    private javax.swing.JTextField txt_tel;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
