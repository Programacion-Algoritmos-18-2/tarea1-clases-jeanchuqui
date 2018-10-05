/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Estudiante {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        noprincipal ob1 = new noprincipal();
        System.out.println("Ingrese el nombre del estudiante:");
        ob1.nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido del estudiante:");
        ob1.apellido = entrada.nextLine();
        noprincipal ob2 = new noprincipal();
        System.out.println("Ingrese el nombre del estudiante:");
        ob2.nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido del estudiante:");
        ob2.apellido = entrada.nextLine();
 
        System.out.printf("Estudiante 1\nNombre: %s\nApellido: %s\n\nEstudiante 2\nNombre: %s\nApellido: %s\n",ob1.nombre,ob1.apellido,ob2.nombre,ob2.apellido);
    }
}