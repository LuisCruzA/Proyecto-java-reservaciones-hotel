/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReservacionHotel.logica;

/**
 *
 * @author angelcruz
 */
import ReservacionHotel.persistencia.Bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginDAO {
    private Bd bd = new Bd();

    public boolean verificarLogin(String usuario, String contraseña) {
        String query = "SELECT * FROM login WHERE nombre = ? AND contraseña = ?";

        try (Connection conn = bd.getConexion();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, usuario);
            stmt.setString(2, contraseña);
            ResultSet rs = stmt.executeQuery();

            return rs.next(); // Si hay un resultado, las credenciales son correctas
        } catch (SQLException e) {
            e.printStackTrace();        }
        return false; // Retorna false si hay error o no se encuentra el usuario
    }
}


