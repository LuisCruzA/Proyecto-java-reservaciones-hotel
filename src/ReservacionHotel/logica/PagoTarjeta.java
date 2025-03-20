/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReservacionHotel.logica;

import ReservacionHotel.logica.TipoPago;

/**
 *
 * @author angelcruz
 */
public class PagoTarjeta extends TipoPago{
    
    private String numeroTarjeta;
    private String  nombreTitular;
    private int cvv;

    public PagoTarjeta(double monto, String numeroTarjeta, String nombreTitular, int cvv) {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
        this.nombreTitular = nombreTitular;
        this.cvv = cvv;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    
    
    @Override
    public void hacerPago(){
        System.out.println("Realizando pago....");
        this.completado = true;
                System.out.println("El pago por tajeta ha sido realizado correctamente");

    }
    
    
}
