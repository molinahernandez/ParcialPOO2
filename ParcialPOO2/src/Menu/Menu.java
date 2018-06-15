/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import EDIFICIOS.Edificios;
import PLAYER.Player;
import TROPAS.Tropas;
import java.util.Scanner;

/**
 *
 * @author Cristian Hernandez
 */
public class Menu {

    private static Menu menu;
    public static int fase = 0;

    public Menu() {
    }

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        } else {
            System.out.println("ya existe");
        }
        return menu;
    }

    public void Inicio() {
        int opcion, opcion2, unidad, opcion3, edificacion;
        Scanner read = new Scanner(System.in);
        Player player1 = new Player(1);
        Player player2 = new Player(2);
        Tropas u = new Tropas();
        Edificios ed = new Edificios();

        System.out.println("--Bienvenido a Cris World--"
                + "1) Jugar-"
                + "2) Salir-");
        System.out.print("-Opcion: ");
        try {
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    player1.PlayerMenu();
                    player2.PlayerMenu();
                    while (player1.isTurno()) {
                        System.out.println("--TURNO DEL JUGADOR 1--");
                        player1.PlayerMenu();
                        opcion2 = read.nextInt();
                        switch (opcion2) {
                            case 1:
                                player1.getEscoger_Raza();
                                break;
                            case 2:
                                player1.getEscoger_Raza();
                                break;
                            case 3:
                                System.out.println("1");
                               // player1.Batallar(player2.getReino_escog);
                                System.out.println("2");
                                break;
                            case 4:
                                System.out.println("3");
                                player1.setTurno(false);
                                System.out.println("4");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Saliendo del juego");
                    break;
                default:
                    System.err.println("Opcion no valida");
            }
        } catch (Exception e) {
            System.err.println("No es un numero");
            read.nextLine();
        }
    }

    public void Opciones_Jugador(int opcion) {

    }

}
