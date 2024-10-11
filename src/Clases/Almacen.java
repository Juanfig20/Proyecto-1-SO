/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author User
 */
import java.util.concurrent.Semaphore;
import javax.swing.JLabel;

public class Almacen {
    
    private int placaBase;
    private int cpu;
    private int ram;
    private int fuenteAlimentacion;
    private int tarjetaGrafica;
    private int computadora;
    private int computadoraPremium;
    private int contadorcompus;
    private int [] piezasNecesarias;
    private Empresa empresa;
    private JLabel [] labels;

    public Almacen(Empresa empresa, int [] piezasNecesarias) {
        this.placaBase = 0;
        this.cpu = 0;
        this.ram = 0;
        this.fuenteAlimentacion = 0;
        this.tarjetaGrafica = 0;
        this.computadoraPremium = 0;
        this.computadora = 0;
        this.piezasNecesarias = piezasNecesarias;
        this.contadorcompus = 0;
        this.empresa = empresa;
    }
         
    public void añadirParte(int tipo, int cantidadTrabajadores) {
        if (tipo == 0 && this.getPlacaBase()< 25){
            int calc = this.getPlacaBase() + (cantidadTrabajadores);
            if (calc < 25) {
                this.setPlacaBase(calc);
            } else {
                this.setPlacaBase(25);
            }
            this.labels[tipo].setText(Integer.toString(this.getPlacaBase()));
        }
        else if (tipo == 1 && this.getCpu()< 20){
            int calc = this.getCpu()+ (cantidadTrabajadores);
            if (calc < 20) {
                this.setCpu(calc);
            } else {
                this.setCpu(20);
            }
            this.labels[tipo].setText(Integer.toString(this.getCpu()));
        }
        else if (tipo == 2 && this.getRam()< 55){
            int calc = this.getRam()+ (cantidadTrabajadores);
            if (calc < 55) {
                this.setRam(calc);
            } else {
                this.setRam(55);
            }
            this.labels[tipo].setText(Integer.toString(this.getRam()));
        }
        else if (tipo == 3 && this.getFuenteAlimentacion()< 35){
            int calc = this.getFuenteAlimentacion() + (cantidadTrabajadores);
            if (calc < 35) {
                this.setFuenteAlimentacion(calc);
            } else {
                this.setFuenteAlimentacion(35);
            }
            this.labels[tipo].setText(Integer.toString(this.getFuenteAlimentacion()));
        }
        else if (tipo == 4 && this.getTarjetaGrafica()< 10){
            int calc = this.getTarjetaGrafica()+ (cantidadTrabajadores);
            if (calc < 10) {
                this.setTarjetaGrafica(calc);
            } else {
                this.setTarjetaGrafica(10);
            }
            this.labels[tipo].setText(Integer.toString(this.getTarjetaGrafica()));
        }
        check();
    }
    
    public boolean check(){
        boolean ready = false;
        if (placaBase >= piezasNecesarias[0] &&  cpu >= piezasNecesarias[1] && ram >= piezasNecesarias[2] && fuenteAlimentacion >= piezasNecesarias[3]){
            ready= true;
        } 
        
        return ready;
    }
    
    public void añadirComputador(int cantidadEnsambladores){
        int cantidadCompus = cantidadEnsambladores;
        
        // Placas bases
        int cantidad = calcularPosiblesComputadoras(placaBase, 0);
        if (cantidad < cantidadCompus){
            cantidadCompus = cantidad;
        }
        
        // CPUs
        cantidad = calcularPosiblesComputadoras(cpu, 1);
        if (cantidad < cantidadCompus){
            cantidadCompus = cantidad;
        }
        
        // Memorias RAM
        cantidad = calcularPosiblesComputadoras(ram, 2);
        if (cantidad < cantidadCompus){
            cantidadCompus = cantidad;
        }
        
        // Fuentes de alimentación
        cantidad = calcularPosiblesComputadoras(fuenteAlimentacion, 3);
        if (cantidad < cantidadCompus){
            cantidadCompus = cantidad;
        }
        
        placaBase -= (piezasNecesarias[0]*cantidadCompus);
        this.labels[0].setText(Integer.toString(this.getPlacaBase()));
        cpu -= (piezasNecesarias[1]*cantidadCompus);
        this.labels[1].setText(Integer.toString(this.getCpu()));
        ram -= (piezasNecesarias[2]*cantidadCompus);
        this.labels[2].setText(Integer.toString(this.getRam()));
        fuenteAlimentacion -= (piezasNecesarias[3]*cantidadCompus);
        this.labels[3].setText(Integer.toString(this.getFuenteAlimentacion()));
        
        while (contadorcompus >= piezasNecesarias[5] && tarjetaGrafica >= piezasNecesarias[4] && cantidadCompus > 0){
            computadoraPremium += 1;
            tarjetaGrafica -= piezasNecesarias[4];
            contadorcompus -= piezasNecesarias[5];
            cantidadCompus -= 1;
        }    
        
        this.labels[4].setText(Integer.toString(this.getTarjetaGrafica()));
        computadora += cantidadCompus;
        contadorcompus += cantidadCompus;
        
        this.labels[5].setText(Integer.toString(computadora));
        this.labels[6].setText(Integer.toString(computadoraPremium));
    }
     
    public int calcularPosiblesComputadoras(int valor, int tipo){
        int cantidad = valor;
        int quantity = 0;
        while (cantidad > 0){
            int resto = cantidad - piezasNecesarias[tipo];
            if (resto >= 0){
                quantity += 1;
            }
            cantidad = resto;
        }
        return quantity;
    }
     
    public void enviarComputadores() {
        this.empresa.setGanancia(this.empresa.getGanancia() + (this.empresa.getPrecioCompu()*computadora));
        this.empresa.setGanancia(this.empresa.getGanancia() + this.empresa.getPrecioPremium()*computadoraPremium);
        this.labels[7].setText(Integer.toString(this.empresa.getGanancia()));
        computadora = 0;
        computadoraPremium = 0;
        this.labels[5].setText(Integer.toString(computadora));
        this.labels[6].setText(Integer.toString(computadoraPremium));
    }

    public JLabel[] getLabels() {
        return labels;
    }

    public void setLabels(JLabel[] labels) {
        this.labels = labels;
    }

    public int getPlacaBase() {
        return placaBase;
    }

    public void setPlacaBase(int placaBase) {
        this.placaBase = placaBase;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getFuenteAlimentacion() {
        return fuenteAlimentacion;
    }

    public void setFuenteAlimentacion(int fuenteAlimentacion) {
        this.fuenteAlimentacion = fuenteAlimentacion;
    }

    public int getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(int tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }
     
}
