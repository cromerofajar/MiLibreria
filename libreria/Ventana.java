package libreria;

import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class Ventana extends IO{

    @Override
    public void mostrar(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    @Override
    public void mostrar(int numero) {
        JOptionPane.showMessageDialog(null, numero);
    }

    @Override
    public void mostrar(float numero) {
        JOptionPane.showMessageDialog(null, numero);
    }

    @Override
    public void mostrar(double numero) {
        JOptionPane.showMessageDialog(null, numero);
    }
    
}
