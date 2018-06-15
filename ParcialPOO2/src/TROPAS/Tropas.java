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
public class Tropas {
    private boolean disponible = true;
    private String Tropa_Name = "preparando";
    private int poder1 = 100;
    private int defensa1 = 60;
    private int ataque1 = 70;
    
    public Tropas() {
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getTropa_Name() {
        return Tropa_Name;
    }

    public void setTropa_Name(String Tropa_Name) {
        this.Tropa_Name = Tropa_Name;
    }

    public int getPoder1() {
        return poder1;
    }

    public void setPoder1(int poder1) {
        this.poder1 = poder1;
    }

    public int getDefensa1() {
        return defensa1;
    }

    public void setDefensa1(int defensa1) {
        this.defensa1 = defensa1;
    }

    public int getAtaque1() {
        return ataque1;
    }

    public void setAtaque1(int ataque1) {
        this.ataque1 = ataque1;
    }           
}