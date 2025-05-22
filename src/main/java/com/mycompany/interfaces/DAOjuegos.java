package com.mycompany.interfaces;

import com.mycompany.models.juegos;
import java.util.List;

public interface DAOjuegos {
    public void registrar(juegos juego) throws Exception;
    public void modificar(juegos juego) throws Exception;
    public void eliminar(int idjuego) throws Exception;
    public List<juegos> listar(String titulo, String genero) throws Exception;
    public juegos getJuegoById(int idjuego) throws Exception;
}
