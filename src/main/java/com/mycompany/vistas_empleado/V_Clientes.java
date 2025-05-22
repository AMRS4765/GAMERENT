package com.mycompany.vistas_empleado;

import com.mycompany.dao_implement.DAOclientesImpl;
import com.mycompany.interfaces.DAOclientes;
import com.mycompany.pantallas.Pantalla_Empleado;
import java.awt.Color;
import java.util.Arrays;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class V_Clientes extends javax.swing.JPanel {

    public V_Clientes() {
        initComponents();
        InitStyles();
        LoadClientes();
    }
    
    private void InitStyles(){
        lb_titulo.putClientProperty("FlatLaf.styleClass", "h1");
        lb_titulo.setForeground(Color.black);       
        
        
        JTextField[] textFields = { txt_num, txt_nombre };  // TextFields con mismo estilo

        // Aplicar el mismo estilo a todos los TextFields
        for (JTextField textField : textFields) {
            textField.setBackground(Color.WHITE);
            textField.setForeground(Color.BLACK);
        }
    }
    
    private void LoadClientes(){
        try{
            DAOclientes dao = new DAOclientesImpl();
            DefaultTableModel model = (DefaultTableModel) tb_clientes.getModel();
            dao.listar("", "").forEach((u) -> model.addRow(new Object[]{u.getIdcliente(), u.getUser(), u.getPass(), u.getNombres(), 
                u.getApellido_p(), u.getApellido_m(), u.getCalle(), u.getNum_casa(), u.getTel(), u.getSancion(), u.getSanc_money()}));
            
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
        txt_num = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        tabla = new javax.swing.JPanel();
        t_cli = new javax.swing.JScrollPane();
        tb_clientes = new javax.swing.JTable();
        botones = new javax.swing.JPanel();
        btn_nuevo = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1102, 606));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        header.setBackground(new java.awt.Color(255, 255, 255));

        lb_titulo.setText("Clientes");

        txt_num.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Cliente por ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP));

        txt_nombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Cliente por Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP));

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
                        .addComponent(txt_num)
                        .addGap(18, 18, 18)
                        .addComponent(txt_nombre)
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
                    .addComponent(txt_num, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        tabla.setBackground(new java.awt.Color(255, 255, 255));

        tb_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "User", "Password", "Nombre(s)", "Primer Apellido", "Segundo Apellido", "Calle", "Num Casa", "Telefono", "Sanciones", "Dinero de Sanción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_cli.setViewportView(tb_clientes);
        if (tb_clientes.getColumnModel().getColumnCount() > 0) {
            tb_clientes.getColumnModel().getColumn(0).setMaxWidth(25);
        }

        javax.swing.GroupLayout tablaLayout = new javax.swing.GroupLayout(tabla);
        tabla.setLayout(tablaLayout);
        tablaLayout.setHorizontalGroup(
            tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(t_cli)
                .addGap(8, 8, 8))
        );
        tablaLayout.setVerticalGroup(
            tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(t_cli, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
        );

        botones.setBackground(new java.awt.Color(255, 255, 255));

        btn_nuevo.setBackground(new java.awt.Color(0, 204, 0));
        btn_nuevo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_nuevo.setForeground(new java.awt.Color(255, 255, 255));
        btn_nuevo.setText("NUEVO CLIENTE");
        btn_nuevo.setBorder(null);
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_editar.setBackground(new java.awt.Color(204, 153, 0));
        btn_editar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setText("EDITAR CLIENTE");
        btn_editar.setBorder(null);
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_borrar.setBackground(new java.awt.Color(204, 0, 51));
        btn_borrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_borrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_borrar.setText("ELIMINAR CLIENTE");
        btn_borrar.setBorder(null);
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botonesLayout = new javax.swing.GroupLayout(botones);
        botones.setLayout(botonesLayout);
        botonesLayout.setHorizontalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(btn_editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addComponent(btn_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonesLayout.setVerticalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
        try {
            DAOclientes dao = new DAOclientesImpl();
            DefaultTableModel model = (DefaultTableModel) tb_clientes.getModel();
            model.setRowCount(0);

            // Obtener valores de los TextFields
            String name = txt_nombre.getText().trim();
            String num = txt_num.getText().isEmpty() ? "" : txt_num.getText().trim();

            // Llamar al método listar con ambos parámetros
            dao.listar(name, num).forEach((u) -> model.addRow(new Object[]{u.getIdcliente(), u.getUser(), u.getPass(), u.getNombres(), 
                u.getApellido_p(), u.getApellido_m(), u.getCalle(), u.getNum_casa(), u.getTel(), u.getSancion(), u.getSanc_money()}));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        if (tb_clientes.getSelectedRow() > -1){
            try{
                int userId = (int) tb_clientes.getValueAt(tb_clientes.getSelectedRow(), 0);
                System.out.println("ClienteId " +userId);
                DAOclientes dao = new DAOclientesImpl();
                Pantalla_Empleado.ShowJPanel(new V_UpCliente(dao.getUserById(userId)));
                
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            
        } else{
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el cliente que desea editar. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        DAOclientes dao = new DAOclientesImpl();
        DefaultTableModel model = (DefaultTableModel) tb_clientes.getModel();

        int[] selectedRows = tb_clientes.getSelectedRows();

        // Ordenar los índices en orden descendente
        Arrays.sort(selectedRows);
        if (tb_clientes.getSelectedRows().length < 1){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar de la tabla el cliente que desea eliminar. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i = selectedRows.length - 1; i >= 0; i--) {
                int rowIndex = selectedRows[i];  
                try {
                    dao.eliminar((int) tb_clientes.getValueAt(rowIndex, 0)); // Eliminar datos en BD
                    model.removeRow(rowIndex); // Eliminar datos de la tabla sin afectar índices aún no procesados
                } catch(Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        Pantalla_Empleado.ShowJPanel(new V_UpCliente());
    }//GEN-LAST:event_btn_nuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel botones;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JPanel header;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JScrollPane t_cli;
    private javax.swing.JPanel tabla;
    private javax.swing.JTable tb_clientes;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_num;
    // End of variables declaration//GEN-END:variables
}
