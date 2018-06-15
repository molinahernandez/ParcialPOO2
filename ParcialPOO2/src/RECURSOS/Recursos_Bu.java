/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RECURSOS;

/**
 *
 * @author Cristian Hernandez
 */
public abstract class Recursos_Bu {
    protected Recursos recurso;

    public Recursos getRecurso() {
        return recurso;
    }
    public void CrearRecurso(){
        recurso = new Recursos();
    }
    
    public abstract void nombre();
    public abstract void cant();
    public abstract void descripcion();
}