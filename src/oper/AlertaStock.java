
package oper;

/**
 *
 * @author Docente
 */
public class AlertaStock implements Observer{

    private Producto producto;
    private int limite;

    public AlertaStock (Producto producto, int limite) {
        this.producto = producto;
        this.limite = limite;
        producto.registroObserver(this);
    }

    @Override
    public void update(int stock) {
        if (stock < limite) {
            System.out.println("Alerta: Stock para " + producto.getNombre()+ " es bajo (" + stock + " artículos restantes)!");
        }
    }
    
}
