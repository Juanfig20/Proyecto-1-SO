/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.concurrent.Semaphore;
import javax.swing.JOptionPane;

/**
 *
 * @author manza
 */
public class Compañia extends Thread{
    private Trabajador productorPlacaBase;
    private Trabajador productorCPUs;
    private Trabajador productorRAM;
    private Trabajador productorFuente;
    private Trabajador productorTGrafica;
    private Trabajador ensamblador;
    //private ProjectManager pm;    Faltan Getters y Setters
    //private Director director;    Faltan Getters y Setters
    private int ganancias;
    private int costos;
    private int utilidad;
    private int precioComputadorEst;
    private int precioComputadorConTG;
    private int maxTrabajadores;
    private int diasParaDeadline;
    private Semaphore mutex;
    private Almacen almacen;
    private int [] piezasNecesarias;
    private int [] diasParaProducir;
    private int [] cantidadTrabajadores;

    public Compañia(int[] piezasNecesarias, int[] diasParaProducir, int[] cantidadTrabajadores, int precioComputadorEst, int precioComputadorConTG, int maxTrabajadores, int diasParaDeadline) {
        this.ganancias = 0;
        this.costos = 0;
        this.utilidad = 0;
        this.precioComputadorEst = precioComputadorEst;
        this.precioComputadorConTG = precioComputadorConTG;
        this.maxTrabajadores = maxTrabajadores;
        this.diasParaDeadline = diasParaDeadline;
        this.mutex = new Semaphore(1);
        this.almacen = almacen;
        this.piezasNecesarias = piezasNecesarias;
        this.diasParaProducir = diasParaProducir;
        this.cantidadTrabajadores = cantidadTrabajadores;
    }

    
    public void calcularCostos() {
        setCostos((int) (productorPlacaBase.getSalarioAcumulado() + productorCPUs.getSalarioAcumulado() + productorRAM.getSalarioAcumulado() + productorFuente.getSalarioAcumulado() + productorTGrafica.getSalarioAcumulado() + ensamblador.getSalarioAcumulado())); //Falta salario de PM y director
    }
    
    public void calcularUtilidad() {
        setUtilidad(getGanancias() - getCostos());
    }
    
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

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
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

    public int getPrecioComputadorEst() {
        return precioComputadorEst;
    }

    public void setPrecioComputadorEst(int precioComputadorEst) {
        this.precioComputadorEst = precioComputadorEst;
    }

    public int getPrecioComputadorConTG() {
        return precioComputadorConTG;
    }

    public void setPrecioComputadorConTG(int precioComputadorConTG) {
        this.precioComputadorConTG = precioComputadorConTG;
    }

    public int getMaxTrabajadores() {
        return maxTrabajadores;
    }

    public void setMaxTrabajadores(int maxTrabajadores) {
        this.maxTrabajadores = maxTrabajadores;
    }

    public int getDiasParaDeadline() {
        return diasParaDeadline;
    }

    public void setDiasParaDeadline(int diasParaDeadline) {
        this.diasParaDeadline = diasParaDeadline;
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
    
}
