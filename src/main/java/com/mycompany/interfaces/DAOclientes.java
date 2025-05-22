package com.mycompany.interfaces;

import com.mycompany.models.clientes;
import java.util.List;

public interface DAOclientes {
    public void registrar(clientes cliente) throws Exception;
    public void modificar(clientes cliente) throws Exception;
    public void sancionar(clientes cliente) throws Exception;
    public void eliminar(int idcliente) throws Exception;
    public List<clientes> listar(String nombres, String idcliente) throws Exception;
    public clientes getUserById(int idcliente) throws Exception;
}
