package com.mycompany.dao_implement;

import com.mycompany.db.DBConnection;
import com.mycompany.interfaces.DAOempleados;
import com.mycompany.models.empleados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DAOempleadosImpl implements DAOempleados {
    
    private Connection connection;
    
    @Override
    public void registrar(empleados empleado) throws Exception {
        try{
            this.connection = DBConnection.getInstance().getConnection(); // Permite que nos conectemos a la bd aunque sea privada
            PreparedStatement st = this.connection.prepareStatement("INSERT INTO empleados(user, pass, nombres, apellido_p, apellido_m, tel, salario, calle, num_casa) VALUES(?,?,?,?,?,?,?,?,?);");
            st.setString(1, empleado.getUser());
            st.setString(2, empleado.getPass());
            st.setString(3, empleado.getNombres());
            st.setString(4, empleado.getApellido_p());
            st.setString(5, empleado.getApellido_m());
            st.setString(6, empleado.getTel());
            st.setBigDecimal(7, empleado.getSalario());
            st.setString(8, empleado.getCalle());
            st.setInt(9, empleado.getNum_casa());
            
            st.executeUpdate();
            st.close();
            
        } catch(Exception e){
            e.printStackTrace(); // Esto imprimirá el error en la consola
            throw new Exception("Error al registrar el empleado: " + e.getMessage(), e);
            
        } finally{
            DBConnection.getInstance().closeConnection(); // Llamar a closeConnection desde la instancia de DBConnection
        }
    }

    @Override
    public void modificar(empleados empleado) throws Exception {
        PreparedStatement st = null;

        try {
            this.connection = DBConnection.getInstance().getConnection();

            // Realizar la actualización usando el campo `id`
            st = this.connection.prepareStatement(
                "UPDATE empleados SET user = ?, pass = ?, nombres = ?, apellido_p = ?, apellido_m = ?, tel = ?, salario = ?, calle = ?, num_casa = ? WHERE idempleado = ?;");
            st.setString(1, empleado.getUser());
            st.setString(2, empleado.getPass());
            st.setString(3, empleado.getNombres());
            st.setString(4, empleado.getApellido_p());
            st.setString(5, empleado.getApellido_m());
            st.setString(6, empleado.getTel());
            st.setBigDecimal(7, empleado.getSalario());
            st.setString(8, empleado.getCalle());
            st.setInt(9, empleado.getNum_casa());
            st.setInt(10, empleado.getIdempleado());

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
    public void eliminar(int idempleado) throws Exception {
        this.connection = DBConnection.getInstance().getConnection(); // Permite que nos conectemos a la bd aunque sea privada
        
        LocalDate date = LocalDate.now();
        PreparedStatement st = this.connection.prepareStatement("DELETE FROM empleados WHERE idempleado = ?;");        
        st.setInt(1, idempleado);
        
        st.executeUpdate();
        st.close();
    }

    @Override
    public List<empleados> listar(String nombres, String idempleado) throws Exception {
        List<empleados> lista = new ArrayList<>();
        PreparedStatement st;

        try {
            this.connection = DBConnection.getInstance().getConnection();

            // Construcción dinámica de la consulta
            StringBuilder queryBuilder = new StringBuilder("SELECT * FROM empleados");

            List<String> condiciones = new ArrayList<>();
            if (!nombres.isEmpty()) {
                condiciones.add("nombres LIKE ?");
            }
            if (!idempleado.isEmpty()) {
                condiciones.add("idempleado = ?");
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
            if (!idempleado.isEmpty()) {
                try {
                    st.setInt(parameterIndex++, Integer.parseInt(idempleado));
                } catch (NumberFormatException e) {
                    throw new Exception("El ID del empleado no es un número válido.");
                }
            }

            // Ejecutar consulta
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                empleados empleado = new empleados();
                empleado.setIdempleado(rs.getInt("idempleado"));
                empleado.setUser(rs.getString("user"));
                empleado.setPass(rs.getString("pass"));
                empleado.setNombres(rs.getString("nombres"));
                empleado.setApellido_p(rs.getString("apellido_p"));
                empleado.setApellido_m(rs.getString("apellido_m"));
                empleado.setTel(rs.getString("tel"));
                empleado.setSalario(rs.getBigDecimal("salario"));
                empleado.setCalle(rs.getString("calle"));
                empleado.setNum_casa(rs.getInt("num_casa"));

                lista.add(empleado);
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
    public empleados getUserById(int idempleado) throws Exception {
        this.connection = DBConnection.getInstance().getConnection();
        empleados empleado = new empleados();

        PreparedStatement st = this.connection.prepareStatement("SELECT * FROM empleados WHERE idempleado = ? ");
        st.setInt(1, idempleado);

        ResultSet rs = st.executeQuery();

        // Verificar si se encontró el empleado
        if (rs.next()) {
            empleado = new empleados();
            empleado.setIdempleado(rs.getInt("idempleado"));
            empleado.setUser(rs.getString("user"));
            empleado.setPass(rs.getString("pass"));
            empleado.setNombres(rs.getString("nombres"));
            empleado.setApellido_p(rs.getString("apellido_p"));
            empleado.setApellido_m(rs.getString("apellido_m"));
            empleado.setTel(rs.getString("tel"));
            empleado.setSalario(rs.getBigDecimal("salario"));
            empleado.setCalle(rs.getString("calle"));
            empleado.setNum_casa(rs.getInt("num_casa"));
        }

        // Cerrar el PreparedStatement y ResultSet
        rs.close();
        st.close();

        return empleado;
    }
    
}
