package com.mycompany.interfaces;

import com.mycompany.models.clientes;
import com.mycompany.models.juegos;
import com.mycompany.models.prestamos;
import java.util.List;

public interface DAOprestamos {
    public void registrar(prestamos prestamo) throws Exception;
    public void modificar(prestamos prestamo) throws Exception;
    public prestamos getLending(clientes cliente, juegos juego) throws Exception;
    public List<prestamos> listar() throws Exception;
}
