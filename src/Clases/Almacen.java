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
//    private int placaBaseEnsamblaje;
//    private int cpuEnsamblaje;
//    private int ramEnsamblaje;
//    private int fuenteAlimentacionEnsamblaje;
//    private int tarjetaGraficaEnsamblaje;
//    private int cantidad; // Esta es la cantidad de computadoras necesaria para crear una con tarjeta grafica
    private int contadorcompus;
    private int [] piezasNecesarias;
    private Empresa empresa;
    private JLabel [] labels;

    public Almacen(int [] piezasNecesarias, Empresa empresa) {
        this.placaBase = 0;
        this.cpu = 0;
        this.ram = 0;
        this.fuenteAlimentacion = 0;
        this.tarjetaGrafica = 0;
        this.computadoraPremium = 0;
        this.computadora = 0;
//        this.placaBaseEnsamblaje = placaBaseEnsamblaje;
//        this.cpuEnsamblaje = cpuEnsamblaje;
//        this.ramEnsamblaje = ramEnsamblaje;
//        this.fuenteAlimentacionEnsamblaje = fuenteAlimentacionEnsamblaje;
//        this.tarjetaGraficaEnsamblaje = tarjetaGraficaEnsamblaje;
//        this.cantidad = cantidad;
        this.piezasNecesarias = piezasNecesarias;
        this.contadorcompus = 0;
        this.empresa = empresa;
        //Las de nombre ensamblaje son la cantidad necesaria para ensamblar una compania 
    }
    
//    public void añadirParte(int tipo, int cantidad) {
//        switch (tipo) {
//            case 0 -> {
//                if (this.placaBase <= 25 && (this.placaBase + cantidad) <= 25) {
//                    this.placaBase += cantidad;
//                } else {
//                     this.placaBase = 25;
//                }
//                this.labels[tipo].setText(Integer.toString(this.getPlacaBase()));           
//            }
//            
//            case 1 -> {
//                if (this.cpu <= 20 && (this.cpu + cantidad) <= 20) {
//                    this.cpu += cantidad;
//                } else {
//                    this.cpu = 20;
//                }
//                this.labels[tipo].setText(Integer.toString(this.getCpu()));
//            }
//            
//            case 2 -> {
//                if (this.ram <= 25 && (this.ram + cantidad) <= 25) {
//                    this.ram += cantidad;
//                } else {
//                    this.ram = 25;
//                }
//                this.labels[tipo].setText(Integer.toString(this.getRam()));
//            }
//            
//            case 3 -> {
//                
//                if (this.fuenteAlimentacion <= 35 && (this.fuenteAlimentacion + 5 * cantidad) <= 35) {
//                    this.fuenteAlimentacion += 5 * cantidad;
//                } else {
//                     this.fuenteAlimentacion = 35;
//                }
//                this.labels[tipo].setText(Integer.toString(this.getFuenteAlimentacion()));
//            }
//            
//            default -> {
//                if (this.tarjetaGrafica <= 10 && (this.tarjetaGrafica + cantidad) <= 10) {
//                    this.tarjetaGrafica += cantidad;
//                } else {
//                    this.tarjetaGrafica = 10;
//                }
//                this.labels[tipo].setText(Integer.toString(this.getTarjetaGrafica()));
//            }
//        }
//    }

//    public void ensamblar() {
//        if (this.placaBase >= this.placaBaseEnsamblaje 
//            && this.cpu >= this.cpuEnsamblaje
//            && this.ram >= this.ramEnsamblaje
//            && this.fuenteAlimentacion >= this.fuenteAlimentacionEnsamblaje) {
//
//            // Ensamblar computadoras normales
//            this.placaBase -= this.placaBaseEnsamblaje;
//            this.cpu -= this.cpuEnsamblaje;
//            this.ram -= this.ramEnsamblaje;
//            this.fuenteAlimentacion -= this.fuenteAlimentacionEnsamblaje;
//            this.computadora ++;  // Se ensamblan computadoras
//            this.labels[5].setText(Integer.toString(computadora));
//            this.contadorcompus ++ ;
//
//            // Verificar si hay tarjetas gráficas para computadoras premium
//            if (this.tarjetaGrafica >= this.tarjetaGraficaEnsamblaje && this.contadorcompus >= this.cantidad) {
//                this.tarjetaGrafica -= this.tarjetaGraficaEnsamblaje;
//                this.computadoraPremium ++;  // Se ensamblan computadoras premium
//                this.labels[6].setText(Integer.toString(computadoraPremium));
//                this.contadorcompus = 0 ;
//            }
//        }
//    }
    
