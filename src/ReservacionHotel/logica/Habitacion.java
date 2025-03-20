/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReservacionHotel.logica;

/**
 *
 * @author angelcruz
 */
public abstract class Habitacion {
    private int numhabit;
    private boolean isFree;
    private String tipo;
    private int camas;
    private int capacidad;
    private boolean isClean;
    private double precioXNoche;

    public Habitacion(int numhabit, boolean isFree, String tipo, int camas, int capacidad, boolean isClean, double precioXNoche) {
        this.numhabit = numhabit;
        this.isFree = isFree;
        this.tipo = tipo;
        this.camas = camas;
        this.capacidad = capacidad;
        this.isClean = isClean;
        this.precioXNoche = precioXNoche;
    }

    public int getNumhabit() {
        return numhabit;
    }

    public void setNumhabit(int numhabit) {
        this.numhabit = numhabit;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public double getPrecioXNoche() {
        return precioXNoche;
    }

    public void setPrecioXNoche(double precioXNoche) {
        this.precioXNoche = precioXNoche;
    }

    public void mostrar() {
        System.out.println("Detalles de la Habitación");
        System.out.println("No. de habitación: " + getNumhabit());
        System.out.println("Tipo: " + getTipo());
        System.out.println("No. de camas: " + getCamas());
        System.out.println("Capacidad: " + getCapacidad());
        System.out.println("Precio por noche: $" + getPrecioXNoche() + " MXN");
        System.out.println("Está ocupada: " + isFree());
        System.out.println("Está limpia: " + isClean());
    }

    public void limpiarHabitacion() {
        if(isFree) {
            isClean = true;
            System.out.println("La habitación ha sido limpiada.");
        } else {
            System.out.println("La habitación está en uso");
        }

    }
}
