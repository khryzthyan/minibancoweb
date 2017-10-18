/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

/**
 *
 * @author Capacitaciones_pc30
 */
public class Clase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // A la hora de dimensionar el arreglo el numero es la cantidad de espacios es decir
        //se crean 6 espacios contando el 0
        double arrNotas[] = new double[6];
        double promedio = 0, menor = 5, mayor = 0;
        int Contador = 0;

        arrNotas[0] = 4.5;
        arrNotas[1] = 3.1;
        arrNotas[2] = 1;
        arrNotas[3] = 5;
        arrNotas[4] = 5;
        arrNotas[5] = 4.3;

        for (int i = 0; i < arrNotas.length; i++) {
            if (mayor<arrNotas[i]){
                mayor=arrNotas[i];
            }
            if (menor>arrNotas[i]){
                menor=arrNotas[i];
            }
            promedio+=arrNotas[i];
        }
        promedio/=arrNotas.length;
        for (int i=0;i<arrNotas.length;i++){
            if (arrNotas[i]>=promedio){
                Contador++;
            }
        }
        System.out.println("La nota mayor es: "+mayor);
        System.out.println("La nota menor es: "+menor);
        System.out.println("El promedio es: "+promedio);
        System.out.println("El numero de personas por encima de el promedio es: "+Contador);
    }

}