//     public void mandarCompus() {
//        this.empresa.setGanancia(this.empresa.getGanancia() + (this.empresa.getPrecioCompu()*computadora));
//        this.empresa.setGanancia(this.empresa.getGanancia() + this.empresa.getPrecioPremium()*computadoraPremium);
//        this.labels[7].setText(Integer.toString(this.empresa.getGanancia()));
//   
//        computadora = 0;
//        computadoraPremium = 0;
//   
//    }
     
     //----------------------------------
     
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
            int calc = this.getCpu()+ ( cantidadTrabajadores);
            if (calc < 20) {
                this.setCpu(calc);
            } else {
                this.setCpu(20);
            }
            this.labels[tipo].setText(Integer.toString(this.getCpu()));
        }
        else if (tipo == 2 && this.getRam()< 55){
            int calc = this.getRam()+ ( cantidadTrabajadores);
            if (calc < 55) {
                this.setRam(calc);
            } else {
                this.setRam(55);
            }
            this.labels[tipo].setText(Integer.toString(this.getRam()));
        }
        else if (tipo == 3 && this.getFuenteAlimentacion()< 35){
            int calc = this.getFuenteAlimentacion() + (5 * cantidadTrabajadores);
            if (calc < 35) {
                this.setFuenteAlimentacion(calc);
            } else {
                this.setFuenteAlimentacion(35);
            }
            this.labels[tipo].setText(Integer.toString(this.getFuenteAlimentacion()));
        }
        else if (tipo == 4 && this.getTarjetaGrafica()< 10){
            int calc = this.getTarjetaGrafica()+ ( cantidadTrabajadores);
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
        int cantidadCapitulos = cantidadEnsambladores;
        
        // Placas bases
        int quantity = calcularPosiblesComputadoras(placaBase, 0);
        if (quantity < cantidadCapitulos){
            cantidadCapitulos = quantity;
        }
        
        // CPUs
        quantity = calcularPosiblesComputadoras(cpu, 1);
        if (quantity < cantidadCapitulos){
            cantidadCapitulos = quantity;
        }
        
        // Memorias RAM
        quantity = calcularPosiblesComputadoras(ram, 2);
        if (quantity < cantidadCapitulos){
            cantidadCapitulos = quantity;
        }
        
        // Fuentes de alimentación
        quantity = calcularPosiblesComputadoras(fuenteAlimentacion, 3);
        if (quantity < cantidadCapitulos){
            cantidadCapitulos = quantity;
        }
        
        placaBase -= (piezasNecesarias[0]*cantidadCapitulos);
        this.labels[0].setText(Integer.toString(this.getPlacaBase()));
        cpu -= (piezasNecesarias[1]*cantidadCapitulos);
        this.labels[1].setText(Integer.toString(this.getCpu()));
        ram -= (piezasNecesarias[2]*cantidadCapitulos);
        this.labels[2].setText(Integer.toString(this.getRam()));
        fuenteAlimentacion -= (piezasNecesarias[3]*cantidadCapitulos);
        this.labels[3].setText(Integer.toString(this.getFuenteAlimentacion()));
        
        
        while (contadorcompus >= piezasNecesarias[5] && tarjetaGrafica >= piezasNecesarias[4] && cantidadCapitulos > 0){
            computadoraPremium += 1;
            tarjetaGrafica -= piezasNecesarias[4];
            contadorcompus -= piezasNecesarias[5];
            cantidadCapitulos -= 1;
        }        
        this.labels[4].setText(Integer.toString(this.getTarjetaGrafica()));
        computadora += cantidadCapitulos;
        contadorcompus += cantidadCapitulos;
        
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
