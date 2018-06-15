/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PLAYER;

import RAZAS.Enanos;
import RAZAS.Minotauros;
import RAZAS.Raza;
import RAZAS.Razas_;
import RAZAS.Razas_Bu;
import RAZAS.Sentauros;
import java.util.Scanner;

/**
 *
 * @author Cristian Hernandez
 */
public class Player {

    private int codigo;
    private boolean turno = true;
    private Raza Escoger_Raza;

    public Player(int codigo) {
        this.codigo = codigo;
    }

    Player() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Raza getEscoger_Raza() {
        return Escoger_Raza;
    }

    public void setEscoger_Raza(Raza Escoger_Raza) {
        this.Escoger_Raza = Escoger_Raza;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public Raza PlayerMenu() {
        Razas_ RazasFactory = new Razas_();
        Razas_Bu Ena = new Enanos();
        Razas_Bu Sen = new Sentauros();
        Razas_Bu Min = new Minotauros();

        Raza Enanos;
        Raza Sentauros;
        Raza Minotauros;

        System.out.println("--Bienvenido" + codigo + "--");
        Scanner read = new Scanner(System.in);
        int opcion = 0;
        try {
            System.out.println("--Elige Raza--"
                    + "1.Enanos"
                    + "2.Sentauros"
                    + "3.Minotauros");
            System.out.print("--Su opcion--");
            opcion = read.nextInt();
        } catch (Exception e) {
            System.err.println("--No escribiste un numero--"
                    + "-Escribe un numero porfavor-");
            System.out.println("--Elige Raza--"
                    + "1.Enanos"
                    + "2.Sentauros"
                    + "3.Minotauros");
            System.out.print("--Su opcion--");
            opcion = read.nextInt();
        }
        switch (opcion) {
            case 1:
                RazasFactory.Razas_(Ena);
                Enanos = Ena.getRazas();
                this.setEscoger_Raza(Enanos);
                return Enanos;
            case 2:
                RazasFactory.Razas_(Min);
                Minotauros = Min.getRazas();
                this.setEscoger_Raza(Minotauros);
                return Minotauros;
            case 3:
                RazasFactory.Razas_(Sen);
                Sentauros = Sen.getRazas();
                this.setEscoger_Raza(Sentauros);
                return Sentauros;
        }
        return null;
    }

    public int menu_Player() {
        int opcion;
        System.out.println("-- Player " + this.codigo + " ---------"
                + "1.Edificaciones"
                + "2.Atacar" 
                + "3.Unidades"
                + "4.Terminar Turno"
                + "Opcion: ");
        Scanner read = new Scanner(System.in);
        opcion = read.nextInt();
        return opcion;
    }
    /*public void Batalla(Raza raza){
        int opcion = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("--¿Que atacaras?--"
                + "1.Reino enemigo"
                + "2.Tropa enemiga");
        System.out.print("--Su opcion--");
        opcion = read.nextInt();
        switch(opcion){
            case 1:
                System.out.println("¿A que reino atacaras?");
                raza.getListaEdificaciones().mostrarEdificacioones();
                break;
            case 2:
                System.out.println("¿A que tropa atacaras?");
                raza.getListaTropas().mostrarTropas();
                break;
        }
    }*/
}