package com.ejemplo;

import java.util.Scanner; // Importamos tu clase de lógica

import com.ejemplo.mate.Operacion;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número: ");
        double n1 = sc.nextDouble();
        
        System.out.print("Ingresa el segundo número: ");
        double n2 = sc.nextDouble();

        Operacion op = new Operacion(n1, n2);

        System.out.println("\nResultados:");
        System.out.println("Suma: " + op.Sumar());
        System.out.println("Resta: " + op.Restar());
        System.out.println("Multiplicación: " + op.Multiplicar());
        System.out.println("División: " + op.Dividir());
        
        sc.close(); 
    }
}