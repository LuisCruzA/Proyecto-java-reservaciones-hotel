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

    public Cliente(String nombre, String genero, int telefono, String correo, int id_usuario) {
        super(nombre, genero, telefono, correo);
        this.id_usuario = id_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void mostrar() {
        System.out.println("Detalles del Cliente");
        System.out.println("ID: " + getId_usuario());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Género: " + getGenero());
        System.out.println("Teléfono: " + getTelefono());
        System.out.println("Correo: " + getCorreo());
    }
}
