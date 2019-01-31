
package libreria;

/**
 *
 * @author cromerofajar
 */
public class Libreria {

    public static void main(String[] args) {
        IO Ventana=IO.crearIO(IO.VENTANA);
        IO Consola=IO.crearIO(IO.CONSOLA);
        IO.Introducir(IO.DOUBLE, IO.VENTANA, "PRUEBA");
        Ventana.mostrar(IO.obx.numeroD);
        Consola.mostrar(IO.obx.numeroD);
    }
    
}
