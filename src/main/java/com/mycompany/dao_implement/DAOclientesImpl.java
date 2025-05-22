package com.mycompany.dao_implement;

import com.mycompany.db.DBConnection;
import com.mycompany.interfaces.DAOclientes;
import com.mycompany.models.clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DAOclientesImpl implements DAOclientes {
    
    private Connection connection;
    
    @Override
    public void registrar(clientes cliente) throws Exception {
        try{
            this.connection = DBConnection.getInstance().getConnection(); // Permite que nos conectemos a la bd aunque sea privada
            PreparedStatement st = this.connection.prepareStatement("INSERT INTO clientes(user, pass, nombres, apellido_p, apellido_m, calle, num_casa, tel) VALUES(?,?,?,?,?,?,?,?);");
            st.setString(1, cliente.getUser());
            st.setString(2, cliente.getPass());
            st.setString(3, cliente.getNombres());
            st.setString(4, cliente.getApellido_p());
            st.setString(5, cliente.getApellido_m());
            st.setString(6, cliente.getCalle());
            st.setInt(7, cliente.getNum_casa());
            st.setString(8, cliente.getTel());
            
            st.executeUpdate();
            st.close();
            
        } catch(Exception e){
            e.printStackTrace(); // Esto imprimirá el error en la consola
            throw new Exception("Error al registrar el cliente: " + e.getMessage(), e);
            
        } finally{
            DBConnection.getInstance().closeConnection(); // Llamar a closeConnection desde la instancia de DBConnection
        }
    }

    @Override
    public void modificar(clientes cliente) throws Exception {
        PreparedStatement st = null;

        try {
            this.connection = DBConnection.getInstance().getConnection();

            // Realizar la actualización usando el campo `id`
            st = this.connection.prepareStatement(
                "UPDATE clientes SET user = ?, pass = ?, nombres = ?, apellido_p = ?, apellido_m = ?, calle = ?, num_casa = ?, tel = ? WHERE idcliente = ?;");
            st.setString(1, cliente.getUser());
            st.setString(2, cliente.getPass());
            st.setString(3, cliente.getNombres());
            st.setString(4, cliente.getApellido_p());
            st.setString(5, cliente.getApellido_m());
            st.setString(6, cliente.getCalle());
            st.setInt(7, cliente.getNum_casa());
            st.setString(8, cliente.getTel());
            st.setInt(9, cliente.getIdcliente());

            st.executeUpdate();
            st.close();

        } catch(Exception e) {
            throw new Exception("Error al modificar el registro: " + e.getMessage());
            
        } finally {
            if (st != null) st.close();
            if (this.connection != null) this.connection.close();
        }
    }

    @Override
    public void sancionar(clientes cliente) throws Exception {
        try {
            this.connection = DBConnection.getInstance().getConnection(); // Permite que nos conectemos a la bd aunque sea privada
            PreparedStatement st = this.connection.prepareStatement("UPDATE clientes SET sancion = ?, sanc_money = ? WHERE idcliente = ?");
            st.setInt(1, cliente.getSancion());
            st.setBigDecimal(2, cliente.getSanc_money());
            st.setInt(3, cliente.getIdcliente());
            st.executeUpdate();
            st.close();
            
        } catch(Exception e) {
            throw e;
        } finally {
            DBConnection.getInstance().closeConnection();
        }
    }

    @Override
    public void eliminar(int idcliente) throws Exception {
        this.connection = DBConnection.getInstance().getConnection(); // Permite que nos conectemos a la bd aunque sea privada
        
        LocalDate date = LocalDate.now();
        PreparedStatement st = this.connection.prepareStatement("DELETE FROM clientes WHERE idcliente = ?;");        
        st.setInt(1, idcliente);
        
        st.executeUpdate();
        st.close();
    }

    @Override
    public List<clientes> listar(String nombres, String idcliente) throws Exception {
        List<clientes> lista = new ArrayList<>();
        PreparedStatement st;

        try {
            this.connection = DBConnection.getInstance().getConnection();

            // Construcción dinámica de la consulta
            StringBuilder queryBuilder = new StringBuilder("SELECT * FROM clientes");

            List<String> condiciones = new ArrayList<>();
            if (!nombres.isEmpty()) {
                condiciones.add("nombres LIKE ?");
            }
            if (!idcliente.isEmpty()) {
                condiciones.add("idcliente = ?");
            }

            if (!condiciones.isEmpty()) {
                queryBuilder.append(" WHERE ");
                queryBuilder.append(String.join(" AND ", condiciones));
            }

            // Crear PreparedStatement
            st = this.connection.prepareStatement(queryBuilder.toString());

            // Asignar parámetros
            int parameterIndex = 1;
            if (!nombres.isEmpty()) {
                st.setString(parameterIndex++, nombres + "%");
            }
            if (!idcliente.isEmpty()) {
                try {
                    st.setInt(parameterIndex++, Integer.parseInt(idcliente));
                } catch (NumberFormatException e) {
                    throw new Exception("El ID del cliente no es un número válido.");
                }
            }

            // Ejecutar consulta
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                clientes cliente = new clientes();
                cliente.setIdcliente(rs.getInt("idcliente"));
                cliente.setUser(rs.getString("user"));
                cliente.setPass(rs.getString("pass"));
                cliente.setNombres(rs.getString("nombres"));
                cliente.setApellido_p(rs.getString("apellido_p"));
                cliente.setApellido_m(rs.getString("apellido_m"));
                cliente.setCalle(rs.getString("calle"));
                cliente.setNum_casa(rs.getInt("num_casa"));
                cliente.setTel(rs.getString("tel"));
                cliente.setSancion(rs.getInt("sancion"));
                cliente.setSanc_money(rs.getBigDecimal("sanc_money"));

                lista.add(cliente);
            }

            rs.close();
            st.close();

        } catch (Exception e) {
            throw e;

        } finally {
            DBConnection.getInstance().closeConnection();
        }

        return lista;
    }

    @Override
    public clientes getUserById(int idcliente) throws Exception {
        this.connection = DBConnection.getInstance().getConnection();
        clientes cliente = new clientes();

        PreparedStatement st = this.connection.prepareStatement("SELECT * FROM clientes WHERE idcliente = ? ");
        st.setInt(1, idcliente);

        ResultSet rs = st.executeQuery();

        // Verificar si se encontró el empleado
        if (rs.next()) {
            cliente = new clientes();
            cliente.setIdcliente(rs.getInt("idcliente"));
            cliente.setUser(rs.getString("user"));
            cliente.setPass(rs.getString("pass"));
            cliente.setNombres(rs.getString("nombres"));
            cliente.setApellido_p(rs.getString("apellido_p"));
            cliente.setApellido_m(rs.getString("apellido_m"));
            cliente.setCalle(rs.getString("calle"));
            cliente.setNum_casa(rs.getInt("num_casa"));
            cliente.setTel(rs.getString("tel"));
            cliente.setSancion(rs.getInt("sancion"));
            cliente.setSanc_money(rs.getBigDecimal("sanc_money"));
        }

        // Cerrar el PreparedStatement y ResultSet
        rs.close();
        st.close();

        return cliente;
    }
    
}
