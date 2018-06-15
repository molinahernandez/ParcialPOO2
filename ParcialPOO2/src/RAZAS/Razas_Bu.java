/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RAZAS;

/**
 *
 * @author Cristian Hernandez
 */
public abstract class Razas_Bu  {
    protected  Razas_ razas;

    public Razas_ getRazas() {
        return razas;
    }
    public void Razas_(){
        razas = new Razas_();
    }
    public abstract void nombre();
    public abstract void listaedificaciones();
    public abstract void listatropas();
}