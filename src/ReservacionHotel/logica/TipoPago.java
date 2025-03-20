/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReservacionHotel.logica;
import java.time.LocalDate;
/**
 *
 * @author angelcruz
 */
public  abstract class  TipoPago {

    private double monto;
    private LocalDate fecha;
    boolean completado;
    
    
    public TipoPago(double monto){
        this.monto= monto;
        this.fecha=LocalDate.now();
        this.completado = false;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
    
    
    public abstract void  hacerPago();
    
    public void mostrar(){
        System.out.println("Monto: "+getMonto());
                System.out.println("Monto: "+getMonto());
        System.out.println("Fecha: "+getFecha());
        System.out.println("Estado: "+(completado ? "completado" : "pendiente"));

    }
    
}
