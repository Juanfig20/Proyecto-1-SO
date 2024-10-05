/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class Director extends Thread {
    private float salarioAcumulado;
    private int duracionDia;
    private int salario;
    private Almacen almacen;
    private int contadorDias;
    private int diasTerminar;
    private String estado;
    private Semaphore mutex;
    private Semaphore mutex2;
    private Semaphore mutex3;
    private Empresa empresa;
    private int reinicioDeadline;
    private boolean directorMode;
    private JLabel[] labels;
    
    public Director(int duracionDia, Almacen almacen, Semaphore mutex, Semaphore mutex2, Semaphore mutex3, Empresa empresa) {
        this.salarioAcumulado = 0;
        this.duracionDia = duracionDia;
        this.almacen = almacen;
        this.contadorDias = 0;
        this.mutex = mutex;
        this.mutex2 = mutex2;
        this.mutex3 = mutex3;
        this.salario = 60;
        this.diasTerminar = 1;
        this.empresa = empresa;
        this.reinicioDeadline = empresa.getDeadline();
        this.directorMode = false;
    }
    
     @Override
    public void run(){
        while(true) {
            try {  
                pago();
                checkDeadline();
                if (directorMode) {
                    estado = "Enviando Computadoras";
                    work();
                    sleep(this.duracionDia);
                }else{
                    double randomHour = Math.random( )*23;
                    int random = (int)randomHour;
                    sleep((this.duracionDia*random)/24);
                    
                    estado = "Revisando Project Manager";
                    checkPM();
                    sleep((duracionDia*30)/(24*60));
                    checkPM();
                    sleep((duracionDia*5)/(24*60));                    
                    
                    estado = "Labores Administrativas";
                    sleep((duracionDia*25)/(60*24));
                    sleep((this.duracionDia*(23-random))/24);
                }
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Trabajador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void pago(){
        this.salarioAcumulado = this.salarioAcumulado + (this.salario * 24);
    }
    

    public void checkDeadline(){
        try {
            this.mutex2.acquire(); //wait
            if (this.empresa.getDeadline() == 0) {
                directorMode = true;
                this.empresa.setDeadline(reinicioDeadline);
            }
            this.mutex2.release(); // signal
        } catch (InterruptedException ex) {
            Logger.getLogger(Trabajador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void work(){
        this.contadorDias = this.contadorDias + 1;
        if (this.contadorDias == this.diasTerminar){ // ese valor de 2 depende de la compania
            try {
                this.mutex.acquire(); //wait
                getAlmacen().mandarCompus();
                this.mutex.release(); // signal
                this.contadorDias = 0;
                directorMode = false;
            } catch (InterruptedException ex) {
                Logger.getLogger(Trabajador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
    }
    
    public void checkPM(){
        if (empresa.getPm().getEstado().equals("Viendo One Piece")){
            empresa.getPm().setFalta(empresa.getPm().getFalta() + 1);
            empresa.getPm().setDescuento(empresa.getPm().getDescuento() + 100); 
            try {
                this.mutex3.acquire(); //wait
                empresa.getPm().setSalarioAcumulado(empresa.getPm().getSalarioAcumulado() - 100);   
                this.mutex3.release(); // signal
            } catch (InterruptedException ex) {
                Logger.getLogger(Trabajador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public float getSalarioAcumulado() {
        return salarioAcumulado;
    }

    public void setSalarioAcumulado(float salarioAcumulado) {
        this.salarioAcumulado = salarioAcumulado;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    
}


