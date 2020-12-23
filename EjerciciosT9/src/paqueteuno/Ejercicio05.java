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
            for (int i = 0; i < estudiantes.length; i++) {
                nombre = estudiantes[i];
                letra = nombre.charAt(0);
                cadena = String.format("%s", letra);
                if (inicial.equals(cadena)){
                    bandera = false;
                }
            }
        }

    }

}
