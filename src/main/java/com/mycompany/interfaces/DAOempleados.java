package com.mycompany.interfaces;

import com.mycompany.models.empleados;
import java.util.List;

public interface DAOempleados {
    public void registrar(empleados empleado) throws Exception;
    public void modificar(empleados empleado) throws Exception;
    public void eliminar(int idempleado) throws Exception;
    public List<empleados> listar(String nombres, String idempleado) throws Exception;
    public empleados getUserById(int idempleado) throws Exception;
}
