/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.miprimeraaplicacion;

import co.appreactor.superteclado.Teclado;

/**
 *
 * @author Capacitaciones_pc30
 */
public class Vehiculo {
    protected String placa;
    protected String dueno;
    protected int horas;
    protected String color;
    protected String modelo;
    protected int gasolinaInicial;
    protected int gasolinaFinal;
    proteced int totalcosto;
    
    public void parquear(){
        System.out.println("Digite la placa del vehiculo: ");
        this.placa = Teclado.leerTexto();
        System.out.println("Digite el nombre del propietario del vehiculo: ");
        this.dueno = Teclado.leerTexto();
        System.out.println("Digite el color  vehiculo: ");
        this.color = Teclado.leerTexto();
        System.out.println("Digite el modelo del propietario del vehiculo: ");
        this.modelo = Teclado.leerTexto();
        System.out.println("Digite el nivel actual de gasolina del vehiculo: ");
        this.gasolinaInicial = Teclado.leerNumero();
        this.gasolinaFinal = this.gasolinaInicial;
        
    }
     public void encender (){
         if (this.gasolinaFinal <= 2){
         System.out.println("No se puede encender el vehiculo");
         return;
     }
          System.out.println("Vehiculo encendido");
     }
      public void pagar (int tarifa){  
          int diferenciaGasolina = this.gasolinaInicial - this.gasolinaFinal;
          if (diferenciaGasolina >0 && diferenciaGasolina < 5){
              this.totalcosto -= 1000;
          }else if (diferenciaGasolina > 4 && diferenciaGasolina < 11){
                      this.totalcosto -= 3000;
                      }else {
                      this.totalcosto -= 5000;
                      }
              int valorTarifa = this.horas * tarifa;
              this.totalcosto += valorTarifa;
          }
          
      
      public void entregar (){   
          this.encender();
        System.out.println("Vehiculo entregado");  
      } 
}
