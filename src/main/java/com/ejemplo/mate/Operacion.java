package com.ejemplo.mate;

public class Operacion {
    private double num1;
    private double num2;

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double Sumar() {
        return num1 + num2;
    }

    public double Restar() {
        return num1 - num2;
    }

    public double Multiplicar() {
        return num1 * num2;
    }

    public double Dividir() {
        if (num2 == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0; 
        }
        return num1 / num2;
    }
}