/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oper;

/**
 *
 * @author Docente
 */
public class MostrarStock implements Observer{
    private Producto producto;
    
    public MostrarStock(Producto producto) {
        this.producto = producto;
        producto.registroObserver(this);
    }
    
    @Override
    public void update(int stock) {
        System.out.println("Stock actualizado para " + producto.getNombre() + ": " + stock + " artículos disponibles.");
    }
    
}
