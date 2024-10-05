/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author manza
 */
public class Empresa extends Thread{
    private Trabajador productorPlacaBase;
    private Trabajador productorCPUs;
    private Trabajador productorRAM;
    private Trabajador productorFuente;
    private Trabajador productorTGrafica;
    private Trabajador ensamblador;
    private ProjectManager pm;    
    private Director director;    
    private int duracion;   // Duracion dia
    private int deadline;
    private int ganancia;   //Ganancia de los capitulos sin gastos
    private int costos;
    private int utilidad;
    private int maxTrabajadores;
    private int [] numTrabajadoresIniciales;
    private Almacen almacen;
    private int precioCompu;
    private int precioPremium;
    private Semaphore mutex;
    private Semaphore mutex2;
    private Semaphore mutex3;
   

    public Empresa(Almacen almacen, int [] numTrabajadoresIniciales, int duracion, int deadline, int maxtrabajadores, int precioCompu, int precioPremium) {
        this.ganancia = 0;
        this.costos = 0;
        this.utilidad = 0;
        this.duracion = duracion;
        this.deadline = deadline;
        this.precioCompu = precioCompu;
        this.precioPremium = precioPremium;
        this.maxTrabajadores = maxTrabajadores;
        this.numTrabajadoresIniciales = numTrabajadoresIniciales;
        this.mutex = new Semaphore(1);
        this.mutex2 = new Semaphore(1);
        this.mutex3 = new Semaphore(1);
        this.almacen = almacen;
        empleados ();
    }
    
    // Hay que ver como poner la cantidad inicial de trabajadores, es el segundo atributo en el constructor trabajador
    public void empleados(){
        productorPlacaBase = new Trabajador(0,  numTrabajadoresIniciales[0], duracion, almacen, mutex) ;
        productorCPUs = new Trabajador(1,  numTrabajadoresIniciales[1], duracion, almacen, mutex);
        productorRAM = new Trabajador(2,  numTrabajadoresIniciales[2], duracion, almacen, mutex);
        productorFuente = new Trabajador(3,  numTrabajadoresIniciales[3], duracion, almacen, mutex);
        productorTGrafica = new Trabajador(4,  numTrabajadoresIniciales[4], duracion, almacen, mutex);
        ensamblador= new Trabajador(5,  numTrabajadoresIniciales[5], duracion, almacen, mutex);
        pm = new ProjectManager(duracion,  mutex,  mutex2,  mutex3);
        director = new Director( duracion, almacen,  mutex,  mutex2,  mutex3, this);
    }
    
    @Override
    public void run() {
        while (true) {
            calcularCostos();
            calcularUtilidad();
  
            try {
                sleep(this.duracion * 1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    
    public void calcularCostos() {
        setCostos((int) (productorPlacaBase.getSalarioAcumulado() + productorCPUs.getSalarioAcumulado() + productorRAM.getSalarioAcumulado() + productorFuente.getSalarioAcumulado() + productorTGrafica.getSalarioAcumulado() + ensamblador.getSalarioAcumulado())); //Falta salario de PM y director
    }
    
    public void calcularUtilidad() {
        setUtilidad(getGanancia() - getCostos());
    }
    
    //Falta ver como calcular la ganancia
    
    public void añadirTrabajadores(int type) {
        int cantidadTrabajadoresActuales = (productorPlacaBase.getCantidadTrabajadores() + productorCPUs.getCantidadTrabajadores() + productorRAM.getCantidadTrabajadores() + productorFuente.getCantidadTrabajadores() + productorTGrafica.getCantidadTrabajadores());
        
        if (cantidadTrabajadoresActuales < getMaxTrabajadores()) {
            if (type == 0) {
                productorPlacaBase.contratar();
            }
            if (type == 1) {
                productorCPUs.contratar();
            }
            if (type == 2) {
                productorRAM.contratar();
            }
            if (type == 3) {
                productorFuente.contratar();
            }
            if (type == 4) {
                productorTGrafica.contratar();
            }
            if (type == 5) {
                ensamblador.contratar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Se ha alcanzado el limite de trabajadores");        }
    }
    
    
    
    public Trabajador getProductorPlacaBase() {
        return productorPlacaBase;
    }

    public void setProductorPlacaBase(Trabajador productorPlacaBase) {
        this.productorPlacaBase = productorPlacaBase;
    }

    public Trabajador getProductorCPUs() {
        return productorCPUs;
    }

    public void setProductorCPUs(Trabajador productorCPUs) {
        this.productorCPUs = productorCPUs;
    }

    public Trabajador getProductorRAM() {
        return productorRAM;
    }

    public void setProductorRAM(Trabajador productorRAM) {
        this.productorRAM = productorRAM;
    }

    public Trabajador getProductorFuente() {
        return productorFuente;
    }

    public void setProductorFuente(Trabajador productorFuente) {
        this.productorFuente = productorFuente;
    }

    public Trabajador getProductorTGrafica() {
        return productorTGrafica;
    }

    public void setProductorTGrafica(Trabajador productorTGrafica) {
        this.productorTGrafica = productorTGrafica;
    }

    public Trabajador getEnsamblador() {
        return ensamblador;
    }

    public void setEnsamblador(Trabajador ensamblador) {
        this.ensamblador = ensamblador;
    }

    public int getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancias) {
        this.ganancia = ganancias;
    }

    public int getCostos() {
        return costos;
    }

    public void setCostos(int costos) {
        this.costos = costos;
    }

    public int getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(int utilidad) {
        this.utilidad = utilidad;
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


    public int getMaxTrabajadores() {
        return maxTrabajadores;
    }

    public void setMaxTrabajadores(int maxTrabajadores) {
        this.maxTrabajadores = maxTrabajadores;
    }


    public Semaphore getMutex() {
        return mutex;
    }

    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
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

    public ProjectManager getPm() {
        return pm;
    }

    public void setPm(ProjectManager pm) {
        this.pm = pm;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
    
    
}