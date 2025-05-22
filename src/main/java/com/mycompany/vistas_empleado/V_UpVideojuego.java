package com.mycompany.vistas_empleado;

import com.mycompany.dao_implement.DAOjuegosImpl;
import com.mycompany.interfaces.DAOjuegos;
import com.mycompany.models.juegos;
import com.mycompany.pantallas.Pantalla_Empleado;
import java.awt.Color;
import java.math.BigDecimal;

public class V_UpVideojuego extends javax.swing.JPanel {
    
    boolean isEdition = false;
    juegos gameEdition;
    
    public V_UpVideojuego() {
        initComponents();
        InitStyles();
    }
    
    public V_UpVideojuego(juegos juego) {
        initComponents();
        isEdition = true;
        gameEdition = juego;
        InitStyles();
    }
    
    private void InitStyles() {
        title.putClientProperty("FlatLaf.styleClass", "h1");
        title.setForeground(Color.black);
        txt_titulo.putClientProperty("JTextField.placeholderText", "Ingrese el nombre del nuevo videojuego.");
        txt_desc.putClientProperty("JTextField.placeholderText", "Ingrese una descripción del nuevo videojuego.");
        txt_plat.putClientProperty("JTextField.placeholderText", "Ingrese la plataforma del nuevo videojuego.");
        txt_gen.putClientProperty("JTextField.placeholderText", "Ingrese el genero del nuevo videojuego.");
        txt_precio.putClientProperty("JTextField.placeholderText", "Ingrese el precio que tendrá el nuevo videojuego.");
        txt_stock.putClientProperty("JTextField.placeholderText", "Ingrese la cantidad de stock del nuevo videojuego.");
        txt_disp.putClientProperty("JTextField.placeholderText", "Si no se ha rentado, ingrese la misma cantidad que el campo Stock");
        
        if(isEdition){
            title.setText("Editar Cliente");
            btn_registrar.setText("GUARDAR");
            
            if(gameEdition != null){
                txt_titulo.setText(gameEdition.getTitulo());
                txt_desc.setText(gameEdition.getDescripcion());
                txt_plat.setText(gameEdition.getPlataforma());
                txt_gen.setText(gameEdition.getGenero());
                txt_precio.setText(gameEdition.getPrecio().toString());
                txt_stock.setText(String.valueOf(gameEdition.getStock()));
                txt_disp.setText(String.valueOf(gameEdition.getDisponible()));
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        lb_titulo = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        lb_desc = new javax.swing.JLabel();
        txt_desc = new javax.swing.JTextField();
        lb_plat = new javax.swing.JLabel();
        txt_plat = new javax.swing.JTextField();
        lb_gen = new javax.swing.JLabel();
        txt_gen = new javax.swing.JTextField();
        lb_precio = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        lb_stock = new javax.swing.JLabel();
        txt_stock = new javax.swing.JTextField();
        lb_disp = new javax.swing.JLabel();
        txt_disp = new javax.swing.JTextField();
        btn_regresar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setMinimumSize(new java.awt.Dimension(1102, 606));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        title.setText("Registrar Nuevo Videojuego");

        lb_titulo.setText("Título");

        lb_desc.setText("Descripción");

        lb_plat.setText("Plataforma");

        lb_gen.setText("Genero");

        lb_precio.setText("Precio");

        lb_stock.setText("Stock");

        lb_disp.setText("Disponibles");

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

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                                .addGap(293, 293, 293))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(btn_regresar, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                                .addGap(146, 146, 146)
                                .addComponent(btn_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)))
                        .addGap(43, 43, 43))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(lb_gen, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                .addGap(919, 919, 919))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(txt_gen, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
                                .addGap(3, 3, 3))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                                    .addComponent(txt_desc, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                                    .addComponent(txt_plat, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(lb_plat, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                        .addGap(352, 352, 352))
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(lb_desc, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                        .addGap(370, 370, 370))
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                        .addGap(390, 390, 390)))
                                .addGap(145, 145, 145)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(lb_disp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(340, 340, 340))
                                    .addComponent(txt_disp)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(lb_precio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(401, 401, 401))
                                    .addComponent(txt_precio)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(lb_stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(390, 390, 390))
                                    .addComponent(txt_stock))))
                        .addGap(44, 44, 44))))
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bgLayout.createSequentialGroup()
                    .addGap(545, 545, 545)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
                    .addGap(545, 545, 545)))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lb_precio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_precio, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txt_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lb_stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lb_desc, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_stock, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txt_desc, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_disp, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(lb_plat, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_disp, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txt_plat, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lb_gen, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(txt_gen, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(53, 53, 53)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(btn_regresar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(btn_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(68, 68, 68))
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bgLayout.createSequentialGroup()
                    .addGap(99, 99, 99)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addGap(254, 254, 254)))
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
        Pantalla_Empleado.ShowJPanel(new V_Videojuegos());
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        String title = txt_titulo.getText();
        String desc = txt_desc.getText();
        String plat = txt_plat.getText();
        String gen = txt_gen.getText();
        String prec = txt_precio.getText();
        String stock = txt_stock.getText();
        String disp = txt_disp.getText();
        
        // Validaciones para los campos
        if (title.isEmpty() || desc.isEmpty() || plat.isEmpty() || gen.isEmpty() || prec.isEmpty() || stock.isEmpty() || disp.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            txt_titulo.requestFocus();
            return;
        }
        
        juegos juego = isEdition ? gameEdition : new juegos();
        juego.setTitulo(title);
        juego.setDescripcion(desc);
        juego.setPlataforma(plat);
        juego.setGenero(gen);
        juego.setPrecio(new BigDecimal(prec));
        juego.setStock(Integer.parseInt(stock));
        juego.setDisponible(Integer.parseInt(disp));

        try {
            DAOjuegos dao = new DAOjuegosImpl();
            
            if (!isEdition){
                dao.registrar(juego); // Registra los datos de los TextFields en la BD
            } else {
                dao.modificar(juego);
            }
            
            String successMsg = isEdition ? "modificado" : "registrado";
            javax.swing.JOptionPane.showMessageDialog(this, "Videojuego " + successMsg + " exitosamente. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE); // Mensaje de confirmación
            
            if (!isEdition){
                // Luego borra los datos de los TextFields
                txt_titulo.setText("");
                txt_desc.setText("");
                txt_plat.setText("");
                txt_gen.setText("");
                txt_precio.setText("");
                txt_stock.setText("");
                txt_disp.setText("");
            }
            
        } catch (Exception e){
            String errorMsg = isEdition ? "modificar" : "registrar";
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al " + errorMsg + " el videojuego. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_registrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_desc;
    private javax.swing.JLabel lb_disp;
    private javax.swing.JLabel lb_gen;
    private javax.swing.JLabel lb_plat;
    private javax.swing.JLabel lb_precio;
    private javax.swing.JLabel lb_stock;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txt_desc;
    private javax.swing.JTextField txt_disp;
    private javax.swing.JTextField txt_gen;
    private javax.swing.JTextField txt_plat;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_stock;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}
