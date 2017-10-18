/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

/**
 *
 * @author Capacitaciones_pc30
 */
public class PClaseEncapsulamiento {

    /*
        Para encapsular automaticamente, selecciono los atributos+click derecho+Refactor+Encapsulate Fields+Refactor
    */
    
    
    /**
     * @return the verdad este es el get pero cambia is cuando el atributo es tipo boolean
     */
    public boolean isVerdad() {
        return verdad;
    }

    /**
     * @param verdad the verdad to set
     */
    public void setVerdad(boolean verdad) {
        this.verdad = verdad;
    }

    
    
    private int edad;
    private int anio;
    private int siglo;
    private double porcentajes;
    private double pagos;
    private double dinero;
    private double promedio;
    private long cedula;
    private long tarjetaIdentidad;
    private long celular;
    private String Nombre;
    private String Apellido;
    private String direccion;
    private String barrio;
    private char Genero;
    private char opcionSiNo;
    private char verdaderoFalso;
    private boolean verdad;
    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * @return the siglo
     */
    public int getSiglo() {
        return siglo;
    }

    /**
     * @param siglo the siglo to set
     */
    public void setSiglo(int siglo) {
        this.siglo = siglo;
    }

    /**
     * @return the porcentajes
     */
    public double getPorcentajes() {
        return porcentajes;
    }

    /**
     * @param porcentajes the porcentajes to set
     */
    public void setPorcentajes(double porcentajes) {
        this.porcentajes = porcentajes;
    }

    /**
     * @return the pagos
     */
    public double getPagos() {
        return pagos;
    }

    /**
     * @param pagos the pagos to set
     */
    public void setPagos(double pagos) {
        this.pagos = pagos;
    }

    /**
     * @return the dinero
     */
    public double getDinero() {
        return dinero;
    }

    /**
     * @param dinero the dinero to set
     */
    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    /**
     * @return the promedio
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    /**
     * @return the cedula
     */
    public long getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the tarjetaIdentidad
     */
    public long getTarjetaIdentidad() {
        return tarjetaIdentidad;
    }

    /**
     * @param tarjetaIdentidad the tarjetaIdentidad to set
     */
    public void setTarjetaIdentidad(long tarjetaIdentidad) {
        this.tarjetaIdentidad = tarjetaIdentidad;
    }

    /**
     * @return the celular
     */
    public long getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(long celular) {
        this.celular = celular;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the barrio
     */
    public String getBarrio() {
        return barrio;
    }

    /**
     * @param barrio the barrio to set
     */
    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    /**
     * @return the Genero
     */
    public char getGenero() {
        return Genero;
    }

    /**
     * @param Genero the Genero to set
     */
    public void setGenero(char Genero) {
        this.Genero = Genero;
    }

    /**
     * @return the opcionSiNo
     */
    public char getOpcionSiNo() {
        return opcionSiNo;
    }

    /**
     * @param opcionSiNo the opcionSiNo to set
     */
    public void setOpcionSiNo(char opcionSiNo) {
        this.opcionSiNo = opcionSiNo;
    }

    /**
     * @return the verdaderoFalso
     */
    public char getVerdaderoFalso() {
        return verdaderoFalso;
    }

    /**
     * @param verdaderoFalso the verdaderoFalso to set
     */
    public void setVerdaderoFalso(char verdaderoFalso) {
        this.verdaderoFalso = verdaderoFalso;
    }
    

    
    //Encapsulamiento
    /**
     * Obtencion de el atributo edad
     * @return 
     */
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public long getcedula(){
        return this.getCedula();
    }
    public void setcedula(long cedula){
        this.setCedula(cedula);
    }
}
