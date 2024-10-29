/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import oper.AlertaStock;
import oper.MostrarStock;
import oper.Producto;
import oper.SistemaPedidos;

/**
 *
 * @author Docente
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto laptop = new Producto("Laptop", 10);
        
        MostrarStock ms = new MostrarStock(laptop);
        AlertaStock sa= new AlertaStock(laptop, 5);
        SistemaPedidos sp= new SistemaPedidos(laptop);

        // Simulando cambios en el stock
        laptop.setStock(9); // Stock actualizado
        laptop.setStock(4); // Stock bajo, se envía alerta
        laptop.setStock(0); // Producto fuera de stock
    }
    
}
