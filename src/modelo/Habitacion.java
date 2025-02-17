/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author angelcruz
 */
public class Habitacion {
    private int numhabit;
    private boolean estatus;
    private String tipo;

    public Habitacion(int numhabit, boolean estatus, String tipo) {
        this.numhabit = numhabit;
        this.estatus = estatus;
        this.tipo = tipo;
    }

    public int getNumhabit() {
        return numhabit;
    }

    public void setNumhabit(int numhabit) {
        this.numhabit = numhabit;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
