/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDIFICIOS;

import java.util.ArrayList;
import java.util.Scanner;
import EDIFICIOS.Vehiculo_Edificio;

/**
 *
 * @author Cristian Hernandez
 */
public class ListaEdificaciones {
    private ArrayList<Edificios>listaEdificios;

    public ListaEdificaciones() {
        ArrayList<Object> ListaEdificios = new ArrayList<>();
    }
    public void Edificio_a_Razas(){
        Recursos_Edificio EdificiosFactory = new Recursos_Edificio();
        Edificacion_Bu Edificio_Vehiculo = new Vehiculo_Edificio();
        Edificacion_Bu Edificio_Tropas = new Tropas_Edificio();
        Edificacion_Bu Edificio_Recurso = new Recursos_Edificio();
        
       Edificaciones Vehiculo;
       Edificaciones Tropas;
       Edificaciones Recursos;
       
       Scanner read = new Scanner(System.in);
       String Edif_nombre;
       
       System.out.println("--Edificio que desea--"
               + "-Vehiculo-"
               + "-Tropas-"
               + "-Recursos-"
               + "Opcion");
       Edif_nombre = read.nextLine();
       switch(Edif_nombre){
           case "Vehiculo":
               //EdificiosFactory.Construir_Edificio(Vehiculo_Edificio);              
       }
    }
}