package libreria;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */


public abstract class IO implements InterfazComunes{
    /**
     * datos object used to implement variables
     */
    static class datos{
         int numeroI;
         float numeroF;
         double numeroD;
         String texto; 
    }
    
    static datos obx=new datos();
    /**
     *  CONSOLA: It is used to select the console
     */
    public static final int CONSOLA=0;
    /**
     *  VENTANA: It is used to select the window
     */
    public static final int VENTANA=1;
    /**
     *  mensaje: Text to lock in the console or in the windows
     */
    private static String mensaje;

    /**
     *  INT: Select int variable
     */
    public static final int INT=2;
    /**
     *  FLOAT: Select float variable
     */
    public static final int FLOAT=3;
    /**
     *  DOUBLE: Select double variable
     */
    public static final int DOUBLE=4;
    /**
     *  STRING: Select String variable
     */
    public static final int STRING=5;

        
    public static IO crearIO(int tipo){
        IO nuevoIO;
        switch(tipo){
            case CONSOLA: 
               nuevoIO=new Consola();
               break;
               
            case VENTANA:
               nuevoIO=new Ventana();
               break;
            
            default:
                nuevoIO=null;
        }
        return nuevoIO;
    }
    
    /*Tipo*/
    /**
     * 
     * @param tipo Select type of the data to introduce
     * @param selector Select Consola or Ventana to select the visualization mode
     * @param mensaje Print message.
     */
    public static void Introducir(int tipo,int selector,String mensaje){
        switch(tipo){
            case INT: selectorIntroI(selector,mensaje);
                          break;
            case FLOAT:  selectorIntroF(selector,mensaje);
                          break;
            case DOUBLE: selectorIntroD(selector,mensaje);
                          break;
            case STRING: selectorIntroS(selector,mensaje);
                          break;
        }

    }
    /*Int*/
    private static void pconsolaI(){
        Scanner ler=new Scanner(System.in);
        obx.numeroI=ler.nextInt();
    }
    private static void pventanaI(){
        obx.numeroI=Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
    }
    
    /**
     * 
     * @param selector Select Consola or Ventana to select the visualization mode
     * @param mensaje Print message.
     */
    private static void selectorIntroI(int selector,String mensaje){
        switch (selector){
            case CONSOLA: System.out.println(mensaje);
                          pconsolaI();
                          break;
            case VENTANA: IO.mensaje=mensaje;
                          pventanaI();
                          break;
        }
    }   
     
    /*String*/
    private static void pconsolaS(){
        Scanner ler=new Scanner(System.in);
        obx.texto=ler.next();
    }
    private static void pventanaS(){
        obx.texto=JOptionPane.showInputDialog(null,mensaje);
    }
    
    /**
     * 
     * @param selector if you put 0 in the selector you select consola and if you put 1 you select ventana.
     * @param mensaje print message.
     */
    private static void selectorIntroS(int selector,String mensaje){
        switch (selector){
            case CONSOLA: System.out.println(mensaje);
                          pconsolaS();
                          break;
            case VENTANA: IO.mensaje=mensaje;
                          pventanaS();
                          break;
    }
    }

    /*Float*/
    private static void pconsolaF(){
        Scanner ler=new Scanner(System.in);
        obx.numeroF=ler.nextFloat();
    }
    private static void pventanaF(){
        obx.numeroF=Float.parseFloat(JOptionPane.showInputDialog(null,mensaje));
    }
    
    /**
     * 
     * @param selector if you put 0 in the selector you select consola and if you put 1 you select ventana.
     * @param mensaje print message.
     */
    private static void selectorIntroF(int selector,String mensaje){
        switch (selector){
            case CONSOLA: System.out.println(mensaje);
                          pconsolaF();
                          break;
            case VENTANA: IO.mensaje=mensaje;
                          pventanaF();
                          break;
        }
    }
  
    /*Double*/
    private static void pconsolaD(){
        Scanner ler=new Scanner(System.in);
        obx.numeroD=ler.nextFloat();
    }
    private static void pventanaD(){
        obx.numeroD=Double.parseDouble(JOptionPane.showInputDialog(null,mensaje));
    }
    
    /**
     * 
     * @param selector if you put 0 in the selector you select consola and if you put 1 you select ventana.
     * @param mensaje print message.
     */
    private static void selectorIntroD(int selector,String mensaje){
        switch (selector){
            case CONSOLA: System.out.println(mensaje);
                          pconsolaD();
                          break;
            case VENTANA: IO.mensaje=mensaje;
                          pventanaD();
                          break;
        }
    }
}
