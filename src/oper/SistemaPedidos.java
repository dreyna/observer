/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oper;

/**
 *
 * @author Docente
 */
public class SistemaPedidos implements Observer{
    private Producto producto;

    public SistemaPedidos(Producto producto) {
        this.producto = producto;
        producto.registroObserver(this);
    }

    @Override
    public void update(int stock) {
        if (stock == 0) {
            System.out.println("Sistema de pedidos: El producto " + producto.getNombre() + " No hay stock. No se pueden procesar los pedidos.");
        }
    }
    
}
