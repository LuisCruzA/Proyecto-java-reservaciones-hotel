/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author angelcruz
 */
public class Cliente extends Persona {
    private int id_usuario;
    private int numTarjeta;
    private int id_pago;

    public Cliente(String nombre, String genero, int telefono, String correo, int id_usuario, int numTarjeta, int id_pago) {
        super(nombre, genero, telefono, correo);
        this.id_usuario = id_usuario;
        this.numTarjeta = numTarjeta;
        this.id_pago = id_pago;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public void mostrar() {
        System.out.println("Detalles del Cliente");
        System.out.println("ID: " + getId_usuario());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Género: " + getGenero());
        System.out.println("Teléfono: " + getTelefono());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Tarjeta: " + getNumTarjeta());
        System.out.println("ID Pago: " + getId_pago());
    }
}

