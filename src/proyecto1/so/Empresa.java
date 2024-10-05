/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.so;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Empresa extends Thread{
    
    private Trabajador pPlacaBase;
    private Trabajador pCpu;
    private Trabajador pRam;
    private Trabajador pFuente;
    private Trabajador pTarjeta;
    private Trabajador ensamblador;
    //private Director director;
    //private PM pm;
    private int duracion; // Duracion dia
    private int deadline;
    private int ganancia;   //Ganancia de los capitulos sin gastos
    private int costos;
    private int maxtrabajadores;
    private int utilidad;
    private Almacen almacen;
    private int precioCompu;
    private int precioPremium;
    private Semaphore mutex;

    public Empresa(Almacen almacen,int duracion, int deadline, int maxtrabajadores,int precioCompu, int precioPremium) {
   
        this.duracion = duracion;
        this.deadline = deadline;
        this.ganancia= 0;
        this.costos = 0;
        this.maxtrabajadores = maxtrabajadores;
        this.almacen = almacen;
        this.precioCompu = precioCompu;
        this.precioPremium = precioPremium;
        empleados ();
    }
    // Hay que ver como poner la cantidad inicial de trabajadores, es el segundo atributo en el constructor trabajador
    public void empleados(){
        pPlacaBase = new Trabajador(0,  1, duracion, almacen, mutex) ;
        pCpu = new Trabajador(1,  1, duracion, almacen, mutex);
        pRam = new Trabajador(2,  1, duracion, almacen, mutex);
        pFuente = new Trabajador(3,  1, duracion, almacen, mutex);
        pTarjeta = new Trabajador(4,  1, duracion, almacen, mutex);
        ensamblador= new Trabajador(5,  1, duracion, almacen, mutex);
        //pm = new PM();
        //director = new Director();
    }
    
    
    @Override
    public void run() {
        while (true) {
            calcularCosto();
            calcularUtilidades();
  
            try {
                sleep(this.duracion * 1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
     public void calcularUtilidades() {
        this.utilidad = this.ganancia - this.costos;
    }
     
     public void calcularCosto() {
       this.costos = (int) (pPlacaBase.getSalarioAcumulado() + pCpu.getSalarioAcumulado() + pRam.getSalarioAcumulado() + pFuente.getSalarioAcumulado() + pTarjeta.getSalarioAcumulado() + ensamblador.getSalarioAcumulado()); // falta el director y pm           
    }
     
     //Falta ver como calcular la ganancia

    public Trabajador getpPlacaBase() {
        return pPlacaBase;
    }

    public void setpPlacaBase(Trabajador pPlacaBase) {
        this.pPlacaBase = pPlacaBase;
    }

    public Trabajador getpCpu() {
        return pCpu;
    }

    public void setpCpu(Trabajador pCpu) {
        this.pCpu = pCpu;
    }

    public Trabajador getpRam() {
        return pRam;
    }

    public void setpRam(Trabajador pRam) {
        this.pRam = pRam;
    }

    public Trabajador getpFuente() {
        return pFuente;
    }

    public void setpFuente(Trabajador pFuente) {
        this.pFuente = pFuente;
    }

    public Trabajador getpTarjeta() {
        return pTarjeta;
    }

    public void setpTarjeta(Trabajador pTarjeta) {
        this.pTarjeta = pTarjeta;
    }

    public Trabajador getEnsamblador() {
        return ensamblador;
    }

    public void setEnsamblador(Trabajador ensamblador) {
        this.ensamblador = ensamblador;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    public int getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }

    public int getCostos() {
        return costos;
    }

    public void setCostos(int costos) {
        this.costos = costos;
    }

    public int getMaxtrabajadores() {
        return maxtrabajadores;
    }

    public void setMaxtrabajadores(int maxtrabajadores) {
        this.maxtrabajadores = maxtrabajadores;
    }

    public int getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(int utilidad) {
        this.utilidad = utilidad;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public int getPrecioCompu() {
        return precioCompu;
    }

    public void setPrecioCompu(int precioCompu) {
        this.precioCompu = precioCompu;
    }

    public int getPrecioPremium() {
        return precioPremium;
    }

    public void setPrecioPremium(int precioPremium) {
        this.precioPremium = precioPremium;
    }

    public Semaphore getMutex() {
        return mutex;
    }

    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }
     
     
}
