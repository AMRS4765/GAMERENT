package com.mycompany.vistas_cliente;

import com.mycompany.dao_implement.DAOjuegosImpl;
import com.mycompany.interfaces.DAOjuegos;
import com.mycompany.pantallas.Pantalla_Empleado;
import com.mycompany.vistas_cliente.V_UpRenJuegos;
import java.awt.Color;
import java.util.Arrays;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class V_RenJuegos extends javax.swing.JPanel {

    public V_RenJuegos() {
        initComponents();
        InitStyles();
        LoadGames();
    }
    
    private void InitStyles(){
        lb_titulo.putClientProperty("FlatLaf.styleClass", "h1");
        lb_titulo.setForeground(Color.black);       
        
        
        JTextField[] textFields = { txt_title, txt_gen };  // TextFields con mismo estilo

        // Aplicar el mismo estilo a todos los TextFields
        for (JTextField textField : textFields) {
            textField.setBackground(Color.WHITE);
            textField.setForeground(Color.BLACK);
        }
    }
    
    private void LoadGames(){
        try{
            DAOjuegos dao = new DAOjuegosImpl();
            DefaultTableModel model = (DefaultTableModel) tb_juegos.getModel();
            dao.listar("", "").forEach((u) -> model.addRow(new Object[]{u.getIdjuego(), u.getTitulo(), u.getDescripcion(), u.getPlataforma(), 
                u.getGenero(), u.getPrecio(), u.getStock(), u.getDisponible()}));
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        lb_titulo = new javax.swing.JLabel();
        txt_title = new javax.swing.JTextField();
        txt_gen = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        tabla = new javax.swing.JPanel();
        t_jue = new javax.swing.JScrollPane();
        tb_juegos = new javax.swing.JTable();
        botones = new javax.swing.JPanel();
        btn_rentar = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1102, 606));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        header.setBackground(new java.awt.Color(255, 255, 255));

        lb_titulo.setText("Videojuegos");

        txt_title.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Videojuego por Título", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP));

        txt_gen.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Videojuego por Genero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP));

        btn_buscar.setBackground(new java.awt.Color(29, 138, 201));
        btn_buscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar.setText("BUSCAR");
        btn_buscar.setBorder(null);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                        .addGap(718, 718, 718))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(txt_title)
                        .addGap(18, 18, 18)
                        .addComponent(txt_gen)
                        .addGap(35, 35, 35)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27))))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_title, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_gen, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        tabla.setBackground(new java.awt.Color(255, 255, 255));

        tb_juegos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título", "Descripción", "Plataforma", "Genero", "Precio", "Stock", "Disponibilidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_jue.setViewportView(tb_juegos);
        if (tb_juegos.getColumnModel().getColumnCount() > 0) {
            tb_juegos.getColumnModel().getColumn(0).setMaxWidth(40);
            tb_juegos.getColumnModel().getColumn(2).setPreferredWidth(250);
            tb_juegos.getColumnModel().getColumn(5).setPreferredWidth(60);
            tb_juegos.getColumnModel().getColumn(6).setPreferredWidth(50);
            tb_juegos.getColumnModel().getColumn(7).setPreferredWidth(50);
        }

        javax.swing.GroupLayout tablaLayout = new javax.swing.GroupLayout(tabla);
        tabla.setLayout(tablaLayout);
        tablaLayout.setHorizontalGroup(
            tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(t_jue)
                .addGap(8, 8, 8))
        );
        tablaLayout.setVerticalGroup(
            tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(t_jue, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
        );

        botones.setBackground(new java.awt.Color(255, 255, 255));

        btn_rentar.setBackground(new java.awt.Color(0, 204, 0));
        btn_rentar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_rentar.setForeground(new java.awt.Color(255, 255, 255));
        btn_rentar.setText("RENTAR VIDEOJUEGO");
        btn_rentar.setBorder(null);
        btn_rentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rentarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botonesLayout = new javax.swing.GroupLayout(botones);
        botones.setLayout(botonesLayout);
        botonesLayout.setHorizontalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_rentar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        botonesLayout.setVerticalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btn_rentar, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16))
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
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

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
//        try {
//            DAOjuegos dao = new DAOjuegosImpl();
//            DefaultTableModel model = (DefaultTableModel) tb_juegos.getModel();
//            model.setRowCount(0);
//
//            // Obtener valores de los TextFields
//            String title = txt_title.getText().trim();
//            String gen = txt_gen.getText().trim();
//
//            // Llamar al método listar con ambos parámetros
//            dao.listar(title, gen).forEach((u) -> model.addRow(new Object[]{u.getIdjuego(), u.getTitulo(), u.getDescripcion(), u.getPlataforma(), 
//                u.getGenero(), u.getPrecio(), u.getStock(), u.getDisponible()}));
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_rentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rentarActionPerformed
        Pantalla_Empleado.ShowJPanel(new V_UpRenJuegos());
    }//GEN-LAST:event_btn_rentarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel botones;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_rentar;
    private javax.swing.JPanel header;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JScrollPane t_jue;
    private javax.swing.JPanel tabla;
    private javax.swing.JTable tb_juegos;
    private javax.swing.JTextField txt_gen;
    private javax.swing.JTextField txt_title;
    // End of variables declaration//GEN-END:variables
}
