package com.mycompany.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // Parámetros de conexión para MySQL (phpMyAdmin)
    private static final String URL = "jdbc:mysql://localhost:3306/gamerent?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = ""; // Agrega tu contraseña si tienes una

    // Instancia única
    private static DBConnection instance;
    private Connection connection;

    // Constructor privado
    private DBConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Importante: cargar el driver MySQL
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver de MySQL no encontrado.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos MySQL.");
            e.printStackTrace();
            throw new SQLException("Error al crear la conexión: " + e.getMessage(), e);
        }
    }

    // Método para obtener la instancia única
    public static DBConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new DBConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new DBConnection();
        }
        return instance;
    }

    // Devuelve la conexión
    public Connection getConnection() {
        return connection;
    }

    // Cierra la conexión
    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


