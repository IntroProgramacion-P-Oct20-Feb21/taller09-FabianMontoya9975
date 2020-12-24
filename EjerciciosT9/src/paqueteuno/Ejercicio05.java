/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan",
            "Teresa", "Luis", "Mark", "Jennifer",
            "Alcides"};
        String inicial;
        String nombre;
        char letra;
        String cadena = "";

        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese una letra: ");
            inicial = entrada.nextLine();
            inicial = inicial.toUpperCase();
            // Se lee una letra tipo cadena
            for (int i = 0; i < estudiantes.length; i++) {
                nombre = estudiantes[i];
                // Se extrae nombre por nombre desde el arreglo estudiantes
                letra = nombre.charAt(0);
                // Se extrae la iniocial de cada nombre para compararlo con
                // la valor ingresado por teclado
                cadena = String.format("%s", letra);
                if (inicial.equals(cadena)){
                    // Si la el valor ingresado por teclado coincide con
                    // la inicial de nombre el bandera se convierte en falso
                    // para asi terminar el ciclo
                    bandera = false;
                }
            }
        }

    }

}
