
package oper;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Docente
 */
public class Producto {
    private final List<Observer> observers;
    private final String nombre;
    private int stock;

    public Producto(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
        observers = new ArrayList<>();
    }

    public void registroObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notificacionObservers() {
        for (Observer observer : observers) {
            observer.update(stock);
        }
    }

    public void setStock(int stock) {
        this.stock = stock;
        notificacionObservers();
    }

    public String getNombre() {
        return nombre;
    }
}
