package com.ejemplo;

import java.util.InputMismatchException;
import java.util.Scanner; 

import com.ejemplo.mate.Operacion;

public class App 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;

        System.out.println("-- Calculadora Simple --");
        
        while (condition) {
            System.out.println("\nOpciones:\n1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Salir");  
            
            System.out.print("Selecciona una opción (1/2/3/4/5): ");
            int seleccion = scanner.nextInt();
            
            boolean invalidOption = false;
            do {
                switch (seleccion) {
                    case 1:
                        System.out.println("Resultado: " + getOperation(scanner).sumar());
                        break;
                    case 2:
                        System.out.println("Resultado: " + getOperation(scanner).restar());
                        break;
                    case 3:
                        System.out.println("Resultado: " + getOperation(scanner).multiplicar());
                        break;
                    case 4:
                        try {
                            System.out.println("Resultado: " + getOperation(scanner).dividir());
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 5:
                        condition = false;
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        invalidOption = true;
                        break;
                }
            } while (invalidOption);
        }

        scanner.close(); 
    }

    private static Operacion getOperation(Scanner scanner) {
        System.out.print("Ingresa un número: ");

        double n1 = getDouble(scanner);

        System.out.print("Ingresa otro número: ");

        double n2 = getDouble(scanner);
        
        Operacion op = new Operacion(n1, n2);
        return op;    
    }

    private static double getDouble(Scanner scanner) {
        double num = 0.0;
        boolean condition = true;
        
        do {
            try {
                num = scanner.nextDouble();
                condition = false;
            } catch (InputMismatchException e) {
                System.out.println("Ingresa un valor numérico válido.\n");
            }
        } while (condition);
        
        return num;
    }
}