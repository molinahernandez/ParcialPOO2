/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TROPAS;

/**
 *
 * @author Cristian Hernandez
 */
public abstract class Tropas_Bu {
    protected Tropas tropa;

    public Tropas getTropa() {
        return tropa;
    }
    public void Tropas(){
        tropa = new Tropas();
    }
    public abstract void Tropa_Name();
    public abstract void disponible();
    public abstract void poder();
    public abstract void defensa();
    public abstract void ataque();
}