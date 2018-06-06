/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristian Hernandez
 */
public class Cajero extends Thread {

    private int transaccion[];
    private String nombre;
    private long time;
    private Cliente cliente;

    public Cajero(Cliente cliente, String nombre, long time) {
        this.cliente = cliente;
        this.nombre = nombre;
        this.time = time;
    }

    @Override
    public void run() {
        System.out.println("Cajero:" + this.nombre + "esta realizando la transaccion del cliente:"
                + this.cliente.getNombre() + "en el tiempo:" + (System.currentTimeMillis() - this.time) / 1000 + "seg");
        for (int i = 0; i < this.cliente.getTransaccion().length; i++) {
            this.esperarXsegundos(cliente.getTransaccion()[i]);
            System.out.println("Procesando transaccion:" + (i + 1) + "del cliente" + this.cliente.getNombre()
                    + "tiempo:" + (System.currentTimeMillis() - this.time) / 1000 + "seg");
            System.out.println("la cajera" + this.nombre + "ha terminado de realizar las transacciones" + "del cliente"
                    + this.cliente.getNombre() + "en el tiempo" + (System.currentTimeMillis() - this.time) / 1000);

        }
        
        

    }
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    private void esperarXsegundos(int i ) {
        try {
            Thread.sleep(i*1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
