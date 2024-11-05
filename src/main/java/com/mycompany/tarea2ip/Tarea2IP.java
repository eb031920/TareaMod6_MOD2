package com.mycompany.tarea2ip;

// Copyright: Ruth Bautista (202320050047).
//
// Este programa implementa una clase llamada 'Recursos' que contiene 
// varios métodos útiles. Los métodos incluyen:
// 1. 'obtenerMensaje': Devuelve un mensaje relacionado con programación.
// 2. 'verificarEdad': Verifica si una edad dada corresponde a un adulto 
//    (21 años o más) o a un menor de edad.
// 3. 'multiplicar': Realiza la multiplicación de dos números enteros 
//    y devuelve el resultado.
// 4. 'generarLista': Crea y devuelve una lista de enteros desde 1 
//    hasta un número especificado. 
// En el método 'main', se instancian estos recursos y se muestran los 
// resultados de cada uno de los métodos, solicitando al usuario 
// su edad para la verificación.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarea2IP {

    static class Recursos {
        
        public String obtenerMensaje() {
            return "Programación Orientada a Objetos 2024";
        }

        public String verificarEdad(int edad) {
            return (edad >= 21) ? "Mayor de edad" : "Menor de edad";
        }

        public int multiplicar(int a, int b) {
            return a * b;
        }

        public List<Integer> generarLista(int x) {
            List<Integer> lista = new ArrayList<>();
            for (int i = 1; i <= x; i++) {
                lista.add(i);
            }
            return lista;
        }
    }

    public static void main(String[] args) {
        
        Recursos recursos = new Recursos();
        
        System.out.println(recursos.obtenerMensaje());

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println("Edad: " + edad + " - " + recursos.verificarEdad(edad));

        int a = 5, b = 4;
        System.out.println("Multiplicación de " + a + " y " + b + ": " + recursos.multiplicar(a, b));

        int x = 10;
        System.out.println("Lista generada hasta " + x + ": " + recursos.generarLista(x));

        // Cerrar el scanner
        scanner.close();
    }
}