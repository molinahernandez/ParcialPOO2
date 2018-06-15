/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDIFICIOS;

import RECURSOS.Recursos;
import TROPAS.Tropas;

/**
 *
 * @author Cristian Hernandez
 */
public class Edificaciones {
    private int nivel=1;
    private int poder=400;
    private int defensa=40;
    private boolean disponible=true;
    private String nombre="Mando";
    private String descripcion="Edificio principal";
    private Tropas entrenamiento;
    private Recursos recursoUno;
    private Recursos recursoDos;
    private Recursos recursoTres;
    

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Recursos getRecursoUno() {
        return recursoUno;
    }

    public void setRecursoUno(Recursos recursoUno) {
        this.recursoUno = recursoUno;
    }

    public Recursos getRecursoDos() {
        return recursoDos;
    }

    public void setRecursoDos(Recursos recursoDos) {
        this.recursoDos = recursoDos;
    }

    public Recursos getRecursoTres() {
        return recursoTres;
    }

    public void setRecursoTres(Recursos recursoTres) {
        this.recursoTres = recursoTres;
    }

    public Tropas getEntrenamiento() {
        return entrenamiento;
    }

    public void setEntrenamiento(Tropas entrenamiento) {
        this.entrenamiento = entrenamiento;
    } 
}