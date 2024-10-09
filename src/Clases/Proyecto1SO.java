/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author User
 */
public class Proyecto1SO {

    /**
     * @param args the command line arguments
     */
    
    private static int deadline;
    private static int duracionDia;
    private static int[] numTrabajadoresIniciales_Apple = new int[6];
    private static int[] numTrabajadoresIniciales_HP = new int[6];
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        try (BufferedReader br = new BufferedReader(new FileReader("src\\Archivo\\Configuraciones.txt"))) {
            String linea;
            int indexApple = 0;
            int indexHP = 0;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",\\s*");
                String clave = partes[0];

                switch (clave) {
                    case "deadline":
                        deadline = Integer.parseInt(partes[1].trim());
                        break;
                    case "duracionDia":
                        duracionDia = Integer.parseInt(partes[1].trim());
                        break;
                    case "cantidadApple":
                        for (int i = 1; i < partes.length; i++) {
                            numTrabajadoresIniciales_Apple[indexApple++] = Integer.parseInt(partes[i].trim());
                        }
                        break;
                    case "cantidadHP":
                        for (int i = 1; i < partes.length; i++) {
                            numTrabajadoresIniciales_HP[indexHP++] = Integer.parseInt(partes[i].trim());
                        }
                        break;
                }
            }
            
            int [] diasParaFinalizarPiezas = {4, 4, 1, 1, 2}; //Ambas empresas comparten los mismos días
            
            //Creación empresa Apple
            int [] piezasNecesarias_Apple = {2, 1, 4, 4, 2, 5};
            
            Empresa apple = new Empresa(numTrabajadoresIniciales_Apple, piezasNecesarias_Apple, diasParaFinalizarPiezas, duracionDia, deadline, 19, 100000, 150000);
            
            
            //Creación empresa HP
            int [] piezasNecesarias_HP = {1, 1, 2, 4, 3, 2};
            
            Empresa hp = new Empresa(numTrabajadoresIniciales_HP, piezasNecesarias_HP, diasParaFinalizarPiezas,duracionDia, deadline, 20, 90000, 140000);
            
            Interfaz interfaz = new Interfaz(apple, hp, numTrabajadoresIniciales_Apple, numTrabajadoresIniciales_HP);
            interfaz.setLocationRelativeTo(null);
            interfaz.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
}
    

