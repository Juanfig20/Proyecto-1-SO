/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.so;

/**
 *
 * @author manza
 */
public class Ensamblador extends Thread{
    private int salario;
    private float salarioAcumulado;
    private int cantidadTrabajadores;
    private int duracionDia;
    private int diasRestantes;
    private int contadorDias;
    private Almacen almacen;
    //private Semaforo semaforo;

    public Ensamblador(int salario, float salarioAcumulado, int cantidadTrabajadores, int duracionDia, int diasRestantes, int contadorDias, Almacen almacen) {
        this.salario = salario;
        this.salarioAcumulado = salarioAcumulado;
        this.cantidadTrabajadores = cantidadTrabajadores;
        this.duracionDia = duracionDia;
        this.diasRestantes = diasRestantes;
        this.contadorDias = contadorDias;
        this.almacen = almacen;
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
    
    
}
