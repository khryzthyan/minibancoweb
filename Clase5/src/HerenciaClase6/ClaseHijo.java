/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaClase6;

/**
 *
 * @author Capacitaciones_pc30
 */
public class ClaseHijo extends ClasePadre{

    private boolean tatuajes;
    
    public void jugar(){
        System.out.println("Jugando desde el hijo");
    }

    @Override
    protected void comer() {
        super.comer();
        System.out.println("Comiendo desde el hijo");
    }

    
    /**
     * @return the tatuajes
     */
    public boolean isTatuajes() {
        return tatuajes;
    }

    /**
     * @param tatuajes the tatuajes to set
     */
    public void setTatuajes(boolean tatuajes) {
        this.tatuajes = tatuajes;
    }
    

}
