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
            
            Almacen almacen = null;
            
            Empresa apple = new Empresa(almacen, numTrabajadoresIniciales_Apple, duracionDia, deadline, 19, 100000, 150000);
            
            Empresa hp = new Empresa(almacen, numTrabajadoresIniciales_HP, duracionDia, deadline, 20, 90000, 140000);
            
            Interfaz interfaz = new Interfaz(apple, hp, numTrabajadoresIniciales_Apple, numTrabajadoresIniciales_HP);
            interfaz.setLocationRelativeTo(null);
            interfaz.show();

//            System.out.println("Deadline: " + deadline);
//            System.out.println("Duracion Dia: " + duracionDia);
//            System.out.print("Cantidad Apple: ");
//            for (int cantidad : numTrabajadoresIniciales_Apple) {
//                System.out.print(cantidad + " ");
//            }
//            System.out.println();
//            System.out.print("Cantidad HP: ");
//            for (int cantidad : numTrabajadoresIniciales_HP) {
//                System.out.print(cantidad + " ");
//            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
 
        
        }
}
    

