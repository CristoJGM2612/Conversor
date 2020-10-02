/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import Controlador.Conversor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristo Javier García Martín cristojgm2612@gmail.com
 */
public class OperacionDAO {

    private Connection con = null;
    private static OperacionDAO instance = null;

    private OperacionDAO() throws SQLException, ClassNotFoundException {
        con = DBConnection.getConnection();

    }

    public static OperacionDAO getInstance() throws SQLException, ClassNotFoundException {
        if (instance == null) {
            instance = new OperacionDAO();

        }

        return instance;
    }

    public List<Conversor> findAll() throws SQLException {
        List<Conversor> listaConversor = new ArrayList<>();
        ResultSet rs;
        try (PreparedStatement ps = con.prepareStatement("SELECT * FROM conversor ;")) {
            Conversor c = null;
            rs = ps.executeQuery();
            while (rs.next()) {
                c = new Conversor(rs.getInt(1), rs.getDouble(2), TipoConversor.valueOf(rs.getString(3)),
                        rs.getDouble(4));
                listaConversor.add(c);
            }
        }
        rs.close();
        return listaConversor;
    }

    public boolean insert(Object t) throws SQLException {
        Conversor c = (Conversor) t;
        boolean resultado = false;
        if (c != null) {
            try (PreparedStatement ps = con.prepareStatement("INSERT INTO conversor VALUES(null,?,?,?);")) {
                ps.setDouble(1, c.getDivisaInput());
                ps.setString(2, c.getTipoConversor().toString());
                ps.setDouble(3, c.getResultado());
                ps.executeUpdate();
                ps.close();
                resultado = true;
            }
        }
        return resultado;
    }

}
