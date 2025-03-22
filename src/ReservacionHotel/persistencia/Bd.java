/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReservacionHotel.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Bd {
    // Configuración para Railway
    private final String HOST = "yamanote.proxy.rlwy.net";
    private final String PUERTO = "59518";
    private final String DB = "railway";
    private final String USER = "postgres";
    private final String PASSWORD = "juxTsBMZwXmRZprosKuncXGwThRrWxLE";

    private Connection conexion = null;
    public Statement sentencia = null;

    public Connection getConexion() {
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://" + HOST + ":" + PUERTO + "/" + DB;

            conexion = DriverManager.getConnection(url, USER, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexión exitosa a Railway");

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: No se encontró el driver de PostgreSQL.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
        return conexion;
    }

    public void desconexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                JOptionPane.showMessageDialog(null, "Conexión cerrada correctamente.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
        }
    }

    public boolean getEstado() throws SQLException {
        return conexion != null && !conexion.isClosed();
    }

    public ResultSet consultarBD(String strSQL) throws Exception {
        ResultSet resultado = null;
        try {
            if (conexion == null || conexion.isClosed()) {
                throw new SQLException("La conexión no está abierta.");
            }
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(strSQL);
        } catch (SQLException e) {
            throw new Exception("Error al consultar la BD: " + e.getMessage());
        }
        return resultado;
    }

    public void cerrarRecursos(ResultSet resultado, Statement sentencia) throws SQLException {
        if (resultado != null) {
            resultado.close();
        }
        if (sentencia != null) {
            sentencia.close();
        }
    }
}