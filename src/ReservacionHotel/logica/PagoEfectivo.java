/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReservacionHotel.logica;

/**
 *
 * @author angelcruz
 */
public class PagoEfectivo extends TipoPago{
    
    private double cambio;
    
    public PagoEfectivo(double monto, double pagoRecibido){
        super(monto);
        
        if(pagoRecibido >= monto){
            
            this.cambio = pagoRecibido - monto;
        this.completado = true;
        } 
        else{
            System.out.println("Error: pago insuficiente");
        }
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }
    
    
    @Override
    public void hacerPago(){
        
        if(completado){
            System.out.println("Pago en efectivo Realizado");
            System.out.println("cambio: "+getCambio());
        }
        
    }
    
    
}
