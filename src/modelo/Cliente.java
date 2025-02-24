/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author angelcruz
 */
public class Cliente {
    private int id;
    private String correo;
    private String nombre;
    private int telefono;

    public Cliente(int id, String correo, String nombre, int telefono) {
        this.id = id;
        this.correo = correo;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void mostrar() {
        System.out.println("Detalles del Cliente");
        System.out.println("ID: " + getId());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Teléfono: " + getTelefono());
    }
}
