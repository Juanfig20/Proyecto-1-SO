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
public class ProjectManager extends Thread {
    private float salarioAcumulado;
    private int duracionDia;
    private int salario;
    private int falta;
    private int descuento;
    private String estado;
    private int contadorHoras;
    private int contadorMin;
    private int daysPassedTotal;
    private Semaphore mutex;
    private Empresa empresa;
    private Semaphore mutex2;
    private Semaphore mutex3;
    private JLabel [] labels;
    
    public ProjectManager(int duracionDia, Semaphore mutex, Semaphore mutex2, Semaphore mutex3){
        this.salarioAcumulado = 0;
        this.duracionDia = duracionDia;
        this.salario = 40;
        this.falta = 0;
        this.descuento = 0;
        this.daysPassedTotal = 0;
        this.estado = "Viendo One Piece";
        this.mutex = mutex;
        this.mutex3 = mutex3;
        this.mutex2 = mutex2;
        this.empresa = empresa;
    }
    
     @Override
    public void run(){
        while(true) {
            try {
                pagar();
                // Primeras 16 horas
                long startTime = System.currentTimeMillis();
                while(System.currentTimeMillis() - startTime <= ((duracionDia/24)*16)){
                    estado = "Viendo One Piece";
                    sleep(((duracionDia/24)/2));

                    estado = "Revisando";
                    sleep(((duracionDia/24)/2));
                }
                
                // Restantes 8 horas
                estado = "Trabajando";
                work(); 
                setDaysPassedTotal(getDaysPassedTotal() + 1);
                sleep((duracionDia/24)*8);
            } catch (InterruptedException ex) {
                Logger.getLogger(Trabajador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void work(){
        try {
            this.mutex2.acquire(); //wait
            this.empresa.setDeadline(this.empresa.getDeadline() - 1); 
            this.mutex2.release(); // signal
        } catch (InterruptedException ex) {
            Logger.getLogger(Trabajador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void pagar() {
        this.salarioAcumulado += this.salario * 24;
        
    }

    public int getDaysPassedTotal() {
        return daysPassedTotal;
    }

    public void setDaysPassedTotal(int daysPassedTotal) {
        this.daysPassedTotal = daysPassedTotal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
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

    public JLabel[] getLabels() {
        return labels;
    }

    public void setLabels(JLabel[] labels) {
        this.labels = labels;
    }
    
    
}
