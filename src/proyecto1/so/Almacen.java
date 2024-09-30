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
    private static final int CAPACIDAD_MAXIMA_PLACAS_BASE = 25;
    private static final int CAPACIDAD_MAXIMA_CPU = 20;
    private static final int CAPACIDAD_MAXIMA_RAM = 55;
    private static final int CAPACIDAD_MAXIMA_FUENTE_ALIMENTACION = 35;
    private static final int CAPACIDAD_MAXIMA_TARJETA_GRAFICA = 10;

    private Semaphore semaphore; // Semaphore binario para control de acceso

    private int placasBaseDisponibles;
    private int cpusDisponibles;
    private int ramDisponibles;
    private int fuentesAlimentacionDisponibles;
    private int tarjetasGraficaDisponibles;

    public Almacen(Semaphore semaphore) {
        this.semaphore = semaphore;
        
        inicializarCapacidadMaxima();
    }

    private void inicializarCapacidadMaxima() {
        placasBaseDisponibles = CAPACIDAD_MAXIMA_PLACAS_BASE;
        cpusDisponibles = CAPACIDAD_MAXIMA_CPU;
        ramDisponibles = CAPACIDAD_MAXIMA_RAM;
        fuentesAlimentacionDisponibles = CAPACIDAD_MAXIMA_FUENTE_ALIMENTACION;
        tarjetasGraficaDisponibles = CAPACIDAD_MAXIMA_TARJETA_GRAFICA;
    }

    public synchronized boolean agregarComponente(int tipoComponente, int cantidad) throws InterruptedException {
        semaphore.acquire();

        try {
            switch (tipoComponente) {
                case 1: // Placas base
                    if (placasBaseDisponibles >= cantidad) {
                        placasBaseDisponibles -= cantidad;
                        return true;
                    }
                    break;
                case 2: // CPUs
                    if (cpusDisponibles >= cantidad) {
                        cpusDisponibles -= cantidad;
                        return true;
                    }
                    break;
                case 3: // RAM
                    if (ramDisponibles >= cantidad) {
                        ramDisponibles -= cantidad;
                        return true;
                    }
                    break;
                case 4: // Fuentes de alimentación
                    if (fuentesAlimentacionDisponibles >= cantidad) {
                        fuentesAlimentacionDisponibles -= cantidad;
                        return true;
                    }
                    break;
                case 5: // Tarjetas gráficas
                    if (tarjetasGraficaDisponibles >= cantidad) {
                        tarjetasGraficaDisponibles -= cantidad;
                        return true;
                    }
                    break;
            }
        } finally {
            semaphore.release();
        }

        return false;
    }

    public synchronized boolean retirarComponente(int tipoComponente, int cantidad) throws InterruptedException {
        semaphore.acquire();

        try {
            switch (tipoComponente) {
                case 1: // Placas base
                    if (placasBaseDisponibles >= cantidad) {
                        placasBaseDisponibles += cantidad;
                        return true;
                    }
                    break;
                case 2: // CPUs
                    if (cpusDisponibles >= cantidad) {
                        cpusDisponibles += cantidad;
                        return true;
                    }
                    break;
                case 3: // RAM
                    if (ramDisponibles >= cantidad) {
                        ramDisponibles += cantidad;
                        return true;
                    }
                    break;
                case 4: // Fuentes de alimentación
                    if (fuentesAlimentacionDisponibles >= cantidad) {
                        fuentesAlimentacionDisponibles += cantidad;
                        return true;
                    }
                    break;
                case 5: // Tarjetas gráficas
                    if (tarjetasGraficaDisponibles >= cantidad) {
                        tarjetasGraficaDisponibles += cantidad;
                        return true;
                    }
                    break;
            }
        } finally {
            semaphore.release();
        }

        return false;
    }

    public synchronized boolean verificarDisponibilidad(int tipoComponente, int cantidad) throws InterruptedException {
        semaphore.acquire();

        try {
            switch (tipoComponente) {
                case 1: // Placas base
                    return placasBaseDisponibles >= cantidad;
                case 2: // CPUs
                    return cpusDisponibles >= cantidad;
                case 3: // RAM
                    return ramDisponibles >= cantidad;
                case 4: // Fuentes de alimentación
                    return fuentesAlimentacionDisponibles >= cantidad;
                case 5: // Tarjetas gráficas
                    return tarjetasGraficaDisponibles >= cantidad;
            }
        } finally {
            semaphore.release();
        }

        return false;
    }

    public synchronized void limpiarAlmacen() throws InterruptedException {
        semaphore.acquire();

        try {
            placasBaseDisponibles = CAPACIDAD_MAXIMA_PLACAS_BASE;
            cpusDisponibles = CAPACIDAD_MAXIMA_CPU;
            ramDisponibles = CAPACIDAD_MAXIMA_RAM;
            fuentesAlimentacionDisponibles = CAPACIDAD_MAXIMA_FUENTE_ALIMENTACION;
            tarjetasGraficaDisponibles = CAPACIDAD_MAXIMA_TARJETA_GRAFICA;
        } finally {
            semaphore.release();
        }
    }

    // Métodos getter para obtener información sobre el estado del almacén
    public int getPlacasBaseDisponibles() {
        return placasBaseDisponibles;
    }

    public int getCpusDisponibles() {
        return cpusDisponibles;
    }

    public int getRamDisponibles() {
        return ramDisponibles;
    }

    public int getFuentesAlimentacionDisponibles() {
        return fuentesAlimentacionDisponibles;
    }

    public int getTarjetasGraficaDisponibles() {
        return tarjetasGraficaDisponibles;
    }

    
    // Método para calcular el costo total de producción
    public double calcularCostoProduccion(int numComputadoras) {
        double costoTotal = 0;
        costoTotal += numComputadoras * 20; // Costo de placa base
        costoTotal += numComputadoras * 26; // Costo de CPU
        costoTotal += numComputadoras * 40; // Costo de RAM
        costoTotal += numComputadoras * 16; // Costo de fuente de alimentación
        costoTotal += numComputadoras * 34; // Costo de tarjeta gráfica (promedio)
        return costoTotal;
    }

    
}
