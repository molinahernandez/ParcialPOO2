/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDIFICIOS;

/**
 *
 * @author Cristian Hernandez
 */
public abstract class Edificacion_Bu {
    protected Edificaciones edificios;

    public Edificaciones getEdificios() {
        return edificios;
    }
    
    public void CrearEdificacion(){
        edificios = new Edificaciones();
        
    }
    public abstract void nombre();
    public abstract void nivel();
    public abstract void poder();
    public abstract void defensa();
    public abstract void disponible();
    public abstract void descripcion();

    
}
