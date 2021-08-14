/******************************************************************
 SimuladorPerreraCompleto.java
 Autor: José Auyón
 Última modificación: 2021-08-13

 Driver program que implementa el menú de opciones para el simulador
 que entrenará voluntarios.
 ******************************************************************/

import java.util.Scanner;
import java.util.Random;


class SimuladorPerrera {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Crear perro y persona
        int opcion = 0;

        Persona callPersona = new Persona();
        Perro callPerro = new Perro();

        while (opcion != 5) {

            System.out.println("\n\nBienvenido al simulador de entrenamiento de voluntarios. ¿Qué hará?");
            System.out.println("1. Nueva persona");
            System.out.println("2. Nuevo perro");
            System.out.println("3. Sacar galleta");
            System.out.println("4. Interactuar");
            System.out.println("5. Salir\n\n");

            opcion = scan.nextInt();

            if (opcion == 1) {
                callPersona = new Persona();

            } else if (opcion == 2) {
                callPerro = new Perro();

            } else if (opcion == 3) {
                callPersona.darGalleta();
            } else if (opcion == 4) {
                callPerro.psican(callPersona);
                callPerro.acciones();
                callPersona.reacciones(callPerro);
            } else if (opcion == 5) {
                //Salir
            }
        }
    }
}