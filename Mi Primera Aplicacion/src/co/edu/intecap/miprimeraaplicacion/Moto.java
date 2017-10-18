/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.miprimeraaplicacion;

/**
 *
 * @author Capacitaciones_pc30
 */
public class Moto extends Vehiculo implements IControlVehicular{
    public boolean casco;

    @Override
    public void acelerar() {
        this.gasolinaFinal -= 3;
    }

    @Override
    public void frenar() {
        this.gasolinaFinal -= 3;
    }
    @Override
    public void int pagar(int tarifa) {
        super.pagar(tarifa);
        if (casco){
            totalCosto += 1000;
        }
    }
        this.gasolinaFinal -= 3;
        
    }
    
   
}
