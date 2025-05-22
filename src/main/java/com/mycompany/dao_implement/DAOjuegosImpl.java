package com.mycompany.dao_implement;

import com.mycompany.db.DBConnection;
import com.mycompany.interfaces.DAOjuegos;
import com.mycompany.models.juegos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DAOjuegosImpl implements DAOjuegos {
    
    private Connection connection;
    
    @Override
    public void registrar(juegos juego) throws Exception {
        try{
            this.connection = DBConnection.getInstance().getConnection(); // Permite que nos conectemos a la bd aunque sea privada
            PreparedStatement st = this.connection.prepareStatement("INSERT INTO juegos(titulo, descripcion, plataforma, genero, precio, stock, disponibles) VALUES(?,?,?,?,?,?,?);");
            st.setString(1, juego.getTitulo());
            st.setString(2, juego.getDescripcion());
            st.setString(3, juego.getPlataforma());
            st.setString(4, juego.getPlataforma());
            st.setString(5, juego.getGenero());
            st.setBigDecimal(6, juego.getPrecio());
            st.setInt(7, juego.getDisponible());
            
            st.executeUpdate();
            st.close();
            
        } catch(Exception e){
            e.printStackTrace(); // Esto imprimirá el error en la consola
            throw new Exception("Error al registrar el juego: " + e.getMessage(), e);
            
        } finally{
            DBConnection.getInstance().closeConnection(); // Llamar a closeConnection desde la instancia de DBConnection
        }
    }

    @Override
    public void modificar(juegos juego) throws Exception {
        PreparedStatement st = null;

        try {
            this.connection = DBConnection.getInstance().getConnection();

            // Realizar la actualización usando el campo `id`
            st = this.connection.prepareStatement(
                "UPDATE juegos SET titulo = ?, descripcion = ?, plataforma = ?, genero = ?, precio = ?, disponibles = ? WHERE idjuego = ?;");
            st.setString(1, juego.getTitulo());
            st.setString(2, juego.getDescripcion());
            st.setString(3, juego.getPlataforma());
            st.setString(4, juego.getGenero());
            st.setBigDecimal(5, juego.getPrecio());
            st.setInt(6, juego.getDisponible());
            st.setInt(7, juego.getIdjuego());

            st.executeUpdate();
            st.close();

        } catch(Exception e) {
            throw new Exception("Error al modificar el juego: " + e.getMessage());
            
        } finally {
            if (st != null) st.close();
            if (this.connection != null) this.connection.close();
        }
    }

    @Override
    public void eliminar(int idjuego) throws Exception {
        this.connection = DBConnection.getInstance().getConnection(); // Permite que nos conectemos a la bd aunque sea privada
        
        LocalDate date = LocalDate.now();
        PreparedStatement st = this.connection.prepareStatement("DELETE FROM juegos WHERE idjuego = ?;");        
        st.setInt(1, idjuego);
        
        st.executeUpdate();
        st.close();
    }

    @Override
    public List<juegos> listar(String titulo, String genero) throws Exception {
        List<juegos> lista = new ArrayList<>();
        PreparedStatement st;

        try {
            this.connection = DBConnection.getInstance().getConnection();

            // Construcción dinámica de la consulta
            StringBuilder queryBuilder = new StringBuilder("SELECT * FROM juegos");

            List<String> condiciones = new ArrayList<>();
            if (!titulo.isEmpty()) {
                condiciones.add("titulo LIKE ?");
            }
            if (!genero.isEmpty()) {
                condiciones.add("genero LIKE ?");
            }

            if (!condiciones.isEmpty()) {
                queryBuilder.append(" WHERE ");
                queryBuilder.append(String.join(" AND ", condiciones));
            }

            // Crear PreparedStatement
            st = this.connection.prepareStatement(queryBuilder.toString());

            // Asignar parámetros
            int parameterIndex = 1;
            if (!titulo.isEmpty()) {
                st.setString(parameterIndex++, titulo + "%");
            }
            if (!genero.isEmpty()) {
                st.setString(parameterIndex++, genero + "%");
            }

            // Ejecutar consulta
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                juegos juego = new juegos();
                juego.setIdjuego(rs.getInt("idjuego"));
                juego.setTitulo(rs.getString("titulo"));
                juego.setDescripcion(rs.getString("descripcion"));
                juego.setPlataforma(rs.getString("plataforma"));
                juego.setGenero(rs.getString("genero"));
                juego.setPrecio(rs.getBigDecimal("precio"));
                juego.setStock(rs.getInt("stock"));
                juego.setDisponible(rs.getInt("disponibles"));

                lista.add(juego);
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
    public juegos getJuegoById(int idjuego) throws Exception {
        this.connection = DBConnection.getInstance().getConnection();
        juegos juego = new juegos();

        PreparedStatement st = this.connection.prepareStatement("SELECT * FROM juegos WHERE idjuego = ? ");
        st.setInt(1, idjuego);

        ResultSet rs = st.executeQuery();

        // Verificar si se encontró el empleado
        if (rs.next()) {
            juego = new juegos();
            juego.setIdjuego(rs.getInt("idjuego"));
            juego.setTitulo(rs.getString("titulo"));
            juego.setDescripcion(rs.getString("descripcion"));
            juego.setPlataforma(rs.getString("plataforma"));
            juego.setGenero(rs.getString("genero"));
            juego.setPrecio(rs.getBigDecimal("precio"));
            juego.setStock(rs.getInt("stock"));
            juego.setDisponible(rs.getInt("disponibles"));
        }

        // Cerrar el PreparedStatement y ResultSet
        rs.close();
        st.close();

        return juego;
    }
    
}
