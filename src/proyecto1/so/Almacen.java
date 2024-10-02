/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.so;

/**
 *
 * @author User
 */
import java.util.concurrent.Semaphore;

public class Almacen {
    
    private int placaBase;
    private int cpu;
    private int ram;
    private int fuenteAlimentacion;
    private int tarjetaGrafica;
    private int computadora;
    private int computadoraPremium;
    private int placaBaseEnsamblaje;
    private int cpuEnsamblaje;
    private int ramEnsamblaje;
    private int fuenteAlimentacionEnsamblaje;
    private int tarjetaGraficaEnsamblaje;
    private int cantidad;
    private int contadorcap;
    private String name;

    public Almacen(String name, int placaBaseEnsamblaje, int cpuEnsamblaje, int ramEnsamblaje, int fuenteAlimentacionEnsamblaje, int tarjetaGraficaEnsamblaje, int cantidad) {
        this.placaBase = 0;
        this.cpu = 0;
        this.ram = 0;
        this.fuenteAlimentacion = 0;
        this.tarjetaGrafica = 0;
        this.computadoraPremium = 0;
        this.computadora = 0;
        this.placaBaseEnsamblaje = placaBaseEnsamblaje;
        this.cpuEnsamblaje = cpuEnsamblaje;
        this.ramEnsamblaje = ramEnsamblaje;
        this.fuenteAlimentacionEnsamblaje = fuenteAlimentacionEnsamblaje;
        this.tarjetaGraficaEnsamblaje = tarjetaGraficaEnsamblaje;
        this.cantidad = cantidad;
        this.contadorcap = 0;
        this.name = name;
    }
    
    public void addPart(int type, int cantidad) {

        switch (type) {
            case 0 -> {
                
                    if (this.placaBase <= 25 && (this.placaBase + cantidad) <= 25) {
                        this.placaBase += cantidad;
                    } else {
                        this.placaBase = 25;
                    }
         
            }
            case 1 -> {
                if (this.cpu <= 20 && (this.cpu + cantidad) <= 20) {
                    this.cpu += cantidad;
                } else {
                    this.cpu = 20;
                }
            }
            case 2 -> {
                if (this.ram <= 25 && (this.ram + cantidad) <= 25) {
                    this.ram += cantidad;
                } else {
                    this.ram = 25;
                }
            }
            case 3 -> {
                
                    if (this.fuenteAlimentacion <= 35 && (this.fuenteAlimentacion + 5 * cantidad) <= 35) {
                        this.fuenteAlimentacion += 5 * cantidad;
                    } else {
                        this.fuenteAlimentacion = 35;
                    }
                
            }
            default -> {
                if (this.tarjetaGrafica <= 10 && (this.tarjetaGrafica + cantidad) <= 10) {
                    this.tarjetaGrafica += cantidad;
                } else {
                    this.tarjetaGrafica = 10;
                }
            }
        }
    }

}
