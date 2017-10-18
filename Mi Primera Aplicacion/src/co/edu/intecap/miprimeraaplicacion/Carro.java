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
public class Carro extends Vehiculo implements IControlVehicular{
   public int ejes;

    @Override
    public void acelerar() {
        this.gasolinaFinal -= 5;
    }

    @Override
    public void frenar() {
        this.gasolinaFinal -= 2;
            }
    @Override
    public void pagar(int tarifa){
        super.pagar(tarifa);
        if (ejes > 1 && < 3){
        totalCosto += 3000;
        
    }else if (ejes >2 && ejes < 5){
        totalcosto += 6000;
            }else {
            totalCosto += 9000;
            }
    
}

    public Carro() {
    }





