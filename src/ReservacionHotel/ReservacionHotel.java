/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReservacionHotel;

import ReservacionHotel.GUI.MenuOpc;
import ReservacionHotel.GUI.Principal;
import ReservacionHotel.persistencia.Bd;
import java.sql.ResultSet;
import java.sql.Connection;

/**
 *
 * @author angelcruz
 */
public class ReservacionHotel {
    public static void main(String[] args) {
       /* Bd conexion = new Bd();
        
        try {
            conexion.getConexion();x

            ResultSet resultado = conexion.consultarBD("SELECT * FROM empleado");
            
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre"));
            }

        conexion.cerrarRecursos(resultado, conexion.sentencia);
        } catch (Exception e) {
            e.printStackTrace(); 
        } finally {
            try {
                conexion.desconexion();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }*/
       Principal prin = new Principal();
        prin.setTitle("Login");
        prin.setVisible(true);
         prin.setLocationRelativeTo(null);
         
         
         
        
        
}
}
