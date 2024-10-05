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
public class Trabajador extends Thread{
    private int tipoTrabajador;
    private int salario;
    private float salarioAcumulado;
    private int cantidadTrabajadores;
    private int duracionDia;
    private int diasRestantes;
    private int contadorDias;
    private Almacen almacen;
    private Semaphore mutex;

    public Trabajador(int tipo, int cantidadTrabajadores, int duracionDia, Almacen almacen, Semaphore mutex) {
        this.tipoTrabajador = tipoTrabajador;
        this.salario = 0;
        this.salarioAcumulado = 0;
        this.cantidadTrabajadores = cantidadTrabajadores;
        this.duracionDia = duracionDia;
        this.diasRestantes = diasRestantes;
        this.contadorDias = 0;
        this.almacen = almacen;
        this.mutex = mutex;
        
         /* 
      Si type = 0, Productores de Placa Base  
      Si type =1, Productores de CPUs  
      Si type =2, Productores de Memoria RAM                
      Si type =3, Productores de fuente de alimentacion       
      Si type =4, Productors de tarjetas graficas    
      Si type =5, Ensamblador            
         */
      
        if (tipoTrabajador == 0) {
            salario += 20;
        } else if (tipoTrabajador == 1) {
            salario += 26;
        } else if (tipoTrabajador == 2) {
            salario += 40;
        } else if (tipoTrabajador == 3) {
            salario += 16;
        } else if (tipoTrabajador == 4) {
            salario += 34;
        } else {
            salario += 50;
        }
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                pagar();
                trabajar ();
                sleep((this.duracionDia)*1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Trabajador.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    public void pagar(){
        this.setSalarioAcumulado(this.getSalarioAcumulado() + ((this.getSalario() * 24)) * this.getCantidadTrabajadores());
    }
    
    public void trabajar() {
    this.setContadorDias(this.getContadorDias() + 1);
    
    if (this.tipoTrabajador == 5) { // Solo los ensambladores (tipo 5) ensamblan computadoras
        // Ensamblaje de computadoras
        if (this.getContadorDias() >= this.getDiasRestantes()) { //Dias restantes depende de la compania
            try {
                this.getMutex().acquire(); //wait
                this.getAlmacen().ensamblar(); // Método ensamblar computadora en la clase Almacen
                this.getMutex().release(); // signal
                this.setContadorDias(0);
            } catch (InterruptedException ex) {
                Logger.getLogger(Trabajador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    } else {
        // Lógica para otros trabajadores que producen partes
        if (this.getContadorDias() >= this.getDiasRestantes()) {
            try {
                this.getMutex().acquire(); //wait
                this.getAlmacen().addPart(this.getTipoTrabajador(), this.getCantidadTrabajadores()); 
                this.getMutex().release(); // signal
                this.setContadorDias(0);
            } catch (InterruptedException ex) {
                Logger.getLogger(Trabajador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
    
     public void despedir() {
        if (this.getCantidadTrabajadores() != 1) {
            this.setCantidadTrabajadores(this.cantidadTrabajadores - 1);
        } else {
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        }
    }
    
    public void contratar(){
        this.setCantidadTrabajadores(cantidadTrabajadores + 1);
    }
     

    public int getTipoTrabajador() {
        return tipoTrabajador;
    }

    public void setTipoTrabajador(int tipoTrabajador) {
        this.tipoTrabajador = tipoTrabajador;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public float getSalarioAcumulado() {
        return salarioAcumulado;
    }

    public void setSalarioAcumulado(float salarioAcumulado) {
        this.salarioAcumulado = salarioAcumulado;
    }

    public int getCantidadTrabajadores() {
        return cantidadTrabajadores;
    }

    public void setCantidadTrabajadores(int cantidadTrabajadores) {
        this.cantidadTrabajadores = cantidadTrabajadores;
    }

    public int getDuracionDia() {
        return duracionDia;
    }

    public void setDuracionDia(int duracionDia) {
        this.duracionDia = duracionDia;
    }

    public int getDiasRestantes() {
        return diasRestantes;
    }

    public void setDiasRestantes(int diasRestantes) {
        this.diasRestantes = diasRestantes;
    }

    public int getContadorDias() {
        return contadorDias;
    }

    public void setContadorDias(int contadorDias) {
        this.contadorDias = contadorDias;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public Semaphore getMutex() {
        return mutex;
    }
    
    
}

